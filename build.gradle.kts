import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("dev.architectury.loom") version "1.13-SNAPSHOT"
    id("org.jetbrains.kotlin.jvm") version "2.2.21"
}

val minecraftVersion: String by project
val fabricLoaderVersion: String by project
val fabricApiVersion: String by project
val fabricKotlinVersion: String by project
val voicechatVersion: String by project
val modVersion: String by project

group = "dev.vanutp.tgbridge"
version = modVersion
base.archivesName = "tgbridge-client"

repositories {
    mavenCentral()
    maven("https://maven.fabricmc.net/")
    maven("https://api.modrinth.com/maven")
    maven("https://maven.maxhenkel.de/repository/public")
}

dependencies {
    minecraft("com.mojang:minecraft:${minecraftVersion}")
    mappings(loom.officialMojangMappings())
    modImplementation("net.fabricmc:fabric-loader:${fabricLoaderVersion}")

    modImplementation("net.fabricmc.fabric-api:fabric-api:${fabricApiVersion}")
    modImplementation("net.fabricmc:fabric-language-kotlin:${fabricKotlinVersion}")

    compileOnly("de.maxhenkel.voicechat:voicechat-api:${voicechatVersion}")
}

loom {
    accessWidenerPath = file("src/main/resources/tgbridge.accesswidener")
}

tasks {
    named<ProcessResources>("processResources") {
        inputs.property("version", project.version)

        filesMatching("fabric.mod.json") {
            expand("version" to project.version)
        }
    }

    compileKotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_21)
        }
    }

    compileJava {
        options.release.set(21)
    }
}

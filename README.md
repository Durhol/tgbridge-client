# 💬 Telegram Bridge Client

<div align="center">

[![Minecraft 1.21.11](https://img.shields.io/badge/Minecraft-1.21.11-brightgreen.svg)](https://minecraft.net/)
[![Loader Fabric](https://img.shields.io/badge/Loader-Fabric-blue.svg)](https://fabricmc.net/)
[![Environment Client](https://img.shields.io/badge/Environment-Client--Only-orange.svg)]()
[![Server Plugin](https://img.shields.io/badge/Server_Plugin-Durhol%2Ftgbridge-00b0ff.svg)](https://github.com/Durhol/tgbridge)
[![License MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![GitHub Releases](https://img.shields.io/badge/Release-v1.0.0-informational.svg)](https://github.com/Durhol/tgbridge-client/releases)

<p align="center">
  <img src="icon.png" width="128" height="128" alt="Telegram Bridge Client Icon">
</p>

**Telegram Bridge Client** is a client-side Fabric mod for Minecraft 1.21.11 that seamlessly upgrades the in-game chat into an interactive Telegram messenger experience.

Inspired by the idea of [vanutp/tgbridge](https://github.com/vanutp/tgbridge), this mod introduces inline chat photo thumbnails, a fullscreen image viewer, clipboard photo uploads, and voice message playback & recording directly inside Minecraft.

</div>

---

## 📸 Features

* 🖼️ **In-Chat Photo Thumbnails:** Photos sent from Telegram appear as miniature inline previews right inside Minecraft chat lines with zero external CDN latency and without exposing bot tokens.
* 🔍 **Fullscreen Image Viewer:** Click any photo thumbnail in chat to open an interactive viewer with automatic full-resolution streaming (`ESC` to close).
* 📋 **Clipboard Photo Upload (Ctrl + V):** Take a screenshot, copy any image to your clipboard, and press `Ctrl + V` in Minecraft chat to attach and send photos directly to your Telegram chat or topic.
* 🎙️ **Voice Messages in Minecraft:** Click or hold the microphone button in chat to record voice notes with live wave animations and a duration counter. Click `[Voice Message]` on incoming Telegram notes to listen to them in-game.
* 💬 **Reply & Quote Context:** Click to quote and reply to specific Telegram messages with visual reply banners and easy cancellation.
* 🎨 **Pixel-Art Icons (Zero Emojis):** Handcrafted crisp vector/pixel UI for attachments, microphone status, checkmarks, and reply arrows.
* 🕒 **Chat Fade Synchronization:** In-chat miniatures are bound to chat lines and smoothly fade away after 10 seconds just like normal chat text, preventing persistent ghost overlays.

---

## 🛠️ Installation & Requirements

1. **Minecraft:** `1.21.11`
2. **Fabric Loader:** `>= 0.16.0`
3. **Fabric API**
4. **Fabric Language Kotlin:** `>= 1.9.0`
5. *(Optional)* **Simple Voice Chat:** for advanced Opus audio decoding.
6. **Server Requirement:** The server must run the companion [**Durhol/tgbridge (Paper / Fabric)**](https://github.com/Durhol/tgbridge) plugin fork. *(Players without this client mod can still play on the server normally).*

Place `tgbridge-client-1.0.0.jar` into your Minecraft profile's `mods` folder.

---

## 🔨 Building from Source

```bash
git clone https://github.com/Durhol/tgbridge-client.git
cd tgbridge-client
./gradlew build      # On Linux/macOS
.\gradlew.bat build  # On Windows
```

The compiled mod JAR will be located at `build/libs/tgbridge-client-1.0.0.jar`.

---

## 👤 Author & Contacts

* **Author:** Durhol
* **Telegram:** [@tyxap](https://t.me/tyxap) or [@Durhol](https://t.me/Durhol)
* **GitHub:** [https://github.com/Durhol](https://github.com/Durhol)
* **Inspiration & Credits:** Inspired by and designed to companion the [vanutp/tgbridge](https://github.com/vanutp/tgbridge) project by [@vanutp](https://github.com/vanutp).

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).
Copyright (c) 2026 Durhol.

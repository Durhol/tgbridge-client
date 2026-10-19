package dev.vanutp.tgbridge.common.modules

import de.maxhenkel.voicechat.api.VoicechatPlugin
import de.maxhenkel.voicechat.api.VoicechatServerApi
import de.maxhenkel.voicechat.api.events.EventRegistration

class VoiceChatPlugin : VoicechatPlugin {
    override fun getPluginId(): String = "tgbridge"

    override fun registerEvents(registration: EventRegistration) {
        api = registration.voicechatApi
    }

    companion object {
        var api: VoicechatServerApi? = null
    }
}

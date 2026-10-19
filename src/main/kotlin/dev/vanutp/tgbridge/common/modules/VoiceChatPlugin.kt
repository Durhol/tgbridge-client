package dev.vanutp.tgbridge.common.modules

import de.maxhenkel.voicechat.api.VoicechatApi
import de.maxhenkel.voicechat.api.VoicechatPlugin
import de.maxhenkel.voicechat.api.opus.OpusDecoder
import de.maxhenkel.voicechat.api.opus.OpusEncoder

class VoiceChatPlugin : VoicechatPlugin {
    override fun getPluginId() = "tgbridge"

    companion object {
        var api: VoicechatApi? = null
            private set
        var decoder: OpusDecoder? = null
            private set
        var encoder: OpusEncoder? = null
            private set

        fun isInitialized() = api != null
    }

    override fun initialize(api: VoicechatApi) {
        Companion.api = api
        try {
            decoder = api.createDecoder()
            encoder = api.createEncoder()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

package com.applovin.mediation;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinExtras {

    public static class Builder {
        private boolean muteAudio;

        public Bundle build() {
            Bundle bundle = new Bundle(1);
            bundle.putBoolean("mute_audio", this.muteAudio);
            return bundle;
        }

        public Builder setMuteAudio(boolean z) {
            this.muteAudio = z;
            return this;
        }
    }

    public static class Keys {
        public static final String KEY_WATERMARK = "google_watermark";
        public static final String MUTE_AUDIO = "mute_audio";

        private Keys() {
        }
    }
}

package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.I;
import android.media.MediaPlayer;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextureVideoView$prepareIfNeeded$2$1 extends u implements Qa.a {
    final /* synthetic */ MediaPlayer $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureVideoView$prepareIfNeeded$2$1(MediaPlayer mediaPlayer) {
        super(0);
        this.$it = mediaPlayer;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$it.setVolume(0.0f, 0.0f);
    }
}

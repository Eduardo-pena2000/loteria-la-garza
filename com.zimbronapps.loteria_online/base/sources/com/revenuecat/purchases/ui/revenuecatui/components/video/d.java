package com.revenuecat.purchases.ui.revenuecatui.components.video;

import android.media.MediaPlayer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class d implements MediaPlayer.OnVideoSizeChangedListener {
    public final /* synthetic */ TextureVideoView a;

    public /* synthetic */ d(TextureVideoView textureVideoView) {
        this.a = textureVideoView;
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        TextureVideoView.b(this.a, mediaPlayer, i, i2);
    }
}

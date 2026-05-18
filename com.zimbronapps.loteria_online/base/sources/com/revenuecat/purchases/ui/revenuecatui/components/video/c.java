package com.revenuecat.purchases.ui.revenuecatui.components.video;

import android.media.MediaPlayer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class c implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ TextureVideoView a;

    public /* synthetic */ c(TextureVideoView textureVideoView) {
        this.a = textureVideoView;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        TextureVideoView.a(this.a, mediaPlayer);
    }
}

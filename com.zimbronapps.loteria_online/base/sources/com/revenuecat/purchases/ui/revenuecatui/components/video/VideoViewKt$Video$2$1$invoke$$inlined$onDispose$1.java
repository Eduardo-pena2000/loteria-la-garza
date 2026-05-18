package com.revenuecat.purchases.ui.revenuecatui.components.video;

import b0.C0;
import b0.X;
import com.revenuecat.purchases.ui.revenuecatui.components.video.TextureVideoView;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoViewKt$Video$2$1$invoke$$inlined$onDispose$1 implements X {
    final /* synthetic */ String $key$inlined;
    final /* synthetic */ Map $savedState$inlined;
    final /* synthetic */ C0 $videoView$inlined;

    public VideoViewKt$Video$2$1$invoke$$inlined$onDispose$1(C0 c0, Map map, String str) {
        this.$videoView$inlined = c0;
        this.$savedState$inlined = map;
        this.$key$inlined = str;
    }

    public void dispose() {
        TextureVideoView textureVideoView = (TextureVideoView) this.$videoView$inlined.getValue();
        if (textureVideoView != null) {
            TextureVideoView.PlaybackState playbackState = textureVideoView.getPlaybackState();
            this.$savedState$inlined.put(this.$key$inlined, new VideoPlaybackState(playbackState.getPositionMs(), playbackState.getPlayWhenReady()));
        }
    }
}

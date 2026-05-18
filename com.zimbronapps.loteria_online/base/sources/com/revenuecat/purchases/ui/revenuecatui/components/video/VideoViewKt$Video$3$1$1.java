package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Qa.l;
import android.content.Context;
import android.net.Uri;
import b0.C0;
import com.revenuecat.purchases.ui.revenuecatui.components.video.TextureVideoView;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoViewKt$Video$3$1$1 extends u implements l {
    final /* synthetic */ boolean $autoPlay;
    final /* synthetic */ String $key;
    final /* synthetic */ boolean $loop;
    final /* synthetic */ boolean $muteAudio;
    final /* synthetic */ Qa.a $onReady;
    final /* synthetic */ Map $savedState;
    final /* synthetic */ TextureVideoView.ScaleType $scaleType;
    final /* synthetic */ boolean $showControls;
    final /* synthetic */ String $videoUri;
    final /* synthetic */ C0 $videoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewKt$Video$3$1$1(Map map, String str, boolean z, String str2, boolean z2, boolean z3, C0 c0, TextureVideoView.ScaleType scaleType, boolean z4, Qa.a aVar) {
        super(1);
        this.$savedState = map;
        this.$key = str;
        this.$autoPlay = z;
        this.$videoUri = str2;
        this.$showControls = z2;
        this.$muteAudio = z3;
        this.$videoView = c0;
        this.$scaleType = scaleType;
        this.$loop = z4;
        this.$onReady = aVar;
    }

    public final TextureVideoView invoke(Context ctx) {
        t.g(ctx, "ctx");
        VideoPlaybackState videoPlaybackState = (VideoPlaybackState) this.$savedState.get(this.$key);
        if (videoPlaybackState == null) {
            videoPlaybackState = new VideoPlaybackState(0, this.$autoPlay);
        }
        int max = Math.max(videoPlaybackState.getPositionMs(), videoPlaybackState.getPositionMs());
        boolean playWhenReady = max > 0 ? videoPlaybackState.getPlayWhenReady() : this.$autoPlay;
        Uri parse = Uri.parse(this.$videoUri);
        TextureVideoView textureVideoView = new TextureVideoView(ctx, null, this.$showControls, this.$muteAudio, 2, null);
        C0 c0 = this.$videoView;
        TextureVideoView.ScaleType scaleType = this.$scaleType;
        boolean z = this.$loop;
        Qa.a aVar = this.$onReady;
        c0.setValue(textureVideoView);
        textureVideoView.setScaleType(scaleType);
        textureVideoView.setLooping(z);
        textureVideoView.setAutoStart(playWhenReady);
        textureVideoView.setOnReadyCallback(aVar);
        textureVideoView.setVideoURI(parse);
        if (max > 0) {
            textureVideoView.setPlaybackState(new TextureVideoView.PlaybackState(max, playWhenReady));
        }
        return textureVideoView;
    }
}

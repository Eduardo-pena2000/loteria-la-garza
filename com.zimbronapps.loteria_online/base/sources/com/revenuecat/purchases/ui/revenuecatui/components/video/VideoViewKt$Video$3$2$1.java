package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.I;
import Qa.l;
import b0.C0;
import com.revenuecat.purchases.ui.revenuecatui.components.video.TextureVideoView;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoViewKt$Video$3$2$1 extends u implements l {
    final /* synthetic */ String $key;
    final /* synthetic */ Map $savedState;
    final /* synthetic */ C0 $videoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewKt$Video$3$2$1(C0 c0, Map map, String str) {
        super(1);
        this.$videoView = c0;
        this.$savedState = map;
        this.$key = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextureVideoView) obj);
        return I.a;
    }

    public final void invoke(TextureVideoView view) {
        t.g(view, "view");
        Map map = this.$savedState;
        String str = this.$key;
        TextureVideoView.PlaybackState playbackState = view.getPlaybackState();
        map.put(str, new VideoPlaybackState(playbackState.getPositionMs(), playbackState.getPlayWhenReady()));
        view.release();
        this.$videoView.setValue((Object) null);
    }
}

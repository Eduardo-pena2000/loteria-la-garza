package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Qa.l;
import b0.C0;
import b0.X;
import b0.Y;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoViewKt$Video$2$1 extends u implements l {
    final /* synthetic */ String $key;
    final /* synthetic */ Map $savedState;
    final /* synthetic */ C0 $videoView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoViewKt$Video$2$1(C0 c0, Map map, String str) {
        super(1);
        this.$videoView = c0;
        this.$savedState = map;
        this.$key = str;
    }

    public final X invoke(Y DisposableEffect) {
        t.g(DisposableEffect, "$this$DisposableEffect");
        return new VideoViewKt$Video$2$1$invoke$$inlined$onDispose$1(this.$videoView, this.$savedState, this.$key);
    }
}

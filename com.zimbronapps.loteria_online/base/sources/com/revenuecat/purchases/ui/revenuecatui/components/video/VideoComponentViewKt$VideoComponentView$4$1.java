package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.I;
import M0.p;
import M0.q;
import Qa.l;
import android.view.View;
import b0.C0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentViewKt$VideoComponentView$4$1 extends u implements l {
    final /* synthetic */ C0 $isVisible$delegate;
    final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentViewKt$VideoComponentView$4$1(View view, C0 c0) {
        super(1);
        this.$view = view;
        this.$isVisible$delegate = c0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((p) obj);
        return I.a;
    }

    public final void invoke(p coordinates) {
        t.g(coordinates, "coordinates");
        VideoComponentViewKt.access$VideoComponentView$lambda$6(this.$isVisible$delegate, VideoComponentViewKt.isVisibleInViewport(q.c(coordinates), this.$view.getWidth(), this.$view.getHeight()));
    }
}

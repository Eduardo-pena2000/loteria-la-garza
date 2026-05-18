package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Ca.I;
import Qa.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.h;
import t1.E;
import t1.e;
import t1.f;
import t1.s;
import t1.v;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentViewKt$TimelineComponentView$2$5$1$1 extends u implements l {
    final /* synthetic */ TimelineComponentState $timelineState;
    final /* synthetic */ f $titleRef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentViewKt$TimelineComponentView$2$5$1$1(f fVar, TimelineComponentState timelineComponentState) {
        super(1);
        this.$titleRef = fVar;
        this.$timelineState = timelineComponentState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e) obj);
        return I.a;
    }

    public final void invoke(e constrainAs) {
        t.g(constrainAs, "$this$constrainAs");
        v.b(constrainAs.h(), this.$titleRef.b(), h.g(this.$timelineState.getTextSpacing()), 0.0f, 4, (Object) null);
        E.b(constrainAs.g(), this.$titleRef.d(), 0.0f, 0.0f, 6, (Object) null);
        E.b(constrainAs.e(), constrainAs.f().c(), 0.0f, 0.0f, 6, (Object) null);
        s.b bVar = s.a;
        constrainAs.m(bVar.b());
        constrainAs.k(bVar.b());
        constrainAs.l(0.0f);
    }
}

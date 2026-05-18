package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Ca.I;
import Ca.q;
import Qa.l;
import com.revenuecat.purchases.ui.revenuecatui.components.timeline.TimelineComponentState;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.h;
import t1.E;
import t1.e;
import t1.f;
import t1.s;
import t1.v;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentViewKt$TimelineComponentView$2$6$1$1 extends u implements l {
    final /* synthetic */ f $currentIconRef;
    final /* synthetic */ boolean $isLastItem;
    final /* synthetic */ TimelineComponentState.ItemState $item;
    final /* synthetic */ f $nextIconRef;
    final /* synthetic */ float $nextItemIconHalfSize;
    final /* synthetic */ q $offsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentViewKt$TimelineComponentView$2$6$1$1(q qVar, TimelineComponentState.ItemState itemState, f fVar, boolean z, f fVar2, float f) {
        super(1);
        this.$offsets = qVar;
        this.$item = itemState;
        this.$currentIconRef = fVar;
        this.$isLastItem = z;
        this.$nextIconRef = fVar2;
        this.$nextItemIconHalfSize = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e) obj);
        return I.a;
    }

    public final void invoke(e constrainAs) {
        t.g(constrainAs, "$this$constrainAs");
        E.b(constrainAs.g(), constrainAs.f().d(), ((h) this.$offsets.c()).m(), 0.0f, 4, (Object) null);
        s.b bVar = s.a;
        constrainAs.m(bVar.d(h.g(this.$item.getConnector() != null ? r1.getWidth() : 0)));
        v.b(constrainAs.h(), this.$currentIconRef.e(), 0.0f, 0.0f, 6, (Object) null);
        if (this.$isLastItem) {
            v.b(constrainAs.c(), constrainAs.f().b(), ((h) this.$offsets.d()).m(), 0.0f, 4, (Object) null);
        } else {
            v c = constrainAs.c();
            f fVar = this.$nextIconRef;
            t.d(fVar);
            v.b(c, fVar.b(), h.g(this.$nextItemIconHalfSize + ((h) this.$offsets.d()).m()), 0.0f, 4, (Object) null);
        }
        constrainAs.k(bVar.a());
    }
}

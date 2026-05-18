package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import t1.E;
import t1.e;
import t1.f;
import t1.i;
import t1.s;
import t1.v;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentViewKt$TimelineComponentView$2$4$1 extends u implements l {
    final /* synthetic */ i.b $currentPreviousItem;
    final /* synthetic */ i.c $iconEndBarrier;
    final /* synthetic */ f $iconRef;
    final /* synthetic */ TimelineComponentState $timelineState;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimelineComponent.IconAlignment.values().length];
            try {
                iArr[TimelineComponent.IconAlignment.Title.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimelineComponent.IconAlignment.TitleAndDescription.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentViewKt$TimelineComponentView$2$4$1(TimelineComponentState timelineComponentState, f fVar, i.b bVar, i.c cVar) {
        super(1);
        this.$timelineState = timelineComponentState;
        this.$iconRef = fVar;
        this.$currentPreviousItem = bVar;
        this.$iconEndBarrier = cVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((e) obj);
        return I.a;
    }

    public final void invoke(e constrainAs) {
        t.g(constrainAs, "$this$constrainAs");
        int i = WhenMappings.$EnumSwitchMapping$0[this.$timelineState.getIconAlignment().ordinal()];
        if (i == 1) {
            e.b(constrainAs, this.$iconRef, 0.0f, 2, (Object) null);
        } else if (i == 2) {
            v h = constrainAs.h();
            i.b bVar = this.$currentPreviousItem;
            if (bVar == null) {
                bVar = constrainAs.f().e();
            }
            v.b(h, bVar, 0.0f, 0.0f, 6, (Object) null);
        }
        E.b(constrainAs.g(), this.$iconEndBarrier, 0.0f, 0.0f, 6, (Object) null);
        E.b(constrainAs.e(), constrainAs.f().c(), 0.0f, 0.0f, 6, (Object) null);
        s.b bVar2 = s.a;
        constrainAs.m(bVar2.b());
        constrainAs.k(bVar2.b());
        constrainAs.l(0.0f);
    }
}

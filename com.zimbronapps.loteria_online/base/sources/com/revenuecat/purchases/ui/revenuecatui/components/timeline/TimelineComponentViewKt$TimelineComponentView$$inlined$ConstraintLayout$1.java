package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Ca.I;
import O0.x0;
import Qa.a;
import Qa.p;
import b0.C0;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import eb.g;
import kotlin.jvm.internal.u;
import t1.A;
import t1.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$1 extends u implements p {
    final /* synthetic */ g $channel;
    final /* synthetic */ x0 $compositionSource;
    final /* synthetic */ C0 $contentTracker;
    final /* synthetic */ C0 $end;
    final /* synthetic */ l $scope;
    final /* synthetic */ C0 $start;
    final /* synthetic */ PaywallState.Loaded.Components $state$inlined;
    final /* synthetic */ TimelineComponentState $timelineState$inlined;

    public static final class 1 extends u implements a {
        final /* synthetic */ g $channel;
        final /* synthetic */ C0 $end;
        final /* synthetic */ l $scope;
        final /* synthetic */ C0 $start;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, C0 c0, C0 c02, g gVar) {
            super(0);
            this.$scope = lVar;
            this.$start = c0;
            this.$end = c02;
            this.$channel = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            A a = new A(this.$scope.g().I());
            if (this.$start.getValue() != null && this.$end.getValue() != null) {
                this.$channel.i(a);
            } else {
                this.$start.setValue(a);
                this.$end.setValue(this.$start.getValue());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$1(C0 c0, x0 x0Var, l lVar, g gVar, C0 c02, C0 c03, TimelineComponentState timelineComponentState, PaywallState.Loaded.Components components) {
        super(2);
        this.$contentTracker = c0;
        this.$scope = lVar;
        this.$channel = gVar;
        this.$start = c02;
        this.$end = c03;
        this.$timelineState$inlined = timelineComponentState;
        this.$state$inlined = components;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        if ((i & 3) == 2 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(I.a);
        throw null;
    }
}

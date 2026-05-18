package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Ca.I;
import M0.B;
import M0.C;
import M0.m;
import Qa.l;
import androidx.compose.ui.layout.q;
import b0.C0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u;
import n1.r;
import t1.o;
import t1.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$2 implements B {
    final /* synthetic */ o $constraintSet;
    final /* synthetic */ C0 $contentTracker;
    final /* synthetic */ z $measurer;
    final /* synthetic */ int $optimizationLevel;
    final /* synthetic */ C0 $remeasureRequesterState;

    public static final class 1 extends u implements l {
        final /* synthetic */ List $measurables;
        final /* synthetic */ z $measurer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(z zVar, List list) {
            super(1);
            this.$measurer = zVar;
            this.$measurables = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            this.$measurer.h(aVar, this.$measurables);
        }
    }

    public TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$2(C0 c0, z zVar, o oVar, int i, C0 c02) {
        this.$contentTracker = c0;
        this.$measurer = zVar;
        this.$constraintSet = oVar;
        this.$optimizationLevel = i;
        this.$remeasureRequesterState = c02;
    }

    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(m mVar, List list, int i) {
        return super.maxIntrinsicHeight(mVar, list, i);
    }

    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(m mVar, List list, int i) {
        return super.maxIntrinsicWidth(mVar, list, i);
    }

    public final C measure-3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j) {
        this.$contentTracker.getValue();
        long i = this.$measurer.i(j, lVar.getLayoutDirection(), this.$constraintSet, list, this.$optimizationLevel);
        this.$remeasureRequesterState.getValue();
        return androidx.compose.ui.layout.l.O0(lVar, r.g(i), r.f(i), (Map) null, new 1(this.$measurer, list), 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ int minIntrinsicHeight(m mVar, List list, int i) {
        return super.minIntrinsicHeight(mVar, list, i);
    }

    public /* bridge */ /* synthetic */ int minIntrinsicWidth(m mVar, List list, int i) {
        return super.minIntrinsicWidth(mVar, list, i);
    }
}

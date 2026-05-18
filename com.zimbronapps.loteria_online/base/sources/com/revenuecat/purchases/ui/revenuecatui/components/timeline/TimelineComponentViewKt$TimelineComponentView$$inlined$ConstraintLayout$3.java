package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Ca.I;
import Qa.a;
import b0.C0;
import kotlin.jvm.internal.u;
import t1.o;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$3 extends u implements a {
    final /* synthetic */ o $constraintSet;
    final /* synthetic */ C0 $remeasureRequesterState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineComponentViewKt$TimelineComponentView$$inlined$ConstraintLayout$3(C0 c0, o oVar) {
        super(0);
        this.$remeasureRequesterState = c0;
        this.$constraintSet = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$remeasureRequesterState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
        this.$constraintSet.j(true);
    }
}

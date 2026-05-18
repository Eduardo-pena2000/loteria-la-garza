package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Ca.I;
import Qa.p;
import Qa.q;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HorizontalStackKt$HorizontalStack$1$edgeSpacerIfNeeded$1 extends u implements p {
    final /* synthetic */ Dimension.Horizontal $dimension;
    final /* synthetic */ q $fillSpaceSpacer;
    final /* synthetic */ HorizontalStackScopeImpl $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalStackKt$HorizontalStack$1$edgeSpacerIfNeeded$1(HorizontalStackScopeImpl horizontalStackScopeImpl, Dimension.Horizontal horizontal, q qVar) {
        super(2);
        this.$scope = horizontalStackScopeImpl;
        this.$dimension = horizontal;
        this.$fillSpaceSpacer = qVar;
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
            w.U(-1884036483, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.HorizontalStack.<anonymous>.<anonymous> (HorizontalStack.kt:56)");
        }
        if (this.$scope.getShouldApplyFillSpacers() && (this.$dimension.getDistribution() == FlexDistribution.SPACE_AROUND || this.$dimension.getDistribution() == FlexDistribution.SPACE_EVENLY)) {
            this.$fillSpaceSpacer.invoke(Float.valueOf(1.0f), mVar, 54);
        }
        if (w.L()) {
            w.T();
        }
    }
}

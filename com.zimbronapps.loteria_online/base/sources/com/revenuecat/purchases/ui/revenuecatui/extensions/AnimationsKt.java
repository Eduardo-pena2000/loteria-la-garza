package com.revenuecat.purchases.ui.revenuecatui.extensions;

import Qa.l;
import b0.h2;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.t;
import v0.r0;
import y.z;
import z.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AnimationsKt {
    public static final float packageButtonActionInProgressOpacityAnimation(PaywallViewModel paywallViewModel, m mVar, int i) {
        t.g(paywallViewModel, "<this>");
        mVar.V(-1704661559);
        if (w.L()) {
            w.U(-1704661559, i, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.packageButtonActionInProgressOpacityAnimation (Animations.kt:13)");
        }
        float packageButtonActionInProgressOpacityAnimation$lambda$0 = packageButtonActionInProgressOpacityAnimation$lambda$0(c.d(((Boolean) paywallViewModel.getActionInProgress().getValue()).booleanValue() ? 0.4f : 1.0f, UIConstant.INSTANCE.defaultAnimation(), 0.0f, "Package button action in progress alpha", (l) null, mVar, 3072, 20));
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return packageButtonActionInProgressOpacityAnimation$lambda$0;
    }

    private static final float packageButtonActionInProgressOpacityAnimation$lambda$0(h2 h2Var) {
        return ((Number) h2Var.getValue()).floatValue();
    }

    public static final long packageButtonColorAnimation-9z6LAg8(PaywallState.Loaded.Legacy packageButtonColorAnimation, TemplateConfiguration.PackageInfo packageInfo, long j, long j2, m mVar, int i) {
        t.g(packageButtonColorAnimation, "$this$packageButtonColorAnimation");
        t.g(packageInfo, "packageInfo");
        mVar.V(792231715);
        if (w.L()) {
            w.U(792231715, i, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.packageButtonColorAnimation (Animations.kt:28)");
        }
        long j3 = t.c(packageInfo, packageButtonColorAnimation.getSelectedPackage().getValue()) ? j : j2;
        long packageButtonColorAnimation_9z6LAg8$lambda$1 = packageButtonColorAnimation_9z6LAg8$lambda$1(z.a(j3, UIConstant.INSTANCE.defaultAnimation(), "Package button selected color: " + packageInfo.getRcPackage().getIdentifier(), (l) null, mVar, 0, 8));
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return packageButtonColorAnimation_9z6LAg8$lambda$1;
    }

    private static final long packageButtonColorAnimation_9z6LAg8$lambda$1(h2 h2Var) {
        return ((r0) h2Var.getValue()).A();
    }
}

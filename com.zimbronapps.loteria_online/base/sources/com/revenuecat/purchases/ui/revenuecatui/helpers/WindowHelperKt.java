package com.revenuecat.purchases.ui.revenuecatui.helpers;

import A4.l;
import Ca.q;
import Ca.x;
import android.app.Activity;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallModeKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import x4.b;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WindowHelperKt {
    public static final x4.a computeWindowHeightSizeClass(m mVar, int i) {
        if (w.L()) {
            w.U(-1980265325, i, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.computeWindowHeightSizeClass (WindowHelper.kt:22)");
        }
        x4.a a = windowSizeClass(mVar, 0).a();
        if (w.L()) {
            w.T();
        }
        return a;
    }

    public static final c computeWindowWidthSizeClass(m mVar, int i) {
        if (w.L()) {
            w.U(173434359, i, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.computeWindowWidthSizeClass (WindowHelper.kt:16)");
        }
        c b = windowSizeClass(mVar, 0).b();
        if (w.L()) {
            w.T();
        }
        return b;
    }

    private static final q getScreenSize(m mVar, int i) {
        q a;
        if (w.L()) {
            w.U(392213243, i, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.getScreenSize (WindowHelper.kt:59)");
        }
        Activity activity = (Activity) mVar.x(HelperFunctionsKt.getLocalActivity());
        if (HelperFunctionsKt.isInPreviewMode(mVar, 0) || activity == null) {
            Configuration configuration = (Configuration) mVar.x(AndroidCompositionLocals_androidKt.f());
            a = x.a(Float.valueOf(configuration.screenWidthDp), Float.valueOf(configuration.screenHeightDp));
        } else {
            float f = activity.getResources().getDisplayMetrics().density;
            l c = A4.m.a.a().c(activity);
            a = new q(Float.valueOf(c.a().width() / f), Float.valueOf(c.a().height() / f));
        }
        if (w.L()) {
            w.T();
        }
        return a;
    }

    public static final boolean hasCompactDimension(m mVar, int i) {
        if (w.L()) {
            w.U(667952227, i, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.hasCompactDimension (WindowHelper.kt:28)");
        }
        boolean z = t.c(computeWindowHeightSizeClass(mVar, 0), x4.a.c) || t.c(computeWindowWidthSizeClass(mVar, 0), c.c);
        if (w.L()) {
            w.T();
        }
        return z;
    }

    public static final boolean shouldUseLandscapeLayout(PaywallState.Loaded.Legacy legacy, m mVar, int i) {
        t.g(legacy, "<this>");
        if (w.L()) {
            w.U(405801034, i, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.shouldUseLandscapeLayout (WindowHelper.kt:35)");
        }
        boolean shouldUseLandscapeLayout = shouldUseLandscapeLayout(legacy.getTemplateConfiguration().getMode(), mVar, 0);
        if (w.L()) {
            w.T();
        }
        return shouldUseLandscapeLayout;
    }

    private static final b windowSizeClass(m mVar, int i) {
        if (w.L()) {
            w.U(1719780984, i, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.windowSizeClass (WindowHelper.kt:52)");
        }
        q screenSize = getScreenSize(mVar, 0);
        b a = b.c.a(((Number) screenSize.a()).floatValue(), ((Number) screenSize.b()).floatValue());
        if (w.L()) {
            w.T();
        }
        return a;
    }

    private static final boolean shouldUseLandscapeLayout(PaywallMode paywallMode, m mVar, int i) {
        if (w.L()) {
            w.U(-1400525098, i, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.shouldUseLandscapeLayout (WindowHelper.kt:41)");
        }
        boolean shouldUseLandscapeLayout = shouldUseLandscapeLayout(paywallMode, computeWindowHeightSizeClass(mVar, 0));
        if (w.L()) {
            w.T();
        }
        return shouldUseLandscapeLayout;
    }

    public static final boolean shouldUseLandscapeLayout(PaywallMode mode, x4.a sizeClass) {
        t.g(mode, "mode");
        t.g(sizeClass, "sizeClass");
        return PaywallModeKt.isFullScreen(mode) && t.c(sizeClass, x4.a.c);
    }
}

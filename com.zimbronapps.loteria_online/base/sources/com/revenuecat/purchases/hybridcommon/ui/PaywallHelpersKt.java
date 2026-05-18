package com.revenuecat.purchases.hybridcommon.ui;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.u;
import androidx.lifecycle.k;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.hybridcommon.ui.PaywallFragment;
import com.revenuecat.purchases.hybridcommon.ui.PaywallSource;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallHelpersKt {
    public static /* synthetic */ void a(u uVar, String str, PresentPaywallOptions presentPaywallOptions, PresentPaywallOptions presentPaywallOptions2) {
        presentPaywallFromFragment$lambda$3$lambda$2(uVar, str, presentPaywallOptions, presentPaywallOptions2);
    }

    public static /* synthetic */ void b(PresentPaywallOptions presentPaywallOptions, u uVar, String str, String str2, Bundle bundle) {
        presentPaywallFromFragment$lambda$3$lambda$2$lambda$1(presentPaywallOptions, uVar, str, str2, bundle);
    }

    @Ca.e
    public static final void presentPaywallFromFragment(u uVar, PaywallResultListener paywallResultListener) {
        t.g(uVar, "activity");
        t.g(paywallResultListener, "paywallResultListener");
        presentPaywallFromFragment$default(uVar, paywallResultListener, null, null, null, 28, null);
    }

    public static /* synthetic */ void presentPaywallFromFragment$default(u uVar, PaywallResultListener paywallResultListener, String str, Boolean bool, Offering offering, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            offering = null;
        }
        presentPaywallFromFragment(uVar, paywallResultListener, str, bool, offering);
    }

    private static final void presentPaywallFromFragment$lambda$3$lambda$2(u uVar, String str, PresentPaywallOptions presentPaywallOptions, PresentPaywallOptions presentPaywallOptions2) {
        uVar.b0().y1(str, uVar, new d(presentPaywallOptions, uVar, str));
        if (uVar.getLifecycle().getCurrentState().b(k.b.d)) {
            uVar.b0().q().d(PaywallFragment.Companion.newInstance(str, presentPaywallOptions.getRequiredEntitlementIdentifier(), presentPaywallOptions.getShouldDisplayDismissButton(), presentPaywallOptions.getPaywallSource(), presentPaywallOptions.getFontFamily(), presentPaywallOptions.getCustomVariables()), "revenuecat-paywall-fragment").f();
        } else {
            Log.w("Purchases", "Tried to present a paywall while the activity was paused or finished. Not presenting.");
            presentPaywallOptions2.getPaywallResultListener().onPaywallResult("ERROR");
        }
    }

    private static final void presentPaywallFromFragment$lambda$3$lambda$2$lambda$1(PresentPaywallOptions presentPaywallOptions, u uVar, String str, String str2, Bundle bundle) {
        t.g(str2, "<anonymous parameter 0>");
        t.g(bundle, "result");
        String string = bundle.getString(PaywallFragment.ResultKey.PAYWALL_RESULT.getKey());
        if (string == null) {
            throw new IllegalStateException("PaywallResult not found in result bundle.");
        }
        presentPaywallOptions.getPaywallResultListener().onPaywallResult(string);
        uVar.b0().x(str);
    }

    @Ca.e
    public static final void presentPaywallFromFragment(u uVar, PaywallResultListener paywallResultListener, String str) {
        t.g(uVar, "activity");
        t.g(paywallResultListener, "paywallResultListener");
        presentPaywallFromFragment$default(uVar, paywallResultListener, str, null, null, 24, null);
    }

    @Ca.e
    public static final void presentPaywallFromFragment(u uVar, PaywallResultListener paywallResultListener, String str, Boolean bool) {
        t.g(uVar, "activity");
        t.g(paywallResultListener, "paywallResultListener");
        presentPaywallFromFragment$default(uVar, paywallResultListener, str, bool, null, 16, null);
    }

    @Ca.e
    public static final void presentPaywallFromFragment(u uVar, PaywallResultListener paywallResultListener, String str, Boolean bool, Offering offering) {
        t.g(uVar, "activity");
        t.g(paywallResultListener, "paywallResultListener");
        presentPaywallFromFragment(uVar, new PresentPaywallOptions(paywallResultListener, offering != null ? new PaywallSource.Offering(offering) : PaywallSource.DefaultOffering.INSTANCE, str, bool, null, null, null, null, 240, null));
    }

    public static final void presentPaywallFromFragment(u uVar, PresentPaywallOptions presentPaywallOptions) {
        t.g(uVar, "activity");
        t.g(presentPaywallOptions, "options");
        String valueOf = String.valueOf(System.identityHashCode(presentPaywallOptions.getPaywallResultListener()));
        if (presentPaywallOptions.getPaywallListener() != null || presentPaywallOptions.getPurchaseLogic() != null) {
            PaywallFragmentNonSerializableArgsStore.INSTANCE.put(valueOf, new PaywallFragmentNonSerializableArgs(presentPaywallOptions.getPaywallListener(), presentPaywallOptions.getPurchaseLogic()));
        }
        uVar.runOnUiThread(new e(uVar, valueOf, presentPaywallOptions, presentPaywallOptions));
    }
}

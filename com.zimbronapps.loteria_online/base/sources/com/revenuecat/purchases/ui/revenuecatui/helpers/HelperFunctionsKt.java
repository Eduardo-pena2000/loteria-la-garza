package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Ca.I;
import Ga.e;
import Ga.k;
import Ha.b;
import Ha.c;
import Ia.h;
import P0.M0;
import Qa.l;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.H;
import b0.T1;
import b0.b1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HelperFunctionsKt {
    private static final b1 LocalActivity = H.h((T1) null, HelperFunctionsKt$LocalActivity$1.INSTANCE, 1, (Object) null);

    public static final class 1 extends u implements l {
        final /* synthetic */ String $entitlement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str) {
            super(1);
            this.$entitlement = str;
        }

        public final Boolean invoke(CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            EntitlementInfo entitlementInfo = customerInfo.getEntitlements().get(this.$entitlement);
            boolean z = false;
            if (entitlementInfo != null && entitlementInfo.isActive()) {
                z = true;
            }
            return Boolean.valueOf(!z);
        }
    }

    public static final class 3 extends u implements l {
        final /* synthetic */ l $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(l lVar) {
            super(1);
            this.$result = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError it) {
            t.g(it, "it");
            Logger.INSTANCE.e("Error fetching customer info to display paywall", new PurchasesException(it));
            this.$result.invoke(Boolean.FALSE);
        }
    }

    public static final class 4 extends u implements l {
        final /* synthetic */ l $result;
        final /* synthetic */ l $shouldDisplayBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(l lVar, l lVar2) {
            super(1);
            this.$shouldDisplayBlock = lVar;
            this.$result = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return I.a;
        }

        public final void invoke(CustomerInfo it) {
            t.g(it, "it");
            Boolean bool = (Boolean) this.$shouldDisplayBlock.invoke(it);
            if (bool.booleanValue()) {
                Logger.INSTANCE.d("Displaying paywall according to display logic");
            } else {
                Logger.INSTANCE.d("Not displaying paywall according to display logic");
            }
            this.$result.invoke(bool);
        }
    }

    public static final b1 getLocalActivity() {
        return LocalActivity;
    }

    public static final boolean isInPreviewMode(m mVar, int i) {
        if (w.L()) {
            w.U(774792703, i, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.isInPreviewMode (HelperFunctions.kt:24)");
        }
        boolean booleanValue = ((Boolean) mVar.x(M0.a())).booleanValue();
        if (w.L()) {
            w.T();
        }
        return booleanValue;
    }

    public static final l shouldDisplayBlockForEntitlementIdentifier(String entitlement) {
        t.g(entitlement, "entitlement");
        return new 1(entitlement);
    }

    public static final Object shouldDisplayPaywall(l lVar, e eVar) {
        k kVar = new k(b.c(eVar));
        shouldDisplayPaywall(lVar, new HelperFunctionsKt$shouldDisplayPaywall$2$1(kVar));
        Object a = kVar.a();
        if (a == c.f()) {
            h.c(eVar);
        }
        return a;
    }

    public static final float windowAspectRatio(m mVar, int i) {
        if (w.L()) {
            w.U(1944383602, i, -1, "com.revenuecat.purchases.ui.revenuecatui.helpers.windowAspectRatio (HelperFunctions.kt:28)");
        }
        Configuration configuration = (Configuration) mVar.x(AndroidCompositionLocals_androidKt.f());
        float f = configuration.screenHeightDp / configuration.screenWidthDp;
        if (w.L()) {
            w.T();
        }
        return f;
    }

    public static final void shouldDisplayPaywall(l shouldDisplayBlock, l result) {
        t.g(shouldDisplayBlock, "shouldDisplayBlock");
        t.g(result, "result");
        ListenerConversionsKt.getCustomerInfoWith(Purchases.Companion.getSharedInstance(), new 3(result), new 4(shouldDisplayBlock, result));
    }
}

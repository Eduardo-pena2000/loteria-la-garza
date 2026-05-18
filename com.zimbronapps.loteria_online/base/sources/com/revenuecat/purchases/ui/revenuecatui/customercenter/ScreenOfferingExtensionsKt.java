package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Ga.e;
import Ia.d;
import Ia.f;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ScreenOfferingExtensionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomerCenterConfigData.ScreenOffering.ScreenOfferingType.values().length];
            try {
                iArr[CustomerCenterConfigData.ScreenOffering.ScreenOfferingType.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomerCenterConfigData.ScreenOffering.ScreenOfferingType.SPECIFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt", f = "ScreenOfferingExtensions.kt", l = {14}, m = "resolveOfferingSuspend")
    public static final class 1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScreenOfferingExtensionsKt.resolveOfferingSuspend(null, null, this);
        }
    }

    @InternalRevenueCatAPI
    public static final String resolveButtonText(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData.Localization localization) {
        String buttonText;
        t.g(screen, "<this>");
        t.g(localization, "localization");
        CustomerCenterConfigData.ScreenOffering offering = screen.getOffering();
        return (offering == null || (buttonText = offering.getButtonText()) == null) ? localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.BUY_SUBSCRIPTION) : buttonText;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
    @com.revenuecat.purchases.InternalRevenueCatAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object resolveOfferingSuspend(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen r5, com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType r6, Ga.e r7) {
        /*
            boolean r0 = r7 instanceof com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt.resolveOfferingSuspend.1
            if (r0 == 0) goto L13
            r0 = r7
            com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt$resolveOfferingSuspend$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt.resolveOfferingSuspend.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt$resolveOfferingSuspend$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt$resolveOfferingSuspend$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r5 = r0.L$0
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$ScreenOffering r5 = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.ScreenOffering) r5
            Ca.t.b(r7)
            goto L4b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            Ca.t.b(r7)
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$ScreenOffering r5 = r5.getOffering()
            if (r5 != 0) goto L40
            return r3
        L40:
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r6.awaitOfferings(r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            com.revenuecat.purchases.Offerings r7 = (com.revenuecat.purchases.Offerings) r7
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$ScreenOffering$ScreenOfferingType r6 = r5.getType()
            int[] r0 = com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt.WhenMappings.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r0[r6]
            if (r6 == r4) goto L76
            r0 = 2
            if (r6 != r0) goto L70
            java.lang.String r5 = r5.getOfferingId()
            if (r5 == 0) goto L7a
            java.util.Map r6 = r7.getAll()
            java.lang.Object r5 = r6.get(r5)
            r3 = r5
            com.revenuecat.purchases.Offering r3 = (com.revenuecat.purchases.Offering) r3
            goto L7a
        L70:
            Ca.o r5 = new Ca.o
            r5.<init>()
            throw r5
        L76:
            com.revenuecat.purchases.Offering r3 = r7.getCurrent()
        L7a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.ScreenOfferingExtensionsKt.resolveOfferingSuspend(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen, com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType, Ga.e):java.lang.Object");
    }
}

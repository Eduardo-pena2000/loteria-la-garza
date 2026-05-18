package com.revenuecat.purchases.customercenter;

import Ca.I;
import Ca.o;
import Qa.l;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ScreenOfferingExtensionsKt {

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ l $onSuccess;
        final /* synthetic */ CustomerCenterConfigData.ScreenOffering $screenOffering;

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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CustomerCenterConfigData.ScreenOffering screenOffering, l lVar) {
            super(1);
            this.$screenOffering = screenOffering;
            this.$onSuccess = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return I.a;
        }

        public final void invoke(Offerings offerings) {
            Offering current;
            t.g(offerings, "offerings");
            int i = WhenMappings.$EnumSwitchMapping$0[this.$screenOffering.getType().ordinal()];
            if (i == 1) {
                current = offerings.getCurrent();
            } else {
                if (i != 2) {
                    throw new o();
                }
                String offeringId = this.$screenOffering.getOfferingId();
                current = offeringId != null ? (Offering) offerings.getAll().get(offeringId) : null;
            }
            this.$onSuccess.invoke(current);
        }
    }

    @InternalRevenueCatAPI
    public static final void resolveOffering(CustomerCenterConfigData.Screen screen, Purchases purchases, l lVar, l lVar2) {
        t.g(screen, "<this>");
        t.g(purchases, "purchases");
        t.g(lVar, "onError");
        t.g(lVar2, "onSuccess");
        CustomerCenterConfigData.ScreenOffering offering = screen.getOffering();
        if (offering == null) {
            lVar2.invoke((Object) null);
        } else {
            ListenerConversionsCommonKt.getOfferingsWith(purchases, lVar, new 2(offering, lVar2));
        }
    }

    public static /* synthetic */ void resolveOffering$default(CustomerCenterConfigData.Screen screen, Purchases purchases, l lVar, l lVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = 1.INSTANCE;
        }
        resolveOffering(screen, purchases, lVar, lVar2);
    }
}

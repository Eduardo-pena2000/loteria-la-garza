package com.revenuecat.purchases.google.usecase;

import Ca.I;
import Ca.o;
import Qa.l;
import Qa.p;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AcknowledgePurchaseUseCase extends BillingClientUseCase {
    private final l onError;
    private final l onReceive;
    private final AcknowledgePurchaseUseCaseParams useCaseParams;
    private final l withConnectedClient;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostReceiptInitiationSource.values().length];
            try {
                iArr[PostReceiptInitiationSource.RESTORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostReceiptInitiationSource.PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class 1 extends u implements l {
        public 1() {
            super(1);
        }

        public static /* synthetic */ void a(AcknowledgePurchaseUseCase acknowledgePurchaseUseCase, BillingResult billingResult) {
            invoke$lambda$0(acknowledgePurchaseUseCase, billingResult);
        }

        private static final void invoke$lambda$0(AcknowledgePurchaseUseCase acknowledgePurchaseUseCase, BillingResult billingResult) {
            t.g(billingResult, "billingResult");
            BillingClientUseCase.processResult$default(acknowledgePurchaseUseCase, billingResult, AcknowledgePurchaseUseCase.access$getUseCaseParams$p(acknowledgePurchaseUseCase).getPurchaseToken(), null, new AcknowledgePurchaseUseCase$executeAsync$1$1$1(acknowledgePurchaseUseCase), 4, null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return I.a;
        }

        public final void invoke(BillingClient billingClient) {
            t.g(billingClient, "$this$invoke");
            AcknowledgePurchaseParams build = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(AcknowledgePurchaseUseCase.access$getUseCaseParams$p(AcknowledgePurchaseUseCase.this).getPurchaseToken()).build();
            t.f(build, "newBuilder()\n           …\n                .build()");
            billingClient.acknowledgePurchase(build, new a(AcknowledgePurchaseUseCase.this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcknowledgePurchaseUseCase(AcknowledgePurchaseUseCaseParams acknowledgePurchaseUseCaseParams, l lVar, l lVar2, l lVar3, p pVar) {
        super(acknowledgePurchaseUseCaseParams, lVar2, pVar);
        t.g(acknowledgePurchaseUseCaseParams, "useCaseParams");
        t.g(lVar, "onReceive");
        t.g(lVar2, "onError");
        t.g(lVar3, "withConnectedClient");
        t.g(pVar, "executeRequestOnUIThread");
        this.useCaseParams = acknowledgePurchaseUseCaseParams;
        this.onReceive = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    public static final /* synthetic */ AcknowledgePurchaseUseCaseParams access$getUseCaseParams$p(AcknowledgePurchaseUseCase acknowledgePurchaseUseCase) {
        return acknowledgePurchaseUseCase.useCaseParams;
    }

    public void executeAsync() {
        this.withConnectedClient.invoke(new 1());
    }

    public boolean getBackoffForNetworkErrors() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.useCaseParams.getInitiationSource().ordinal()];
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3) {
            return true;
        }
        throw new o();
    }

    public String getErrorMessage() {
        return "Error acknowledging purchase";
    }

    public final l getOnError() {
        return this.onError;
    }

    public final l getOnReceive() {
        return this.onReceive;
    }

    public final l getWithConnectedClient() {
        return this.withConnectedClient;
    }

    public void onOk(String str) {
        t.g(str, "received");
        this.onReceive.invoke(str);
    }
}

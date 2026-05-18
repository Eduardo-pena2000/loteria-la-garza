package com.revenuecat.purchases.google.usecase;

import Ca.I;
import Ca.o;
import Qa.l;
import Qa.p;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ConsumePurchaseUseCase extends BillingClientUseCase {
    private final l onError;
    private final l onReceive;
    private final ConsumePurchaseUseCaseParams useCaseParams;
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

        public static /* synthetic */ void a(ConsumePurchaseUseCase consumePurchaseUseCase, BillingResult billingResult, String str) {
            invoke$lambda$0(consumePurchaseUseCase, billingResult, str);
        }

        private static final void invoke$lambda$0(ConsumePurchaseUseCase consumePurchaseUseCase, BillingResult billingResult, String str) {
            t.g(billingResult, "billingResult");
            t.g(str, "purchaseToken");
            BillingClientUseCase.processResult$default(consumePurchaseUseCase, billingResult, str, null, new ConsumePurchaseUseCase$executeAsync$1$1$1(consumePurchaseUseCase), 4, null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return I.a;
        }

        public final void invoke(BillingClient billingClient) {
            t.g(billingClient, "$this$invoke");
            ConsumeParams build = ConsumeParams.newBuilder().setPurchaseToken(ConsumePurchaseUseCase.access$getUseCaseParams$p(ConsumePurchaseUseCase.this).getPurchaseToken()).build();
            t.f(build, "newBuilder()\n           …\n                .build()");
            billingClient.consumeAsync(build, new b(ConsumePurchaseUseCase.this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsumePurchaseUseCase(ConsumePurchaseUseCaseParams consumePurchaseUseCaseParams, l lVar, l lVar2, l lVar3, p pVar) {
        super(consumePurchaseUseCaseParams, lVar2, pVar);
        t.g(consumePurchaseUseCaseParams, "useCaseParams");
        t.g(lVar, "onReceive");
        t.g(lVar2, "onError");
        t.g(lVar3, "withConnectedClient");
        t.g(pVar, "executeRequestOnUIThread");
        this.useCaseParams = consumePurchaseUseCaseParams;
        this.onReceive = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    public static final /* synthetic */ ConsumePurchaseUseCaseParams access$getUseCaseParams$p(ConsumePurchaseUseCase consumePurchaseUseCase) {
        return consumePurchaseUseCase.useCaseParams;
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
        return "Error consuming purchase";
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

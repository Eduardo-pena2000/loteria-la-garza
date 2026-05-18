package com.revenuecat.purchases;

import Ca.I;
import Qa.p;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.LogInCallback;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesOrchestrator$logIn$2$1 extends u implements Qa.a {
    final /* synthetic */ LogInCallback $callback;
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ PurchasesOrchestrator this$0;

    public static final class 1 extends u implements p {
        final /* synthetic */ LogInCallback $callback;
        final /* synthetic */ String $newAppUserID;
        final /* synthetic */ PurchasesOrchestrator this$0;

        public static final class 1 extends u implements Qa.a {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ boolean $created;
            final /* synthetic */ CustomerInfo $customerInfo;
            final /* synthetic */ PurchasesOrchestrator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(LogInCallback logInCallback, CustomerInfo customerInfo, boolean z, PurchasesOrchestrator purchasesOrchestrator) {
                super(0);
                this.$callback = logInCallback;
                this.$customerInfo = customerInfo;
                this.$created = z;
                this.this$0 = purchasesOrchestrator;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onReceived(this.$customerInfo, this.$created);
                }
                PurchasesOrchestrator.access$getCustomerInfoUpdateHandler$p(this.this$0).notifyListeners(this.$customerInfo);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback) {
            super(2);
            this.this$0 = purchasesOrchestrator;
            this.$newAppUserID = str;
            this.$callback = logInCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
            return I.a;
        }

        public final void invoke(CustomerInfo customerInfo, boolean z) {
            t.g(customerInfo, "customerInfo");
            PurchasesOrchestrator purchasesOrchestrator = this.this$0;
            PurchasesOrchestrator.access$dispatch(purchasesOrchestrator, new 1(this.$callback, customerInfo, z, purchasesOrchestrator));
            OfferingsManager.fetchAndCacheOfferings$default(PurchasesOrchestrator.access$getOfferingsManager$p(this.this$0), this.$newAppUserID, this.this$0.getState$purchases_defaultsBc8Release().getAppInBackground(), null, null, 12, null);
            PurchasesOrchestrator.access$getBackupManager$p(this.this$0).dataChanged();
        }
    }

    public static final class 2 extends u implements Qa.l {
        final /* synthetic */ LogInCallback $callback;
        final /* synthetic */ PurchasesOrchestrator this$0;

        public static final class 1 extends u implements Qa.a {
            final /* synthetic */ LogInCallback $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(LogInCallback logInCallback, PurchasesError purchasesError) {
                super(0);
                this.$callback = logInCallback;
                this.$error = purchasesError;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                LogInCallback logInCallback = this.$callback;
                if (logInCallback != null) {
                    logInCallback.onError(this.$error);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PurchasesOrchestrator purchasesOrchestrator, LogInCallback logInCallback) {
            super(1);
            this.this$0 = purchasesOrchestrator;
            this.$callback = logInCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            PurchasesOrchestrator.access$dispatch(this.this$0, new 1(this.$callback, purchasesError));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$logIn$2$1(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback) {
        super(0);
        this.this$0 = purchasesOrchestrator;
        this.$newAppUserID = str;
        this.$callback = logInCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        IdentityManager access$getIdentityManager$p = PurchasesOrchestrator.access$getIdentityManager$p(this.this$0);
        String str = this.$newAppUserID;
        access$getIdentityManager$p.logIn(str, new 1(this.this$0, str, this.$callback), new 2(this.this$0, this.$callback));
    }
}

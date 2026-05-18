package com.revenuecat.purchases;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class SyncPendingPurchaseResult {

    public static final class AutoSyncDisabled extends SyncPendingPurchaseResult {
        public static final AutoSyncDisabled INSTANCE = new AutoSyncDisabled();

        private AutoSyncDisabled() {
            super(null);
        }
    }

    public static final class Error extends SyncPendingPurchaseResult {
        private final PurchasesError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(PurchasesError purchasesError) {
            super(null);
            t.g(purchasesError, "error");
            this.error = purchasesError;
        }

        public static /* synthetic */ Error copy$default(Error error, PurchasesError purchasesError, int i, Object obj) {
            if ((i & 1) != 0) {
                purchasesError = error.error;
            }
            return error.copy(purchasesError);
        }

        public final PurchasesError component1() {
            return this.error;
        }

        public final Error copy(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            return new Error(purchasesError);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && t.c(this.error, ((Error) obj).error);
        }

        public final PurchasesError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ')';
        }
    }

    public static final class NoPendingPurchasesToSync extends SyncPendingPurchaseResult {
        public static final NoPendingPurchasesToSync INSTANCE = new NoPendingPurchasesToSync();

        private NoPendingPurchasesToSync() {
            super(null);
        }
    }

    public static final class Success extends SyncPendingPurchaseResult {
        private final CustomerInfo customerInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(CustomerInfo customerInfo) {
            super(null);
            t.g(customerInfo, "customerInfo");
            this.customerInfo = customerInfo;
        }

        public static /* synthetic */ Success copy$default(Success success, CustomerInfo customerInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                customerInfo = success.customerInfo;
            }
            return success.copy(customerInfo);
        }

        public final CustomerInfo component1() {
            return this.customerInfo;
        }

        public final Success copy(CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            return new Success(customerInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && t.c(this.customerInfo, ((Success) obj).customerInfo);
        }

        public final CustomerInfo getCustomerInfo() {
            return this.customerInfo;
        }

        public int hashCode() {
            return this.customerInfo.hashCode();
        }

        public String toString() {
            return "Success(customerInfo=" + this.customerInfo + ')';
        }
    }

    public /* synthetic */ SyncPendingPurchaseResult(kotlin.jvm.internal.k kVar) {
        this();
    }

    private SyncPendingPurchaseResult() {
    }
}

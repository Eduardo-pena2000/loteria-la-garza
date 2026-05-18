package com.revenuecat.purchases.ui.revenuecatui;

import com.revenuecat.purchases.PurchasesError;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface PurchaseLogicResult {

    public static final class Cancellation implements PurchaseLogicResult {
        public static final int $stable = 0;
        public static final Cancellation INSTANCE = new Cancellation();

        private Cancellation() {
        }
    }

    public static final class Error implements PurchaseLogicResult {
        public static final int $stable = 0;
        private final PurchasesError errorDetails;

        public Error() {
            this(null, 1, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && t.c(this.errorDetails, ((Error) obj).errorDetails);
        }

        public final PurchasesError getErrorDetails() {
            return this.errorDetails;
        }

        public int hashCode() {
            PurchasesError purchasesError = this.errorDetails;
            if (purchasesError == null) {
                return 0;
            }
            return purchasesError.hashCode();
        }

        public String toString() {
            return "Error(errorDetails=" + this.errorDetails + ')';
        }

        public Error(PurchasesError purchasesError) {
            this.errorDetails = purchasesError;
        }

        public /* synthetic */ Error(PurchasesError purchasesError, int i, k kVar) {
            this((i & 1) != 0 ? null : purchasesError);
        }
    }

    public static final class Success implements PurchaseLogicResult {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
        }
    }
}

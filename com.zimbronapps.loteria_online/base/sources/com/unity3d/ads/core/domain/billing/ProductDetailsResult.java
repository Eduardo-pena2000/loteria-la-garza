package com.unity3d.ads.core.domain.billing;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class ProductDetailsResult {

    public static final class Failure extends ProductDetailsResult {
        private final BillingResultBridge billingResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(BillingResultBridge billingResult) {
            super(null);
            t.g(billingResult, "billingResult");
            this.billingResult = billingResult;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, BillingResultBridge billingResultBridge, int i, Object obj) {
            if ((i & 1) != 0) {
                billingResultBridge = failure.billingResult;
            }
            return failure.copy(billingResultBridge);
        }

        public final BillingResultBridge component1() {
            return this.billingResult;
        }

        public final Failure copy(BillingResultBridge billingResult) {
            t.g(billingResult, "billingResult");
            return new Failure(billingResult);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && t.c(this.billingResult, ((Failure) obj).billingResult);
        }

        public final BillingResultBridge getBillingResult() {
            return this.billingResult;
        }

        public int hashCode() {
            return this.billingResult.hashCode();
        }

        public String toString() {
            return "Failure(billingResult=" + this.billingResult + ')';
        }
    }

    public static final class NotFound extends ProductDetailsResult {
        public static final NotFound INSTANCE = new NotFound();

        private NotFound() {
            super(null);
        }
    }

    public static final class Success extends ProductDetailsResult {
        private final String productDetailsJson;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String productDetailsJson) {
            super(null);
            t.g(productDetailsJson, "productDetailsJson");
            this.productDetailsJson = productDetailsJson;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.productDetailsJson;
            }
            return success.copy(str);
        }

        public final String component1() {
            return this.productDetailsJson;
        }

        public final Success copy(String productDetailsJson) {
            t.g(productDetailsJson, "productDetailsJson");
            return new Success(productDetailsJson);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && t.c(this.productDetailsJson, ((Success) obj).productDetailsJson);
        }

        public final String getProductDetailsJson() {
            return this.productDetailsJson;
        }

        public int hashCode() {
            return this.productDetailsJson.hashCode();
        }

        public String toString() {
            return "Success(productDetailsJson=" + this.productDetailsJson + ')';
        }
    }

    public /* synthetic */ ProductDetailsResult(k kVar) {
        this();
    }

    private ProductDetailsResult() {
    }
}

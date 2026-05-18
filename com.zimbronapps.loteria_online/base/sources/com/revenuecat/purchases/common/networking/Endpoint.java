package com.revenuecat.purchases.common.networking;

import Ca.o;
import Da.D;
import android.net.Uri;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class Endpoint {
    private final String fallbackPath;
    private final String name;
    private final String pathTemplate;

    public static final class AliasUsers extends Endpoint {
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AliasUsers(String str) {
            super("/v1/subscribers/%s/alias", "alias_users", null, 4, null);
            t.g(str, "userId");
            this.userId = str;
        }

        public static /* synthetic */ AliasUsers copy$default(AliasUsers aliasUsers, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aliasUsers.userId;
            }
            return aliasUsers.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final AliasUsers copy(String str) {
            t.g(str, "userId");
            return new AliasUsers(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AliasUsers) && t.c(this.userId, ((AliasUsers) obj).userId);
        }

        public String getPath(boolean z) {
            String format = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            t.f(format, "format(...)");
            return format;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "AliasUsers(userId=" + this.userId + ')';
        }
    }

    public static final class GetAmazonReceipt extends Endpoint {
        private final String receiptId;
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAmazonReceipt(String str, String str2) {
            super("/v1/receipts/amazon/%s/%s", "get_amazon_receipt", null, 4, null);
            t.g(str, "userId");
            t.g(str2, "receiptId");
            this.userId = str;
            this.receiptId = str2;
        }

        public static /* synthetic */ GetAmazonReceipt copy$default(GetAmazonReceipt getAmazonReceipt, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getAmazonReceipt.userId;
            }
            if ((i & 2) != 0) {
                str2 = getAmazonReceipt.receiptId;
            }
            return getAmazonReceipt.copy(str, str2);
        }

        public final String component1() {
            return this.userId;
        }

        public final String component2() {
            return this.receiptId;
        }

        public final GetAmazonReceipt copy(String str, String str2) {
            t.g(str, "userId");
            t.g(str2, "receiptId");
            return new GetAmazonReceipt(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetAmazonReceipt)) {
                return false;
            }
            GetAmazonReceipt getAmazonReceipt = (GetAmazonReceipt) obj;
            return t.c(this.userId, getAmazonReceipt.userId) && t.c(this.receiptId, getAmazonReceipt.receiptId);
        }

        public String getPath(boolean z) {
            String format = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId), this.receiptId}, 2));
            t.f(format, "format(...)");
            return format;
        }

        public final String getReceiptId() {
            return this.receiptId;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return (this.userId.hashCode() * 31) + this.receiptId.hashCode();
        }

        public String toString() {
            return "GetAmazonReceipt(userId=" + this.userId + ", receiptId=" + this.receiptId + ')';
        }
    }

    public static final class GetCustomerCenterConfig extends Endpoint {
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCustomerCenterConfig(String str) {
            super("/v1/customercenter/%s", "get_customer_center_config", null, 4, null);
            t.g(str, "userId");
            this.userId = str;
        }

        public static /* synthetic */ GetCustomerCenterConfig copy$default(GetCustomerCenterConfig getCustomerCenterConfig, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getCustomerCenterConfig.userId;
            }
            return getCustomerCenterConfig.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final GetCustomerCenterConfig copy(String str) {
            t.g(str, "userId");
            return new GetCustomerCenterConfig(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetCustomerCenterConfig) && t.c(this.userId, ((GetCustomerCenterConfig) obj).userId);
        }

        public String getPath(boolean z) {
            String format = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            t.f(format, "format(...)");
            return format;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "GetCustomerCenterConfig(userId=" + this.userId + ')';
        }
    }

    public static final class GetCustomerInfo extends Endpoint {
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCustomerInfo(String str) {
            super("/v1/subscribers/%s", "get_customer", null, 4, null);
            t.g(str, "userId");
            this.userId = str;
        }

        public static /* synthetic */ GetCustomerInfo copy$default(GetCustomerInfo getCustomerInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getCustomerInfo.userId;
            }
            return getCustomerInfo.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final GetCustomerInfo copy(String str) {
            t.g(str, "userId");
            return new GetCustomerInfo(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetCustomerInfo) && t.c(this.userId, ((GetCustomerInfo) obj).userId);
        }

        public String getPath(boolean z) {
            String format = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            t.f(format, "format(...)");
            return format;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "GetCustomerInfo(userId=" + this.userId + ')';
        }
    }

    public static final class GetOfferings extends Endpoint {
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetOfferings(String str) {
            super("/v1/subscribers/%s/offerings", "get_offerings", "/v1/offerings", null);
            t.g(str, "userId");
            this.userId = str;
        }

        public static /* synthetic */ GetOfferings copy$default(GetOfferings getOfferings, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getOfferings.userId;
            }
            return getOfferings.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final GetOfferings copy(String str) {
            t.g(str, "userId");
            return new GetOfferings(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetOfferings) && t.c(this.userId, ((GetOfferings) obj).userId);
        }

        public String getPath(boolean z) {
            if (z && getFallbackPath() != null) {
                return getFallbackPath();
            }
            String format = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            t.f(format, "format(...)");
            return format;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "GetOfferings(userId=" + this.userId + ')';
        }
    }

    public static final class GetProductEntitlementMapping extends Endpoint {
        public static final GetProductEntitlementMapping INSTANCE = new GetProductEntitlementMapping();

        private GetProductEntitlementMapping() {
            super("/v1/product_entitlement_mapping", "get_product_entitlement_mapping", "/v1/product_entitlement_mapping", null);
        }

        public String getPath(boolean z) {
            return (!z || getFallbackPath() == null) ? getPathTemplate() : getFallbackPath();
        }
    }

    public static final class GetVirtualCurrencies extends Endpoint {
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetVirtualCurrencies(String str) {
            super("/v1/subscribers/%s/virtual_currencies", "get_virtual_currencies", null, 4, null);
            t.g(str, "userId");
            this.userId = str;
        }

        public static /* synthetic */ GetVirtualCurrencies copy$default(GetVirtualCurrencies getVirtualCurrencies, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getVirtualCurrencies.userId;
            }
            return getVirtualCurrencies.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final GetVirtualCurrencies copy(String str) {
            t.g(str, "userId");
            return new GetVirtualCurrencies(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetVirtualCurrencies) && t.c(this.userId, ((GetVirtualCurrencies) obj).userId);
        }

        public String getPath(boolean z) {
            String format = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            t.f(format, "format(...)");
            return format;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "GetVirtualCurrencies(userId=" + this.userId + ')';
        }
    }

    public static final class LogIn extends Endpoint {
        public static final LogIn INSTANCE = new LogIn();

        private LogIn() {
            super("/v1/subscribers/identify", "log_in", null, 4, null);
        }

        public String getPath(boolean z) {
            return getPathTemplate();
        }
    }

    public static final class PostAttributes extends Endpoint {
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostAttributes(String str) {
            super("/v1/subscribers/%s/attributes", "post_attributes", null, 4, null);
            t.g(str, "userId");
            this.userId = str;
        }

        public static /* synthetic */ PostAttributes copy$default(PostAttributes postAttributes, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = postAttributes.userId;
            }
            return postAttributes.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final PostAttributes copy(String str) {
            t.g(str, "userId");
            return new PostAttributes(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PostAttributes) && t.c(this.userId, ((PostAttributes) obj).userId);
        }

        public String getPath(boolean z) {
            String format = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            t.f(format, "format(...)");
            return format;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "PostAttributes(userId=" + this.userId + ')';
        }
    }

    public static final class PostCreateSupportTicket extends Endpoint {
        public static final PostCreateSupportTicket INSTANCE = new PostCreateSupportTicket();

        private PostCreateSupportTicket() {
            super("/v1/customercenter/support/create-ticket", "post_create_support_ticket", null, 4, null);
        }

        public String getPath(boolean z) {
            return getPathTemplate();
        }
    }

    public static final class PostDiagnostics extends Endpoint {
        public static final PostDiagnostics INSTANCE = new PostDiagnostics();

        private PostDiagnostics() {
            super("/v1/diagnostics", "post_diagnostics", null, 4, null);
        }

        public String getPath(boolean z) {
            return getPathTemplate();
        }
    }

    public static final class PostEvents extends Endpoint {
        public static final PostEvents INSTANCE = new PostEvents();

        private PostEvents() {
            super("/v1/events", "post_paywall_events", null, 4, null);
        }

        public String getPath(boolean z) {
            return getPathTemplate();
        }
    }

    public static final class PostReceipt extends Endpoint {
        public static final PostReceipt INSTANCE = new PostReceipt();

        private PostReceipt() {
            super("/v1/receipts", "post_receipt", null, 4, null);
        }

        public String getPath(boolean z) {
            return getPathTemplate();
        }
    }

    public static final class PostRedeemWebPurchase extends Endpoint {
        public static final PostRedeemWebPurchase INSTANCE = new PostRedeemWebPurchase();

        private PostRedeemWebPurchase() {
            super("/v1/subscribers/redeem_purchase", "post_redeem_web_purchase", null, 4, null);
        }

        public String getPath(boolean z) {
            return getPathTemplate();
        }
    }

    public static final class WebBillingGetProducts extends Endpoint {
        private final Set productIds;
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebBillingGetProducts(String str, Set set) {
            super("/rcbilling/v1/subscribers/%s/products?id=%s", "web_billing_get_products", null, 4, null);
            t.g(str, "userId");
            t.g(set, "productIds");
            this.userId = str;
            this.productIds = set;
        }

        public static /* synthetic */ WebBillingGetProducts copy$default(WebBillingGetProducts webBillingGetProducts, String str, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                str = webBillingGetProducts.userId;
            }
            if ((i & 2) != 0) {
                set = webBillingGetProducts.productIds;
            }
            return webBillingGetProducts.copy(str, set);
        }

        public final String component1() {
            return this.userId;
        }

        public final Set component2() {
            return this.productIds;
        }

        public final WebBillingGetProducts copy(String str, Set set) {
            t.g(str, "userId");
            t.g(set, "productIds");
            return new WebBillingGetProducts(str, set);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebBillingGetProducts)) {
                return false;
            }
            WebBillingGetProducts webBillingGetProducts = (WebBillingGetProducts) obj;
            return t.c(this.userId, webBillingGetProducts.userId) && t.c(this.productIds, webBillingGetProducts.productIds);
        }

        public String getPath(boolean z) {
            String format = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId), D.n0(this.productIds, "&id=", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, Endpoint$WebBillingGetProducts$getPath$1.INSTANCE, 30, (Object) null)}, 2));
            t.f(format, "format(...)");
            return format;
        }

        public final Set getProductIds() {
            return this.productIds;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return (this.userId.hashCode() * 31) + this.productIds.hashCode();
        }

        public String toString() {
            return "WebBillingGetProducts(userId=" + this.userId + ", productIds=" + this.productIds + ')';
        }
    }

    public /* synthetic */ Endpoint(String str, String str2, String str3, k kVar) {
        this(str, str2, str3);
    }

    public static /* synthetic */ String getPath$default(Endpoint endpoint, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPath");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return endpoint.getPath(z);
    }

    public final String getFallbackPath() {
        return this.fallbackPath;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getNeedsNonceToPerformSigning() {
        if (this instanceof GetCustomerInfo ? true : t.c(this, LogIn.INSTANCE) ? true : t.c(this, PostReceipt.INSTANCE) ? true : t.c(this, PostRedeemWebPurchase.INSTANCE) ? true : this instanceof GetVirtualCurrencies) {
            return true;
        }
        if (this instanceof GetAmazonReceipt ? true : this instanceof GetOfferings ? true : this instanceof PostAttributes ? true : t.c(this, PostDiagnostics.INSTANCE) ? true : t.c(this, PostEvents.INSTANCE) ? true : t.c(this, GetProductEntitlementMapping.INSTANCE) ? true : this instanceof GetCustomerCenterConfig ? true : t.c(this, PostCreateSupportTicket.INSTANCE) ? true : this instanceof WebBillingGetProducts ? true : this instanceof AliasUsers) {
            return false;
        }
        throw new o();
    }

    public abstract String getPath(boolean z);

    public final String getPathTemplate() {
        return this.pathTemplate;
    }

    public final boolean getSupportsFallbackBaseURLs() {
        return this.fallbackPath != null;
    }

    public final boolean getSupportsSignatureVerification() {
        if (this instanceof GetCustomerInfo ? true : t.c(this, LogIn.INSTANCE) ? true : t.c(this, PostReceipt.INSTANCE) ? true : this instanceof GetOfferings ? true : t.c(this, GetProductEntitlementMapping.INSTANCE) ? true : t.c(this, PostRedeemWebPurchase.INSTANCE) ? true : this instanceof GetVirtualCurrencies) {
            return true;
        }
        if (this instanceof GetAmazonReceipt ? true : this instanceof PostAttributes ? true : t.c(this, PostDiagnostics.INSTANCE) ? true : t.c(this, PostEvents.INSTANCE) ? true : this instanceof GetCustomerCenterConfig ? true : t.c(this, PostCreateSupportTicket.INSTANCE) ? true : this instanceof WebBillingGetProducts ? true : this instanceof AliasUsers) {
            return false;
        }
        throw new o();
    }

    private Endpoint(String str, String str2, String str3) {
        this.pathTemplate = str;
        this.name = str2;
        this.fallbackPath = str3;
    }

    public /* synthetic */ Endpoint(String str, String str2, String str3, int i, k kVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, null);
    }
}

package com.revenuecat.purchases.common.networking;

import Ca.e;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.M;
import sb.f0;
import sb.t0;
import sb.x0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class WebBillingProductResponse {
    private final String defaultPurchaseOptionId;
    private final String description;
    private final String identifier;
    private final String productType;
    private final Map purchaseOptions;
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, null, null, new M(x0.a, WebBillingPurchaseOption$$serializer.INSTANCE)};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return WebBillingProductResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ WebBillingProductResponse(int i, String str, String str2, String str3, String str4, String str5, Map map, t0 t0Var) {
        if (39 != (i & 39)) {
            f0.a(i, 39, WebBillingProductResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.productType = str2;
        this.title = str3;
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
        if ((i & 16) == 0) {
            this.defaultPurchaseOptionId = null;
        } else {
            this.defaultPurchaseOptionId = str5;
        }
        this.purchaseOptions = map;
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ WebBillingProductResponse copy$default(WebBillingProductResponse webBillingProductResponse, String str, String str2, String str3, String str4, String str5, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webBillingProductResponse.identifier;
        }
        if ((i & 2) != 0) {
            str2 = webBillingProductResponse.productType;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = webBillingProductResponse.title;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = webBillingProductResponse.description;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = webBillingProductResponse.defaultPurchaseOptionId;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            map = webBillingProductResponse.purchaseOptions;
        }
        return webBillingProductResponse.copy(str, str6, str7, str8, str9, map);
    }

    public static /* synthetic */ void getDefaultPurchaseOptionId$annotations() {
    }

    public static /* synthetic */ void getProductType$annotations() {
    }

    public static /* synthetic */ void getPurchaseOptions$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(WebBillingProductResponse webBillingProductResponse, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        dVar.v(eVar, 0, webBillingProductResponse.identifier);
        dVar.v(eVar, 1, webBillingProductResponse.productType);
        dVar.v(eVar, 2, webBillingProductResponse.title);
        if (dVar.e(eVar, 3) || webBillingProductResponse.description != null) {
            dVar.j(eVar, 3, x0.a, webBillingProductResponse.description);
        }
        if (dVar.e(eVar, 4) || webBillingProductResponse.defaultPurchaseOptionId != null) {
            dVar.j(eVar, 4, x0.a, webBillingProductResponse.defaultPurchaseOptionId);
        }
        dVar.k(eVar, 5, kVarArr[5], webBillingProductResponse.purchaseOptions);
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.productType;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.defaultPurchaseOptionId;
    }

    public final Map component6() {
        return this.purchaseOptions;
    }

    public final WebBillingProductResponse copy(String str, String str2, String str3, String str4, String str5, Map map) {
        t.g(str, "identifier");
        t.g(str2, "productType");
        t.g(str3, "title");
        t.g(map, "purchaseOptions");
        return new WebBillingProductResponse(str, str2, str3, str4, str5, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebBillingProductResponse)) {
            return false;
        }
        WebBillingProductResponse webBillingProductResponse = (WebBillingProductResponse) obj;
        return t.c(this.identifier, webBillingProductResponse.identifier) && t.c(this.productType, webBillingProductResponse.productType) && t.c(this.title, webBillingProductResponse.title) && t.c(this.description, webBillingProductResponse.description) && t.c(this.defaultPurchaseOptionId, webBillingProductResponse.defaultPurchaseOptionId) && t.c(this.purchaseOptions, webBillingProductResponse.purchaseOptions);
    }

    public final String getDefaultPurchaseOptionId() {
        return this.defaultPurchaseOptionId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final Map getPurchaseOptions() {
        return this.purchaseOptions;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((this.identifier.hashCode() * 31) + this.productType.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.defaultPurchaseOptionId;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.purchaseOptions.hashCode();
    }

    public String toString() {
        return "WebBillingProductResponse(identifier=" + this.identifier + ", productType=" + this.productType + ", title=" + this.title + ", description=" + this.description + ", defaultPurchaseOptionId=" + this.defaultPurchaseOptionId + ", purchaseOptions=" + this.purchaseOptions + ')';
    }

    public WebBillingProductResponse(String str, String str2, String str3, String str4, String str5, Map map) {
        t.g(str, "identifier");
        t.g(str2, "productType");
        t.g(str3, "title");
        t.g(map, "purchaseOptions");
        this.identifier = str;
        this.productType = str2;
        this.title = str3;
        this.description = str4;
        this.defaultPurchaseOptionId = str5;
        this.purchaseOptions = map;
    }

    public /* synthetic */ WebBillingProductResponse(String str, String str2, String str3, String str4, String str5, Map map, int i, k kVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, map);
    }
}

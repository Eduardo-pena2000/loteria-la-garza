package com.revenuecat.purchases.common.networking;

import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.e;
import sb.f0;
import sb.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class WebBillingProductsResponse {
    private final List productDetails;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {new e(WebBillingProductResponse$$serializer.INSTANCE)};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return WebBillingProductsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Ca.e
    public /* synthetic */ WebBillingProductsResponse(int i, List list, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, WebBillingProductsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.productDetails = list;
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ WebBillingProductsResponse copy$default(WebBillingProductsResponse webBillingProductsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = webBillingProductsResponse.productDetails;
        }
        return webBillingProductsResponse.copy(list);
    }

    public static /* synthetic */ void getProductDetails$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(WebBillingProductsResponse webBillingProductsResponse, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, $childSerializers[0], webBillingProductsResponse.productDetails);
    }

    public final List component1() {
        return this.productDetails;
    }

    public final WebBillingProductsResponse copy(List list) {
        t.g(list, "productDetails");
        return new WebBillingProductsResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebBillingProductsResponse) && t.c(this.productDetails, ((WebBillingProductsResponse) obj).productDetails);
    }

    public final List getProductDetails() {
        return this.productDetails;
    }

    public int hashCode() {
        return this.productDetails.hashCode();
    }

    public String toString() {
        return "WebBillingProductsResponse(productDetails=" + this.productDetails + ')';
    }

    public WebBillingProductsResponse(List list) {
        t.g(list, "productDetails");
        this.productDetails = list;
    }
}

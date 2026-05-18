package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class QueryProductDetailsUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Set productIds;
    private final ProductType productType;

    public QueryProductDetailsUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set set, ProductType productType, boolean z) {
        t.g(dateProvider, "dateProvider");
        t.g(set, "productIds");
        t.g(productType, "productType");
        this.dateProvider = dateProvider;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.productIds = set;
        this.productType = productType;
        this.appInBackground = z;
    }

    public static /* synthetic */ QueryProductDetailsUseCaseParams copy$default(QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams, DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set set, ProductType productType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dateProvider = queryProductDetailsUseCaseParams.dateProvider;
        }
        if ((i & 2) != 0) {
            diagnosticsTracker = queryProductDetailsUseCaseParams.diagnosticsTrackerIfEnabled;
        }
        DiagnosticsTracker diagnosticsTracker2 = diagnosticsTracker;
        if ((i & 4) != 0) {
            set = queryProductDetailsUseCaseParams.productIds;
        }
        Set set2 = set;
        if ((i & 8) != 0) {
            productType = queryProductDetailsUseCaseParams.productType;
        }
        ProductType productType2 = productType;
        if ((i & 16) != 0) {
            z = queryProductDetailsUseCaseParams.appInBackground;
        }
        return queryProductDetailsUseCaseParams.copy(dateProvider, diagnosticsTracker2, set2, productType2, z);
    }

    public final DateProvider component1() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker component2() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final Set component3() {
        return this.productIds;
    }

    public final ProductType component4() {
        return this.productType;
    }

    public final boolean component5() {
        return this.appInBackground;
    }

    public final QueryProductDetailsUseCaseParams copy(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set set, ProductType productType, boolean z) {
        t.g(dateProvider, "dateProvider");
        t.g(set, "productIds");
        t.g(productType, "productType");
        return new QueryProductDetailsUseCaseParams(dateProvider, diagnosticsTracker, set, productType, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryProductDetailsUseCaseParams)) {
            return false;
        }
        QueryProductDetailsUseCaseParams queryProductDetailsUseCaseParams = (QueryProductDetailsUseCaseParams) obj;
        return t.c(this.dateProvider, queryProductDetailsUseCaseParams.dateProvider) && t.c(this.diagnosticsTrackerIfEnabled, queryProductDetailsUseCaseParams.diagnosticsTrackerIfEnabled) && t.c(this.productIds, queryProductDetailsUseCaseParams.productIds) && this.productType == queryProductDetailsUseCaseParams.productType && this.appInBackground == queryProductDetailsUseCaseParams.appInBackground;
    }

    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker getDiagnosticsTrackerIfEnabled() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final Set getProductIds() {
        return this.productIds;
    }

    public final ProductType getProductType() {
        return this.productType;
    }

    public int hashCode() {
        int hashCode = this.dateProvider.hashCode() * 31;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        return ((((((hashCode + (diagnosticsTracker == null ? 0 : diagnosticsTracker.hashCode())) * 31) + this.productIds.hashCode()) * 31) + this.productType.hashCode()) * 31) + Boolean.hashCode(this.appInBackground);
    }

    public String toString() {
        return "QueryProductDetailsUseCaseParams(dateProvider=" + this.dateProvider + ", diagnosticsTrackerIfEnabled=" + this.diagnosticsTrackerIfEnabled + ", productIds=" + this.productIds + ", productType=" + this.productType + ", appInBackground=" + this.appInBackground + ')';
    }

    public /* synthetic */ QueryProductDetailsUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, Set set, ProductType productType, boolean z, int i, k kVar) {
        this((i & 1) != 0 ? new DefaultDateProvider() : dateProvider, diagnosticsTracker, set, productType, z);
    }
}

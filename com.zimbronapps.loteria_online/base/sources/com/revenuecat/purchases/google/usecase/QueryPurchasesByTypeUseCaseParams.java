package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class QueryPurchasesByTypeUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final String productType;

    public QueryPurchasesByTypeUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z, String str) {
        t.g(dateProvider, "dateProvider");
        t.g(str, "productType");
        this.dateProvider = dateProvider;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.appInBackground = z;
        this.productType = str;
    }

    public static /* synthetic */ QueryPurchasesByTypeUseCaseParams copy$default(QueryPurchasesByTypeUseCaseParams queryPurchasesByTypeUseCaseParams, DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            dateProvider = queryPurchasesByTypeUseCaseParams.dateProvider;
        }
        if ((i & 2) != 0) {
            diagnosticsTracker = queryPurchasesByTypeUseCaseParams.diagnosticsTrackerIfEnabled;
        }
        if ((i & 4) != 0) {
            z = queryPurchasesByTypeUseCaseParams.appInBackground;
        }
        if ((i & 8) != 0) {
            str = queryPurchasesByTypeUseCaseParams.productType;
        }
        return queryPurchasesByTypeUseCaseParams.copy(dateProvider, diagnosticsTracker, z, str);
    }

    public final DateProvider component1() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker component2() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final boolean component3() {
        return this.appInBackground;
    }

    public final String component4() {
        return this.productType;
    }

    public final QueryPurchasesByTypeUseCaseParams copy(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z, String str) {
        t.g(dateProvider, "dateProvider");
        t.g(str, "productType");
        return new QueryPurchasesByTypeUseCaseParams(dateProvider, diagnosticsTracker, z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryPurchasesByTypeUseCaseParams)) {
            return false;
        }
        QueryPurchasesByTypeUseCaseParams queryPurchasesByTypeUseCaseParams = (QueryPurchasesByTypeUseCaseParams) obj;
        return t.c(this.dateProvider, queryPurchasesByTypeUseCaseParams.dateProvider) && t.c(this.diagnosticsTrackerIfEnabled, queryPurchasesByTypeUseCaseParams.diagnosticsTrackerIfEnabled) && this.appInBackground == queryPurchasesByTypeUseCaseParams.appInBackground && t.c(this.productType, queryPurchasesByTypeUseCaseParams.productType);
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

    public final String getProductType() {
        return this.productType;
    }

    public int hashCode() {
        int hashCode = this.dateProvider.hashCode() * 31;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        return ((((hashCode + (diagnosticsTracker == null ? 0 : diagnosticsTracker.hashCode())) * 31) + Boolean.hashCode(this.appInBackground)) * 31) + this.productType.hashCode();
    }

    public String toString() {
        return "QueryPurchasesByTypeUseCaseParams(dateProvider=" + this.dateProvider + ", diagnosticsTrackerIfEnabled=" + this.diagnosticsTrackerIfEnabled + ", appInBackground=" + this.appInBackground + ", productType=" + this.productType + ')';
    }

    public /* synthetic */ QueryPurchasesByTypeUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z, String str, int i, k kVar) {
        this((i & 1) != 0 ? new DefaultDateProvider() : dateProvider, diagnosticsTracker, z, str);
    }
}

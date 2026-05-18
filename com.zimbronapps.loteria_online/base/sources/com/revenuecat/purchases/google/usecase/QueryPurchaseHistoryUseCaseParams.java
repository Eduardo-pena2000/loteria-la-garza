package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class QueryPurchaseHistoryUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final String productType;

    public QueryPurchaseHistoryUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, String str, boolean z) {
        t.g(dateProvider, "dateProvider");
        t.g(str, "productType");
        this.dateProvider = dateProvider;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.productType = str;
        this.appInBackground = z;
    }

    public static /* synthetic */ QueryPurchaseHistoryUseCaseParams copy$default(QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams, DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dateProvider = queryPurchaseHistoryUseCaseParams.dateProvider;
        }
        if ((i & 2) != 0) {
            diagnosticsTracker = queryPurchaseHistoryUseCaseParams.diagnosticsTrackerIfEnabled;
        }
        if ((i & 4) != 0) {
            str = queryPurchaseHistoryUseCaseParams.productType;
        }
        if ((i & 8) != 0) {
            z = queryPurchaseHistoryUseCaseParams.appInBackground;
        }
        return queryPurchaseHistoryUseCaseParams.copy(dateProvider, diagnosticsTracker, str, z);
    }

    public final DateProvider component1() {
        return this.dateProvider;
    }

    public final DiagnosticsTracker component2() {
        return this.diagnosticsTrackerIfEnabled;
    }

    public final String component3() {
        return this.productType;
    }

    public final boolean component4() {
        return this.appInBackground;
    }

    public final QueryPurchaseHistoryUseCaseParams copy(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, String str, boolean z) {
        t.g(dateProvider, "dateProvider");
        t.g(str, "productType");
        return new QueryPurchaseHistoryUseCaseParams(dateProvider, diagnosticsTracker, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryPurchaseHistoryUseCaseParams)) {
            return false;
        }
        QueryPurchaseHistoryUseCaseParams queryPurchaseHistoryUseCaseParams = (QueryPurchaseHistoryUseCaseParams) obj;
        return t.c(this.dateProvider, queryPurchaseHistoryUseCaseParams.dateProvider) && t.c(this.diagnosticsTrackerIfEnabled, queryPurchaseHistoryUseCaseParams.diagnosticsTrackerIfEnabled) && t.c(this.productType, queryPurchaseHistoryUseCaseParams.productType) && this.appInBackground == queryPurchaseHistoryUseCaseParams.appInBackground;
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
        return ((((hashCode + (diagnosticsTracker == null ? 0 : diagnosticsTracker.hashCode())) * 31) + this.productType.hashCode()) * 31) + Boolean.hashCode(this.appInBackground);
    }

    public String toString() {
        return "QueryPurchaseHistoryUseCaseParams(dateProvider=" + this.dateProvider + ", diagnosticsTrackerIfEnabled=" + this.diagnosticsTrackerIfEnabled + ", productType=" + this.productType + ", appInBackground=" + this.appInBackground + ')';
    }

    public /* synthetic */ QueryPurchaseHistoryUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, String str, boolean z, int i, k kVar) {
        this((i & 1) != 0 ? new DefaultDateProvider() : dateProvider, diagnosticsTracker, str, z);
    }
}

package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class QueryPurchasesUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;

    public QueryPurchasesUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z) {
        t.g(dateProvider, "dateProvider");
        this.dateProvider = dateProvider;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.appInBackground = z;
    }

    public static /* synthetic */ QueryPurchasesUseCaseParams copy$default(QueryPurchasesUseCaseParams queryPurchasesUseCaseParams, DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dateProvider = queryPurchasesUseCaseParams.dateProvider;
        }
        if ((i & 2) != 0) {
            diagnosticsTracker = queryPurchasesUseCaseParams.diagnosticsTrackerIfEnabled;
        }
        if ((i & 4) != 0) {
            z = queryPurchasesUseCaseParams.appInBackground;
        }
        return queryPurchasesUseCaseParams.copy(dateProvider, diagnosticsTracker, z);
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

    public final QueryPurchasesUseCaseParams copy(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z) {
        t.g(dateProvider, "dateProvider");
        return new QueryPurchasesUseCaseParams(dateProvider, diagnosticsTracker, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryPurchasesUseCaseParams)) {
            return false;
        }
        QueryPurchasesUseCaseParams queryPurchasesUseCaseParams = (QueryPurchasesUseCaseParams) obj;
        return t.c(this.dateProvider, queryPurchasesUseCaseParams.dateProvider) && t.c(this.diagnosticsTrackerIfEnabled, queryPurchasesUseCaseParams.diagnosticsTrackerIfEnabled) && this.appInBackground == queryPurchasesUseCaseParams.appInBackground;
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

    public int hashCode() {
        int hashCode = this.dateProvider.hashCode() * 31;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        return ((hashCode + (diagnosticsTracker == null ? 0 : diagnosticsTracker.hashCode())) * 31) + Boolean.hashCode(this.appInBackground);
    }

    public String toString() {
        return "QueryPurchasesUseCaseParams(dateProvider=" + this.dateProvider + ", diagnosticsTrackerIfEnabled=" + this.diagnosticsTrackerIfEnabled + ", appInBackground=" + this.appInBackground + ')';
    }

    public /* synthetic */ QueryPurchasesUseCaseParams(DateProvider dateProvider, DiagnosticsTracker diagnosticsTracker, boolean z, int i, k kVar) {
        this((i & 1) != 0 ? new DefaultDateProvider() : dateProvider, diagnosticsTracker, z);
    }
}

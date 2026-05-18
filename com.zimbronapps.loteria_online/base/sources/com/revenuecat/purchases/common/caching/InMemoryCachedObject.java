package com.revenuecat.purchases.common.caching;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import java.util.Date;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class InMemoryCachedObject {
    private Object cachedInstance;
    private final DateProvider dateProvider;
    private Date lastUpdatedAt;

    public InMemoryCachedObject() {
        this(null, null, 3, null);
    }

    public final void cacheInstance(Object obj) {
        this.cachedInstance = obj;
        this.lastUpdatedAt = this.dateProvider.getNow();
    }

    public final void clearCache() {
        clearCacheTimestamp();
        this.cachedInstance = null;
    }

    public final void clearCacheTimestamp() {
        this.lastUpdatedAt = null;
    }

    public final Object getCachedInstance() {
        return this.cachedInstance;
    }

    public final Date getLastUpdatedAt$purchases_defaultsBc8Release() {
        return this.lastUpdatedAt;
    }

    public final void setCachedInstance(Object obj) {
        this.cachedInstance = obj;
    }

    public final void setLastUpdatedAt$purchases_defaultsBc8Release(Date date) {
        this.lastUpdatedAt = date;
    }

    public final void updateCacheTimestamp(Date date) {
        t.g(date, "date");
        this.lastUpdatedAt = date;
    }

    public InMemoryCachedObject(Date date, DateProvider dateProvider) {
        t.g(dateProvider, "dateProvider");
        this.lastUpdatedAt = date;
        this.dateProvider = dateProvider;
    }

    public /* synthetic */ InMemoryCachedObject(Date date, DateProvider dateProvider, int i, k kVar) {
        this((i & 1) != 0 ? null : date, (i & 2) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}

package com.revenuecat.purchases.common;

import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BackgroundAwareCallbackCacheKey {
    private final boolean appInBackground;
    private final List cacheKey;

    public BackgroundAwareCallbackCacheKey(List list, boolean z) {
        t.g(list, "cacheKey");
        this.cacheKey = list;
        this.appInBackground = z;
    }

    public static /* synthetic */ BackgroundAwareCallbackCacheKey copy$default(BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = backgroundAwareCallbackCacheKey.cacheKey;
        }
        if ((i & 2) != 0) {
            z = backgroundAwareCallbackCacheKey.appInBackground;
        }
        return backgroundAwareCallbackCacheKey.copy(list, z);
    }

    public final List component1() {
        return this.cacheKey;
    }

    public final boolean component2() {
        return this.appInBackground;
    }

    public final BackgroundAwareCallbackCacheKey copy(List list, boolean z) {
        t.g(list, "cacheKey");
        return new BackgroundAwareCallbackCacheKey(list, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundAwareCallbackCacheKey)) {
            return false;
        }
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = (BackgroundAwareCallbackCacheKey) obj;
        return t.c(this.cacheKey, backgroundAwareCallbackCacheKey.cacheKey) && this.appInBackground == backgroundAwareCallbackCacheKey.appInBackground;
    }

    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final List getCacheKey() {
        return this.cacheKey;
    }

    public int hashCode() {
        return (this.cacheKey.hashCode() * 31) + Boolean.hashCode(this.appInBackground);
    }

    public String toString() {
        return "BackgroundAwareCallbackCacheKey(cacheKey=" + this.cacheKey + ", appInBackground=" + this.appInBackground + ')';
    }
}

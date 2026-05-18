package com.revenuecat.purchases;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum CacheFetchPolicy {
    CACHE_ONLY,
    FETCH_CURRENT,
    NOT_STALE_CACHED_OR_CURRENT,
    CACHED_OR_FETCHED;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final CacheFetchPolicy default() {
            return CacheFetchPolicy.CACHED_OR_FETCHED;
        }

        private Companion() {
        }
    }
}

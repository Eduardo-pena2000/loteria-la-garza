package com.revenuecat.purchases.common.caching;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import rb.d;
import sb.h;
import sb.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TokenCacheEntry {
    public static final Companion Companion = new Companion(null);
    private final Boolean isAutoRenewing;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return TokenCacheEntry$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TokenCacheEntry() {
        this((Boolean) null, 1, (k) null);
    }

    public static /* synthetic */ TokenCacheEntry copy$default(TokenCacheEntry tokenCacheEntry, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = tokenCacheEntry.isAutoRenewing;
        }
        return tokenCacheEntry.copy(bool);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(TokenCacheEntry tokenCacheEntry, d dVar, e eVar) {
        if (!dVar.e(eVar, 0) && tokenCacheEntry.isAutoRenewing == null) {
            return;
        }
        dVar.j(eVar, 0, h.a, tokenCacheEntry.isAutoRenewing);
    }

    public final Boolean component1() {
        return this.isAutoRenewing;
    }

    public final TokenCacheEntry copy(Boolean bool) {
        return new TokenCacheEntry(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TokenCacheEntry) && t.c(this.isAutoRenewing, ((TokenCacheEntry) obj).isAutoRenewing);
    }

    public int hashCode() {
        Boolean bool = this.isAutoRenewing;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        return "TokenCacheEntry(isAutoRenewing=" + this.isAutoRenewing + ')';
    }

    @Ca.e
    public /* synthetic */ TokenCacheEntry(int i, Boolean bool, t0 t0Var) {
        if ((i & 1) == 0) {
            this.isAutoRenewing = null;
        } else {
            this.isAutoRenewing = bool;
        }
    }

    public TokenCacheEntry(Boolean bool) {
        this.isAutoRenewing = bool;
    }

    public /* synthetic */ TokenCacheEntry(Boolean bool, int i, k kVar) {
        this((i & 1) != 0 ? null : bool);
    }
}

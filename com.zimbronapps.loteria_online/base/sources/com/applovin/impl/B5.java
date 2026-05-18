package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b5 {
    private final com.applovin.impl.sdk.k a;
    private final Map b = new HashMap();
    private final Object c = new Object();

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    public static class c {
        private final c5 a;
        private final long b;
        private final long c;

        public /* synthetic */ c(c5 c5Var, long j, a aVar) {
            this(c5Var, j);
        }

        public static /* synthetic */ c5 b(c cVar) {
            return cVar.a;
        }

        private boolean d() {
            return SystemClock.elapsedRealtime() - this.c > this.b;
        }

        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public c5 c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a((Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            c5 c = c();
            c5 c2 = cVar.c();
            return c != null ? c.equals(c2) : c2 == null;
        }

        public int hashCode() {
            long b = b();
            long a = a();
            c5 c = c();
            return ((((((int) (b ^ (b >>> 32))) + 59) * 59) + ((int) ((a >>> 32) ^ a))) * 59) + (c == null ? 43 : c.hashCode());
        }

        public String toString() {
            return "SignalCacheManager.SignalWrapper(signal=" + c() + ", expirationTimeMillis=" + b() + ", cacheTimestampMillis=" + a() + ")";
        }

        private c(c5 c5Var, long j) {
            this.a = c5Var;
            this.b = j;
            this.c = SystemClock.elapsedRealtime();
        }

        public static /* synthetic */ boolean a(c cVar) {
            return cVar.d();
        }

        public long b() {
            return this.b;
        }

        public long a() {
            return this.c;
        }
    }

    public b5(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    public void a(c5 c5Var, d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        if (c5Var == null) {
            return;
        }
        long v = d5Var.v();
        if (v <= 0) {
            return;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("SignalCacheManager", "Caching signal for: " + d5Var);
        }
        String a2 = a(d5Var, str, maxAdFormat);
        c cVar = new c(c5Var, v, null);
        synchronized (this.c) {
            this.b.put(a2, cVar);
        }
    }

    public c5 b(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        String a2 = a(d5Var, str, maxAdFormat);
        synchronized (this.c) {
            try {
                c cVar = (c) this.b.get(a2);
                if (cVar == null) {
                    return null;
                }
                if (c.a(cVar)) {
                    this.b.remove(a2);
                    return null;
                }
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().a("SignalCacheManager", "Returning cached signal for: " + d5Var);
                }
                return c.b(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String a(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        String c2 = d5Var.c();
        int i = a.a[d5Var.t().ordinal()];
        if (i == 1) {
            return c2 + "_" + maxAdFormat.getLabel();
        }
        if (i != 2) {
            return c2;
        }
        return c2 + "_" + str;
    }
}

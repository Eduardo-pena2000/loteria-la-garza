package com.applovin.impl.sdk;

import com.applovin.impl.y2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class p {
    private final o a;
    private final Map b = new HashMap(5);
    private final Object c = new Object();
    private final Map d = Collections.synchronizedMap(new HashMap(5));
    private final Map e = Collections.synchronizedMap(new HashMap(5));

    public static class a {
        private final String a;
        private final String b;
        private final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public String b() {
            return this.a;
        }

        public String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String b = b();
            String b2 = aVar.b();
            if (b != null ? !b.equals(b2) : b2 != null) {
                return false;
            }
            String a = a();
            String a2 = aVar.a();
            if (a != null ? !a.equals(a2) : a2 != null) {
                return false;
            }
            String c = c();
            String c2 = aVar.c();
            return c != null ? c.equals(c2) : c2 == null;
        }

        public int hashCode() {
            String b = b();
            int hashCode = b == null ? 43 : b.hashCode();
            String a = a();
            int hashCode2 = ((hashCode + 59) * 59) + (a == null ? 43 : a.hashCode());
            String c = c();
            return (hashCode2 * 59) + (c != null ? c.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ")";
        }

        public String a() {
            return this.b;
        }
    }

    public p(k kVar) {
        this.a = kVar.O();
    }

    public String a(String str) {
        return (String) this.e.get(str);
    }

    public void b(y2 y2Var) {
        this.d.put(y2Var.getAdUnitId(), y2Var.Q());
    }

    public void c(y2 y2Var) {
        synchronized (this.c) {
            try {
                if (o.a()) {
                    this.a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + y2Var);
                }
                this.b.put(y2Var.getAdUnitId(), new a(y2Var.B(), y2Var.c(), y2Var.getNetworkName()));
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e.put(y2Var.getAdUnitId(), y2Var.Q());
    }

    public void a(y2 y2Var) {
        synchronized (this.c) {
            try {
                String adUnitId = y2Var.getAdUnitId();
                a aVar = (a) this.b.get(adUnitId);
                if (aVar == null) {
                    if (o.a()) {
                        this.a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                    }
                    return;
                }
                if (y2Var.B().equals(aVar.b())) {
                    if (o.a()) {
                        this.a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                    }
                    this.b.remove(adUnitId);
                } else if (o.a()) {
                    this.a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + y2Var + " , since it could have already been updated with a new ad: " + aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String b(String str) {
        return (String) this.d.get(str);
    }

    public a c(String str) {
        a aVar;
        synchronized (this.c) {
            aVar = (a) this.b.get(str);
        }
        return aVar;
    }
}

package com.applovin.impl.sdk;

import android.app.ActivityManager;
import com.applovin.impl.n7;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class n {
    private static final a l = new a();
    private final k a;
    private long c;
    private Long d;
    private long e;
    private long h;
    private Object i;
    private final AtomicBoolean b = new AtomicBoolean();
    private final Object f = new Object();
    private final AtomicBoolean g = new AtomicBoolean();
    private final Map j = new HashMap();
    private final Object k = new Object();

    public static class a {
        private long a = -1;
        private int b;

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public int hashCode() {
            long b = b();
            return ((((int) (b ^ (b >>> 32))) + 59) * 59) + a();
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        public static /* synthetic */ long a(a aVar, long j) {
            aVar.a = j;
            return j;
        }

        public static /* synthetic */ int a(a aVar) {
            int i = aVar.b;
            aVar.b = i + 1;
            return i;
        }

        public int a() {
            return this.b;
        }
    }

    public n(k kVar) {
        this.a = kVar;
    }

    public static /* synthetic */ void a(n nVar, Long l2, Object obj) {
        nVar.a(l2, obj);
    }

    public static /* synthetic */ void b(n nVar, Long l2) {
        nVar.a(l2);
    }

    public Long c() {
        return this.d;
    }

    public boolean d() {
        return this.b.get();
    }

    public boolean e() {
        return this.g.get();
    }

    public void a(boolean z) {
        synchronized (this.f) {
            try {
                this.g.set(z);
                if (z) {
                    this.h = System.currentTimeMillis();
                    this.a.O();
                    if (o.a()) {
                        this.a.O().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.h);
                    }
                    ActivityManager.MemoryInfo a2 = n7.a((ActivityManager) k.o().getSystemService("activity"));
                    if (a2 != null) {
                        this.e = a2.availMem;
                    }
                    Long l2 = (Long) this.a.a(x4.J1);
                    if (l2.longValue() >= 0) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new L0(this, l2), l2.longValue());
                    }
                } else {
                    this.h = 0L;
                    this.a.O();
                    if (o.a()) {
                        this.a.O().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long b() {
        return this.c;
    }

    public void c(String str) {
        synchronized (this.k) {
            try {
                a aVar = (a) this.j.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.j.put(str, aVar);
                }
                a.a(aVar, System.currentTimeMillis());
                a.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Object obj) {
        if (!w3.a(obj) && this.b.compareAndSet(true, false)) {
            this.i = null;
            this.a.O();
            if (o.a()) {
                this.a.O().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.k) {
            aVar = (a) this.j.get(str);
            if (aVar == null) {
                aVar = l;
            }
        }
        return aVar;
    }

    private /* synthetic */ void a(Long l2) {
        if (e() && System.currentTimeMillis() - this.h >= l2.longValue()) {
            this.a.O();
            if (o.a()) {
                this.a.O().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.g.set(false);
        }
    }

    public Object a() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = com.applovin.impl.w3.a(r8)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.b
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L8e
            r7.i = r8
            long r0 = java.lang.System.currentTimeMillis()
            r7.c = r0
            com.applovin.impl.sdk.k r0 = r7.a
            r0.O()
            boolean r0 = com.applovin.impl.sdk.o.a()
            if (r0 == 0) goto L42
            com.applovin.impl.sdk.k r0 = r7.a
            com.applovin.impl.sdk.o r0 = r0.O()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting fullscreen ad displayed: "
            r1.append(r2)
            long r2 = r7.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FullScreenAdTracker"
            r0.a(r2, r1)
        L42:
            android.content.Context r0 = com.applovin.impl.sdk.k.o()
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            android.app.ActivityManager$MemoryInfo r0 = com.applovin.impl.n7.a(r0)
            r1 = 0
            if (r0 == 0) goto L68
            long r3 = r7.e
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L68
            long r5 = r0.availMem
            long r3 = r3 - r5
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r7.d = r0
            r7.e = r1
            goto L6b
        L68:
            r0 = 0
            r7.d = r0
        L6b:
            java.lang.String r0 = "com.applovin.fullscreen_ad_displayed"
            com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcastWithAdObject(r0, r8)
            com.applovin.impl.sdk.k r0 = r7.a
            com.applovin.impl.x4 r3 = com.applovin.impl.x4.K1
            java.lang.Object r0 = r0.a(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L8e
            com.applovin.impl.sdk.M0 r1 = new com.applovin.impl.sdk.M0
            r1.<init>(r7, r0, r8)
            long r2 = r0.longValue()
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(r1, r2)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.n.a(java.lang.Object):void");
    }

    private /* synthetic */ void a(Long l2, Object obj) {
        if (this.b.get() && System.currentTimeMillis() - this.c >= l2.longValue()) {
            this.a.O();
            if (o.a()) {
                this.a.O().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.k) {
            this.j.remove(str);
        }
    }
}

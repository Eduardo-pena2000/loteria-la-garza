package k3;

import P2.K;
import P2.t;
import R2.x;
import android.content.Context;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import k3.d;
import t7.r;
import t7.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i implements d, x {
    public static final r p = r.w(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final r q = r.w(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final r r = r.w(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final r s = r.w(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final r t = r.w(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final r u = r.w(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static i v;
    public final s a;
    public final d.a.a b;
    public final P2.c c;
    public final boolean d;
    public final q e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;
    public boolean n;
    public int o;

    public static final class b {
        public final Context a;
        public Map b;
        public int c;
        public P2.c d;
        public boolean e;

        public b(Context context) {
            this.a = context == null ? null : context.getApplicationContext();
            this.b = b(K.R(context));
            this.c = 2000;
            this.d = P2.c.a;
            this.e = true;
        }

        public static Map b(String str) {
            int[] k = i.k(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            r rVar = i.p;
            hashMap.put(2, (Long) rVar.get(k[0]));
            hashMap.put(3, (Long) i.q.get(k[1]));
            hashMap.put(4, (Long) i.r.get(k[2]));
            hashMap.put(5, (Long) i.s.get(k[3]));
            hashMap.put(10, (Long) i.t.get(k[4]));
            hashMap.put(9, (Long) i.u.get(k[5]));
            hashMap.put(7, (Long) rVar.get(k[0]));
            return hashMap;
        }

        public i a() {
            return new i(this.a, this.b, this.c, this.d, this.e, null);
        }
    }

    public /* synthetic */ i(Context context, Map map, int i, P2.c cVar, boolean z, a aVar) {
        this(context, map, i, cVar, z);
    }

    public static /* synthetic */ void j(i iVar, int i) {
        iVar.q(i);
    }

    public static /* synthetic */ int[] k(String str) {
        return l(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] l(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.i.l(java.lang.String):int[]");
    }

    public static synchronized i n(Context context) {
        i iVar;
        synchronized (i.class) {
            try {
                if (v == null) {
                    v = new b(context).a();
                }
                iVar = v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public static boolean o(R2.j jVar, boolean z) {
        return z && !jVar.d(8);
    }

    public synchronized void a(R2.f fVar, R2.j jVar, boolean z) {
        try {
            if (o(jVar, z)) {
                if (this.f == 0) {
                    this.g = this.c.b();
                }
                this.f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void c(R2.f fVar, R2.j jVar, boolean z) {
        try {
            if (o(jVar, z)) {
                P2.a.f(this.f > 0);
                long b2 = this.c.b();
                int i = (int) (b2 - this.g);
                this.i += i;
                long j = this.j;
                long j2 = this.h;
                this.j = j + j2;
                if (i > 0) {
                    this.e.c((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                    if (this.i >= 2000 || this.j >= 524288) {
                        this.k = (long) this.e.f(0.5f);
                    }
                    p(i, this.h, this.k);
                    this.g = b2;
                    this.h = 0L;
                }
                this.f--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long e() {
        return this.k;
    }

    public void f(d.a aVar) {
        this.b.e(aVar);
    }

    public void g(Handler handler, d.a aVar) {
        P2.a.e(handler);
        P2.a.e(aVar);
        this.b.b(handler, aVar);
    }

    public synchronized void h(R2.f fVar, R2.j jVar, boolean z, int i) {
        if (o(jVar, z)) {
            this.h += i;
        }
    }

    public final long m(int i) {
        Long l = (Long) this.a.get(Integer.valueOf(i));
        if (l == null) {
            l = (Long) this.a.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public final void p(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.l) {
            return;
        }
        this.l = j2;
        this.b.c(i, j, j2);
    }

    public final synchronized void q(int i) {
        int i2 = this.m;
        if (i2 == 0 || this.d) {
            if (this.n) {
                i = this.o;
            }
            if (i2 == i) {
                return;
            }
            this.m = i;
            if (i != 1 && i != 0 && i != 8) {
                this.k = m(i);
                long b2 = this.c.b();
                p(this.f > 0 ? (int) (b2 - this.g) : 0, this.h, this.k);
                this.g = b2;
                this.h = 0L;
                this.j = 0L;
                this.i = 0L;
                this.e.i();
            }
        }
    }

    public i(Context context, Map map, int i, P2.c cVar, boolean z) {
        this.a = s.e(map);
        this.b = new d.a.a();
        this.e = new q(i);
        this.c = cVar;
        this.d = z;
        if (context == null) {
            this.m = 0;
            this.k = m(0);
            return;
        }
        t d = t.d(context);
        int f = d.f();
        this.m = f;
        this.k = m(f);
        d.i(new h(this));
    }

    public x d() {
        return this;
    }

    public void i(R2.f fVar, R2.j jVar, boolean z) {
    }
}

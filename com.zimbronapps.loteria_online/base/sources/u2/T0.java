package U2;

import M2.G;
import U2.b;
import U2.w1;
import android.util.Base64;
import g3.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t0 implements w1 {
    public static final s7.s i = new s0();
    public static final Random j = new Random();
    public final G.c a;
    public final G.b b;
    public final HashMap c;
    public final s7.s d;
    public w1.a e;
    public M2.G f;
    public String g;
    public long h;

    public final class a {
        public final String a;
        public int b;
        public long c;
        public w.b d;
        public boolean e;
        public boolean f;

        public a(String str, int i, w.b bVar) {
            this.a = str;
            this.b = i;
            this.c = bVar == null ? -1L : bVar.d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.d = bVar;
        }

        public static /* synthetic */ String a(a aVar) {
            return aVar.a;
        }

        public static /* synthetic */ long b(a aVar) {
            return aVar.c;
        }

        public static /* synthetic */ int c(a aVar) {
            return aVar.b;
        }

        public static /* synthetic */ boolean d(a aVar) {
            return aVar.e;
        }

        public static /* synthetic */ boolean e(a aVar, boolean z) {
            aVar.e = z;
            return z;
        }

        public static /* synthetic */ boolean f(a aVar) {
            return aVar.f;
        }

        public static /* synthetic */ boolean g(a aVar, boolean z) {
            aVar.f = z;
            return z;
        }

        public static /* synthetic */ w.b h(a aVar) {
            return aVar.d;
        }

        public boolean i(int i, w.b bVar) {
            if (bVar == null) {
                return i == this.b;
            }
            w.b bVar2 = this.d;
            return bVar2 == null ? !bVar.b() && bVar.d == this.c : bVar.d == bVar2.d && bVar.b == bVar2.b && bVar.c == bVar2.c;
        }

        public boolean j(b.a aVar) {
            w.b bVar = aVar.d;
            if (bVar == null) {
                return this.b != aVar.c;
            }
            long j = this.c;
            if (j == -1) {
                return false;
            }
            if (bVar.d > j) {
                return true;
            }
            if (this.d == null) {
                return false;
            }
            int b = aVar.b.b(bVar.a);
            int b2 = aVar.b.b(this.d.a);
            w.b bVar2 = aVar.d;
            if (bVar2.d < this.d.d || b < b2) {
                return false;
            }
            if (b > b2) {
                return true;
            }
            if (!bVar2.b()) {
                int i = aVar.d.e;
                return i == -1 || i > this.d.b;
            }
            w.b bVar3 = aVar.d;
            int i2 = bVar3.b;
            int i3 = bVar3.c;
            w.b bVar4 = this.d;
            int i4 = bVar4.b;
            if (i2 <= i4) {
                return i2 == i4 && i3 > bVar4.c;
            }
            return true;
        }

        public void k(int i, w.b bVar) {
            if (this.c != -1 || i != this.b || bVar == null || bVar.d < t0.i(t0.this)) {
                return;
            }
            this.c = bVar.d;
        }

        public final int l(M2.G g, M2.G g2, int i) {
            if (i >= g.p()) {
                if (i < g2.p()) {
                    return i;
                }
                return -1;
            }
            g.n(i, t0.j(t0.this));
            for (int i2 = t0.j(t0.this).n; i2 <= t0.j(t0.this).o; i2++) {
                int b = g2.b(g.m(i2));
                if (b != -1) {
                    return g2.f(b, t0.k(t0.this)).c;
                }
            }
            return -1;
        }

        public boolean m(M2.G g, M2.G g2) {
            int l = l(g, g2, this.b);
            this.b = l;
            if (l == -1) {
                return false;
            }
            w.b bVar = this.d;
            return bVar == null || g2.b(bVar.a) != -1;
        }
    }

    public t0() {
        this(i);
    }

    public static /* synthetic */ String h() {
        return m();
    }

    public static /* synthetic */ long i(t0 t0Var) {
        return t0Var.n();
    }

    public static /* synthetic */ G.c j(t0 t0Var) {
        return t0Var.a;
    }

    public static /* synthetic */ G.b k(t0 t0Var) {
        return t0Var.b;
    }

    public static String m() {
        byte[] bArr = new byte[12];
        j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    public synchronized String a() {
        return this.g;
    }

    public synchronized void b(b.a aVar, int i2) {
        try {
            P2.a.e(this.e);
            boolean z = i2 == 0;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.j(aVar)) {
                    it.remove();
                    if (a.d(aVar2)) {
                        boolean equals = a.a(aVar2).equals(this.g);
                        boolean z2 = z && equals && a.f(aVar2);
                        if (equals) {
                            l(aVar2);
                        }
                        this.e.c(aVar, a.a(aVar2), z2);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void c(b.a aVar) {
        w1.a aVar2;
        try {
            String str = this.g;
            if (str != null) {
                l((a) P2.a.e((a) this.c.get(str)));
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                a aVar3 = (a) it.next();
                it.remove();
                if (a.d(aVar3) && (aVar2 = this.e) != null) {
                    aVar2.c(aVar, a.a(aVar3), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String d(M2.G g, w.b bVar) {
        return a.a(o(g.h(bVar.a, this.b).c, bVar));
    }

    public void e(w1.a aVar) {
        this.e = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00de A[Catch: all -> 0x0044, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x0014, B:11:0x0018, B:16:0x0024, B:18:0x0030, B:20:0x003a, B:24:0x0047, B:26:0x0053, B:27:0x0059, B:29:0x005e, B:31:0x0064, B:33:0x007d, B:34:0x00d8, B:36:0x00de, B:37:0x00f4, B:39:0x0100, B:41:0x0106), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void f(U2.b.a r25) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.t0.f(U2.b$a):void");
    }

    public synchronized void g(b.a aVar) {
        try {
            P2.a.e(this.e);
            M2.G g = this.f;
            this.f = aVar.b;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (!aVar2.m(g, this.f) || aVar2.j(aVar)) {
                    it.remove();
                    if (a.d(aVar2)) {
                        if (a.a(aVar2).equals(this.g)) {
                            l(aVar2);
                        }
                        this.e.c(aVar, a.a(aVar2), false);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l(a aVar) {
        if (a.b(aVar) != -1) {
            this.h = a.b(aVar);
        }
        this.g = null;
    }

    public final long n() {
        a aVar = (a) this.c.get(this.g);
        return (aVar == null || a.b(aVar) == -1) ? this.h + 1 : a.b(aVar);
    }

    public final a o(int i2, w.b bVar) {
        a aVar = null;
        long j2 = Long.MAX_VALUE;
        for (a aVar2 : this.c.values()) {
            aVar2.k(i2, bVar);
            if (aVar2.i(i2, bVar)) {
                long b = a.b(aVar2);
                if (b == -1 || b < j2) {
                    aVar = aVar2;
                    j2 = b;
                } else if (b == j2 && a.h((a) P2.K.i(aVar)) != null && a.h(aVar2) != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.d.get();
        a aVar3 = new a(str, i2, bVar);
        this.c.put(str, aVar3);
        return aVar3;
    }

    public final void p(b.a aVar) {
        if (aVar.b.q()) {
            String str = this.g;
            if (str != null) {
                l((a) P2.a.e((a) this.c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = (a) this.c.get(this.g);
        a o = o(aVar.c, aVar.d);
        this.g = a.a(o);
        f(aVar);
        w.b bVar = aVar.d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && a.b(aVar2) == aVar.d.d && a.h(aVar2) != null && a.h(aVar2).b == aVar.d.b && a.h(aVar2).c == aVar.d.c) {
            return;
        }
        w.b bVar2 = aVar.d;
        this.e.U(aVar, a.a(o(aVar.c, new w.b(bVar2.a, bVar2.d))), a.a(o));
    }

    public t0(s7.s sVar) {
        this.d = sVar;
        this.a = new G.c();
        this.b = new G.b();
        this.c = new HashMap();
        this.f = M2.G.a;
        this.h = -1L;
    }
}

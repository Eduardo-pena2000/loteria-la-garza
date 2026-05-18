package androidx.media3.exoplayer.dash;

import M2.i;
import M2.q;
import M2.x;
import P2.K;
import P2.z;
import T2.u0;
import android.os.Handler;
import android.os.Message;
import h3.e;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements Handler.Callback {
    public final k3.b a;
    public final b b;
    public X2.c f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final TreeMap e = new TreeMap();
    public final Handler d = K.B(this);
    public final z3.b c = new z3.b();

    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public interface b {
        void a(long j);

        void b();
    }

    public final class c implements O {
        public final g3.O a;
        public final u0 b = new u0();
        public final x3.b c = new x3.b();
        public long d = -9223372036854775807L;

        public c(k3.b bVar) {
            this.a = g3.O.l(bVar);
        }

        public void a(long j, int i, int i2, int i3, O.a aVar) {
            this.a.a(j, i, i2, i3, aVar);
            l();
        }

        public void b(q qVar) {
            this.a.b(qVar);
        }

        public void d(z zVar, int i, int i2) {
            this.a.f(zVar, i);
        }

        public int e(i iVar, int i, boolean z, int i2) {
            return this.a.c(iVar, i, z);
        }

        public final x3.b g() {
            this.c.f();
            if (this.a.T(this.b, this.c, 0, false) != -4) {
                return null;
            }
            this.c.q();
            return this.c;
        }

        public boolean h(long j) {
            return d.this.j(j);
        }

        public void i(e eVar) {
            long j = this.d;
            if (j == -9223372036854775807L || eVar.h > j) {
                this.d = eVar.h;
            }
            d.this.m(eVar);
        }

        public boolean j(e eVar) {
            long j = this.d;
            return d.this.n(j != -9223372036854775807L && j < eVar.g);
        }

        public final void k(long j, long j2) {
            d.d(d.this).sendMessage(d.d(d.this).obtainMessage(1, new a(j, j2)));
        }

        public final void l() {
            while (this.a.L(false)) {
                x3.b g = g();
                if (g != null) {
                    long j = g.f;
                    x a = d.a(d.this).a(g);
                    if (a != null) {
                        z3.a aVar = (z3.a) a.i(0);
                        if (d.b(aVar.a, aVar.b)) {
                            m(j, aVar);
                        }
                    }
                }
            }
            this.a.s();
        }

        public final void m(long j, z3.a aVar) {
            long c = d.c(aVar);
            if (c == -9223372036854775807L) {
                return;
            }
            k(j, c);
        }

        public void n() {
            this.a.U();
        }
    }

    public d(X2.c cVar, b bVar, k3.b bVar2) {
        this.f = cVar;
        this.b = bVar;
        this.a = bVar2;
    }

    public static /* synthetic */ z3.b a(d dVar) {
        return dVar.c;
    }

    public static /* synthetic */ boolean b(String str, String str2) {
        return h(str, str2);
    }

    public static /* synthetic */ long c(z3.a aVar) {
        return f(aVar);
    }

    public static /* synthetic */ Handler d(d dVar) {
        return dVar.d;
    }

    public static long f(z3.a aVar) {
        try {
            return K.R0(K.H(aVar.e));
        } catch (M2.z unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    public final Map.Entry e(long j) {
        return this.e.ceilingEntry(Long.valueOf(j));
    }

    public final void g(long j, long j2) {
        Long l = (Long) this.e.get(Long.valueOf(j2));
        if (l == null) {
            this.e.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.e.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    public boolean handleMessage(Message message) {
        if (this.j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.a, aVar.b);
        return true;
    }

    public final void i() {
        if (this.h) {
            this.i = true;
            this.h = false;
            this.b.b();
        }
    }

    public boolean j(long j) {
        X2.c cVar = this.f;
        boolean z = false;
        if (!cVar.d) {
            return false;
        }
        if (this.i) {
            return true;
        }
        Map.Entry e = e(cVar.h);
        if (e != null && ((Long) e.getValue()).longValue() < j) {
            this.g = ((Long) e.getKey()).longValue();
            l();
            z = true;
        }
        if (z) {
            i();
        }
        return z;
    }

    public c k() {
        return new c(this.a);
    }

    public final void l() {
        this.b.a(this.g);
    }

    public void m(e eVar) {
        this.h = true;
    }

    public boolean n(boolean z) {
        if (!this.f.d) {
            return false;
        }
        if (this.i) {
            return true;
        }
        if (!z) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.j = true;
        this.d.removeCallbacksAndMessages((Object) null);
    }

    public final void p() {
        Iterator it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f.h) {
                it.remove();
            }
        }
    }

    public void q(X2.c cVar) {
        this.i = false;
        this.g = -9223372036854775807L;
        this.f = cVar;
        p();
    }
}

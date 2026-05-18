package P0;

import android.os.Parcel;
import android.util.Base64;
import d1.H;
import d1.I;
import n1.v;
import n1.x;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x0 {
    public Parcel a = Parcel.obtain();

    public final void a(byte b) {
        this.a.writeByte(b);
    }

    public final void b(float f) {
        this.a.writeFloat(f);
    }

    public final void c(int i) {
        this.a.writeInt(i);
    }

    public final void d(Z0.I0 i0) {
        long g = i0.g();
        r0.a aVar = v0.r0.b;
        if (!v0.r0.s(g, aVar.j())) {
            a((byte) 1);
            m(i0.g());
        }
        long k = i0.k();
        v.a aVar2 = n1.v.b;
        if (!n1.v.e(k, aVar2.a())) {
            a((byte) 2);
            j(i0.k());
        }
        d1.L n = i0.n();
        if (n != null) {
            a((byte) 3);
            e(n);
        }
        d1.H l = i0.l();
        if (l != null) {
            int i = l.i();
            a((byte) 4);
            o(i);
        }
        d1.I m = i0.m();
        if (m != null) {
            int m2 = m.m();
            a((byte) 5);
            l(m2);
        }
        String j = i0.j();
        if (j != null) {
            a((byte) 6);
            f(j);
        }
        if (!n1.v.e(i0.o(), aVar2.a())) {
            a((byte) 7);
            j(i0.o());
        }
        l1.a e = i0.e();
        if (e != null) {
            float h = e.h();
            a((byte) 8);
            k(h);
        }
        l1.q u = i0.u();
        if (u != null) {
            a((byte) 9);
            h(u);
        }
        if (!v0.r0.s(i0.d(), aVar.j())) {
            a((byte) 10);
            m(i0.d());
        }
        l1.k s = i0.s();
        if (s != null) {
            a((byte) 11);
            g(s);
        }
        v0.C1 r = i0.r();
        if (r != null) {
            a((byte) 12);
            i(r);
        }
    }

    public final void e(d1.L l) {
        c(l.o());
    }

    public final void f(String str) {
        this.a.writeString(str);
    }

    public final void g(l1.k kVar) {
        c(kVar.e());
    }

    public final void h(l1.q qVar) {
        b(qVar.b());
        b(qVar.c());
    }

    public final void i(v0.C1 c1) {
        m(c1.c());
        b(Float.intBitsToFloat((int) (c1.d() >> 32)));
        b(Float.intBitsToFloat((int) (c1.d() & 4294967295L)));
        b(c1.b());
    }

    public final void j(long j) {
        long g = n1.v.g(j);
        x.a aVar = n1.x.b;
        byte b = 0;
        if (!n1.x.g(g, aVar.c())) {
            if (n1.x.g(g, aVar.b())) {
                b = 1;
            } else if (n1.x.g(g, aVar.a())) {
                b = 2;
            }
        }
        a(b);
        if (n1.x.g(n1.v.g(j), aVar.c())) {
            return;
        }
        b(n1.v.h(j));
    }

    public final void k(float f) {
        b(f);
    }

    public final void l(int i) {
        I.a aVar = d1.I.b;
        byte b = 0;
        if (!d1.I.h(i, aVar.b())) {
            if (d1.I.h(i, aVar.a())) {
                b = 1;
            } else if (d1.I.h(i, aVar.d())) {
                b = 2;
            } else if (d1.I.h(i, aVar.c())) {
                b = 3;
            }
        }
        a(b);
    }

    public final void m(long j) {
        n(Ca.C.b(v0.H.b(j)));
    }

    public final void n(long j) {
        this.a.writeLong(j);
    }

    public final void o(int i) {
        H.a aVar = d1.H.b;
        byte b = 0;
        if (!d1.H.f(i, aVar.b()) && d1.H.f(i, aVar.a())) {
            b = 1;
        }
        a(b);
    }

    public final String p() {
        return Base64.encodeToString(this.a.marshall(), 0);
    }

    public final void q() {
        this.a.recycle();
        this.a = Parcel.obtain();
    }
}

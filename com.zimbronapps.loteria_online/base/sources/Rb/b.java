package rb;

import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import ob.j;
import ob.k;
import rb.d;
import rb.f;
import sb.W;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class b implements f, d {
    public final void A(qb.e descriptor, int i, byte b) {
        t.g(descriptor, "descriptor");
        if (G(descriptor, i)) {
            i(b);
        }
    }

    public final void B(qb.e descriptor, int i, boolean z) {
        t.g(descriptor, "descriptor");
        if (G(descriptor, i)) {
            u(z);
        }
    }

    public d C(qb.e eVar, int i) {
        return f.a.a(this, eVar, i);
    }

    public void D(int i) {
        I(Integer.valueOf(i));
    }

    public final void E(qb.e descriptor, int i, char c) {
        t.g(descriptor, "descriptor");
        if (G(descriptor, i)) {
            x(c);
        }
    }

    public void F(String value) {
        t.g(value, "value");
        I(value);
    }

    public boolean G(qb.e descriptor, int i) {
        t.g(descriptor, "descriptor");
        return true;
    }

    public void H(k kVar, Object obj) {
        f.a.c(this, kVar, obj);
    }

    public void I(Object value) {
        t.g(value, "value");
        throw new j("Non-serializable " + P.b(value.getClass()) + " is not supported by " + P.b(getClass()) + " encoder");
    }

    public d b(qb.e descriptor) {
        t.g(descriptor, "descriptor");
        return this;
    }

    public void c(qb.e descriptor) {
        t.g(descriptor, "descriptor");
    }

    public boolean e(qb.e eVar, int i) {
        return d.a.a(this, eVar, i);
    }

    public f f(qb.e descriptor) {
        t.g(descriptor, "descriptor");
        return this;
    }

    public void g(double d) {
        I(Double.valueOf(d));
    }

    public void h(qb.e enumDescriptor, int i) {
        t.g(enumDescriptor, "enumDescriptor");
        I(Integer.valueOf(i));
    }

    public void i(byte b) {
        I(Byte.valueOf(b));
    }

    public void j(qb.e descriptor, int i, k serializer, Object obj) {
        t.g(descriptor, "descriptor");
        t.g(serializer, "serializer");
        if (G(descriptor, i)) {
            H(serializer, obj);
        }
    }

    public void k(qb.e descriptor, int i, k serializer, Object obj) {
        t.g(descriptor, "descriptor");
        t.g(serializer, "serializer");
        if (G(descriptor, i)) {
            l(serializer, obj);
        }
    }

    public void l(k kVar, Object obj) {
        f.a.d(this, kVar, obj);
    }

    public final void m(qb.e descriptor, int i, short s) {
        t.g(descriptor, "descriptor");
        if (G(descriptor, i)) {
            t(s);
        }
    }

    public final void n(qb.e descriptor, int i, int i2) {
        t.g(descriptor, "descriptor");
        if (G(descriptor, i)) {
            D(i2);
        }
    }

    public final void o(qb.e descriptor, int i, long j) {
        t.g(descriptor, "descriptor");
        if (G(descriptor, i)) {
            p(j);
        }
    }

    public void p(long j) {
        I(Long.valueOf(j));
    }

    public final void q(qb.e descriptor, int i, double d) {
        t.g(descriptor, "descriptor");
        if (G(descriptor, i)) {
            g(d);
        }
    }

    public final f r(qb.e descriptor, int i) {
        t.g(descriptor, "descriptor");
        return G(descriptor, i) ? f(descriptor.g(i)) : W.a;
    }

    public void s() {
        throw new j("'null' is not supported by default");
    }

    public void t(short s) {
        I(Short.valueOf(s));
    }

    public void u(boolean z) {
        I(Boolean.valueOf(z));
    }

    public final void v(qb.e descriptor, int i, String value) {
        t.g(descriptor, "descriptor");
        t.g(value, "value");
        if (G(descriptor, i)) {
            F(value);
        }
    }

    public void w(float f) {
        I(Float.valueOf(f));
    }

    public void x(char c) {
        I(Character.valueOf(c));
    }

    public void y() {
        f.a.b(this);
    }

    public final void z(qb.e descriptor, int i, float f) {
        t.g(descriptor, "descriptor");
        if (G(descriptor, i)) {
            w(f);
        }
    }
}

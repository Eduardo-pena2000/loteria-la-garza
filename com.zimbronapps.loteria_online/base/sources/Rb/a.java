package rb;

import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import ob.j;
import rb.c;
import rb.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a implements e, c {
    public final Object A(qb.e descriptor, int i, ob.a deserializer, Object obj) {
        t.g(descriptor, "descriptor");
        t.g(deserializer, "deserializer");
        return (deserializer.getDescriptor().b() || E()) ? I(deserializer, obj) : k();
    }

    public String B() {
        Object J = J();
        t.e(J, "null cannot be cast to non-null type kotlin.String");
        return (String) J;
    }

    public final byte C(qb.e descriptor, int i) {
        t.g(descriptor, "descriptor");
        return H();
    }

    public e D(qb.e descriptor, int i) {
        t.g(descriptor, "descriptor");
        return f(descriptor.g(i));
    }

    public boolean E() {
        return true;
    }

    public final long F(qb.e descriptor, int i) {
        t.g(descriptor, "descriptor");
        return l();
    }

    public int G(qb.e eVar) {
        return c.a.a(this, eVar);
    }

    public abstract byte H();

    public Object I(ob.a deserializer, Object obj) {
        t.g(deserializer, "deserializer");
        return p(deserializer);
    }

    public Object J() {
        throw new j(P.b(getClass()) + " can't retrieve untyped values");
    }

    public c b(qb.e descriptor) {
        t.g(descriptor, "descriptor");
        return this;
    }

    public void c(qb.e descriptor) {
        t.g(descriptor, "descriptor");
    }

    public Object e(qb.e descriptor, int i, ob.a deserializer, Object obj) {
        t.g(descriptor, "descriptor");
        t.g(deserializer, "deserializer");
        return I(deserializer, obj);
    }

    public e f(qb.e descriptor) {
        t.g(descriptor, "descriptor");
        return this;
    }

    public final short g(qb.e descriptor, int i) {
        t.g(descriptor, "descriptor");
        return s();
    }

    public final int h(qb.e descriptor, int i) {
        t.g(descriptor, "descriptor");
        return j();
    }

    public abstract int j();

    public Void k() {
        return null;
    }

    public abstract long l();

    public boolean m() {
        return c.a.b(this);
    }

    public final double n(qb.e descriptor, int i) {
        t.g(descriptor, "descriptor");
        return u();
    }

    public final String o(qb.e descriptor, int i) {
        t.g(descriptor, "descriptor");
        return B();
    }

    public Object p(ob.a aVar) {
        return e.a.a(this, aVar);
    }

    public final boolean q(qb.e descriptor, int i) {
        t.g(descriptor, "descriptor");
        return w();
    }

    public final char r(qb.e descriptor, int i) {
        t.g(descriptor, "descriptor");
        return x();
    }

    public abstract short s();

    public float t() {
        Object J = J();
        t.e(J, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) J).floatValue();
    }

    public double u() {
        Object J = J();
        t.e(J, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) J).doubleValue();
    }

    public boolean w() {
        Object J = J();
        t.e(J, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) J).booleanValue();
    }

    public char x() {
        Object J = J();
        t.e(J, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) J).charValue();
    }

    public int y(qb.e enumDescriptor) {
        t.g(enumDescriptor, "enumDescriptor");
        Object J = J();
        t.e(J, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) J).intValue();
    }

    public final float z(qb.e descriptor, int i) {
        t.g(descriptor, "descriptor");
        return t();
    }
}

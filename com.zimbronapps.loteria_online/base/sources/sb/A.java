package sb;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a implements ob.b {
    public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
        this();
    }

    public static /* synthetic */ void i(a aVar, rb.c cVar, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        aVar.h(cVar, i, obj, z);
    }

    public abstract Object a();

    public abstract int b(Object obj);

    public abstract void c(Object obj, int i);

    public abstract Iterator d(Object obj);

    public Object deserialize(rb.e decoder) {
        kotlin.jvm.internal.t.g(decoder, "decoder");
        return f(decoder, null);
    }

    public abstract int e(Object obj);

    public final Object f(rb.e decoder, Object obj) {
        Object a;
        kotlin.jvm.internal.t.g(decoder, "decoder");
        if (obj == null || (a = k(obj)) == null) {
            a = a();
        }
        int b = b(a);
        rb.c b2 = decoder.b(getDescriptor());
        if (!b2.m()) {
            while (true) {
                int v = b2.v(getDescriptor());
                if (v == -1) {
                    break;
                }
                i(this, b2, b + v, a, false, 8, null);
            }
        } else {
            g(b2, a, b, j(b2, a));
        }
        b2.c(getDescriptor());
        return l(a);
    }

    public abstract void g(rb.c cVar, Object obj, int i, int i2);

    public abstract void h(rb.c cVar, int i, Object obj, boolean z);

    public final int j(rb.c cVar, Object obj) {
        int G = cVar.G(getDescriptor());
        c(obj, G);
        return G;
    }

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);

    public a() {
    }
}

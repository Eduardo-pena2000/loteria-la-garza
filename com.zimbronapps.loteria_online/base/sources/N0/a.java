package n0;

import Za.B;
import b0.h0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public final List a = new ArrayList();

    public final void a(h0 h0Var, Object obj) {
        c b = b(h0Var, obj);
        if (b != null) {
            this.a.add(b);
        }
    }

    public final c b(h0 h0Var, Object obj) {
        String g = h0Var.g();
        w e = g != null ? x.e(g) : null;
        if (e == null) {
            return null;
        }
        if (obj == null) {
            return new c(e, null);
        }
        ArrayList e2 = h0Var.e();
        if (e2 != null) {
            int size = e2.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = e2.get(i);
                if (kotlin.jvm.internal.t.c(obj2, obj)) {
                    break;
                }
                h(obj2);
            }
        }
        return new c(e, 0);
    }

    public final boolean c(h0 h0Var, Object obj) {
        ArrayList e = h0Var.e();
        boolean z = false;
        if (e == null) {
            if (!h0Var.b()) {
                a(h0Var, null);
                return true;
            }
            int d = h0Var.d();
            int c = h0Var.c();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int intValue = number.intValue();
                if ((d <= intValue && intValue < c) || (d == c && (obj instanceof Integer) && d == number.intValue())) {
                    z = true;
                }
                if (z) {
                    a(h0Var, null);
                }
            }
            return z;
        }
        int size = e.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = e.get(i);
            if (obj2 instanceof b0.b) {
                if (kotlin.jvm.internal.t.c(obj2, obj)) {
                    a(h0Var, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof h0)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (c((h0) obj2, obj)) {
                    a(h0Var, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    public abstract int d(b0.b bVar);

    public final boolean e(h0 h0Var) {
        String g = h0Var.g();
        return g != null && B.N(g, "C", false, 2, (Object) null);
    }

    public abstract h0 g(b0.b bVar);

    public final h0 h(Object obj) {
        if (obj instanceof b0.b) {
            return g((b0.b) obj);
        }
        if (obj instanceof h0) {
            return (h0) obj;
        }
        throw new IllegalStateException(("Unexpected child source info " + obj).toString());
    }

    public final List i() {
        return this.a;
    }

    public final void f(h0 h0Var, Object obj) {
    }
}

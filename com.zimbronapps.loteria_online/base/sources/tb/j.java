package tb;

import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import ub.b0;
import ub.e0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class j {
    public static final qb.e a = sb.G.a("kotlinx.serialization.json.JsonUnquotedLiteral", pb.a.F(U.a));

    public static final E a(Boolean bool) {
        return bool == null ? z.INSTANCE : new v(bool, false, null, 4, null);
    }

    public static final E b(Number number) {
        return number == null ? z.INSTANCE : new v(number, false, null, 4, null);
    }

    public static final E c(String str) {
        return str == null ? z.INSTANCE : new v(str, true, null, 4, null);
    }

    public static final Void d(i iVar, String str) {
        throw new IllegalArgumentException("Element " + P.b(iVar.getClass()) + " is not a " + str);
    }

    public static final Boolean e(E e) {
        kotlin.jvm.internal.t.g(e, "<this>");
        return e0.d(e.a());
    }

    public static final String f(E e) {
        kotlin.jvm.internal.t.g(e, "<this>");
        if (e instanceof z) {
            return null;
        }
        return e.a();
    }

    public static final double g(E e) {
        kotlin.jvm.internal.t.g(e, "<this>");
        return Double.parseDouble(e.a());
    }

    public static final Double h(E e) {
        kotlin.jvm.internal.t.g(e, "<this>");
        return Za.z.m(e.a());
    }

    public static final float i(E e) {
        kotlin.jvm.internal.t.g(e, "<this>");
        return Float.parseFloat(e.a());
    }

    public static final Float j(E e) {
        kotlin.jvm.internal.t.g(e, "<this>");
        return Za.z.n(e.a());
    }

    public static final int k(E e) {
        kotlin.jvm.internal.t.g(e, "<this>");
        try {
            long m = new b0(e.a()).m();
            if (-2147483648L <= m && m <= 2147483647L) {
                return (int) m;
            }
            throw new NumberFormatException(e.a() + " is not an Int");
        } catch (ub.C e2) {
            throw new NumberFormatException(e2.getMessage());
        }
    }

    public static final Integer l(E e) {
        Long l;
        kotlin.jvm.internal.t.g(e, "<this>");
        try {
            l = Long.valueOf(new b0(e.a()).m());
        } catch (ub.C unused) {
            l = null;
        }
        if (l != null) {
            long longValue = l.longValue();
            if (-2147483648L <= longValue && longValue <= 2147483647L) {
                return Integer.valueOf((int) longValue);
            }
        }
        return null;
    }

    public static final c m(i iVar) {
        kotlin.jvm.internal.t.g(iVar, "<this>");
        c cVar = iVar instanceof c ? (c) iVar : null;
        if (cVar != null) {
            return cVar;
        }
        d(iVar, "JsonArray");
        throw new Ca.i();
    }

    public static final C n(i iVar) {
        kotlin.jvm.internal.t.g(iVar, "<this>");
        C c = iVar instanceof C ? (C) iVar : null;
        if (c != null) {
            return c;
        }
        d(iVar, "JsonObject");
        throw new Ca.i();
    }

    public static final E o(i iVar) {
        kotlin.jvm.internal.t.g(iVar, "<this>");
        E e = iVar instanceof E ? (E) iVar : null;
        if (e != null) {
            return e;
        }
        d(iVar, "JsonPrimitive");
        throw new Ca.i();
    }

    public static final qb.e p() {
        return a;
    }

    public static final long q(E e) {
        kotlin.jvm.internal.t.g(e, "<this>");
        try {
            return new b0(e.a()).m();
        } catch (ub.C e2) {
            throw new NumberFormatException(e2.getMessage());
        }
    }

    public static final Long r(E e) {
        kotlin.jvm.internal.t.g(e, "<this>");
        try {
            return Long.valueOf(new b0(e.a()).m());
        } catch (ub.C unused) {
            return null;
        }
    }
}

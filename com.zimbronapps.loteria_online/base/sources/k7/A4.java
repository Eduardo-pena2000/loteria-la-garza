package k7;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class a4 {
    public static final a4 c = new a4(null, null, 100);
    public final EnumMap a;
    public final int b;

    public a4(Boolean bool, Boolean bool2, int i) {
        EnumMap enumMap = new EnumMap(Z3.class);
        this.a = enumMap;
        enumMap.put(Z3.AD_STORAGE, h(null));
        enumMap.put(Z3.ANALYTICS_STORAGE, h(null));
        this.b = i;
    }

    public static a4 a(X3 x3, X3 x32, int i) {
        EnumMap enumMap = new EnumMap(Z3.class);
        enumMap.put(Z3.AD_STORAGE, x3);
        enumMap.put(Z3.ANALYTICS_STORAGE, x32);
        return new a4(enumMap, -10);
    }

    public static String d(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static a4 e(Bundle bundle, int i) {
        if (bundle == null) {
            return new a4(null, null, i);
        }
        EnumMap enumMap = new EnumMap(Z3.class);
        for (Z3 z3 : Y3.STORAGE.b()) {
            enumMap.put(z3, g(bundle.getString(z3.a)));
        }
        return new a4(enumMap, i);
    }

    public static a4 f(String str, int i) {
        EnumMap enumMap = new EnumMap(Z3.class);
        Z3[] a = Y3.STORAGE.a();
        for (int i2 = 0; i2 < a.length; i2++) {
            String str2 = str == null ? "" : str;
            Z3 z3 = a[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(z3, j(str2.charAt(i3)));
            } else {
                enumMap.put(z3, X3.UNINITIALIZED);
            }
        }
        return new a4(enumMap, i);
    }

    public static X3 g(String str) {
        return str == null ? X3.UNINITIALIZED : str.equals("granted") ? X3.GRANTED : str.equals("denied") ? X3.DENIED : X3.UNINITIALIZED;
    }

    public static X3 h(Boolean bool) {
        return bool == null ? X3.UNINITIALIZED : bool.booleanValue() ? X3.GRANTED : X3.DENIED;
    }

    public static String i(X3 x3) {
        int ordinal = x3.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    public static X3 j(char c2) {
        return c2 != '+' ? c2 != '0' ? c2 != '1' ? X3.UNINITIALIZED : X3.GRANTED : X3.DENIED : X3.POLICY;
    }

    public static char m(X3 x3) {
        if (x3 == null) {
            return '-';
        }
        int ordinal = x3.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean u(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            if (((X3) it.next()) != X3.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        for (Z3 z3 : Y3.STORAGE.b()) {
            if (this.a.get(z3) != a4Var.a.get(z3)) {
                return false;
            }
        }
        return this.b == a4Var.b;
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int i = this.b * 17;
        while (it.hasNext()) {
            i = (i * 31) + ((X3) it.next()).hashCode();
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            k7.Y3 r1 = k7.Y3.STORAGE
            k7.Z3[] r1 = r1.a()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.a
            java.lang.Object r4 = r5.get(r4)
            k7.X3 r4 = (k7.X3) r4
            r5 = 45
            if (r4 == 0) goto L34
            int r4 = r4.ordinal()
            if (r4 == 0) goto L34
            r6 = 1
            if (r4 == r6) goto L32
            r6 = 2
            if (r4 == r6) goto L2f
            r6 = 3
            if (r4 == r6) goto L32
            goto L34
        L2f:
            r5 = 48
            goto L34
        L32:
            r5 = 49
        L34:
            r0.append(r5)
            int r3 = r3 + 1
            goto Lf
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.a4.k():java.lang.String");
    }

    public final String l() {
        StringBuilder sb = new StringBuilder("G1");
        for (Z3 z3 : Y3.STORAGE.a()) {
            sb.append(m((X3) this.a.get(z3)));
        }
        return sb.toString();
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.a.entrySet()) {
            String i = i((X3) entry.getValue());
            if (i != null) {
                bundle.putString(((Z3) entry.getKey()).a, i);
            }
        }
        return bundle;
    }

    public final boolean o(Z3 z3) {
        return ((X3) this.a.get(z3)) != X3.DENIED;
    }

    public final X3 p() {
        X3 x3 = (X3) this.a.get(Z3.AD_STORAGE);
        return x3 == null ? X3.UNINITIALIZED : x3;
    }

    public final X3 q() {
        X3 x3 = (X3) this.a.get(Z3.ANALYTICS_STORAGE);
        return x3 == null ? X3.UNINITIALIZED : x3;
    }

    public final boolean r(a4 a4Var) {
        EnumMap enumMap = this.a;
        for (Z3 z3 : (Z3[]) enumMap.keySet().toArray(new Z3[0])) {
            X3 x3 = (X3) enumMap.get(z3);
            X3 x32 = (X3) a4Var.a.get(z3);
            X3 x33 = X3.DENIED;
            if (x3 == x33 && x32 != x33) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k7.a4 s(k7.a4 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<k7.Z3> r1 = k7.Z3.class
            r0.<init>(r1)
            k7.Y3 r1 = k7.Y3.STORAGE
            k7.Z3[] r1 = r1.b()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.a
            java.lang.Object r5 = r5.get(r4)
            k7.X3 r5 = (k7.X3) r5
            java.util.EnumMap r6 = r9.a
            java.lang.Object r6 = r6.get(r4)
            k7.X3 r6 = (k7.X3) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            k7.X3 r7 = k7.X3.UNINITIALIZED
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            k7.X3 r7 = k7.X3.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            k7.X3 r7 = k7.X3.DENIED
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            k7.X3 r5 = k7.X3.GRANTED
            goto L42
        L41:
            r5 = r7
        L42:
            if (r5 == 0) goto L47
            r0.put(r4, r5)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            k7.a4 r9 = new k7.a4
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.a4.s(k7.a4):k7.a4");
    }

    public final a4 t(a4 a4Var) {
        EnumMap enumMap = new EnumMap(Z3.class);
        for (Z3 z3 : Y3.STORAGE.b()) {
            X3 x3 = (X3) this.a.get(z3);
            if (x3 == X3.UNINITIALIZED) {
                x3 = (X3) a4Var.a.get(z3);
            }
            if (x3 != null) {
                enumMap.put(z3, x3);
            }
        }
        return new a4(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(d(this.b));
        for (Z3 z3 : Y3.STORAGE.b()) {
            sb.append(",");
            sb.append(z3.a);
            sb.append("=");
            X3 x3 = (X3) this.a.get(z3);
            if (x3 == null) {
                x3 = X3.UNINITIALIZED;
            }
            sb.append(x3);
        }
        return sb.toString();
    }

    public a4(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(Z3.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}

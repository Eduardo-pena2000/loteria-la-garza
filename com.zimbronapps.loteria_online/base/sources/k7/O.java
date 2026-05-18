package k7;

import java.util.EnumMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class o {
    public final EnumMap a;

    public o() {
        this.a = new EnumMap(Z3.class);
    }

    public static o d(String str) {
        EnumMap enumMap = new EnumMap(Z3.class);
        if (str.length() >= Z3.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                Z3[] values = Z3.values();
                int length = values.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put(values[i], n.a(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new o(enumMap);
            }
        }
        return new o();
    }

    public final n a(Z3 z3) {
        n nVar = (n) this.a.get(z3);
        return nVar == null ? n.UNSET : nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(k7.Z3 r3, int r4) {
        /*
            r2 = this;
            k7.n r0 = k7.n.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            k7.n r0 = k7.n.INITIALIZATION
            goto L20
        L18:
            k7.n r0 = k7.n.MANIFEST
            goto L20
        L1b:
            k7.n r0 = k7.n.API
            goto L20
        L1e:
            k7.n r0 = k7.n.TCF
        L20:
            java.util.EnumMap r4 = r2.a
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.o.b(k7.Z3, int):void");
    }

    public final void c(Z3 z3, n nVar) {
        this.a.put(z3, nVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (Z3 z3 : Z3.values()) {
            n nVar = (n) this.a.get(z3);
            if (nVar == null) {
                nVar = n.UNSET;
            }
            sb.append(nVar.b());
        }
        return sb.toString();
    }

    public o(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(Z3.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}

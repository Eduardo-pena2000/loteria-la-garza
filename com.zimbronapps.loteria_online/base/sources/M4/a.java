package m4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements e {
    public final String a;
    public final Object[] b;

    public a(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    public static void c(d dVar, int i, Object obj) {
        if (obj == null) {
            dVar.q1(i);
            return;
        }
        if (obj instanceof byte[]) {
            dVar.d1(i, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            dVar.w(i, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            dVar.w(i, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            dVar.Z0(i, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            dVar.Z0(i, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            dVar.Z0(i, ((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            dVar.Z0(i, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            dVar.D0(i, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            dVar.Z0(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
    }

    public static void d(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            c(dVar, i, obj);
        }
    }

    public String a() {
        return this.a;
    }

    public void b(d dVar) {
        d(dVar, this.b);
    }

    public a(String str) {
        this(str, null);
    }
}

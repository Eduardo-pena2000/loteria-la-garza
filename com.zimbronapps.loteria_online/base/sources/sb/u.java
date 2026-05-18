package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class U extends A0 {
    public abstract String e0(String str, String str2);

    public String f0(qb.e descriptor, int i) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        return descriptor.e(i);
    }

    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final String Z(qb.e eVar, int i) {
        kotlin.jvm.internal.t.g(eVar, "<this>");
        return h0(f0(eVar, i));
    }

    public final String h0(String nestedName) {
        kotlin.jvm.internal.t.g(nestedName, "nestedName");
        String str = (String) Y();
        if (str == null) {
            str = "";
        }
        return e0(str, nestedName);
    }

    public final String i0() {
        return a0().isEmpty() ? "$" : Da.D.n0(a0(), ".", "$.", null, 0, null, null, 60, null);
    }
}

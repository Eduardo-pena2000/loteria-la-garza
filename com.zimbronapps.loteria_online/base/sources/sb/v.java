package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class V extends B0 {
    public abstract String Z(String str, String str2);

    public abstract String a0(qb.e eVar, int i);

    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final String W(qb.e eVar, int i) {
        kotlin.jvm.internal.t.g(eVar, "<this>");
        return c0(a0(eVar, i));
    }

    public final String c0(String nestedName) {
        kotlin.jvm.internal.t.g(nestedName, "nestedName");
        String str = (String) V();
        if (str == null) {
            str = "";
        }
        return Z(str, nestedName);
    }
}

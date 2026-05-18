package d1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class p {
    public static String a(String str) {
        if (!(str.length() > 0)) {
            g1.a.a("name may not be empty");
        }
        return str;
    }

    public static final boolean b(String str, String str2) {
        return kotlin.jvm.internal.t.c(str, str2);
    }

    public static int c(String str) {
        return str.hashCode();
    }

    public static String d(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }
}

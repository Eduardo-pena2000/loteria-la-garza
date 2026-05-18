package J7;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class k {
    public static h a(String str, String str2) {
        com.google.android.gms.common.internal.t.f(str);
        com.google.android.gms.common.internal.t.f(str2);
        return new j(str, str2);
    }

    public static h b(String str, String str2) {
        if (j.Q1(str2)) {
            return new j(str, null, str2, null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}

package J7;

import android.net.Uri;
import com.google.android.gms.internal.firebase-auth-api.zzal;
import java.util.HashMap;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class f {
    public static final zzal g;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        g = zzal.zza(hashMap);
    }

    public f(String str) {
        String e = e(str, "apiKey");
        String e2 = e(str, "oobCode");
        String e3 = e(str, "mode");
        if (e == null || e2 == null || e3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        this.a = com.google.android.gms.common.internal.t.f(e);
        this.b = com.google.android.gms.common.internal.t.f(e2);
        this.c = com.google.android.gms.common.internal.t.f(e3);
        this.d = e(str, "continueUrl");
        this.e = e(str, "lang");
        this.f = e(str, "tenantId");
    }

    public static f c(String str) {
        com.google.android.gms.common.internal.t.f(str);
        try {
            return new f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String e(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(com.google.android.gms.common.internal.t.f(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (UnsupportedOperationException | NullPointerException unused) {
            return null;
        }
    }

    public String a() {
        return this.b;
    }

    public int b() {
        zzal zzalVar = g;
        if (zzalVar.containsKey(this.c)) {
            return ((Integer) zzalVar.get(this.c)).intValue();
        }
        return 3;
    }

    public final String d() {
        return this.f;
    }
}

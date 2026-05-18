package k7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class v2 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final u2 a;

    public v2(u2 u2Var) {
        this.a = u2Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        com.google.android.gms.common.internal.t.l(strArr);
        com.google.android.gms.common.internal.t.l(strArr2);
        com.google.android.gms.common.internal.t.l(atomicReference);
        com.google.android.gms.common.internal.t.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.zza() ? str : g(str, b4.c, b4.a, b);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.zza() ? str : g(str, c4.b, c4.a, c);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, d4.b, d4.a, d);
        }
        return "experiment_id(" + str + ")";
    }

    public final String d(I i) {
        u2 u2Var = this.a;
        if (!u2Var.zza()) {
            return i.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(i.c);
        sb.append(",name=");
        sb.append(a(i.a));
        sb.append(",params=");
        G g = i.b;
        sb.append(g == null ? null : !u2Var.zza() ? g.toString() : e(g.R1()));
        return sb.toString();
    }

    public final String e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(b(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? f(new Object[]{obj}) : obj instanceof Object[] ? f((Object[]) obj) : obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String e = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (e != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(e);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

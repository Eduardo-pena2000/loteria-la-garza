package T2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import g3.w;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u extends M2.A {
    public static final String q = P2.K.w0(1001);
    public static final String r = P2.K.w0(1002);
    public static final String s = P2.K.w0(1003);
    public static final String t = P2.K.w0(1004);
    public static final String u = P2.K.w0(1005);
    public static final String v = P2.K.w0(1006);
    public final int j;
    public final String k;
    public final int l;
    public final M2.q m;
    public final int n;
    public final w.b o;
    public final boolean p;

    public u(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static u b(Throwable th, String str, int i, M2.q qVar, int i2, boolean z, int i3) {
        return new u(1, th, null, i3, str, i, qVar, qVar == null ? 4 : i2, z);
    }

    public static u c(IOException iOException, int i) {
        return new u(0, iOException, i);
    }

    public static u d(RuntimeException runtimeException, int i) {
        return new u(2, runtimeException, i);
    }

    public static String e(int i, String str, String str2, int i2, M2.q qVar, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + qVar + ", format_supported=" + P2.K.Y(i3);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    public u a(w.b bVar) {
        return new u((String) P2.K.i(getMessage()), getCause(), this.a, this.j, this.k, this.l, this.m, this.n, bVar, this.b, this.p);
    }

    public Exception f() {
        P2.a.f(this.j == 1);
        return (Exception) P2.a.e(getCause());
    }

    public IOException g() {
        P2.a.f(this.j == 0);
        return (IOException) P2.a.e(getCause());
    }

    public RuntimeException h() {
        P2.a.f(this.j == 2);
        return (RuntimeException) P2.a.e(getCause());
    }

    public u(int i, Throwable th, String str, int i2, String str2, int i3, M2.q qVar, int i4, boolean z) {
        this(e(i, str, str2, i3, qVar, i4), th, i2, i, str2, i3, qVar, i4, null, SystemClock.elapsedRealtime(), z);
    }

    public u(String str, Throwable th, int i, int i2, String str2, int i3, M2.q qVar, int i4, w.b bVar, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        P2.a.a(!z || i2 == 1);
        P2.a.a(th != null || i2 == 3);
        this.j = i2;
        this.k = str2;
        this.l = i3;
        this.m = qVar;
        this.n = i4;
        this.o = bVar;
        this.p = z;
    }
}

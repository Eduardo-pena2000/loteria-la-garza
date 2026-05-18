package v6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class m {
    public static m c;
    public final Context a;
    public volatile String b;

    public m(Context context) {
        this.a = context.getApplicationContext();
    }

    public static m a(Context context) {
        com.google.android.gms.common.internal.t.l(context);
        synchronized (m.class) {
            try {
                if (c == null) {
                    F.a(context);
                    c = new m(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean d(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.m.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static A f(PackageInfo packageInfo, A... aArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            B b = new B(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < aArr.length; i++) {
                if (aArr[i].equals(b)) {
                    return aArr[i];
                }
            }
        }
        return null;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (d(packageInfo, false)) {
            return true;
        }
        if (d(packageInfo, true)) {
            if (l.f(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i) {
        P c2;
        int length;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c2 = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    com.google.android.gms.common.internal.t.l(c2);
                    break;
                }
                c2 = e(packagesForUid[i2], false, false);
                if (c2.a) {
                    break;
                }
                i2++;
            }
        } else {
            c2 = P.c("no pkgs");
        }
        c2.e();
        return c2.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    public final P e(String str, boolean z, boolean z2) {
        P c2;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return P.c("null pkg");
        }
        if (str.equals(this.b)) {
            return P.b();
        }
        D d = F.a;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                F.b();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (DynamiteModule.a | RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
        }
        if (F.g.zzg()) {
            M m = new M(null);
            m.a(str);
            m.b(l.f(this.a));
            m.c(true);
            c2 = F.c(m.d());
        } else {
            allowThreadDiskReads = Build.VERSION.SDK_INT;
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, allowThreadDiskReads >= 28 ? 134217792 : 64);
                boolean f = l.f(this.a);
                if (packageInfo == null) {
                    c2 = P.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        c2 = P.c("single cert required");
                    } else {
                        B b = new B(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        P d2 = F.d(str2, b, f, false);
                        c2 = (!d2.a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !F.d(str2, b, false, true).a) ? d2 : P.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                return P.d("no pkg ".concat(str), e2);
            }
        }
        if (c2.a) {
            this.b = str;
        }
        return c2;
    }
}

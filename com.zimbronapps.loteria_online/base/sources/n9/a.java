package N9;

import Da.r;
import Y9.a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.applovin.impl.sdk.b0;
import com.applovin.impl.sdk.c0;
import com.applovin.impl.sdk.d0;
import com.applovin.impl.sdk.e0;
import com.applovin.impl.sdk.f0;
import com.google.android.gms.internal.ads.y;
import da.i;
import da.j;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a implements j.c, Y9.a {
    public static final a c = new a(null);
    public Context a;
    public j b;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public final String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            cArr2[i2] = cArr[(b & 255) >>> 4];
            cArr2[i2 + 1] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    public final String b(PackageManager packageManager) {
        String str = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.a;
                t.d(context);
                SigningInfo a2 = b0.a(packageManager.getPackageInfo(context.getPackageName(), 134217728));
                if (a2 == null) {
                    return null;
                }
                if (c0.a(a2)) {
                    Signature[] a3 = e0.a(a2);
                    t.f(a3, "getApkContentsSigners(...)");
                    byte[] byteArray = ((Signature) r.U(a3)).toByteArray();
                    t.f(byteArray, "toByteArray(...)");
                    str = e(byteArray);
                } else {
                    Signature[] a4 = f0.a(a2);
                    t.f(a4, "getSigningCertificateHistory(...)");
                    byte[] byteArray2 = ((Signature) r.U(a4)).toByteArray();
                    t.f(byteArray2, "toByteArray(...)");
                    str = e(byteArray2);
                }
            } else {
                Context context2 = this.a;
                t.d(context2);
                Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                if (signatureArr != null && signatureArr.length != 0 && r.U(signatureArr) != null) {
                    byte[] byteArray3 = ((Signature) r.U(signatureArr)).toByteArray();
                    t.f(byteArray3, "toByteArray(...)");
                    str = e(byteArray3);
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        return str;
    }

    public final String c() {
        Context context = this.a;
        t.d(context);
        PackageManager packageManager = context.getPackageManager();
        Context context2 = this.a;
        t.d(context2);
        String packageName = context2.getPackageName();
        return Build.VERSION.SDK_INT >= 30 ? y.a(d0.a(packageManager, packageName)) : packageManager.getInstallerPackageName(packageName);
    }

    public final long d(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? com.google.android.gms.internal.consent_sdk.a.a(packageInfo) : packageInfo.versionCode;
    }

    public final String e(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        t.d(digest);
        return a(digest);
    }

    public void onAttachedToEngine(a.b binding) {
        t.g(binding, "binding");
        this.a = binding.a();
        j jVar = new j(binding.b(), "dev.fluttercommunity.plus/package_info");
        this.b = jVar;
        t.d(jVar);
        jVar.e(this);
    }

    public void onDetachedFromEngine(a.b binding) {
        t.g(binding, "binding");
        this.a = null;
        j jVar = this.b;
        t.d(jVar);
        jVar.e(null);
        this.b = null;
    }

    public void onMethodCall(i call, j.d result) {
        String str;
        CharSequence loadLabel;
        t.g(call, "call");
        t.g(result, "result");
        try {
            if (!t.c(call.a, "getAll")) {
                result.c();
                return;
            }
            Context context = this.a;
            t.d(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.a;
            t.d(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            t.d(packageManager);
            String b = b(packageManager);
            String c2 = c();
            long j = packageInfo.firstInstallTime;
            long j2 = packageInfo.lastUpdateTime;
            HashMap hashMap = new HashMap();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str2 = "";
            if (applicationInfo == null || (loadLabel = applicationInfo.loadLabel(packageManager)) == null || (str = loadLabel.toString()) == null) {
                str = "";
            }
            hashMap.put("appName", str);
            Context context3 = this.a;
            t.d(context3);
            hashMap.put("packageName", context3.getPackageName());
            String str3 = packageInfo.versionName;
            if (str3 != null) {
                str2 = str3;
            }
            hashMap.put("version", str2);
            t.d(packageInfo);
            hashMap.put("buildNumber", String.valueOf(d(packageInfo)));
            if (b != null) {
                hashMap.put("buildSignature", b);
            }
            if (c2 != null) {
                hashMap.put("installerStore", c2);
            }
            hashMap.put("installTime", String.valueOf(j));
            hashMap.put("updateTime", String.valueOf(j2));
            result.a(hashMap);
        } catch (PackageManager.NameNotFoundException e) {
            result.b("Name not found", e.getMessage(), null);
        }
    }
}

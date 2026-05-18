package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbcb {
    public static String zza(Context context, String str, List list, Executor executor) throws CertificateEncodingException, PackageManager.NameNotFoundException, InterruptedException, ExecutionException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        zzhah zze = zzhah.zze();
        m.a(context.getPackageManager(), str, false, 8, list, new zzbca(zze));
        return (String) zze.get();
    }
}

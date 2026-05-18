package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.applovin.impl.H3;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgqi {
    private static final zzgqg zza = new zzgqg("PhoneskyVerificationUtils");

    public static boolean zza(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        zza.zzb("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            String zza2 = zzgqh.zza(signature.toByteArray());
                            arrayList.add(zza2);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(zza2)) {
                                return true;
                            }
                            String str = Build.TAGS;
                            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(zza2)) {
                                return true;
                            }
                        }
                        zza.zzb(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", new Object[]{H3.a(", ", arrayList)}), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zza.zzb("Play Store package is not found.", new Object[0]);
                }
            } else {
                zza.zzb("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            zza.zzb("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}

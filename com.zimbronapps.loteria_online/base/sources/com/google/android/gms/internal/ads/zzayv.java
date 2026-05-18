package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzayv {
    public static final String zza(Context context, String str, long j, boolean z) {
        try {
            zzaxp zza = zzaxq.zza();
            zza.zzb(str);
            zza.zza("0.825731049");
            zza.zzd(context.getPackageName());
            zza.zzf((System.currentTimeMillis() - j) / 1000);
            zza.zzc(System.currentTimeMillis() / 1000);
            try {
                zza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zza.zze(-1L);
            }
            zzaxw zzc = zzayg.zzc(((zzaxq) zza.zzbu()).zzaN(), null);
            zzc.zzc(5);
            zzc.zzd(2);
            return Base64.encodeToString(((zzaxx) zzc.zzbu()).zzaN(), 11);
        } catch (GeneralSecurityException | UnsupportedEncodingException unused2) {
            return Integer.toString(7);
        }
    }
}

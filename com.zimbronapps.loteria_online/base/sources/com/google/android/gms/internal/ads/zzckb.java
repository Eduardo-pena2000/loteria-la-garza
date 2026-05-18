package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzckb {
    public static final zzcjl zza(Context context, zzclv zzclvVar, String str, boolean z, boolean z2, zzazh zzazhVar, zzbil zzbilVar, W5.a aVar, zzbht zzbhtVar, R5.n nVar, R5.a aVar2, zzbgd zzbgdVar, zzfir zzfirVar, zzfiu zzfiuVar, zzejf zzejfVar, zzfjo zzfjoVar, zzdxz zzdxzVar) throws zzcka {
        zzbhe.zza(context);
        try {
            zzcjx zzcjxVar = new zzcjx(context, zzclvVar, str, z, z2, zzazhVar, zzbilVar, aVar, null, nVar, aVar2, zzbgdVar, zzfirVar, zzfiuVar, zzfjoVar, zzdxzVar, zzejfVar);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object zza = zzcjxVar.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (zzcjl) zza;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new zzcka("Webview initialization failed.", th2);
        }
    }

    public static final x7.e zzb(Context context, W5.a aVar, String str, zzazh zzazhVar, R5.a aVar2, zzejf zzejfVar, zzfjo zzfjoVar, zzdxz zzdxzVar) {
        return zzgzo.zzf(new zzcjz(context, zzazhVar, aVar, aVar2, zzejfVar, zzfjoVar, zzdxzVar, str), zzcei.zzf);
    }
}

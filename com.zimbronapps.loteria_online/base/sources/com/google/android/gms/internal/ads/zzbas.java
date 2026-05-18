package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbas implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzbat zza;

    public zzbas(zzbat zzbatVar) {
        Objects.requireNonNull(zzbatVar);
        this.zza = zzbatVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            zzbat zzbatVar = this.zza;
            zzbatVar.zze(System.currentTimeMillis());
            zzbatVar.zzh(true);
            return;
        }
        zzbat zzbatVar2 = this.zza;
        long zzf = zzbatVar2.zzf();
        long currentTimeMillis = System.currentTimeMillis();
        if (zzf > 0 && currentTimeMillis >= zzbatVar2.zzf()) {
            zzbatVar2.zzg(currentTimeMillis - zzbatVar2.zzf());
        }
        zzbatVar2.zzh(false);
    }
}

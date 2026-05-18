package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbai implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbak zzb;

    public zzbai(zzbak zzbakVar, int i, boolean z) {
        this.zza = i;
        Objects.requireNonNull(zzbakVar);
        this.zzb = zzbakVar;
    }

    public final void run() {
        zzaxg zzaxgVar;
        int i = this.zza;
        zzbak zzbakVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzbakVar.zza;
            zzaxgVar = zzfvo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzaxgVar = null;
        }
        zzbak zzbakVar2 = this.zzb;
        zzbakVar2.zzs(zzaxgVar);
        int i2 = this.zza;
        if (i2 < 4) {
            if (zzaxgVar != null && zzaxgVar.zza() && !zzaxgVar.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzaxgVar.zzg() && zzaxgVar.zzh().zza() && zzaxgVar.zzh().zzb() != -2) {
                return;
            }
            zzbakVar2.zzp(i2 + 1, true);
        }
    }
}

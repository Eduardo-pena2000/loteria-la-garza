package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzae implements zzab {
    private final Object zza = new Object();
    private final int zzb;
    private final zzw zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private Exception zzg;
    private boolean zzh;

    public zzae(int i, zzw zzwVar) {
        this.zzb = i;
        this.zzc = zzwVar;
    }

    private final void zza() {
        int i = this.zzd + this.zze + this.zzf;
        int i2 = this.zzb;
        if (i == i2) {
            if (this.zzg == null) {
                if (this.zzh) {
                    this.zzc.zze();
                    return;
                } else {
                    this.zzc.zza(null);
                    return;
                }
            }
            zzw zzwVar = this.zzc;
            int i3 = this.zze;
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 8 + String.valueOf(i2).length() + 24);
            sb.append(i3);
            sb.append(" out of ");
            sb.append(i2);
            sb.append(" underlying tasks failed");
            zzwVar.zzc(new ExecutionException(sb.toString(), this.zzg));
        }
    }

    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    public final void onFailure(Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    public final void onSuccess(Object obj) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}

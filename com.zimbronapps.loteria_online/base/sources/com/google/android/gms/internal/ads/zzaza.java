package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaza implements Runnable {
    final /* synthetic */ zzazb zza;

    public zzaza(zzazb zzazbVar) {
        Objects.requireNonNull(zzazbVar);
        this.zza = zzazbVar;
    }

    public final void run() {
        boolean z;
        zzazb zzazbVar = this.zza;
        if (zzazbVar.zzb != null) {
            return;
        }
        synchronized (zzazb.zzc()) {
            if (zzazbVar.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) zzbhe.zzdl.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzazb.zza = zzfxd.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                    z2 = z;
                } catch (Throwable unused2) {
                }
            } else {
                z2 = z;
            }
            this.zza.zzb = Boolean.valueOf(z2);
            zzazb.zzc().open();
        }
    }
}

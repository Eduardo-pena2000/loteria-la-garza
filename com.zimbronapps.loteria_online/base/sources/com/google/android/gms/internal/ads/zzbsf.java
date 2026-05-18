package com.google.android.gms.internal.ads;

import V5.o0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbsf extends zzceu {
    private final Object zza = new Object();
    private final zzbsk zzb;
    private boolean zzc;

    public zzbsf(zzbsk zzbskVar) {
        this.zzb = zzbskVar;
    }

    public final void zza() {
        o0.k("release: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                o0.k("release: Lock acquired");
                if (this.zzc) {
                    o0.k("release: Lock already released");
                    return;
                }
                this.zzc = true;
                zze(new zzbsc(this), new zzceq());
                zze(new zzbsd(this), new zzbse(this));
                o0.k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ zzbsk zzb() {
        return this.zzb;
    }
}

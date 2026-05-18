package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdki extends zzdhd {
    private boolean zzb;

    public zzdki(Set set) {
        super(set);
    }

    public final void zza() {
        zzs(zzdkh.zza);
    }

    public final void zzb() {
        zzs(zzdkd.zza);
    }

    public final synchronized void zzc() {
        zzs(zzdke.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        try {
            if (!this.zzb) {
                zzs(zzdkg.zza);
                this.zzb = true;
            }
            zzs(zzdkf.zza);
        } catch (Throwable th) {
            throw th;
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcxa implements U5.E {
    private final zzdcm zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcxa(zzdcm zzdcmVar) {
        this.zza = zzdcmVar;
    }

    private final void zzm() {
        AtomicBoolean atomicBoolean = this.zzc;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.zza.zza();
    }

    public final void zzdS() {
        zzm();
    }

    public final void zzdT(int i) {
        this.zzb.set(true);
        zzm();
    }

    public final void zzdo() {
    }

    public final void zzdp() {
    }

    public final void zzdq() {
    }

    public final void zzdv() {
    }

    public final void zzdw() {
    }

    public final void zzdx() {
    }

    public final void zzdy() {
    }

    public final void zzdz() {
    }

    public final void zzh() {
        this.zza.zzc();
    }

    public final boolean zzl() {
        return this.zzb.get();
    }
}

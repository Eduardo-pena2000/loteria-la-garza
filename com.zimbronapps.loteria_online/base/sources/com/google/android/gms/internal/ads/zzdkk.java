package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdkk implements U5.E, S5.a {
    private final zzdvh zza;
    private final zzfiu zzb;
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzdkk(zzdvh zzdvhVar, zzfiu zzfiuVar) {
        this.zza = zzdvhVar;
        this.zzb = zzfiuVar;
    }

    private final void zzl() {
        if (this.zzc.getAndSet(true)) {
            return;
        }
        this.zza.zzd();
    }

    public final void onAdClicked() {
        this.zza.zzc();
    }

    public final void zzdS() {
        zzl();
    }

    public final void zzdT(int i) {
        zzl();
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
        this.zza.zzb(this.zzb.zzb);
    }
}

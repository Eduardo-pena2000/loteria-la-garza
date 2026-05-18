package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzagd extends zzafi {
    private final long zza;

    public zzagd(zzaev zzaevVar, long j) {
        super(zzaevVar);
        zzgrc.zza(zzaevVar.zzn() >= j);
        this.zza = j;
    }

    public final long zzm() {
        return super.zzm() - this.zza;
    }

    public final long zzn() {
        return super.zzn() - this.zza;
    }

    public final long zzo() {
        return super.zzo() - this.zza;
    }
}

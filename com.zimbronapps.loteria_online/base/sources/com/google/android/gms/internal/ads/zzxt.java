package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzxt implements zzwj {
    private final zzha zza;
    private final zzxc zzb;
    private int zzc;
    private final zzaaw zzd;

    public zzxt(zzha zzhaVar, zzafa zzafaVar) {
        zzxs zzxsVar = new zzxs(zzafaVar);
        zzaaw zzaawVar = new zzaaw(-1);
        this.zza = zzhaVar;
        this.zzb = zzxsVar;
        this.zzd = zzaawVar;
        this.zzc = 1048576;
    }

    public final zzxt zza(int i) {
        this.zzc = i;
        return this;
    }

    public final zzxu zzb(zzak zzakVar) {
        zzakVar.zzb.getClass();
        return new zzxu(zzakVar, this.zza, this.zzb, zzto.zza, this.zzd, this.zzc, false, 0, null, null, null);
    }
}

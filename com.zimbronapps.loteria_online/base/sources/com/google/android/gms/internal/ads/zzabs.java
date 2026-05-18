package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzabs {
    final /* synthetic */ zzabt zza;
    private zzv zzb;

    public /* synthetic */ zzabs(zzabt zzabtVar, byte[] bArr) {
        Objects.requireNonNull(zzabtVar);
        this.zza = zzabtVar;
    }

    public final void zza(zzbv zzbvVar) {
        zzt zztVar = new zzt();
        zztVar.zzt(zzbvVar.zzb);
        zztVar.zzu(zzbvVar.zzc);
        zztVar.zzm("video/raw");
        this.zzb = zztVar.zzM();
        this.zza.zzC().execute(new zzabr(this, zzbvVar));
    }

    public final void zzb(long j, long j2, boolean z) {
        if (z) {
            zzabt zzabtVar = this.zza;
            if (zzabtVar.zzA() != null) {
                zzabtVar.zzC().execute(new zzabp(this));
            }
        }
        zzv zzvVar = this.zzb;
        if (zzvVar == null) {
            zzvVar = new zzt().zzM();
        }
        zzv zzvVar2 = zzvVar;
        zzabt zzabtVar2 = this.zza;
        zzabtVar2.zzD().zzcS(j2, j, zzvVar2, null);
        ((zzadp) zzabtVar2.zzz().remove()).zza(j);
    }
}

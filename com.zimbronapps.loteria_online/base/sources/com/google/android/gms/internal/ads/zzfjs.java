package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfjs implements zzgzl {
    final /* synthetic */ zzcjl zza;
    final /* synthetic */ zzcrv zzb;
    final /* synthetic */ zzfqk zzc;
    final /* synthetic */ zzeiu zzd;

    public zzfjs(zzcjl zzcjlVar, zzcrv zzcrvVar, zzfqk zzfqkVar, zzeiu zzeiuVar) {
        this.zza = zzcjlVar;
        this.zzb = zzcrvVar;
        this.zzc = zzfqkVar;
        this.zzd = zzeiuVar;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrv zzcrvVar;
        String str = (String) obj;
        zzcjl zzcjlVar = this.zza;
        zzfir zzC = zzcjlVar.zzC();
        if (zzC != null && !zzC.zzai) {
            W5.w wVar = zzC.zzax;
            if (((Boolean) S5.D.c().zzd(zzbhe.zzly)).booleanValue() && (zzcrvVar = this.zzb) != null && zzcrv.zzc(str)) {
                zzcrvVar.zza(str, this.zzc, S5.B.h(), wVar);
                return;
            } else {
                this.zzc.zzb(str, wVar, null, null);
                return;
            }
        }
        zzfiu zzaC = zzcjlVar.zzaC();
        if (zzaC == null) {
            R5.t.l().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long a = R5.t.o().a();
        boolean zzs = R5.t.l().zzs(zzcjlVar.getContext());
        boolean z = false;
        boolean z2 = ((Boolean) S5.D.c().zzd(zzbhe.zzhh)).booleanValue() && zzC != null && zzC.zzS;
        if (zzC != null && zzC.zzad != null) {
            z = true;
        }
        this.zzd.zze(new zzeiw(a, zzaC.zzb, str, (zzs || z2 || z) ? 2 : 1));
    }
}

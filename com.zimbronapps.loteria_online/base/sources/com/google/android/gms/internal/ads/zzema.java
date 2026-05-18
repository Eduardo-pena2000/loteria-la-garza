package com.google.android.gms.internal.ads;

import V5.F0;
import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzema implements zzdmc {
    private final Context zza;
    private final W5.a zzb;
    private final x7.e zzc;
    private final zzfir zzd;
    private final zzcjl zze;
    private final zzfjk zzf;
    private final zzbok zzg;
    private final boolean zzh;
    private final zzejf zzi;
    private final zzdxz zzj;

    public zzema(Context context, W5.a aVar, x7.e eVar, zzfir zzfirVar, zzcjl zzcjlVar, zzfjk zzfjkVar, boolean z, zzbok zzbokVar, zzejf zzejfVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = eVar;
        this.zzd = zzfirVar;
        this.zze = zzcjlVar;
        this.zzf = zzfjkVar;
        this.zzg = zzbokVar;
        this.zzh = z;
        this.zzi = zzejfVar;
        this.zzj = zzdxzVar;
    }

    public final void zza(boolean z, Context context, zzdbs zzdbsVar) {
        zzdko zzdkoVar = (zzdko) zzgzo.zzt(this.zzc);
        zzcjl zzcjlVar = this.zze;
        zzcjlVar.zzag(true);
        boolean z2 = this.zzh;
        boolean zzc = z2 ? this.zzg.zzc(false) : false;
        R5.t.g();
        boolean n = F0.n(this.zza);
        boolean z3 = z2 && this.zzg.zzd();
        float zze = z2 ? this.zzg.zze() : 0.0f;
        zzfir zzfirVar = this.zzd;
        R5.l lVar = new R5.l(zzc, n, z3, zze, -1, z, zzfirVar.zzO, false);
        if (zzdbsVar != null) {
            zzdbsVar.zzb();
        }
        R5.t.f();
        zzdlr zzj = zzdkoVar.zzj();
        int i = zzfirVar.zzQ;
        W5.a aVar = this.zzb;
        String str = zzfirVar.zzB;
        zzfiw zzfiwVar = zzfirVar.zzs;
        U5.A.a(context, new AdOverlayInfoParcel(null, zzj, null, zzcjlVar, i, aVar, str, lVar, zzfiwVar.zzb, zzfiwVar.zza, this.zzf.zzg, zzdbsVar, zzfirVar.zzb() ? this.zzi : null, zzcjlVar.zzn()), true, this.zzj);
    }

    public final zzfir zzb() {
        return this.zzd;
    }
}

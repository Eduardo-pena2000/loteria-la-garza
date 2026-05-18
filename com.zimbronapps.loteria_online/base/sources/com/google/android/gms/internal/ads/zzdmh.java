package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdmh implements zzdbf, zzdir {
    private final zzccn zza;
    private final Context zzb;
    private final zzccq zzc;
    private final View zzd;
    private String zze;
    private final zzbgj.zza.zza zzf;
    private final zzfir zzg;

    public zzdmh(zzccn zzccnVar, Context context, zzccq zzccqVar, View view, zzbgj.zza.zza zzaVar, zzfir zzfirVar) {
        this.zza = zzccnVar;
        this.zzb = context;
        this.zzc = zzccqVar;
        this.zzd = view;
        this.zzf = zzaVar;
        this.zzg = zzfirVar;
    }

    public final void zzd(zzcag zzcagVar, String str, String str2) {
        zzccq zzccqVar = this.zzc;
        Context context = this.zzb;
        if (zzccqVar.zza(context) && this.zzg.zzaG) {
            try {
                zzccqVar.zzo(context, zzccqVar.zzj(context), this.zza.zzb(), zzcagVar.zzb(), zzcagVar.zzc());
            } catch (RemoteException e) {
                int i = o0.b;
                W5.p.g("Remote Exception to get reward item.", e);
            }
        }
    }

    public final void zzdJ() {
    }

    public final void zzds() {
        if (this.zzg.zzaG) {
            this.zza.zza(false);
        }
    }

    public final void zzdt() {
        if (this.zzg.zzaG) {
            View view = this.zzd;
            if (view != null && this.zze != null) {
                this.zzc.zzg(view.getContext(), this.zze);
            }
            this.zza.zza(true);
        }
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final void zzg() {
    }

    public final void zzh() {
        zzbgj.zza.zza zzaVar = this.zzf;
        if (zzaVar != zzbgj.zza.zza.zzk && this.zzg.zzaG) {
            String zzf = this.zzc.zzf(this.zzb);
            this.zze = zzf;
            this.zze = String.valueOf(zzf).concat(zzaVar == zzbgj.zza.zza.zzh ? "/Rewarded" : "/Interstitial");
        }
    }
}

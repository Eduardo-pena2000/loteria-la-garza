package com.google.android.gms.internal.ads;

import V5.F0;
import V5.q0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeuo implements zzfav {
    private final Context zza;
    private final Bundle zzb;
    private final String zzc;
    private final String zzd;
    private final q0 zze;
    private final String zzf;
    private final zzcyj zzg;

    public zzeuo(Context context, Bundle bundle, String str, String str2, q0 q0Var, String str3, zzcyj zzcyjVar) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = q0Var;
        this.zzf = str3;
        this.zzg = zzcyjVar;
    }

    private final void zzc(Bundle bundle) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgE)).booleanValue()) {
            try {
                R5.t.g();
                bundle.putString("_app_id", F0.g0(this.zza));
            } catch (RemoteException | RuntimeException e) {
                R5.t.l().zzg(e, "AppStatsSignal_AppId");
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        if (!this.zze.zzx()) {
            bundle.putString("session_id", this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !r0.zzx());
        zzc(bundle);
        String str = this.zzf;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            zzcyj zzcyjVar = this.zzg;
            bundle2.putLong("dload", zzcyjVar.zzc(str));
            bundle2.putInt("pcc", zzcyjVar.zzb(str));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzli)).booleanValue() || R5.t.l().zzn() <= 0) {
            return;
        }
        bundle.putInt("nrwv", R5.t.l().zzn());
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzdah) obj).zzb;
        bundle.putBundle("quality_signals", this.zzb);
        zzc(bundle);
    }
}

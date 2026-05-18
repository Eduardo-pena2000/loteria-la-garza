package com.google.android.gms.internal.ads;

import V5.o0;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;
import v.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzelt implements zzekg {
    private final Context zza;
    private final zzdlu zzb;
    private final Executor zzc;
    private final zzfiq zzd;
    private final zzdxz zze;

    public zzelt(Context context, Executor executor, zzdlu zzdluVar, zzfiq zzfiqVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = zzdluVar;
        this.zzc = executor;
        this.zzd = zzfiqVar;
        this.zze = zzdxzVar;
    }

    private static String zze(zzfir zzfirVar) {
        try {
            return zzfirVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbif.zza(context) && !TextUtils.isEmpty(zze(zzfirVar));
    }

    public final x7.e zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzoB)).booleanValue()) {
            zzdxy zza = this.zze.zza();
            zza.zzc("action", "cstm_tbs_rndr");
            zza.zzd();
        }
        String zze = zze(zzfirVar);
        return zzgzo.zzj(zzgzo.zza(null), new zzels(this, zze != null ? Uri.parse(zze) : null, zzfjcVar, zzfirVar, zzfjcVar.zzb.zzb), this.zzc);
    }

    public final /* synthetic */ x7.e zzc(Uri uri, zzfjc zzfjcVar, zzfir zzfirVar, zzfiu zzfiuVar, Object obj) {
        try {
            v.d a = new d.d().a();
            a.a.setData(uri);
            U5.m mVar = new U5.m(a.a, null);
            zzcen zzcenVar = new zzcen();
            zzdko zzd = this.zzb.zzd(new zzcwv(zzfjcVar, zzfirVar, null), new zzdkr(new zzelr(this, zzcenVar, zzfirVar), null));
            zzcenVar.zzc(new AdOverlayInfoParcel(mVar, null, zzd.zzi(), null, new W5.a(0, 0, false), null, null, zzfiuVar.zzb));
            this.zzd.zzd();
            return zzgzo.zza(zzd.zzh());
        } catch (Throwable th) {
            int i = o0.b;
            W5.p.d("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    public final /* synthetic */ zzdxz zzd() {
        return this.zze;
    }
}

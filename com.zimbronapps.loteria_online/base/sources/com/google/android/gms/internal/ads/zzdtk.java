package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdtk {
    private final R5.a zzb;
    private final Context zzc;
    private final zzdxz zzd;
    private final Executor zze;
    private final zzazh zzf;
    private final W5.a zzg;
    private final zzeiu zzi;
    private final zzfqk zzj;
    private final zzejf zzk;
    private final zzfjo zzl;
    private x7.e zzm;
    private final zzdsy zza = new zzdsy();
    private final zzboy zzh = new zzboy();

    public zzdtk(zzdti zzdtiVar) {
        this.zzc = zzdtiVar.zzb();
        this.zze = zzdtiVar.zze();
        this.zzf = zzdtiVar.zzf();
        this.zzg = zzdtiVar.zzg();
        this.zzb = zzdtiVar.zza();
        this.zzi = zzdtiVar.zzd();
        this.zzj = zzdtiVar.zzh();
        this.zzd = zzdtiVar.zzc();
        this.zzk = zzdtiVar.zzi();
        this.zzl = zzdtiVar.zzj();
    }

    public final synchronized void zza() {
        String str = (String) S5.D.c().zzd(zzbhe.zzeE);
        zzazh zzazhVar = this.zzf;
        R5.a aVar = this.zzb;
        zzejf zzejfVar = this.zzk;
        x7.e zzk = zzgzo.zzk(zzckb.zzb(this.zzc, this.zzg, str, zzazhVar, aVar, zzejfVar, this.zzl, this.zzd), new zzdth(this), this.zze);
        this.zzm = zzk;
        zzcel.zza(zzk, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzb() {
        x7.e eVar = this.zzm;
        if (eVar == null) {
            return;
        }
        zzgzo.zzr(eVar, new zzdsz(this), this.zze);
        this.zzm = null;
    }

    public final synchronized x7.e zzc(String str, JSONObject jSONObject) {
        x7.e eVar = this.zzm;
        if (eVar == null) {
            return zzgzo.zza(null);
        }
        return zzgzo.zzj(eVar, new zzdtg(this, str, jSONObject), this.zze);
    }

    public final synchronized void zzd(String str, zzboh zzbohVar) {
        x7.e eVar = this.zzm;
        if (eVar == null) {
            return;
        }
        zzgzo.zzr(eVar, new zzdta(this, str, zzbohVar), this.zze);
    }

    public final synchronized void zze(String str, zzboh zzbohVar) {
        x7.e eVar = this.zzm;
        if (eVar == null) {
            return;
        }
        zzgzo.zzr(eVar, new zzdtb(this, str, zzbohVar), this.zze);
    }

    public final synchronized void zzf(String str, Map map) {
        x7.e eVar = this.zzm;
        if (eVar == null) {
            return;
        }
        zzgzo.zzr(eVar, new zzdtc(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzg(zzfir zzfirVar, zzfiu zzfiuVar, zzcrv zzcrvVar) {
        x7.e eVar = this.zzm;
        if (eVar == null) {
            return;
        }
        zzgzo.zzr(eVar, new zzdtd(this, zzfirVar, zzfiuVar, zzcrvVar), this.zze);
    }

    public final void zzh(WeakReference weakReference, String str, zzboh zzbohVar) {
        zzd(str, new zzdtj(this, weakReference, str, zzbohVar, null));
    }

    public final /* synthetic */ zzcjl zzi(zzcjl zzcjlVar) {
        zzcjlVar.zzab("/result", this.zzh);
        zzclj zzP = zzcjlVar.zzP();
        R5.b bVar = new R5.b(this.zzc, null, null);
        zzeiu zzeiuVar = this.zzi;
        zzfqk zzfqkVar = this.zzj;
        zzdxz zzdxzVar = this.zzd;
        zzdsy zzdsyVar = this.zza;
        zzP.zzab(null, zzdsyVar, zzdsyVar, zzdsyVar, zzdsyVar, false, null, bVar, null, null, zzeiuVar, zzfqkVar, zzdxzVar, null, null, null, null, null, null, null, null, null);
        return zzcjlVar;
    }

    public final /* synthetic */ x7.e zzj(String str, JSONObject jSONObject, zzcjl zzcjlVar) {
        return this.zzh.zzc(zzcjlVar, str, jSONObject);
    }

    public final /* synthetic */ zzdsy zzk() {
        return this.zza;
    }

    public final /* synthetic */ zzdxz zzl() {
        return this.zzd;
    }

    public final /* synthetic */ zzeiu zzm() {
        return this.zzi;
    }

    public final /* synthetic */ zzfqk zzn() {
        return this.zzj;
    }
}

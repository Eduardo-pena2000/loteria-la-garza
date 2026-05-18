package com.google.android.gms.internal.ads;

import S5.e2;
import S5.q2;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdsh {
    private final zzfjk zza;
    private final Executor zzb;
    private final zzduv zzc;
    private final zzdtq zzd;
    private final Context zze;
    private final zzdxz zzf;
    private final zzfqk zzg;
    private final zzeiu zzh;
    private final zzdxt zzi;
    private final zzdzc zzj;

    public zzdsh(zzfjk zzfjkVar, Executor executor, zzduv zzduvVar, Context context, zzdxz zzdxzVar, zzfqk zzfqkVar, zzeiu zzeiuVar, zzdtq zzdtqVar, zzdxt zzdxtVar, zzdzc zzdzcVar) {
        this.zza = zzfjkVar;
        this.zzb = executor;
        this.zzc = zzduvVar;
        this.zze = context;
        this.zzf = zzdxzVar;
        this.zzg = zzfqkVar;
        this.zzh = zzeiuVar;
        this.zzd = zzdtqVar;
        this.zzi = zzdxtVar;
        this.zzj = zzdzcVar;
    }

    private final void zzh(zzcjl zzcjlVar, zzcem zzcemVar) {
        e2 e2Var = this.zza.zza;
        if (e2Var != null && zzcjlVar.zzh() != null) {
            zzcjlVar.zzh().zzc(e2Var);
        }
        zzcemVar.zzb();
    }

    private final void zzi(zzcjl zzcjlVar, R5.b bVar, zzcce zzcceVar) {
        zzdzc zzdzcVar;
        zzj(zzcjlVar);
        zzcjlVar.zzab("/video", zzbog.zzl);
        zzcjlVar.zzab("/videoMeta", zzbog.zzm);
        zzcjlVar.zzab("/precache", new zzchs());
        zzcjlVar.zzab("/delayPageLoaded", zzbog.zzp);
        zzcjlVar.zzab("/instrument", zzbog.zzn);
        zzcjlVar.zzab("/log", zzbog.zzg);
        zzcjlVar.zzab("/click", zzbog.zzb(null, null));
        if (this.zza.zzb != null) {
            zzcjlVar.zzP().zzT(true);
            zzcjlVar.zzab("/open", new zzbou(true != ((Boolean) S5.D.c().zzd(zzbhe.zzpf)).booleanValue() ? null : bVar, null, null, null, null, null));
        } else {
            zzcjlVar.zzP().zzT(false);
        }
        if (R5.t.d().zza(zzcjlVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzcjlVar.zzC() != null) {
                hashMap = zzcjlVar.zzC().zzaw;
            }
            zzcjlVar.zzab("/logScionEvent", new zzbon(zzcjlVar.getContext(), hashMap));
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzpf)).booleanValue()) {
            zzcjlVar.zzP().zzi(bVar);
            zzcjlVar.zzP().zzj(zzcceVar);
        }
        if (!((Boolean) S5.D.c().zzd(zzbhe.zziP)).booleanValue() || (zzdzcVar = this.zzj) == null) {
            return;
        }
        zzcjlVar.zzab("/onDeviceStorageEvent", new zzbop(zzdzcVar));
    }

    private static final void zzj(zzcjl zzcjlVar) {
        zzcjlVar.zzab("/videoClicked", zzbog.zzh);
        zzcjlVar.zzP().zzR(true);
        zzcjlVar.zzab("/getNativeAdViewSignals", zzbog.zzs);
        zzcjlVar.zzab("/getNativeClickMeta", zzbog.zzt);
    }

    public final x7.e zza(JSONObject jSONObject, R5.b bVar, zzcce zzcceVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzi.zze().putLong(zzdxh.zzae.zza(), R5.t.o().a());
        }
        x7.e zza = zzgzo.zza(null);
        zzdsc zzdscVar = new zzdsc(this, bVar, zzcceVar);
        Executor executor = this.zzb;
        return zzgzo.zzj(zzgzo.zzj(zza, zzdscVar, executor), new zzdsg(this, jSONObject), executor);
    }

    public final x7.e zzb(String str, String str2, zzfir zzfirVar, zzfiu zzfiuVar, q2 q2Var, R5.b bVar, zzcce zzcceVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzi.zze().putLong(zzdxh.zzag.zza(), R5.t.o().a());
        }
        return zzgzo.zzj(zzgzo.zza(null), new zzdsb(this, q2Var, zzfirVar, zzfiuVar, bVar, zzcceVar, str, str2), this.zzb);
    }

    public final /* synthetic */ x7.e zzc(JSONObject jSONObject, zzcjl zzcjlVar) {
        zzbqs zzbqsVar = this.zza.zzb;
        zzcem zza = zzcem.zza(zzcjlVar);
        if (zzbqsVar != null) {
            zzcjlVar.zzaf(zzclv.zze());
        } else {
            zzcjlVar.zzaf(zzclv.zzd());
        }
        zzcjlVar.zzP().zzG(new zzdsf(this, zzcjlVar, zza));
        zzcjlVar.zzb("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    public final /* synthetic */ x7.e zzd(q2 q2Var, zzfir zzfirVar, zzfiu zzfiuVar, R5.b bVar, zzcce zzcceVar, String str, String str2, Object obj) {
        zzcjl zza = this.zzc.zza(q2Var, zzfirVar, zzfiuVar);
        zzcem zza2 = zzcem.zza(zza);
        if (this.zza.zzb != null) {
            zzi(zza, bVar, zzcceVar);
            zza.zzaf(zzclv.zze());
        } else {
            zzdtn zza3 = this.zzd.zza();
            zzclj zzP = zza.zzP();
            zzbgv zzbgvVar = zzbhe.zzpf;
            zzP.zzab(zza3, zza3, zza3, zza3, zza3, false, null, !((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue() ? new R5.b(this.zze, null, null) : bVar, null, true != ((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue() ? null : zzcceVar, this.zzh, this.zzg, this.zzf, null, zza3, null, null, null, null, this.zzj, null, null);
            zzj(zza);
        }
        zza.zzP().zzG(new zzdse(this, zza, zza2));
        zza.zzau(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ x7.e zze(R5.b bVar, zzcce zzcceVar, Object obj) {
        zzcjl zza = this.zzc.zza(q2.N1(), null, null);
        zzcem zza2 = zzcem.zza(zza);
        zzi(zza, bVar, zzcceVar);
        zza.zzP().zzH(new zzdsd(zza2));
        zza.loadUrl((String) S5.D.c().zzd(zzbhe.zzeF));
        return zza2;
    }

    public final /* synthetic */ void zzf(zzcjl zzcjlVar, zzcem zzcemVar, boolean z, int i, String str, String str2) {
        if (z) {
            e2 e2Var = this.zza.zza;
            if (e2Var != null && zzcjlVar.zzh() != null) {
                zzcjlVar.zzh().zzc(e2Var);
            }
            zzcemVar.zzb();
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzcemVar.zzd(new zzenv(1, sb.toString()));
    }

    public final /* synthetic */ void zzg(zzcjl zzcjlVar, zzcem zzcemVar, boolean z, int i, String str, String str2) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzeN)).booleanValue()) {
            zzh(zzcjlVar, zzcemVar);
            return;
        }
        if (z) {
            zzh(zzcjlVar, zzcemVar);
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Native Video WebView failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzcemVar.zzd(new zzenv(1, sb.toString()));
    }
}

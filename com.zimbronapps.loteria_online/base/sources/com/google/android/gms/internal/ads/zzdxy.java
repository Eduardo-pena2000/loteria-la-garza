package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdxy {
    final /* synthetic */ zzdxz zza;
    private final Map zzb;

    public zzdxy(zzdxz zzdxzVar) {
        Objects.requireNonNull(zzdxzVar);
        this.zza = zzdxzVar;
        this.zzb = new ConcurrentHashMap();
    }

    public final zzdxy zza(zzfiu zzfiuVar) {
        zzc("gqi", zzfiuVar.zzb);
        return this;
    }

    public final zzdxy zzb(zzfir zzfirVar) {
        zzc("aai", zzfirVar.zzw);
        zzc("request_id", zzfirVar.zzan);
        zzc("ad_format", zzfir.zza(zzfirVar.zzb));
        return this;
    }

    public final zzdxy zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final void zzd() {
        this.zza.zzd().execute(new zzdxx(this));
    }

    public final W5.u zze() {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzpI)).booleanValue()) {
            zzd();
            return W5.u.a;
        }
        zzdxz zzdxzVar = this.zza;
        return zzdxzVar.zzc().zzf(this.zzb);
    }

    public final void zzf() {
        this.zza.zzd().execute(new zzdxv(this));
    }

    public final String zzg() {
        return this.zza.zzc().zzc(this.zzb);
    }

    public final void zzh() {
        this.zza.zzd().execute(new zzdxw(this));
    }

    public final /* synthetic */ void zzi() {
        this.zza.zzc().zzb(this.zzb);
    }

    public final /* synthetic */ void zzj() {
        this.zza.zzc().zzg(this.zzb);
    }

    public final /* synthetic */ void zzk() {
        this.zza.zzc().zze(this.zzb);
    }

    public final /* synthetic */ zzdxy zzl() {
        this.zzb.putAll(this.zza.zze());
        return this;
    }
}

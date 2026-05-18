package com.google.android.gms.internal.ads;

import V5.F0;
import android.content.Context;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzegb {
    private final Context zza;
    private final zzgzy zzb;
    private final zzgzy zzc;
    private final zzika zzd;
    private final W5.a zze;
    private final zzefx zzf;
    private final zzdxz zzg;

    public zzegb(Context context, zzgzy zzgzyVar, zzgzy zzgzyVar2, zzika zzikaVar, W5.a aVar, zzefx zzefxVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = zzgzyVar;
        this.zzc = zzgzyVar2;
        this.zzd = zzikaVar;
        this.zze = aVar;
        this.zzf = zzefxVar;
        this.zzg = zzdxzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzc() {
        try {
            ((zzegw) this.zzd.zzb()).zzi(this.zze.a);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzpB)).booleanValue()) {
                zzdxy zza = this.zzg.zza();
                zza.zzc("action", "ptard");
                zza.zzc("ptard", "l");
                zza.zzd();
            }
        } catch (NullPointerException | RemoteException e) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzpC)).booleanValue()) {
                R5.t.l().zzg(e, "Preconnect Local");
            }
        }
    }

    public final void zza() {
        R5.t.g();
        if (F0.h(this.zza.getPackageName())) {
            this.zzc.execute(new zzefz(this));
            return;
        }
        zzefy zzefyVar = new zzefy(this);
        zzegd zzb = this.zzf.zzb();
        zzb.zzb(zzefyVar);
        zzeel zza = zzb.zza().zza();
        zzgzy zzgzyVar = this.zzb;
        Objects.requireNonNull(zza);
        zzgzyVar.execute(new zzega(zza));
    }

    public final /* synthetic */ zzdxz zzd() {
        return this.zzg;
    }
}

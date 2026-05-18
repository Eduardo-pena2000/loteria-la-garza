package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdpm implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdtk zzd;
    private final E6.f zze;
    private zzbmj zzf;
    private zzboh zzg;

    public zzdpm(zzdtk zzdtkVar, E6.f fVar) {
        this.zzd = zzdtkVar;
        this.zze = fVar;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener((View.OnClickListener) null);
        this.zzc = null;
    }

    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            Map hashMap = new HashMap();
            hashMap.put("id", this.zza);
            hashMap.put("time_interval", String.valueOf(this.zze.a() - this.zzb.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzd.zzf("sendMessageToNativeJs", hashMap);
        }
        zzd();
    }

    public final void zza(zzbmj zzbmjVar) {
        this.zzf = zzbmjVar;
        zzboh zzbohVar = this.zzg;
        if (zzbohVar != null) {
            this.zzd.zze("/unconfirmedClick", zzbohVar);
        }
        zzdpl zzdplVar = new zzdpl(this, zzbmjVar);
        this.zzg = zzdplVar;
        this.zzd.zzd("/unconfirmedClick", zzdplVar);
    }

    public final zzbmj zzb() {
        return this.zzf;
    }

    public final void zzc() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zzf();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }
}

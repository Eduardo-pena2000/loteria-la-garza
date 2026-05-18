package com.google.android.gms.internal.ads;

import S5.q2;
import V5.o0;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdpu {
    private final zzduv zza;
    private final zzdtk zzb;
    private final zzctc zzc;
    private final zzdop zzd;

    public zzdpu(zzduv zzduvVar, zzdtk zzdtkVar, zzctc zzctcVar, zzdop zzdopVar) {
        this.zza = zzduvVar;
        this.zzb = zzdtkVar;
        this.zzc = zzctcVar;
        this.zzd = zzdopVar;
    }

    public final View zza() throws zzcka {
        zzcjl zza = this.zza.zza(q2.N1(), null, null);
        zza.zzE().setVisibility(8);
        zza.zzab("/sendMessageToSdk", new zzdpt(this));
        zza.zzab("/adMuted", new zzdpo(this));
        WeakReference weakReference = new WeakReference(zza);
        zzdpp zzdppVar = new zzdpp(this);
        zzdtk zzdtkVar = this.zzb;
        zzdtkVar.zzh(weakReference, "/loadHtml", zzdppVar);
        zzdtkVar.zzh(new WeakReference(zza), "/showOverlay", new zzdpq(this));
        zzdtkVar.zzh(new WeakReference(zza), "/hideOverlay", new zzdpr(this));
        return zza.zzE();
    }

    public final /* synthetic */ void zzb(zzcjl zzcjlVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcjl zzcjlVar, Map map) {
        this.zzd.zzt();
    }

    public final /* synthetic */ void zzd(zzcjl zzcjlVar, Map map) {
        int i = o0.b;
        W5.p.e("Showing native ads overlay.");
        zzcjlVar.zzE().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zze(zzcjl zzcjlVar, Map map) {
        int i = o0.b;
        W5.p.e("Hiding native ads overlay.");
        zzcjlVar.zzE().setVisibility(8);
        this.zzc.zze(false);
    }

    public final /* synthetic */ void zzf(Map map, boolean z, int i, String str, String str2) {
        Map hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", hashMap);
    }
}

package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdyc implements zzfnv {
    private final zzdxt zzb;
    private final E6.f zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdyc(zzdxt zzdxtVar, Set set, E6.f fVar) {
        this.zzb = zzdxtVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdyb zzdybVar = (zzdyb) it.next();
            this.zzd.put(zzdybVar.zzc(), zzdybVar);
        }
        this.zzc = fVar;
    }

    private final void zze(zzfno zzfnoVar, boolean z) {
        zzdyb zzdybVar = (zzdyb) this.zzd.get(zzfnoVar);
        if (zzdybVar == null) {
            return;
        }
        String str = true != z ? "f." : "s.";
        Map map = this.zza;
        zzfno zzb = zzdybVar.zzb();
        if (map.containsKey(zzb)) {
            long b = this.zzc.b() - ((Long) map.get(zzb)).longValue();
            zzdxt zzdxtVar = this.zzb;
            String zza = zzdybVar.zza();
            Map zzc = zzdxtVar.zzc();
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2);
            sb.append(str);
            sb.append(b);
            zzc.put("label.".concat(zza), sb.toString());
        }
    }

    public final void zzdK(zzfno zzfnoVar, String str) {
    }

    public final void zzdL(zzfno zzfnoVar, String str) {
        this.zza.put(zzfnoVar, Long.valueOf(this.zzc.b()));
    }

    public final void zzdM(zzfno zzfnoVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfnoVar)) {
            long b = this.zzc.b() - ((Long) map.get(zzfnoVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(b))));
        }
        if (this.zzd.containsKey(zzfnoVar)) {
            zze(zzfnoVar, false);
        }
    }

    public final void zzdN(zzfno zzfnoVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfnoVar)) {
            long b = this.zzc.b() - ((Long) map.get(zzfnoVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(b))));
        }
        if (this.zzd.containsKey(zzfnoVar)) {
            zze(zzfnoVar, true);
        }
    }
}

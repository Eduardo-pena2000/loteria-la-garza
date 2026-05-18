package com.google.android.gms.internal.ads;

import V5.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdyk {
    private final String zze;
    private final zzdye zzf;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final q0 zza = R5.t.l().zzo();

    public zzdyk(String str, zzdye zzdyeVar) {
        this.zze = str;
        this.zzf = zzdyeVar;
    }

    private final Map zzg() {
        Map zza = this.zzf.zza();
        zza.put("tms", Long.toString(R5.t.o().b(), 10));
        zza.put("tid", this.zza.zzx() ? "" : this.zze);
        return zza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcF)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "adapter_init_started");
            zzg.put("ancn", str);
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzb(String str) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcF)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "adapter_init_finished");
            zzg.put("ancn", str);
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzc(String str, String str2) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcF)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "adapter_init_finished");
            zzg.put("ancn", str);
            zzg.put("rqe", str2);
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcF)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "aaia");
            zzg.put("aair", "MalformedJson");
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zze() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcF)).booleanValue() && !this.zzc) {
            Map zzg = zzg();
            zzg.put("action", "init_started");
            this.zzb.add(zzg);
            this.zzc = true;
        }
    }

    public final synchronized void zzf() {
        try {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzcF)).booleanValue() && !this.zzd) {
                Map zzg = zzg();
                zzg.put("action", "init_finished");
                List list = this.zzb;
                list.add(zzg);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.zzf.zzb((Map) it.next());
                }
                this.zzd = true;
            }
        } finally {
        }
    }
}

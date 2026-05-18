package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdxt {
    private final ConcurrentHashMap zza;
    private final zzcdz zzb;
    private final zzfjk zzc;
    private final String zzd;
    private final String zze;
    private final zzazh zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdxt(Context context, zzdye zzdyeVar, zzcdz zzcdzVar, zzfjk zzfjkVar, String str, String str2, zzazh zzazhVar) {
        ActivityManager.MemoryInfo n;
        ConcurrentHashMap zzd = zzdyeVar.zzd();
        this.zza = zzd;
        this.zzb = zzcdzVar;
        this.zzc = zzfjkVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzazhVar;
        this.zzh = context;
        zzd.put("ad_format", str2.toUpperCase(Locale.ROOT));
        zzg();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcK)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(R5.t.l().zzl()));
            if (((Boolean) S5.D.c().zzd(zzbhe.zzcS)).booleanValue() && (n = W5.g.n(context)) != null) {
                zzd("mem_avl", String.valueOf(n.availMem));
                zzd("mem_tt", String.valueOf(n.totalMem));
                zzd("low_m", true != n.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcU)).booleanValue()) {
            zzd("ad_unit_id", zzfjkVar.zzg);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhR)).booleanValue()) {
            int g = b6.c.g(zzfjkVar) - 1;
            if (g == 0) {
                zzd.put("request_id", str);
                zzd.put("scar", "false");
                return;
            }
            if (g == 1) {
                zzd.put("request_id", str);
                zzd.put("se", "query_g");
            } else if (g == 2) {
                zzd.put("se", "r_adinfo");
            } else if (g != 3) {
                zzd.put("se", "r_both");
            } else {
                zzd.put("se", "r_adstring");
            }
            zzd.put("scar", "true");
            zzd("ragent", zzfjkVar.zzd.p);
            zzd("rtype", b6.c.b(b6.c.c(zzfjkVar.zzd)));
        }
    }

    public final void zza(zzfjc zzfjcVar) {
        zzfjb zzfjbVar = zzfjcVar.zzb;
        List list = zzfjbVar.zza;
        if (!list.isEmpty()) {
            int i = ((zzfir) list.get(0)).zzb;
            zzd("ad_format", zzfir.zza(i));
            if (i == 6) {
                this.zza.put("as", true != this.zzb.zzl() ? "0" : "1");
            }
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcM)).booleanValue()) {
            zzd("mwl", Integer.toString(list.size()));
        }
        zzd("gqi", zzfjbVar.zzb.zzb);
    }

    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzd("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzd("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map zzc() {
        return this.zza;
    }

    public final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final Bundle zze() {
        return this.zzg;
    }

    public final void zzf() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzoL)).booleanValue()) {
            zzd("brr", true != this.zzc.zzq ? "0" : "1");
        }
    }

    public final void zzg() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkX)).booleanValue()) {
            zzazc zzb = this.zzf.zzb();
            if (zzb instanceof R5.k) {
                this.zza.put("asv", ((R5.k) zzb).c());
            } else if (zzb instanceof zzclz) {
                this.zza.put("asv", ((zzclz) zzb).zza());
            } else {
                this.zza.put("asv", "NA");
            }
        }
    }
}

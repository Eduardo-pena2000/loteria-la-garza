package com.google.android.gms.internal.ads;

import V5.F0;
import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbhh {
    private final String zza = (String) zzbiy.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbhh(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        R5.t.g();
        linkedHashMap.put("device", F0.i0());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        R5.t.g();
        linkedHashMap.put("is_lite_sdk", true != F0.j(context) ? "0" : "1");
        Future zza = R5.t.t().zza(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbzy) zza.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbzy) zza.get()).zzk));
        } catch (Exception e) {
            R5.t.l().zzg(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmN)).booleanValue()) {
            Map map = this.zzb;
            R5.t.g();
            map.put("is_bstar", true != F0.g(context) ? "0" : "1");
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkR)).booleanValue()) {
            if (!((Boolean) S5.D.c().zzd(zzbhe.zzcX)).booleanValue() || zzgrt.zzc(R5.t.l().zzu())) {
                return;
            }
            this.zzb.put("plugin", R5.t.l().zzu());
        }
    }

    public final String zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final Map zzd() {
        return this.zzb;
    }
}

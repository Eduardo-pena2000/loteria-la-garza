package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgiu implements zzfxb {
    private final Context zza;
    private final zzgmz zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    public zzgiu(Context context, zzgbf zzgbfVar, zzgmz zzgmzVar) {
        this.zza = context;
        this.zzc = zzgbfVar.zzb();
        this.zzd = zzgbfVar.zzj();
        this.zze = zzgbfVar.zzk();
        this.zzb = zzgmzVar;
    }

    public final void zza(Map map) {
        x7.e eVar;
        zzaxg zzaxgVar;
        map.put("v", this.zzc);
        map.put("t", new Throwable());
        try {
            eVar = (x7.e) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        String zzb = (eVar == null || (Build.VERSION.SDK_INT >= 31 && !eVar.isDone()) || (zzaxgVar = (zzaxg) eVar.get(this.zzd, TimeUnit.MILLISECONDS)) == null || zzaxgVar.zzb().length() <= 1) ? "E" : zzaxgVar.zzb();
        if (zzb.equals("E")) {
            try {
                x7.e eVar2 = (x7.e) map.get("ai");
                if (eVar2 != null) {
                    String str = (String) eVar2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgrt.zzc(str)) {
                        zzb = str;
                    }
                }
            } catch (InterruptedException | ExecutionException | ClassCastException | TimeoutException unused2) {
            }
        }
        map.put("int", zzb);
    }

    public final Map zzb() {
        Map zzb = this.zzb.zzb();
        zza(zzb);
        return zzb;
    }

    public final Map zzc() {
        Map zzc = this.zzb.zzc(this.zza, null);
        zza(zzc);
        return zzc;
    }

    public final Map zzd() {
        Map zzd = this.zzb.zzd();
        zza(zzd);
        return zzd;
    }

    public final Map zze() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }
}

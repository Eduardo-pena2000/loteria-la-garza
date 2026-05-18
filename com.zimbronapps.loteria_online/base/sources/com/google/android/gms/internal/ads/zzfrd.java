package com.google.android.gms.internal.ads;

import S5.W1;
import S5.Y;
import S5.g0;
import S5.i0;
import S5.k0;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfrd extends k0 {
    private final zzfrj zza;
    private final zzfqw zzb;

    public zzfrd(zzfrj zzfrjVar, zzfqw zzfqwVar) {
        this.zza = zzfrjVar;
        this.zzb = zzfqwVar;
    }

    public final void zze(List list, g0 g0Var) {
        this.zza.zza(list, g0Var);
    }

    public final boolean zzf(String str) {
        return this.zza.zzb(str);
    }

    public final zzcaz zzg(String str) {
        return this.zza.zzc(str);
    }

    public final boolean zzh(String str) {
        return this.zza.zzd(str);
    }

    public final zzbex zzi(String str) {
        return this.zza.zze(str);
    }

    public final boolean zzj(String str) {
        return this.zza.zzf(str);
    }

    public final Y zzk(String str) {
        return this.zza.zzg(str);
    }

    public final void zzl(zzbtt zzbttVar) {
    }

    public final boolean zzm(String str, W1 w1, i0 i0Var) {
        return this.zzb.zza(str, w1, i0Var);
    }

    public final boolean zzn(int i, String str) {
        L5.c a = L5.c.a(i);
        if (a == null) {
            return false;
        }
        return this.zzb.zzb(a, str);
    }

    public final Y zzo(String str) {
        return this.zzb.zze(str);
    }

    public final zzbex zzp(String str) {
        return this.zzb.zzd(str);
    }

    public final zzcaz zzq(String str) {
        return this.zzb.zzc(str);
    }

    public final W1 zzr(int i, String str) {
        L5.c a = L5.c.a(i);
        if (a == null) {
            return null;
        }
        return this.zzb.zzf(a, str);
    }

    public final Bundle zzs(int i) {
        Map zzh = this.zzb.zzh(i);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : zzh.entrySet()) {
            bundle.putByteArray((String) entry.getKey(), y6.e.d((W1) entry.getValue()));
        }
        return bundle;
    }

    public final int zzt(int i, String str) {
        L5.c a = L5.c.a(i);
        if (a == null) {
            return 0;
        }
        return this.zzb.zzg(a, str);
    }

    public final boolean zzu(int i, String str) {
        L5.c a = L5.c.a(i);
        if (a == null) {
            return false;
        }
        return this.zzb.zzi(a, str);
    }

    public final void zzv(int i) {
        this.zzb.zzj(i);
    }
}

package com.google.android.recaptcha.internal;

import Ca.I;
import Ga.e;
import cb.O;
import cb.P;
import cb.Q;
import cb.i;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzft implements zzfo {
    private final O zza;
    private final zzgf zzb;
    private final zzhx zzc;
    private final Map zzd;

    public zzft(O o, zzgf zzgfVar, zzhx zzhxVar, Map map) {
        this.zza = o;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ zzhx zzb(zzft zzftVar) {
        return zzftVar.zzc;
    }

    public static final /* synthetic */ Object zzc(zzft zzftVar, List list, zzgd zzgdVar, e eVar) {
        return zzftVar.zzg(list, zzgdVar, eVar);
    }

    public static final /* synthetic */ Object zzd(zzft zzftVar, Exception exc, zzgd zzgdVar, e eVar) {
        return zzftVar.zzh(exc, zzgdVar, eVar);
    }

    public static final /* synthetic */ void zze(zzft zzftVar, String str, String... strArr) {
        zzftVar.zzb.zzd().zzb(str, (String[]) Arrays.copyOf(strArr, 2));
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) {
        zzjh zzb = zzjh.zzb();
        int zza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar == null) {
            throw new zzce(5, 2, null);
        }
        int zzg = zzufVar.zzg();
        zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
        zzgxVar.zza(zzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
        if (zza == zzgdVar.zza()) {
            zzgdVar.zzg(zzgdVar.zza() + 1);
        }
        zzb.zzf();
        long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
        int i = zzbk.zza;
        int zzk = zzufVar.zzk();
        if (zzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbk.zza(zzk - 2, zza2);
    }

    private final Object zzg(List list, zzgd zzgdVar, e eVar) {
        Object e = P.e(new zzfq(zzgdVar, list, this, null), eVar);
        return e == Ha.c.f() ? e : I.a;
    }

    private final Object zzh(Exception exc, zzgd zzgdVar, e eVar) {
        Object e = P.e(new zzfr(exc, zzgdVar, this, null), eVar);
        return e == Ha.c.f() ? e : I.a;
    }

    public final void zza(String str) {
        i.d(this.zza, (Ga.i) null, (Q) null, new zzfs(new zzgd(this.zzb), this, str, null), 3, (Object) null);
    }
}

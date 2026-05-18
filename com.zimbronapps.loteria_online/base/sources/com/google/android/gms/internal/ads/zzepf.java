package com.google.android.gms.internal.ads;

import S5.c1;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzepf implements zzdco {
    boolean zza;
    final /* synthetic */ zzekj zzb;
    final /* synthetic */ zzcen zzc;

    public zzepf(zzepi zzepiVar, zzekj zzekjVar, zzcen zzcenVar) {
        this.zzb = zzekjVar;
        this.zzc = zzcenVar;
        Objects.requireNonNull(zzepiVar);
        this.zza = false;
    }

    private final synchronized void zze(c1 c1Var) {
        int i = 1;
        if (true == ((Boolean) S5.D.c().zzd(zzbhe.zzgy)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new zzekk(i, c1Var));
    }

    public final synchronized void zza() {
        this.zzc.zzc(null);
    }

    public final synchronized void zzb(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new c1(i, zzepi.zze(this.zzb.zza, i), "undefined", null, null));
    }

    public final synchronized void zzc(int i, String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzepi.zze(this.zzb.zza, i);
            }
            zze(new c1(i, str, "undefined", null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(c1 c1Var) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(c1Var);
    }
}

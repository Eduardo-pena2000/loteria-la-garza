package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzdsy implements S5.a, zzbmx, U5.E, zzbmz, U5.e {
    private S5.a zza;
    private zzbmx zzb;
    private U5.E zzc;
    private zzbmz zzd;
    private U5.e zze;

    public final synchronized void onAdClicked() {
        S5.a aVar = this.zza;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    public final synchronized void zza(String str, Bundle bundle) {
        zzbmx zzbmxVar = this.zzb;
        if (zzbmxVar != null) {
            zzbmxVar.zza(str, bundle);
        }
    }

    public final synchronized void zzb(String str, String str2) {
        zzbmz zzbmzVar = this.zzd;
        if (zzbmzVar != null) {
            zzbmzVar.zzb(str, str2);
        }
    }

    public final synchronized void zzdS() {
        U5.E e = this.zzc;
        if (e != null) {
            e.zzdS();
        }
    }

    public final synchronized void zzdT(int i) {
        U5.E e = this.zzc;
        if (e != null) {
            e.zzdT(i);
        }
    }

    public final void zzdo() {
        U5.E e = this.zzc;
        if (e != null) {
            e.zzdo();
        }
    }

    public final void zzdp() {
        U5.E e = this.zzc;
        if (e != null) {
            e.zzdp();
        }
    }

    public final void zzdq() {
        U5.E e = this.zzc;
        if (e != null) {
            e.zzdq();
        }
    }

    public final synchronized void zzdv() {
        U5.E e = this.zzc;
        if (e != null) {
            e.zzdv();
        }
    }

    public final synchronized void zzdw() {
        U5.E e = this.zzc;
        if (e != null) {
            e.zzdw();
        }
    }

    public final synchronized void zzdx() {
        U5.E e = this.zzc;
        if (e != null) {
            e.zzdx();
        }
    }

    public final void zzdy() {
        U5.E e = this.zzc;
        if (e != null) {
            e.zzdy();
        }
    }

    public final void zzdz() {
        U5.E e = this.zzc;
        if (e != null) {
            e.zzdz();
        }
    }

    public final synchronized void zzh() {
        U5.E e = this.zzc;
        if (e != null) {
            e.zzh();
        }
    }

    public final synchronized void zzl() {
        U5.e eVar = this.zze;
        if (eVar != null) {
            eVar.zzl();
        }
    }

    public final synchronized void zzm(S5.a aVar, zzbmx zzbmxVar, U5.E e, zzbmz zzbmzVar, U5.e eVar) {
        this.zza = aVar;
        this.zzb = zzbmxVar;
        this.zzc = e;
        this.zzd = zzbmzVar;
        this.zze = eVar;
    }
}

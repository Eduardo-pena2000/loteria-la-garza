package com.google.android.gms.internal.ads;

import S5.q2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzclv {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzclv(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzclv zza(q2 q2Var) {
        return q2Var.d ? new zzclv(3, 0, 0) : q2Var.i ? new zzclv(2, 0, 0) : q2Var.h ? new zzclv(0, 0, 0) : new zzclv(1, q2Var.f, q2Var.c);
    }

    public static zzclv zzb() {
        return new zzclv(0, 0, 0);
    }

    public static zzclv zzc(int i, int i2) {
        return new zzclv(1, i, i2);
    }

    public static zzclv zzd() {
        return new zzclv(4, 0, 0);
    }

    public static zzclv zze() {
        return new zzclv(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }
}

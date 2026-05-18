package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcdt {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzcdt() {
    }

    public final void zza() {
        long a = R5.t.o().a();
        synchronized (this.zza) {
            try {
                if (this.zzc == 3) {
                    if (this.zzb + ((Long) S5.D.c().zzd(zzbhe.zzgT)).longValue() <= a) {
                        this.zzc = 1;
                    }
                }
            } finally {
            }
        }
        long a2 = R5.t.o().a();
        synchronized (this.zza) {
            try {
                if (this.zzc != 2) {
                    return;
                }
                this.zzc = 3;
                if (this.zzc == 3) {
                    this.zzb = a2;
                }
            } finally {
            }
        }
    }

    public /* synthetic */ zzcdt(byte[] bArr) {
    }
}

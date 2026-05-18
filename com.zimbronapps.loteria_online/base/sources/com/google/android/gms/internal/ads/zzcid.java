package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcid implements zzlj {
    private final zzaat zza = new zzaat(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    public final void zza(zzpq zzpqVar) {
        zzo(false);
    }

    public final void zzb(zzli zzliVar, zzyn zzynVar, zzaac[] zzaacVarArr) {
        int i;
        this.zzf = 0;
        for (zzaac zzaacVar : zzaacVarArr) {
            if (zzaacVar != null) {
                int i2 = this.zzf;
                int i3 = zzaacVar.zza().zzc;
                if (i3 == 0) {
                    i = 144310272;
                } else if (i3 == 1) {
                    i = 13107200;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.zzf = i2 + i;
            }
        }
        this.zza.zzf(this.zzf);
    }

    public final void zzc(zzpq zzpqVar) {
        zzo(true);
    }

    public final void zzd(zzpq zzpqVar) {
        zzo(true);
    }

    public final zzaan zze(zzpq zzpqVar) {
        return this.zza;
    }

    public final long zzf(zzpq zzpqVar) {
        return 0L;
    }

    public final boolean zzg(zzpq zzpqVar) {
        return false;
    }

    public final boolean zzh(zzli zzliVar) {
        long j = zzliVar.zze;
        boolean z = true;
        char c = j > this.zzc ? (char) 0 : j < this.zzb ? (char) 2 : (char) 1;
        int zzg = this.zza.zzg();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || zzg >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    public final boolean zzi(zzli zzliVar) {
        long j = zzliVar.zzg ? this.zze : this.zzd;
        return j <= 0 || zzliVar.zze >= j;
    }

    public final synchronized void zzk(int i) {
        this.zzb = i * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zzc = i * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zze = i * 1000;
    }

    public final void zzo(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }
}

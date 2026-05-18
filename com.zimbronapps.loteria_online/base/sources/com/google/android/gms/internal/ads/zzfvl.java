package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfvl extends zzfvi {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private long zzd;
    private long zze;
    private byte zzf;

    public final zzfvi zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.zza = str;
        return this;
    }

    public final zzfvi zzb(boolean z) {
        this.zzb = z;
        this.zzf = (byte) (this.zzf | 1);
        return this;
    }

    public final zzfvi zzc(boolean z) {
        this.zzc = true;
        this.zzf = (byte) (this.zzf | 2);
        return this;
    }

    public final zzfvi zzd(boolean z) {
        this.zzf = (byte) (this.zzf | 4);
        return this;
    }

    public final zzfvi zze(long j) {
        this.zzd = 100L;
        this.zzf = (byte) (this.zzf | 8);
        return this;
    }

    public final zzfvi zzf(boolean z) {
        this.zzf = (byte) (this.zzf | 16);
        return this;
    }

    public final zzfvi zzg(long j) {
        this.zze = 300L;
        this.zzf = (byte) (this.zzf | 32);
        return this;
    }

    public final zzfvj zzh() {
        String str;
        if (this.zzf == 63 && (str = this.zza) != null) {
            return new zzfvm(str, this.zzb, this.zzc, false, this.zzd, false, this.zze, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" clientVersion");
        }
        if ((this.zzf & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.zzf & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.zzf & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.zzf & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.zzf & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.zzf & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

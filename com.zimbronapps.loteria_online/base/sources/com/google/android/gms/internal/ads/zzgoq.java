package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgoq extends zzgpr {
    private int zza;
    private String zzb;
    private int zzc;
    private byte zzd;

    public final zzgpr zza(int i) {
        this.zza = i;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    public final zzgpr zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzgpr zzc(int i) {
        this.zzc = i;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    public final zzgps zzd() {
        if (this.zzd == 3) {
            return new zzgor(this.zza, this.zzb, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzd & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

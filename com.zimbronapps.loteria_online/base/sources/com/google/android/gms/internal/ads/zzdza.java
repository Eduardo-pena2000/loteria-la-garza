package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdza extends zzdze {
    private long zza;
    private int zzb;
    private byte zzc;

    public final zzdze zza(long j) {
        this.zza = j;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    public final zzdze zzb(int i) {
        this.zzb = i;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    public final zzdzf zzc() {
        if (this.zzc == 3) {
            return new zzdzb(this.zza, this.zzb, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb.append(" id");
        }
        if ((this.zzc & 2) == 0) {
            sb.append(" eventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

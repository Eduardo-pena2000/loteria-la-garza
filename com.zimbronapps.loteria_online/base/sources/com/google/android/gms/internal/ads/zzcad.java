package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcad extends zzcaf {
    private final String zza;
    private final int zzb;

    public zzcad(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcad)) {
            return false;
        }
        zzcad zzcadVar = (zzcad) obj;
        if (com.google.android.gms.common.internal.r.b(this.zza, zzcadVar.zza)) {
            if (com.google.android.gms.common.internal.r.b(Integer.valueOf(this.zzb), Integer.valueOf(zzcadVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final String zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }
}

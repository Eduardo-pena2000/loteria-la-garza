package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfx implements zzao {
    public final float zza;
    public final float zzb;

    public zzfx(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        zzgrc.zzb(z, "Invalid latitude or longitude");
        this.zza = f;
        this.zzb = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfx.class == obj.getClass()) {
            zzfx zzfxVar = (zzfx) obj;
            if (this.zza == zzfxVar.zza && this.zzb == zzfxVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.hashCode(this.zza) + 527) * 31) + Float.hashCode(this.zzb);
    }

    public final String toString() {
        float f = this.zza;
        int length = String.valueOf(f).length();
        float f2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 26 + String.valueOf(f2).length());
        sb.append("xyz: latitude=");
        sb.append(f);
        sb.append(", longitude=");
        sb.append(f2);
        return sb.toString();
    }
}

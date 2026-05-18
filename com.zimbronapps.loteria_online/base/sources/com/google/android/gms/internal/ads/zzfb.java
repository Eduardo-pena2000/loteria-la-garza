package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfb extends IllegalStateException {
    public final int zza;
    public final int zzb;

    public zzfb(int i, int i2) {
        String sb;
        if (i == 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 46);
            sb2.append("Player stuck buffering and not loading for ");
            sb2.append(i2);
            sb2.append(" ms");
            sb = sb2.toString();
        } else if (i == 1) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 47);
            sb3.append("Player stuck buffering with no progress for ");
            sb3.append(i2);
            sb3.append(" ms");
            sb = sb3.toString();
        } else if (i == 2) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(i2).length() + 45);
            sb4.append("Player stuck playing with no progress for ");
            sb4.append(i2);
            sb4.append(" ms");
            sb = sb4.toString();
        } else if (i != 3) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(i2).length() + 31);
            sb5.append("Player stuck suppressed for ");
            sb5.append(i2);
            sb5.append(" ms");
            sb = sb5.toString();
        } else {
            StringBuilder sb6 = new StringBuilder(String.valueOf(i2).length() + 43);
            sb6.append("Player stuck playing without ending for ");
            sb6.append(i2);
            sb6.append(" ms");
            sb = sb6.toString();
        }
        super(sb);
        this.zza = i;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfb.class == obj.getClass()) {
            zzfb zzfbVar = (zzfb) obj;
            if (this.zza == zzfbVar.zza && this.zzb == zzfbVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza + 527) * 31) + this.zzb;
    }
}

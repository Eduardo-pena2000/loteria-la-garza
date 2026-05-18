package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzeij extends zzeim {
    private final String zza;
    private final String zzb;
    private final Drawable zzc;

    public zzeij(String str, String str2, Drawable drawable) {
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeim) {
            zzeim zzeimVar = (zzeim) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzeimVar.zza()) : zzeimVar.zza() == null) {
                if (this.zzb.equals(zzeimVar.zzb()) && ((drawable = this.zzc) != null ? drawable.equals(zzeimVar.zzc()) : zzeimVar.zzc() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (hashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 42 + str2.length() + 7 + length2 + 1);
        sb.append("OfflineAdAssets{advertiserName=");
        sb.append(str);
        sb.append(", imageUrl=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final Drawable zzc() {
        return this.zzc;
    }
}

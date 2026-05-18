package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhyu extends Number {
    private final String zza;

    public zzhyu(String str) {
        this.zza = str;
    }

    public final double doubleValue() {
        return Double.parseDouble(this.zza);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhyu) {
            return this.zza.equals(((zzhyu) obj).zza);
        }
        return false;
    }

    public final float floatValue() {
        return Float.parseFloat(this.zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.zza);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.zza);
            }
        } catch (NumberFormatException unused2) {
            return zzhzd.zza(this.zza).intValue();
        }
    }

    public final long longValue() {
        try {
            return Long.parseLong(this.zza);
        } catch (NumberFormatException unused) {
            return zzhzd.zza(this.zza).longValue();
        }
    }

    public final String toString() {
        return this.zza;
    }
}

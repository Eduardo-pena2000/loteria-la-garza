package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhze implements CharSequence {
    private char[] zza;
    private String zzb;

    private zzhze() {
        throw null;
    }

    public final char charAt(int i) {
        return this.zza[i];
    }

    public final int length() {
        return this.zza.length;
    }

    public final CharSequence subSequence(int i, int i2) {
        return new String(this.zza, i, i2 - i);
    }

    public final String toString() {
        if (this.zzb == null) {
            this.zzb = new String(this.zza);
        }
        return this.zzb;
    }

    public final void zza(char[] cArr) {
        this.zza = cArr;
        this.zzb = null;
    }

    public /* synthetic */ zzhze(byte[] bArr) {
    }
}

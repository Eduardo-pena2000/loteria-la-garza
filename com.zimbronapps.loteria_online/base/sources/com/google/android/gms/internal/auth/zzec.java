package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class zzec extends zzeb {
    protected final byte[] zza;

    public zzec(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzef) || zzd() != ((zzef) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzec)) {
            return obj.equals(this);
        }
        zzec zzecVar = (zzec) obj;
        int zzj = zzj();
        int zzj2 = zzecVar.zzj();
        if (zzj != 0 && zzj2 != 0 && zzj != zzj2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzecVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzecVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzecVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzecVar.zza;
        zzecVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < zzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    public final int zze(int i, int i2, int i3) {
        return zzfa.zzb(i, this.zza, 0, i3);
    }

    public final zzef zzf(int i, int i2) {
        int zzi = zzef.zzi(0, i2, zzd());
        return zzi == 0 ? zzef.zzb : new zzdz(this.zza, 0, zzi);
    }

    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    public final boolean zzh() {
        return zzhn.zzc(this.zza, 0, zzd());
    }
}

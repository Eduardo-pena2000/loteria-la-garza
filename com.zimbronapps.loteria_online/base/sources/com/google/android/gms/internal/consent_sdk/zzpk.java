package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
class zzpk extends zzpj {
    protected final byte[] zza;

    public zzpk(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
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
        return zzqs.zzb(i, this.zza, 0, i3);
    }

    public final zzpm zzf(int i, int i2) {
        zzpm.zzi(0, 47, zzd());
        return new zzph(this.zza, 0, 47);
    }

    public final void zzg(zzpe zzpeVar) throws IOException {
        zzpeVar.zza(this.zza, 0, zzd());
    }

    public final boolean zzh(zzpm zzpmVar) {
        if (!(zzpmVar instanceof zzpk)) {
            return zzpmVar.zzh(this);
        }
        int zzd = zzd();
        if (zzd > zzpmVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzpmVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzpmVar.zzd());
        }
        zzpk zzpkVar = (zzpk) zzpmVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzpkVar.zza;
        zzpkVar.zzc();
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
}

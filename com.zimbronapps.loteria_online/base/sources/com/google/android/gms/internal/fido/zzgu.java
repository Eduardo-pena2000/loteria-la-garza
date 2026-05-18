package com.google.android.gms.internal.fido;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
class zzgu extends zzgt {
    protected final byte[] zza;

    public zzgu(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgx) || zzd() != ((zzgx) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgu)) {
            return obj.equals(this);
        }
        zzgu zzguVar = (zzgu) obj;
        int zzk = zzk();
        int zzk2 = zzguVar.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzguVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzguVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzguVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzguVar.zza;
        int zzc = zzc() + zzd;
        int zzc2 = zzc();
        int zzc3 = zzguVar.zzc();
        while (zzc2 < zzc) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
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

    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    public final int zzf(int i, int i2, int i3) {
        int zzc = zzc();
        byte[] bArr = zzhc.zzd;
        for (int i4 = zzc; i4 < zzc + i3; i4++) {
            i = (i * 31) + this.zza[i4];
        }
        return i;
    }

    public final zzgx zzg(int i, int i2) {
        int zzj = zzgx.zzj(i, i2, zzd());
        return zzj == 0 ? zzgx.zzb : new zzgr(this.zza, zzc() + i, zzj);
    }

    public final InputStream zzh() {
        return new ByteArrayInputStream(this.zza, zzc(), zzd());
    }

    public final ByteBuffer zzi() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }
}

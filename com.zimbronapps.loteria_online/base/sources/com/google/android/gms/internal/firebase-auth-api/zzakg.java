package com.google.android.gms.internal.firebase-auth-api;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
class zzakg extends zzakd {
    protected final byte[] zzb;

    public zzakg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzajv) || zzb() != ((zzajv) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzakg)) {
            return obj.equals(this);
        }
        zzakg zzakgVar = (zzakg) obj;
        int zza = zza();
        int zza2 = zzakgVar.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzakgVar, 0, zzb());
        }
        return false;
    }

    public byte zza(int i) {
        return this.zzb[i];
    }

    public byte zzb(int i) {
        return this.zzb[i];
    }

    public final zzakh zzc() {
        return zzakh.zza(this.zzb, zze(), zzb(), true);
    }

    public int zze() {
        return 0;
    }

    public final zzajv zza(int i, int i2) {
        int zza = zzajv.zza(0, i2, zzb());
        return zza == 0 ? zzajv.zza : new zzajz(this.zzb, zze(), zza);
    }

    public final int zzb(int i, int i2, int i3) {
        return zzalh.zza(i, this.zzb, zze(), i3);
    }

    public int zzb() {
        return this.zzb.length;
    }

    public void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, 0, bArr, 0, i3);
    }

    public final void zza(zzajw zzajwVar) throws IOException {
        zzajwVar.zza(this.zzb, zze(), zzb());
    }

    public final boolean zza(zzajv zzajvVar, int i, int i2) {
        if (i2 <= zzajvVar.zzb()) {
            if (i2 <= zzajvVar.zzb()) {
                if (zzajvVar instanceof zzakg) {
                    zzakg zzakgVar = (zzakg) zzajvVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzakgVar.zzb;
                    int zze = zze() + i2;
                    int zze2 = zze();
                    int zze3 = zzakgVar.zze();
                    while (zze2 < zze) {
                        if (bArr[zze2] != bArr2[zze3]) {
                            return false;
                        }
                        zze2++;
                        zze3++;
                    }
                    return true;
                }
                return zzajvVar.zza(0, i2).equals(zza(0, i2));
            }
            throw new IllegalArgumentException("Ran off end of other: 0, " + i2 + ", " + zzajvVar.zzb());
        }
        throw new IllegalArgumentException("Length too large: " + i2 + zzb());
    }
}

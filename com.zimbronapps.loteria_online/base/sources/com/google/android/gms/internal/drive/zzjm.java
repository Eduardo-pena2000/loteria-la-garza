package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
class zzjm extends zzjl {
    protected final byte[] zzny;

    public zzjm(byte[] bArr) {
        bArr.getClass();
        this.zzny = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjc) || size() != ((zzjc) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzjm)) {
            return obj.equals(this);
        }
        zzjm zzjmVar = (zzjm) obj;
        int zzbv = zzbv();
        int zzbv2 = zzjmVar.zzbv();
        if (zzbv == 0 || zzbv2 == 0 || zzbv == zzbv2) {
            return zza(zzjmVar, 0, size());
        }
        return false;
    }

    public int size() {
        return this.zzny.length;
    }

    public final zzjc zza(int i, int i2) {
        int zzb = zzjc.zzb(0, i2, size());
        return zzb == 0 ? zzjc.zznq : new zzjh(this.zzny, zzbw(), zzb);
    }

    public final boolean zzbu() {
        int zzbw = zzbw();
        return zznf.zze(this.zzny, zzbw, size() + zzbw);
    }

    public int zzbw() {
        return 0;
    }

    public byte zzs(int i) {
        return this.zzny[i];
    }

    public byte zzt(int i) {
        return this.zzny[i];
    }

    public final void zza(zzjb zzjbVar) throws IOException {
        zzjbVar.zza(this.zzny, zzbw(), size());
    }

    public final String zza(Charset charset) {
        return new String(this.zzny, zzbw(), size(), charset);
    }

    public final boolean zza(zzjc zzjcVar, int i, int i2) {
        if (i2 <= zzjcVar.size()) {
            if (i2 <= zzjcVar.size()) {
                if (zzjcVar instanceof zzjm) {
                    zzjm zzjmVar = (zzjm) zzjcVar;
                    byte[] bArr = this.zzny;
                    byte[] bArr2 = zzjmVar.zzny;
                    int zzbw = zzbw() + i2;
                    int zzbw2 = zzbw();
                    int zzbw3 = zzjmVar.zzbw();
                    while (zzbw2 < zzbw) {
                        if (bArr[zzbw2] != bArr2[zzbw3]) {
                            return false;
                        }
                        zzbw2++;
                        zzbw3++;
                    }
                    return true;
                }
                return zzjcVar.zza(0, i2).equals(zza(0, i2));
            }
            int size = zzjcVar.size();
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ran off end of other: 0, ");
            sb.append(i2);
            sb.append(", ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        int size2 = size();
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Length too large: ");
        sb2.append(i2);
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final int zza(int i, int i2, int i3) {
        return zzkm.zza(i, this.zzny, zzbw(), i3);
    }
}

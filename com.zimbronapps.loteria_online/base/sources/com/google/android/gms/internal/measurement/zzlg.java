package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
class zzlg extends zzlf {
    protected final byte[] zza;

    public zzlg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlh) || zzc() != ((zzlh) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzlg)) {
            return obj.equals(this);
        }
        zzlg zzlgVar = (zzlg) obj;
        int zzi = zzi();
        int zzi2 = zzlgVar.zzi();
        if (zzi != 0 && zzi2 != 0 && zzi != zzi2) {
            return false;
        }
        int zzc = zzc();
        if (zzc > zzlgVar.zzc()) {
            int zzc2 = zzc();
            StringBuilder sb = new StringBuilder(String.valueOf(zzc).length() + 18 + String.valueOf(zzc2).length());
            sb.append("Length too large: ");
            sb.append(zzc);
            sb.append(zzc2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (zzc > zzlgVar.zzc()) {
            int zzc3 = zzlgVar.zzc();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzc).length() + 27 + String.valueOf(zzc3).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(zzc);
            sb2.append(", ");
            sb2.append(zzc3);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlgVar.zza;
        zzlgVar.zzd();
        int i = 0;
        int i2 = 0;
        while (i < zzc) {
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
        return this.zza.length;
    }

    public int zzd() {
        return 0;
    }

    public final zzlh zze(int i, int i2) {
        int zzj = zzlh.zzj(0, i2, zzc());
        return zzj == 0 ? zzlh.zzb : new zzlc(this.zza, 0, zzj);
    }

    public final void zzf(zzkz zzkzVar) throws IOException {
        ((zzlk) zzkzVar).zzv(this.zza, 0, zzc());
    }

    public final int zzg(int i, int i2, int i3) {
        return zzmp.zzc(i, this.zza, 0, i3);
    }
}

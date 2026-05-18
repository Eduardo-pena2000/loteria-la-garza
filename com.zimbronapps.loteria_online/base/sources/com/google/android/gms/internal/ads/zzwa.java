package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzwa implements zzhb {
    private final zzhb zza;
    private final int zzb;
    private final zzvz zzc;
    private final byte[] zzd;
    private int zze;

    public zzwa(zzhb zzhbVar, int i, zzvz zzvzVar) {
        zzgrc.zza(i > 0);
        this.zza = zzhbVar;
        this.zzb = i;
        this.zzc = zzvzVar;
        this.zzd = new byte[1];
        this.zze = i;
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zze;
        if (i3 == 0) {
            zzhb zzhbVar = this.zza;
            byte[] bArr2 = this.zzd;
            int i4 = 0;
            if (zzhbVar.zza(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int zza = zzhbVar.zza(bArr3, i4, i6);
                        if (zza != -1) {
                            i4 += zza;
                            i6 -= zza;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr3[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.zzc.zza(new zzer(bArr3, i5));
                    }
                }
                i3 = this.zzb;
                this.zze = i3;
            }
            return -1;
        }
        int zza2 = this.zza.zza(bArr, i, Math.min(i3, i2));
        if (zza2 != -1) {
            this.zze -= zza2;
        }
        return zza2;
    }

    public final long zzb(zzhf zzhfVar) {
        throw new UnsupportedOperationException();
    }

    public final Uri zzc() {
        return this.zza.zzc();
    }

    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        this.zza.zze(zzhzVar);
    }

    public final Map zzj() {
        return this.zza.zzj();
    }
}

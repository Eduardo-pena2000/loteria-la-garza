package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaji {
    private final zzer zza = new zzer(8);
    private int zzb;

    private final long zzb(zzaev zzaevVar) throws IOException {
        int i;
        zzer zzerVar = this.zza;
        zzael zzaelVar = (zzael) zzaevVar;
        int i2 = 0;
        zzaelVar.zzh(zzerVar.zzi(), 0, 1, false);
        int i3 = zzerVar.zzi()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        zzaelVar.zzh(zzerVar.zzi(), 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (zzerVar.zzi()[i2] & 255) + (i6 << 8);
        }
        this.zzb += i;
        return i6;
    }

    public final boolean zza(zzaev zzaevVar) throws IOException {
        long zzo = zzaevVar.zzo();
        long j = 1024;
        if (zzo != -1 && zzo <= 1024) {
            j = zzo;
        }
        zzer zzerVar = this.zza;
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long zzz = zzerVar.zzz(); zzz != 440786851; zzz = ((zzz << 8) & (-256)) | (zzerVar.zzi()[0] & 255)) {
            int i = (int) j;
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzaelVar.zzh(zzerVar.zzi(), 0, 1, false);
        }
        long zzb = zzb(zzaevVar);
        long j2 = this.zzb;
        if (zzb != Long.MIN_VALUE) {
            long j3 = j2 + zzb;
            if (zzo == -1 || j3 < zzo) {
                while (true) {
                    long j4 = this.zzb;
                    if (j4 < j3) {
                        if (zzb(zzaevVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long zzb2 = zzb(zzaevVar);
                        if (zzb2 < 0) {
                            return false;
                        }
                        if (zzb2 != 0) {
                            int i3 = (int) zzb2;
                            zzaelVar.zzj(i3, false);
                            this.zzb += i3;
                        }
                    } else if (j4 == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

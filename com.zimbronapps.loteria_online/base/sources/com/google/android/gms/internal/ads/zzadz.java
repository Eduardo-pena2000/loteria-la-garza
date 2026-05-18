package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzadz {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzadz(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = i9;
        this.zzk = f;
        this.zzl = str;
    }

    public static zzadz zza(zzer zzerVar) throws zzat {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str;
        float f;
        try {
            zzerVar.zzk(4);
            int zzs = (zzerVar.zzs() & 3) + 1;
            if (zzs == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int zzs2 = zzerVar.zzs() & 31;
            for (int i9 = 0; i9 < zzs2; i9++) {
                arrayList.add(zzb(zzerVar));
            }
            int zzs3 = zzerVar.zzs();
            for (int i10 = 0; i10 < zzs3; i10++) {
                arrayList.add(zzb(zzerVar));
            }
            if (zzs2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = zzgm.zza;
                zzgl zze = zzgm.zze(bArr2, 5, bArr.length);
                int i11 = zze.zze;
                int i12 = zze.zzf;
                int i13 = zze.zzh + 8;
                int i14 = zze.zzi + 8;
                int i15 = zze.zzj;
                int i16 = zze.zzk;
                int i17 = zze.zzl;
                int i18 = zze.zzm;
                float f2 = zze.zzg;
                str = zzdo.zza(zze.zza, zze.zzb, zze.zzc);
                i7 = i17;
                i8 = i18;
                f = f2;
                i4 = i14;
                i5 = i15;
                i6 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = 16;
                str = null;
                f = 1.0f;
            }
            return new zzadz(arrayList, zzs, i, i2, i3, i4, i5, i6, i7, i8, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzat.zzb("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzer zzerVar) {
        int zzt = zzerVar.zzt();
        int zzg = zzerVar.zzg();
        zzerVar.zzk(zzt);
        return zzdo.zzf(zzerVar.zzi(), zzg, zzt);
    }
}

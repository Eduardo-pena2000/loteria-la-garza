package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzaag extends zzaaj {
    public abstract Pair zzh(zzaaf zzaafVar, int[][][] iArr, int[] iArr2, zzwk zzwkVar, zzbf zzbfVar) throws zziw;

    public final void zzp(Object obj) {
    }

    public final zzaak zzq(zzmn[] zzmnVarArr, zzyn zzynVar, zzwk zzwkVar, zzbf zzbfVar) throws zziw {
        List[] listArr;
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzynVar.zzb;
            zzbgVarArr[i] = new zzbg[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzmnVarArr[i4].zzu();
        }
        int i5 = 0;
        while (i5 < zzynVar.zzb) {
            zzbg zza = zzynVar.zza(i5);
            int i6 = zza.zzc;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                zzmn zzmnVar = zzmnVarArr[i8];
                int i10 = 0;
                for (int i11 = 0; i11 < zza.zza; i11++) {
                    i10 = Math.max(i10, zzmnVar.zzab(zza.zza(i11)) & 7);
                }
                boolean z3 = iArr2[i8] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = i10;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[zza.zza];
            } else {
                zzmn zzmnVar2 = zzmnVarArr[i7];
                int i12 = zza.zza;
                int[] iArr5 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr5[i13] = zzmnVar2.zzab(zza.zza(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i7];
            zzbgVarArr[i7][i14] = zza;
            iArr3[i7][i14] = iArr;
            iArr2[i7] = i14 + 1;
            i5++;
            i3 = 2;
        }
        int i15 = i3;
        boolean z4 = true;
        zzyn[] zzynVarArr = new zzyn[i15];
        String[] strArr = new String[i15];
        int[] iArr6 = new int[i15];
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr2[i16];
            zzynVarArr[i16] = new zzyn((zzbg[]) zzfj.zzb(zzbgVarArr[i16], i17));
            iArr3[i16] = (int[][]) zzfj.zzb(iArr3[i16], i17);
            strArr[i16] = zzmnVarArr[i16].zzS();
            iArr6[i16] = zzmnVarArr[i16].zza();
            i16++;
            i15 = 2;
        }
        int i18 = i15;
        zzaaf zzaafVar = new zzaaf(strArr, iArr6, zzynVarArr, iArr4, iArr3, new zzyn((zzbg[]) zzfj.zzb(zzbgVarArr[i18], iArr2[i18])));
        Pair zzh = zzh(zzaafVar, iArr3, iArr4, zzwkVar, zzbfVar);
        zzaah[] zzaahVarArr = (zzaah[]) zzh.second;
        List[] listArr2 = new List[zzaahVarArr.length];
        for (int i19 = 0; i19 < zzaahVarArr.length; i19++) {
            zzaah zzaahVar = zzaahVarArr[i19];
            listArr2[i19] = zzaahVar != null ? zzguf.zzj(zzaahVar) : zzguf.zzi();
        }
        zzguc zzgucVar = new zzguc();
        int i20 = 0;
        for (int i21 = 2; i20 < i21; i21 = 2) {
            zzyn zzb = zzaafVar.zzb(i20);
            List list = listArr2[i20];
            int i22 = 0;
            while (i22 < zzb.zzb) {
                zzbg zza2 = zzb.zza(i22);
                boolean z5 = zzaafVar.zzd(i20, i22, false) != 0 ? z4 : false;
                int i23 = zza2.zza;
                int[] iArr7 = new int[i23];
                boolean[] zArr = new boolean[i23];
                int i24 = 0;
                while (i24 < i23) {
                    iArr7[i24] = zzaafVar.zzc(i20, i22, i24) & 7;
                    int i25 = 0;
                    while (true) {
                        if (i25 >= list.size()) {
                            listArr = listArr2;
                            z = false;
                            break;
                        }
                        zzaah zzaahVar2 = (zzaah) list.get(i25);
                        listArr = listArr2;
                        if (zzaahVar2.zza().equals(zza2) && zzaahVar2.zzg(i24) != -1) {
                            z = true;
                            break;
                        }
                        i25++;
                        listArr2 = listArr;
                    }
                    zArr[i24] = z;
                    i24++;
                    listArr2 = listArr;
                }
                zzgucVar.zzf(new zzbm(zza2, z5, iArr7, zArr));
                i22++;
                z4 = true;
            }
            i20++;
            z4 = true;
        }
        zzyn zze = zzaafVar.zze();
        for (int i26 = 0; i26 < zze.zzb; i26++) {
            zzbg zza3 = zze.zza(i26);
            int i27 = zza3.zza;
            int[] iArr8 = new int[i27];
            Arrays.fill(iArr8, 0);
            zzgucVar.zzf(new zzbm(zza3, false, iArr8, new boolean[i27]));
        }
        return new zzaak((zzmo[]) zzh.first, (zzaac[]) zzh.second, new zzbn(zzgucVar.zzi()), zzaafVar);
    }
}

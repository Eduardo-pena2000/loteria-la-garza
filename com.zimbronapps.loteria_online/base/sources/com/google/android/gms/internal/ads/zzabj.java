package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzabj {
    private static final Comparator zza = zzabi.zza;
    private static final Comparator zzb = zzabh.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzabg[] zzd = new zzabg[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzabj(int i) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i, float f) {
        zzabg zzabgVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzabg[] zzabgVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzabgVar = zzabgVarArr[i3];
        } else {
            zzabgVar = new zzabg(null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzabgVar.zza = i4;
        zzabgVar.zzb = i;
        zzabgVar.zzc = f;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzabgVar);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            zzabg zzabgVar2 = (zzabg) arrayList.get(0);
            int i7 = zzabgVar2.zzb;
            if (i7 <= i6) {
                this.zzg -= i7;
                arrayList.remove(0);
                int i8 = this.zzh;
                if (i8 < 5) {
                    zzabg[] zzabgVarArr2 = this.zzd;
                    this.zzh = i8 + 1;
                    zzabgVarArr2[i8] = zzabgVar2;
                }
            } else {
                zzabgVar2.zzb = i7 - i6;
                this.zzg -= i6;
            }
        }
    }

    public final float zzc(float f) {
        int i = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzabg) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f3 = 0.5f * f2;
            zzabg zzabgVar = (zzabg) arrayList.get(i);
            i2 += zzabgVar.zzb;
            if (i2 >= f3) {
                return zzabgVar.zzc;
            }
            i++;
        }
    }
}

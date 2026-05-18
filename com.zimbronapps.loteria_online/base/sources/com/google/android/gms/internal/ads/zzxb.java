package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzxb extends zzvs {
    private static final zzak zza;
    private final zzwm[] zzb;
    private final List zzc;
    private final zzbf[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzwz zzh;
    private final zzvv zzi;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("MergingMediaSource");
        zza = zzzVar.zzc();
    }

    public zzxb(boolean z, boolean z2, zzvv zzvvVar, zzwm... zzwmVarArr) {
        this.zzb = zzwmVarArr;
        this.zzi = zzvvVar;
        this.zze = new ArrayList(Arrays.asList(zzwmVarArr));
        this.zzc = new ArrayList(zzwmVarArr.length);
        int i = 0;
        while (true) {
            int length = zzwmVarArr.length;
            if (i >= length) {
                this.zzd = new zzbf[length];
                this.zzg = new long[0][];
                new HashMap();
                zzgvu.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new ArrayList());
            i++;
        }
    }

    public final void zzA(zzak zzakVar) {
        this.zzb[0].zzA(zzakVar);
    }

    public final void zzD(zzwi zzwiVar) {
        zzwy zzwyVar = (zzwy) zzwiVar;
        int i = 0;
        while (true) {
            zzwm[] zzwmVarArr = this.zzb;
            if (i >= zzwmVarArr.length) {
                return;
            }
            List list = (List) this.zzc.get(i);
            zzwi zza2 = zzwyVar.zza(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((zzxa) list.get(i2)).zzb().equals(zza2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            zzwmVarArr[i].zzD(zzwyVar.zza(i));
            i++;
        }
    }

    public final zzwi zzG(zzwk zzwkVar, zzaan zzaanVar, long j) {
        zzbf[] zzbfVarArr = this.zzd;
        zzwm[] zzwmVarArr = this.zzb;
        int length = zzwmVarArr.length;
        zzwi[] zzwiVarArr = new zzwi[length];
        int zze = zzbfVarArr[0].zze(zzwkVar.zza);
        for (int i = 0; i < length; i++) {
            zzwk zza2 = zzwkVar.zza(zzbfVarArr[i].zzf(zze));
            zzwiVarArr[i] = zzwmVarArr[i].zzG(zza2, zzaanVar, j - this.zzg[zze][i]);
            ((List) this.zzc.get(i)).add(new zzxa(zza2, zzwiVarArr[i], null));
        }
        return new zzwy(this.zzi, this.zzg[zze], zzwiVarArr);
    }

    public final zzak zzJ() {
        zzwm[] zzwmVarArr = this.zzb;
        return zzwmVarArr.length > 0 ? zzwmVarArr[0].zzJ() : zza;
    }

    public final void zza(zzhz zzhzVar) {
        super.zza(zzhzVar);
        int i = 0;
        while (true) {
            zzwm[] zzwmVarArr = this.zzb;
            if (i >= zzwmVarArr.length) {
                return;
            }
            zzv(Integer.valueOf(i), zzwmVarArr[i]);
            i++;
        }
    }

    public final void zzd() {
        super.zzd();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        ArrayList arrayList = this.zze;
        arrayList.clear();
        Collections.addAll(arrayList, this.zzb);
    }

    public final void zzt() throws IOException {
        zzwz zzwzVar = this.zzh;
        if (zzwzVar != null) {
            throw zzwzVar;
        }
        super.zzt();
    }

    public final /* bridge */ /* synthetic */ void zzu(Object obj, zzwm zzwmVar, zzbf zzbfVar) {
        int i;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            i = zzbfVar.zzc();
            this.zzf = i;
        } else {
            int zzc = zzbfVar.zzc();
            int i2 = this.zzf;
            if (zzc != i2) {
                this.zzh = new zzwz(0);
                return;
            }
            i = i2;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance(Long.TYPE, new int[]{i, this.zzd.length});
        }
        ArrayList arrayList = this.zze;
        arrayList.remove(zzwmVar);
        zzbf[] zzbfVarArr = this.zzd;
        zzbfVarArr[num.intValue()] = zzbfVar;
        if (arrayList.isEmpty()) {
            zze(zzbfVarArr[0]);
        }
    }

    public final /* bridge */ /* synthetic */ zzwk zzx(Object obj, zzwk zzwkVar) {
        int intValue = ((Integer) obj).intValue();
        List list = this.zzc;
        List list2 = (List) list.get(intValue);
        for (int i = 0; i < list2.size(); i++) {
            if (((zzxa) list2.get(i)).zza().equals(zzwkVar)) {
                return ((zzxa) ((List) list.get(0)).get(i)).zza();
            }
        }
        return null;
    }
}

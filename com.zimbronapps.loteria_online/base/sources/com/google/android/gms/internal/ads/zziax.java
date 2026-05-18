package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zziax implements zzieu {
    private final zziaw zza;

    private zziax(zziaw zziawVar) {
        zzice.zza(zziawVar, "output");
        this.zza = zziawVar;
        zziawVar.zze = this;
    }

    public static zziax zza(zziaw zziawVar) {
        Object obj = zziawVar.zze;
        return obj != null ? (zziax) obj : new zziax(zziawVar);
    }

    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzicq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z) {
            while (i2 < zzicqVar.size()) {
                this.zza.zzh(i, zzicqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzicqVar.size(); i6++) {
            zzicqVar.zzc(i6);
            i5 += 8;
        }
        zziawVar2.zzs(i5);
        while (i2 < zzicqVar.size()) {
            zziawVar2.zzv(zzicqVar.zzc(i2));
            i2++;
        }
    }

    public final void zzB(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzibi)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzt(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzibi zzibiVar = (zzibi) list;
        if (!z) {
            while (i2 < zzibiVar.size()) {
                this.zza.zzK(i, Float.floatToRawIntBits(zzibiVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzibiVar.size(); i6++) {
            zzibiVar.zzf(i6);
            i5 += 4;
        }
        zziawVar2.zzs(i5);
        while (i2 < zzibiVar.size()) {
            zziawVar2.zzt(Float.floatToRawIntBits(zzibiVar.zzf(i2)));
            i2++;
        }
    }

    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zziay)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzv(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zziay zziayVar = (zziay) list;
        if (!z) {
            while (i2 < zziayVar.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(zziayVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zziayVar.size(); i6++) {
            zziayVar.zzf(i6);
            i5 += 8;
        }
        zziawVar2.zzs(i5);
        while (i2 < zziayVar.size()) {
            zziawVar2.zzv(Double.doubleToRawLongBits(zziayVar.zzf(i2)));
            i2++;
        }
    }

    public final void zzD(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzibs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzI(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zziaw.zzB(((Integer) list.get(i4)).intValue());
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z) {
            while (i2 < zzibsVar.size()) {
                this.zza.zzI(i, zzibsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzibsVar.size(); i6++) {
            i5 += zziaw.zzB(zzibsVar.zzf(i6));
        }
        zziawVar2.zzs(i5);
        while (i2 < zzibsVar.size()) {
            zziawVar2.zzr(zzibsVar.zzf(i2));
            i2++;
        }
    }

    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zziad)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzq(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zziad zziadVar = (zziad) list;
        if (!z) {
            while (i2 < zziadVar.size()) {
                this.zza.zzi(i, zziadVar.zzf(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zziadVar.size(); i6++) {
            zziadVar.zzf(i6);
            i5++;
        }
        zziawVar2.zzs(i5);
        while (i2 < zziadVar.size()) {
            zziawVar2.zzq(zziadVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public final void zzF(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzicn)) {
            while (i2 < list.size()) {
                this.zza.zzj(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzicn zzicnVar = (zzicn) list;
        while (i2 < list.size()) {
            Object zzc = zzicnVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzj(i, (String) zzc);
            } else {
                this.zza.zzk(i, (zzian) zzc);
            }
            i2++;
        }
    }

    public final void zzG(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzk(i, (zzian) list.get(i2));
        }
    }

    public final void zzH(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzibs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzJ(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zziaw.zzA(((Integer) list.get(i4)).intValue());
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z) {
            while (i2 < zzibsVar.size()) {
                this.zza.zzJ(i, zzibsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzibsVar.size(); i6++) {
            i5 += zziaw.zzA(zzibsVar.zzf(i6));
        }
        zziawVar2.zzs(i5);
        while (i2 < zzibsVar.size()) {
            zziawVar2.zzs(zzibsVar.zzf(i2));
            i2++;
        }
    }

    public final void zzI(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzibs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z) {
            while (i2 < zzibsVar.size()) {
                this.zza.zzK(i, zzibsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzibsVar.size(); i6++) {
            zzibsVar.zzf(i6);
            i5 += 4;
        }
        zziawVar2.zzs(i5);
        while (i2 < zzibsVar.size()) {
            zziawVar2.zzt(zzibsVar.zzf(i2));
            i2++;
        }
    }

    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzicq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z) {
            while (i2 < zzicqVar.size()) {
                this.zza.zzh(i, zzicqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzicqVar.size(); i6++) {
            zzicqVar.zzc(i6);
            i5 += 8;
        }
        zziawVar2.zzs(i5);
        while (i2 < zzicqVar.size()) {
            zziawVar2.zzv(zzicqVar.zzc(i2));
            i2++;
        }
    }

    public final void zzK(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzibs)) {
            if (!z) {
                while (i2 < list.size()) {
                    zziaw zziawVar = this.zza;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zziawVar.zzJ(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zziaw zziawVar2 = this.zza;
            zziawVar2.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zziaw.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zziawVar2.zzs(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zziawVar2.zzs((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z) {
            while (i2 < zzibsVar.size()) {
                zziaw zziawVar3 = this.zza;
                int zzf = zzibsVar.zzf(i2);
                zziawVar3.zzJ(i, (zzf >> 31) ^ (zzf + zzf));
                i2++;
            }
            return;
        }
        zziaw zziawVar4 = this.zza;
        zziawVar4.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzibsVar.size(); i6++) {
            int zzf2 = zzibsVar.zzf(i6);
            i5 += zziaw.zzA((zzf2 >> 31) ^ (zzf2 + zzf2));
        }
        zziawVar4.zzs(i5);
        while (i2 < zzibsVar.size()) {
            int zzf3 = zzibsVar.zzf(i2);
            zziawVar4.zzs((zzf3 >> 31) ^ (zzf3 + zzf3));
            i2++;
        }
    }

    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzicq)) {
            if (!z) {
                while (i2 < list.size()) {
                    zziaw zziawVar = this.zza;
                    long longValue = ((Long) list.get(i2)).longValue();
                    zziawVar.zzL(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            zziaw zziawVar2 = this.zza;
            zziawVar2.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zziaw.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zziawVar2.zzs(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zziawVar2.zzu((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z) {
            while (i2 < zzicqVar.size()) {
                zziaw zziawVar3 = this.zza;
                long zzc = zzicqVar.zzc(i2);
                zziawVar3.zzL(i, (zzc >> 63) ^ (zzc + zzc));
                i2++;
            }
            return;
        }
        zziaw zziawVar4 = this.zza;
        zziawVar4.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzicqVar.size(); i6++) {
            long zzc2 = zzicqVar.zzc(i6);
            i5 += zziaw.zzB((zzc2 >> 63) ^ (zzc2 + zzc2));
        }
        zziawVar4.zzs(i5);
        while (i2 < zzicqVar.size()) {
            long zzc3 = zzicqVar.zzc(i2);
            zziawVar4.zzu((zzc3 >> 63) ^ (zzc3 + zzc3));
            i2++;
        }
    }

    public final void zzM(int i, zzicu zzicuVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            zziawVar.zzs(zzicv.zzc(zzicuVar, entry.getKey(), entry.getValue()));
            zzicv.zzb(zziawVar, zzicuVar, entry.getKey(), entry.getValue());
        }
    }

    public final void zzb(int i, int i2) throws IOException {
        this.zza.zzK(i, i2);
    }

    public final void zzc(int i, long j) throws IOException {
        this.zza.zzL(i, j);
    }

    public final void zzd(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    public final void zze(int i, float f) throws IOException {
        this.zza.zzK(i, Float.floatToRawIntBits(f));
    }

    public final void zzf(int i, double d) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    public final void zzg(int i, int i2) throws IOException {
        this.zza.zzI(i, i2);
    }

    public final void zzh(int i, long j) throws IOException {
        this.zza.zzL(i, j);
    }

    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzI(i, i2);
    }

    public final void zzj(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzK(i, i2);
    }

    public final void zzl(int i, boolean z) throws IOException {
        this.zza.zzi(i, z);
    }

    public final void zzm(int i, String str) throws IOException {
        this.zza.zzj(i, str);
    }

    public final void zzn(int i, zzian zzianVar) throws IOException {
        this.zza.zzk(i, zzianVar);
    }

    public final void zzo(int i, int i2) throws IOException {
        this.zza.zzJ(i, i2);
    }

    public final void zzp(int i, int i2) throws IOException {
        this.zza.zzJ(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void zzq(int i, long j) throws IOException {
        this.zza.zzL(i, (j >> 63) ^ (j + j));
    }

    public final void zzr(int i, Object obj, zzidu zziduVar) throws IOException {
        zziaw zziawVar = this.zza;
        zzhzw zzhzwVar = (zzhzw) obj;
        zziawVar.zzH(i, 2);
        zziawVar.zzs(zzhzwVar.zzaT(zziduVar));
        zziduVar.zzf(zzhzwVar, this);
    }

    public final void zzs(int i, Object obj, zzidu zziduVar) throws IOException {
        zziaw zziawVar = this.zza;
        zziawVar.zzH(i, 3);
        zziduVar.zzf((zzhzw) obj, this);
        zziawVar.zzH(i, 4);
    }

    @Deprecated
    public final void zzt(int i) throws IOException {
        this.zza.zzH(i, 3);
    }

    @Deprecated
    public final void zzu(int i) throws IOException {
        this.zza.zzH(i, 4);
    }

    public final void zzv(int i, Object obj) throws IOException {
        if (obj instanceof zzian) {
            this.zza.zzo(i, (zzian) obj);
        } else {
            this.zza.zzn(i, (zzidc) obj);
        }
    }

    public final void zzw(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzibs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzI(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zziaw.zzB(((Integer) list.get(i4)).intValue());
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z) {
            while (i2 < zzibsVar.size()) {
                this.zza.zzI(i, zzibsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzibsVar.size(); i6++) {
            i5 += zziaw.zzB(zzibsVar.zzf(i6));
        }
        zziawVar2.zzs(i5);
        while (i2 < zzibsVar.size()) {
            zziawVar2.zzr(zzibsVar.zzf(i2));
            i2++;
        }
    }

    public final void zzx(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzibs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z) {
            while (i2 < zzibsVar.size()) {
                this.zza.zzK(i, zzibsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzibsVar.size(); i6++) {
            zzibsVar.zzf(i6);
            i5 += 4;
        }
        zziawVar2.zzs(i5);
        while (i2 < zzibsVar.size()) {
            zziawVar2.zzt(zzibsVar.zzf(i2));
            i2++;
        }
    }

    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzicq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzL(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zziaw.zzB(((Long) list.get(i4)).longValue());
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z) {
            while (i2 < zzicqVar.size()) {
                this.zza.zzL(i, zzicqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzicqVar.size(); i6++) {
            i5 += zziaw.zzB(zzicqVar.zzc(i6));
        }
        zziawVar2.zzs(i5);
        while (i2 < zzicqVar.size()) {
            zziawVar2.zzu(zzicqVar.zzc(i2));
            i2++;
        }
    }

    public final void zzz(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzicq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzL(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zziaw.zzB(((Long) list.get(i4)).longValue());
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z) {
            while (i2 < zzicqVar.size()) {
                this.zza.zzL(i, zzicqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzicqVar.size(); i6++) {
            i5 += zziaw.zzB(zzicqVar.zzc(i6));
        }
        zziawVar2.zzs(i5);
        while (i2 < zzicqVar.size()) {
            zziawVar2.zzu(zzicqVar.zzc(i2));
            i2++;
        }
    }
}

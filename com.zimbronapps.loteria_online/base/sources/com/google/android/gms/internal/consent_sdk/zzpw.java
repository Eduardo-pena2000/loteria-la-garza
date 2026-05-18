package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzpw implements zztb {
    private final zzpv zza;

    private zzpw(zzpv zzpvVar) {
        byte[] bArr = zzqs.zzb;
        this.zza = zzpvVar;
        zzpvVar.zze = this;
    }

    public static zzpw zza(zzpv zzpvVar) {
        Object obj = zzpvVar.zze;
        return obj != null ? (zzpw) obj : new zzpw(zzpvVar);
    }

    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzre)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzl(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzm(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z) {
            while (i2 < zzreVar.size()) {
                this.zza.zzl(i, zzreVar.zze(i2));
                i2++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzreVar.size(); i6++) {
            zzreVar.zze(i6);
            i5 += 8;
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzreVar.size()) {
            zzpvVar2.zzm(zzreVar.zze(i2));
            i2++;
        }
    }

    public final void zzB(int i, int i2) throws IOException {
        this.zza.zzv(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzqn)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzpv zzpvVar = this.zza;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzpvVar.zzv(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            zzpv zzpvVar2 = this.zza;
            zzpvVar2.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzpv.zzC((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzpvVar2.zzw(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzpvVar2.zzw((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z) {
            while (i2 < zzqnVar.size()) {
                zzpv zzpvVar3 = this.zza;
                int zze = zzqnVar.zze(i2);
                zzpvVar3.zzv(i, (zze >> 31) ^ (zze + zze));
                i2++;
            }
            return;
        }
        zzpv zzpvVar4 = this.zza;
        zzpvVar4.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqnVar.size(); i6++) {
            int zze2 = zzqnVar.zze(i6);
            i5 += zzpv.zzC((zze2 >> 31) ^ (zze2 + zze2));
        }
        zzpvVar4.zzw(i5);
        while (i2 < zzqnVar.size()) {
            int zze3 = zzqnVar.zze(i2);
            zzpvVar4.zzw((zze3 >> 31) ^ (zze3 + zze3));
            i2++;
        }
    }

    public final void zzD(int i, long j) throws IOException {
        this.zza.zzx(i, (j >> 63) ^ (j + j));
    }

    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzre)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzpv zzpvVar = this.zza;
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzpvVar.zzx(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            zzpv zzpvVar2 = this.zza;
            zzpvVar2.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzpv.zzD((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzpvVar2.zzw(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzpvVar2.zzy((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z) {
            while (i2 < zzreVar.size()) {
                zzpv zzpvVar3 = this.zza;
                long zze = zzreVar.zze(i2);
                zzpvVar3.zzx(i, (zze >> 63) ^ (zze + zze));
                i2++;
            }
            return;
        }
        zzpv zzpvVar4 = this.zza;
        zzpvVar4.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzreVar.size(); i6++) {
            long zze2 = zzreVar.zze(i6);
            i5 += zzpv.zzD((zze2 >> 63) ^ (zze2 + zze2));
        }
        zzpvVar4.zzw(i5);
        while (i2 < zzreVar.size()) {
            long zze3 = zzreVar.zze(i2);
            zzpvVar4.zzy((zze3 >> 63) ^ (zze3 + zze3));
            i2++;
        }
    }

    public final void zzF(int i, String str) throws IOException {
        this.zza.zzs(i, str);
    }

    public final void zzG(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzrb)) {
            while (i2 < list.size()) {
                this.zza.zzs(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzrb zzrbVar = (zzrb) list;
        while (i2 < list.size()) {
            Object zza = zzrbVar.zza();
            if (zza instanceof String) {
                this.zza.zzs(i, (String) zza);
            } else {
                this.zza.zzh(i, (zzpm) zza);
            }
            i2++;
        }
    }

    public final void zzH(int i, int i2) throws IOException {
        this.zza.zzv(i, i2);
    }

    public final void zzI(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzqn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzv(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzpv.zzC(((Integer) list.get(i4)).intValue());
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzw(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z) {
            while (i2 < zzqnVar.size()) {
                this.zza.zzv(i, zzqnVar.zze(i2));
                i2++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqnVar.size(); i6++) {
            i5 += zzpv.zzC(zzqnVar.zze(i6));
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzqnVar.size()) {
            zzpvVar2.zzw(zzqnVar.zze(i2));
            i2++;
        }
    }

    public final void zzJ(int i, long j) throws IOException {
        this.zza.zzx(i, j);
    }

    public final void zzK(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzre)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzx(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzpv.zzD(((Long) list.get(i4)).longValue());
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzy(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z) {
            while (i2 < zzreVar.size()) {
                this.zza.zzx(i, zzreVar.zze(i2));
                i2++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzreVar.size(); i6++) {
            i5 += zzpv.zzD(zzreVar.zze(i6));
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzreVar.size()) {
            zzpvVar2.zzy(zzreVar.zze(i2));
            i2++;
        }
    }

    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzK(i, z);
    }

    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzpd)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzJ(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzpd zzpdVar = (zzpd) list;
        if (!z) {
            while (i2 < zzpdVar.size()) {
                this.zza.zzK(i, zzpdVar.zze(i2));
                i2++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzpdVar.size(); i6++) {
            zzpdVar.zze(i6);
            i5++;
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzpdVar.size()) {
            zzpvVar2.zzJ(zzpdVar.zze(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public final void zzd(int i, zzpm zzpmVar) throws IOException {
        this.zza.zzh(i, zzpmVar);
    }

    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzh(i, (zzpm) list.get(i2));
        }
    }

    public final void zzf(int i, double d) throws IOException {
        this.zza.zzl(i, Double.doubleToRawLongBits(d));
    }

    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzpx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzl(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzm(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzpx zzpxVar = (zzpx) list;
        if (!z) {
            while (i2 < zzpxVar.size()) {
                this.zza.zzl(i, Double.doubleToRawLongBits(zzpxVar.zze(i2)));
                i2++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzpxVar.size(); i6++) {
            zzpxVar.zze(i6);
            i5 += 8;
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzpxVar.size()) {
            zzpvVar2.zzm(Double.doubleToRawLongBits(zzpxVar.zze(i2)));
            i2++;
        }
    }

    public final void zzh(int i, int i2) throws IOException {
        this.zza.zzn(i, i2);
    }

    public final void zzi(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzqn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzn(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzpv.zzD(((Integer) list.get(i4)).intValue());
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzo(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z) {
            while (i2 < zzqnVar.size()) {
                this.zza.zzn(i, zzqnVar.zze(i2));
                i2++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqnVar.size(); i6++) {
            i5 += zzpv.zzD(zzqnVar.zze(i6));
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzqnVar.size()) {
            zzpvVar2.zzo(zzqnVar.zze(i2));
            i2++;
        }
    }

    public final void zzj(int i, int i2) throws IOException {
        this.zza.zzj(i, i2);
    }

    public final void zzk(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzqn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z) {
            while (i2 < zzqnVar.size()) {
                this.zza.zzj(i, zzqnVar.zze(i2));
                i2++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqnVar.size(); i6++) {
            zzqnVar.zze(i6);
            i5 += 4;
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzqnVar.size()) {
            zzpvVar2.zzk(zzqnVar.zze(i2));
            i2++;
        }
    }

    public final void zzl(int i, long j) throws IOException {
        this.zza.zzl(i, j);
    }

    public final void zzm(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzre)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzl(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzm(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z) {
            while (i2 < zzreVar.size()) {
                this.zza.zzl(i, zzreVar.zze(i2));
                i2++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzreVar.size(); i6++) {
            zzreVar.zze(i6);
            i5 += 8;
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzreVar.size()) {
            zzpvVar2.zzm(zzreVar.zze(i2));
            i2++;
        }
    }

    public final void zzn(int i, float f) throws IOException {
        this.zza.zzj(i, Float.floatToRawIntBits(f));
    }

    public final void zzo(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzqh)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzk(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzqh zzqhVar = (zzqh) list;
        if (!z) {
            while (i2 < zzqhVar.size()) {
                this.zza.zzj(i, Float.floatToRawIntBits(zzqhVar.zze(i2)));
                i2++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqhVar.size(); i6++) {
            zzqhVar.zze(i6);
            i5 += 4;
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzqhVar.size()) {
            zzpvVar2.zzk(Float.floatToRawIntBits(zzqhVar.zze(i2)));
            i2++;
        }
    }

    public final void zzp(int i, Object obj, zzsa zzsaVar) throws IOException {
        zzpv zzpvVar = this.zza;
        zzpvVar.zzu(i, 3);
        zzsaVar.zzf((zzpa) obj, this);
        zzpvVar.zzu(i, 4);
    }

    public final void zzq(int i, int i2) throws IOException {
        this.zza.zzn(i, i2);
    }

    public final void zzr(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzqn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzn(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzpv.zzD(((Integer) list.get(i4)).intValue());
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzo(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z) {
            while (i2 < zzqnVar.size()) {
                this.zza.zzn(i, zzqnVar.zze(i2));
                i2++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqnVar.size(); i6++) {
            i5 += zzpv.zzD(zzqnVar.zze(i6));
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzqnVar.size()) {
            zzpvVar2.zzo(zzqnVar.zze(i2));
            i2++;
        }
    }

    public final void zzs(int i, long j) throws IOException {
        this.zza.zzx(i, j);
    }

    public final void zzt(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzre)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzx(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzpv.zzD(((Long) list.get(i4)).longValue());
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzy(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzre zzreVar = (zzre) list;
        if (!z) {
            while (i2 < zzreVar.size()) {
                this.zza.zzx(i, zzreVar.zze(i2));
                i2++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzreVar.size(); i6++) {
            i5 += zzpv.zzD(zzreVar.zze(i6));
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzreVar.size()) {
            zzpvVar2.zzy(zzreVar.zze(i2));
            i2++;
        }
    }

    public final void zzu(int i, zzri zzriVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            zzpvVar.zzw(zzrj.zzb(zzriVar, entry.getKey(), entry.getValue()));
            Object key = entry.getKey();
            Object value = entry.getValue();
            zzqf.zzi(zzpvVar, zzriVar.zza, 1, key);
            zzqf.zzi(zzpvVar, zzriVar.zzb, 2, value);
        }
    }

    public final void zzv(int i, Object obj, zzsa zzsaVar) throws IOException {
        zzpv zzpvVar = this.zza;
        zzpa zzpaVar = (zzpa) obj;
        zzpvVar.zzu(i, 2);
        zzpvVar.zzw(zzpaVar.zzj(zzsaVar));
        zzsaVar.zzf(zzpaVar, this);
    }

    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zzpm) {
            this.zza.zzr(i, (zzpm) obj);
        } else {
            this.zza.zzq(i, (zzrq) obj);
        }
    }

    public final void zzx(int i, int i2) throws IOException {
        this.zza.zzj(i, i2);
    }

    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzqn)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zzpv zzpvVar = this.zza;
            zzpvVar.zzu(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            zzpvVar.zzw(i3);
            while (i2 < list.size()) {
                zzpvVar.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzqn zzqnVar = (zzqn) list;
        if (!z) {
            while (i2 < zzqnVar.size()) {
                this.zza.zzj(i, zzqnVar.zze(i2));
                i2++;
            }
            return;
        }
        zzpv zzpvVar2 = this.zza;
        zzpvVar2.zzu(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzqnVar.size(); i6++) {
            zzqnVar.zze(i6);
            i5 += 4;
        }
        zzpvVar2.zzw(i5);
        while (i2 < zzqnVar.size()) {
            zzpvVar2.zzk(zzqnVar.zze(i2));
            i2++;
        }
    }

    public final void zzz(int i, long j) throws IOException {
        this.zza.zzl(i, j);
    }
}

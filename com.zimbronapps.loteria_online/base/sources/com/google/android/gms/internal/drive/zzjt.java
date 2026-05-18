package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkk;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzjt implements zzns {
    private final zzjr zznx;

    private zzjt(zzjr zzjrVar) {
        zzjr zzjrVar2 = (zzjr) zzkm.zza((Object) zzjrVar, "output");
        this.zznx = zzjrVar2;
        zzjrVar2.zzoh = this;
    }

    public static zzjt zza(zzjr zzjrVar) {
        zzjt zzjtVar = zzjrVar.zzoh;
        return zzjtVar != null ? zzjtVar : new zzjt(zzjrVar);
    }

    public final void zzak(int i) throws IOException {
        this.zznx.zzb(i, 3);
    }

    public final void zzal(int i) throws IOException {
        this.zznx.zzb(i, 4);
    }

    public final void zzb(int i, boolean z) throws IOException {
        this.zznx.zzb(i, z);
    }

    public final void zzc(int i, int i2) throws IOException {
        this.zznx.zzc(i, i2);
    }

    public final int zzcd() {
        return zzkk.zze.zzsi;
    }

    public final void zzd(int i, int i2) throws IOException {
        this.zznx.zzd(i, i2);
    }

    public final void zze(int i, int i2) throws IOException {
        this.zznx.zze(i, i2);
    }

    public final void zzf(int i, int i2) throws IOException {
        this.zznx.zzf(i, i2);
    }

    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zznx.zza(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        this.zznx.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzjr.zzb(((Double) list.get(i4)).doubleValue());
        }
        this.zznx.zzy(i3);
        while (i2 < list.size()) {
            this.zznx.zza(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public final void zzh(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zznx.zzc(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zznx.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzjr.zzah(((Integer) list.get(i4)).intValue());
        }
        this.zznx.zzy(i3);
        while (i2 < list.size()) {
            this.zznx.zzx(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzi(int i, long j) throws IOException {
        this.zznx.zza(i, j);
    }

    public final void zzj(int i, long j) throws IOException {
        this.zznx.zzc(i, j);
    }

    public final void zzk(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zznx.zzf(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zznx.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzjr.zzag(((Integer) list.get(i4)).intValue());
        }
        this.zznx.zzy(i3);
        while (i2 < list.size()) {
            this.zznx.zzaa(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zznx.zzc(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zznx.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzjr.zzs(((Long) list.get(i4)).longValue());
        }
        this.zznx.zzy(i3);
        while (i2 < list.size()) {
            this.zznx.zzn(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzm(int i, int i2) throws IOException {
        this.zznx.zzf(i, i2);
    }

    public final void zzn(int i, int i2) throws IOException {
        this.zznx.zzc(i, i2);
    }

    public final void zzb(int i, long j) throws IOException {
        this.zznx.zzb(i, j);
    }

    public final void zzc(int i, long j) throws IOException {
        this.zznx.zzc(i, j);
    }

    public final void zzd(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zznx.zza(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zznx.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzjr.zzp(((Long) list.get(i4)).longValue());
        }
        this.zznx.zzy(i3);
        while (i2 < list.size()) {
            this.zznx.zzl(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zze(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zznx.zzc(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zznx.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzjr.zzr(((Long) list.get(i4)).longValue());
        }
        this.zznx.zzy(i3);
        while (i2 < list.size()) {
            this.zznx.zzn(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzf(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zznx.zza(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        this.zznx.zzb(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzjr.zzb(((Float) list.get(i4)).floatValue());
        }
        this.zznx.zzy(i3);
        while (i2 < list.size()) {
            this.zznx.zza(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public final void zza(int i, float f) throws IOException {
        this.zznx.zza(i, f);
    }

    public final void zzb(int i, Object obj, zzmf zzmfVar) throws IOException {
        zzjr zzjrVar = this.zznx;
        zzjrVar.zzb(i, 3);
        zzmfVar.zza((zzlq) obj, zzjrVar.zzoh);
        zzjrVar.zzb(i, 4);
    }

    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjr.zzo(((Long) list.get(i4)).longValue());
            }
            this.zznx.zzy(i3);
            while (i2 < list.size()) {
                this.zznx.zzl(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zza(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzi(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjr.zzd(((Boolean) list.get(i4)).booleanValue());
            }
            this.zznx.zzy(i3);
            while (i2 < list.size()) {
                this.zznx.zzc(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zzb(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjr.zzad(((Integer) list.get(i4)).intValue());
            }
            this.zznx.zzy(i3);
            while (i2 < list.size()) {
                this.zznx.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zzd(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzm(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjr.zzae(((Integer) list.get(i4)).intValue());
            }
            this.zznx.zzy(i3);
            while (i2 < list.size()) {
                this.zznx.zzz(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zze(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjr.zzq(((Long) list.get(i4)).longValue());
            }
            this.zznx.zzy(i3);
            while (i2 < list.size()) {
                this.zznx.zzm(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zzb(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zza(int i, double d) throws IOException {
        this.zznx.zza(i, d);
    }

    public final void zza(int i, long j) throws IOException {
        this.zznx.zza(i, j);
    }

    public final void zza(int i, String str) throws IOException {
        this.zznx.zza(i, str);
    }

    public final void zza(int i, zzjc zzjcVar) throws IOException {
        this.zznx.zza(i, zzjcVar);
    }

    public final void zzb(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjr.zzaf(((Integer) list.get(i4)).intValue());
            }
            this.zznx.zzy(i3);
            while (i2 < list.size()) {
                this.zznx.zzaa(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zzf(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zza(int i, Object obj, zzmf zzmfVar) throws IOException {
        this.zznx.zza(i, (zzlq) obj, zzmfVar);
    }

    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof zzjc) {
            this.zznx.zzb(i, (zzjc) obj);
        } else {
            this.zznx.zza(i, (zzlq) obj);
        }
    }

    public final void zza(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zznx.zzb(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjr.zzac(((Integer) list.get(i4)).intValue());
            }
            this.zznx.zzy(i3);
            while (i2 < list.size()) {
                this.zznx.zzx(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zzc(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzb(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zznx.zza(i, (zzjc) list.get(i2));
        }
    }

    public final void zzb(int i, List list, zzmf zzmfVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzmfVar);
        }
    }

    public final void zza(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof zzkz) {
            zzkz zzkzVar = (zzkz) list;
            while (i2 < list.size()) {
                Object zzao = zzkzVar.zzao(i2);
                if (zzao instanceof String) {
                    this.zznx.zza(i, (String) zzao);
                } else {
                    this.zznx.zza(i, (zzjc) zzao);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zznx.zza(i, (String) list.get(i2));
            i2++;
        }
    }

    public final void zza(int i, List list, zzmf zzmfVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzmfVar);
        }
    }

    public final void zza(int i, zzlj zzljVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            this.zznx.zzb(i, 2);
            this.zznx.zzy(zzli.zza(zzljVar, entry.getKey(), entry.getValue()));
            zzli.zza(this.zznx, zzljVar, entry.getKey(), entry.getValue());
        }
    }
}

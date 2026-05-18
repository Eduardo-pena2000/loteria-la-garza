package com.google.android.gms.internal.firebase-auth-api;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzakp implements zzaol {
    private final zzakn zza;

    private zzakp(zzakn zzaknVar) {
        zzakn zzaknVar2 = (zzakn) zzalh.zza(zzaknVar, "output");
        this.zza = zzaknVar2;
        zzaknVar2.zza = this;
    }

    public final int zza() {
        return 1;
    }

    public final void zzb(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzaks)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzb(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzakn.zza(((Double) list.get(i4)).doubleValue());
            }
            this.zza.zzm(i3);
            while (i2 < list.size()) {
                this.zza.zzb(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        zzaks zzaksVar = (zzaks) list;
        if (!z) {
            while (i2 < zzaksVar.size()) {
                this.zza.zzb(i, zzaksVar.zzb(i2));
                i2++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaksVar.size(); i6++) {
            i5 += zzakn.zza(zzaksVar.zzb(i6));
        }
        this.zza.zzm(i5);
        while (i2 < zzaksVar.size()) {
            this.zza.zzb(zzaksVar.zzb(i2));
            i2++;
        }
    }

    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzali)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzakn.zza(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzm(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z) {
            while (i2 < zzaliVar.size()) {
                this.zza.zzh(i, zzaliVar.zzb(i2));
                i2++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaliVar.size(); i6++) {
            i5 += zzakn.zza(zzaliVar.zzb(i6));
        }
        this.zza.zzm(i5);
        while (i2 < zzaliVar.size()) {
            this.zza.zzk(zzaliVar.zzb(i2));
            i2++;
        }
    }

    public final void zzd(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzali)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzakn.zzb(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzm(i3);
            while (i2 < list.size()) {
                this.zza.zzj(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z) {
            while (i2 < zzaliVar.size()) {
                this.zza.zzg(i, zzaliVar.zzb(i2));
                i2++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaliVar.size(); i6++) {
            i5 += zzakn.zzb(zzaliVar.zzb(i6));
        }
        this.zza.zzm(i5);
        while (i2 < zzaliVar.size()) {
            this.zza.zzj(zzaliVar.zzb(i2));
            i2++;
        }
    }

    public final void zze(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzalx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzakn.zza(((Long) list.get(i4)).longValue());
            }
            this.zza.zzm(i3);
            while (i2 < list.size()) {
                this.zza.zzf(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z) {
            while (i2 < zzalxVar.size()) {
                this.zza.zzf(i, zzalxVar.zzb(i2));
                i2++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzalxVar.size(); i6++) {
            i5 += zzakn.zza(zzalxVar.zzb(i6));
        }
        this.zza.zzm(i5);
        while (i2 < zzalxVar.size()) {
            this.zza.zzf(zzalxVar.zzb(i2));
            i2++;
        }
    }

    public final void zzf(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzald)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzb(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzakn.zza(((Float) list.get(i4)).floatValue());
            }
            this.zza.zzm(i3);
            while (i2 < list.size()) {
                this.zza.zzb(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        zzald zzaldVar = (zzald) list;
        if (!z) {
            while (i2 < zzaldVar.size()) {
                this.zza.zzb(i, zzaldVar.zzb(i2));
                i2++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaldVar.size(); i6++) {
            i5 += zzakn.zza(zzaldVar.zzb(i6));
        }
        this.zza.zzm(i5);
        while (i2 < zzaldVar.size()) {
            this.zza.zzb(zzaldVar.zzb(i2));
            i2++;
        }
    }

    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzali)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzakn.zzc(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzm(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z) {
            while (i2 < zzaliVar.size()) {
                this.zza.zzh(i, zzaliVar.zzb(i2));
                i2++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaliVar.size(); i6++) {
            i5 += zzakn.zzc(zzaliVar.zzb(i6));
        }
        this.zza.zzm(i5);
        while (i2 < zzaliVar.size()) {
            this.zza.zzk(zzaliVar.zzb(i2));
            i2++;
        }
    }

    public final void zzh(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzalx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzakn.zzb(((Long) list.get(i4)).longValue());
            }
            this.zza.zzm(i3);
            while (i2 < list.size()) {
                this.zza.zzh(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z) {
            while (i2 < zzalxVar.size()) {
                this.zza.zzh(i, zzalxVar.zzb(i2));
                i2++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzalxVar.size(); i6++) {
            i5 += zzakn.zzb(zzalxVar.zzb(i6));
        }
        this.zza.zzm(i5);
        while (i2 < zzalxVar.size()) {
            this.zza.zzh(zzalxVar.zzb(i2));
            i2++;
        }
    }

    public final void zzi(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzali)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzakn.zzf(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzm(i3);
            while (i2 < list.size()) {
                this.zza.zzj(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z) {
            while (i2 < zzaliVar.size()) {
                this.zza.zzg(i, zzaliVar.zzb(i2));
                i2++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaliVar.size(); i6++) {
            i5 += zzakn.zzf(zzaliVar.zzb(i6));
        }
        this.zza.zzm(i5);
        while (i2 < zzaliVar.size()) {
            this.zza.zzj(zzaliVar.zzb(i2));
            i2++;
        }
    }

    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzalx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzakn.zzc(((Long) list.get(i4)).longValue());
            }
            this.zza.zzm(i3);
            while (i2 < list.size()) {
                this.zza.zzf(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z) {
            while (i2 < zzalxVar.size()) {
                this.zza.zzf(i, zzalxVar.zzb(i2));
                i2++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzalxVar.size(); i6++) {
            i5 += zzakn.zzc(zzalxVar.zzb(i6));
        }
        this.zza.zzm(i5);
        while (i2 < zzalxVar.size()) {
            this.zza.zzf(zzalxVar.zzb(i2));
            i2++;
        }
    }

    public final void zzk(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzali)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzakn.zzg(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzm(i3);
            while (i2 < list.size()) {
                this.zza.zzl(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z) {
            while (i2 < zzaliVar.size()) {
                this.zza.zzi(i, zzaliVar.zzb(i2));
                i2++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaliVar.size(); i6++) {
            i5 += zzakn.zzg(zzaliVar.zzb(i6));
        }
        this.zza.zzm(i5);
        while (i2 < zzaliVar.size()) {
            this.zza.zzl(zzaliVar.zzb(i2));
            i2++;
        }
    }

    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzalx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzg(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzakn.zzd(((Long) list.get(i4)).longValue());
            }
            this.zza.zzm(i3);
            while (i2 < list.size()) {
                this.zza.zzg(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z) {
            while (i2 < zzalxVar.size()) {
                this.zza.zzg(i, zzalxVar.zzb(i2));
                i2++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzalxVar.size(); i6++) {
            i5 += zzakn.zzd(zzalxVar.zzb(i6));
        }
        this.zza.zzm(i5);
        while (i2 < zzalxVar.size()) {
            this.zza.zzg(zzalxVar.zzb(i2));
            i2++;
        }
    }

    public final void zzm(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzali)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzk(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzakn.zzi(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzm(i3);
            while (i2 < list.size()) {
                this.zza.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzali zzaliVar = (zzali) list;
        if (!z) {
            while (i2 < zzaliVar.size()) {
                this.zza.zzk(i, zzaliVar.zzb(i2));
                i2++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzaliVar.size(); i6++) {
            i5 += zzakn.zzi(zzaliVar.zzb(i6));
        }
        this.zza.zzm(i5);
        while (i2 < zzaliVar.size()) {
            this.zza.zzm(zzaliVar.zzb(i2));
            i2++;
        }
    }

    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzalx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzj(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzakn.zze(((Long) list.get(i4)).longValue());
            }
            this.zza.zzm(i3);
            while (i2 < list.size()) {
                this.zza.zzh(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzalx zzalxVar = (zzalx) list;
        if (!z) {
            while (i2 < zzalxVar.size()) {
                this.zza.zzh(i, zzalxVar.zzb(i2));
                i2++;
            }
            return;
        }
        this.zza.zzj(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzalxVar.size(); i6++) {
            i5 += zzakn.zze(zzalxVar.zzb(i6));
        }
        this.zza.zzm(i5);
        while (i2 < zzalxVar.size()) {
            this.zza.zzh(zzalxVar.zzb(i2));
            i2++;
        }
    }

    public static zzakp zza(zzakn zzaknVar) {
        zzakp zzakpVar = zzaknVar.zza;
        return zzakpVar != null ? zzakpVar : new zzakp(zzaknVar);
    }

    public final void zza(int i, boolean z) throws IOException {
        this.zza.zzb(i, z);
    }

    public final void zza(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzajt)) {
            if (z) {
                this.zza.zzj(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zzakn.zza(((Boolean) list.get(i4)).booleanValue());
                }
                this.zza.zzm(i3);
                while (i2 < list.size()) {
                    this.zza.zzb(((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                this.zza.zzb(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        zzajt zzajtVar = (zzajt) list;
        if (z) {
            this.zza.zzj(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < zzajtVar.size(); i6++) {
                i5 += zzakn.zza(zzajtVar.zzb(i6));
            }
            this.zza.zzm(i5);
            while (i2 < zzajtVar.size()) {
                this.zza.zzb(zzajtVar.zzb(i2));
                i2++;
            }
            return;
        }
        while (i2 < zzajtVar.size()) {
            this.zza.zzb(i, zzajtVar.zzb(i2));
            i2++;
        }
    }

    public final void zzb(int i, int i2) throws IOException {
        this.zza.zzg(i, i2);
    }

    public final void zzd(int i, int i2) throws IOException {
        this.zza.zzg(i, i2);
    }

    public final void zze(int i, int i2) throws IOException {
        this.zza.zzi(i, i2);
    }

    public final void zzf(int i, int i2) throws IOException {
        this.zza.zzk(i, i2);
    }

    public final void zzb(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    public final void zze(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    public final void zzd(int i, long j) throws IOException {
        this.zza.zzg(i, j);
    }

    public final void zzb(int i, Object obj, zzanb zzanbVar) throws IOException {
        zzajm zzajmVar = (zzajm) obj;
        this.zza.zzj(i, 2);
        this.zza.zzm(zzajmVar.zza(zzanbVar));
        zzanbVar.zza((Object) zzajmVar, (zzaol) this);
    }

    public final void zza(int i, zzajv zzajvVar) throws IOException {
        this.zza.zzc(i, zzajvVar);
    }

    public final void zzc(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zza(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzc(i, (zzajv) list.get(i2));
        }
    }

    public final void zzc(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    public final void zza(int i, double d) throws IOException {
        this.zza.zzb(i, d);
    }

    public final void zzb(int i, List list, zzanb zzanbVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzanbVar);
        }
    }

    @Deprecated
    public final void zza(int i) throws IOException {
        this.zza.zzj(i, 4);
    }

    public final void zza(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    @Deprecated
    public final void zzb(int i) throws IOException {
        this.zza.zzj(i, 3);
    }

    public final void zzb(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof zzalt) {
            zzalt zzaltVar = (zzalt) list;
            while (i2 < list.size()) {
                Object zza = zzaltVar.zza(i2);
                if (zza instanceof String) {
                    this.zza.zzb(i, (String) zza);
                } else {
                    this.zza.zzc(i, (zzajv) zza);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzb(i, (String) list.get(i2));
            i2++;
        }
    }

    public final void zza(int i, long j) throws IOException {
        this.zza.zzf(i, j);
    }

    public final void zza(int i, float f) throws IOException {
        this.zza.zzb(i, f);
    }

    public final void zza(int i, Object obj, zzanb zzanbVar) throws IOException {
        this.zza.zzj(i, 3);
        zzanbVar.zza(obj, (zzaol) this);
        this.zza.zzj(i, 4);
    }

    public final void zza(int i, List list, zzanb zzanbVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzanbVar);
        }
    }

    public final void zza(int i, zzamd zzamdVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            this.zza.zzj(i, 2);
            this.zza.zzm(zzame.zza(zzamdVar, entry.getKey(), entry.getValue()));
            zzame.zza(this.zza, zzamdVar, entry.getKey(), entry.getValue());
        }
    }

    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof zzajv) {
            this.zza.zzd(i, (zzajv) obj);
        } else {
            this.zza.zzb(i, (zzamm) obj);
        }
    }

    public final void zza(int i, String str) throws IOException {
        this.zza.zzb(i, str);
    }
}

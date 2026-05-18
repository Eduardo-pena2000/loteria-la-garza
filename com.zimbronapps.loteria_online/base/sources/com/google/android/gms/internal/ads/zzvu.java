package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzvu implements zzye {
    private final zzguf zza;
    private long zzb;

    public zzvu(List list, List list2) {
        int i = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        zzgrc.zza(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgucVar.zzf(new zzvt((zzye) list.get(i2), (List) list2.get(i2)));
        }
        this.zza = zzgucVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    public final void zzg(long j) {
        int i = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i >= zzgufVar.size()) {
                return;
            }
            ((zzvt) zzgufVar.get(i)).zzg(j);
            i++;
        }
    }

    public final long zzi() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i >= zzgufVar.size()) {
                break;
            }
            zzvt zzvtVar = (zzvt) zzgufVar.get(i);
            long zzi = zzvtVar.zzi();
            if ((zzvtVar.zza().contains(1) || zzvtVar.zza().contains(2) || zzvtVar.zza().contains(4)) && zzi != Long.MIN_VALUE) {
                j = Math.min(j, zzi);
            }
            if (zzi != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzi);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.zzb = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.zzb;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    public final long zzl() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i >= zzgufVar.size()) {
                break;
            }
            long zzl = ((zzvt) zzgufVar.get(i)).zzl();
            if (zzl != Long.MIN_VALUE) {
                j = Math.min(j, zzl);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final boolean zzm(zzll zzllVar) {
        boolean z;
        boolean z2 = false;
        do {
            long zzl = zzl();
            if (zzl == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            z = false;
            while (true) {
                zzguf zzgufVar = this.zza;
                if (i >= zzgufVar.size()) {
                    break;
                }
                long zzl2 = ((zzvt) zzgufVar.get(i)).zzl();
                boolean z3 = zzl2 != Long.MIN_VALUE && zzl2 <= zzllVar.zza;
                if (zzl2 == zzl || z3) {
                    z |= ((zzvt) zzgufVar.get(i)).zzm(zzllVar);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public final boolean zzn() {
        int i = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i >= zzgufVar.size()) {
                return false;
            }
            if (((zzvt) zzgufVar.get(i)).zzn()) {
                return true;
            }
            i++;
        }
    }
}

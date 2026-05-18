package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzii extends zzbf {
    private final int zzb;
    private final zzyf zzc;

    public zzii(boolean z, zzyf zzyfVar) {
        this.zzc = zzyfVar;
        this.zzb = zzyfVar.zza();
    }

    private final int zzw(int i, boolean z) {
        if (z) {
            return this.zzc.zzb(i);
        }
        if (i >= this.zzb - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzc.zzc(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    public final zzbe zzb(int i, zzbe zzbeVar, long j) {
        int zzq = zzq(i);
        int zzu = zzu(zzq);
        int zzt = zzt(zzq);
        zzs(zzq).zzb(i - zzu, zzbeVar, j);
        Object zzv = zzv(zzq);
        if (!zzbe.zza.equals(zzbeVar.zzb)) {
            zzv = Pair.create(zzv, zzbeVar.zzb);
        }
        zzbeVar.zzb = zzv;
        zzbeVar.zzn += zzt;
        zzbeVar.zzo += zzt;
        return zzbeVar;
    }

    public final zzbd zzd(int i, zzbd zzbdVar, boolean z) {
        int zzp = zzp(i);
        int zzu = zzu(zzp);
        zzs(zzp).zzd(i - zzt(zzp), zzbdVar, z);
        zzbdVar.zzc += zzu;
        if (z) {
            Object zzv = zzv(zzp);
            Object obj = zzbdVar.zzb;
            obj.getClass();
            zzbdVar.zzb = Pair.create(zzv, obj);
        }
        return zzbdVar;
    }

    public final int zze(Object obj) {
        int zze;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int zzr = zzr(obj2);
            if (zzr != -1 && (zze = zzs(zzr).zze(obj3)) != -1) {
                return zzt(zzr) + zze;
            }
        }
        return -1;
    }

    public final Object zzf(int i) {
        int zzp = zzp(i);
        return Pair.create(zzv(zzp), zzs(zzp).zzf(i - zzt(zzp)));
    }

    public final int zzh(int i, int i2, boolean z) {
        int zzq = zzq(i);
        int zzu = zzu(zzq);
        int zzh = zzs(zzq).zzh(i - zzu, i2 == 2 ? 0 : i2, z);
        if (zzh != -1) {
            return zzu + zzh;
        }
        int zzw = zzw(zzq, z);
        while (zzw != -1 && zzs(zzw).zzg()) {
            zzw = zzw(zzw, z);
        }
        if (zzw != -1) {
            return zzu(zzw) + zzs(zzw).zzk(z);
        }
        if (i2 == 2) {
            return zzk(z);
        }
        return -1;
    }

    public final int zzi(int i, int i2, boolean z) {
        int zzq = zzq(i);
        int zzu = zzu(zzq);
        int zzi = zzs(zzq).zzi(i - zzu, 0, false);
        if (zzi != -1) {
            return zzu + zzi;
        }
        int zzx = zzx(zzq, false);
        while (zzx != -1 && zzs(zzx).zzg()) {
            zzx = zzx(zzx, false);
        }
        if (zzx != -1) {
            return zzu(zzx) + zzs(zzx).zzj(false);
        }
        return -1;
    }

    public final int zzj(boolean z) {
        int i = this.zzb;
        if (i != 0) {
            int zzd = z ? this.zzc.zzd() : i - 1;
            while (zzs(zzd).zzg()) {
                zzd = zzx(zzd, z);
                if (zzd == -1) {
                }
            }
            return zzu(zzd) + zzs(zzd).zzj(z);
        }
        return -1;
    }

    public final int zzk(boolean z) {
        if (this.zzb != 0) {
            int zze = z ? this.zzc.zze() : 0;
            while (zzs(zze).zzg()) {
                zze = zzw(zze, z);
                if (zze == -1) {
                }
            }
            return zzu(zze) + zzs(zze).zzk(z);
        }
        return -1;
    }

    public final zzbd zzo(Object obj, zzbd zzbdVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzr = zzr(obj2);
        int zzu = zzu(zzr);
        zzs(zzr).zzo(obj3, zzbdVar);
        zzbdVar.zzc += zzu;
        zzbdVar.zzb = obj;
        return zzbdVar;
    }

    public abstract int zzp(int i);

    public abstract int zzq(int i);

    public abstract int zzr(Object obj);

    public abstract zzbf zzs(int i);

    public abstract int zzt(int i);

    public abstract int zzu(int i);

    public abstract Object zzv(int i);
}

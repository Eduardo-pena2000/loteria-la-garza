package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfyu extends zzibr implements zzidd {
    private static final zzfyu zzn;
    private static volatile zzidk zzo;
    private int zza;
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private String zzb = "";
    private zzicc zzk = zzibr.zzbE();
    private zzicc zzl = zzibr.zzbE();
    private zzicc zzm = zzibr.zzbE();

    static {
        zzfyu zzfyuVar = new zzfyu();
        zzn = zzfyuVar;
        zzibr.zzbu(zzfyu.class, zzfyuVar);
    }

    private zzfyu() {
    }

    public static /* synthetic */ zzfyu zzD() {
        return zzn;
    }

    public static zzfyu zzp() {
        return zzn;
    }

    public final /* synthetic */ void zzA(long j) {
        zzicc zziccVar = this.zzl;
        if (!zziccVar.zza()) {
            this.zzl = zzibr.zzbF(zziccVar);
        }
        this.zzl.zzd(j);
    }

    public final /* synthetic */ void zzB(long j) {
        zzicc zziccVar = this.zzm;
        if (!zziccVar.zza()) {
            this.zzm = zzibr.zzbF(zziccVar);
        }
        this.zzm.zzd(j);
    }

    public final /* synthetic */ void zzC() {
        this.zzm = zzibr.zzbE();
    }

    public final String zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new zzfyu();
        }
        if (ordinal == 4) {
            return new zzfyt(null);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzo;
        if (zzidkVar == null) {
            synchronized (zzfyu.class) {
                try {
                    zzidkVar = zzo;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzn);
                        zzo = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzg;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final long zzi() {
        return this.zzi;
    }

    public final boolean zzj() {
        return (this.zza & 64) != 0;
    }

    public final List zzk() {
        return this.zzk;
    }

    public final int zzl() {
        return this.zzk.size();
    }

    public final int zzm() {
        return this.zzl.size();
    }

    public final List zzn() {
        return this.zzm;
    }

    public final int zzo() {
        return this.zzm.size();
    }

    public final /* synthetic */ void zzq(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void zzr(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    public final /* synthetic */ void zzs(int i) {
        this.zza |= 2;
        this.zzd = i;
    }

    public final /* synthetic */ void zzt(boolean z) {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void zzu(boolean z) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void zzv(long j) {
        this.zza |= 16;
        this.zzg = j;
    }

    public final /* synthetic */ void zzw(long j) {
        this.zzh = j;
    }

    public final /* synthetic */ void zzx(long j) {
        this.zza |= 32;
        this.zzi = j;
    }

    public final /* synthetic */ void zzy(long j) {
        this.zza |= 64;
        this.zzj = j;
    }

    public final /* synthetic */ void zzz(long j) {
        zzicc zziccVar = this.zzk;
        if (!zziccVar.zza()) {
            this.zzk = zzibr.zzbF(zziccVar);
        }
        this.zzk.zzd(j);
    }
}

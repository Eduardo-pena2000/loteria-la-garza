package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaxx extends zzibr implements zzidd {
    private static final zzaxx zzf;
    private static volatile zzidk zzg;
    private int zza;
    private zzicd zzb = zzibr.zzbM();
    private zzian zzc = zzian.zza;
    private int zzd = 1;
    private int zze = 1;

    static {
        zzaxx zzaxxVar = new zzaxx();
        zzf = zzaxxVar;
        zzibr.zzbu(zzaxx.class, zzaxxVar);
    }

    private zzaxx() {
    }

    public static zzaxw zza() {
        return (zzaxw) zzf.zzbn();
    }

    public static /* synthetic */ zzaxx zzd() {
        return zzf;
    }

    public final /* synthetic */ void zzb(zzian zzianVar) {
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzianVar);
    }

    public final /* synthetic */ void zzc(zzian zzianVar) {
        this.zza |= 1;
        this.zzc = zzianVar;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", zzaxr.zza, "zze", zzaxn.zza});
        }
        if (ordinal == 3) {
            return new zzaxx();
        }
        if (ordinal == 4) {
            return new zzaxw(null);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzg;
        if (zzidkVar == null) {
            synchronized (zzaxx.class) {
                try {
                    zzidkVar = zzg;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzf);
                        zzg = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ void zze(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    public final /* synthetic */ void zzg(int i) {
        this.zze = i - 1;
        this.zza |= 4;
    }
}

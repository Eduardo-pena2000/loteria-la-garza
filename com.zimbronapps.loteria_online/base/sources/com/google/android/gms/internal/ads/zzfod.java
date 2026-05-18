package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfod extends zzibr implements zzidd {
    private static final zzfod zzc;
    private static volatile zzidk zzd;
    private int zza;
    private long zzb;

    static {
        zzfod zzfodVar = new zzfod();
        zzc = zzfodVar;
        zzibr.zzbu(zzfod.class, zzfodVar);
    }

    private zzfod() {
    }

    public static zzfoc zza() {
        return (zzfoc) zzc.zzbn();
    }

    public static /* synthetic */ zzfod zzc() {
        return zzc;
    }

    public final /* synthetic */ void zzb(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void zzd(int i) {
        this.zza = i - 2;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfod();
        }
        if (ordinal == 4) {
            return new zzfoc(null);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar == null) {
            synchronized (zzfod.class) {
                try {
                    zzidkVar = zzd;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzc);
                        zzd = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzigp extends zzibr implements zzidd {
    private static final zzigp zzi;
    private static volatile zzidk zzj;
    private int zza;
    private zzigo zzb;
    private zzian zzd;
    private zzian zze;
    private int zzf;
    private zzian zzg;
    private byte zzh = 2;
    private zzicd zzc = zzibr.zzbM();

    static {
        zzigp zzigpVar = new zzigp();
        zzi = zzigpVar;
        zzibr.zzbu(zzigp.class, zzigpVar);
    }

    private zzigp() {
        zzian zzianVar = zzian.zza;
        this.zzd = zzianVar;
        this.zze = zzianVar;
        this.zzg = zzianVar;
    }

    public static /* synthetic */ zzigp zzc() {
        return zzi;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        switch (zzibqVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzh);
            case 1:
                this.zzh = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return zzibr.zzbv(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", zzigh.class, "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new zzigp();
            case 4:
                return new zzigm(null);
            case 5:
                return zzi;
            case 6:
                zzidk zzidkVar = zzj;
                if (zzidkVar == null) {
                    synchronized (zzigp.class) {
                        try {
                            zzidkVar = zzj;
                            if (zzidkVar == null) {
                                zzidkVar = new zzibm(zzi);
                                zzj = zzidkVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzidkVar;
            default:
                throw null;
        }
    }
}

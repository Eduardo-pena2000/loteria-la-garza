package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzigh extends zzibr implements zzidd {
    private static final zzigh zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzian zzb;
    private zzian zzc;
    private byte zzd = 2;

    static {
        zzigh zzighVar = new zzigh();
        zze = zzighVar;
        zzibr.zzbu(zzigh.class, zzighVar);
    }

    private zzigh() {
        zzian zzianVar = zzian.zza;
        this.zzb = zzianVar;
        this.zzc = zzianVar;
    }

    public static zzigg zzc() {
        return (zzigg) zze.zzbn();
    }

    public static /* synthetic */ zzigh zzg() {
        return zze;
    }

    public final /* synthetic */ void zzd(zzian zzianVar) {
        this.zza |= 1;
        this.zzb = zzianVar;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        switch (zzibqVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzd);
            case 1:
                this.zzd = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return zzibr.zzbv(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case 3:
                return new zzigh();
            case 4:
                return new zzigg(null);
            case 5:
                return zze;
            case 6:
                zzidk zzidkVar = zzf;
                if (zzidkVar == null) {
                    synchronized (zzigh.class) {
                        try {
                            zzidkVar = zzf;
                            if (zzidkVar == null) {
                                zzidkVar = new zzibm(zze);
                                zzf = zzidkVar;
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

    public final /* synthetic */ void zze(zzian zzianVar) {
        this.zza |= 2;
        this.zzc = zzianVar;
    }
}

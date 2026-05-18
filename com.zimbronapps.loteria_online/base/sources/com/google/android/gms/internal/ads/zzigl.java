package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzigl extends zzibr implements zzidd {
    private static final zzigl zzh;
    private static volatile zzidk zzi;
    private int zza;
    private zzigk zzb;
    private zzian zzd;
    private zzian zze;
    private int zzf;
    private byte zzg = 2;
    private zzicd zzc = zzibr.zzbM();

    static {
        zzigl zziglVar = new zzigl();
        zzh = zziglVar;
        zzibr.zzbu(zzigl.class, zziglVar);
    }

    private zzigl() {
        zzian zzianVar = zzian.zza;
        this.zzd = zzianVar;
        this.zze = zzianVar;
    }

    public static zzigi zzc() {
        return (zzigi) zzh.zzbn();
    }

    public static /* synthetic */ zzigl zze() {
        return zzh;
    }

    public final /* synthetic */ void zzd(zzigh zzighVar) {
        zzighVar.getClass();
        zzicd zzicdVar = this.zzc;
        if (!zzicdVar.zza()) {
            this.zzc = zzibr.zzbN(zzicdVar);
        }
        this.zzc.add(zzighVar);
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        switch (zzibqVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzg);
            case 1:
                this.zzg = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return zzibr.zzbv(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", zzigh.class, "zzd", "zze", "zzf"});
            case 3:
                return new zzigl();
            case 4:
                return new zzigi(null);
            case 5:
                return zzh;
            case 6:
                zzidk zzidkVar = zzi;
                if (zzidkVar == null) {
                    synchronized (zzigl.class) {
                        try {
                            zzidkVar = zzi;
                            if (zzidkVar == null) {
                                zzidkVar = new zzibm(zzh);
                                zzi = zzidkVar;
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

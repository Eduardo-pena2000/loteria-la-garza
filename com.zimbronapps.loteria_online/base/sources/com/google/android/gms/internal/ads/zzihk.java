package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzihk extends zzibr implements zzidd {
    private static final zzihk zzl;
    private static volatile zzidk zzm;
    private int zza;
    private int zzb;
    private zzigl zzd;
    private zzigp zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private zzibz zzg = zzibr.zzbC();
    private String zzh = "";
    private zzicd zzj = zzibr.zzbM();

    static {
        zzihk zzihkVar = new zzihk();
        zzl = zzihkVar;
        zzibr.zzbu(zzihk.class, zzihkVar);
    }

    private zzihk() {
    }

    public static zzihj zze() {
        return (zzihj) zzl.zzbn();
    }

    public static /* synthetic */ zzihk zzk() {
        return zzl;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzj.size();
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        switch (zzibqVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzk);
            case 1:
                this.zzk = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return zzibr.zzbv(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzihh.zza, "zzj"});
            case 3:
                return new zzihk();
            case 4:
                return new zzihj(null);
            case 5:
                return zzl;
            case 6:
                zzidk zzidkVar = zzm;
                if (zzidkVar == null) {
                    synchronized (zzihk.class) {
                        try {
                            zzidkVar = zzm;
                            if (zzidkVar == null) {
                                zzidkVar = new zzibm(zzl);
                                zzm = zzidkVar;
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

    public final /* synthetic */ void zzg(int i) {
        this.zza |= 1;
        this.zzb = i;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzi(zzigl zziglVar) {
        zziglVar.getClass();
        this.zzd = zziglVar;
        this.zza |= 4;
    }

    public final /* synthetic */ void zzj(String str) {
        str.getClass();
        zzicd zzicdVar = this.zzj;
        if (!zzicdVar.zza()) {
            this.zzj = zzibr.zzbN(zzicdVar);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void zzl(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }
}

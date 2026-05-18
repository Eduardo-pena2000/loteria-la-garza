package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbcf extends zzibr implements zzidd {
    private static final zzbcf zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzbcl zzb;

    static {
        zzbcf zzbcfVar = new zzbcf();
        zzc = zzbcfVar;
        zzibr.zzbu(zzbcf.class, zzbcfVar);
    }

    private zzbcf() {
    }

    public static zzbcf zzb(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zzbcf) zzibr.zzbV(zzc, bArr, zzibbVar);
    }

    public static /* synthetic */ zzbcf zzc() {
        return zzc;
    }

    public final zzbcl zza() {
        zzbcl zzbclVar = this.zzb;
        return zzbclVar == null ? zzbcl.zze() : zzbclVar;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzbcf();
        }
        if (ordinal == 4) {
            return new zzbce(null);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar == null) {
            synchronized (zzbcf.class) {
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

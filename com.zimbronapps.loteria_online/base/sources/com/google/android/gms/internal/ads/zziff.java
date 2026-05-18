package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zziff extends zzibr implements zzidd {
    private static final zziff zzc;
    private static volatile zzidk zzd;
    private zzibz zza = zzibr.zzbC();
    private zzibz zzb = zzibr.zzbC();

    static {
        zziff zziffVar = new zziff();
        zzc = zziffVar;
        zzibr.zzbu(zziff.class, zziffVar);
    }

    private zziff() {
    }

    public static zziff zzc(byte[] bArr, zzibb zzibbVar) throws zzicg {
        return (zziff) zzibr.zzbV(zzc, bArr, zzibbVar);
    }

    public static /* synthetic */ zziff zzd() {
        return zzc;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zziff();
        }
        if (ordinal == 4) {
            return new zzife(null);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzd;
        if (zzidkVar == null) {
            synchronized (zziff.class) {
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

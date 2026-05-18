package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhpc extends zzibr implements zzidd {
    private static final zzhpc zza;
    private static volatile zzidk zzb;

    static {
        zzhpc zzhpcVar = new zzhpc();
        zza = zzhpcVar;
        zzibr.zzbu(zzhpc.class, zzhpcVar);
    }

    private zzhpc() {
    }

    public static zzhpc zza(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpc) zzibr.zzbT(zza, zzianVar, zzibbVar);
    }

    public static zzhpc zzb() {
        return zza;
    }

    public static /* synthetic */ zzhpc zzc() {
        return zza;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zza, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new zzhpc();
        }
        if (ordinal == 4) {
            return new zzhpb(null);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzb;
        if (zzidkVar == null) {
            synchronized (zzhpc.class) {
                try {
                    zzidkVar = zzb;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zza);
                        zzb = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }
}

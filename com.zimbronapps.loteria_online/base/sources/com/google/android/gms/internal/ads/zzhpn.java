package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhpn extends zzibr implements zzidd {
    private static final zzhpn zzb;
    private static volatile zzidk zzc;
    private int zza;

    static {
        zzhpn zzhpnVar = new zzhpn();
        zzb = zzhpnVar;
        zzibr.zzbu(zzhpn.class, zzhpnVar);
    }

    private zzhpn() {
    }

    public static zzhpn zzb(zzian zzianVar, zzibb zzibbVar) throws zzicg {
        return (zzhpn) zzibr.zzbT(zzb, zzianVar, zzibbVar);
    }

    public static zzhpn zzc() {
        return zzb;
    }

    public static /* synthetic */ zzhpn zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhpn();
        }
        if (ordinal == 4) {
            return new zzhpm(null);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzc;
        if (zzidkVar == null) {
            synchronized (zzhpn.class) {
                try {
                    zzidkVar = zzc;
                    if (zzidkVar == null) {
                        zzidkVar = new zzibm(zzb);
                        zzc = zzidkVar;
                    }
                } finally {
                }
            }
        }
        return zzidkVar;
    }
}

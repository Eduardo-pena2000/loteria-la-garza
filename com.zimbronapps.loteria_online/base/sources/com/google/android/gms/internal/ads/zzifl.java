package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzifl extends zzibr implements zzidd {
    private static final zzifl zzb;
    private static volatile zzidk zzc;
    private zzicd zza = zzibr.zzbM();

    static {
        zzifl zziflVar = new zzifl();
        zzb = zziflVar;
        zzibr.zzbu(zzifl.class, zziflVar);
    }

    private zzifl() {
    }

    public static zzifk zzc() {
        return (zzifk) zzb.zzbn();
    }

    public static /* synthetic */ zzifl zze() {
        return zzb;
    }

    public final /* synthetic */ void zzd(zzifj zzifjVar) {
        zzifjVar.getClass();
        zzicd zzicdVar = this.zza;
        if (!zzicdVar.zza()) {
            this.zza = zzibr.zzbN(zzicdVar);
        }
        this.zza.add(zzifjVar);
    }

    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzifj.class});
        }
        if (ordinal == 3) {
            return new zzifl();
        }
        if (ordinal == 4) {
            return new zzifk(null);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar = zzc;
        if (zzidkVar == null) {
            synchronized (zzifl.class) {
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

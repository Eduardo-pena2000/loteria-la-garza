package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzsw extends zzalf implements zzamo {
    private static final zzsw zzc;
    private static volatile zzamv zzd;
    private int zze;
    private int zzf;
    private zzajv zzg = zzajv.zza;
    private zztc zzh;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzta zztaVar) {
            this();
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzsw.zza((zzsw) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzsw.zzc());
        }

        public final zza zza(zztc zztcVar) {
            zzg();
            zzsw.zza((zzsw) this.zza, zztcVar);
            return this;
        }
    }

    static {
        zzsw zzswVar = new zzsw();
        zzc = zzswVar;
        zzalf.zza(zzsw.class, zzswVar);
    }

    private zzsw() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzsw zzc() {
        return zzc;
    }

    public static zzamv zzf() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zztc zzd() {
        zztc zztcVar = this.zzh;
        return zztcVar == null ? zztc.zzd() : zztcVar;
    }

    public final zzajv zze() {
        return this.zzg;
    }

    public static zzsw zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzsw) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzsy.zza[i - 1]) {
            case 1:
                return new zzsw();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzsw.class) {
                        try {
                            zzamvVar = zzd;
                            if (zzamvVar == null) {
                                zzamvVar = new zzalf.zza(zzc);
                                zzd = zzamvVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzamvVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public static /* synthetic */ void zza(zzsw zzswVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzswVar.zzg = zzajvVar;
    }

    public static /* synthetic */ void zza(zzsw zzswVar, zztc zztcVar) {
        zztcVar.getClass();
        zzswVar.zzh = zztcVar;
        zzswVar.zze |= 1;
    }
}

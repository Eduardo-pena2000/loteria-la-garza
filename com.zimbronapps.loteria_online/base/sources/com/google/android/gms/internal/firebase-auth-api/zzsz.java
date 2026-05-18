package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzsz extends zzalf implements zzamo {
    private static final zzsz zzc;
    private static volatile zzamv zzd;
    private int zze;
    private int zzf;
    private zztc zzg;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zztd zztdVar) {
            this();
        }

        public final zza zza(int i) {
            zzg();
            zzsz.zza((zzsz) this.zza, i);
            return this;
        }

        private zza() {
            super(zzsz.zzc());
        }

        public final zza zza(zztc zztcVar) {
            zzg();
            zzsz.zza((zzsz) this.zza, zztcVar);
            return this;
        }
    }

    static {
        zzsz zzszVar = new zzsz();
        zzc = zzszVar;
        zzalf.zza(zzsz.class, zzszVar);
    }

    private zzsz() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzsz zzc() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zztc zzd() {
        zztc zztcVar = this.zzg;
        return zztcVar == null ? zztc.zzd() : zztcVar;
    }

    public static zzsz zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzsz) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zztb.zza[i - 1]) {
            case 1:
                return new zzsz();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzsz.class) {
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

    public static /* synthetic */ void zza(zzsz zzszVar, int i) {
        zzszVar.zzf = i;
    }

    public static /* synthetic */ void zza(zzsz zzszVar, zztc zztcVar) {
        zztcVar.getClass();
        zzszVar.zzg = zztcVar;
        zzszVar.zze |= 1;
    }
}

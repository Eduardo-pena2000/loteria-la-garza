package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zztc extends zzalf implements zzamo {
    private static final zztc zzc;
    private static volatile zzamv zzd;
    private int zze;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zztg zztgVar) {
            this();
        }

        public final zza zza(int i) {
            zzg();
            zztc.zza((zztc) this.zza, i);
            return this;
        }

        private zza() {
            super(zztc.zzc());
        }
    }

    static {
        zztc zztcVar = new zztc();
        zzc = zztcVar;
        zzalf.zza(zztc.class, zztcVar);
    }

    private zztc() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zztc zzc() {
        return zzc;
    }

    public static zztc zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzte.zza[i - 1]) {
            case 1:
                return new zztc();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zztc.class) {
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

    public static /* synthetic */ void zza(zztc zztcVar, int i) {
        zztcVar.zze = i;
    }
}

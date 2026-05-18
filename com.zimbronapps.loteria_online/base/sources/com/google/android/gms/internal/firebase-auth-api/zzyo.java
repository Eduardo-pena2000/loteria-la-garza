package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzyo extends zzalf implements zzamo {
    private static final zzyo zzc;
    private static volatile zzamv zzd;
    private int zze;
    private zzajv zzf = zzajv.zza;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzyp zzypVar) {
            this();
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzyo.zza((zzyo) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzyo.zzc());
        }
    }

    static {
        zzyo zzyoVar = new zzyo();
        zzc = zzyoVar;
        zzalf.zza(zzyo.class, zzyoVar);
    }

    private zzyo() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzyo zzc() {
        return zzc;
    }

    public static zzamv zze() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzajv zzd() {
        return this.zzf;
    }

    public static zzyo zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzyo) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzyn.zza[i - 1]) {
            case 1:
                return new zzyo();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzyo.class) {
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

    public static /* synthetic */ void zza(zzyo zzyoVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzyoVar.zzf = zzajvVar;
    }
}

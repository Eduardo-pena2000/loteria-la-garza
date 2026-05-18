package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzwo extends zzalf implements zzamo {
    private static final zzwo zzc;
    private static volatile zzamv zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzws zzwsVar) {
            this();
        }

        public final zza zza(zzwk zzwkVar) {
            zzg();
            zzwo.zza((zzwo) this.zza, zzwkVar);
            return this;
        }

        private zza() {
            super(zzwo.zze());
        }

        public final zza zza(zzwj zzwjVar) {
            zzg();
            zzwo.zza((zzwo) this.zza, zzwjVar);
            return this;
        }

        public final zza zza(zzwm zzwmVar) {
            zzg();
            zzwo.zza((zzwo) this.zza, zzwmVar);
            return this;
        }
    }

    static {
        zzwo zzwoVar = new zzwo();
        zzc = zzwoVar;
        zzalf.zza(zzwo.class, zzwoVar);
    }

    private zzwo() {
    }

    public static zza zzd() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzwo zze() {
        return zzc;
    }

    public static zzwo zzf() {
        return zzc;
    }

    public final zzwk zza() {
        zzwk zza2 = zzwk.zza(this.zzg);
        return zza2 == null ? zzwk.UNRECOGNIZED : zza2;
    }

    public final zzwj zzb() {
        zzwj zza2 = zzwj.zza(this.zzf);
        return zza2 == null ? zzwj.UNRECOGNIZED : zza2;
    }

    public final zzwm zzc() {
        zzwm zza2 = zzwm.zza(this.zze);
        return zza2 == null ? zzwm.UNRECOGNIZED : zza2;
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzwq.zza[i - 1]) {
            case 1:
                return new zzwo();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzwo.class) {
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

    public static /* synthetic */ void zza(zzwo zzwoVar, zzwk zzwkVar) {
        zzwoVar.zzg = zzwkVar.zza();
    }

    public static /* synthetic */ void zza(zzwo zzwoVar, zzwj zzwjVar) {
        zzwoVar.zzf = zzwjVar.zza();
    }

    public static /* synthetic */ void zza(zzwo zzwoVar, zzwm zzwmVar) {
        zzwoVar.zze = zzwmVar.zza();
    }
}

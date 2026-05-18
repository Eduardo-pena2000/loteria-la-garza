package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzum extends zzalf implements zzamo {
    private static final zzum zzc;
    private static volatile zzamv zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzuq zzuqVar) {
            this();
        }

        public final zza zza(int i) {
            zzg();
            zzum.zza((zzum) this.zza, i);
            return this;
        }

        private zza() {
            super(zzum.zzd());
        }
    }

    static {
        zzum zzumVar = new zzum();
        zzc = zzumVar;
        zzalf.zza(zzum.class, zzumVar);
    }

    private zzum() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzum zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public static zzum zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzum) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzuo.zza[i - 1]) {
            case 1:
                return new zzum();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzum.class) {
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

    public static /* synthetic */ void zza(zzum zzumVar, int i) {
        zzumVar.zze = i;
    }
}

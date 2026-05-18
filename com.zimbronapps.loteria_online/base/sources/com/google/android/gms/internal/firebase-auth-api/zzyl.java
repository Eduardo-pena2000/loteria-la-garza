package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzyl extends zzalf implements zzamo {
    private static final zzyl zzc;
    private static volatile zzamv zzd;
    private int zze;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzym zzymVar) {
            this();
        }

        public final zza zza(int i) {
            zzg();
            zzyl.zza((zzyl) this.zza, i);
            return this;
        }

        private zza() {
            super(zzyl.zzc());
        }
    }

    static {
        zzyl zzylVar = new zzyl();
        zzc = zzylVar;
        zzalf.zza(zzyl.class, zzylVar);
    }

    private zzyl() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzyl zzc() {
        return zzc;
    }

    public static zzyl zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzyk.zza[i - 1]) {
            case 1:
                return new zzyl();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzyl.class) {
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

    public static /* synthetic */ void zza(zzyl zzylVar, int i) {
        zzylVar.zze = i;
    }
}

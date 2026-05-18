package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzyr extends zzalf implements zzamo {
    private static final zzyr zzc;
    private static volatile zzamv zzd;
    private int zze;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzys zzysVar) {
            this();
        }

        private zza() {
            super(zzyr.zzb());
        }
    }

    static {
        zzyr zzyrVar = new zzyr();
        zzc = zzyrVar;
        zzalf.zza(zzyr.class, zzyrVar);
    }

    private zzyr() {
    }

    public static /* bridge */ /* synthetic */ zzyr zzb() {
        return zzc;
    }

    public static zzyr zzc() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzyr zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzyr) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzyq.zza[i - 1]) {
            case 1:
                return new zzyr();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzyr.class) {
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
}

package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzua extends zzalf implements zzamo {
    private static final zzua zzc;
    private static volatile zzamv zzd;
    private int zze;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzue zzueVar) {
            this();
        }

        public final zza zza(int i) {
            zzg();
            zzua.zza((zzua) this.zza, i);
            return this;
        }

        private zza() {
            super(zzua.zzc());
        }
    }

    static {
        zzua zzuaVar = new zzua();
        zzc = zzuaVar;
        zzalf.zza(zzua.class, zzuaVar);
    }

    private zzua() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzua zzc() {
        return zzc;
    }

    public static zzua zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzuc.zza[i - 1]) {
            case 1:
                return new zzua();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzua.class) {
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

    public static /* synthetic */ void zza(zzua zzuaVar, int i) {
        zzuaVar.zze = i;
    }
}

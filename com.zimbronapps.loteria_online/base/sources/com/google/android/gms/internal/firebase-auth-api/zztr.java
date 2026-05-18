package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zztr extends zzalf implements zzamo {
    private static final zztr zzc;
    private static volatile zzamv zzd;
    private int zze;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zztv zztvVar) {
            this();
        }

        public final zza zza(int i) {
            zzg();
            zztr.zza((zztr) this.zza, i);
            return this;
        }

        private zza() {
            super(zztr.zzc());
        }
    }

    static {
        zztr zztrVar = new zztr();
        zzc = zztrVar;
        zzalf.zza(zztr.class, zztrVar);
    }

    private zztr() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zztr zzc() {
        return zzc;
    }

    public static zztr zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zztt.zza[i - 1]) {
            case 1:
                return new zztr();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zztr.class) {
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

    public static /* synthetic */ void zza(zztr zztrVar, int i) {
        zztrVar.zze = i;
    }
}

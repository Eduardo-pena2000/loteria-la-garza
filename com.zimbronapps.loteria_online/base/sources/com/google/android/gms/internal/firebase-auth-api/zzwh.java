package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzwh extends zzalf implements zzamo {
    private static final zzwh zzc;
    private static volatile zzamv zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzwi zzwiVar) {
            this();
        }

        public final zza zza(zzvy zzvyVar) {
            zzg();
            zzwh.zza((zzwh) this.zza, zzvyVar);
            return this;
        }

        private zza() {
            super(zzwh.zzd());
        }

        public final zza zza(int i) {
            zzg();
            zzwh.zza((zzwh) this.zza, i);
            return this;
        }
    }

    static {
        zzwh zzwhVar = new zzwh();
        zzc = zzwhVar;
        zzalf.zza(zzwh.class, zzwhVar);
    }

    private zzwh() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzwh zzd() {
        return zzc;
    }

    public static zzwh zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvy zzb() {
        zzvy zza2 = zzvy.zza(this.zze);
        return zza2 == null ? zzvy.UNRECOGNIZED : zza2;
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzwg.zza[i - 1]) {
            case 1:
                return new zzwh();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzwh.class) {
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

    public static /* synthetic */ void zza(zzwh zzwhVar, zzvy zzvyVar) {
        zzwhVar.zze = zzvyVar.zza();
    }

    public static /* synthetic */ void zza(zzwh zzwhVar, int i) {
        zzwhVar.zzf = i;
    }
}

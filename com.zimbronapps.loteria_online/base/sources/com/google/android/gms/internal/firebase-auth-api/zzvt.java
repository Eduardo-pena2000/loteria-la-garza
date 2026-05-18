package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzvt extends zzalf implements zzamo {
    private static final zzvt zzc;
    private static volatile zzamv zzd;
    private int zze;
    private int zzf;
    private zzajv zzg = zzajv.zza;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzvu zzvuVar) {
            this();
        }

        public final zza zza(zzvw zzvwVar) {
            zzg();
            zzvt.zza((zzvt) this.zza, zzvwVar);
            return this;
        }

        private zza() {
            super(zzvt.zzb());
        }

        public final zza zza(zzvy zzvyVar) {
            zzg();
            zzvt.zza((zzvt) this.zza, zzvyVar);
            return this;
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzvt.zza((zzvt) this.zza, zzajvVar);
            return this;
        }
    }

    static {
        zzvt zzvtVar = new zzvt();
        zzc = zzvtVar;
        zzalf.zza(zzvt.class, zzvtVar);
    }

    private zzvt() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzvt zzb() {
        return zzc;
    }

    public static zzvt zzc() {
        return zzc;
    }

    public final zzvw zzd() {
        zzvw zza2 = zzvw.zza(this.zze);
        return zza2 == null ? zzvw.zze : zza2;
    }

    public final zzvy zze() {
        zzvy zza2 = zzvy.zza(this.zzf);
        return zza2 == null ? zzvy.zzf : zza2;
    }

    public final zzajv zzf() {
        return this.zzg;
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzvs.zza[i - 1]) {
            case 1:
                return new zzvt();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzvt.class) {
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

    public static /* synthetic */ void zza(zzvt zzvtVar, zzvw zzvwVar) {
        zzvtVar.zze = zzvwVar.zza();
    }

    public static /* synthetic */ void zza(zzvt zzvtVar, zzvy zzvyVar) {
        zzvtVar.zzf = zzvyVar.zza();
    }

    public static /* synthetic */ void zza(zzvt zzvtVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzvtVar.zzg = zzajvVar;
    }
}

package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzvk extends zzalf implements zzamo {
    private static final zzvk zzc;
    private static volatile zzamv zzd;
    private int zze;
    private zzvt zzf;
    private zzve zzg;
    private int zzh;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzvl zzvlVar) {
            this();
        }

        public final zza zza(zzve zzveVar) {
            zzg();
            zzvk.zza((zzvk) this.zza, zzveVar);
            return this;
        }

        private zza() {
            super(zzvk.zzd());
        }

        public final zza zza(zzvb zzvbVar) {
            zzg();
            zzvk.zza((zzvk) this.zza, zzvbVar);
            return this;
        }

        public final zza zza(zzvt zzvtVar) {
            zzg();
            zzvk.zza((zzvk) this.zza, zzvtVar);
            return this;
        }
    }

    static {
        zzvk zzvkVar = new zzvk();
        zzc = zzvkVar;
        zzalf.zza(zzvk.class, zzvkVar);
    }

    private zzvk() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzvk zzd() {
        return zzc;
    }

    public static zzvk zze() {
        return zzc;
    }

    public final zzvb zza() {
        zzvb zza2 = zzvb.zza(this.zzh);
        return zza2 == null ? zzvb.UNRECOGNIZED : zza2;
    }

    public final zzve zzb() {
        zzve zzveVar = this.zzg;
        return zzveVar == null ? zzve.zzc() : zzveVar;
    }

    public final zzvt zzf() {
        zzvt zzvtVar = this.zzf;
        return zzvtVar == null ? zzvt.zzc() : zzvtVar;
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzvj.zza[i - 1]) {
            case 1:
                return new zzvk();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzvk.class) {
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

    public static /* synthetic */ void zza(zzvk zzvkVar, zzve zzveVar) {
        zzveVar.getClass();
        zzvkVar.zzg = zzveVar;
        zzvkVar.zze |= 2;
    }

    public static /* synthetic */ void zza(zzvk zzvkVar, zzvb zzvbVar) {
        zzvkVar.zzh = zzvbVar.zza();
    }

    public static /* synthetic */ void zza(zzvk zzvkVar, zzvt zzvtVar) {
        zzvtVar.getClass();
        zzvkVar.zzf = zzvtVar;
        zzvkVar.zze |= 1;
    }
}

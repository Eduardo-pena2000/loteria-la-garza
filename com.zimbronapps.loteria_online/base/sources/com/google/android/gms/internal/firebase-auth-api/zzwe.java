package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzwe extends zzalf implements zzamo {
    private static final zzwe zzc;
    private static volatile zzamv zzd;
    private int zze;
    private zzwh zzf;
    private int zzg;
    private int zzh;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzwf zzwfVar) {
            this();
        }

        public final zza zza(int i) {
            zzg();
            zzwe.zza((zzwe) this.zza, i);
            return this;
        }

        private zza() {
            super(zzwe.zzd());
        }

        public final zza zza(zzwh zzwhVar) {
            zzg();
            zzwe.zza((zzwe) this.zza, zzwhVar);
            return this;
        }
    }

    static {
        zzwe zzweVar = new zzwe();
        zzc = zzweVar;
        zzalf.zza(zzwe.class, zzweVar);
    }

    private zzwe() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzwe zzd() {
        return zzc;
    }

    public static zzwe zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzh;
    }

    public final zzwh zzf() {
        zzwh zzwhVar = this.zzf;
        return zzwhVar == null ? zzwh.zze() : zzwhVar;
    }

    public static zzwe zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzwe) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzwd.zza[i - 1]) {
            case 1:
                return new zzwe();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzwe.class) {
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

    public static /* synthetic */ void zza(zzwe zzweVar, int i) {
        zzweVar.zzg = i;
    }

    public static /* synthetic */ void zza(zzwe zzweVar, zzwh zzwhVar) {
        zzwhVar.getClass();
        zzweVar.zzf = zzwhVar;
        zzweVar.zze |= 1;
    }
}

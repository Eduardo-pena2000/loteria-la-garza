package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzwr extends zzalf implements zzamo {
    private static final zzwr zzc;
    private static volatile zzamv zzd;
    private int zze;
    private int zzf;
    private zzwu zzg;
    private zzajv zzh = zzajv.zza;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzwv zzwvVar) {
            this();
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzwr.zza((zzwr) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzwr.zzc());
        }

        public final zza zza(zzwu zzwuVar) {
            zzg();
            zzwr.zza((zzwr) this.zza, zzwuVar);
            return this;
        }

        public final zza zza(int i) {
            zzg();
            zzwr.zza((zzwr) this.zza, 0);
            return this;
        }
    }

    static {
        zzwr zzwrVar = new zzwr();
        zzc = zzwrVar;
        zzalf.zza(zzwr.class, zzwrVar);
    }

    private zzwr() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzwr zzc() {
        return zzc;
    }

    public static zzamv zzf() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzwu zzd() {
        zzwu zzwuVar = this.zzg;
        return zzwuVar == null ? zzwu.zze() : zzwuVar;
    }

    public final zzajv zze() {
        return this.zzh;
    }

    public static zzwr zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzwr) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzwt.zza[i - 1]) {
            case 1:
                return new zzwr();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzwr.class) {
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

    public static /* synthetic */ void zza(zzwr zzwrVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzwrVar.zzh = zzajvVar;
    }

    public static /* synthetic */ void zza(zzwr zzwrVar, zzwu zzwuVar) {
        zzwuVar.getClass();
        zzwrVar.zzg = zzwuVar;
        zzwrVar.zze |= 1;
    }

    public static /* synthetic */ void zza(zzwr zzwrVar, int i) {
        zzwrVar.zzf = 0;
    }
}

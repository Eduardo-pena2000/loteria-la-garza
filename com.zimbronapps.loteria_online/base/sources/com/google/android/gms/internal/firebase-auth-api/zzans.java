package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzans extends zzalf implements zzamo {
    private static final zzans zzc;
    private static volatile zzamv zzd;
    private long zze;
    private int zzf;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzant zzantVar) {
            this();
        }

        public final zza zza(int i) {
            if (!this.zza.zzw()) {
                zzh();
            }
            zzans.zza((zzans) this.zza, i);
            return this;
        }

        private zza() {
            super(zzans.zzd());
        }

        public final zza zza(long j) {
            if (!this.zza.zzw()) {
                zzh();
            }
            zzans.zza((zzans) this.zza, j);
            return this;
        }
    }

    static {
        zzans zzansVar = new zzans();
        zzc = zzansVar;
        zzalf.zza(zzans.class, zzansVar);
    }

    private zzans() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzans zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zze;
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzanr.zza[i - 1]) {
            case 1:
                return new zzans();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzans.class) {
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

    public static /* synthetic */ void zza(zzans zzansVar, int i) {
        zzansVar.zzf = i;
    }

    public static /* synthetic */ void zza(zzans zzansVar, long j) {
        zzansVar.zze = j;
    }
}

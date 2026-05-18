package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzug extends zzalf implements zzamo {
    private static final zzug zzc;
    private static volatile zzamv zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzuk zzukVar) {
            this();
        }

        public final zza zza(int i) {
            zzg();
            zzug.zza((zzug) this.zza, i);
            return this;
        }

        private zza() {
            super(zzug.zzd());
        }
    }

    static {
        zzug zzugVar = new zzug();
        zzc = zzugVar;
        zzalf.zza(zzug.class, zzugVar);
    }

    private zzug() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzug zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public static zzug zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzug) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzui.zza[i - 1]) {
            case 1:
                return new zzug();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzug.class) {
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

    public static /* synthetic */ void zza(zzug zzugVar, int i) {
        zzugVar.zze = i;
    }
}

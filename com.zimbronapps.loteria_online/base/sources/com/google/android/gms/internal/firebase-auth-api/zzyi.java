package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzyi extends zzalf implements zzamo {
    private static final zzyi zzc;
    private static volatile zzamv zzd;
    private int zze;
    private int zzf;
    private zzyl zzg;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzyj zzyjVar) {
            this();
        }

        public final zza zza(zzyl zzylVar) {
            zzg();
            zzyi.zza((zzyi) this.zza, zzylVar);
            return this;
        }

        private zza() {
            super(zzyi.zzc());
        }
    }

    static {
        zzyi zzyiVar = new zzyi();
        zzc = zzyiVar;
        zzalf.zza(zzyi.class, zzyiVar);
    }

    private zzyi() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzyi zzc() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzyl zzd() {
        zzyl zzylVar = this.zzg;
        return zzylVar == null ? zzyl.zzd() : zzylVar;
    }

    public static zzyi zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzyi) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzyh.zza[i - 1]) {
            case 1:
                return new zzyi();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzyi.class) {
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

    public static /* synthetic */ void zza(zzyi zzyiVar, zzyl zzylVar) {
        zzylVar.getClass();
        zzyiVar.zzg = zzylVar;
        zzyiVar.zze |= 1;
    }
}

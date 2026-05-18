package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzud extends zzalf implements zzamo {
    private static final zzud zzc;
    private static volatile zzamv zzd;
    private int zze;
    private zzajv zzf = zzajv.zza;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzuh zzuhVar) {
            this();
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzud.zza((zzud) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzud.zzc());
        }
    }

    static {
        zzud zzudVar = new zzud();
        zzc = zzudVar;
        zzalf.zza(zzud.class, zzudVar);
    }

    private zzud() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzud zzc() {
        return zzc;
    }

    public static zzamv zze() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzajv zzd() {
        return this.zzf;
    }

    public static zzud zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzud) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzuf.zza[i - 1]) {
            case 1:
                return new zzud();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzud.class) {
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

    public static /* synthetic */ void zza(zzud zzudVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzudVar.zzf = zzajvVar;
    }
}

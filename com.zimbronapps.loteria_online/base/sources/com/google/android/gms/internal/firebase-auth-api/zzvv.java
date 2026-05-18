package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzvv extends zzalf implements zzamo {
    private static final zzvv zzc;
    private static volatile zzamv zzd;
    private int zze;
    private zzajv zzf = zzajv.zza;
    private zzxk zzg;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzvz zzvzVar) {
            this();
        }

        public final zza zza() {
            zzg();
            zzvv.zza((zzvv) this.zza);
            return this;
        }

        private zza() {
            super(zzvv.zzb());
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzvv.zza((zzvv) this.zza, zzajvVar);
            return this;
        }

        public final zza zza(zzxk zzxkVar) {
            zzg();
            zzvv.zza((zzvv) this.zza, zzxkVar);
            return this;
        }
    }

    static {
        zzvv zzvvVar = new zzvv();
        zzc = zzvvVar;
        zzalf.zza(zzvv.class, zzvvVar);
    }

    private zzvv() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzvv zzb() {
        return zzc;
    }

    public final zzajv zzc() {
        return this.zzf;
    }

    public static zzvv zza(InputStream inputStream, zzaku zzakuVar) throws IOException {
        return (zzvv) zzalf.zza(zzc, inputStream, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzvx.zza[i - 1]) {
            case 1:
                return new zzvv();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzvv.class) {
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

    public static /* synthetic */ void zza(zzvv zzvvVar) {
        zzvvVar.zzg = null;
        zzvvVar.zze &= -2;
    }

    public static /* synthetic */ void zza(zzvv zzvvVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzvvVar.zzf = zzajvVar;
    }

    public static /* synthetic */ void zza(zzvv zzvvVar, zzxk zzxkVar) {
        zzxkVar.getClass();
        zzvvVar.zzg = zzxkVar;
        zzvvVar.zze |= 1;
    }
}

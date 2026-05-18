package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzwu extends zzalf implements zzamo {
    private static final zzwu zzc;
    private static volatile zzamv zzd;
    private int zze;
    private int zzf;
    private zzwo zzg;
    private zzajv zzh = zzajv.zza;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzwy zzwyVar) {
            this();
        }

        public final zza zza(zzwo zzwoVar) {
            zzg();
            zzwu.zza((zzwu) this.zza, zzwoVar);
            return this;
        }

        private zza() {
            super(zzwu.zzd());
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzwu.zza((zzwu) this.zza, zzajvVar);
            return this;
        }

        public final zza zza(int i) {
            zzg();
            zzwu.zza((zzwu) this.zza, 0);
            return this;
        }
    }

    static {
        zzwu zzwuVar = new zzwu();
        zzc = zzwuVar;
        zzalf.zza(zzwu.class, zzwuVar);
    }

    private zzwu() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzwu zzd() {
        return zzc;
    }

    public static zzwu zze() {
        return zzc;
    }

    public static zzamv zzg() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzwo zzb() {
        zzwo zzwoVar = this.zzg;
        return zzwoVar == null ? zzwo.zzf() : zzwoVar;
    }

    public final zzajv zzf() {
        return this.zzh;
    }

    public static zzwu zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzwu) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzww.zza[i - 1]) {
            case 1:
                return new zzwu();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzwu.class) {
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

    public static /* synthetic */ void zza(zzwu zzwuVar, zzwo zzwoVar) {
        zzwoVar.getClass();
        zzwuVar.zzg = zzwoVar;
        zzwuVar.zze |= 1;
    }

    public static /* synthetic */ void zza(zzwu zzwuVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzwuVar.zzh = zzajvVar;
    }

    public static /* synthetic */ void zza(zzwu zzwuVar, int i) {
        zzwuVar.zzf = 0;
    }
}

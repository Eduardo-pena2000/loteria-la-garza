package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zztf extends zzalf implements zzamo {
    private static final zztf zzc;
    private static volatile zzamv zzd;
    private int zze;
    private int zzf;
    private zztl zzg;
    private zzwb zzh;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zztj zztjVar) {
            this();
        }

        public final zza zza(zztl zztlVar) {
            zzg();
            zztf.zza((zztf) this.zza, zztlVar);
            return this;
        }

        private zza() {
            super(zztf.zzc());
        }

        public final zza zza(zzwb zzwbVar) {
            zzg();
            zztf.zza((zztf) this.zza, zzwbVar);
            return this;
        }
    }

    static {
        zztf zztfVar = new zztf();
        zzc = zztfVar;
        zzalf.zza(zztf.class, zztfVar);
    }

    private zztf() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zztf zzc() {
        return zzc;
    }

    public static zzamv zzf() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zztl zzd() {
        zztl zztlVar = this.zzg;
        return zztlVar == null ? zztl.zzd() : zztlVar;
    }

    public final zzwb zze() {
        zzwb zzwbVar = this.zzh;
        return zzwbVar == null ? zzwb.zzd() : zzwbVar;
    }

    public static zztf zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zztf) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzth.zza[i - 1]) {
            case 1:
                return new zztf();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zztf.class) {
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

    public static /* synthetic */ void zza(zztf zztfVar, zztl zztlVar) {
        zztlVar.getClass();
        zztfVar.zzg = zztlVar;
        zztfVar.zze |= 1;
    }

    public static /* synthetic */ void zza(zztf zztfVar, zzwb zzwbVar) {
        zzwbVar.getClass();
        zztfVar.zzh = zzwbVar;
        zztfVar.zze |= 2;
    }
}

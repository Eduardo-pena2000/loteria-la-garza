package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzti extends zzalf implements zzamo {
    private static final zzti zzc;
    private static volatile zzamv zzd;
    private int zze;
    private zzto zzf;
    private zzwe zzg;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zztm zztmVar) {
            this();
        }

        public final zza zza(zzto zztoVar) {
            zzg();
            zzti.zza((zzti) this.zza, zztoVar);
            return this;
        }

        private zza() {
            super(zzti.zzb());
        }

        public final zza zza(zzwe zzweVar) {
            zzg();
            zzti.zza((zzti) this.zza, zzweVar);
            return this;
        }
    }

    static {
        zzti zztiVar = new zzti();
        zzc = zztiVar;
        zzalf.zza(zzti.class, zztiVar);
    }

    private zzti() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzti zzb() {
        return zzc;
    }

    public final zzto zzc() {
        zzto zztoVar = this.zzf;
        return zztoVar == null ? zzto.zzd() : zztoVar;
    }

    public final zzwe zzd() {
        zzwe zzweVar = this.zzg;
        return zzweVar == null ? zzwe.zze() : zzweVar;
    }

    public static zzti zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzti) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zztk.zza[i - 1]) {
            case 1:
                return new zzti();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzti.class) {
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

    public static /* synthetic */ void zza(zzti zztiVar, zzto zztoVar) {
        zztoVar.getClass();
        zztiVar.zzf = zztoVar;
        zztiVar.zze |= 1;
    }

    public static /* synthetic */ void zza(zzti zztiVar, zzwe zzweVar) {
        zzweVar.getClass();
        zztiVar.zzg = zzweVar;
        zztiVar.zze |= 2;
    }
}

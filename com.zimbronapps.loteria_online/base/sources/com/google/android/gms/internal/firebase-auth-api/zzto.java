package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzto extends zzalf implements zzamo {
    private static final zzto zzc;
    private static volatile zzamv zzd;
    private int zze;
    private zztr zzf;
    private int zzg;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzts zztsVar) {
            this();
        }

        public final zza zza(int i) {
            zzg();
            zzto.zza((zzto) this.zza, i);
            return this;
        }

        private zza() {
            super(zzto.zzc());
        }

        public final zza zza(zztr zztrVar) {
            zzg();
            zzto.zza((zzto) this.zza, zztrVar);
            return this;
        }
    }

    static {
        zzto zztoVar = new zzto();
        zzc = zztoVar;
        zzalf.zza(zzto.class, zztoVar);
    }

    private zzto() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzto zzc() {
        return zzc;
    }

    public static zzto zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zztr zze() {
        zztr zztrVar = this.zzf;
        return zztrVar == null ? zztr.zzd() : zztrVar;
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zztq.zza[i - 1]) {
            case 1:
                return new zzto();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzto.class) {
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

    public static /* synthetic */ void zza(zzto zztoVar, int i) {
        zztoVar.zzg = i;
    }

    public static /* synthetic */ void zza(zzto zztoVar, zztr zztrVar) {
        zztrVar.getClass();
        zztoVar.zzf = zztrVar;
        zztoVar.zze |= 1;
    }
}

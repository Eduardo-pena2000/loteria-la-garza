package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zztx extends zzalf implements zzamo {
    private static final zztx zzc;
    private static volatile zzamv zzd;
    private int zze;
    private zzua zzf;
    private int zzg;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzub zzubVar) {
            this();
        }

        public final zza zza(int i) {
            zzg();
            zztx.zza((zztx) this.zza, i);
            return this;
        }

        private zza() {
            super(zztx.zzc());
        }

        public final zza zza(zzua zzuaVar) {
            zzg();
            zztx.zza((zztx) this.zza, zzuaVar);
            return this;
        }
    }

    static {
        zztx zztxVar = new zztx();
        zzc = zztxVar;
        zzalf.zza(zztx.class, zztxVar);
    }

    private zztx() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zztx zzc() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzua zzd() {
        zzua zzuaVar = this.zzf;
        return zzuaVar == null ? zzua.zzd() : zzuaVar;
    }

    public static zztx zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zztx) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zztz.zza[i - 1]) {
            case 1:
                return new zztx();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zztx.class) {
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

    public static /* synthetic */ void zza(zztx zztxVar, int i) {
        zztxVar.zzg = i;
    }

    public static /* synthetic */ void zza(zztx zztxVar, zzua zzuaVar) {
        zzuaVar.getClass();
        zztxVar.zzf = zzuaVar;
        zztxVar.zze |= 1;
    }
}

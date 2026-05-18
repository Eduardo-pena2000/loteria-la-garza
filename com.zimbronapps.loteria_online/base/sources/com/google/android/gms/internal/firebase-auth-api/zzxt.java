package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzxt extends zzalf implements zzamo {
    private static final zzxt zzc;
    private static volatile zzamv zzd;
    private int zze;
    private int zzf;
    private zzxw zzg;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzxx zzxxVar) {
            this();
        }

        public final zza zza(zzxw zzxwVar) {
            zzg();
            zzxt.zza((zzxt) this.zza, zzxwVar);
            return this;
        }

        private zza() {
            super(zzxt.zzc());
        }
    }

    static {
        zzxt zzxtVar = new zzxt();
        zzc = zzxtVar;
        zzalf.zza(zzxt.class, zzxtVar);
    }

    private zzxt() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzxt zzc() {
        return zzc;
    }

    public static zzamv zze() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzxw zzd() {
        zzxw zzxwVar = this.zzg;
        return zzxwVar == null ? zzxw.zzd() : zzxwVar;
    }

    public static zzxt zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzxt) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzxv.zza[i - 1]) {
            case 1:
                return new zzxt();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzxt.class) {
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

    public static /* synthetic */ void zza(zzxt zzxtVar, zzxw zzxwVar) {
        zzxwVar.getClass();
        zzxtVar.zzg = zzxwVar;
        zzxtVar.zze |= 1;
    }
}

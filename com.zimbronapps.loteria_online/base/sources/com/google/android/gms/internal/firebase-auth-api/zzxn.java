package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzxn extends zzalf implements zzamo {
    private static final zzxn zzc;
    private static volatile zzamv zzd;
    private int zze;
    private int zzf;
    private zzxq zzg;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzxr zzxrVar) {
            this();
        }

        public final zza zza(zzxq zzxqVar) {
            zzg();
            zzxn.zza((zzxn) this.zza, zzxqVar);
            return this;
        }

        private zza() {
            super(zzxn.zzc());
        }
    }

    static {
        zzxn zzxnVar = new zzxn();
        zzc = zzxnVar;
        zzalf.zza(zzxn.class, zzxnVar);
    }

    private zzxn() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzxn zzc() {
        return zzc;
    }

    public static zzamv zze() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzxq zzd() {
        zzxq zzxqVar = this.zzg;
        return zzxqVar == null ? zzxq.zzc() : zzxqVar;
    }

    public static zzxn zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzxn) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzxp.zza[i - 1]) {
            case 1:
                return new zzxn();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzxn.class) {
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

    public static /* synthetic */ void zza(zzxn zzxnVar, zzxq zzxqVar) {
        zzxqVar.getClass();
        zzxnVar.zzg = zzxqVar;
        zzxnVar.zze |= 1;
    }
}

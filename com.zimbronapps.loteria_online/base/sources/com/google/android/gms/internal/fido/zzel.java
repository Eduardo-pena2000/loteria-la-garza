package com.google.android.gms.internal.fido;

import android.os.Build;
import dalvik.system.VMStack;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzel extends zzeg {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zzef zzc;

    public class 1 extends zzef {
        public zzdj zza(Class cls, int i) {
            return zzdj.zza;
        }

        public String zzb(Class cls) {
            StackTraceElement zza;
            if (zzel.zzs()) {
                try {
                    if (cls.equals(zzel.zzp())) {
                        return VMStack.getStackClass2().getName();
                    }
                } catch (Throwable unused) {
                }
            }
            if (!zzel.zzr() || (zza = zzfj.zza(cls, 1)) == null) {
                return null;
            }
            return zza.getClassName();
        }
    }

    final class zza {
        public static boolean zza() {
            return zzel.zzt();
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z = true;
        if (str != null && !"robolectric".equals(str)) {
            z = false;
        }
        zzb = z;
        zzc = new 1();
    }

    public static Class zzp() {
        return VMStack.getStackClass2();
    }

    public static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzr() {
        return zzb;
    }

    public static /* bridge */ /* synthetic */ boolean zzs() {
        return zza;
    }

    public static boolean zzt() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", (Class[]) null);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    public zzdp zze(String str) {
        return zzeo.zzb(str);
    }

    public zzef zzh() {
        return zzc;
    }

    public zzev zzj() {
        return zzep.zzb();
    }

    public String zzm() {
        return "platform: Android";
    }
}

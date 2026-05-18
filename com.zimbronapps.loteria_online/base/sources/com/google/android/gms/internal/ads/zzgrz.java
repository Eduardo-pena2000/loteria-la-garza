package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgrz {
    public static final /* synthetic */ int zza = 0;
    private static final Object zzb;

    static {
        Object zzc = zzc();
        zzb = zzc;
        if (zzc != null) {
            zze("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (zzc == null) {
            return;
        }
        zzd(zzc);
    }

    public static void zza(Throwable th, Class cls) throws Throwable {
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static void zzb(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    private static Object zzc() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzd(Object obj) {
        try {
            Method zze = zze("getStackTraceDepth", Throwable.class);
            if (zze == null) {
                return null;
            }
            zze.invoke(obj, new Object[]{new Throwable()});
            return zze;
        } catch (UnsupportedOperationException | IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Method zze(String str, Class... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }
}

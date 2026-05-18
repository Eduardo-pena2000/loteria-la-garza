package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzggq extends zzghb {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    public zzggq(zzawg zzawgVar, zzgfx zzgfxVar, zzgoe zzgoeVar) {
        super("3oTRZjKQOSoYyvNcYQSsDbCCM8OIxNI6HsD2yraLy7cjC5n8lPLLp8aPMOPQzMR5", "MHRGFnzrWite6OUEzeDGE6xEKTeZ1rlshMbJC9yXOH8=", zzawgVar, zzgfxVar, zzgoeVar.zza(117));
    }

    public final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        Long l = (Long) method.invoke("", (Object[]) null);
                        if (l == null) {
                            throw null;
                        }
                        zza = l;
                    }
                } finally {
                }
            }
        }
        synchronized (zzawgVar) {
            try {
                if (zza != null) {
                    zzawgVar.zzm(zza.longValue());
                }
            } finally {
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzggu extends zzghb {
    private final Context zza;

    public zzggu(zzawg zzawgVar, zzgfx zzgfxVar, Context context, zzgoe zzgoeVar) {
        super("10eHn0oEJc+Kv4xHAilDadQXUH+Qd7+H1wb3g/5791dKT43oKLnvfFcwz9lBLCYb", "DO5TusvTbmxbLfPhMKcHxON+YLmz+u+OpsMl13dRFcs=", zzawgVar, zzgfxVar, zzgoeVar.zza(119));
        this.zza = context;
    }

    public final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", new Object[]{this.zza});
        objArr.getClass();
        synchronized (zzawgVar) {
            zzawgVar.zzc(((Long) objArr[0]).longValue());
            zzawgVar.zzP(((Long) objArr[1]).longValue());
        }
    }
}

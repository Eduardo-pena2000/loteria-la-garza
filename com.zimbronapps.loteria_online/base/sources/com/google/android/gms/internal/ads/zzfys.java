package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfys {
    public static Object zza(String str, String str2, zzfyr... zzfyrVarArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        return Class.forName(str).getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
    }
}

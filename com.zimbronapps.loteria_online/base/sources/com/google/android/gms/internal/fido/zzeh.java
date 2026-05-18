package com.google.android.gms.internal.fido;

import com.google.common.flogger.backend.google.GooglePlatform;
import com.google.common.flogger.backend.system.DefaultPlatform;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzeh {
    public static zzeg zza() {
        try {
            try {
                try {
                    return (zzeg) zzel.class.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                } catch (NoClassDefFoundError | IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException unused) {
                    return (zzeg) GooglePlatform.class.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                }
            } catch (NoClassDefFoundError | IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException unused2) {
                return (zzeg) DefaultPlatform.class.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            }
        } catch (NoClassDefFoundError | IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException unused3) {
            return null;
        }
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzijy {
    public static zzijy zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzijt(cls.getSimpleName()) : new zzijv(cls.getSimpleName());
    }

    public abstract void zza(String str);
}

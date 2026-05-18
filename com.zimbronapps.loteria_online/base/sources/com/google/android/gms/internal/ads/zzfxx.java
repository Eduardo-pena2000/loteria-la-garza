package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzfxx implements Closeable {
    public static zzfyj zza() {
        return new zzfyj();
    }

    public static zzfyj zzb(zzgru zzgruVar, zzgru zzgruVar2, zzfxz zzfxzVar) {
        return new zzfyj(zzgruVar, zzgruVar2, zzfxzVar);
    }

    public static zzfyj zzc(int i, zzfxz zzfxzVar) {
        return new zzfyj(new zzfxw(i), zzfxv.zza, zzfxzVar);
    }

    public static /* synthetic */ Integer zzd(int i) {
        return zzg(i);
    }

    public static /* synthetic */ Integer zze() {
        return zzf();
    }

    private static /* synthetic */ Integer zzf() {
        return -1;
    }

    private static /* synthetic */ Integer zzg(int i) {
        return Integer.valueOf(i);
    }
}

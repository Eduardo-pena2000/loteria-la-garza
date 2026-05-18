package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcj {
    private static AudioManager zza;

    public static synchronized AudioManager zza(Context context) {
        synchronized (zzcj.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    zza = null;
                }
                AudioManager audioManager = zza;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    zzdq zzdqVar = new zzdq(zzdn.zza);
                    zzdh.zza().execute(new zzci(applicationContext, zzdqVar));
                    zzdqVar.zzd();
                    AudioManager audioManager2 = zza;
                    if (audioManager2 != null) {
                        return audioManager2;
                    }
                    throw null;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                zza = audioManager3;
                if (audioManager3 != null) {
                    return audioManager3;
                }
                throw null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void zzb(Context context, zzdq zzdqVar) {
        zza = (AudioManager) context.getSystemService("audio");
        zzdqVar.zza();
    }
}

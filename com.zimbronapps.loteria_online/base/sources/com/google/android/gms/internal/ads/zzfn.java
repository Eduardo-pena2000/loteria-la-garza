package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfn {
    private final Context zza;
    private PowerManager.WakeLock zzb;

    public zzfn(Context context) {
        this.zza = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WakelockTimeout"})
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzb(boolean z, boolean z2) {
        if (z) {
            if (this.zzb == null) {
                Context context = this.zza;
                if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    zzee.zzc("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager == null) {
                    zzee.zzc("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.zzb = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
        }
        PowerManager.WakeLock wakeLock = this.zzb;
        if (wakeLock == null) {
            return;
        }
        if (zzfo.zze(z, z2)) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zza() {
        PowerManager.WakeLock wakeLock = this.zzb;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzace extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzacd zzd;
    private boolean zze;

    public /* synthetic */ zzace(zzacd zzacdVar, SurfaceTexture surfaceTexture, boolean z, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzacdVar;
        this.zza = z;
    }

    public static synchronized boolean zza(Context context) {
        int i;
        synchronized (zzace.class) {
            if (zzc) {
                i = zzb;
            } else {
                try {
                } catch (zzdu e) {
                    zzee.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e.getMessage())));
                }
                int i2 = zzdv.zza(context) ? zzdv.zzb() ? 1 : 2 : 0;
                zzb = i2;
                zzc = true;
                i = zzb;
            }
        }
        return i != 0;
    }

    public static zzace zzb(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zza(context)) {
            z2 = false;
        }
        zzgrc.zzi(z2);
        return new zzacd().zza(z ? zzb : 0);
    }

    public final void release() {
        super.release();
        zzacd zzacdVar = this.zzd;
        synchronized (zzacdVar) {
            try {
                if (!this.zze) {
                    zzacdVar.zzb();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

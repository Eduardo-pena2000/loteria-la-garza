package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgam extends zzgak {
    private static zzgam zzd;

    private zzgam(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzgam zzh(Context context) {
        zzgam zzgamVar;
        synchronized (zzgam.class) {
            try {
                if (zzd == null) {
                    zzd = new zzgam(context);
                }
                zzgamVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgamVar;
    }

    public final zzgah zzi(long j, boolean z) throws IOException {
        synchronized (zzgam.class) {
            try {
                if (this.zzc.zzc()) {
                    return zza(null, null, j, z);
                }
                return new zzgah();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzgam.class) {
            try {
                if (zzg(false)) {
                    zzc(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

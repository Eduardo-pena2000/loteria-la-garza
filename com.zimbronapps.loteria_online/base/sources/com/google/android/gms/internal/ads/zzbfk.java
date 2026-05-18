package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.d;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbfk implements d.b {
    final /* synthetic */ zzbfl zza;

    public zzbfk(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.zza = zzbflVar;
    }

    public final void onConnectionFailed(v6.b bVar) {
        zzbfl zzbflVar = this.zza;
        synchronized (zzbflVar.zzh()) {
            try {
                zzbflVar.zzk(null);
                if (zzbflVar.zzi() != null) {
                    zzbflVar.zzj(null);
                }
                zzbflVar.zzh().notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

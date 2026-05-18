package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.d;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbfj implements d.a {
    final /* synthetic */ zzbfl zza;

    public zzbfj(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.zza = zzbflVar;
    }

    public final void onConnected(Bundle bundle) {
        zzbfl zzbflVar = this.zza;
        synchronized (zzbflVar.zzh()) {
            try {
            } catch (DeadObjectException e) {
                int i = o0.b;
                W5.p.d("Unable to obtain a cache service instance.", e);
                this.zza.zzg();
            }
            if (zzbflVar.zzi() != null) {
                zzbflVar.zzk(zzbflVar.zzi().zzq());
                this.zza.zzh().notifyAll();
            } else {
                this.zza.zzh().notifyAll();
            }
        }
    }

    public final void onConnectionSuspended(int i) {
        zzbfl zzbflVar = this.zza;
        synchronized (zzbflVar.zzh()) {
            zzbflVar.zzk(null);
            zzbflVar.zzh().notifyAll();
        }
    }
}

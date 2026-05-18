package com.google.android.gms.internal.ads;

import S5.d0;
import V5.o0;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfin implements f6.a {
    final /* synthetic */ d0 zza;
    final /* synthetic */ zzfio zzb;

    public zzfin(zzfio zzfioVar, d0 d0Var) {
        this.zza = d0Var;
        Objects.requireNonNull(zzfioVar);
        this.zzb = zzfioVar;
    }

    public final void onAdMetadataChanged() {
        if (this.zzb.zzw() != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                int i = o0.b;
                W5.p.i("#007 Could not call remote method.", e);
            }
        }
    }
}

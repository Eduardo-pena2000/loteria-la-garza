package com.google.android.gms.internal.ads;

import S5.S0;
import V5.o0;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfig implements f6.a {
    final /* synthetic */ S0 zza;
    final /* synthetic */ zzfii zzb;

    public zzfig(zzfii zzfiiVar, S0 s0) {
        this.zza = s0;
        Objects.requireNonNull(zzfiiVar);
        this.zzb = zzfiiVar;
    }

    public final void onAdMetadataChanged() {
        if (this.zzb.zzv() != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e) {
                int i = o0.b;
                W5.p.i("#007 Could not call remote method.", e);
            }
        }
    }
}

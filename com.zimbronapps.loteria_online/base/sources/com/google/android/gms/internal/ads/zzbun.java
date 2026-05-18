package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbun implements Y5.b {
    final /* synthetic */ zzbqk zza;

    public zzbun(zzbuu zzbuuVar, zzbqk zzbqkVar) {
        this.zza = zzbqkVar;
        Objects.requireNonNull(zzbuuVar);
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.zza.zze();
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }
}

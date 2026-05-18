package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbwd implements a6.b {
    final /* synthetic */ zzbvv zza;

    public zzbwd(zzbwf zzbwfVar, zzbvv zzbvvVar) {
        this.zza = zzbvvVar;
        Objects.requireNonNull(zzbwfVar);
    }

    public final void onFailure(L5.b bVar) {
        try {
            this.zza.zzg(bVar.d());
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final void onSuccess(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbwe implements Y5.e {
    final /* synthetic */ zzbvp zza;
    final /* synthetic */ zzbtz zzb;
    final /* synthetic */ zzbwf zzc;

    public zzbwe(zzbwf zzbwfVar, zzbvp zzbvpVar, zzbtz zzbtzVar) {
        this.zza = zzbvpVar;
        this.zzb = zzbtzVar;
        Objects.requireNonNull(zzbwfVar);
        this.zzc = zzbwfVar;
    }

    public final void onFailure(L5.b bVar) {
        try {
            this.zza.zzg(bVar.d());
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        Y5.w wVar = (Y5.w) obj;
        if (wVar != null) {
            try {
                this.zzc.zzd(wVar);
                this.zza.zze();
            } catch (RemoteException e) {
                W5.p.d("", e);
            }
            return new zzbwg(this.zzb);
        }
        W5.p.f("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            W5.p.d("", e2);
            return null;
        }
    }

    public final void onFailure(String str) {
        onFailure(new L5.b(0, str, "undefined"));
    }
}

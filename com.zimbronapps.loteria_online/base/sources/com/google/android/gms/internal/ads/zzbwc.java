package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbwc implements Y5.e {
    final /* synthetic */ zzbvd zza;
    final /* synthetic */ zzbtz zzb;
    final /* synthetic */ zzbwf zzc;

    public zzbwc(zzbwf zzbwfVar, zzbvd zzbvdVar, zzbtz zzbtzVar) {
        this.zza = zzbvdVar;
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
        Y5.h hVar = (Y5.h) obj;
        if (hVar != null) {
            try {
                this.zzc.zzu(hVar);
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

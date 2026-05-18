package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbwa implements Y5.e {
    final /* synthetic */ zzbvm zza;
    final /* synthetic */ zzbtz zzb;

    public zzbwa(zzbwf zzbwfVar, zzbvm zzbvmVar, zzbtz zzbtzVar) {
        this.zza = zzbvmVar;
        this.zzb = zzbtzVar;
        Objects.requireNonNull(zzbwfVar);
    }

    public final void onFailure(L5.b bVar) {
        try {
            this.zza.zzg(bVar.d());
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        android.support.v4.media.session.b.a(obj);
        W5.p.f("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final void onFailure(String str) {
        onFailure(new L5.b(0, str, "undefined"));
    }
}

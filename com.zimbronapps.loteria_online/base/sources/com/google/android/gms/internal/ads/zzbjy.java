package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbjy {
    private final Context zza;

    public zzbjy(Context context) {
        this.zza = context;
    }

    public final void zza(zzbyv zzbyvVar) {
        try {
            ((zzbjz) W5.t.a(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbjx.zza)).zze(zzbyvVar);
        } catch (RemoteException e) {
            W5.p.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
        } catch (W5.s e2) {
            W5.p.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
        }
    }
}

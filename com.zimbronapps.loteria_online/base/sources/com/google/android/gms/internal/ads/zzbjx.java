package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbjx implements W5.r {
    static final /* synthetic */ zzbjx zza = new zzbjx();

    private /* synthetic */ zzbjx() {
    }

    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
        return queryLocalInterface instanceof zzbjz ? (zzbjz) queryLocalInterface : new zzbjz(iBinder);
    }
}

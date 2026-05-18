package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.internal.t;
import h7.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzay extends zzan {
    private e zza;

    public zzay(e eVar) {
        t.b(eVar != null, "listener can't be null.");
        this.zza = eVar;
    }

    public final void zzb(m mVar) throws RemoteException {
        this.zza.setResult(mVar);
        this.zza = null;
    }
}

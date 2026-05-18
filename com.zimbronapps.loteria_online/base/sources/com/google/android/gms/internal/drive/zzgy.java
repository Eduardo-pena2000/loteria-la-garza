package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgy extends zzl {
    private final e zzdx;

    public zzgy(e eVar) {
        this.zzdx = eVar;
    }

    public final void onSuccess() throws RemoteException {
        this.zzdx.setResult(Status.f);
    }

    public final void zza(Status status) throws RemoteException {
        this.zzdx.setResult(status);
    }
}

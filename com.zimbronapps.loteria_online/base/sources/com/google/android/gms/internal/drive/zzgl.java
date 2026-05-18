package com.google.android.gms.internal.drive;

import H6.h;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzgl extends zzl {
    private final e zzdx;
    private final h.a zziq;

    public zzgl(e eVar, h.a aVar) {
        this.zzdx = eVar;
        this.zziq = aVar;
    }

    public final void zza(zzfh zzfhVar) throws RemoteException {
        this.zzdx.setResult(new zzal(zzfhVar.zzhv ? new Status(-1) : Status.f, new zzbi(zzfhVar.zzes)));
    }

    public final void zza(zzfl zzflVar) throws RemoteException {
        h.a aVar = this.zziq;
        if (aVar != null) {
            aVar.onProgress(zzflVar.zzhy, zzflVar.zzhz);
        }
    }

    public final void zza(Status status) throws RemoteException {
        this.zzdx.setResult(new zzal(status, null));
    }
}

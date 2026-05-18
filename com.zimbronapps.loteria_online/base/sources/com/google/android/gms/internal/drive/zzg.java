package com.google.android.gms.internal.drive;

import I6.e;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzg implements e {
    private final l.a zzcy;
    private m zzcz = null;

    public zzg(l.a aVar) {
        this.zzcy = aVar;
    }

    public final boolean cancel() {
        m mVar = this.zzcz;
        if (mVar == null) {
            return false;
        }
        try {
            mVar.cancel();
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final void setCancelToken(m mVar) {
        this.zzcz = mVar;
    }

    public final l.a zzad() {
        return this.zzcy;
    }
}

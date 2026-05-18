package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.m;
import h7.H;
import h7.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbh extends H {
    final /* synthetic */ l zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbi zzbiVar, h hVar, l lVar, String str) {
        super(hVar);
        this.zza = lVar;
    }

    public final /* bridge */ /* synthetic */ m createFailedResult(Status status) {
        return new h7.m(status, null);
    }

    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzaz) bVar).zzL(this.zza, this, null);
    }
}

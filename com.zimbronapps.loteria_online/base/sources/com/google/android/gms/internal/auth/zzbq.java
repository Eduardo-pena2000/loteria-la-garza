package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.h;
import n6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbq extends zzbi {
    final /* synthetic */ b zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbq(zzbt zzbtVar, h hVar, b bVar) {
        super(hVar);
        this.zza = bVar;
    }

    public final void zza(Context context, zzbh zzbhVar) throws RemoteException {
        zzbhVar.zze(new zzbp(this), this.zza);
    }
}

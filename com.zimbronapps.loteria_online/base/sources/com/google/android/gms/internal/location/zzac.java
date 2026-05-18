package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import h7.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzac extends zzae {
    final /* synthetic */ h zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzaf zzafVar, com.google.android.gms.common.api.h hVar, h hVar2, PendingIntent pendingIntent) {
        super(hVar);
        this.zza = hVar2;
        this.zzb = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzaz) bVar).zzv(this.zza, this.zzb, this);
    }
}

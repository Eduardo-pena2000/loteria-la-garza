package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.location.LocationRequest;
import h7.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzs extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ j zzb;
    final /* synthetic */ Looper zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzz zzzVar, h hVar, LocationRequest locationRequest, j jVar, Looper looper) {
        super(hVar);
        this.zza = locationRequest;
        this.zzc = looper;
    }

    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzaz) bVar).zzC(this.zza, m.a((Object) null, zzbj.zza(this.zzc), j.class.getSimpleName()), new zzy(this));
    }
}

package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.location.LocationRequest;
import h7.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzt extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ i zzb;
    final /* synthetic */ Looper zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzz zzzVar, h hVar, LocationRequest locationRequest, i iVar, Looper looper) {
        super(hVar);
        this.zza = locationRequest;
        this.zzc = looper;
    }

    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzaz) bVar).zzB(zzba.zza(null, this.zza), m.a((Object) null, zzbj.zza(this.zzc), i.class.getSimpleName()), new zzy(this));
    }
}

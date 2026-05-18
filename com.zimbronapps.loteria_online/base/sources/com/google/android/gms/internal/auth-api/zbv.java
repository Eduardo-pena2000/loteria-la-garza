package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.h;
import l6.c;
import l6.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zbv extends zba implements IInterface {
    public zbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbl zblVar, c cVar, com.google.android.gms.common.api.c cVar2) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zblVar);
        zbc.zbb(zba, cVar);
        zbc.zbb(zba, cVar2);
        zbb(1, zba);
    }

    public final void zbd(h hVar, String str, com.google.android.gms.common.api.c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, hVar);
        zba.writeString(str);
        zbc.zbb(zba, cVar);
        zbb(2, zba);
    }

    public final void zbe(zbq zbqVar, l6.h hVar, com.google.android.gms.common.api.c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zbqVar);
        zbc.zbb(zba, hVar);
        zbc.zbb(zba, cVar);
        zbb(3, zba);
    }

    public final void zbf(zbo zboVar, g gVar, String str, com.google.android.gms.common.api.c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zboVar);
        zbc.zbb(zba, gVar);
        zba.writeString(str);
        zbc.zbb(zba, cVar);
        zbb(4, zba);
    }
}

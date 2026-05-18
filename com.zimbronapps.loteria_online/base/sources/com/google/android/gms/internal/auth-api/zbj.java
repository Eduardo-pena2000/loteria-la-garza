package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zbj extends zba implements IInterface {
    public zbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(zbi zbiVar, AuthorizationRequest authorizationRequest, c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zbiVar);
        zbc.zbb(zba, authorizationRequest);
        zbc.zbb(zba, cVar);
        zbb(1, zba);
    }

    public final void zbd(h hVar, RevokeAccessRequest revokeAccessRequest, c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, hVar);
        zbc.zbb(zba, revokeAccessRequest);
        zbc.zbb(zba, cVar);
        zbb(3, zba);
    }

    public final void zbe(h hVar, ClearTokenRequest clearTokenRequest, c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, hVar);
        zbc.zbb(zba, clearTokenRequest);
        zbc.zbb(zba, cVar);
        zbb(4, zba);
    }
}

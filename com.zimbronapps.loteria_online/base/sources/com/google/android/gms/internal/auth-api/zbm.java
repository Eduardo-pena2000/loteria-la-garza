package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.c;
import l6.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zbm extends zba implements IInterface {
    public zbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbs zbsVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zbsVar);
        zbc.zbb(zba, saveAccountLinkingTokenRequest);
        zbc.zbb(zba, cVar);
        zbb(1, zba);
    }

    public final void zbd(zbu zbuVar, k kVar, c cVar) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zbuVar);
        zbc.zbb(zba, kVar);
        zbc.zbb(zba, cVar);
        zbb(2, zba);
    }
}

package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import l6.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zbt extends zbb implements zbu {
    public zbt() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        l lVar = (l) zbc.zba(parcel, l.CREATOR);
        zbc.zbd(parcel);
        zbb(status, lVar);
        return true;
    }
}

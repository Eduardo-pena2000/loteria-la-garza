package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zbp extends zbb implements zbq {
    public zbp() {
        super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
    }

    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) zbc.zba(parcel, PendingIntent.CREATOR);
        zbc.zbd(parcel);
        zbb(status, pendingIntent);
        return true;
    }
}

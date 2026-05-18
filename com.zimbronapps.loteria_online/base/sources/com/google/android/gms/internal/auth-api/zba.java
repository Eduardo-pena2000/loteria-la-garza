package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zba implements IInterface {
    private final IBinder zba;
    private final String zbb;

    public zba(IBinder iBinder, String str) {
        this.zba = iBinder;
        this.zbb = str;
    }

    public final IBinder asBinder() {
        return this.zba;
    }

    public final Parcel zba() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zbb);
        return obtain;
    }

    public final void zbb(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.zba.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

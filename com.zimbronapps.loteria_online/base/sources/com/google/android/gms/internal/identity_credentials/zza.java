package com.google.android.gms.internal.identity_credentials;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zza implements IInterface {
    private final String mDescriptor = "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    private final IBinder mRemote;

    public zza(IBinder iBinder, String str) {
        this.mRemote = iBinder;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public Parcel obtainAndWriteInterfaceToken() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.mDescriptor);
        return obtain;
    }

    public void transactAndReadExceptionReturnVoid(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.mRemote.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

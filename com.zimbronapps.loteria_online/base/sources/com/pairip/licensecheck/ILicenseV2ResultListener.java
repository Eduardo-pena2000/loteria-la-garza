package com.pairip.licensecheck;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes2.dex */
public interface ILicenseV2ResultListener extends IInterface {
    public static final String DESCRIPTOR = "com.android.vending.licensing.ILicenseV2ResultListener";

    void verifyLicense(int responseCode, Bundle responsePayload) throws RemoteException;

    public static abstract class Stub extends Binder implements ILicenseV2ResultListener {
        static final int TRANSACTION_VERIFY_LICENSE = 1;

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.android.vending.licensing.ILicenseV2ResultListener");
        }

        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface("com.android.vending.licensing.ILicenseV2ResultListener");
            }
            if (code == 1) {
                verifyLicense(data.readInt(), (Bundle) readTypedObject(data, Bundle.CREATOR));
            } else if (code == 1598968902) {
                reply.writeString("com.android.vending.licensing.ILicenseV2ResultListener");
            } else {
                return super.onTransact(code, data, reply, flags);
            }
            return true;
        }

        private static Object readTypedObject(Parcel parcel, Parcelable.Creator c) {
            if (parcel.readInt() != 0) {
                return c.createFromParcel(parcel);
            }
            return null;
        }
    }
}

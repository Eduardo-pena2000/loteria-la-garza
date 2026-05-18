package com.android.vending.billing;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface IInAppBillingService extends IInterface {
    public static final String DESCRIPTOR = "com.android.vending.billing.IInAppBillingService";

    public static class Default implements IInAppBillingService {
        public IBinder asBinder() {
            return null;
        }

        public Bundle getPurchaseHistory(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IInAppBillingService {
        static final int TRANSACTION_getPurchaseHistory = 9;

        public static class Proxy implements IInAppBillingService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return "com.android.vending.billing.IInAppBillingService";
            }

            public Bundle getPurchaseHistory(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    _Parcel.access$100(obtain, bundle, 0);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) _Parcel.access$000(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.android.vending.billing.IInAppBillingService");
        }

        public static IInAppBillingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IInAppBillingService)) ? new Proxy(iBinder) : (IInAppBillingService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.android.vending.billing.IInAppBillingService");
                return true;
            }
            if (i != 9) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            Bundle purchaseHistory = getPurchaseHistory(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), (Bundle) _Parcel.access$000(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            _Parcel.access$100(parcel2, purchaseHistory, 1);
            return true;
        }
    }

    public static class _Parcel {
        public static /* synthetic */ Object access$000(Parcel parcel, Parcelable.Creator creator) {
            return readTypedObject(parcel, creator);
        }

        public static /* synthetic */ void access$100(Parcel parcel, Parcelable parcelable, int i) {
            writeTypedObject(parcel, parcelable, i);
        }

        private static Object readTypedObject(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        private static void writeTypedObject(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }
    }

    Bundle getPurchaseHistory(int i, String str, String str2, String str3, Bundle bundle) throws RemoteException;
}

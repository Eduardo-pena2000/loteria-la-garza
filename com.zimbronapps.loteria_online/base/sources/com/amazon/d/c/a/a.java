package com.amazon.d.c.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface a extends IInterface {
    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    void a(String str, boolean z, String str2) throws RemoteException;

    String b() throws RemoteException;

    public static abstract class a extends Binder implements a {
        static final int a = 1;
        static final int b = 2;
        static final int c = 3;
        static final int d = 4;
        private static final String e = "com.amazon.venezia.service.verify.IApplicationVerificationService";

        public a() {
            attachInterface(this, "com.amazon.venezia.service.verify.IApplicationVerificationService");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.amazon.venezia.service.verify.IApplicationVerificationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new a(iBinder) : (a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.amazon.venezia.service.verify.IApplicationVerificationService");
                a(parcel.readString(), parcel.readInt() != 0, parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.amazon.venezia.service.verify.IApplicationVerificationService");
                String a2 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("com.amazon.venezia.service.verify.IApplicationVerificationService");
                String a3 = a();
                parcel2.writeNoException();
                parcel2.writeString(a3);
                return true;
            }
            if (i != 4) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.amazon.venezia.service.verify.IApplicationVerificationService");
                return true;
            }
            parcel.enforceInterface("com.amazon.venezia.service.verify.IApplicationVerificationService");
            String b2 = b();
            parcel2.writeNoException();
            parcel2.writeString(b2);
            return true;
        }

        public static class a implements a {
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(String str, boolean z, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.venezia.service.verify.IApplicationVerificationService");
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeString(str2);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public String b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.venezia.service.verify.IApplicationVerificationService");
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String c() {
                return "com.amazon.venezia.service.verify.IApplicationVerificationService";
            }

            public String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.venezia.service.verify.IApplicationVerificationService");
                    obtain.writeString(str);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.venezia.service.verify.IApplicationVerificationService");
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}

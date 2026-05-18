package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        static final int a = 1;
        private static final String b = "com.amazon.venezia.command.ChoiceContext";

        public static class a implements b {
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            public Map a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.venezia.command.ChoiceContext");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public String b() {
                return "com.amazon.venezia.command.ChoiceContext";
            }
        }

        public a() {
            attachInterface(this, "com.amazon.venezia.command.ChoiceContext");
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.amazon.venezia.command.ChoiceContext");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new a(iBinder) : (b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.amazon.venezia.command.ChoiceContext");
                return true;
            }
            parcel.enforceInterface("com.amazon.venezia.command.ChoiceContext");
            Map a2 = a();
            parcel2.writeNoException();
            parcel2.writeMap(a2);
            return true;
        }
    }

    Map a() throws RemoteException;
}

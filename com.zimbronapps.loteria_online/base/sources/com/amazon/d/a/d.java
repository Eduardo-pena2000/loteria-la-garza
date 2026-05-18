package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.d.a.c;
import com.amazon.d.a.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface d extends IInterface {

    public static abstract class a extends Binder implements d {
        static final int a = 1;
        private static final String b = "com.amazon.venezia.command.CommandService";

        public static class a implements d {
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            public String a() {
                return "com.amazon.venezia.command.CommandService";
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void a(c cVar, i iVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.venezia.command.CommandService");
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    obtain.writeStrongBinder(iVar != null ? iVar.asBinder() : null);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public a() {
            attachInterface(this, "com.amazon.venezia.command.CommandService");
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.amazon.venezia.command.CommandService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof d)) ? new a(iBinder) : (d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.amazon.venezia.command.CommandService");
                return true;
            }
            parcel.enforceInterface("com.amazon.venezia.command.CommandService");
            a(c.a.a(parcel.readStrongBinder()), i.a.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void a(c cVar, i iVar) throws RemoteException;
}

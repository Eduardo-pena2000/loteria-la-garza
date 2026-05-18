package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.amazon.d.a.f;
import com.amazon.d.a.g;
import com.amazon.d.a.h;
import com.amazon.d.a.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface i extends IInterface {

    public static abstract class a extends Binder implements i {
        private static final String a = "com.amazon.venezia.command.ResultCallback";
        static final int b = 1;
        static final int c = 2;
        static final int d = 3;
        static final int e = 4;

        public static class a implements i {
            private IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            public String a() {
                return "com.amazon.venezia.command.ResultCallback";
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void a(j jVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.venezia.command.ResultCallback");
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
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

            public void a(h hVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.venezia.command.ResultCallback");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void a(f fVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.venezia.command.ResultCallback");
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            public void a(g gVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.amazon.venezia.command.ResultCallback");
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.a.transact(4, obtain, obtain2, 0);
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
            attachInterface(this, "com.amazon.venezia.command.ResultCallback");
        }

        public static i a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.amazon.venezia.command.ResultCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof i)) ? new a(iBinder) : (i) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.amazon.venezia.command.ResultCallback");
                a(j.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.amazon.venezia.command.ResultCallback");
                a(h.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("com.amazon.venezia.command.ResultCallback");
                a(f.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i != 4) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.amazon.venezia.command.ResultCallback");
                return true;
            }
            parcel.enforceInterface("com.amazon.venezia.command.ResultCallback");
            a(g.a.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void a(f fVar) throws RemoteException;

    void a(g gVar) throws RemoteException;

    void a(h hVar) throws RemoteException;

    void a(j jVar) throws RemoteException;
}

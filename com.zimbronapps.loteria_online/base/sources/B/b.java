package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface b extends IInterface {
    public static final String K8 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public static abstract class a extends Binder implements b {

        public static class a implements b {
            public IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            public boolean F0(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.K8);
                    obtain.writeLong(j);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean L0(b.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.K8);
                    obtain.writeStrongInterface(aVar);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean P(b.a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.K8);
                    obtain.writeStrongInterface(aVar);
                    b.a(obtain, bundle, 0);
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean Q0(b.a aVar, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.K8);
                    obtain.writeStrongInterface(aVar);
                    b.a(obtain, uri, 0);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean Z0(b.a aVar, int i, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.K8);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeInt(i);
                    b.a(obtain, uri, 0);
                    b.a(obtain, bundle, 0);
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public boolean h(b.a aVar, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.K8);
                    obtain.writeStrongInterface(aVar);
                    b.a(obtain, uri, 0);
                    b.a(obtain, bundle, 0);
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int l(b.a aVar, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.K8);
                    obtain.writeStrongInterface(aVar);
                    obtain.writeString(str);
                    b.a(obtain, bundle, 0);
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean y0(b.a aVar, Uri uri, Bundle bundle, List list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.K8);
                    obtain.writeStrongInterface(aVar);
                    b.a(obtain, uri, 0);
                    b.a(obtain, bundle, 0);
                    b.b(obtain, list, 0);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b q1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.K8);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new a(iBinder) : (b) queryLocalInterface;
        }
    }

    public static class b {
        public static /* synthetic */ void a(Parcel parcel, Parcelable parcelable, int i) {
            d(parcel, parcelable, i);
        }

        public static /* synthetic */ void b(Parcel parcel, List list, int i) {
            c(parcel, list, i);
        }

        public static void c(Parcel parcel, List list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                d(parcel, (Parcelable) list.get(i2), i);
            }
        }

        public static void d(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }
    }

    boolean F0(long j);

    boolean L0(b.a aVar);

    boolean P(b.a aVar, Bundle bundle);

    boolean Q0(b.a aVar, Uri uri);

    boolean Z0(b.a aVar, int i, Uri uri, Bundle bundle);

    boolean h(b.a aVar, Uri uri, Bundle bundle);

    int l(b.a aVar, String str, Bundle bundle);

    boolean y0(b.a aVar, Uri uri, Bundle bundle, List list);
}

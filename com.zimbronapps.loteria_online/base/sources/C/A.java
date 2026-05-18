package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface a extends IInterface {
    public static final String N8 = "android$support$v4$os$IResultReceiver".replace('$', '.');

    public static class b {
        public static /* synthetic */ Object a(Parcel parcel, Parcelable.Creator creator) {
            return b(parcel, creator);
        }

        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void g0(int i, Bundle bundle);

    public static abstract class a extends Binder implements a {

        public static class a implements a {
            public IBinder a;

            public a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, a.N8);
        }

        public static a q1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.N8);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new a(iBinder) : (a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = a.N8;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            g0(parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
            return true;
        }

        public IBinder asBinder() {
            return this;
        }
    }
}

package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface a extends IInterface {
    public static final String J8 = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    public static class b {
        public static /* synthetic */ Object a(Parcel parcel, Parcelable.Creator creator) {
            return c(parcel, creator);
        }

        public static /* synthetic */ void b(Parcel parcel, Parcelable parcelable, int i) {
            d(parcel, parcelable, i);
        }

        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
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

    void J0(Bundle bundle);

    void M(String str, Bundle bundle);

    void N0(Bundle bundle);

    void Q(Bundle bundle);

    void R0(int i, int i2, Bundle bundle);

    void d1(int i, Bundle bundle);

    void j1(String str, Bundle bundle);

    void k1(Bundle bundle);

    void l1(int i, Uri uri, boolean z, Bundle bundle);

    void n(int i, int i2, int i3, int i4, int i5, Bundle bundle);

    Bundle x(String str, Bundle bundle);

    public static abstract class a extends Binder implements a {
        public a() {
            attachInterface(this, a.J8);
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = a.J8;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    d1(parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    M(parcel.readString(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    k1((Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    j1(parcel.readString(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    l1(parcel.readInt(), (Uri) b.a(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle x = x(parcel.readString(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.b(parcel2, x, 1);
                    return true;
                case 8:
                    R0(parcel.readInt(), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    Q((Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    n(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    J0((Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    N0((Bundle) b.a(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        public IBinder asBinder() {
            return this;
        }
    }
}

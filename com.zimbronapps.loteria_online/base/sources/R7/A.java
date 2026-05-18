package r7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class a implements IInterface {
    public final IBinder a;
    public final String b;

    public a(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final Parcel q1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    public final void r1(int i, Parcel parcel) {
        try {
            this.a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

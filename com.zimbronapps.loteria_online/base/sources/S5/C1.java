package S5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class c1 extends y6.a {
    public static final Parcelable.Creator CREATOR = new D1();
    public final int a;
    public final String b;
    public final String c;
    public c1 d;
    public IBinder e;

    public c1(int i, String str, String str2, c1 c1Var, IBinder iBinder) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = c1Var;
        this.e = iBinder;
    }

    public final L5.b M1() {
        L5.b bVar;
        c1 c1Var = this.d;
        if (c1Var == null) {
            bVar = null;
        } else {
            String str = c1Var.c;
            bVar = new L5.b(c1Var.a, c1Var.b, str);
        }
        return new L5.b(this.a, this.b, this.c, bVar);
    }

    public final L5.n N1() {
        L5.b bVar;
        c1 c1Var = this.d;
        d1 d1Var = null;
        if (c1Var == null) {
            bVar = null;
        } else {
            bVar = new L5.b(c1Var.a, c1Var.b, c1Var.c);
        }
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        IBinder iBinder = this.e;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            d1Var = queryLocalInterface instanceof d1 ? (d1) queryLocalInterface : new a1(iBinder);
        }
        return new L5.n(i, str, str2, bVar, L5.z.g(d1Var));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.E(parcel, 2, this.b, false);
        y6.c.E(parcel, 3, this.c, false);
        y6.c.C(parcel, 4, this.d, i, false);
        y6.c.s(parcel, 5, this.e, false);
        y6.c.b(parcel, a);
    }
}

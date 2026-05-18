package S5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e2 extends y6.a {
    public static final Parcelable.Creator CREATOR = new f2();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public e2(L5.C c) {
        this(c.c(), c.b(), c.a());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = y6.c.a(parcel);
        y6.c.g(parcel, 2, z);
        y6.c.g(parcel, 3, this.b);
        y6.c.g(parcel, 4, this.c);
        y6.c.b(parcel, a);
    }

    public e2(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}

package R5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class l extends y6.a {
    public static final Parcelable.Creator CREATOR = new m();
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final float e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public l(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = f;
        this.f = i;
        this.g = z4;
        this.h = z5;
        this.i = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = y6.c.a(parcel);
        y6.c.g(parcel, 2, z);
        y6.c.g(parcel, 3, this.b);
        y6.c.E(parcel, 4, this.c, false);
        y6.c.g(parcel, 5, this.d);
        y6.c.p(parcel, 6, this.e);
        y6.c.t(parcel, 7, this.f);
        y6.c.g(parcel, 8, this.g);
        y6.c.g(parcel, 9, this.h);
        y6.c.g(parcel, 10, this.i);
        y6.c.b(parcel, a);
    }

    public l(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, -1, z4, z5, z6);
    }
}

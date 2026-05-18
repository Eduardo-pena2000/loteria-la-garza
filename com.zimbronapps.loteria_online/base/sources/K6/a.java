package k6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a extends y6.a {
    public static final Parcelable.Creator CREATOR = new k();
    public final int a;
    public final boolean b;
    public final long c;
    public final boolean d;

    public a(int i, boolean z, long j, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = j;
        this.d = z2;
    }

    public long M1() {
        return this.c;
    }

    public boolean N1() {
        return this.d;
    }

    public boolean O1() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, this.a);
        y6.c.g(parcel, 2, O1());
        y6.c.x(parcel, 3, M1());
        y6.c.g(parcel, 4, N1());
        y6.c.b(parcel, a);
    }
}

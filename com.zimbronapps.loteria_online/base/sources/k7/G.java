package k7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g extends y6.a {
    public static final Parcelable.Creator CREATOR = new h();
    public final long a;
    public final int b;
    public final long c;

    public g(long j, int i, long j2) {
        this.a = j;
        this.b = i;
        this.c = j2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = y6.c.a(parcel);
        y6.c.x(parcel, 1, j);
        y6.c.t(parcel, 2, this.b);
        y6.c.x(parcel, 3, this.c);
        y6.c.b(parcel, a);
    }
}

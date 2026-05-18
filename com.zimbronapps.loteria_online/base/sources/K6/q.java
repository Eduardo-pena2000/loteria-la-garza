package K6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class q extends y6.a {
    public static final Parcelable.Creator CREATOR = new r();
    public final String a;
    public final long b;
    public final int c;

    public q(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 2, this.a, false);
        y6.c.x(parcel, 3, this.b);
        y6.c.t(parcel, 4, this.c);
        y6.c.b(parcel, a);
    }
}

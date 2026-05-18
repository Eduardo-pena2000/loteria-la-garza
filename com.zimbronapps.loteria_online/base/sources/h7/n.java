package h7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class N extends y6.a {
    public static final Parcelable.Creator CREATOR = new O();
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public N(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N) {
            N n = (N) obj;
            if (this.a == n.a && this.b == n.b && this.c == n.c && this.d == n.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.a + " Cell status: " + this.b + " elapsed time NS: " + this.d + " system time ms: " + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, this.a);
        y6.c.t(parcel, 2, this.b);
        y6.c.x(parcel, 3, this.c);
        y6.c.x(parcel, 4, this.d);
        y6.c.b(parcel, a);
    }
}

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import h7.D;
import h7.N;
import java.util.Arrays;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new D();
    public int a;
    public int b;
    public long c;
    public int d;
    public N[] e;

    public LocationAvailability(int i, int i2, int i3, long j, N[] nArr) {
        this.d = i;
        this.a = i2;
        this.b = i3;
        this.c = j;
        this.e = nArr;
    }

    public boolean M1() {
        return this.d < 1000;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.a == locationAvailability.a && this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && Arrays.equals(this.e, locationAvailability.e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return r.c(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), this.e});
    }

    public String toString() {
        boolean M1 = M1();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(M1);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.t(parcel, 1, this.a);
        c.t(parcel, 2, this.b);
        c.x(parcel, 3, this.c);
        c.t(parcel, 4, this.d);
        c.H(parcel, 5, this.e, i, false);
        c.b(parcel, a);
    }
}

package h7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Y extends y6.a {
    public static final Parcelable.Creator CREATOR = new Z();
    public boolean a;
    public long b;
    public float c;
    public long d;
    public int e;

    public Y() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y = (Y) obj;
        return this.a == y.a && this.b == y.b && Float.compare(this.c, y.c) == 0 && this.d == y.d && this.e == y.e;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.c);
        long j = this.d;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.e);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.g(parcel, 1, this.a);
        y6.c.x(parcel, 2, this.b);
        y6.c.p(parcel, 3, this.c);
        y6.c.x(parcel, 4, this.d);
        y6.c.t(parcel, 5, this.e);
        y6.c.b(parcel, a);
    }

    public Y(boolean z, long j, float f, long j2, int i) {
        this.a = z;
        this.b = j;
        this.c = f;
        this.d = j2;
        this.e = i;
    }
}

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import h7.E;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new E();
    public int a;
    public long b;
    public long c;
    public boolean d;
    public long e;
    public int f;
    public float g;
    public long h;
    public boolean i;

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4, boolean z2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j3;
        this.f = i2;
        this.g = f;
        this.h = j4;
        this.i = z2;
    }

    public long M1() {
        return this.b;
    }

    public long N1() {
        long j = this.h;
        long j2 = this.b;
        return j < j2 ? j2 : j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.a == locationRequest.a && this.b == locationRequest.b && this.c == locationRequest.c && this.d == locationRequest.d && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && N1() == locationRequest.N1() && this.i == locationRequest.i) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return r.c(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.g), Long.valueOf(this.h)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.a;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.a != 105) {
            sb.append(" requested=");
            sb.append(this.b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.c);
        sb.append("ms");
        if (this.h > this.b) {
            sb.append(" maxWait=");
            sb.append(this.h);
            sb.append("ms");
        }
        if (this.g > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.g);
            sb.append("m");
        }
        long j = this.e;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f);
        }
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.t(parcel, 1, this.a);
        c.x(parcel, 2, this.b);
        c.x(parcel, 3, this.c);
        c.g(parcel, 4, this.d);
        c.x(parcel, 5, this.e);
        c.t(parcel, 6, this.f);
        c.p(parcel, 7, this.g);
        c.x(parcel, 8, this.h);
        c.g(parcel, 9, this.i);
        c.b(parcel, a);
    }
}

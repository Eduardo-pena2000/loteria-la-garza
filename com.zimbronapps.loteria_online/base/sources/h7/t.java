package h7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class T extends y6.a {
    public static final Parcelable.Creator CREATOR = new U();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public T(int i, int i2, int i3, int i4) {
        com.google.android.gms.common.internal.t.p(i >= 0 && i <= 23, "Start hour must be in range [0, 23].");
        com.google.android.gms.common.internal.t.p(i2 >= 0 && i2 <= 59, "Start minute must be in range [0, 59].");
        com.google.android.gms.common.internal.t.p(i3 >= 0 && i3 <= 23, "End hour must be in range [0, 23].");
        com.google.android.gms.common.internal.t.p(i4 >= 0 && i4 <= 59, "End minute must be in range [0, 59].");
        com.google.android.gms.common.internal.t.p(((i + i2) + i3) + i4 > 0, "Parameters can't be all 0.");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t = (T) obj;
        return this.a == t.a && this.b == t.b && this.c == t.c && this.d == t.d;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i);
        sb.append(", startMinute=");
        sb.append(i2);
        sb.append(", endHour=");
        sb.append(i3);
        sb.append(", endMinute=");
        sb.append(i4);
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        com.google.android.gms.common.internal.t.l(parcel);
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, this.a);
        y6.c.t(parcel, 2, this.b);
        y6.c.t(parcel, 3, this.c);
        y6.c.t(parcel, 4, this.d);
        y6.c.b(parcel, a);
    }
}

package v6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class d extends y6.a {
    public static final Parcelable.Creator CREATOR = new s();
    public final String a;
    public final int b;
    public final long c;
    public final boolean d;

    public d(String str, int i, long j, boolean z) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public boolean M1() {
        return this.d;
    }

    public long N1() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (com.google.android.gms.common.internal.r.b(getName(), dVar.getName()) && N1() == dVar.N1() && M1() == dVar.M1()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.a;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(getName(), Long.valueOf(N1()), Boolean.valueOf(M1()));
    }

    public final String toString() {
        r.a d = com.google.android.gms.common.internal.r.d(this);
        d.a("name", getName());
        d.a("version", Long.valueOf(N1()));
        d.a("is_fully_rolled_out", Boolean.valueOf(M1()));
        return d.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, getName(), false);
        y6.c.t(parcel, 2, this.b);
        y6.c.x(parcel, 3, N1());
        y6.c.g(parcel, 4, M1());
        y6.c.b(parcel, a);
    }

    public d(String str, long j) {
        this(str, -1, j, false);
    }

    public d(String str, long j, boolean z) {
        this(str, -1, j, z);
    }
}

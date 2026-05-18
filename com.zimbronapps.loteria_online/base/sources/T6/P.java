package T6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class p extends W6.y {
    public static final Parcelable.Creator CREATOR = new O();
    public final int a;
    public final long b;
    public final long c;

    public p(int i, long j, long j2) {
        com.google.android.gms.common.internal.t.p(j >= 0, "Min XP must be positive!");
        com.google.android.gms.common.internal.t.p(j2 > j, "Max XP must be more than min XP!");
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public int M1() {
        return this.a;
    }

    public long N1() {
        return this.c;
    }

    public long O1() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        p pVar = (p) obj;
        return com.google.android.gms.common.internal.r.b(Integer.valueOf(pVar.M1()), Integer.valueOf(M1())) && com.google.android.gms.common.internal.r.b(Long.valueOf(pVar.O1()), Long.valueOf(O1())) && com.google.android.gms.common.internal.r.b(Long.valueOf(pVar.N1()), Long.valueOf(N1()));
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c));
    }

    public String toString() {
        return com.google.android.gms.common.internal.r.d(this).a("LevelNumber", Integer.valueOf(M1())).a("MinXp", Long.valueOf(O1())).a("MaxXp", Long.valueOf(N1())).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, M1());
        y6.c.x(parcel, 2, O1());
        y6.c.x(parcel, 3, N1());
        y6.c.b(parcel, a);
    }
}

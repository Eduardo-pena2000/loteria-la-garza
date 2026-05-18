package T6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class q extends W6.y {
    public static final Parcelable.Creator CREATOR = new P();
    public final long a;
    public final long b;
    public final p c;
    public final p d;

    public q(long j, long j2, p pVar, p pVar2) {
        com.google.android.gms.common.internal.t.o(j != -1);
        com.google.android.gms.common.internal.t.l(pVar);
        com.google.android.gms.common.internal.t.l(pVar2);
        this.a = j;
        this.b = j2;
        this.c = pVar;
        this.d = pVar2;
    }

    public p M1() {
        return this.c;
    }

    public long N1() {
        return this.a;
    }

    public long O1() {
        return this.b;
    }

    public p P1() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        q qVar = (q) obj;
        return com.google.android.gms.common.internal.r.b(Long.valueOf(this.a), Long.valueOf(qVar.a)) && com.google.android.gms.common.internal.r.b(Long.valueOf(this.b), Long.valueOf(qVar.b)) && com.google.android.gms.common.internal.r.b(this.c, qVar.c) && com.google.android.gms.common.internal.r.b(this.d, qVar.d);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.x(parcel, 1, N1());
        y6.c.x(parcel, 2, O1());
        y6.c.C(parcel, 3, M1(), i, false);
        y6.c.C(parcel, 4, P1(), i, false);
        y6.c.b(parcel, a);
    }
}

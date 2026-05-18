package h6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a extends y6.a {
    public static final Parcelable.Creator CREATOR = new d();
    public final int a;
    public final long b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    public a(int i, long j, String str, int i2, int i3, String str2) {
        this.a = i;
        this.b = j;
        this.c = (String) t.l(str);
        this.d = i2;
        this.e = i3;
        this.f = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && r.b(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && r.b(this.f, aVar.f);
    }

    public int hashCode() {
        return r.c(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f);
    }

    public String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        return "AccountChangeEvent {accountName = " + this.c + ", changeType = " + str + ", changeData = " + this.f + ", eventIndex = " + this.e + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, this.a);
        y6.c.x(parcel, 2, this.b);
        y6.c.E(parcel, 3, this.c, false);
        y6.c.t(parcel, 4, this.d);
        y6.c.t(parcel, 5, this.e);
        y6.c.E(parcel, 6, this.f, false);
        y6.c.b(parcel, a);
    }
}

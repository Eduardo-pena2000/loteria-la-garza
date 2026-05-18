package S5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class u2 extends y6.a {
    public static final Parcelable.Creator CREATOR = new v2();
    public final String a;
    public long b;
    public c1 c;
    public final Bundle d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public u2(String str, long j, c1 c1Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = j;
        this.c = c1Var;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, str, false);
        y6.c.x(parcel, 2, this.b);
        y6.c.C(parcel, 3, this.c, i, false);
        y6.c.j(parcel, 4, this.d, false);
        y6.c.E(parcel, 5, this.e, false);
        y6.c.E(parcel, 6, this.f, false);
        y6.c.E(parcel, 7, this.g, false);
        y6.c.E(parcel, 8, this.h, false);
        y6.c.b(parcel, a);
    }
}

package l6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class o extends y6.a {
    public static final Parcelable.Creator CREATOR = new K();
    public final String a;
    public final String b;

    public o(String str, String str2) {
        this.a = com.google.android.gms.common.internal.t.g(((String) com.google.android.gms.common.internal.t.m(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.b = com.google.android.gms.common.internal.t.f(str2);
    }

    public String M1() {
        return this.a;
    }

    public String N1() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return com.google.android.gms.common.internal.r.b(this.a, oVar.a) && com.google.android.gms.common.internal.r.b(this.b, oVar.b);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, M1(), false);
        y6.c.E(parcel, 2, N1(), false);
        y6.c.b(parcel, a);
    }
}

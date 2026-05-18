package l6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n extends y6.a {
    public static final Parcelable.Creator CREATOR = new I();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String g;
    public final String h;
    public final R6.t i;

    public n(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, R6.t tVar) {
        this.a = (String) com.google.android.gms.common.internal.t.l(str);
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = tVar;
    }

    public String M1() {
        return this.d;
    }

    public String N1() {
        return this.c;
    }

    public String O1() {
        return this.g;
    }

    public String P1() {
        return this.a;
    }

    public String Q1() {
        return this.f;
    }

    public Uri R1() {
        return this.e;
    }

    public R6.t S1() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return com.google.android.gms.common.internal.r.b(this.a, nVar.a) && com.google.android.gms.common.internal.r.b(this.b, nVar.b) && com.google.android.gms.common.internal.r.b(this.c, nVar.c) && com.google.android.gms.common.internal.r.b(this.d, nVar.d) && com.google.android.gms.common.internal.r.b(this.e, nVar.e) && com.google.android.gms.common.internal.r.b(this.f, nVar.f) && com.google.android.gms.common.internal.r.b(this.g, nVar.g) && com.google.android.gms.common.internal.r.b(this.h, nVar.h) && com.google.android.gms.common.internal.r.b(this.i, nVar.i);
    }

    public String getDisplayName() {
        return this.b;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, P1(), false);
        y6.c.E(parcel, 2, getDisplayName(), false);
        y6.c.E(parcel, 3, N1(), false);
        y6.c.E(parcel, 4, M1(), false);
        y6.c.C(parcel, 5, R1(), i, false);
        y6.c.E(parcel, 6, Q1(), false);
        y6.c.E(parcel, 7, O1(), false);
        y6.c.E(parcel, 8, z(), false);
        y6.c.C(parcel, 9, S1(), i, false);
        y6.c.b(parcel, a);
    }

    public String z() {
        return this.h;
    }
}

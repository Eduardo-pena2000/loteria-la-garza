package l6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class h extends y6.a {
    public static final Parcelable.Creator CREATOR = new y();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final List g;

    public static final class a {
        public String a;
        public String b;
        public String c;
        public List d;
        public String e;
        public boolean f;
        public int g;

        public h a() {
            return new h(this.a, this.b, this.c, this.e, this.f, this.g, this.d);
        }

        public a b(String str) {
            this.b = str;
            return this;
        }

        public a c(List list) {
            this.d = list;
            return this;
        }

        public a d(String str) {
            this.e = str;
            return this;
        }

        public a e(boolean z) {
            this.f = z;
            return this;
        }

        public a f(String str) {
            com.google.android.gms.common.internal.t.l(str);
            this.a = str;
            return this;
        }

        public final a g(String str) {
            this.c = str;
            return this;
        }

        public final a h(int i) {
            this.g = i;
            return this;
        }
    }

    public h(String str, String str2, String str3, String str4, boolean z, int i, List list) {
        com.google.android.gms.common.internal.t.l(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
        this.g = list;
    }

    public static a M1() {
        return new a();
    }

    public static a S1(h hVar) {
        com.google.android.gms.common.internal.t.l(hVar);
        a M1 = M1();
        M1.f(hVar.Q1());
        M1.d(hVar.P1());
        M1.b(hVar.O1());
        M1.e(hVar.e);
        M1.h(hVar.f);
        M1.c(hVar.N1());
        String str = hVar.c;
        if (str != null) {
            M1.g(str);
        }
        return M1;
    }

    public List N1() {
        return this.g;
    }

    public String O1() {
        return this.b;
    }

    public String P1() {
        return this.d;
    }

    public String Q1() {
        return this.a;
    }

    public boolean R1() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return com.google.android.gms.common.internal.r.b(this.a, hVar.a) && com.google.android.gms.common.internal.r.b(this.d, hVar.d) && com.google.android.gms.common.internal.r.b(this.b, hVar.b) && com.google.android.gms.common.internal.r.b(Boolean.valueOf(this.e), Boolean.valueOf(hVar.e)) && this.f == hVar.f && com.google.android.gms.common.internal.r.b(this.g, hVar.g);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b, this.d, Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = y6.c.a(parcel);
        y6.c.E(parcel, 1, Q1(), false);
        y6.c.E(parcel, 2, O1(), false);
        y6.c.E(parcel, 3, this.c, false);
        y6.c.E(parcel, 4, P1(), false);
        y6.c.g(parcel, 5, R1());
        y6.c.t(parcel, 6, this.f);
        y6.c.I(parcel, 7, N1(), false);
        y6.c.b(parcel, a2);
    }
}

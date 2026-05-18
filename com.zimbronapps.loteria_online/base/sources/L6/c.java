package l6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class c extends y6.a {
    public static final Parcelable.Creator CREATOR = new s();
    public final e a;
    public final b b;
    public final String c;
    public final boolean d;
    public final int e;
    public final d f;
    public final c g;
    public final boolean h;

    public static final class a {
        public e a;
        public b b;
        public d c;
        public c d;
        public String e;
        public boolean f;
        public int g;
        public boolean h;

        public a() {
            e.a M1 = e.M1();
            M1.b(false);
            this.a = M1.a();
            b.a M12 = b.M1();
            M12.g(false);
            this.b = M12.b();
            d.a M13 = d.M1();
            M13.b(false);
            this.c = M13.a();
            c.a M14 = c.M1();
            M14.b(false);
            this.d = M14.a();
        }

        public c a() {
            return new c(this.a, this.b, this.e, this.f, this.g, this.c, this.d, this.h);
        }

        public a b(boolean z) {
            this.f = z;
            return this;
        }

        public a c(b bVar) {
            this.b = (b) com.google.android.gms.common.internal.t.l(bVar);
            return this;
        }

        public a d(c cVar) {
            this.d = (c) com.google.android.gms.common.internal.t.l(cVar);
            return this;
        }

        public a e(d dVar) {
            this.c = (d) com.google.android.gms.common.internal.t.l(dVar);
            return this;
        }

        public a f(e eVar) {
            this.a = (e) com.google.android.gms.common.internal.t.l(eVar);
            return this;
        }

        public a g(boolean z) {
            this.h = z;
            return this;
        }

        public final a h(String str) {
            this.e = str;
            return this;
        }

        public final a i(int i) {
            this.g = i;
            return this;
        }
    }

    public static final class b extends y6.a {
        public static final Parcelable.Creator CREATOR = new z();
        public final boolean a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final List f;
        public final boolean g;
        public final List h;

        public static final class a {
            public boolean a = false;
            public String b = null;
            public String c = null;
            public boolean d = true;
            public String e = null;
            public List f = null;
            public boolean g = false;
            public List h = null;

            public a a(String str, List list) {
                this.e = (String) com.google.android.gms.common.internal.t.m(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.f = list;
                return this;
            }

            public b b() {
                return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            }

            public a c(boolean z) {
                this.d = z;
                return this;
            }

            public a d(String str) {
                this.c = str;
                return this;
            }

            public a e(boolean z) {
                this.g = z;
                return this;
            }

            public a f(String str) {
                this.b = com.google.android.gms.common.internal.t.f(str);
                return this;
            }

            public a g(boolean z) {
                this.a = z;
                return this;
            }
        }

        public b(boolean z, String str, String str2, boolean z2, String str3, List list, boolean z3, List list2) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            com.google.android.gms.common.internal.t.b(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.a = z;
            if (z) {
                com.google.android.gms.common.internal.t.m(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.b = str;
            this.c = str2;
            this.d = z2;
            Parcelable.Creator creator = c.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f = arrayList;
            this.e = str3;
            this.g = z3;
            this.h = list2;
        }

        public static a M1() {
            return new a();
        }

        public boolean N1() {
            return this.d;
        }

        public List O1() {
            return this.h;
        }

        public List P1() {
            return this.f;
        }

        public String Q1() {
            return this.e;
        }

        public String R1() {
            return this.c;
        }

        public String S1() {
            return this.b;
        }

        public boolean T1() {
            return this.a;
        }

        public boolean U1() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && com.google.android.gms.common.internal.r.b(this.b, bVar.b) && com.google.android.gms.common.internal.r.b(this.c, bVar.c) && this.d == bVar.d && com.google.android.gms.common.internal.r.b(this.e, bVar.e) && com.google.android.gms.common.internal.r.b(this.f, bVar.f) && this.g == bVar.g && com.google.android.gms.common.internal.r.b(this.h, bVar.h);
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.r.c(Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.g), this.h);
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = y6.c.a(parcel);
            y6.c.g(parcel, 1, T1());
            y6.c.E(parcel, 2, S1(), false);
            y6.c.E(parcel, 3, R1(), false);
            y6.c.g(parcel, 4, N1());
            y6.c.E(parcel, 5, Q1(), false);
            y6.c.G(parcel, 6, P1(), false);
            y6.c.g(parcel, 7, U1());
            y6.c.I(parcel, 8, O1(), false);
            y6.c.b(parcel, a2);
        }
    }

    public static final class c extends y6.a {
        public static final Parcelable.Creator CREATOR = new A();
        public final boolean a;
        public final String b;

        public static final class a {
            public boolean a = false;
            public String b;

            public c a() {
                return new c(this.a, this.b);
            }

            public a b(boolean z) {
                this.a = z;
                return this;
            }
        }

        public c(boolean z, String str) {
            if (z) {
                com.google.android.gms.common.internal.t.l(str);
            }
            this.a = z;
            this.b = str;
        }

        public static a M1() {
            return new a();
        }

        public String N1() {
            return this.b;
        }

        public boolean O1() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && com.google.android.gms.common.internal.r.b(this.b, cVar.b);
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.r.c(Boolean.valueOf(this.a), this.b);
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = y6.c.a(parcel);
            y6.c.g(parcel, 1, O1());
            y6.c.E(parcel, 2, N1(), false);
            y6.c.b(parcel, a2);
        }
    }

    public static final class d extends y6.a {
        public static final Parcelable.Creator CREATOR = new B();
        public final boolean a;
        public final byte[] b;
        public final String c;

        public static final class a {
            public boolean a = false;
            public byte[] b;
            public String c;

            public d a() {
                return new d(this.a, this.b, this.c);
            }

            public a b(boolean z) {
                this.a = z;
                return this;
            }
        }

        public d(boolean z, byte[] bArr, String str) {
            if (z) {
                com.google.android.gms.common.internal.t.l(bArr);
                com.google.android.gms.common.internal.t.l(str);
            }
            this.a = z;
            this.b = bArr;
            this.c = str;
        }

        public static a M1() {
            return new a();
        }

        public byte[] N1() {
            return this.b;
        }

        public String O1() {
            return this.c;
        }

        public boolean P1() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && Arrays.equals(this.b, dVar.b) && Objects.equals(this.c, dVar.c);
        }

        public int hashCode() {
            return (Objects.hash(new Object[]{Boolean.valueOf(this.a), this.c}) * 31) + Arrays.hashCode(this.b);
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = y6.c.a(parcel);
            y6.c.g(parcel, 1, P1());
            y6.c.k(parcel, 2, N1(), false);
            y6.c.E(parcel, 3, O1(), false);
            y6.c.b(parcel, a2);
        }
    }

    public static final class e extends y6.a {
        public static final Parcelable.Creator CREATOR = new C();
        public final boolean a;

        public static final class a {
            public boolean a = false;

            public e a() {
                return new e(this.a);
            }

            public a b(boolean z) {
                this.a = z;
                return this;
            }
        }

        public e(boolean z) {
            this.a = z;
        }

        public static a M1() {
            return new a();
        }

        public boolean N1() {
            return this.a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public int hashCode() {
            return com.google.android.gms.common.internal.r.c(Boolean.valueOf(this.a));
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = y6.c.a(parcel);
            y6.c.g(parcel, 1, N1());
            y6.c.b(parcel, a2);
        }
    }

    public c(e eVar, b bVar, String str, boolean z, int i, d dVar, c cVar, boolean z2) {
        this.a = (e) com.google.android.gms.common.internal.t.l(eVar);
        this.b = (b) com.google.android.gms.common.internal.t.l(bVar);
        this.c = str;
        this.d = z;
        this.e = i;
        if (dVar == null) {
            d.a M1 = d.M1();
            M1.b(false);
            dVar = M1.a();
        }
        this.f = dVar;
        if (cVar == null) {
            c.a M12 = c.M1();
            M12.b(false);
            cVar = M12.a();
        }
        this.g = cVar;
        this.h = z2;
    }

    public static a M1() {
        return new a();
    }

    public static a T1(c cVar) {
        com.google.android.gms.common.internal.t.l(cVar);
        a M1 = M1();
        M1.c(cVar.N1());
        M1.f(cVar.Q1());
        M1.e(cVar.P1());
        M1.d(cVar.O1());
        M1.b(cVar.d);
        M1.i(cVar.e);
        M1.g(cVar.h);
        String str = cVar.c;
        if (str != null) {
            M1.h(str);
        }
        return M1;
    }

    public b N1() {
        return this.b;
    }

    public c O1() {
        return this.g;
    }

    public d P1() {
        return this.f;
    }

    public e Q1() {
        return this.a;
    }

    public boolean R1() {
        return this.h;
    }

    public boolean S1() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return com.google.android.gms.common.internal.r.b(this.a, cVar.a) && com.google.android.gms.common.internal.r.b(this.b, cVar.b) && com.google.android.gms.common.internal.r.b(this.f, cVar.f) && com.google.android.gms.common.internal.r.b(this.g, cVar.g) && com.google.android.gms.common.internal.r.b(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e && this.h == cVar.h;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b, this.f, this.g, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.h));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = y6.c.a(parcel);
        y6.c.C(parcel, 1, Q1(), i, false);
        y6.c.C(parcel, 2, N1(), i, false);
        y6.c.E(parcel, 3, this.c, false);
        y6.c.g(parcel, 4, S1());
        y6.c.t(parcel, 5, this.e);
        y6.c.C(parcel, 6, P1(), i, false);
        y6.c.C(parcel, 7, O1(), i, false);
        y6.c.g(parcel, 8, R1());
        y6.c.b(parcel, a2);
    }
}

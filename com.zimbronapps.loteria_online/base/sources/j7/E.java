package J7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class e extends y6.a {
    public static final Parcelable.Creator CREATOR = new e0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public String h;
    public int i;
    public String j;
    public final String k;

    public static class a {
        public String a;
        public String b;
        public String c;
        public boolean d;
        public String e;
        public boolean f;
        public String g;
        public String h;

        public /* synthetic */ a(y0 y0Var) {
            this();
        }

        public static /* bridge */ /* synthetic */ String h(a aVar) {
            return aVar.e;
        }

        public static /* bridge */ /* synthetic */ String i(a aVar) {
            return aVar.c;
        }

        public static /* bridge */ /* synthetic */ String j(a aVar) {
            return aVar.g;
        }

        public static /* bridge */ /* synthetic */ String k(a aVar) {
            return aVar.b;
        }

        public static /* bridge */ /* synthetic */ String l(a aVar) {
            return aVar.h;
        }

        public static /* bridge */ /* synthetic */ String m(a aVar) {
            return aVar.a;
        }

        public static /* bridge */ /* synthetic */ boolean n(a aVar) {
            return aVar.d;
        }

        public static /* bridge */ /* synthetic */ boolean o(a aVar) {
            return aVar.f;
        }

        public e a() {
            if (this.a != null) {
                return new e(this, null);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        public a b(String str, boolean z, String str2) {
            this.c = str;
            this.d = z;
            this.e = str2;
            return this;
        }

        public a c(String str) {
            this.g = str;
            return this;
        }

        public a d(boolean z) {
            this.f = z;
            return this;
        }

        public a e(String str) {
            this.b = str;
            return this;
        }

        public a f(String str) {
            this.h = str;
            return this;
        }

        public a g(String str) {
            this.a = str;
            return this;
        }

        public a() {
            this.f = false;
        }
    }

    public /* synthetic */ e(a aVar, y0 y0Var) {
        this(aVar);
    }

    public static a T1() {
        return new a(null);
    }

    public static e W1() {
        return new e(new a(null));
    }

    public boolean M1() {
        return this.g;
    }

    public boolean N1() {
        return this.e;
    }

    public String O1() {
        return this.f;
    }

    public String P1() {
        return this.d;
    }

    public String Q1() {
        return this.b;
    }

    public String R1() {
        return this.k;
    }

    public String S1() {
        return this.a;
    }

    public final void U1(int i) {
        this.i = i;
    }

    public final void V1(String str) {
        this.h = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = y6.c.a(parcel);
        y6.c.E(parcel, 1, S1(), false);
        y6.c.E(parcel, 2, Q1(), false);
        y6.c.E(parcel, 3, this.c, false);
        y6.c.E(parcel, 4, P1(), false);
        y6.c.g(parcel, 5, N1());
        y6.c.E(parcel, 6, O1(), false);
        y6.c.g(parcel, 7, M1());
        y6.c.E(parcel, 8, this.h, false);
        y6.c.t(parcel, 9, this.i);
        y6.c.E(parcel, 10, this.j, false);
        y6.c.E(parcel, 11, R1(), false);
        y6.c.b(parcel, a2);
    }

    public final int zza() {
        return this.i;
    }

    public final String zzc() {
        return this.j;
    }

    public final String zzd() {
        return this.c;
    }

    public final String zze() {
        return this.h;
    }

    public e(a aVar) {
        this.a = a.m(aVar);
        this.b = a.k(aVar);
        this.c = null;
        this.d = a.i(aVar);
        this.e = a.n(aVar);
        this.f = a.h(aVar);
        this.g = a.o(aVar);
        this.j = a.j(aVar);
        this.k = a.l(aVar);
    }

    public e(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = z2;
        this.h = str6;
        this.i = i;
        this.j = str7;
        this.k = str8;
    }
}

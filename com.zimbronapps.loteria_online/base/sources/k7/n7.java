package k7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class n7 extends y6.a {
    public static final Parcelable.Creator CREATOR = new o7();
    public final long A;
    public final String B;
    public final String C;
    public final long D;
    public final int E;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final Boolean p;
    public final long q;
    public final List r;
    public final String s;
    public final String t;
    public final String u;
    public final boolean v;
    public final long w;
    public final int x;
    public final String y;
    public final int z;

    public n7(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        com.google.android.gms.common.internal.t.f(str);
        this.a = str;
        this.b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = list;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.C = str12;
        this.D = j8;
        this.E = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 2, str, false);
        y6.c.E(parcel, 3, this.b, false);
        y6.c.E(parcel, 4, this.c, false);
        y6.c.E(parcel, 5, this.d, false);
        y6.c.x(parcel, 6, this.e);
        y6.c.x(parcel, 7, this.f);
        y6.c.E(parcel, 8, this.g, false);
        y6.c.g(parcel, 9, this.h);
        y6.c.g(parcel, 10, this.i);
        y6.c.x(parcel, 11, this.j);
        y6.c.E(parcel, 12, this.k, false);
        y6.c.x(parcel, 14, this.l);
        y6.c.t(parcel, 15, this.m);
        y6.c.g(parcel, 16, this.n);
        y6.c.g(parcel, 18, this.o);
        y6.c.i(parcel, 21, this.p, false);
        y6.c.x(parcel, 22, this.q);
        y6.c.G(parcel, 23, this.r, false);
        y6.c.E(parcel, 25, this.s, false);
        y6.c.E(parcel, 26, this.t, false);
        y6.c.E(parcel, 27, this.u, false);
        y6.c.g(parcel, 28, this.v);
        y6.c.x(parcel, 29, this.w);
        y6.c.t(parcel, 30, this.x);
        y6.c.E(parcel, 31, this.y, false);
        y6.c.t(parcel, 32, this.z);
        y6.c.x(parcel, 34, this.A);
        y6.c.E(parcel, 35, this.B, false);
        y6.c.E(parcel, 36, this.C, false);
        y6.c.x(parcel, 37, this.D);
        y6.c.t(parcel, 38, this.E);
        y6.c.b(parcel, a);
    }

    public n7(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = list;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.C = str12;
        this.D = j8;
        this.E = i4;
    }
}

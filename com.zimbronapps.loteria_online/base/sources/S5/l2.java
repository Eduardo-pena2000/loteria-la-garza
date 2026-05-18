package S5;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class l2 extends y6.a {
    public static final Parcelable.Creator CREATOR = new n2();
    public final long A;
    public final Bundle B = new Bundle();
    public final int a;
    public final long b;
    public final Bundle c;
    public final int d;
    public final List e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final a2 j;
    public final Location k;
    public final String l;
    public final Bundle m;
    public final Bundle n;
    public final List o;
    public final String p;
    public final String q;
    public final boolean r;
    public final b0 s;
    public final int t;
    public final String u;
    public final List v;
    public final int w;
    public final String x;
    public final int y;
    public final long z;

    public l2(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, a2 a2Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, b0 b0Var, int i4, String str5, List list3, int i5, String str6, int i6, long j2, long j3) {
        this.a = i;
        this.b = j;
        this.c = bundle == null ? new Bundle() : bundle;
        this.d = i2;
        this.e = list;
        this.f = z;
        this.g = i3;
        this.h = z2;
        this.i = str;
        this.j = a2Var;
        this.k = location;
        this.l = str2;
        this.m = bundle2 == null ? new Bundle() : bundle2;
        this.n = bundle3;
        this.o = list2;
        this.p = str3;
        this.q = str4;
        this.r = z3;
        this.s = b0Var;
        this.t = i4;
        this.u = str5;
        this.v = list3 == null ? new ArrayList() : list3;
        this.w = i5;
        this.x = str6;
        this.y = i6;
        this.z = j2;
        this.A = j3;
    }

    public final boolean M1(Object obj) {
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return this.a == l2Var.a && this.b == l2Var.b && W5.q.a(this.c, l2Var.c) && this.d == l2Var.d && com.google.android.gms.common.internal.r.b(this.e, l2Var.e) && this.f == l2Var.f && this.g == l2Var.g && this.h == l2Var.h && com.google.android.gms.common.internal.r.b(this.i, l2Var.i) && com.google.android.gms.common.internal.r.b(this.j, l2Var.j) && com.google.android.gms.common.internal.r.b(this.k, l2Var.k) && com.google.android.gms.common.internal.r.b(this.l, l2Var.l) && W5.q.a(this.m, l2Var.m) && W5.q.a(this.n, l2Var.n) && com.google.android.gms.common.internal.r.b(this.o, l2Var.o) && com.google.android.gms.common.internal.r.b(this.p, l2Var.p) && com.google.android.gms.common.internal.r.b(this.q, l2Var.q) && this.r == l2Var.r && this.t == l2Var.t && com.google.android.gms.common.internal.r.b(this.u, l2Var.u) && com.google.android.gms.common.internal.r.b(this.v, l2Var.v) && this.w == l2Var.w && com.google.android.gms.common.internal.r.b(this.x, l2Var.x) && this.y == l2Var.y;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l2) {
            return M1(obj) && this.z == ((l2) obj).z;
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r), Integer.valueOf(this.t), this.u, this.v, Integer.valueOf(this.w), this.x, Integer.valueOf(this.y), Long.valueOf(this.z), Long.valueOf(this.A));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.x(parcel, 2, this.b);
        y6.c.j(parcel, 3, this.c, false);
        y6.c.t(parcel, 4, this.d);
        y6.c.G(parcel, 5, this.e, false);
        y6.c.g(parcel, 6, this.f);
        y6.c.t(parcel, 7, this.g);
        y6.c.g(parcel, 8, this.h);
        y6.c.E(parcel, 9, this.i, false);
        y6.c.C(parcel, 10, this.j, i, false);
        y6.c.C(parcel, 11, this.k, i, false);
        y6.c.E(parcel, 12, this.l, false);
        y6.c.j(parcel, 13, this.m, false);
        y6.c.j(parcel, 14, this.n, false);
        y6.c.G(parcel, 15, this.o, false);
        y6.c.E(parcel, 16, this.p, false);
        y6.c.E(parcel, 17, this.q, false);
        y6.c.g(parcel, 18, this.r);
        y6.c.C(parcel, 19, this.s, i, false);
        y6.c.t(parcel, 20, this.t);
        y6.c.E(parcel, 21, this.u, false);
        y6.c.G(parcel, 22, this.v, false);
        y6.c.t(parcel, 23, this.w);
        y6.c.E(parcel, 24, this.x, false);
        y6.c.t(parcel, 25, this.y);
        y6.c.x(parcel, 26, this.z);
        y6.c.x(parcel, 27, this.A);
        y6.c.b(parcel, a);
    }

    public final boolean zzb() {
        return zzc() || zzd();
    }

    public final boolean zzc() {
        return this.c.getBoolean("is_sdk_preload", false);
    }

    public final boolean zzd() {
        return this.c.getBoolean("zenith_v2", false);
    }
}

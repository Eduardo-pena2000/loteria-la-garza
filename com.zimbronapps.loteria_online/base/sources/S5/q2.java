package S5;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class q2 extends y6.a {
    public static final Parcelable.Creator CREATOR = new r2();
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public final q2[] g;
    public final boolean h;
    public final boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    public q2() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static int M1(DisplayMetrics displayMetrics) {
        return (int) (Q1(displayMetrics) * displayMetrics.density);
    }

    public static q2 N1() {
        return new q2("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static q2 O1() {
        return new q2("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static q2 P1() {
        return new q2("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static int Q1(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 2, str, false);
        y6.c.t(parcel, 3, this.b);
        y6.c.t(parcel, 4, this.c);
        y6.c.g(parcel, 5, this.d);
        y6.c.t(parcel, 6, this.e);
        y6.c.t(parcel, 7, this.f);
        y6.c.H(parcel, 8, this.g, i, false);
        y6.c.g(parcel, 9, this.h);
        y6.c.g(parcel, 10, this.i);
        y6.c.g(parcel, 11, this.j);
        y6.c.g(parcel, 12, this.k);
        y6.c.g(parcel, 13, this.l);
        y6.c.g(parcel, 14, this.m);
        y6.c.g(parcel, 15, this.n);
        y6.c.g(parcel, 16, this.o);
        y6.c.b(parcel, a);
    }

    public q2(Context context, L5.h hVar) {
        this(context, new L5.h[]{hVar});
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q2(android.content.Context r13, L5.h[] r14) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.q2.<init>(android.content.Context, L5.h[]):void");
    }

    public q2(String str, int i, int i2, boolean z, int i3, int i4, q2[] q2VarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = q2VarArr;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = z9;
    }
}

package d7;

import W6.y;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c extends y implements a {
    public static final Parcelable.Creator CREATOR = new d();
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final Bundle h;
    public final float i;
    public final float j;
    public final float k;

    public c(float f, float f2, int i, int i2, int i3, float f3, float f4, Bundle bundle, float f5, float f6, float f7) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = f3;
        this.g = f4;
        this.h = bundle;
        this.i = f5;
        this.j = f6;
        this.k = f7;
    }

    public static int M1(a aVar) {
        return r.c(Float.valueOf(aVar.K1()), Float.valueOf(aVar.h()), Integer.valueOf(aVar.q0()), Integer.valueOf(aVar.Y()), Integer.valueOf(aVar.I0()), Float.valueOf(aVar.W()), Float.valueOf(aVar.r()), Float.valueOf(aVar.X()), Float.valueOf(aVar.D1()), Float.valueOf(aVar.P0()));
    }

    public static String N1(a aVar) {
        return r.d(aVar).a("AverageSessionLength", Float.valueOf(aVar.K1())).a("ChurnProbability", Float.valueOf(aVar.h())).a("DaysSinceLastPlayed", Integer.valueOf(aVar.q0())).a("NumberOfPurchases", Integer.valueOf(aVar.Y())).a("NumberOfSessions", Integer.valueOf(aVar.I0())).a("SessionPercentile", Float.valueOf(aVar.W())).a("SpendPercentile", Float.valueOf(aVar.r())).a("SpendProbability", Float.valueOf(aVar.X())).a("HighSpenderProbability", Float.valueOf(aVar.D1())).a("TotalSpendNext28Days", Float.valueOf(aVar.P0())).toString();
    }

    public static boolean O1(a aVar, Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (aVar == obj) {
            return true;
        }
        a aVar2 = (a) obj;
        return r.b(Float.valueOf(aVar2.K1()), Float.valueOf(aVar.K1())) && r.b(Float.valueOf(aVar2.h()), Float.valueOf(aVar.h())) && r.b(Integer.valueOf(aVar2.q0()), Integer.valueOf(aVar.q0())) && r.b(Integer.valueOf(aVar2.Y()), Integer.valueOf(aVar.Y())) && r.b(Integer.valueOf(aVar2.I0()), Integer.valueOf(aVar.I0())) && r.b(Float.valueOf(aVar2.W()), Float.valueOf(aVar.W())) && r.b(Float.valueOf(aVar2.r()), Float.valueOf(aVar.r())) && r.b(Float.valueOf(aVar2.X()), Float.valueOf(aVar.X())) && r.b(Float.valueOf(aVar2.D1()), Float.valueOf(aVar.D1())) && r.b(Float.valueOf(aVar2.P0()), Float.valueOf(aVar.P0()));
    }

    public final float D1() {
        return this.j;
    }

    public final int I0() {
        return this.e;
    }

    public final float K1() {
        return this.a;
    }

    public final float P0() {
        return this.k;
    }

    public final float W() {
        return this.f;
    }

    public final float X() {
        return this.i;
    }

    public final int Y() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        return O1(this, obj);
    }

    public final float h() {
        return this.b;
    }

    public final int hashCode() {
        return M1(this);
    }

    public final int q0() {
        return this.c;
    }

    public final float r() {
        return this.g;
    }

    public final String toString() {
        return N1(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }

    public final Bundle zza() {
        return this.h;
    }

    public c(a aVar) {
        this.a = aVar.K1();
        this.b = aVar.h();
        this.c = aVar.q0();
        this.d = aVar.Y();
        this.e = aVar.I0();
        this.f = aVar.W();
        this.g = aVar.r();
        this.i = aVar.X();
        this.j = aVar.D1();
        this.k = aVar.P0();
        this.h = aVar.zza();
    }
}

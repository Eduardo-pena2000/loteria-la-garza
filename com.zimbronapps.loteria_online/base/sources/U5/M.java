package U5;

import N6.a;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m extends y6.a {
    public static final Parcelable.Creator CREATOR = new l();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Intent h;
    public final b i;
    public final boolean j;
    public final Bundle k;

    public m(Intent intent, b bVar) {
        this(null, null, null, null, null, null, null, intent, N6.b.s1(bVar).asBinder(), false, new Bundle());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 2, str, false);
        y6.c.E(parcel, 3, this.b, false);
        y6.c.E(parcel, 4, this.c, false);
        y6.c.E(parcel, 5, this.d, false);
        y6.c.E(parcel, 6, this.e, false);
        y6.c.E(parcel, 7, this.f, false);
        y6.c.E(parcel, 8, this.g, false);
        y6.c.C(parcel, 9, this.h, i, false);
        y6.c.s(parcel, 10, N6.b.s1(this.i).asBinder(), false);
        y6.c.g(parcel, 11, this.j);
        y6.c.j(parcel, 12, this.k, false);
        y6.c.b(parcel, a);
    }

    public m(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = intent;
        this.i = (b) N6.b.r1(a.a.q1(iBinder));
        this.j = z;
        this.k = bundle;
    }

    public m(String str, String str2, String str3, String str4, String str5, String str6, String str7, b bVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, N6.b.s1(bVar).asBinder(), false, new Bundle());
    }
}

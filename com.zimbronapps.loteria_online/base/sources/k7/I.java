package k7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class i extends y6.a {
    public static final Parcelable.Creator CREATOR = new j();
    public String a;
    public String b;
    public h7 c;
    public long d;
    public boolean e;
    public String f;
    public final I g;
    public long h;
    public I i;
    public final long j;
    public final I k;

    public i(i iVar) {
        com.google.android.gms.common.internal.t.l(iVar);
        this.a = iVar.a;
        this.b = iVar.b;
        this.c = iVar.c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f = iVar.f;
        this.g = iVar.g;
        this.h = iVar.h;
        this.i = iVar.i;
        this.j = iVar.j;
        this.k = iVar.k;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 2, this.a, false);
        y6.c.E(parcel, 3, this.b, false);
        y6.c.C(parcel, 4, this.c, i, false);
        y6.c.x(parcel, 5, this.d);
        y6.c.g(parcel, 6, this.e);
        y6.c.E(parcel, 7, this.f, false);
        y6.c.C(parcel, 8, this.g, i, false);
        y6.c.x(parcel, 9, this.h);
        y6.c.C(parcel, 10, this.i, i, false);
        y6.c.x(parcel, 11, this.j);
        y6.c.C(parcel, 12, this.k, i, false);
        y6.c.b(parcel, a);
    }

    public i(String str, String str2, h7 h7Var, long j, boolean z, String str3, I i, long j2, I i2, long j3, I i3) {
        this.a = str;
        this.b = str2;
        this.c = h7Var;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = i;
        this.h = j2;
        this.i = i2;
        this.j = j3;
        this.k = i3;
    }
}

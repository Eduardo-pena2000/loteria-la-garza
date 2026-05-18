package J7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.firebase-auth-api.zzajb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class a0 extends h {
    public static final Parcelable.Creator CREATOR = new w0();
    public String a;
    public String b;

    public a0(String str, String str2) {
        this.a = com.google.android.gms.common.internal.t.f(str);
        this.b = com.google.android.gms.common.internal.t.f(str2);
    }

    public static zzajb P1(a0 a0Var, String str) {
        com.google.android.gms.common.internal.t.l(a0Var);
        return new zzajb(null, a0Var.a, a0Var.M1(), null, a0Var.b, null, str, null, null);
    }

    public String M1() {
        return "twitter.com";
    }

    public String N1() {
        return "twitter.com";
    }

    public final h O1() {
        return new a0(this.a, this.b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, this.a, false);
        y6.c.E(parcel, 2, this.b, false);
        y6.c.b(parcel, a);
    }
}

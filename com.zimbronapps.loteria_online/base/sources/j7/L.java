package J7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.firebase-auth-api.zzajb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class l extends h {
    public static final Parcelable.Creator CREATOR = new C0();
    public final String a;

    public l(String str) {
        this.a = com.google.android.gms.common.internal.t.f(str);
    }

    public static zzajb P1(l lVar, String str) {
        com.google.android.gms.common.internal.t.l(lVar);
        return new zzajb(null, lVar.a, lVar.M1(), null, null, null, str, null, null);
    }

    public String M1() {
        return "facebook.com";
    }

    public String N1() {
        return "facebook.com";
    }

    public final h O1() {
        return new l(this.a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, this.a, false);
        y6.c.b(parcel, a);
    }
}

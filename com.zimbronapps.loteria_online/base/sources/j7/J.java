package J7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class j extends h {
    public static final Parcelable.Creator CREATOR = new B0();
    public String a;
    public String b;
    public final String c;
    public String d;
    public boolean e;

    public j(String str, String str2) {
        this(str, str2, null, null, false);
    }

    public static boolean Q1(String str) {
        f c;
        return (TextUtils.isEmpty(str) || (c = f.c(str)) == null || c.b() != 4) ? false : true;
    }

    public String M1() {
        return "password";
    }

    public String N1() {
        return !TextUtils.isEmpty(this.b) ? "password" : "emailLink";
    }

    public final h O1() {
        return new j(this.a, this.b, this.c, this.d, this.e);
    }

    public final j P1(A a) {
        this.d = a.zze();
        this.e = true;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, this.a, false);
        y6.c.E(parcel, 2, this.b, false);
        y6.c.E(parcel, 3, this.c, false);
        y6.c.E(parcel, 4, this.d, false);
        y6.c.g(parcel, 5, this.e);
        y6.c.b(parcel, a);
    }

    public final String zzb() {
        return this.d;
    }

    public final String zzc() {
        return this.a;
    }

    public final String zzd() {
        return this.b;
    }

    public final String zze() {
        return this.c;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.c);
    }

    public final boolean zzg() {
        return this.e;
    }

    public j(String str, String str2, String str3, String str4, boolean z) {
        this.a = com.google.android.gms.common.internal.t.f(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }
}

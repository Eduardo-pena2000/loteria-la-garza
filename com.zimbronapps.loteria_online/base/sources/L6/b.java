package l6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b extends y6.a {
    public static final Parcelable.Creator CREATOR = new r();
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final GoogleSignInAccount e;
    public final PendingIntent f;

    public b(String str, String str2, String str3, List list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = (List) com.google.android.gms.common.internal.t.l(list);
        this.f = pendingIntent;
        this.e = googleSignInAccount;
    }

    public String M1() {
        return this.b;
    }

    public List N1() {
        return this.d;
    }

    public PendingIntent O1() {
        return this.f;
    }

    public String P1() {
        return this.a;
    }

    public boolean Q1() {
        return this.f != null;
    }

    public GoogleSignInAccount R1() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return com.google.android.gms.common.internal.r.b(this.a, bVar.a) && com.google.android.gms.common.internal.r.b(this.b, bVar.b) && com.google.android.gms.common.internal.r.b(this.c, bVar.c) && com.google.android.gms.common.internal.r.b(this.d, bVar.d) && com.google.android.gms.common.internal.r.b(this.f, bVar.f) && com.google.android.gms.common.internal.r.b(this.e, bVar.e);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b, this.c, this.d, this.f, this.e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, P1(), false);
        y6.c.E(parcel, 2, M1(), false);
        y6.c.E(parcel, 3, this.c, false);
        y6.c.G(parcel, 4, N1(), false);
        y6.c.C(parcel, 5, R1(), i, false);
        y6.c.C(parcel, 6, O1(), i, false);
        y6.c.b(parcel, a);
    }
}

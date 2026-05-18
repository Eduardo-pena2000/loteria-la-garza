package l6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class k extends y6.a {
    public static final Parcelable.Creator CREATOR = new G();
    public final o a;
    public final String b;
    public final int c;

    public static final class a {
        public o a;
        public String b;
        public int c;

        public k a() {
            return new k(this.a, this.b, this.c);
        }

        public a b(o oVar) {
            this.a = oVar;
            return this;
        }

        public final a c(int i) {
            this.c = i;
            return this;
        }

        public final a d(String str) {
            this.b = str;
            return this;
        }
    }

    public k(o oVar, String str, int i) {
        this.a = (o) com.google.android.gms.common.internal.t.l(oVar);
        this.b = str;
        this.c = i;
    }

    public static a M1() {
        return new a();
    }

    public static a O1(k kVar) {
        com.google.android.gms.common.internal.t.l(kVar);
        a M1 = M1();
        M1.b(kVar.N1());
        M1.c(kVar.c);
        String str = kVar.b;
        if (str != null) {
            M1.d(str);
        }
        return M1;
    }

    public o N1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return com.google.android.gms.common.internal.r.b(this.a, kVar.a) && com.google.android.gms.common.internal.r.b(this.b, kVar.b) && this.c == kVar.c;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = y6.c.a(parcel);
        y6.c.C(parcel, 1, N1(), i, false);
        y6.c.E(parcel, 2, this.b, false);
        y6.c.t(parcel, 3, this.c);
        y6.c.b(parcel, a2);
    }
}

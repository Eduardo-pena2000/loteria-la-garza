package M6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class x extends y6.a {
    public static final Parcelable.Creator CREATOR = new y();
    public static final x b = new x("=");
    public static final x c = new x("<");
    public static final x d = new x("<=");
    public static final x e = new x(">");
    public static final x f = new x(">=");
    public static final x g = new x("and");
    public static final x h = new x("or");
    public static final x i = new x("not");
    public static final x j = new x("contains");
    public final String a;

    public x(String str) {
        this.a = str;
    }

    public final String M1() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        String str = this.a;
        if (str == null) {
            if (xVar.a != null) {
                return false;
            }
        } else if (!str.equals(xVar.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, this.a, false);
        y6.c.b(parcel, a);
    }
}

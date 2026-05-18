package I6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k extends y6.a {
    public static final Parcelable.Creator CREATOR = new l();
    public final int a;
    public final boolean b;
    public final List c;

    public k(int i, boolean z, List list) {
        this.a = i;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == k.class) {
            if (obj == this) {
                return true;
            }
            k kVar = (k) obj;
            if (com.google.android.gms.common.internal.r.b(this.c, kVar.c) && this.a == kVar.a && this.b == kVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.c, Integer.valueOf(this.a), Boolean.valueOf(this.b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 2, this.a);
        y6.c.g(parcel, 3, this.b);
        y6.c.I(parcel, 4, this.c, false);
        y6.c.b(parcel, a);
    }
}

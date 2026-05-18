package I6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class y extends y6.a {
    public static final Parcelable.Creator CREATOR = new z();
    public final List a;

    public y(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != y.class) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return com.google.android.gms.common.internal.r.b(this.a, ((y) obj).a);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a);
    }

    public final String toString() {
        return String.format(Locale.US, "TransferStateOptions[Spaces=%s]", new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.I(parcel, 2, this.a, false);
        y6.c.b(parcel, a);
    }
}

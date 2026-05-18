package M6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g extends y6.a {
    public static final Parcelable.Creator CREATOR = new h();
    public final String a;
    public final boolean b;

    public g(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        return String.format(Locale.US, "FieldWithSortOrder[%s %s]", new Object[]{this.a, this.b ? "ASC" : "DESC"});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, this.a, false);
        y6.c.g(parcel, 2, this.b);
        y6.c.b(parcel, a);
    }
}

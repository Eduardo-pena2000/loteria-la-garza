package Y6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class w extends y6.a {
    public static final Parcelable.Creator CREATOR = new y();
    public final List a;
    public final List b;
    public final List c;
    public final List d;

    public w(List list, List list2, List list3, List list4) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
    }

    public final List M1() {
        return this.c;
    }

    public final List N1() {
        return this.d;
    }

    public final List O1() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = y6.c.a(parcel);
        y6.c.G(parcel, 1, list, false);
        y6.c.I(parcel, 2, this.b, false);
        y6.c.G(parcel, 3, this.c, false);
        y6.c.G(parcel, 4, this.d, false);
        y6.c.b(parcel, a);
    }

    public final List zza() {
        return this.b;
    }
}

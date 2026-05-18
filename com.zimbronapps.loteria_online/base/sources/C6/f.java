package C6;

import C6.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class f extends y6.a {
    public static final Parcelable.Creator CREATOR = new j();
    public final int a;
    public final String b;
    public final ArrayList c;

    public f(int i, String str, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.E(parcel, 2, this.b, false);
        y6.c.I(parcel, 3, this.c, false);
        y6.c.b(parcel, a);
    }

    public f(String str, Map map) {
        ArrayList arrayList;
        this.a = 1;
        this.b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new g(str2, (a.a) map.get(str2)));
            }
        }
        this.c = arrayList;
    }
}

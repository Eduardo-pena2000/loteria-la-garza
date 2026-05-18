package h6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c extends y6.a {
    public static final Parcelable.Creator CREATOR = new f();
    public final int a;
    public final List b;

    public c(int i, List list) {
        this.a = i;
        this.b = (List) t.l(list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, this.a);
        y6.c.I(parcel, 2, this.b, false);
        y6.c.b(parcel, a);
    }
}

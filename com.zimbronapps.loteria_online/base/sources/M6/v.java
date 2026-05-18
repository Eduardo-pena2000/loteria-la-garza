package M6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.internal.FilterHolder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class v extends a {
    public static final Parcelable.Creator CREATOR = new w();
    public final FilterHolder a;

    public v(FilterHolder filterHolder) {
        this.a = filterHolder;
    }

    public final Object Q0(k kVar) {
        return kVar.zza(this.a.M1().Q0(kVar));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 1, this.a, i, false);
        y6.c.b(parcel, a);
    }
}

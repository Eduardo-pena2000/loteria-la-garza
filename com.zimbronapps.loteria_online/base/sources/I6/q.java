package I6;

import H6.N;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class q extends N implements d {
    public static final Parcelable.Creator CREATOR = new r();
    public final DataHolder a;
    public final boolean b;
    public final int c;

    public q(DataHolder dataHolder, boolean z, int i) {
        this.a = dataHolder;
        this.b = z;
        this.c = i;
    }

    public final boolean M1() {
        return this.b;
    }

    public final int N1() {
        return this.c;
    }

    public final DataHolder O1() {
        return this.a;
    }

    public final int getType() {
        return 3;
    }

    public final void zza(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 2, this.a, i, false);
        y6.c.g(parcel, 3, this.b);
        y6.c.t(parcel, 4, this.c);
        y6.c.b(parcel, a);
    }
}

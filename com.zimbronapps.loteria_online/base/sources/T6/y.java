package T6;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class y extends K implements d {
    public final X6.e d;

    public y(DataHolder dataHolder, int i, X6.e eVar) {
        super(dataHolder, i);
        this.d = eVar;
    }

    public final boolean F() {
        return n(this.d.L) && !p(this.d.L);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return w.O1(this, obj);
    }

    public final /* synthetic */ Object freeze() {
        return new w(this);
    }

    public final int hashCode() {
        return w.M1(this);
    }

    public final String toString() {
        return w.N1(this);
    }

    public final int u0() {
        return D(this.d.L, 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        x.a(new w(this), parcel, i);
    }
}

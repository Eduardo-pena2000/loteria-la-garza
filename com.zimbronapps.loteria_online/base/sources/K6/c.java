package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        e eVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i = y6.b.F(parcel, D);
                hashSet.add(1);
            } else if (w == 2) {
                arrayList = y6.b.u(parcel, D, g.CREATOR);
                hashSet.add(2);
            } else if (w == 3) {
                i2 = y6.b.F(parcel, D);
                hashSet.add(3);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                eVar = (e) y6.b.p(parcel, D, e.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == M) {
            return new b(hashSet, i, arrayList, i2, eVar);
        }
        throw new b.a("Overread allowed size end=" + M, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new b[i];
    }
}

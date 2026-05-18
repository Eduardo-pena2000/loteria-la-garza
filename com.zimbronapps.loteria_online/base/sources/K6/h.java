package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        i iVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i = y6.b.F(parcel, D);
                hashSet.add(1);
            } else if (w == 2) {
                iVar = (i) y6.b.p(parcel, D, i.CREATOR);
                hashSet.add(2);
            } else if (w == 3) {
                str = y6.b.q(parcel, D);
                hashSet.add(3);
            } else if (w == 4) {
                str2 = y6.b.q(parcel, D);
                hashSet.add(4);
            } else if (w != 5) {
                y6.b.L(parcel, D);
            } else {
                str3 = y6.b.q(parcel, D);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == M) {
            return new g(hashSet, i, iVar, str, str2, str3);
        }
        throw new b.a("Overread allowed size end=" + M, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new g[i];
    }
}

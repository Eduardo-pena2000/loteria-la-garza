package l6;

import android.os.Parcel;
import android.os.Parcelable;
import l6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        c.e eVar = null;
        c.b bVar = null;
        String str = null;
        c.d dVar = null;
        c.c cVar = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    eVar = (c.e) y6.b.p(parcel, D, c.e.CREATOR);
                    break;
                case 2:
                    bVar = (c.b) y6.b.p(parcel, D, c.b.CREATOR);
                    break;
                case 3:
                    str = y6.b.q(parcel, D);
                    break;
                case 4:
                    z = y6.b.x(parcel, D);
                    break;
                case 5:
                    i = y6.b.F(parcel, D);
                    break;
                case 6:
                    dVar = (c.d) y6.b.p(parcel, D, c.d.CREATOR);
                    break;
                case 7:
                    cVar = (c.c) y6.b.p(parcel, D, c.c.CREATOR);
                    break;
                case 8:
                    z2 = y6.b.x(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new c(eVar, bVar, str, z, i, dVar, cVar, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}

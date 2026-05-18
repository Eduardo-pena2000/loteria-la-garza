package M6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.internal.FilterHolder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class i implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        c cVar = null;
        e eVar = null;
        r rVar = null;
        v vVar = null;
        p pVar = null;
        t tVar = null;
        n nVar = null;
        l lVar = null;
        z zVar = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    cVar = (c) y6.b.p(parcel, D, c.CREATOR);
                    break;
                case 2:
                    eVar = (e) y6.b.p(parcel, D, e.CREATOR);
                    break;
                case 3:
                    rVar = (r) y6.b.p(parcel, D, r.CREATOR);
                    break;
                case 4:
                    vVar = (v) y6.b.p(parcel, D, v.CREATOR);
                    break;
                case 5:
                    pVar = (p) y6.b.p(parcel, D, p.CREATOR);
                    break;
                case 6:
                    tVar = (t) y6.b.p(parcel, D, t.CREATOR);
                    break;
                case 7:
                    nVar = (n) y6.b.p(parcel, D, n.CREATOR);
                    break;
                case 8:
                    lVar = (l) y6.b.p(parcel, D, l.CREATOR);
                    break;
                case 9:
                    zVar = (z) y6.b.p(parcel, D, z.CREATOR);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new FilterHolder(cVar, eVar, rVar, vVar, pVar, tVar, nVar, lVar, zVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FilterHolder[i];
    }
}

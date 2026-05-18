package R6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        byte[] bArr = null;
        Double d = null;
        String str = null;
        List list = null;
        Integer num = null;
        E e = null;
        String str2 = null;
        d dVar = null;
        Long l = null;
        String str3 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 2:
                    bArr = y6.b.g(parcel, D);
                    break;
                case 3:
                    d = y6.b.A(parcel, D);
                    break;
                case 4:
                    str = y6.b.q(parcel, D);
                    break;
                case 5:
                    list = y6.b.u(parcel, D, v.CREATOR);
                    break;
                case 6:
                    num = y6.b.G(parcel, D);
                    break;
                case 7:
                    e = (E) y6.b.p(parcel, D, E.CREATOR);
                    break;
                case 8:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 9:
                    dVar = (d) y6.b.p(parcel, D, d.CREATOR);
                    break;
                case 10:
                    l = y6.b.I(parcel, D);
                    break;
                case 11:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 12:
                    resultReceiver = (ResultReceiver) y6.b.p(parcel, D, ResultReceiver.CREATOR);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new x(bArr, d, str, list, num, e, str2, dVar, l, str3, resultReceiver);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new x[i];
    }
}

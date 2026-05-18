package S6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        Integer num = null;
        Double d = null;
        Uri uri = null;
        byte[] bArr = null;
        List list = null;
        a aVar = null;
        String str = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 2:
                    num = y6.b.G(parcel, D);
                    break;
                case 3:
                    d = y6.b.A(parcel, D);
                    break;
                case 4:
                    uri = (Uri) y6.b.p(parcel, D, Uri.CREATOR);
                    break;
                case 5:
                    bArr = y6.b.g(parcel, D);
                    break;
                case 6:
                    list = y6.b.u(parcel, D, e.CREATOR);
                    break;
                case 7:
                    aVar = (a) y6.b.p(parcel, D, a.CREATOR);
                    break;
                case 8:
                    str = y6.b.q(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new SignRequestParams(num, d, uri, bArr, list, aVar, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignRequestParams[i];
    }
}

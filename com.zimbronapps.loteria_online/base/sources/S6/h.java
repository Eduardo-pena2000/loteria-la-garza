package S6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        byte[] bArr = null;
        List list = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i = y6.b.F(parcel, D);
            } else if (w == 2) {
                bArr = y6.b.g(parcel, D);
            } else if (w == 3) {
                str = y6.b.q(parcel, D);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                list = y6.b.u(parcel, D, Transport.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new b(i, bArr, str, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new b[i];
    }
}

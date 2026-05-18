package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                bArr = y6.b.g(parcel, D);
            } else if (w == 3) {
                str = y6.b.q(parcel, D);
            } else if (w == 4) {
                str2 = y6.b.q(parcel, D);
            } else if (w != 5) {
                y6.b.L(parcel, D);
            } else {
                str3 = y6.b.q(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new A(bArr, str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new A[i];
    }
}

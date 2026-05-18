package q6;

import android.os.Parcel;
import android.os.Parcelable;
import q6.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        byte[] bArr = null;
        String str = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                bArr = y6.b.g(parcel, D);
            } else if (w != 2) {
                y6.b.L(parcel, D);
            } else {
                str = y6.b.q(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new e.a(bArr, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new e.a[i];
    }
}

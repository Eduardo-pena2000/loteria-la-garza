package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class x0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                bArr = y6.b.g(parcel, D);
            } else if (w == 3) {
                bArr2 = y6.b.g(parcel, D);
            } else if (w == 4) {
                bArr3 = y6.b.g(parcel, D);
            } else if (w == 5) {
                bArr4 = y6.b.g(parcel, D);
            } else if (w != 6) {
                y6.b.L(parcel, D);
            } else {
                bArr5 = y6.b.g(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new g(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new g[i];
    }
}

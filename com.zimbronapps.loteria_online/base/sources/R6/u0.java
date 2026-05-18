package R6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class u0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                bArr = y6.b.g(parcel, D);
            } else if (w != 2) {
                y6.b.L(parcel, D);
            } else {
                bArr2 = y6.b.g(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new t0(bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length), bArr2 != null ? zzgx.zzl(bArr2, 0, bArr2.length) : null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new t0[i];
    }
}

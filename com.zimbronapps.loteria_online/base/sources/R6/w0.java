package R6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class w0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        byte[] bArr = null;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                z = y6.b.x(parcel, D);
            } else if (w != 2) {
                y6.b.L(parcel, D);
            } else {
                bArr = y6.b.g(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new v0(z, bArr != null ? zzgx.zzl(bArr, 0, bArr.length) : null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new v0[i];
    }
}

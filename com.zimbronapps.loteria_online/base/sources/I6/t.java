package I6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.drive.zzh;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class t implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        zzh zzhVar = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            if (y6.b.w(D) != 2) {
                y6.b.L(parcel, D);
            } else {
                zzhVar = (zzh) y6.b.p(parcel, D, zzh.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new s(zzhVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new s[i];
    }
}

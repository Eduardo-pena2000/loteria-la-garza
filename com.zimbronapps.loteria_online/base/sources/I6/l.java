package I6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveSpace;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class l implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        int i = 0;
        List list = null;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                i = y6.b.F(parcel, D);
            } else if (w == 3) {
                z = y6.b.x(parcel, D);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                list = y6.b.u(parcel, D, DriveSpace.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new k(i, z, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new k[i];
    }
}

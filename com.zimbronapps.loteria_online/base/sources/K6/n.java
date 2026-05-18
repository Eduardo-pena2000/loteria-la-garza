package K6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.internal.ParentDriveIdSet;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            if (y6.b.w(D) != 2) {
                y6.b.L(parcel, D);
            } else {
                arrayList = y6.b.u(parcel, D, q.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new ParentDriveIdSet(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParentDriveIdSet[i];
    }
}

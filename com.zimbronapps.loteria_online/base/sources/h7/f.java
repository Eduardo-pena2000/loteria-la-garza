package h7;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class F implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        ArrayList arrayList = LocationResult.b;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            if (y6.b.w(D) != 1) {
                y6.b.L(parcel, D);
            } else {
                arrayList = y6.b.u(parcel, D, Location.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new LocationResult(arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}

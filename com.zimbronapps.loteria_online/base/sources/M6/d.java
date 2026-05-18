package M6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        x xVar = null;
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                xVar = (x) y6.b.p(parcel, D, x.CREATOR);
            } else if (w != 2) {
                y6.b.L(parcel, D);
            } else {
                metadataBundle = (MetadataBundle) y6.b.p(parcel, D, MetadataBundle.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new c(xVar, metadataBundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}

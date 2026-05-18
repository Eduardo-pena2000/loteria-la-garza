package c7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        Long l = null;
        BitmapTeleporter bitmapTeleporter = null;
        Uri uri = null;
        Long l2 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                str = y6.b.q(parcel, D);
            } else if (w == 2) {
                l = y6.b.I(parcel, D);
            } else if (w == 4) {
                uri = (Uri) y6.b.p(parcel, D, Uri.CREATOR);
            } else if (w == 5) {
                bitmapTeleporter = (BitmapTeleporter) y6.b.p(parcel, D, BitmapTeleporter.CREATOR);
            } else if (w != 6) {
                y6.b.L(parcel, D);
            } else {
                l2 = y6.b.I(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new h(str, l, bitmapTeleporter, uri, l2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new h[i];
    }
}

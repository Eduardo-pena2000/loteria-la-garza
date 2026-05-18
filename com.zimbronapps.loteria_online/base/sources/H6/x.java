package H6;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class x implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        DriveId driveId = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) y6.b.p(parcel, D, ParcelFileDescriptor.CREATOR);
            } else if (w == 3) {
                i = y6.b.F(parcel, D);
            } else if (w == 4) {
                i2 = y6.b.F(parcel, D);
            } else if (w == 5) {
                driveId = (DriveId) y6.b.p(parcel, D, DriveId.CREATOR);
            } else if (w == 7) {
                z = y6.b.x(parcel, D);
            } else if (w != 8) {
                y6.b.L(parcel, D);
            } else {
                str = y6.b.q(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new a(parcelFileDescriptor, i, i2, driveId, z, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new a[i];
    }
}

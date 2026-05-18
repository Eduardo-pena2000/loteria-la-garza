package I6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        DriveId driveId = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        MetadataBundle metadataBundle = null;
        List list = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 2:
                    driveId = (DriveId) y6.b.p(parcel, D, DriveId.CREATOR);
                    break;
                case 3:
                    str = y6.b.q(parcel, D);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) y6.b.p(parcel, D, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) y6.b.p(parcel, D, ParcelFileDescriptor.CREATOR);
                    break;
                case 6:
                    metadataBundle = (MetadataBundle) y6.b.p(parcel, D, MetadataBundle.CREATOR);
                    break;
                case 7:
                    list = y6.b.s(parcel, D);
                    break;
                case 8:
                    i = y6.b.F(parcel, D);
                    break;
                case 9:
                    iBinder = y6.b.E(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new c(driveId, str, parcelFileDescriptor, parcelFileDescriptor2, metadataBundle, list, i, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}

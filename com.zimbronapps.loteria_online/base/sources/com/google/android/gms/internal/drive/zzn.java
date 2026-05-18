package com.google.android.gms.internal.drive;

import H6.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzn implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        DriveId driveId = null;
        MetadataBundle metadataBundle = null;
        a aVar = null;
        String str = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = true;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            switch (b.w(D)) {
                case 2:
                    driveId = (DriveId) b.p(parcel, D, DriveId.CREATOR);
                    break;
                case 3:
                    metadataBundle = (MetadataBundle) b.p(parcel, D, MetadataBundle.CREATOR);
                    break;
                case 4:
                    aVar = (a) b.p(parcel, D, a.CREATOR);
                    break;
                case 5:
                    z = b.x(parcel, D);
                    break;
                case 6:
                    str = b.q(parcel, D);
                    break;
                case 7:
                    i = b.F(parcel, D);
                    break;
                case 8:
                    i2 = b.F(parcel, D);
                    break;
                case 9:
                    z2 = b.x(parcel, D);
                    break;
                case 10:
                    z3 = b.x(parcel, D);
                    break;
                default:
                    b.L(parcel, D);
                    break;
            }
        }
        b.v(parcel, M);
        return new zzm(driveId, metadataBundle, aVar, z, str, i, i2, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}

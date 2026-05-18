package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzv implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        MetadataBundle metadataBundle = null;
        String str = null;
        DriveId driveId = null;
        Integer num = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                metadataBundle = (MetadataBundle) b.p(parcel, D, MetadataBundle.CREATOR);
            } else if (w == 3) {
                i = b.F(parcel, D);
            } else if (w == 4) {
                str = b.q(parcel, D);
            } else if (w == 5) {
                driveId = (DriveId) b.p(parcel, D, DriveId.CREATOR);
            } else if (w != 6) {
                b.L(parcel, D);
            } else {
                num = b.G(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzu(metadataBundle, i, str, driveId, num);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzu[i];
    }
}

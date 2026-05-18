package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzz implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        DriveId driveId = null;
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                driveId = (DriveId) b.p(parcel, D, DriveId.CREATOR);
            } else if (w != 3) {
                b.L(parcel, D);
            } else {
                metadataBundle = (MetadataBundle) b.p(parcel, D, MetadataBundle.CREATOR);
            }
        }
        b.v(parcel, M);
        return new zzy(driveId, metadataBundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzy[i];
    }
}

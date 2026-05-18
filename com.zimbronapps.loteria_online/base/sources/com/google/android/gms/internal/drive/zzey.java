package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzey implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        DriveId driveId = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            if (b.w(D) != 2) {
                b.L(parcel, D);
            } else {
                driveId = (DriveId) b.p(parcel, D, DriveId.CREATOR);
            }
        }
        b.v(parcel, M);
        return new zzex(driveId);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzex[i];
    }
}

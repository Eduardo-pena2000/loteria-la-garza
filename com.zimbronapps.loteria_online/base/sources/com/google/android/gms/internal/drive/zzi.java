package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzi implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        int i = 0;
        int i2 = 0;
        DriveId driveId = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                i = b.F(parcel, D);
            } else if (w == 3) {
                driveId = (DriveId) b.p(parcel, D, DriveId.CREATOR);
            } else if (w == 4) {
                i2 = b.F(parcel, D);
            } else if (w == 5) {
                j = b.H(parcel, D);
            } else if (w != 6) {
                b.L(parcel, D);
            } else {
                j2 = b.H(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzh(i, driveId, i2, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}

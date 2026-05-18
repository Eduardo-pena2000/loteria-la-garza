package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgk implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        DriveId driveId = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                driveId = (DriveId) b.p(parcel, D, DriveId.CREATOR);
            } else if (w == 3) {
                i = b.F(parcel, D);
            } else if (w != 4) {
                b.L(parcel, D);
            } else {
                i2 = b.F(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzgj(driveId, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzgj[i];
    }
}

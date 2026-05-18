package com.google.android.gms.internal.drive;

import I6.k;
import I6.u;
import I6.y;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzk implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        DriveId driveId = null;
        k kVar = null;
        y yVar = null;
        u uVar = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                driveId = (DriveId) b.p(parcel, D, DriveId.CREATOR);
            } else if (w == 3) {
                i = b.F(parcel, D);
            } else if (w == 4) {
                kVar = (k) b.p(parcel, D, k.CREATOR);
            } else if (w == 5) {
                yVar = (y) b.p(parcel, D, y.CREATOR);
            } else if (w != 6) {
                b.L(parcel, D);
            } else {
                uVar = (u) b.p(parcel, D, u.CREATOR);
            }
        }
        b.v(parcel, M);
        return new zzj(driveId, i, kVar, yVar, uVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}

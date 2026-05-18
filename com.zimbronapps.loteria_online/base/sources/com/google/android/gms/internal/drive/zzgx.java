package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgx implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        DriveId driveId = null;
        List list = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                driveId = (DriveId) b.p(parcel, D, DriveId.CREATOR);
            } else if (w != 3) {
                b.L(parcel, D);
            } else {
                list = b.u(parcel, D, DriveId.CREATOR);
            }
        }
        b.v(parcel, M);
        return new zzgw(driveId, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzgw[i];
    }
}

package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgn implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        String str = null;
        String[] strArr = null;
        DriveId driveId = null;
        FilterHolder filterHolder = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                str = b.q(parcel, D);
            } else if (w == 3) {
                strArr = b.r(parcel, D);
            } else if (w == 4) {
                driveId = (DriveId) b.p(parcel, D, DriveId.CREATOR);
            } else if (w != 5) {
                b.L(parcel, D);
            } else {
                filterHolder = (FilterHolder) b.p(parcel, D, FilterHolder.CREATOR);
            }
        }
        b.v(parcel, M);
        return new zzgm(str, strArr, driveId, filterHolder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzgm[i];
    }
}

package com.google.android.gms.internal.drive;

import H6.v;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import java.util.List;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfg implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        DataHolder dataHolder = null;
        v vVar = null;
        boolean z = false;
        List list = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                dataHolder = (DataHolder) b.p(parcel, D, DataHolder.CREATOR);
            } else if (w == 3) {
                list = b.u(parcel, D, DriveId.CREATOR);
            } else if (w == 4) {
                vVar = (v) b.p(parcel, D, v.CREATOR);
            } else if (w != 5) {
                b.L(parcel, D);
            } else {
                z = b.x(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzff(dataHolder, list, vVar, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzff[i];
    }
}

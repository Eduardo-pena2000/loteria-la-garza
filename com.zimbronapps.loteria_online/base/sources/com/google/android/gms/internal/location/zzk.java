package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e;
import h7.Y;
import java.util.List;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        Y y = zzj.zzb;
        List list = zzj.zza;
        String str = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 1) {
                y = (Y) b.p(parcel, D, Y.CREATOR);
            } else if (w == 2) {
                list = b.u(parcel, D, e.CREATOR);
            } else if (w != 3) {
                b.L(parcel, D);
            } else {
                str = b.q(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzj(y, list, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}

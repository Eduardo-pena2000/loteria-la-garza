package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        List list = zzba.zza;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        long j = Long.MAX_VALUE;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w != 1) {
                switch (w) {
                    case 5:
                        list = b.u(parcel, D, e.CREATOR);
                        break;
                    case 6:
                        str = b.q(parcel, D);
                        break;
                    case 7:
                        z = b.x(parcel, D);
                        break;
                    case 8:
                        z2 = b.x(parcel, D);
                        break;
                    case 9:
                        z3 = b.x(parcel, D);
                        break;
                    case 10:
                        str2 = b.q(parcel, D);
                        break;
                    case 11:
                        z4 = b.x(parcel, D);
                        break;
                    case 12:
                        z5 = b.x(parcel, D);
                        break;
                    case 13:
                        str3 = b.q(parcel, D);
                        break;
                    case 14:
                        j = b.H(parcel, D);
                        break;
                    default:
                        b.L(parcel, D);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) b.p(parcel, D, LocationRequest.CREATOR);
            }
        }
        b.v(parcel, M);
        return new zzba(locationRequest, list, str, z, z2, z3, str2, z4, z5, str3, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzba[i];
    }
}

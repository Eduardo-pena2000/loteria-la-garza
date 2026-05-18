package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        int i = 1;
        zzba zzbaVar = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            switch (b.w(D)) {
                case 1:
                    i = b.F(parcel, D);
                    break;
                case 2:
                    zzbaVar = (zzba) b.p(parcel, D, zzba.CREATOR);
                    break;
                case 3:
                    iBinder = b.E(parcel, D);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.p(parcel, D, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = b.E(parcel, D);
                    break;
                case 6:
                    iBinder3 = b.E(parcel, D);
                    break;
                default:
                    b.L(parcel, D);
                    break;
            }
        }
        b.v(parcel, M);
        return new zzbc(i, zzbaVar, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzbc[i];
    }
}

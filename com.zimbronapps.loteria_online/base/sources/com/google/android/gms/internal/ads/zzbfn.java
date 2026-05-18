package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbfn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        long j = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) y6.b.p(parcel, D, ParcelFileDescriptor.CREATOR);
            } else if (w == 3) {
                z = y6.b.x(parcel, D);
            } else if (w == 4) {
                z2 = y6.b.x(parcel, D);
            } else if (w == 5) {
                j = y6.b.H(parcel, D);
            } else if (w != 6) {
                y6.b.L(parcel, D);
            } else {
                z3 = y6.b.x(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new zzbfm(parcelFileDescriptor, z, z2, j, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfm[i];
    }
}

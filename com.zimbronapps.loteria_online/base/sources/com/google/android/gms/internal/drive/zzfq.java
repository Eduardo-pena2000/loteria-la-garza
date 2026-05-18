package com.google.android.gms.internal.drive;

import I6.a;
import I6.c;
import I6.i;
import I6.q;
import I6.s;
import I6.w;
import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfq implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        int i = 0;
        a aVar = null;
        c cVar = null;
        q qVar = null;
        i iVar = null;
        w wVar = null;
        s sVar = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                i = b.F(parcel, D);
            } else if (w == 3) {
                aVar = (a) b.p(parcel, D, a.CREATOR);
            } else if (w == 5) {
                cVar = (c) b.p(parcel, D, c.CREATOR);
            } else if (w == 6) {
                qVar = (q) b.p(parcel, D, q.CREATOR);
            } else if (w == 7) {
                iVar = (i) b.p(parcel, D, i.CREATOR);
            } else if (w == 9) {
                wVar = (w) b.p(parcel, D, w.CREATOR);
            } else if (w != 10) {
                b.L(parcel, D);
            } else {
                sVar = (s) b.p(parcel, D, s.CREATOR);
            }
        }
        b.v(parcel, M);
        return new zzfp(i, aVar, cVar, qVar, iVar, wVar, sVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfp[i];
    }
}

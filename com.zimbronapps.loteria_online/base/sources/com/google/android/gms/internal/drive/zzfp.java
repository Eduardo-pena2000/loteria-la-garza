package com.google.android.gms.internal.drive;

import I6.c;
import I6.d;
import I6.i;
import I6.q;
import I6.s;
import I6.w;
import android.os.Parcel;
import android.os.Parcelable;
import y6.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfp extends a {
    public static final Parcelable.Creator CREATOR = new zzfq();
    private final int zzda;
    private final I6.a zzib;
    private final c zzic;
    private final q zzid;
    private final i zzie;
    private final w zzif;
    private final s zzig;

    public zzfp(int i, I6.a aVar, c cVar, q qVar, i iVar, w wVar, s sVar) {
        this.zzda = i;
        this.zzib = aVar;
        this.zzic = cVar;
        this.zzid = qVar;
        this.zzie = iVar;
        this.zzif = wVar;
        this.zzig = sVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 2, this.zzda);
        y6.c.C(parcel, 3, this.zzib, i, false);
        y6.c.C(parcel, 5, this.zzic, i, false);
        y6.c.C(parcel, 6, this.zzid, i, false);
        y6.c.C(parcel, 7, this.zzie, i, false);
        y6.c.C(parcel, 9, this.zzif, i, false);
        y6.c.C(parcel, 10, this.zzig, i, false);
        y6.c.b(parcel, a);
    }

    public final d zzat() {
        int i = this.zzda;
        if (i == 1) {
            return this.zzib;
        }
        if (i == 2) {
            return this.zzic;
        }
        if (i == 3) {
            return this.zzid;
        }
        if (i == 4) {
            return this.zzie;
        }
        if (i == 7) {
            return this.zzif;
        }
        if (i == 8) {
            return this.zzig;
        }
        int i2 = this.zzda;
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unexpected event type ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }
}

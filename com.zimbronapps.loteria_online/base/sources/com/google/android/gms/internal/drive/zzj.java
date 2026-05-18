package com.google.android.gms.internal.drive;

import I6.k;
import I6.u;
import I6.y;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.drive.DriveId;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzj extends a {
    public static final Parcelable.Creator CREATOR = new zzk();
    private final k zzbv;
    final int zzda;
    private final y zzdb;
    private final u zzdc;
    final DriveId zzk;

    public zzj(DriveId driveId, int i, k kVar, y yVar, u uVar) {
        this.zzk = driveId;
        this.zzda = i;
        this.zzbv = kVar;
        this.zzdb = yVar;
        this.zzdc = uVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzk, i, false);
        c.t(parcel, 3, this.zzda);
        c.C(parcel, 4, this.zzbv, i, false);
        c.C(parcel, 5, this.zzdb, i, false);
        c.C(parcel, 6, this.zzdc, i, false);
        c.b(parcel, a);
    }

    public zzj(int i, DriveId driveId) {
        this((DriveId) t.l(driveId), 1, null, null, null);
    }
}

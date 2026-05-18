package com.google.android.gms.internal.drive;

import I6.u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.drive.DriveId;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgs extends a {
    public static final Parcelable.Creator CREATOR = new zzgt();
    private final int zzda;
    private final u zzdc;
    private final DriveId zzk;

    public zzgs(DriveId driveId, int i, u uVar) {
        this.zzk = driveId;
        this.zzda = i;
        this.zzdc = uVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzk, i, false);
        c.t(parcel, 3, this.zzda);
        c.C(parcel, 4, this.zzdc, i, false);
        c.b(parcel, a);
    }

    @VisibleForTesting
    public zzgs(DriveId driveId, int i) {
        this(driveId, i, null);
    }
}

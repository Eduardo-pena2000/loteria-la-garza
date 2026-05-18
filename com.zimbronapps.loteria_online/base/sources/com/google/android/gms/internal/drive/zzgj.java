package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.drive.DriveId;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgj extends a {
    public static final Parcelable.Creator CREATOR = new zzgk();
    private final int mode;
    private final DriveId zzdd;
    private final int zzip;

    @VisibleForTesting
    public zzgj(DriveId driveId, int i, int i2) {
        this.zzdd = driveId;
        this.mode = i;
        this.zzip = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzdd, i, false);
        c.t(parcel, 3, this.mode);
        c.t(parcel, 4, this.zzip);
        c.b(parcel, a);
    }
}

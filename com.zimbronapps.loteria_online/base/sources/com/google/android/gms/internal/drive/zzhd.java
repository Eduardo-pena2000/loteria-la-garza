package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.drive.DriveId;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhd extends a {
    public static final Parcelable.Creator CREATOR = new zzhe();
    private final DriveId zzdd;

    @VisibleForTesting
    public zzhd(DriveId driveId) {
        this.zzdd = driveId;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzdd, i, false);
        c.b(parcel, a);
    }
}

package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.drive.DriveId;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzek extends a {
    public static final Parcelable.Creator CREATOR = new zzel();
    private final DriveId zzdd;
    private final boolean zzha;

    @VisibleForTesting
    public zzek(DriveId driveId, boolean z) {
        this.zzdd = driveId;
        this.zzha = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzdd, i, false);
        c.g(parcel, 3, this.zzha);
        c.b(parcel, a);
    }
}

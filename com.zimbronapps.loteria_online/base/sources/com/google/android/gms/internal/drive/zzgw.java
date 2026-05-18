package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.drive.DriveId;
import java.util.List;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgw extends a {
    public static final Parcelable.Creator CREATOR = new zzgx();
    private final DriveId zzis;
    private final List zzit;

    @VisibleForTesting
    public zzgw(DriveId driveId, List list) {
        this.zzis = driveId;
        this.zzit = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzis, i, false);
        c.I(parcel, 3, this.zzit, false);
        c.b(parcel, a);
    }
}

package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzy extends a {
    public static final Parcelable.Creator CREATOR = new zzz();
    private final MetadataBundle zzdn;
    private final DriveId zzdp;

    @VisibleForTesting
    public zzy(DriveId driveId, MetadataBundle metadataBundle) {
        this.zzdp = (DriveId) t.l(driveId);
        this.zzdn = (MetadataBundle) t.l(metadataBundle);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzdp, i, false);
        c.C(parcel, 3, this.zzdn, i, false);
        c.b(parcel, a);
    }
}

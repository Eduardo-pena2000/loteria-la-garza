package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzu extends a {
    public static final Parcelable.Creator CREATOR = new zzv();
    private final String zzba;
    private final DriveId zzbd;
    private final MetadataBundle zzdn;
    private final Integer zzdo;
    private final int zzj;

    @VisibleForTesting
    public zzu(MetadataBundle metadataBundle, int i, String str, DriveId driveId, Integer num) {
        this.zzdn = metadataBundle;
        this.zzj = i;
        this.zzba = str;
        this.zzbd = driveId;
        this.zzdo = num;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzdn, i, false);
        c.t(parcel, 3, this.zzj);
        c.E(parcel, 4, this.zzba, false);
        c.C(parcel, 5, this.zzbd, i, false);
        c.w(parcel, 6, this.zzdo, false);
        c.b(parcel, a);
    }
}

package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgm extends a {
    public static final Parcelable.Creator CREATOR = new zzgn();
    private final String zzba;
    private final String[] zzbb;
    private final DriveId zzbd;
    private final FilterHolder zzbe;

    @VisibleForTesting
    public zzgm(String str, String[] strArr, DriveId driveId, FilterHolder filterHolder) {
        this.zzba = str;
        this.zzbb = strArr;
        this.zzbd = driveId;
        this.zzbe = filterHolder;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.E(parcel, 2, this.zzba, false);
        c.F(parcel, 3, this.zzbb, false);
        c.C(parcel, 4, this.zzbd, i, false);
        c.C(parcel, 5, this.zzbe, i, false);
        c.b(parcel, a);
    }
}

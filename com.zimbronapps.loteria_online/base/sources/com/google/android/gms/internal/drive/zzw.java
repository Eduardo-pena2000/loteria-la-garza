package com.google.android.gms.internal.drive;

import H6.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzw extends a {
    public static final Parcelable.Creator CREATOR = new zzx();
    private final String zzan;
    private final H6.a zzdf;
    private final MetadataBundle zzdn;
    private final Integer zzdo;
    private final DriveId zzdp;
    private final boolean zzdq;
    private final int zzdr;
    private final int zzds;

    public zzw(DriveId driveId, MetadataBundle metadataBundle, H6.a aVar, int i, boolean z, String str, int i2, int i3) {
        if (aVar != null && i3 != 0) {
            t.b(aVar.Q1() == i3, "inconsistent contents reference");
        }
        if (i == 0 && aVar == null && i3 == 0) {
            throw new IllegalArgumentException("Need a valid contents");
        }
        this.zzdp = (DriveId) t.l(driveId);
        this.zzdn = (MetadataBundle) t.l(metadataBundle);
        this.zzdf = aVar;
        this.zzdo = Integer.valueOf(i);
        this.zzan = str;
        this.zzdr = i2;
        this.zzdq = z;
        this.zzds = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzdp, i, false);
        c.C(parcel, 3, this.zzdn, i, false);
        c.C(parcel, 4, this.zzdf, i, false);
        c.w(parcel, 5, this.zzdo, false);
        c.g(parcel, 6, this.zzdq);
        c.E(parcel, 7, this.zzan, false);
        c.t(parcel, 8, this.zzdr);
        c.t(parcel, 9, this.zzds);
        c.b(parcel, a);
    }

    @VisibleForTesting
    public zzw(DriveId driveId, MetadataBundle metadataBundle, int i, int i2, m mVar) {
        this(driveId, metadataBundle, null, i2, mVar.e(), mVar.d(), mVar.f(), i);
    }
}

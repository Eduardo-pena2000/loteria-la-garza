package com.google.android.gms.internal.drive;

import H6.H;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzm extends a {
    public static final Parcelable.Creator CREATOR = new zzn();
    private final String zzan;
    private final boolean zzao;
    private final boolean zzat;
    private final DriveId zzdd;
    private final MetadataBundle zzde;
    private final H6.a zzdf;
    private final int zzdg;
    private final int zzdh;
    private final boolean zzdi;

    public zzm(DriveId driveId, MetadataBundle metadataBundle, H6.a aVar, boolean z, String str, int i, int i2, boolean z2, boolean z3) {
        this.zzdd = driveId;
        this.zzde = metadataBundle;
        this.zzdf = aVar;
        this.zzao = z;
        this.zzan = str;
        this.zzdg = i;
        this.zzdh = i2;
        this.zzdi = z2;
        this.zzat = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzdd, i, false);
        c.C(parcel, 3, this.zzde, i, false);
        c.C(parcel, 4, this.zzdf, i, false);
        c.g(parcel, 5, this.zzao);
        c.E(parcel, 6, this.zzan, false);
        c.t(parcel, 7, this.zzdg);
        c.t(parcel, 8, this.zzdh);
        c.g(parcel, 9, this.zzdi);
        c.g(parcel, 10, this.zzat);
        c.b(parcel, a);
    }

    @VisibleForTesting
    public zzm(DriveId driveId, MetadataBundle metadataBundle, int i, boolean z, H h) {
        this(driveId, metadataBundle, null, h.e(), h.d(), h.f(), i, z, h.h());
    }
}

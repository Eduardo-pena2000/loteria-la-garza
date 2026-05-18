package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfy extends a {
    public static final Parcelable.Creator CREATOR = new zzfz();
    final MetadataBundle zzdn;

    public zzfy(MetadataBundle metadataBundle) {
        this.zzdn = metadataBundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzdn, i, false);
        c.b(parcel, a);
    }

    public final MetadataBundle zzaw() {
        return this.zzdn;
    }
}

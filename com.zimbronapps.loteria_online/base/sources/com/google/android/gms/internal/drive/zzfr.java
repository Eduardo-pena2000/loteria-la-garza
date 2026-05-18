package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfr extends a {
    public static final Parcelable.Creator CREATOR = new zzfs();
    private final ParcelFileDescriptor zzih;

    public zzfr(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzih = parcelFileDescriptor;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzih, i | 1, false);
        c.b(parcel, a);
    }
}

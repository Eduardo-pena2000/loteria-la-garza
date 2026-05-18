package com.google.android.gms.internal.drive;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgf extends a {
    public static final Parcelable.Creator CREATOR = new zzgg();
    private final ParcelFileDescriptor zzin;
    private final IBinder zzio;
    private final String zzm;

    public zzgf(ParcelFileDescriptor parcelFileDescriptor, IBinder iBinder, String str) {
        this.zzin = parcelFileDescriptor;
        this.zzio = iBinder;
        this.zzm = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzin, i | 1, false);
        c.s(parcel, 3, this.zzio, false);
        c.E(parcel, 4, this.zzm, false);
        c.b(parcel, a);
    }
}

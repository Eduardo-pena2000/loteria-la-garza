package com.google.android.gms.internal.drive;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzec extends a {
    public static final Parcelable.Creator CREATOR = new zzed();
    final IBinder zzgs;

    public zzec(IBinder iBinder) {
        this.zzgs = iBinder;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.s(parcel, 2, this.zzgs, false);
        c.b(parcel, a);
    }
}

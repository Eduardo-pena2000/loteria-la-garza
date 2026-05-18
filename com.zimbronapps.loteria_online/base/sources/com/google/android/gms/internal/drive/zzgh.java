package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgh extends a {
    public static final Parcelable.Creator CREATOR = new zzgi();
    private final boolean zzea;

    public zzgh(boolean z) {
        this.zzea = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.g(parcel, 2, this.zzea);
        c.b(parcel, a);
    }
}

package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzr extends a {
    public static final Parcelable.Creator CREATOR = new zzs();
    private final int mode;

    public zzr(int i) {
        t.b(i == 536870912 || i == 805306368, "Cannot create a new read-only contents!");
        this.mode = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.t(parcel, 2, this.mode);
        c.b(parcel, a);
    }
}

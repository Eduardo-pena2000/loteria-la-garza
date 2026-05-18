package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzad extends a {
    public static final Parcelable.Creator CREATOR = new zzae();

    @VisibleForTesting
    public zzad() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        c.b(parcel, c.a(parcel));
    }
}

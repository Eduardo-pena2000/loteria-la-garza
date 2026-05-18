package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgz extends a {
    public static final Parcelable.Creator CREATOR = new zzha();
    private final List zziu;

    public zzgz(List list) {
        this.zziu = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.G(parcel, 2, this.zziu, false);
        c.b(parcel, a);
    }
}

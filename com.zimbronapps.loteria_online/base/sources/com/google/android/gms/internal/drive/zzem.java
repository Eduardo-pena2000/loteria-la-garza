package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzem extends a {
    public static final Parcelable.Creator CREATOR = new zzen();
    private final int responseCode;
    private final List zzhb;

    public zzem(List list, int i) {
        this.zzhb = list;
        this.responseCode = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.I(parcel, 2, this.zzhb, false);
        c.t(parcel, 3, this.responseCode);
        c.b(parcel, a);
    }
}

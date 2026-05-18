package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfx extends a {
    public static final Parcelable.Creator CREATOR = new zzgc();
    private final boolean zzik;

    public zzfx(boolean z) {
        this.zzik = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.g(parcel, 2, this.zzik);
        c.b(parcel, a);
    }
}

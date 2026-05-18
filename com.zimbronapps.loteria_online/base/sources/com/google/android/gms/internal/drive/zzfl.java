package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfl extends a {
    private final int status;
    final long zzhy;
    final long zzhz;
    private final List zzia;
    private static final List zzhx = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new zzfm();

    public zzfl(long j, long j2, int i, List list) {
        this.zzhy = j;
        this.zzhz = j2;
        this.status = i;
        this.zzia = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.x(parcel, 2, this.zzhy);
        c.x(parcel, 3, this.zzhz);
        c.t(parcel, 4, this.status);
        c.I(parcel, 5, this.zzia, false);
        c.b(parcel, a);
    }
}

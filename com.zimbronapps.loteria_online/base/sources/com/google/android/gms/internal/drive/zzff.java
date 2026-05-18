package com.google.android.gms.internal.drive;

import H6.N;
import H6.v;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzff extends N {
    public static final Parcelable.Creator CREATOR = new zzfg();
    private final DataHolder zzhr;
    private final List zzhs;
    private final v zzht;
    private final boolean zzhu;

    public zzff(DataHolder dataHolder, List list, v vVar, boolean z) {
        this.zzhr = dataHolder;
        this.zzhs = list;
        this.zzht = vVar;
        this.zzhu = z;
    }

    public final void zza(Parcel parcel, int i) {
        int i2 = i | 1;
        int a = c.a(parcel);
        c.C(parcel, 2, this.zzhr, i2, false);
        c.I(parcel, 3, this.zzhs, false);
        c.C(parcel, 4, this.zzht, i2, false);
        c.g(parcel, 5, this.zzhu);
        c.b(parcel, a);
    }
}

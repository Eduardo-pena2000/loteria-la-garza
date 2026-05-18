package com.google.android.gms.drive.metadata.internal;

import K6.n;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.List;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class ParentDriveIdSet extends a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new n();
    public final List a;

    public ParentDriveIdSet(List list) {
        this.a = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.I(parcel, 2, this.a, false);
        c.b(parcel, a);
    }

    public ParentDriveIdSet() {
        this(new ArrayList());
    }
}

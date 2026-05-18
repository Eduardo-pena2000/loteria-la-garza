package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class v implements Parcelable.Creator {
    public static final v b = new v(new w());
    public final Parcelable.Creator a;

    public v(Parcelable.Creator creator) {
        this.a = creator;
    }

    public static v a() {
        return b;
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return w.a(parcel);
        }
        parcel.setDataPosition(dataPosition - 4);
        return c.N1();
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}

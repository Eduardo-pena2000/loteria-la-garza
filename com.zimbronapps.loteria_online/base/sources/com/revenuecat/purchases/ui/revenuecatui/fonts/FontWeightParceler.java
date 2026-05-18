package com.revenuecat.purchases.ui.revenuecatui.fonts;

import android.os.Parcel;
import d1.L;
import kotlin.jvm.internal.t;
import nb.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FontWeightParceler implements a {
    public static final int $stable = 0;
    public static final FontWeightParceler INSTANCE = new FontWeightParceler();

    private FontWeightParceler() {
    }

    public L[] newArray(int i) {
        return (L[]) a.a.a(this, i);
    }

    public L create(Parcel parcel) {
        t.g(parcel, "parcel");
        return new L(parcel.readInt());
    }

    public void write(L l, Parcel parcel, int i) {
        t.g(l, "<this>");
        t.g(parcel, "parcel");
        parcel.writeInt(l.o());
    }
}

package com.revenuecat.purchases.ui.revenuecatui.fonts;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallFontFamily implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator CREATOR = new Creator();
    private final List fonts;

    public static final class Creator implements Parcelable.Creator {
        public final PaywallFontFamily createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(PaywallFontFamily.class.getClassLoader()));
            }
            return new PaywallFontFamily(arrayList);
        }

        public final PaywallFontFamily[] newArray(int i) {
            return new PaywallFontFamily[i];
        }
    }

    public PaywallFontFamily(List fonts) {
        t.g(fonts, "fonts");
        this.fonts = fonts;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaywallFontFamily) && t.c(this.fonts, ((PaywallFontFamily) obj).fonts);
    }

    public final List getFonts() {
        return this.fonts;
    }

    public int hashCode() {
        return this.fonts.hashCode();
    }

    public String toString() {
        return "PaywallFontFamily(fonts=" + this.fonts + ')';
    }

    public void writeToParcel(Parcel out, int i) {
        t.g(out, "out");
        List list = this.fonts;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i);
        }
    }
}

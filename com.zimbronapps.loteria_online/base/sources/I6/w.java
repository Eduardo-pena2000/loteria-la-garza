package I6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class w extends y6.a implements d {
    public static final Parcelable.Creator CREATOR = new x();
    public final List a;

    public w(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != w.class) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return com.google.android.gms.common.internal.r.b(this.a, ((w) obj).a);
    }

    public final int getType() {
        return 7;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a);
    }

    public final String toString() {
        return String.format("TransferStateEvent[%s]", new Object[]{TextUtils.join("','", this.a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.I(parcel, 3, this.a, false);
        y6.c.b(parcel, a);
    }
}

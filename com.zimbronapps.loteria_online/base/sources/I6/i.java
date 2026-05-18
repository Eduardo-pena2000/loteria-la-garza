package I6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class i extends y6.a implements d {
    public static final Parcelable.Creator CREATOR = new j();
    public final k a;

    public i(k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != i.class) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return com.google.android.gms.common.internal.r.b(this.a, ((i) obj).a);
    }

    public final int getType() {
        return 4;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a);
    }

    public final String toString() {
        return String.format(Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 3, this.a, i, false);
        y6.c.b(parcel, a);
    }
}

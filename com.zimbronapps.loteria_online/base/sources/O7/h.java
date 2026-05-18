package o7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class h extends y6.a implements com.google.android.gms.common.api.m {
    public static final Parcelable.Creator CREATOR = new i();
    public final List a;
    public final String b;

    public h(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final Status getStatus() {
        return this.b != null ? Status.f : Status.j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = y6.c.a(parcel);
        y6.c.G(parcel, 1, list, false);
        y6.c.E(parcel, 2, this.b, false);
        y6.c.b(parcel, a);
    }
}

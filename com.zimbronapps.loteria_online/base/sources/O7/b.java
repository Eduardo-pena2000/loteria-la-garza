package o7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class b extends y6.a implements com.google.android.gms.common.api.m {
    public static final Parcelable.Creator CREATOR = new c();
    public final int a;
    public int b;
    public Intent c;

    public b(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final Status getStatus() {
        return this.b == 0 ? Status.f : Status.j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.t(parcel, 2, this.b);
        y6.c.C(parcel, 3, this.c, i, false);
        y6.c.b(parcel, a);
    }
}

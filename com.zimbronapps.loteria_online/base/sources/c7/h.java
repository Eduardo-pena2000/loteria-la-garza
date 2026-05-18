package c7;

import W6.y;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h extends y implements g {
    public static final Parcelable.Creator CREATOR = new m();
    public final String a;
    public final Long b;
    public final Uri c;
    public BitmapTeleporter d;
    public final Long e;

    public h(String str, Long l, BitmapTeleporter bitmapTeleporter, Uri uri, Long l2) {
        this.a = str;
        this.b = l;
        this.d = bitmapTeleporter;
        this.c = uri;
        this.e = l2;
        boolean z = true;
        if (bitmapTeleporter != null && uri != null) {
            z = false;
        }
        t.p(z, "Cannot set both a URI and an image");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, str, false);
        y6.c.z(parcel, 2, this.b, false);
        y6.c.C(parcel, 4, this.c, i, false);
        y6.c.C(parcel, 5, this.d, i, false);
        y6.c.z(parcel, 6, this.e, false);
        y6.c.b(parcel, a);
    }

    public final BitmapTeleporter zza() {
        return this.d;
    }
}

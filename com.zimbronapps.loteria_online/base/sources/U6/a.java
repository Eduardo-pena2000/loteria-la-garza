package u6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class a extends y6.a {
    public static final Parcelable.Creator CREATOR = new d();
    public final Intent a;

    public a(Intent intent) {
        this.a = intent;
    }

    public Intent M1() {
        return this.a;
    }

    public String N1() {
        String stringExtra = this.a.getStringExtra("google.message_id");
        return stringExtra == null ? this.a.getStringExtra("message_id") : stringExtra;
    }

    public final Integer O1() {
        if (this.a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 1, this.a, i, false);
        y6.c.b(parcel, a);
    }
}

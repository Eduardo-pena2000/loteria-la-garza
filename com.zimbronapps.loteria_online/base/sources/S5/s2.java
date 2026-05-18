package S5;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class s2 extends y6.a {
    public static final Parcelable.Creator CREATOR = new t2();
    public final int a;
    public final int b;
    public final String c;
    public final long d;

    public s2(int i, int i2, String str, long j) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = j;
    }

    public static s2 M1(JSONObject jSONObject) {
        return new s2(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.t(parcel, 2, this.b);
        y6.c.E(parcel, 3, this.c, false);
        y6.c.x(parcel, 4, this.d);
        y6.c.b(parcel, a);
    }
}

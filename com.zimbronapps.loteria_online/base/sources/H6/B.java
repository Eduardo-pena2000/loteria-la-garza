package h6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b extends y6.a {
    public static final Parcelable.Creator CREATOR = new e();
    public final int a;
    public int b;
    public String c;
    public Account d;

    public b(int i, int i2, String str, Account account) {
        this.a = i;
        this.b = i2;
        this.c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, this.a);
        y6.c.t(parcel, 2, this.b);
        y6.c.E(parcel, 3, this.c, false);
        y6.c.C(parcel, 4, this.d, i, false);
        y6.c.b(parcel, a);
    }
}

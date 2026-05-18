package U5;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 2:
                    str = y6.b.q(parcel, D);
                    break;
                case 3:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 4:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 5:
                    str4 = y6.b.q(parcel, D);
                    break;
                case 6:
                    str5 = y6.b.q(parcel, D);
                    break;
                case 7:
                    str6 = y6.b.q(parcel, D);
                    break;
                case 8:
                    str7 = y6.b.q(parcel, D);
                    break;
                case 9:
                    intent = (Intent) y6.b.p(parcel, D, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = y6.b.E(parcel, D);
                    break;
                case 11:
                    z = y6.b.x(parcel, D);
                    break;
                case 12:
                    bundle = y6.b.f(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new m(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new m[i];
    }
}

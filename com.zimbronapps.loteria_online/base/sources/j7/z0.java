package J7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.firebase-auth-api.zzajb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class z0 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzajb zzajbVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    str = y6.b.q(parcel, D);
                    break;
                case 2:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 3:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 4:
                    zzajbVar = (zzajb) y6.b.p(parcel, D, zzajb.CREATOR);
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
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new A0(str, str2, str3, zzajbVar, str4, str5, str6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new A0[i];
    }
}

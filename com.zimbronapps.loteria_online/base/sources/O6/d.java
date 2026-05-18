package o6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    i = y6.b.F(parcel, D);
                    break;
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
                    uri = (Uri) y6.b.p(parcel, D, Uri.CREATOR);
                    break;
                case 7:
                    str5 = y6.b.q(parcel, D);
                    break;
                case 8:
                    j = y6.b.H(parcel, D);
                    break;
                case 9:
                    str6 = y6.b.q(parcel, D);
                    break;
                case 10:
                    list = y6.b.u(parcel, D, Scope.CREATOR);
                    break;
                case 11:
                    str7 = y6.b.q(parcel, D);
                    break;
                case 12:
                    str8 = y6.b.q(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}

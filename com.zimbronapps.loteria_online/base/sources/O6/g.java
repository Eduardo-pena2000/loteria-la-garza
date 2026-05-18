package o6;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    i = y6.b.F(parcel, D);
                    break;
                case 2:
                    arrayList = y6.b.u(parcel, D, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) y6.b.p(parcel, D, Account.CREATOR);
                    break;
                case 4:
                    z = y6.b.x(parcel, D);
                    break;
                case 5:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 6:
                    z3 = y6.b.x(parcel, D);
                    break;
                case 7:
                    str = y6.b.q(parcel, D);
                    break;
                case 8:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 9:
                    arrayList2 = y6.b.u(parcel, D, p6.a.CREATOR);
                    break;
                case 10:
                    str3 = y6.b.q(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}

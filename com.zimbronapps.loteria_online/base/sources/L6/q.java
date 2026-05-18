package l6;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        List list = null;
        String str = null;
        Account account = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    list = y6.b.u(parcel, D, Scope.CREATOR);
                    break;
                case 2:
                    str = y6.b.q(parcel, D);
                    break;
                case 3:
                    z = y6.b.x(parcel, D);
                    break;
                case 4:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 5:
                    account = (Account) y6.b.p(parcel, D, Account.CREATOR);
                    break;
                case 6:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 7:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 8:
                    z3 = y6.b.x(parcel, D);
                    break;
                case 9:
                    bundle = y6.b.f(parcel, D);
                    break;
                case 10:
                    z4 = y6.b.x(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new AuthorizationRequest(list, str, z, z2, account, str2, str3, z3, bundle, z4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthorizationRequest[i];
    }
}

package f7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e implements Parcelable.Creator {
    public static void c(GetCredentialRequest getCredentialRequest, Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.I(parcel, 1, getCredentialRequest.M1(), false);
        y6.c.j(parcel, 2, getCredentialRequest.N1(), false);
        y6.c.E(parcel, 3, getCredentialRequest.O1(), false);
        y6.c.C(parcel, 4, getCredentialRequest.P1(), i, false);
        y6.c.b(parcel, a);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public GetCredentialRequest createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        String str = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                arrayList = y6.b.u(parcel, D, c.CREATOR);
            } else if (w == 2) {
                bundle = y6.b.f(parcel, D);
            } else if (w == 3) {
                str = y6.b.q(parcel, D);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                resultReceiver = (ResultReceiver) y6.b.p(parcel, D, ResultReceiver.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new GetCredentialRequest(arrayList, bundle, str, resultReceiver);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public GetCredentialRequest[] newArray(int i) {
        return new GetCredentialRequest[i];
    }
}

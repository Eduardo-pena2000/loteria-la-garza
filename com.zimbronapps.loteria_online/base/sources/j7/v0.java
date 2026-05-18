package J7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.firebase-auth-api.zzaiz;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class v0 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        String str2 = null;
        zzaiz zzaizVar = null;
        long j = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                str = y6.b.q(parcel, D);
            } else if (w == 2) {
                str2 = y6.b.q(parcel, D);
            } else if (w == 3) {
                j = y6.b.H(parcel, D);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                zzaizVar = (zzaiz) y6.b.p(parcel, D, zzaiz.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new Y(str, str2, j, zzaizVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Y[i];
    }
}

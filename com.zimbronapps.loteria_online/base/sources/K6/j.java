package k6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        a aVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    i = y6.b.F(parcel, D);
                    hashSet.add(1);
                    break;
                case 2:
                    str = y6.b.q(parcel, D);
                    hashSet.add(2);
                    break;
                case 3:
                    i2 = y6.b.F(parcel, D);
                    hashSet.add(3);
                    break;
                case 4:
                    bArr = y6.b.g(parcel, D);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) y6.b.p(parcel, D, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    aVar = (a) y6.b.p(parcel, D, a.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        if (parcel.dataPosition() == M) {
            return new i(hashSet, i, str, i2, bArr, pendingIntent, aVar);
        }
        throw new b.a("Overread allowed size end=" + M, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new i[i];
    }
}

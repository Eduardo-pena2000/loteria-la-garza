package c7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        String str = null;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        float f = 0.0f;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    gameEntity = (GameEntity) y6.b.p(parcel, D, GameEntity.CREATOR);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) y6.b.p(parcel, D, PlayerEntity.CREATOR);
                    break;
                case 3:
                    str = y6.b.q(parcel, D);
                    break;
                case 4:
                default:
                    y6.b.L(parcel, D);
                    break;
                case 5:
                    uri = (Uri) y6.b.p(parcel, D, Uri.CREATOR);
                    break;
                case 6:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 7:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 8:
                    str4 = y6.b.q(parcel, D);
                    break;
                case 9:
                    j = y6.b.H(parcel, D);
                    break;
                case 10:
                    j2 = y6.b.H(parcel, D);
                    break;
                case 11:
                    f = y6.b.B(parcel, D);
                    break;
                case 12:
                    str5 = y6.b.q(parcel, D);
                    break;
                case 13:
                    z = y6.b.x(parcel, D);
                    break;
                case 14:
                    j3 = y6.b.H(parcel, D);
                    break;
                case 15:
                    str6 = y6.b.q(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new i(gameEntity, playerEntity, str, uri, str2, str3, str4, j, j2, f, str5, z, j3, str6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new i[i];
    }
}

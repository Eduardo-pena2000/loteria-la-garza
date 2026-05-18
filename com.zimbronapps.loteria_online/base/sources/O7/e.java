package o7;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class e extends zab implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                zac.zaa(parcel, v6.b.CREATOR);
                zac.zaa(parcel, b.CREATOR);
                zac.zab(parcel);
                break;
            case 4:
                zac.zaa(parcel, Status.CREATOR);
                zac.zab(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                zac.zaa(parcel, Status.CREATOR);
                zac.zab(parcel);
                break;
            case 7:
                zac.zaa(parcel, Status.CREATOR);
                zac.zaa(parcel, GoogleSignInAccount.CREATOR);
                zac.zab(parcel);
                break;
            case 8:
                l lVar = (l) zac.zaa(parcel, l.CREATOR);
                zac.zab(parcel);
                O(lVar);
                break;
            case 9:
                zac.zaa(parcel, h.CREATOR);
                zac.zab(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}

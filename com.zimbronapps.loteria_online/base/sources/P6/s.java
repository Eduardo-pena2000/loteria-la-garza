package p6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zbb;
import com.google.android.gms.internal.auth-api.zbc;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class s extends zbb implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zbc.zba(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbd(parcel);
                t(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbd(parcel);
                V0(status2);
                break;
            case 103:
                Status status3 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbd(parcel);
                c1(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

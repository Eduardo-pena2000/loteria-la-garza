package p6;

import android.os.Parcel;
import com.google.android.gms.internal.auth-api.zbb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class q extends zbb implements r {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            j();
        } else {
            if (i != 2) {
                return false;
            }
            p();
        }
        return true;
    }
}

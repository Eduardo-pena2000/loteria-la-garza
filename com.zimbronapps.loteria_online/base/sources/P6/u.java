package p6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.auth-api.zba;
import com.google.android.gms.internal.auth-api.zbc;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class u extends zba implements IInterface {
    public u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void q1(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbc(zba, tVar);
        zbc.zbb(zba, googleSignInOptions);
        zbb(102, zba);
    }

    public final void r1(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel zba = zba();
        zbc.zbc(zba, tVar);
        zbc.zbb(zba, googleSignInOptions);
        zbb(103, zba);
    }
}

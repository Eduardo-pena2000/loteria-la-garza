package o7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g extends zaa implements IInterface {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void q1(j jVar, f fVar) {
        Parcel zaa = zaa();
        zac.zac(zaa, jVar);
        zac.zad(zaa, fVar);
        zac(12, zaa);
    }
}

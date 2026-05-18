package r7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class u extends a implements w {
    public u(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    public final void M0(Bundle bundle, y yVar) {
        Parcel q1 = q1();
        q.c(q1, bundle);
        q1.writeStrongBinder(yVar);
        r1(2, q1);
    }

    public final void X0(Bundle bundle, y yVar) {
        Parcel q1 = q1();
        q.c(q1, bundle);
        q1.writeStrongBinder(yVar);
        r1(3, q1);
    }

    public final void b(Bundle bundle, F f) {
        Parcel q1 = q1();
        q.c(q1, bundle);
        q1.writeStrongBinder(f);
        r1(6, q1);
    }
}

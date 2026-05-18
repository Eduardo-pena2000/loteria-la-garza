package r7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class z extends a implements B {
    public z(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    public final void a0(Bundle bundle, D d) {
        Parcel q1 = q1();
        q.c(q1, bundle);
        q1.writeStrongBinder(d);
        r1(2, q1);
    }

    public final void b(Bundle bundle, F f) {
        Parcel q1 = q1();
        q.c(q1, bundle);
        q1.writeStrongBinder(f);
        r1(3, q1);
    }
}

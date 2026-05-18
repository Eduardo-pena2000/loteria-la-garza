package k7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class w2 extends com.google.android.gms.common.internal.d {
    public w2(Context context, Looper looper, d.a aVar, d.b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof j2 ? (j2) queryLocalInterface : new g2(iBinder);
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}

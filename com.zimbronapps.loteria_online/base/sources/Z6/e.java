package z6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.A;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.base.zaf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e extends i {
    public final A a;

    public e(Context context, Looper looper, f fVar, A a, com.google.android.gms.common.api.internal.f fVar2, o oVar) {
        super(context, looper, 270, fVar, fVar2, oVar);
        this.a = a;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    public final v6.d[] getApiFeatures() {
        return zaf.zab;
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        return this.a.b();
    }

    public final int getMinApkVersion() {
        return 203400000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean getUseDynamicLookup() {
        return true;
    }
}

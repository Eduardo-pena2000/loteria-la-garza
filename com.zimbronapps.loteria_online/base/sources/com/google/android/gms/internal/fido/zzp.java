package com.google.android.gms.internal.fido;

import P6.b;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.i;
import v6.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzp extends i {
    public zzp(Context context, Looper looper, f fVar, h.b bVar, h.c cVar) {
        super(context, looper, 148, fVar, bVar, cVar);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return queryLocalInterface instanceof zzs ? (zzs) queryLocalInterface : new zzs(iBinder);
    }

    public final d[] getApiFeatures() {
        return new d[]{b.h, b.g};
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    public final int getMinApkVersion() {
        return 13000000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

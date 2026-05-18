package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.i;
import j6.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zbd extends i {
    private final g zba;

    public zbd(Context context, Looper looper, f fVar, g gVar, h.b bVar, h.c cVar) {
        super(context, looper, 68, fVar, bVar, cVar);
        j6.f fVar2 = new j6.f(gVar == null ? g.d : gVar);
        fVar2.a(zbaw.zba());
        this.zba = new g(fVar2);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zbe ? (zbe) queryLocalInterface : new zbe(iBinder);
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba.a();
    }

    public final int getMinApkVersion() {
        return 12800000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}

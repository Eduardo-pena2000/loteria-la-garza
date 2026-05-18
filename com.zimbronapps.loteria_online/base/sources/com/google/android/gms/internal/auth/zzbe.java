package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.i;
import j6.b;
import j6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbe extends i {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, f fVar, c cVar, com.google.android.gms.common.api.internal.f fVar2, o oVar) {
        super(context, looper, 16, fVar, fVar2, oVar);
        this.zze = cVar == null ? new Bundle() : cVar.a();
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbh(iBinder);
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean requiresSignIn() {
        f clientSettings = getClientSettings();
        return (TextUtils.isEmpty(clientSettings.c()) || clientSettings.f(b.a).isEmpty()) ? false : true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

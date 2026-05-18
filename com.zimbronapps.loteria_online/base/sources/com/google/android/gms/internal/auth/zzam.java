package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.i;
import v6.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzam extends i {
    public zzam(Context context, Looper looper, f fVar, h.b bVar, h.c cVar) {
        super(context, looper, 120, fVar, bVar, cVar);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return i6.f.q1(iBinder);
    }

    public final d[] getApiFeatures() {
        return new d[]{h6.h.n};
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

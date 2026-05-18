package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.i;
import h7.a0;
import v6.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class zzi extends i {
    protected final zzbg zze;
    private final String zzf;

    public zzi(Context context, Looper looper, h.b bVar, h.c cVar, String str, f fVar) {
        super(context, looper, 23, fVar, bVar, cVar);
        this.zze = new zzh(this);
        this.zzf = str;
    }

    public static /* synthetic */ void zzp(zzi zziVar) {
        zziVar.checkConnected();
    }

    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof zzam ? (zzam) queryLocalInterface : new zzal(iBinder);
    }

    public final d[] getApiFeatures() {
        return a0.f;
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.zzf);
        return bundle;
    }

    public final int getMinApkVersion() {
        return 11717000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}

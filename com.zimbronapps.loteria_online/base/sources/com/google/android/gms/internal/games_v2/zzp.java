package com.google.android.gms.internal.games_v2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzp extends i {
    private final zzi zze;

    public zzp(Context context, Looper looper, f fVar, zzi zziVar, com.google.android.gms.common.api.internal.f fVar2, o oVar) {
        super(context, looper, 1, fVar, fVar2, oVar);
        this.zze = zziVar;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.connect.IGamesConnectService");
        return queryLocalInterface instanceof zzw ? (zzw) queryLocalInterface : new zzw(iBinder);
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        zzi zziVar = this.zze;
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", zziVar.zza);
        bundle.putString("com.google.android.gms.games.key.gamePackageName", zziVar.zzb);
        return bundle;
    }

    public final int getMinApkVersion() {
        return 213000000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.connect.IGamesConnectService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.games.internal.connect.service.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}

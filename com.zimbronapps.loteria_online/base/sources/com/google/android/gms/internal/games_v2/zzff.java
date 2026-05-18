package com.google.android.gms.internal.games_v2;

import T6.z;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.i;
import v6.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzff extends i {
    public zzff(Context context, Looper looper, f fVar, com.google.android.gms.common.api.internal.f fVar2, o oVar) {
        super(context, looper, 1, fVar, fVar2, oVar);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return zzak.zzb(iBinder);
    }

    public final d[] getApiFeatures() {
        return new d[]{z.e};
    }

    public final int getMinApkVersion() {
        return 223600000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.recall.IRecallService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.games.internal.recall.service.START";
    }
}

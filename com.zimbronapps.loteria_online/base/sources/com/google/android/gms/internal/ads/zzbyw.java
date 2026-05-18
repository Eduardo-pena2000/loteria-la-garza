package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbyw extends R5.c {
    public zzbyw(Context context, Looper looper, d.a aVar, d.b bVar) {
        super(zzcae.zza(context), looper, 8, aVar, bVar, null);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof zzbzh ? (zzbzh) queryLocalInterface : new zzbzf(iBinder);
    }

    public final int getMinApkVersion() {
        return 250934000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    public final zzbzh zzp() throws DeadObjectException {
        return (zzbzh) super.getService();
    }
}

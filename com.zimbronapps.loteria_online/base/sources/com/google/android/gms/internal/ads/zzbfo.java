package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbfo extends R5.c {
    public zzbfo(Context context, Looper looper, d.a aVar, d.b bVar) {
        super(zzcae.zza(context), looper, 123, aVar, bVar, null);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof zzbfr ? (zzbfr) queryLocalInterface : new zzbfr(iBinder);
    }

    public final v6.d[] getApiFeatures() {
        return L5.K.b;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        return ((Boolean) S5.D.c().zzd(zzbhe.zzcw)).booleanValue() && E6.b.b(getAvailableFeatures(), L5.K.a);
    }

    public final zzbfr zzq() throws DeadObjectException {
        return (zzbfr) super.getService();
    }
}

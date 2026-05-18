package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class i0 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ d b;

    public i0(d dVar, int i) {
        Objects.requireNonNull(dVar);
        this.b = dVar;
        this.a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d dVar = this.b;
        if (iBinder == null) {
            dVar.zzf(16);
            return;
        }
        synchronized (dVar.zzh()) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                dVar.zzi((queryLocalInterface == null || !(queryLocalInterface instanceof o)) ? new X(iBinder) : (o) queryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.zzb(0, null, this.a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.b;
        synchronized (dVar.zzh()) {
            dVar.zzi(null);
        }
        d dVar2 = this.b;
        int i = this.a;
        Handler handler = dVar2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}

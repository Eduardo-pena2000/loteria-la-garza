package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.d;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j0 extends W {
    public final IBinder g;
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(d dVar, int i, IBinder iBinder, Bundle bundle) {
        super(dVar, i, bundle);
        Objects.requireNonNull(dVar);
        this.h = dVar;
        this.g = iBinder;
    }

    public final boolean e() {
        try {
            IBinder iBinder = this.g;
            t.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            d dVar = this.h;
            if (!dVar.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = dVar.getServiceDescriptor();
                StringBuilder sb = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(serviceDescriptor);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface createServiceInterface = dVar.createServiceInterface(this.g);
            if (createServiceInterface == null || !(dVar.zze(2, 4, createServiceInterface) || dVar.zze(3, 4, createServiceInterface))) {
                return false;
            }
            dVar.zzn(null);
            d.a zzk = dVar.zzk();
            Bundle connectionHint = dVar.getConnectionHint();
            if (zzk == null) {
                return true;
            }
            dVar.zzk().onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    public final void f(v6.b bVar) {
        d dVar = this.h;
        if (dVar.zzl() != null) {
            dVar.zzl().onConnectionFailed(bVar);
        }
        dVar.onConnectionFailed(bVar);
    }
}

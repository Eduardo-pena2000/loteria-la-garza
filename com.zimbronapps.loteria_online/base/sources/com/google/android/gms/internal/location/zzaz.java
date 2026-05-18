package com.google.android.gms.internal.location;

import E6.b;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import h7.P;
import h7.a0;
import h7.d;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaz extends zzi {
    private final zzav zzf;

    public zzaz(Context context, Looper looper, h.b bVar, h.c cVar, String str, f fVar) {
        super(context, looper, bVar, cVar, str, fVar);
        this.zzf = new zzav(context, this.zze);
    }

    public final void disconnect() {
        synchronized (this.zzf) {
            if (isConnected()) {
                try {
                    this.zzf.zzn();
                    this.zzf.zzo();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
                super/*com.google.android.gms.common.internal.d*/.disconnect();
            } else {
                super/*com.google.android.gms.common.internal.d*/.disconnect();
            }
        }
    }

    public final boolean usesClientTelemetry() {
        return true;
    }

    public final LocationAvailability zzA() throws RemoteException {
        return this.zzf.zzc();
    }

    public final void zzB(zzba zzbaVar, l lVar, zzai zzaiVar) throws RemoteException {
        synchronized (this.zzf) {
            this.zzf.zze(zzbaVar, lVar, zzaiVar);
        }
    }

    public final void zzC(LocationRequest locationRequest, l lVar, zzai zzaiVar) throws RemoteException {
        synchronized (this.zzf) {
            this.zzf.zzd(locationRequest, lVar, zzaiVar);
        }
    }

    public final void zzD(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzf(zzbaVar, pendingIntent, zzaiVar);
    }

    public final void zzE(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzg(locationRequest, pendingIntent, zzaiVar);
    }

    public final void zzF(l.a aVar, zzai zzaiVar) throws RemoteException {
        this.zzf.zzh(aVar, zzaiVar);
    }

    public final void zzG(PendingIntent pendingIntent, zzai zzaiVar) throws RemoteException {
        this.zzf.zzj(pendingIntent, zzaiVar);
    }

    public final void zzH(l.a aVar, zzai zzaiVar) throws RemoteException {
        this.zzf.zzi(aVar, zzaiVar);
    }

    public final void zzI(boolean z) throws RemoteException {
        this.zzf.zzk(z);
    }

    public final void zzJ(Location location) throws RemoteException {
        this.zzf.zzl(location);
    }

    public final void zzK(zzai zzaiVar) throws RemoteException {
        this.zzf.zzm(zzaiVar);
    }

    public final void zzL(h7.l lVar, e eVar, String str) throws RemoteException {
        checkConnected();
        t.b(lVar != null, "locationSettingsRequest can't be null nor empty.");
        t.b(eVar != null, "listener can't be null.");
        ((zzam) getService()).zzt(lVar, new zzay(eVar), null);
    }

    public final void zzq(long j, PendingIntent pendingIntent) throws RemoteException {
        checkConnected();
        t.l(pendingIntent);
        t.b(j >= 0, "detectionIntervalMillis must be >= 0");
        ((zzam) getService()).zzh(j, true, pendingIntent);
    }

    public final void zzr(d dVar, PendingIntent pendingIntent, e eVar) throws RemoteException {
        checkConnected();
        t.m(dVar, "activityTransitionRequest must be specified.");
        t.m(pendingIntent, "PendingIntent must be specified.");
        t.m(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzi(dVar, pendingIntent, new com.google.android.gms.common.api.internal.t(eVar));
    }

    public final void zzs(PendingIntent pendingIntent, e eVar) throws RemoteException {
        checkConnected();
        t.m(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzj(pendingIntent, new com.google.android.gms.common.api.internal.t(eVar));
    }

    public final void zzt(PendingIntent pendingIntent) throws RemoteException {
        checkConnected();
        t.l(pendingIntent);
        ((zzam) getService()).zzk(pendingIntent);
    }

    public final void zzu(PendingIntent pendingIntent, e eVar) throws RemoteException {
        checkConnected();
        t.m(pendingIntent, "PendingIntent must be specified.");
        t.m(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzl(pendingIntent, new com.google.android.gms.common.api.internal.t(eVar));
    }

    public final void zzv(h7.h hVar, PendingIntent pendingIntent, e eVar) throws RemoteException {
        checkConnected();
        t.m(hVar, "geofencingRequest can't be null.");
        t.m(pendingIntent, "PendingIntent must be specified.");
        t.m(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzd(hVar, pendingIntent, new zzaw(eVar));
    }

    public final void zzw(P p, e eVar) throws RemoteException {
        checkConnected();
        t.m(p, "removeGeofencingRequest can't be null.");
        t.m(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzg(p, new zzax(eVar));
    }

    public final void zzx(PendingIntent pendingIntent, e eVar) throws RemoteException {
        checkConnected();
        t.m(pendingIntent, "PendingIntent must be specified.");
        t.m(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zze(pendingIntent, new zzax(eVar), getContext().getPackageName());
    }

    public final void zzy(List list, e eVar) throws RemoteException {
        checkConnected();
        t.b(list != null && list.size() > 0, "geofenceRequestIds can't be null nor empty.");
        t.m(eVar, "ResultHolder not provided.");
        ((zzam) getService()).zzf((String[]) list.toArray(new String[0]), new zzax(eVar), getContext().getPackageName());
    }

    public final Location zzz(String str) throws RemoteException {
        return b.b(getAvailableFeatures(), a0.c) ? this.zzf.zza(str) : this.zzf.zzb();
    }
}

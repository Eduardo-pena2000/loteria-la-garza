package com.google.android.gms.internal.drive;

import E6.w;
import I6.b;
import I6.o;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.drive.DriveId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaw extends i {
    private final String zzeb;
    protected final boolean zzec;
    private volatile DriveId zzed;
    private volatile DriveId zzee;
    private volatile boolean zzef;

    @VisibleForTesting
    private final Map zzeg;

    @VisibleForTesting
    private final Map zzeh;

    @VisibleForTesting
    private final Map zzei;

    @VisibleForTesting
    private final Map zzej;
    private final Bundle zzz;

    public zzaw(Context context, Looper looper, f fVar, h.b bVar, h.c cVar, Bundle bundle) {
        super(context, looper, 11, fVar, bVar, cVar);
        this.zzef = false;
        this.zzeg = new HashMap();
        this.zzeh = new HashMap();
        this.zzei = new HashMap();
        this.zzej = new HashMap();
        this.zzeb = fVar.h();
        this.zzz = bundle;
        Intent intent = new Intent("com.google.android.gms.drive.events.HANDLE_EVENT");
        intent.setPackage(context.getPackageName());
        List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        int size = queryIntentServices.size();
        if (size == 0) {
            this.zzec = false;
            return;
        }
        if (size != 1) {
            String action = intent.getAction();
            StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 72);
            sb.append("AndroidManifest.xml can only define one service that handles the ");
            sb.append(action);
            sb.append(" action");
            throw new IllegalStateException(sb.toString());
        }
        ServiceInfo serviceInfo = ((ResolveInfo) queryIntentServices.get(0)).serviceInfo;
        if (serviceInfo.exported) {
            this.zzec = true;
            return;
        }
        String str = serviceInfo.name;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 60);
        sb2.append("Drive event service ");
        sb2.append(str);
        sb2.append(" must be exported in AndroidManifest.xml");
        throw new IllegalStateException(sb2.toString());
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
        return queryLocalInterface instanceof zzeo ? (zzeo) queryLocalInterface : new zzep(iBinder);
    }

    public final void disconnect() {
        if (isConnected()) {
            try {
                ((zzeo) getService()).zza(new zzad());
            } catch (RemoteException unused) {
            }
        }
        super/*com.google.android.gms.common.internal.d*/.disconnect();
        synchronized (this.zzeg) {
            this.zzeg.clear();
        }
        synchronized (this.zzeh) {
            this.zzeh.clear();
        }
        synchronized (this.zzei) {
            this.zzei.clear();
        }
        synchronized (this.zzej) {
            this.zzej.clear();
        }
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        String packageName = getContext().getPackageName();
        t.l(packageName);
        t.o(!getClientSettings().e().isEmpty());
        Bundle bundle = new Bundle();
        if (!packageName.equals(this.zzeb)) {
            bundle.putString("proxy_package_name", this.zzeb);
        }
        bundle.putAll(this.zzz);
        return bundle;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.drive.ApiService.START";
    }

    public final void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (bundle != null) {
            bundle.setClassLoader(zzaw.class.getClassLoader());
            this.zzed = bundle.getParcelable("com.google.android.gms.drive.root_id");
            this.zzee = bundle.getParcelable("com.google.android.gms.drive.appdata_id");
            this.zzef = true;
        }
        super/*com.google.android.gms.common.internal.d*/.onPostInitHandler(i, iBinder, bundle, i2);
    }

    public final boolean requiresAccount() {
        return true;
    }

    public final boolean requiresSignIn() {
        return (getContext().getPackageName().equals(this.zzeb) && w.a(getContext(), Process.myUid())) ? false : true;
    }

    public final com.google.android.gms.common.api.i zza(h hVar, DriveId driveId, b bVar) {
        t.a(o.a(1, driveId));
        t.m(bVar, "listener");
        t.p(isConnected(), "Client must be connected");
        synchronized (this.zzeg) {
            try {
                HashMap hashMap = (Map) this.zzeg.get(driveId);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    this.zzeg.put(driveId, hashMap);
                }
                zzee zzeeVar = (zzee) hashMap.get(bVar);
                if (zzeeVar == null) {
                    zzeeVar = new zzee(getLooper(), getContext(), 1, bVar);
                    hashMap.put(bVar, zzeeVar);
                } else if (zzeeVar.zzg(1)) {
                    return new zzat(hVar, Status.f);
                }
                zzeeVar.zzf(1);
                return hVar.b(new zzax(this, hVar, new zzj(1, driveId), zzeeVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final DriveId zzae() {
        return this.zzed;
    }

    public final DriveId zzaf() {
        return this.zzee;
    }

    public final boolean zzag() {
        return this.zzef;
    }

    public final boolean zzah() {
        return this.zzec;
    }

    public final com.google.android.gms.common.api.i zzb(h hVar, DriveId driveId, b bVar) {
        t.a(o.a(1, driveId));
        t.p(isConnected(), "Client must be connected");
        t.m(bVar, "listener");
        synchronized (this.zzeg) {
            try {
                Map map = (Map) this.zzeg.get(driveId);
                if (map == null) {
                    return new zzat(hVar, Status.f);
                }
                zzee zzeeVar = (zzee) map.remove(bVar);
                if (zzeeVar == null) {
                    return new zzat(hVar, Status.f);
                }
                if (map.isEmpty()) {
                    this.zzeg.remove(driveId);
                }
                return hVar.b(new zzay(this, hVar, new zzgs(driveId, 1), zzeeVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class d extends BasePendingResult implements e {
    private final com.google.android.gms.common.api.a api;
    private final a.c clientKey;

    public d(a.c cVar, com.google.android.gms.common.api.h hVar) {
        super((com.google.android.gms.common.api.h) com.google.android.gms.common.internal.t.m(hVar, "GoogleApiClient must not be null"));
        this.clientKey = (a.c) com.google.android.gms.common.internal.t.l(cVar);
        this.api = null;
    }

    public final void c(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    public abstract void doExecute(a.b bVar) throws RemoteException;

    public final com.google.android.gms.common.api.a getApi() {
        return this.api;
    }

    public final a.c getClientKey() {
        return this.clientKey;
    }

    public void onSetFailedResult(com.google.android.gms.common.api.m mVar) {
    }

    public final void run(a.b bVar) throws DeadObjectException {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e) {
            c(e);
            throw e;
        } catch (RemoteException e2) {
            c(e2);
        }
    }

    public final void setFailedResult(Status status) {
        com.google.android.gms.common.internal.t.b(!status.R1(), "Failed result must not be success");
        com.google.android.gms.common.api.m createFailedResult = createFailedResult(status);
        setResult(createFailedResult);
        onSetFailedResult(createFailedResult);
    }

    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((com.google.android.gms.common.api.m) obj);
    }

    public d(com.google.android.gms.common.api.a aVar, com.google.android.gms.common.api.h hVar) {
        super((com.google.android.gms.common.api.h) com.google.android.gms.common.internal.t.m(hVar, "GoogleApiClient must not be null"));
        com.google.android.gms.common.internal.t.m(aVar, "Api must not be null");
        this.clientKey = aVar.b();
        this.api = aVar;
    }
}

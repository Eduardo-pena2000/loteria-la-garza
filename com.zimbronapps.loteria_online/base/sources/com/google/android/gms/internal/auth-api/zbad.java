package com.google.android.gms.internal.auth-api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Task;
import l6.a;
import l6.b;
import l6.p;
import y6.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zbad extends g implements a {
    private static final a.g zba;
    private static final a.a zbb;
    private static final com.google.android.gms.common.api.a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbw zbwVar = new zbw();
        zbb = zbwVar;
        zbc = new com.google.android.gms.common.api.a("Auth.Api.Identity.Authorization.API", zbwVar, gVar);
    }

    public zbad(Activity activity, p pVar) {
        super(activity, zbc, pVar, g.a.c);
        this.zbd = zbaw.zba();
    }

    public final Task authorize(AuthorizationRequest authorizationRequest) {
        t.l(authorizationRequest);
        AuthorizationRequest.a V1 = AuthorizationRequest.V1(authorizationRequest);
        V1.i(this.zbd);
        return doRead(w.builder().d(zbav.zbc).b(new zbac(this, V1.b())).c(false).e(1534).a());
    }

    public final Task clearToken(ClearTokenRequest clearTokenRequest) {
        t.l(clearTokenRequest);
        ClearTokenRequest.a P1 = clearTokenRequest.P1();
        P1.c(this.zbd);
        return doWrite(w.builder().d(zbav.zbe).b(new zbab(this, P1.a())).c(true).e(1721).a());
    }

    public final b getAuthorizationResultFromIntent(Intent intent) throws com.google.android.gms.common.api.b {
        if (intent == null) {
            throw new com.google.android.gms.common.api.b(Status.h);
        }
        Status status = (Status) e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new com.google.android.gms.common.api.b(Status.j);
        }
        if (!status.R1()) {
            throw new com.google.android.gms.common.api.b(status);
        }
        b bVar = (b) e.b(intent, "authorization_result", b.CREATOR);
        if (bVar != null) {
            return bVar;
        }
        throw new com.google.android.gms.common.api.b(Status.h);
    }

    public final Task revokeAccess(RevokeAccessRequest revokeAccessRequest) {
        t.l(revokeAccessRequest);
        RevokeAccessRequest.a Q1 = revokeAccessRequest.Q1();
        Q1.d(this.zbd);
        return doWrite(w.builder().d(zbav.zbd).b(new zbaa(this, Q1.a())).c(true).e(1721).a());
    }

    public zbad(Context context, p pVar) {
        super(context, zbc, pVar, g.a.c);
        this.zbd = zbaw.zba();
    }
}

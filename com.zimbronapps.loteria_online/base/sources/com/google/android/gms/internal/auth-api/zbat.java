package com.google.android.gms.internal.auth-api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import l6.J;
import l6.c;
import l6.h;
import l6.m;
import l6.n;
import v6.d;
import y6.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zbat extends g implements m {
    private static final a.g zba;
    private static final a.a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbak zbakVar = new zbak();
        zbb = zbakVar;
        zbc = new a("Auth.Api.Identity.SignIn.API", zbakVar, gVar);
    }

    public zbat(Activity activity, J j) {
        super(activity, zbc, j, g.a.c);
        this.zbd = zbaw.zba();
    }

    public final Task beginSignIn(c cVar) {
        t.l(cVar);
        c.a T1 = c.T1(cVar);
        T1.h(this.zbd);
        return doRead(w.builder().d(new d("auth_api_credentials_begin_sign_in", 8L)).b(new zbas(this, T1.a())).c(false).e(1553).a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) throws b {
        if (intent == null) {
            throw new b(Status.h);
        }
        Status status = (Status) e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new b(Status.j);
        }
        if (!status.R1()) {
            throw new b(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new b(Status.h);
    }

    public final Task getPhoneNumberHintIntent(l6.g gVar) {
        t.l(gVar);
        return doRead(w.builder().d(zbav.zbi).b(new zbar(this, gVar)).e(1653).a());
    }

    public final n getSignInCredentialFromIntent(Intent intent) throws b {
        if (intent == null) {
            throw new b(Status.h);
        }
        Status status = (Status) e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new b(Status.j);
        }
        if (!status.R1()) {
            throw new b(status);
        }
        n nVar = (n) e.b(intent, "sign_in_credential", n.CREATOR);
        if (nVar != null) {
            return nVar;
        }
        throw new b(Status.h);
    }

    public final Task getSignInIntent(h hVar) {
        t.l(hVar);
        h.a S1 = h.S1(hVar);
        S1.g(this.zbd);
        return doRead(w.builder().d(zbav.zbg).b(new zbaq(this, S1.a())).e(1555).a());
    }

    public final Task signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator it = com.google.android.gms.common.api.h.c().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.h) it.next()).i();
        }
        com.google.android.gms.common.api.internal.g.a();
        return doWrite(w.builder().d(zbav.zbb).b(new zbap(this)).c(false).e(1554).a());
    }

    public final /* synthetic */ void zba(zbau zbauVar, TaskCompletionSource taskCompletionSource) {
        zbam zbamVar = new zbam(this, taskCompletionSource);
        ((zbv) zbauVar.getService()).zbd(zbamVar, this.zbd, zbaz.zba(zbauVar.getContext()));
    }

    public final /* synthetic */ void zbb(l6.g gVar, zbau zbauVar, TaskCompletionSource taskCompletionSource) {
        zbao zbaoVar = new zbao(this, taskCompletionSource);
        ((zbv) zbauVar.getService()).zbf(zbaoVar, gVar, this.zbd, zbaz.zba(zbauVar.getContext()));
    }

    public zbat(Context context, J j) {
        super(context, zbc, j, g.a.c);
        this.zbd = zbaw.zba();
    }
}

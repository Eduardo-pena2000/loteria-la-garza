package com.google.android.gms.internal.auth-api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Task;
import l6.f;
import l6.k;
import l6.w;
import y6.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zbaj extends g implements f {
    private static final a.g zba;
    private static final a.a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbae zbaeVar = new zbae();
        zbb = zbaeVar;
        zbc = new a("Auth.Api.Identity.CredentialSaving.API", zbaeVar, gVar);
    }

    public zbaj(Activity activity, w wVar) {
        super(activity, zbc, wVar, g.a.c);
        this.zbd = zbaw.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        if (intent == null) {
            return Status.h;
        }
        Status status = (Status) e.b(intent, "status", Status.CREATOR);
        return status == null ? Status.h : status;
    }

    public final Task saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        t.l(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.a R1 = SaveAccountLinkingTokenRequest.R1(saveAccountLinkingTokenRequest);
        R1.f(this.zbd);
        return doRead(com.google.android.gms.common.api.internal.w.builder().d(zbav.zbh).b(new zbai(this, R1.a())).c(false).e(1535).a());
    }

    public final Task savePassword(k kVar) {
        t.l(kVar);
        k.a O1 = k.O1(kVar);
        O1.d(this.zbd);
        return doRead(com.google.android.gms.common.api.internal.w.builder().d(zbav.zbf).b(new zbah(this, O1.a())).c(false).e(1536).a());
    }

    public zbaj(Context context, w wVar) {
        super(context, zbc, wVar, g.a.c);
        this.zbd = zbaw.zba();
    }
}

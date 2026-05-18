package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class i extends d implements a.f {
    private static volatile Executor zaa;
    private final f zab;
    private final Set zac;
    private final Account zad;

    public i(Context context, Looper looper, int i, f fVar, h.b bVar, h.c cVar) {
        this(context, looper, i, fVar, (com.google.android.gms.common.api.internal.f) bVar, (com.google.android.gms.common.api.internal.o) cVar);
    }

    public final Set d(Set set) {
        Set validateScopes = validateScopes(set);
        Iterator it = validateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    public final Account getAccount() {
        return this.zad;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public final f getClientSettings() {
        return this.zab;
    }

    public v6.d[] getRequiredFeatures() {
        return new v6.d[0];
    }

    public final Set getScopes() {
        return this.zac;
    }

    public Set getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    public Set validateScopes(Set set) {
        return set;
    }

    public i(Context context, Looper looper, int i, f fVar, com.google.android.gms.common.api.internal.f fVar2, com.google.android.gms.common.api.internal.o oVar) {
        this(context, looper, j.a(context), v6.g.o(), i, fVar, (com.google.android.gms.common.api.internal.f) t.l(fVar2), (com.google.android.gms.common.api.internal.o) t.l(oVar));
    }

    public i(Context context, Looper looper, j jVar, v6.g gVar, int i, f fVar, com.google.android.gms.common.api.internal.f fVar2, com.google.android.gms.common.api.internal.o oVar) {
        super(context, looper, jVar, gVar, i, fVar2 == null ? null : new J(fVar2), oVar == null ? null : new K(oVar), fVar.m());
        this.zab = fVar;
        this.zad = fVar.b();
        this.zac = d(fVar.e());
    }
}

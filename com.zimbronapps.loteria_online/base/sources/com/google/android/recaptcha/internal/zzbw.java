package com.google.android.recaptcha.internal;

import Ga.e;
import Ga.i;
import Qa.l;
import Qa.p;
import Ya.h;
import cb.B0;
import cb.W;
import cb.g0;
import cb.u;
import cb.w;
import cb.x;
import java.util.concurrent.CancellationException;
import kb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbw implements W {
    private final /* synthetic */ x zza;

    public zzbw(x xVar) {
        this.zza = xVar;
    }

    public final u attachChild(w wVar) {
        return this.zza.attachChild(wVar);
    }

    public final Object await(e eVar) {
        return this.zza.await(eVar);
    }

    @Ca.e
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    public final Object fold(Object obj, p pVar) {
        return this.zza.fold(obj, pVar);
    }

    public final i.b get(i.c cVar) {
        return this.zza.get(cVar);
    }

    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    public final h getChildren() {
        return this.zza.getChildren();
    }

    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    public final i.c getKey() {
        return this.zza.getKey();
    }

    public final f getOnAwait() {
        return this.zza.getOnAwait();
    }

    public final kb.d getOnJoin() {
        return this.zza.getOnJoin();
    }

    public final B0 getParent() {
        return this.zza.getParent();
    }

    public final g0 invokeOnCompletion(l lVar) {
        return this.zza.invokeOnCompletion(lVar);
    }

    public final boolean isActive() {
        return this.zza.isActive();
    }

    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    public final Object join(e eVar) {
        return this.zza.join(eVar);
    }

    public final i minusKey(i.c cVar) {
        return this.zza.minusKey(cVar);
    }

    public final i plus(i iVar) {
        return this.zza.plus(iVar);
    }

    public final boolean start() {
        return this.zza.start();
    }

    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    public final g0 invokeOnCompletion(boolean z, boolean z2, l lVar) {
        return this.zza.invokeOnCompletion(z, z2, lVar);
    }

    @Ca.e
    public final B0 plus(B0 b0) {
        return this.zza.plus(b0);
    }

    @Ca.e
    public final /* synthetic */ boolean cancel(Throwable th) {
        return this.zza.cancel(th);
    }
}

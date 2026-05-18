package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class BasePendingResult extends com.google.android.gms.common.api.i {
    static final ThreadLocal zaa = new u0();
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private w0 resultGuardian;
    protected final a zab;
    protected final WeakReference zac;
    private com.google.android.gms.common.api.n zah;
    private com.google.android.gms.common.api.m zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private com.google.android.gms.common.internal.m zao;
    private volatile j0 zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    public static class a extends zau {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(com.google.android.gms.common.api.n nVar, com.google.android.gms.common.api.m mVar) {
            int i = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((com.google.android.gms.common.api.n) com.google.android.gms.common.internal.t.l(nVar), mVar)));
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.i);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.n nVar = (com.google.android.gms.common.api.n) pair.first;
            com.google.android.gms.common.api.m mVar = (com.google.android.gms.common.api.m) pair.second;
            try {
                nVar.onResult(mVar);
            } catch (RuntimeException e) {
                BasePendingResult.zal(mVar);
                throw e;
            }
        }
    }

    public BasePendingResult(com.google.android.gms.common.api.h hVar) {
        this.zab = new a(hVar != null ? hVar.f() : Looper.getMainLooper());
        this.zac = new WeakReference(hVar);
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.m zaj(BasePendingResult basePendingResult) {
        return basePendingResult.zaj;
    }

    public static void zal(com.google.android.gms.common.api.m mVar) {
        if (mVar instanceof com.google.android.gms.common.api.k) {
            try {
                ((com.google.android.gms.common.api.k) mVar).release();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(mVar)), e);
            }
        }
    }

    public final com.google.android.gms.common.api.m a() {
        com.google.android.gms.common.api.m mVar;
        synchronized (this.zae) {
            com.google.android.gms.common.internal.t.p(!this.zal, "Result has already been consumed.");
            com.google.android.gms.common.internal.t.p(isReady(), "Result is not ready.");
            mVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        android.support.v4.media.session.b.a(this.zai.getAndSet((Object) null));
        return (com.google.android.gms.common.api.m) com.google.android.gms.common.internal.t.l(mVar);
    }

    public final void addStatusListener(i.a aVar) {
        com.google.android.gms.common.internal.t.b(aVar != null, "Callback cannot be null.");
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    aVar.a(this.zak);
                } else {
                    this.zag.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final com.google.android.gms.common.api.m await() {
        com.google.android.gms.common.internal.t.k("await must not be called on the UI thread");
        com.google.android.gms.common.internal.t.p(!this.zal, "Result has already been consumed");
        com.google.android.gms.common.internal.t.p(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.g);
        }
        com.google.android.gms.common.internal.t.p(isReady(), "Result is not ready.");
        return a();
    }

    public final void b(com.google.android.gms.common.api.m mVar) {
        this.zaj = mVar;
        this.zak = mVar.getStatus();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.n nVar = this.zah;
            if (nVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(nVar, a());
            } else if (this.zaj instanceof com.google.android.gms.common.api.k) {
                this.resultGuardian = new w0(this, null);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((i.a) arrayList.get(i)).a(this.zak);
        }
        this.zag.clear();
    }

    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                com.google.android.gms.common.internal.m mVar = this.zao;
                if (mVar != null) {
                    try {
                        mVar.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zal(this.zaj);
                this.zam = true;
                b(createFailedResult(Status.j));
            }
        }
    }

    public abstract com.google.android.gms.common.api.m createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z;
        synchronized (this.zae) {
            z = this.zam;
        }
        return z;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(com.google.android.gms.common.internal.m mVar) {
        synchronized (this.zae) {
            this.zao = mVar;
        }
    }

    public final void setResult(com.google.android.gms.common.api.m mVar) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(mVar);
                    return;
                }
                isReady();
                com.google.android.gms.common.internal.t.p(!isReady(), "Results have already been set");
                com.google.android.gms.common.internal.t.p(!this.zal, "Result has already been consumed");
                b(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.n nVar) {
        synchronized (this.zae) {
            try {
                if (nVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z = true;
                com.google.android.gms.common.internal.t.p(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z = false;
                }
                com.google.android.gms.common.internal.t.p(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(nVar, a());
                } else {
                    this.zah = nVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.android.gms.common.api.p then(com.google.android.gms.common.api.o oVar) {
        com.google.android.gms.common.api.p a2;
        com.google.android.gms.common.internal.t.p(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            try {
                com.google.android.gms.common.internal.t.p(this.zap == null, "Cannot call then() twice.");
                com.google.android.gms.common.internal.t.p(this.zah == null, "Cannot call then() if callbacks are set.");
                com.google.android.gms.common.internal.t.p(!this.zam, "Cannot call then() if result was canceled.");
                this.zaq = true;
                this.zap = new j0(this.zac);
                a2 = this.zap.a(oVar);
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a2;
    }

    public final void zak() {
        boolean z = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z = false;
        }
        this.zaq = z;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            try {
                if (((com.google.android.gms.common.api.h) this.zac.get()) == null || !this.zaq) {
                    cancel();
                }
                isCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return isCanceled;
    }

    public final void zan(k0 k0Var) {
        this.zai.set(k0Var);
    }

    @ResultIgnorabilityUnspecified
    public final com.google.android.gms.common.api.m await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            com.google.android.gms.common.internal.t.k("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.t.p(!this.zal, "Result has already been consumed.");
        com.google.android.gms.common.internal.t.p(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j, timeUnit)) {
                forceFailureUnlessReady(Status.i);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.g);
        }
        com.google.android.gms.common.internal.t.p(isReady(), "Result is not ready.");
        return a();
    }

    public final void setResultCallback(com.google.android.gms.common.api.n nVar, long j, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (nVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z = true;
                com.google.android.gms.common.internal.t.p(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z = false;
                }
                com.google.android.gms.common.internal.t.p(z, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(nVar, a());
                } else {
                    this.zah = nVar;
                    a aVar = this.zab;
                    aVar.sendMessageDelayed(aVar.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

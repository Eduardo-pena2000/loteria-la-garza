package com.applovin.adview;

import androidx.lifecycle.C;
import androidx.lifecycle.k;
import androidx.lifecycle.q;
import com.applovin.impl.n2;
import com.applovin.impl.w1;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinFullscreenAdViewObserver implements q {
    private final k a;
    private n2 b;
    private final AtomicBoolean c = new AtomicBoolean(true);
    private w1 d;

    public AppLovinFullscreenAdViewObserver(k kVar, n2 n2Var) {
        this.a = kVar;
        this.b = n2Var;
        kVar.addObserver(this);
    }

    @C(k.a.ON_DESTROY)
    public void onDestroy() {
        this.a.removeObserver(this);
        n2 n2Var = this.b;
        if (n2Var != null) {
            n2Var.a();
            this.b = null;
        }
        w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.a("lifecycle_on_destroy");
            this.d.r();
            this.d = null;
        }
    }

    @C(k.a.ON_PAUSE)
    public void onPause() {
        w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.s();
            this.d.v();
        }
    }

    @C(k.a.ON_RESUME)
    public void onResume() {
        w1 w1Var;
        if (this.c.getAndSet(false) || (w1Var = this.d) == null) {
            return;
        }
        w1Var.t();
        this.d.b(0L);
    }

    @C(k.a.ON_STOP)
    public void onStop() {
        w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.u();
        }
    }

    public void setPresenter(w1 w1Var) {
        this.d = w1Var;
    }
}

package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.c3;
import com.applovin.impl.n7;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a extends com.applovin.impl.b {
    private final com.applovin.impl.c a;
    private final com.applovin.impl.sdk.o b;
    private final String c;
    private a d;
    private c3 e;
    private String f;

    public interface a {
        void b(c3 c3Var);
    }

    public a(com.applovin.impl.sdk.k kVar) {
        this.b = kVar.O();
        this.a = kVar.e();
        this.c = n7.a(com.applovin.impl.sdk.k.o(), "AdActivityObserver", kVar);
    }

    public void a(c3 c3Var, a aVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("AdActivityObserver", "Starting for ad " + c3Var.getAdUnitId() + "...");
        }
        a();
        this.d = aVar;
        this.e = c3Var;
        this.a.a(this);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.c) && this.e.y0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.a("AdActivityObserver", "Invoking callback...");
                }
                this.d.b(this.e);
            }
            a();
            return;
        }
        if (this.f == null) {
            this.f = activity.getClass().getName();
            if (com.applovin.impl.sdk.o.a()) {
                this.b.a("AdActivityObserver", "Started tracking ad Activity: " + this.f);
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.a("AdActivityObserver", "Ad Activity destroyed: " + this.f);
            }
            if (this.d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.a("AdActivityObserver", "Invoking callback...");
                }
                this.d.b(this.e);
            }
            a();
        }
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("AdActivityObserver", "Cancelling...");
        }
        this.a.b(this);
        this.d = null;
        this.e = null;
        this.f = null;
    }
}

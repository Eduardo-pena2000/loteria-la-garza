package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.k0;
import com.applovin.impl.n7;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class CmpServiceImpl implements AppLovinCmpService, a.a {
    private final k a;
    private AppLovinCmpError e;
    private e f;
    private f g;
    private final Object c = new Object();
    private d d = d.NONE;
    private final com.applovin.impl.privacy.cmp.a b = c();

    public class a implements e {
        final /* synthetic */ AppLovinCmpService.OnCompletedListener a;
        final /* synthetic */ Activity b;

        public class a implements f {
            public a() {
            }

            public void a(AppLovinCmpError appLovinCmpError) {
                a.this.a.onCompleted(appLovinCmpError);
            }
        }

        public a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.a = onCompletedListener;
            this.b = activity;
        }

        public void a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.b, new a());
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        public void run() {
            CmpServiceImpl.b(CmpServiceImpl.this).b(this.a, CmpServiceImpl.a(CmpServiceImpl.this), CmpServiceImpl.this);
        }
    }

    public class c implements Runnable {
        final /* synthetic */ Activity a;

        public c(Activity activity) {
            this.a = activity;
        }

        public void run() {
            CmpServiceImpl.b(CmpServiceImpl.this).a(this.a, CmpServiceImpl.a(CmpServiceImpl.this), CmpServiceImpl.this);
        }
    }

    public enum d {
        NONE,
        LOADING,
        COMPLETED
    }

    public interface e {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public interface f {
        void a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(k kVar) {
        this.a = kVar;
    }

    public static /* synthetic */ k0 a(CmpServiceImpl cmpServiceImpl) {
        return cmpServiceImpl.a();
    }

    public static /* synthetic */ com.applovin.impl.privacy.cmp.a b(CmpServiceImpl cmpServiceImpl) {
        return cmpServiceImpl.b;
    }

    private com.applovin.impl.privacy.cmp.a c() {
        if (n7.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.a);
        }
        if (!this.a.x().j()) {
            return null;
        }
        o.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }

    private void d() {
        if (hasSupportedCmp()) {
            this.b.c();
        }
    }

    public boolean hasSupportedCmp() {
        return this.b != null;
    }

    public void loadCmp(Activity activity, e eVar) {
        a(activity, eVar);
    }

    public void onFlowHidden(Bundle bundle) {
        b((AppLovinCmpError) null);
        b();
    }

    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        b();
        synchronized (this.c) {
            try {
                if (this.f == null) {
                    this.d = d.COMPLETED;
                    this.e = cmpErrorImpl;
                } else {
                    this.d = d.NONE;
                    a(cmpErrorImpl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onFlowLoaded(Bundle bundle) {
        synchronized (this.c) {
            try {
                if (this.f == null) {
                    this.d = d.COMPLETED;
                } else {
                    this.d = d.NONE;
                    a((AppLovinCmpError) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        b(cmpErrorImpl);
        b();
    }

    public void preloadCmp(Activity activity) {
        a(activity, null);
    }

    public void showCmp(Activity activity, f fVar) {
        b bVar = new b(activity);
        this.g = fVar;
        if (this.b.e()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    public void showCmpForExistingUser(Activity activity, AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.a.O();
        if (o.a()) {
            this.a.O().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!this.a.x().j()) {
            o.h("AppLovinCmpService", "Unable to show CMP for existing user. Please enable the consent flow.");
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "Consent flow is not enabled"));
        } else if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            d();
            loadCmp(activity, new a(onCompletedListener, activity));
        }
    }

    public String toString() {
        return "[CmpService]";
    }

    private void a(AppLovinCmpError appLovinCmpError) {
        e eVar = this.f;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.f = null;
        this.e = null;
    }

    private void b(AppLovinCmpError appLovinCmpError) {
        f fVar = this.g;
        if (fVar == null) {
            return;
        }
        fVar.a(appLovinCmpError);
        this.g = null;
    }

    private void b() {
        com.applovin.impl.privacy.cmp.a aVar = this.b;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private void a(Activity activity, e eVar) {
        boolean z;
        if (!hasSupportedCmp()) {
            if (eVar != null) {
                eVar.a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
                return;
            }
            return;
        }
        synchronized (this.c) {
            if (eVar != null) {
                try {
                    this.f = eVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            d dVar = this.d;
            d dVar2 = d.NONE;
            if (dVar == dVar2) {
                this.d = d.LOADING;
                z = false;
            } else {
                if (dVar == d.LOADING) {
                    return;
                }
                this.d = dVar2;
                z = true;
            }
            if (z) {
                a(this.e);
                return;
            }
            c cVar = new c(activity);
            if (this.b.d()) {
                AppLovinSdkUtils.runOnUiThread(cVar);
            } else {
                cVar.run();
            }
        }
    }

    private k0 a() {
        return new k0(this.a.x().d());
    }
}

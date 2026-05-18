package com.unity3d.ads.core.data.datasource;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import androidx.lifecycle.E;
import androidx.lifecycle.k;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import cb.O;
import cb.i;
import fb.N;
import fb.P;
import fb.g;
import fb.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidLifecycleDataSource implements LifecycleDataSource, o {
    private final z _appActive;
    private final N appActive;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[k.a.values().length];
            try {
                iArr[k.a.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @f(c = "com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1", f = "AndroidLifecycleDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return AndroidLifecycleDataSource.this.new 1(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            E.i.a().getLifecycle().addObserver(AndroidLifecycleDataSource.this);
            return I.a;
        }
    }

    public AndroidLifecycleDataSource() {
        z a = P.a(Boolean.TRUE);
        this._appActive = a;
        this.appActive = g.b(a);
        registerAppLifecycle();
    }

    private final void registerAppLifecycle() {
        i.d(cb.P.b(), null, null, new 1(null), 3, null);
    }

    public boolean appIsForeground() {
        return ((Boolean) getAppActive().getValue()).booleanValue();
    }

    public N getAppActive() {
        return this.appActive;
    }

    public void onStateChanged(r source, k.a event) {
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(event, "event");
        z zVar = this._appActive;
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        boolean z = true;
        if (i == 1) {
            z = false;
        } else if (i != 2) {
            z = ((Boolean) getAppActive().getValue()).booleanValue();
        }
        zVar.setValue(Boolean.valueOf(z));
    }
}

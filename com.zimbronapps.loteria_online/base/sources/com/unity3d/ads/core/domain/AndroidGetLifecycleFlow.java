package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import android.app.Application;
import android.content.Context;
import eb.v;
import fb.g;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetLifecycleFlow {
    private final Context applicationContext;

    @f(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2", f = "AndroidGetLifecycleFlow.kt", l = {64}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        private /* synthetic */ Object L$0;
        int label;

        public static final class 1 extends u implements Qa.a {
            final /* synthetic */ AndroidGetLifecycleFlow$invoke$2$listener$1 $listener;
            final /* synthetic */ AndroidGetLifecycleFlow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(AndroidGetLifecycleFlow androidGetLifecycleFlow, AndroidGetLifecycleFlow$invoke$2$listener$1 androidGetLifecycleFlow$invoke$2$listener$1) {
                super(0);
                this.this$0 = androidGetLifecycleFlow;
                this.$listener = androidGetLifecycleFlow$invoke$2$listener$1;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                AndroidGetLifecycleFlow.access$getApplicationContext$p(this.this$0).unregisterActivityLifecycleCallbacks(this.$listener);
            }
        }

        public 2(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            2 r0 = AndroidGetLifecycleFlow.this.new 2(eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(v vVar, e eVar) {
            return ((2) create(vVar, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                v vVar = (v) this.L$0;
                AndroidGetLifecycleFlow$invoke$2$listener$1 androidGetLifecycleFlow$invoke$2$listener$1 = new AndroidGetLifecycleFlow$invoke$2$listener$1(vVar);
                AndroidGetLifecycleFlow.access$getApplicationContext$p(AndroidGetLifecycleFlow.this).registerActivityLifecycleCallbacks(androidGetLifecycleFlow$invoke$2$listener$1);
                1 r3 = new 1(AndroidGetLifecycleFlow.this, androidGetLifecycleFlow$invoke$2$listener$1);
                this.label = 1;
                if (eb.t.a(vVar, r3, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    public AndroidGetLifecycleFlow(Context applicationContext) {
        kotlin.jvm.internal.t.g(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    public static final /* synthetic */ Context access$getApplicationContext$p(AndroidGetLifecycleFlow androidGetLifecycleFlow) {
        return androidGetLifecycleFlow.applicationContext;
    }

    public final fb.e invoke() {
        if (this.applicationContext instanceof Application) {
            return g.h(new 2(null));
        }
        throw new IllegalArgumentException("Application context is required");
    }
}

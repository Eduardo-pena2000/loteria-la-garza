package com.unity3d.ads.core.data.datasource;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import Qa.q;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import fb.g;
import o2.d;
import o2.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebviewConfigurationDataSource {
    private final i webviewConfigurationStore;

    @f(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2", f = "WebviewConfigurationDataSource.kt", l = {15}, m = "invokeSuspend")
    public static final class 2 extends l implements q {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public 2(e eVar) {
            super(3, eVar);
        }

        public final Object invoke(fb.f fVar, Throwable th, e eVar) {
            2 r0 = new 2(eVar);
            r0.L$0 = fVar;
            r0.L$1 = th;
            return r0.invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                fb.f fVar = (fb.f) this.L$0;
                Throwable th = (Throwable) this.L$1;
                if (!(th instanceof d)) {
                    throw th;
                }
                WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
                kotlin.jvm.internal.t.f(defaultInstance, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                if (fVar.emit(defaultInstance, this) == f) {
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

    @f(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ WebviewConfigurationStore.WebViewConfigurationStore $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, e eVar) {
            super(2, eVar);
            this.$data = webViewConfigurationStore;
        }

        public final e create(Object obj, e eVar) {
            return new 2(this.$data, eVar);
        }

        public final Object invoke(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, e eVar) {
            return ((2) create(webViewConfigurationStore, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return this.$data;
        }
    }

    public WebviewConfigurationDataSource(i webviewConfigurationStore) {
        kotlin.jvm.internal.t.g(webviewConfigurationStore, "webviewConfigurationStore");
        this.webviewConfigurationStore = webviewConfigurationStore;
    }

    public final Object get(e eVar) {
        return g.s(g.f(this.webviewConfigurationStore.getData(), new 2(null)), eVar);
    }

    public final Object set(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, e eVar) {
        Object a = this.webviewConfigurationStore.a(new 2(webViewConfigurationStore, null), eVar);
        return a == c.f() ? a : I.a;
    }
}

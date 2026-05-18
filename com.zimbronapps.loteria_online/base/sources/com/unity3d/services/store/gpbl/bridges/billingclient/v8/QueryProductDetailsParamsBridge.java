package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import Ca.x;
import Da.S;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class QueryProductDetailsParamsBridge extends GenericBridge {
    public static final Companion Companion = new Companion(null);
    private static final String NEW_BUILDER_METHOD = "newBuilder";
    private final Object queryProductDetailsParamsInternalInstance;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final Object callNonVoidStaticMethod(String str) {
            Object invoke = getClassForParams().getMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
            if (invoke != null) {
                return invoke;
            }
            throw new IllegalStateException("Static method " + str + " returned null");
        }

        public final Class getClassForParams() {
            t.f(QueryProductDetailsParams.class, "forName(\"com.android.bil…eryProductDetailsParams\")");
            return QueryProductDetailsParams.class;
        }

        public final QueryProductDetailsParamsBuilderBridge newBuilder() {
            return new QueryProductDetailsParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private Companion() {
        }
    }

    public QueryProductDetailsParamsBridge(Object obj) {
        super(S.j(x.a("newBuilder", new Class[0])));
        this.queryProductDetailsParamsInternalInstance = obj;
    }

    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams";
    }

    public final Object getQueryProductDetailsParamsInternalInstance() {
        return this.queryProductDetailsParamsInternalInstance;
    }
}

package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import Ca.x;
import Da.S;
import com.android.billingclient.api.QueryPurchasesParams;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class QueryPurchasesParamsBridge extends GenericBridge {
    public static final Companion Companion = new Companion(null);
    private static final String NEW_BUILDER_METHOD = "newBuilder";
    private final Object queryPurchasesParamsBridgeInternalInstance;

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
            t.f(QueryPurchasesParams.class, "forName(\"com.android.bil…pi.QueryPurchasesParams\")");
            return QueryPurchasesParams.class;
        }

        public final QueryPurchasesParamsBuilderBridge newBuilder() {
            return new QueryPurchasesParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private Companion() {
        }
    }

    public QueryPurchasesParamsBridge(Object obj) {
        super(S.j(x.a("newBuilder", new Class[0])));
        this.queryPurchasesParamsBridgeInternalInstance = obj;
    }

    public String getClassName() {
        return "com.android.billingclient.api.QueryPurchasesParams";
    }

    public final Object getQueryPurchasesParamsBridgeInternalInstance() {
        return this.queryPurchasesParamsBridgeInternalInstance;
    }
}

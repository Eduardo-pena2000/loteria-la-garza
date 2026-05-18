package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import Ca.x;
import Da.S;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class QueryPurchasesParamsBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    public static final Companion Companion = new Companion(null);
    private static final String SET_PRODUCT_TYPE_METHOD = "setProductType";
    private Object builderInstance;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchasesParamsBuilderBridge(Object builderInstance) {
        super(S.l(x.a("setProductType", new Class[]{String.class}), x.a("build", new Class[0])));
        t.g(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    public final QueryProductDetailsParamsBridge build() {
        return new QueryProductDetailsParamsBridge(callNonVoidMethod("build", this.builderInstance, new Object[0]));
    }

    public final Object getBuilderInstance() {
        return this.builderInstance;
    }

    public String getClassName() {
        return "com.android.billingclient.api.QueryPurchasesParams$Builder";
    }

    public final void setBuilderInstance(Object obj) {
        t.g(obj, "<set-?>");
        this.builderInstance = obj;
    }

    public final QueryPurchasesParamsBuilderBridge setProductType(String productType) {
        t.g(productType, "productType");
        Object callNonVoidMethod = callNonVoidMethod("setProductType", this.builderInstance, productType);
        t.f(callNonVoidMethod, "callNonVoidMethod(SET_PR…derInstance, productType)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }
}

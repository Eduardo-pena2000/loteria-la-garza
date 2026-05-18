package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import Ca.x;
import Da.S;
import Da.w;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class QueryProductDetailsParamsBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    public static final Companion Companion = new Companion(null);
    private static final String SET_PRODUCT_LIST_METHOD = "setProductList";
    private Object builderInstance;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsParamsBuilderBridge(Object builderInstance) {
        super(S.l(x.a("setProductList", new Class[]{List.class}), x.a("build", new Class[0])));
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
        return "com.android.billingclient.api.QueryProductDetailsParams$Builder";
    }

    public final void setBuilderInstance(Object obj) {
        t.g(obj, "<set-?>");
        this.builderInstance = obj;
    }

    public final QueryProductDetailsParamsBuilderBridge setProductList(List productList) {
        t.g(productList, "productList");
        ArrayList arrayList = new ArrayList(w.y(productList, 10));
        Iterator it = productList.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductBridge) it.next()).getInternalClass());
        }
        Object callNonVoidMethod = callNonVoidMethod("setProductList", this.builderInstance, arrayList);
        t.f(callNonVoidMethod, "callNonVoidMethod(SET_PR…nce, productListInternal)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }
}

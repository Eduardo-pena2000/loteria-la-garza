package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import Da.S;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ProductBridge extends GenericBridge {
    public static final Companion Companion = new Companion(null);
    public static final String NEW_BUILDER_METHOD = "newBuilder";
    private final Object productInternalInstance;

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
            t.f(QueryProductDetailsParams.Product.class, "forName(\"com.android.bil…tDetailsParams\\$Product\")");
            return QueryProductDetailsParams.Product.class;
        }

        public final ProductBuilderBridge newBuilder() {
            return new ProductBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private Companion() {
        }
    }

    public ProductBridge(Object obj) {
        super(S.h());
        this.productInternalInstance = obj;
    }

    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Product";
    }

    public final Object getInternalClass() {
        return this.productInternalInstance;
    }
}

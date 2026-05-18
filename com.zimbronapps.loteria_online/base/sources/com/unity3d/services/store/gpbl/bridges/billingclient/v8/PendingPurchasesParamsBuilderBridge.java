package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import Ca.x;
import Da.S;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PendingPurchasesParamsBuilderBridge extends GenericBridge {
    private static final String BUILD_METHOD = "build";
    public static final Companion Companion = new Companion(null);
    private static final String ENABLE_ONE_TIME_PRODUCT_METHOD = "enableOneTimeProducts";
    private final Object builderInstance;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingPurchasesParamsBuilderBridge(Object builderInstance) {
        super(S.j(x.a("enableOneTimeProducts", new Class[0]), x.a("build", new Class[0])));
        t.g(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    public final PendingPurchasesParamsBridge build() {
        return new PendingPurchasesParamsBridge(callNonVoidMethod("build", this.builderInstance, new Object[0]));
    }

    public final PendingPurchasesParamsBuilderBridge enableOneTimeProducts() {
        callVoidMethod("enableOneTimeProducts", this.builderInstance, new Object[0]);
        return this;
    }

    public String getClassName() {
        return "com.android.billingclient.api.PendingPurchasesParams$Builder";
    }
}

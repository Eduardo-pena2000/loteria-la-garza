package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import Ca.x;
import Da.S;
import com.android.billingclient.api.PendingPurchasesParams;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PendingPurchasesParamsBridge extends GenericBridge {
    public static final Companion Companion = new Companion(null);
    public static final String NEW_BUILDER_METHOD_NAME = "newBuilder";
    private final Object pendingPurchasesParamsInternalInstance;

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
            t.f(PendingPurchasesParams.class, "forName(\"com.android.bil….PendingPurchasesParams\")");
            return PendingPurchasesParams.class;
        }

        public final PendingPurchasesParamsBuilderBridge newBuilder() {
            return new PendingPurchasesParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private Companion() {
        }
    }

    public PendingPurchasesParamsBridge(Object obj) {
        super(S.j(x.a("newBuilder", new Class[0])));
        this.pendingPurchasesParamsInternalInstance = obj;
    }

    public String getClassName() {
        return "com.android.billingclient.api.PendingPurchasesParams";
    }

    public final Object getInternalClass() {
        return this.pendingPurchasesParamsInternalInstance;
    }
}

package com.revenuecat.purchases.customercenter;

import Ca.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerCenterRoot {
    public static final Companion Companion = new Companion(null);
    private final CustomerCenterConfigData customerCenter;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return CustomerCenterRoot$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ CustomerCenterRoot(int i, CustomerCenterConfigData customerCenterConfigData, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, CustomerCenterRoot$$serializer.INSTANCE.getDescriptor());
        }
        this.customerCenter = customerCenterConfigData;
    }

    public static /* synthetic */ void getCustomerCenter$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CustomerCenterRoot customerCenterRoot, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, CustomerCenterConfigData$$serializer.INSTANCE, customerCenterRoot.customerCenter);
    }

    public final CustomerCenterConfigData getCustomerCenter() {
        return this.customerCenter;
    }

    public CustomerCenterRoot(CustomerCenterConfigData customerCenterConfigData) {
        t.g(customerCenterConfigData, "customerCenter");
        this.customerCenter = customerCenterConfigData;
    }
}

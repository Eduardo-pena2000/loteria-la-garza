package com.unity3d.services.store.gpbl.bridges.billingclient;

import Ca.s;
import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BillingClientAdapterFactory {
    private final BillingClientAdapter createV6Adapter(Context context, int i) {
        Object b;
        try {
            s.a aVar = s.b;
            BillingClientBuilderBridge builder = BillingClientBridge.newBuilder(context);
            t.f(builder, "builder");
            b = s.b(new com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter(builder, i));
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(Ca.t.a(th));
        }
        if (s.g(b)) {
            b = null;
        }
        return (BillingClientAdapter) b;
    }

    public static /* synthetic */ BillingClientAdapter createV6Adapter$default(BillingClientAdapterFactory billingClientAdapterFactory, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 6;
        }
        return billingClientAdapterFactory.createV6Adapter(context, i);
    }

    private final Object createV8Adapter-IoAF18A(Context context) {
        try {
            s.a aVar = s.b;
            com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter billingClientAdapter = new com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.Companion.newBuilder(context));
            if (new QueryProductDetailsResultsBridge(new Object()).exists()) {
                return s.b(billingClientAdapter);
            }
            throw new FallbackException(7);
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            return s.b(Ca.t.a(th));
        }
    }

    public final BillingClientAdapter createBillingClientAdapter(Context context) {
        t.g(context, "context");
        Object obj = createV8Adapter-IoAF18A(context);
        FallbackException e = s.e(obj);
        if (e != null) {
            obj = e instanceof FallbackException ? createV6Adapter(context, e.getDetectedVersion()) : createV6Adapter$default(this, context, 0, 2, null);
        }
        return (BillingClientAdapter) obj;
    }
}

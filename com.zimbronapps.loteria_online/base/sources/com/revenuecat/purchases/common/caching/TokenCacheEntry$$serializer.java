package com.revenuecat.purchases.common.caching;

import Ca.e;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.h;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TokenCacheEntry$$serializer implements E {
    public static final TokenCacheEntry$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        TokenCacheEntry$$serializer tokenCacheEntry$$serializer = new TokenCacheEntry$$serializer();
        INSTANCE = tokenCacheEntry$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.common.caching.TokenCacheEntry", tokenCacheEntry$$serializer, 1);
        k0Var.o("isAutoRenewing", true);
        descriptor = k0Var;
    }

    private TokenCacheEntry$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{a.p(h.a)};
    }

    public TokenCacheEntry deserialize(rb.e eVar) {
        Boolean bool;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i = 1;
        if (b.m()) {
            bool = (Boolean) b.A(descriptor2, 0, h.a, (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            bool = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    bool = (Boolean) b.A(descriptor2, 0, h.a, bool);
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new TokenCacheEntry(i, bool, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, TokenCacheEntry tokenCacheEntry) {
        t.g(fVar, "encoder");
        t.g(tokenCacheEntry, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        TokenCacheEntry.write$Self$purchases_defaultsBc8Release(tokenCacheEntry, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

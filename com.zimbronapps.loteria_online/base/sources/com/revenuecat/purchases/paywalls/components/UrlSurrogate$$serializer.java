package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UrlSurrogate$$serializer implements E {
    public static final UrlSurrogate$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        UrlSurrogate$$serializer urlSurrogate$$serializer = new UrlSurrogate$$serializer();
        INSTANCE = urlSurrogate$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.UrlSurrogate", urlSurrogate$$serializer, 2);
        k0Var.o("url_lid", false);
        k0Var.o("method", false);
        descriptor = k0Var;
    }

    private UrlSurrogate$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{LocalizationKey$$serializer.INSTANCE, UrlMethodDeserializer.INSTANCE};
    }

    public UrlSurrogate deserialize(rb.e eVar) {
        String str;
        ButtonComponent.UrlMethod urlMethod;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            LocalizationKey localizationKey = (LocalizationKey) b.e(descriptor2, 0, LocalizationKey$$serializer.INSTANCE, (Object) null);
            str = localizationKey != null ? localizationKey.unbox-impl() : null;
            urlMethod = (ButtonComponent.UrlMethod) b.e(descriptor2, 1, UrlMethodDeserializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            String str2 = null;
            ButtonComponent.UrlMethod urlMethod2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    LocalizationKey localizationKey2 = (LocalizationKey) b.e(descriptor2, 0, LocalizationKey$$serializer.INSTANCE, str2 != null ? LocalizationKey.box-impl(str2) : null);
                    str2 = localizationKey2 != null ? localizationKey2.unbox-impl() : null;
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    urlMethod2 = (ButtonComponent.UrlMethod) b.e(descriptor2, 1, UrlMethodDeserializer.INSTANCE, urlMethod2);
                    i2 |= 2;
                }
            }
            str = str2;
            urlMethod = urlMethod2;
            i = i2;
        }
        b.c(descriptor2);
        return new UrlSurrogate(i, str, urlMethod, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, UrlSurrogate urlSurrogate) {
        t.g(fVar, "encoder");
        t.g(urlSurrogate, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        UrlSurrogate.write$Self$purchases_defaultsBc8Release(urlSurrogate, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

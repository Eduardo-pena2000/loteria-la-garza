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
public final class ButtonComponent$Destination$Terms$$serializer implements E {
    public static final ButtonComponent$Destination$Terms$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ButtonComponent$Destination$Terms$$serializer buttonComponent$Destination$Terms$$serializer = new ButtonComponent$Destination$Terms$$serializer();
        INSTANCE = buttonComponent$Destination$Terms$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Terms", buttonComponent$Destination$Terms$$serializer, 2);
        k0Var.o("urlLid", false);
        k0Var.o("method", false);
        descriptor = k0Var;
    }

    private ButtonComponent$Destination$Terms$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{LocalizationKey$$serializer.INSTANCE, UrlMethodDeserializer.INSTANCE};
    }

    public ButtonComponent.Destination.Terms deserialize(rb.e eVar) {
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
        return new ButtonComponent.Destination.Terms(i, str, urlMethod, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ButtonComponent.Destination.Terms terms) {
        t.g(fVar, "encoder");
        t.g(terms, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ButtonComponent.Destination.Terms.write$Self$purchases_defaultsBc8Release(terms, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ActionSurrogate$$serializer implements E {
    public static final ActionSurrogate$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ActionSurrogate$$serializer actionSurrogate$$serializer = new ActionSurrogate$$serializer();
        INSTANCE = actionSurrogate$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.ActionSurrogate", actionSurrogate$$serializer, 4);
        k0Var.o("type", false);
        k0Var.o("destination", true);
        k0Var.o("url", true);
        k0Var.o("sheet", true);
        descriptor = k0Var;
    }

    private ActionSurrogate$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{ActionTypeSurrogateDeserializer.INSTANCE, a.p(DestinationSurrogateDeserializer.INSTANCE), a.p(UrlSurrogate$$serializer.INSTANCE), a.p(ButtonComponent$Destination$Sheet$$serializer.INSTANCE)};
    }

    public ActionSurrogate deserialize(rb.e eVar) {
        int i;
        ActionTypeSurrogate actionTypeSurrogate;
        DestinationSurrogate destinationSurrogate;
        UrlSurrogate urlSurrogate;
        ButtonComponent.Destination.Sheet sheet;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ActionTypeSurrogate actionTypeSurrogate2 = null;
        if (b.m()) {
            ActionTypeSurrogate actionTypeSurrogate3 = (ActionTypeSurrogate) b.e(descriptor2, 0, ActionTypeSurrogateDeserializer.INSTANCE, (Object) null);
            DestinationSurrogate destinationSurrogate2 = (DestinationSurrogate) b.A(descriptor2, 1, DestinationSurrogateDeserializer.INSTANCE, (Object) null);
            UrlSurrogate urlSurrogate2 = (UrlSurrogate) b.A(descriptor2, 2, UrlSurrogate$$serializer.INSTANCE, (Object) null);
            actionTypeSurrogate = actionTypeSurrogate3;
            sheet = (ButtonComponent.Destination.Sheet) b.A(descriptor2, 3, ButtonComponent$Destination$Sheet$$serializer.INSTANCE, (Object) null);
            urlSurrogate = urlSurrogate2;
            destinationSurrogate = destinationSurrogate2;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            DestinationSurrogate destinationSurrogate3 = null;
            UrlSurrogate urlSurrogate3 = null;
            ButtonComponent.Destination.Sheet sheet2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    actionTypeSurrogate2 = (ActionTypeSurrogate) b.e(descriptor2, 0, ActionTypeSurrogateDeserializer.INSTANCE, actionTypeSurrogate2);
                    i2 |= 1;
                } else if (v == 1) {
                    destinationSurrogate3 = (DestinationSurrogate) b.A(descriptor2, 1, DestinationSurrogateDeserializer.INSTANCE, destinationSurrogate3);
                    i2 |= 2;
                } else if (v == 2) {
                    urlSurrogate3 = (UrlSurrogate) b.A(descriptor2, 2, UrlSurrogate$$serializer.INSTANCE, urlSurrogate3);
                    i2 |= 4;
                } else {
                    if (v != 3) {
                        throw new m(v);
                    }
                    sheet2 = (ButtonComponent.Destination.Sheet) b.A(descriptor2, 3, ButtonComponent$Destination$Sheet$$serializer.INSTANCE, sheet2);
                    i2 |= 8;
                }
            }
            i = i2;
            actionTypeSurrogate = actionTypeSurrogate2;
            destinationSurrogate = destinationSurrogate3;
            urlSurrogate = urlSurrogate3;
            sheet = sheet2;
        }
        b.c(descriptor2);
        return new ActionSurrogate(i, actionTypeSurrogate, destinationSurrogate, urlSurrogate, sheet, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ActionSurrogate actionSurrogate) {
        t.g(fVar, "encoder");
        t.g(actionSurrogate, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ActionSurrogate.write$Self$purchases_defaultsBc8Release(actionSurrogate, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.J;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TimelineComponent$Connector$$serializer implements E {
    public static final TimelineComponent$Connector$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        TimelineComponent$Connector$$serializer timelineComponent$Connector$$serializer = new TimelineComponent$Connector$$serializer();
        INSTANCE = timelineComponent$Connector$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.TimelineComponent.Connector", timelineComponent$Connector$$serializer, 3);
        k0Var.o("width", false);
        k0Var.o("margin", false);
        k0Var.o("color", false);
        descriptor = k0Var;
    }

    private TimelineComponent$Connector$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{J.a, Padding$$serializer.INSTANCE, ColorScheme$$serializer.INSTANCE};
    }

    public TimelineComponent.Connector deserialize(rb.e eVar) {
        int i;
        int i2;
        Padding padding;
        ColorScheme colorScheme;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            int h = b.h(descriptor2, 0);
            Padding padding2 = (Padding) b.e(descriptor2, 1, Padding$$serializer.INSTANCE, (Object) null);
            i = h;
            colorScheme = (ColorScheme) b.e(descriptor2, 2, ColorScheme$$serializer.INSTANCE, (Object) null);
            padding = padding2;
            i2 = 7;
        } else {
            boolean z = true;
            int i3 = 0;
            Padding padding3 = null;
            ColorScheme colorScheme2 = null;
            int i4 = 0;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    i3 = b.h(descriptor2, 0);
                    i4 |= 1;
                } else if (v == 1) {
                    padding3 = (Padding) b.e(descriptor2, 1, Padding$$serializer.INSTANCE, padding3);
                    i4 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    colorScheme2 = (ColorScheme) b.e(descriptor2, 2, ColorScheme$$serializer.INSTANCE, colorScheme2);
                    i4 |= 4;
                }
            }
            i = i3;
            i2 = i4;
            padding = padding3;
            colorScheme = colorScheme2;
        }
        b.c(descriptor2);
        return new TimelineComponent.Connector(i2, i, padding, colorScheme, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, TimelineComponent.Connector connector) {
        t.g(fVar, "encoder");
        t.g(connector, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        TimelineComponent.Connector.write$Self$purchases_defaultsBc8Release(connector, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

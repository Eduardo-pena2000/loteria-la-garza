package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import java.util.List;
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
public final class TimelineComponent$Item$$serializer implements E {
    public static final TimelineComponent$Item$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        TimelineComponent$Item$$serializer timelineComponent$Item$$serializer = new TimelineComponent$Item$$serializer();
        INSTANCE = timelineComponent$Item$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.TimelineComponent.Item", timelineComponent$Item$$serializer, 6);
        k0Var.o("title", false);
        k0Var.o("visible", true);
        k0Var.o("description", true);
        k0Var.o("icon", false);
        k0Var.o("connector", true);
        k0Var.o("overrides", true);
        descriptor = k0Var;
    }

    private TimelineComponent$Item$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = TimelineComponent.Item.access$get$childSerializers$cp();
        b bVar = TextComponent$$serializer.INSTANCE;
        return new b[]{bVar, a.p(h.a), a.p(bVar), IconComponent$$serializer.INSTANCE, a.p(TimelineComponent$Connector$$serializer.INSTANCE), access$get$childSerializers$cp[5]};
    }

    public TimelineComponent.Item deserialize(rb.e eVar) {
        int i;
        TextComponent textComponent;
        Boolean bool;
        TextComponent textComponent2;
        IconComponent iconComponent;
        TimelineComponent.Connector connector;
        List list;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = TimelineComponent.Item.access$get$childSerializers$cp();
        int i2 = 3;
        TextComponent textComponent3 = null;
        if (b.m()) {
            TextComponent$$serializer textComponent$$serializer = TextComponent$$serializer.INSTANCE;
            TextComponent textComponent4 = (TextComponent) b.e(descriptor2, 0, textComponent$$serializer, (Object) null);
            Boolean bool2 = (Boolean) b.A(descriptor2, 1, h.a, (Object) null);
            TextComponent textComponent5 = (TextComponent) b.A(descriptor2, 2, textComponent$$serializer, (Object) null);
            IconComponent iconComponent2 = (IconComponent) b.e(descriptor2, 3, IconComponent$$serializer.INSTANCE, (Object) null);
            TimelineComponent.Connector connector2 = (TimelineComponent.Connector) b.A(descriptor2, 4, TimelineComponent$Connector$$serializer.INSTANCE, (Object) null);
            list = (List) b.e(descriptor2, 5, access$get$childSerializers$cp[5], (Object) null);
            textComponent2 = textComponent5;
            iconComponent = iconComponent2;
            connector = connector2;
            i = 63;
            bool = bool2;
            textComponent = textComponent4;
        } else {
            boolean z = true;
            int i3 = 0;
            Boolean bool3 = null;
            TextComponent textComponent6 = null;
            IconComponent iconComponent3 = null;
            TimelineComponent.Connector connector3 = null;
            List list2 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        i2 = 3;
                    case 0:
                        textComponent3 = (TextComponent) b.e(descriptor2, 0, TextComponent$$serializer.INSTANCE, textComponent3);
                        i3 |= 1;
                        i2 = 3;
                    case 1:
                        bool3 = (Boolean) b.A(descriptor2, 1, h.a, bool3);
                        i3 |= 2;
                    case 2:
                        textComponent6 = (TextComponent) b.A(descriptor2, 2, TextComponent$$serializer.INSTANCE, textComponent6);
                        i3 |= 4;
                    case 3:
                        iconComponent3 = (IconComponent) b.e(descriptor2, i2, IconComponent$$serializer.INSTANCE, iconComponent3);
                        i3 |= 8;
                    case 4:
                        connector3 = (TimelineComponent.Connector) b.A(descriptor2, 4, TimelineComponent$Connector$$serializer.INSTANCE, connector3);
                        i3 |= 16;
                    case 5:
                        list2 = (List) b.e(descriptor2, 5, access$get$childSerializers$cp[5], list2);
                        i3 |= 32;
                    default:
                        throw new m(v);
                }
            }
            i = i3;
            textComponent = textComponent3;
            bool = bool3;
            textComponent2 = textComponent6;
            iconComponent = iconComponent3;
            connector = connector3;
            list = list2;
        }
        b.c(descriptor2);
        return new TimelineComponent.Item(i, textComponent, bool, textComponent2, iconComponent, connector, list, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, TimelineComponent.Item item) {
        t.g(fVar, "encoder");
        t.g(item, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        TimelineComponent.Item.write$Self$purchases_defaultsBc8Release(item, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

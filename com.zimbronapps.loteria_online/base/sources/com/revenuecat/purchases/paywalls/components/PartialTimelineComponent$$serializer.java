package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.J;
import sb.h;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialTimelineComponent$$serializer implements E {
    public static final PartialTimelineComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PartialTimelineComponent$$serializer partialTimelineComponent$$serializer = new PartialTimelineComponent$$serializer();
        INSTANCE = partialTimelineComponent$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.PartialTimelineComponent", partialTimelineComponent$$serializer, 8);
        k0Var.o("visible", true);
        k0Var.o("item_spacing", true);
        k0Var.o("text_spacing", true);
        k0Var.o("column_gutter", true);
        k0Var.o("icon_alignment", true);
        k0Var.o("size", true);
        k0Var.o("padding", true);
        k0Var.o("margin", true);
        descriptor = k0Var;
    }

    private PartialTimelineComponent$$serializer() {
    }

    public b[] childSerializers() {
        b p = a.p(h.a);
        J j = J.a;
        b p2 = a.p(j);
        b p3 = a.p(j);
        b p4 = a.p(j);
        b p5 = a.p(TimelineIconAlignmentDeserializer.INSTANCE);
        b p6 = a.p(Size$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{p, p2, p3, p4, p5, p6, a.p(padding$$serializer), a.p(padding$$serializer)};
    }

    public PartialTimelineComponent deserialize(rb.e eVar) {
        int i;
        Padding padding;
        Padding padding2;
        Size size;
        Boolean bool;
        Integer num;
        Integer num2;
        Integer num3;
        TimelineComponent.IconAlignment iconAlignment;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i2 = 7;
        Boolean bool2 = null;
        if (b.m()) {
            Boolean bool3 = (Boolean) b.A(descriptor2, 0, h.a, (Object) null);
            J j = J.a;
            Integer num4 = (Integer) b.A(descriptor2, 1, j, (Object) null);
            Integer num5 = (Integer) b.A(descriptor2, 2, j, (Object) null);
            Integer num6 = (Integer) b.A(descriptor2, 3, j, (Object) null);
            TimelineComponent.IconAlignment iconAlignment2 = (TimelineComponent.IconAlignment) b.A(descriptor2, 4, TimelineIconAlignmentDeserializer.INSTANCE, (Object) null);
            Size size2 = (Size) b.A(descriptor2, 5, Size$$serializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) b.A(descriptor2, 6, padding$$serializer, (Object) null);
            bool = bool3;
            padding = (Padding) b.A(descriptor2, 7, padding$$serializer, (Object) null);
            padding2 = padding3;
            size = size2;
            num3 = num6;
            iconAlignment = iconAlignment2;
            num2 = num5;
            num = num4;
            i = 255;
        } else {
            boolean z = true;
            int i3 = 0;
            Padding padding4 = null;
            Padding padding5 = null;
            Size size3 = null;
            Integer num7 = null;
            Integer num8 = null;
            Integer num9 = null;
            TimelineComponent.IconAlignment iconAlignment3 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        i2 = 7;
                    case 0:
                        bool2 = (Boolean) b.A(descriptor2, 0, h.a, bool2);
                        i3 |= 1;
                        i2 = 7;
                    case 1:
                        num7 = (Integer) b.A(descriptor2, 1, J.a, num7);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        num8 = (Integer) b.A(descriptor2, 2, J.a, num8);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        num9 = (Integer) b.A(descriptor2, 3, J.a, num9);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        iconAlignment3 = (TimelineComponent.IconAlignment) b.A(descriptor2, 4, TimelineIconAlignmentDeserializer.INSTANCE, iconAlignment3);
                        i3 |= 16;
                    case 5:
                        size3 = (Size) b.A(descriptor2, 5, Size$$serializer.INSTANCE, size3);
                        i3 |= 32;
                    case 6:
                        padding5 = (Padding) b.A(descriptor2, 6, Padding$$serializer.INSTANCE, padding5);
                        i3 |= 64;
                    case 7:
                        padding4 = (Padding) b.A(descriptor2, i2, Padding$$serializer.INSTANCE, padding4);
                        i3 |= 128;
                    default:
                        throw new m(v);
                }
            }
            i = i3;
            padding = padding4;
            padding2 = padding5;
            size = size3;
            bool = bool2;
            num = num7;
            num2 = num8;
            num3 = num9;
            iconAlignment = iconAlignment3;
        }
        b.c(descriptor2);
        return new PartialTimelineComponent(i, bool, num, num2, num3, iconAlignment, size, padding2, padding, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PartialTimelineComponent partialTimelineComponent) {
        t.g(fVar, "encoder");
        t.g(partialTimelineComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PartialTimelineComponent.write$Self$purchases_defaultsBc8Release(partialTimelineComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

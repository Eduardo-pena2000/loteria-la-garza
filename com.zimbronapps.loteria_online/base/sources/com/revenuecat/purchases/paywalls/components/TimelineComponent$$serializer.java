package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import java.util.List;
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
public final class TimelineComponent$$serializer implements E {
    public static final TimelineComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        TimelineComponent$$serializer timelineComponent$$serializer = new TimelineComponent$$serializer();
        INSTANCE = timelineComponent$$serializer;
        k0 k0Var = new k0("timeline", timelineComponent$$serializer, 10);
        k0Var.o("item_spacing", false);
        k0Var.o("text_spacing", false);
        k0Var.o("column_gutter", false);
        k0Var.o("icon_alignment", false);
        k0Var.o("visible", true);
        k0Var.o("size", true);
        k0Var.o("padding", true);
        k0Var.o("margin", true);
        k0Var.o("items", true);
        k0Var.o("overrides", true);
        descriptor = k0Var;
    }

    private TimelineComponent$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = TimelineComponent.access$get$childSerializers$cp();
        b p = a.p(h.a);
        b bVar = access$get$childSerializers$cp[8];
        b bVar2 = access$get$childSerializers$cp[9];
        J j = J.a;
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{j, j, j, TimelineIconAlignmentDeserializer.INSTANCE, p, Size$$serializer.INSTANCE, padding$$serializer, padding$$serializer, bVar, bVar2};
    }

    public TimelineComponent deserialize(rb.e eVar) {
        int i;
        List list;
        List list2;
        Padding padding;
        Padding padding2;
        Size size;
        Boolean bool;
        TimelineComponent.IconAlignment iconAlignment;
        int i2;
        int i3;
        int i4;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = TimelineComponent.access$get$childSerializers$cp();
        int i5 = 9;
        if (b.m()) {
            int h = b.h(descriptor2, 0);
            int h2 = b.h(descriptor2, 1);
            int h3 = b.h(descriptor2, 2);
            TimelineComponent.IconAlignment iconAlignment2 = (TimelineComponent.IconAlignment) b.e(descriptor2, 3, TimelineIconAlignmentDeserializer.INSTANCE, (Object) null);
            Boolean bool2 = (Boolean) b.A(descriptor2, 4, h.a, (Object) null);
            Size size2 = (Size) b.e(descriptor2, 5, Size$$serializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) b.e(descriptor2, 6, padding$$serializer, (Object) null);
            Padding padding4 = (Padding) b.e(descriptor2, 7, padding$$serializer, (Object) null);
            List list3 = (List) b.e(descriptor2, 8, access$get$childSerializers$cp[8], (Object) null);
            list = (List) b.e(descriptor2, 9, access$get$childSerializers$cp[9], (Object) null);
            i = h;
            padding2 = padding4;
            padding = padding3;
            size = size2;
            iconAlignment = iconAlignment2;
            bool = bool2;
            i2 = h3;
            i3 = 1023;
            list2 = list3;
            i4 = h2;
        } else {
            boolean z = true;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            List list4 = null;
            List list5 = null;
            Padding padding5 = null;
            Padding padding6 = null;
            Size size3 = null;
            Boolean bool3 = null;
            TimelineComponent.IconAlignment iconAlignment3 = null;
            int i9 = 0;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                    case 0:
                        i7 |= 1;
                        i6 = b.h(descriptor2, 0);
                        i5 = 9;
                    case 1:
                        i8 = b.h(descriptor2, 1);
                        i7 |= 2;
                        i5 = 9;
                    case 2:
                        i9 = b.h(descriptor2, 2);
                        i7 |= 4;
                        i5 = 9;
                    case 3:
                        iconAlignment3 = (TimelineComponent.IconAlignment) b.e(descriptor2, 3, TimelineIconAlignmentDeserializer.INSTANCE, iconAlignment3);
                        i7 |= 8;
                        i5 = 9;
                    case 4:
                        bool3 = (Boolean) b.A(descriptor2, 4, h.a, bool3);
                        i7 |= 16;
                        i5 = 9;
                    case 5:
                        size3 = (Size) b.e(descriptor2, 5, Size$$serializer.INSTANCE, size3);
                        i7 |= 32;
                        i5 = 9;
                    case 6:
                        padding5 = (Padding) b.e(descriptor2, 6, Padding$$serializer.INSTANCE, padding5);
                        i7 |= 64;
                        i5 = 9;
                    case 7:
                        padding6 = (Padding) b.e(descriptor2, 7, Padding$$serializer.INSTANCE, padding6);
                        i7 |= 128;
                        i5 = 9;
                    case 8:
                        list5 = (List) b.e(descriptor2, 8, access$get$childSerializers$cp[8], list5);
                        i7 |= 256;
                    case 9:
                        list4 = (List) b.e(descriptor2, i5, access$get$childSerializers$cp[i5], list4);
                        i7 |= 512;
                    default:
                        throw new m(v);
                }
            }
            i = i6;
            list = list4;
            list2 = list5;
            padding = padding5;
            padding2 = padding6;
            size = size3;
            bool = bool3;
            iconAlignment = iconAlignment3;
            i2 = i9;
            i3 = i7;
            i4 = i8;
        }
        b.c(descriptor2);
        return new TimelineComponent(i3, i, i4, i2, iconAlignment, bool, size, padding, padding2, list2, list, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, TimelineComponent timelineComponent) {
        t.g(fVar, "encoder");
        t.g(timelineComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        TimelineComponent.write$Self$purchases_defaultsBc8Release(timelineComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

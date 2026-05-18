package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.TabsComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
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
import sb.h;
import sb.k0;
import sb.t0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TabsComponent$$serializer implements E {
    public static final TabsComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        TabsComponent$$serializer tabsComponent$$serializer = new TabsComponent$$serializer();
        INSTANCE = tabsComponent$$serializer;
        k0 k0Var = new k0("tabs", tabsComponent$$serializer, 13);
        k0Var.o("visible", true);
        k0Var.o("size", true);
        k0Var.o("padding", true);
        k0Var.o("margin", true);
        k0Var.o("background_color", true);
        k0Var.o("background", true);
        k0Var.o("shape", true);
        k0Var.o("border", true);
        k0Var.o("shadow", true);
        k0Var.o("control", false);
        k0Var.o("tabs", false);
        k0Var.o("default_tab_id", true);
        k0Var.o("overrides", true);
        descriptor = k0Var;
    }

    private TabsComponent$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = TabsComponent.access$get$childSerializers$cp();
        b p = a.p(h.a);
        b p2 = a.p(ColorScheme$$serializer.INSTANCE);
        b p3 = a.p(BackgroundDeserializer.INSTANCE);
        b p4 = a.p(ShapeDeserializer.INSTANCE);
        b p5 = a.p(Border$$serializer.INSTANCE);
        b p6 = a.p(Shadow$$serializer.INSTANCE);
        b bVar = access$get$childSerializers$cp[9];
        b bVar2 = access$get$childSerializers$cp[10];
        b p7 = a.p(x0.a);
        b bVar3 = access$get$childSerializers$cp[12];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{p, Size$$serializer.INSTANCE, padding$$serializer, padding$$serializer, p2, p3, p4, p5, p6, bVar, bVar2, p7, bVar3};
    }

    public TabsComponent deserialize(rb.e eVar) {
        Boolean bool;
        int i;
        Shadow shadow;
        Border border;
        Shape shape;
        ColorScheme colorScheme;
        TabsComponent.TabControl tabControl;
        Background background;
        Padding padding;
        String str;
        List list;
        List list2;
        Padding padding2;
        Size size;
        ob.a[] aVarArr;
        Boolean bool2;
        Size size2;
        Padding padding3;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = TabsComponent.access$get$childSerializers$cp();
        if (b.m()) {
            Boolean bool3 = (Boolean) b.A(descriptor2, 0, h.a, (Object) null);
            Size size3 = (Size) b.e(descriptor2, 1, Size$$serializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding4 = (Padding) b.e(descriptor2, 2, padding$$serializer, (Object) null);
            Padding padding5 = (Padding) b.e(descriptor2, 3, padding$$serializer, (Object) null);
            ColorScheme colorScheme2 = (ColorScheme) b.A(descriptor2, 4, ColorScheme$$serializer.INSTANCE, (Object) null);
            Background background2 = (Background) b.A(descriptor2, 5, BackgroundDeserializer.INSTANCE, (Object) null);
            Shape shape2 = (Shape) b.A(descriptor2, 6, ShapeDeserializer.INSTANCE, (Object) null);
            Border border2 = (Border) b.A(descriptor2, 7, Border$$serializer.INSTANCE, (Object) null);
            Shadow shadow2 = (Shadow) b.A(descriptor2, 8, Shadow$$serializer.INSTANCE, (Object) null);
            TabsComponent.TabControl tabControl2 = (TabsComponent.TabControl) b.e(descriptor2, 9, access$get$childSerializers$cp[9], (Object) null);
            List list3 = (List) b.e(descriptor2, 10, access$get$childSerializers$cp[10], (Object) null);
            String str2 = (String) b.A(descriptor2, 11, x0.a, (Object) null);
            list2 = (List) b.e(descriptor2, 12, access$get$childSerializers$cp[12], (Object) null);
            str = str2;
            i = 8191;
            border = border2;
            shape = shape2;
            background = background2;
            padding = padding5;
            shadow = shadow2;
            colorScheme = colorScheme2;
            padding2 = padding4;
            size = size3;
            list = list3;
            tabControl = tabControl2;
            bool = bool3;
        } else {
            Shadow shadow3 = null;
            Border border3 = null;
            Shape shape3 = null;
            ColorScheme colorScheme3 = null;
            TabsComponent.TabControl tabControl3 = null;
            Background background3 = null;
            Padding padding6 = null;
            String str3 = null;
            List list4 = null;
            Boolean bool4 = null;
            List list5 = null;
            boolean z = true;
            Padding padding7 = null;
            int i2 = 0;
            Size size4 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        aVarArr = access$get$childSerializers$cp;
                        bool2 = bool4;
                        z = false;
                        padding7 = padding7;
                        access$get$childSerializers$cp = aVarArr;
                        bool4 = bool2;
                    case 0:
                        aVarArr = access$get$childSerializers$cp;
                        bool2 = (Boolean) b.A(descriptor2, 0, h.a, bool4);
                        i2 |= 1;
                        padding7 = padding7;
                        size4 = size4;
                        access$get$childSerializers$cp = aVarArr;
                        bool4 = bool2;
                    case 1:
                        size4 = (Size) b.e(descriptor2, 1, Size$$serializer.INSTANCE, size4);
                        i2 |= 2;
                        padding7 = padding7;
                        access$get$childSerializers$cp = access$get$childSerializers$cp;
                    case 2:
                        ob.a[] aVarArr2 = access$get$childSerializers$cp;
                        i2 |= 4;
                        size4 = size4;
                        padding7 = (Padding) b.e(descriptor2, 2, Padding$$serializer.INSTANCE, padding7);
                        access$get$childSerializers$cp = aVarArr2;
                    case 3:
                        size2 = size4;
                        padding3 = padding7;
                        padding6 = (Padding) b.e(descriptor2, 3, Padding$$serializer.INSTANCE, padding6);
                        i2 |= 8;
                        size4 = size2;
                        padding7 = padding3;
                    case 4:
                        size2 = size4;
                        padding3 = padding7;
                        colorScheme3 = (ColorScheme) b.A(descriptor2, 4, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i2 |= 16;
                        size4 = size2;
                        padding7 = padding3;
                    case 5:
                        size2 = size4;
                        padding3 = padding7;
                        background3 = (Background) b.A(descriptor2, 5, BackgroundDeserializer.INSTANCE, background3);
                        i2 |= 32;
                        size4 = size2;
                        padding7 = padding3;
                    case 6:
                        size2 = size4;
                        padding3 = padding7;
                        shape3 = (Shape) b.A(descriptor2, 6, ShapeDeserializer.INSTANCE, shape3);
                        i2 |= 64;
                        size4 = size2;
                        padding7 = padding3;
                    case 7:
                        size2 = size4;
                        padding3 = padding7;
                        border3 = (Border) b.A(descriptor2, 7, Border$$serializer.INSTANCE, border3);
                        i2 |= 128;
                        size4 = size2;
                        padding7 = padding3;
                    case 8:
                        size2 = size4;
                        padding3 = padding7;
                        shadow3 = (Shadow) b.A(descriptor2, 8, Shadow$$serializer.INSTANCE, shadow3);
                        i2 |= 256;
                        size4 = size2;
                        padding7 = padding3;
                    case 9:
                        size2 = size4;
                        padding3 = padding7;
                        tabControl3 = (TabsComponent.TabControl) b.e(descriptor2, 9, access$get$childSerializers$cp[9], tabControl3);
                        i2 |= 512;
                        size4 = size2;
                        padding7 = padding3;
                    case 10:
                        size2 = size4;
                        padding3 = padding7;
                        list4 = (List) b.e(descriptor2, 10, access$get$childSerializers$cp[10], list4);
                        i2 |= 1024;
                        size4 = size2;
                        padding7 = padding3;
                    case 11:
                        size2 = size4;
                        padding3 = padding7;
                        str3 = (String) b.A(descriptor2, 11, x0.a, str3);
                        i2 |= 2048;
                        size4 = size2;
                        padding7 = padding3;
                    case 12:
                        list5 = (List) b.e(descriptor2, 12, access$get$childSerializers$cp[12], list5);
                        i2 |= 4096;
                        size4 = size4;
                        padding7 = padding7;
                    default:
                        throw new m(v);
                }
            }
            bool = bool4;
            i = i2;
            shadow = shadow3;
            border = border3;
            shape = shape3;
            colorScheme = colorScheme3;
            tabControl = tabControl3;
            background = background3;
            padding = padding6;
            str = str3;
            list = list4;
            list2 = list5;
            padding2 = padding7;
            size = size4;
        }
        b.c(descriptor2);
        return new TabsComponent(i, bool, size, padding2, padding, colorScheme, background, shape, border, shadow, tabControl, list, str, list2, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, TabsComponent tabsComponent) {
        t.g(fVar, "encoder");
        t.g(tabsComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        TabsComponent.write$Self$purchases_defaultsBc8Release(tabsComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

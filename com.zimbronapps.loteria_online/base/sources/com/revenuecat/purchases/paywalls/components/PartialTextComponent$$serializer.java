package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.FontAlias;
import com.revenuecat.purchases.FontAlias$$serializer;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.FontWeightDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignmentDeserializer;
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

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialTextComponent$$serializer implements E {
    public static final PartialTextComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PartialTextComponent$$serializer partialTextComponent$$serializer = new PartialTextComponent$$serializer();
        INSTANCE = partialTextComponent$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.PartialTextComponent", partialTextComponent$$serializer, 12);
        k0Var.o("visible", true);
        k0Var.o("text_lid", true);
        k0Var.o("color", true);
        k0Var.o("background_color", true);
        k0Var.o("font_name", true);
        k0Var.o("font_weight", true);
        k0Var.o("font_weight_int", true);
        k0Var.o("font_size", true);
        k0Var.o("horizontal_alignment", true);
        k0Var.o("size", true);
        k0Var.o("padding", true);
        k0Var.o("margin", true);
        descriptor = k0Var;
    }

    private PartialTextComponent$$serializer() {
    }

    public b[] childSerializers() {
        b p = a.p(h.a);
        b p2 = a.p(LocalizationKey$$serializer.INSTANCE);
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        b p3 = a.p(colorScheme$$serializer);
        b p4 = a.p(colorScheme$$serializer);
        b p5 = a.p(FontAlias$$serializer.INSTANCE);
        b p6 = a.p(FontWeightDeserializer.INSTANCE);
        b p7 = a.p(J.a);
        b p8 = a.p(FontSizeSerializer.INSTANCE);
        b p9 = a.p(HorizontalAlignmentDeserializer.INSTANCE);
        b p10 = a.p(Size$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{p, p2, p3, p4, p5, p6, p7, p8, p9, p10, a.p(padding$$serializer), a.p(padding$$serializer)};
    }

    public PartialTextComponent deserialize(rb.e eVar) {
        Boolean bool;
        ColorScheme colorScheme;
        ColorScheme colorScheme2;
        int i;
        HorizontalAlignment horizontalAlignment;
        Integer num;
        FontWeight fontWeight;
        Integer num2;
        Size size;
        Padding padding;
        Padding padding2;
        String str;
        String str2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 8;
        Padding padding3 = null;
        if (b.m()) {
            Boolean bool2 = (Boolean) b.A(descriptor2, 0, h.a, (Object) null);
            LocalizationKey localizationKey = (LocalizationKey) b.A(descriptor2, 1, LocalizationKey$$serializer.INSTANCE, (Object) null);
            String str3 = localizationKey != null ? localizationKey.unbox-impl() : null;
            ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
            ColorScheme colorScheme3 = (ColorScheme) b.A(descriptor2, 2, colorScheme$$serializer, (Object) null);
            ColorScheme colorScheme4 = (ColorScheme) b.A(descriptor2, 3, colorScheme$$serializer, (Object) null);
            FontAlias fontAlias = (FontAlias) b.A(descriptor2, 4, FontAlias$$serializer.INSTANCE, (Object) null);
            String str4 = fontAlias != null ? fontAlias.unbox-impl() : null;
            FontWeight fontWeight2 = (FontWeight) b.A(descriptor2, 5, FontWeightDeserializer.INSTANCE, (Object) null);
            Integer num3 = (Integer) b.A(descriptor2, 6, J.a, (Object) null);
            Integer num4 = (Integer) b.A(descriptor2, 7, FontSizeSerializer.INSTANCE, (Object) null);
            HorizontalAlignment horizontalAlignment2 = (HorizontalAlignment) b.A(descriptor2, 8, HorizontalAlignmentDeserializer.INSTANCE, (Object) null);
            Size size2 = (Size) b.A(descriptor2, 9, Size$$serializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding4 = (Padding) b.A(descriptor2, 10, padding$$serializer, (Object) null);
            bool = bool2;
            padding2 = (Padding) b.A(descriptor2, 11, padding$$serializer, (Object) null);
            padding = padding4;
            size = size2;
            num2 = num4;
            num = num3;
            fontWeight = fontWeight2;
            colorScheme2 = colorScheme4;
            horizontalAlignment = horizontalAlignment2;
            str = str4;
            colorScheme = colorScheme3;
            str2 = str3;
            i = 4095;
        } else {
            boolean z = true;
            int i6 = 0;
            Boolean bool3 = null;
            HorizontalAlignment horizontalAlignment3 = null;
            Integer num5 = null;
            FontWeight fontWeight3 = null;
            Integer num6 = null;
            Size size3 = null;
            Padding padding5 = null;
            ColorScheme colorScheme5 = null;
            String str5 = null;
            ColorScheme colorScheme6 = null;
            String str6 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 0:
                        bool3 = (Boolean) b.A(descriptor2, 0, h.a, bool3);
                        i6 |= 1;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 1:
                        ColorScheme colorScheme7 = colorScheme5;
                        ColorScheme colorScheme8 = colorScheme6;
                        LocalizationKey localizationKey2 = (LocalizationKey) b.A(descriptor2, 1, LocalizationKey$$serializer.INSTANCE, str6 != null ? LocalizationKey.box-impl(str6) : null);
                        str6 = localizationKey2 != null ? localizationKey2.unbox-impl() : null;
                        i6 |= 2;
                        colorScheme6 = colorScheme8;
                        colorScheme5 = colorScheme7;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 8;
                    case 2:
                        colorScheme6 = (ColorScheme) b.A(descriptor2, 2, ColorScheme$$serializer.INSTANCE, colorScheme6);
                        i6 |= 4;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                    case 3:
                        colorScheme5 = (ColorScheme) b.A(descriptor2, 3, ColorScheme$$serializer.INSTANCE, colorScheme5);
                        i6 |= 8;
                        i2 = 11;
                        i3 = 10;
                    case 4:
                        FontAlias fontAlias2 = (FontAlias) b.A(descriptor2, 4, FontAlias$$serializer.INSTANCE, str5 != null ? FontAlias.box-impl(str5) : null);
                        str5 = fontAlias2 != null ? fontAlias2.unbox-impl() : null;
                        i6 |= 16;
                        i2 = 11;
                        i3 = 10;
                    case 5:
                        fontWeight3 = (FontWeight) b.A(descriptor2, 5, FontWeightDeserializer.INSTANCE, fontWeight3);
                        i6 |= 32;
                        i2 = 11;
                    case 6:
                        num5 = (Integer) b.A(descriptor2, 6, J.a, num5);
                        i6 |= 64;
                        i2 = 11;
                    case 7:
                        num6 = (Integer) b.A(descriptor2, 7, FontSizeSerializer.INSTANCE, num6);
                        i6 |= 128;
                        i2 = 11;
                    case 8:
                        horizontalAlignment3 = (HorizontalAlignment) b.A(descriptor2, i5, HorizontalAlignmentDeserializer.INSTANCE, horizontalAlignment3);
                        i6 |= 256;
                    case 9:
                        size3 = (Size) b.A(descriptor2, i4, Size$$serializer.INSTANCE, size3);
                        i6 |= 512;
                    case 10:
                        padding5 = (Padding) b.A(descriptor2, i3, Padding$$serializer.INSTANCE, padding5);
                        i6 |= 1024;
                    case 11:
                        padding3 = (Padding) b.A(descriptor2, i2, Padding$$serializer.INSTANCE, padding3);
                        i6 |= 2048;
                    default:
                        throw new m(v);
                }
            }
            bool = bool3;
            colorScheme = colorScheme6;
            colorScheme2 = colorScheme5;
            i = i6;
            horizontalAlignment = horizontalAlignment3;
            num = num5;
            fontWeight = fontWeight3;
            num2 = num6;
            size = size3;
            padding = padding5;
            padding2 = padding3;
            str = str5;
            str2 = str6;
        }
        b.c(descriptor2);
        return new PartialTextComponent(i, bool, str2, colorScheme, colorScheme2, str, fontWeight, num, num2, horizontalAlignment, size, padding, padding2, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PartialTextComponent partialTextComponent) {
        t.g(fVar, "encoder");
        t.g(partialTextComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PartialTextComponent.write$Self$purchases_defaultsBc8Release(partialTextComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

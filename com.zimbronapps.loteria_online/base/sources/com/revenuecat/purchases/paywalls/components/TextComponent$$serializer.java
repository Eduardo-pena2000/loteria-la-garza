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

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TextComponent$$serializer implements E {
    public static final TextComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        TextComponent$$serializer textComponent$$serializer = new TextComponent$$serializer();
        INSTANCE = textComponent$$serializer;
        k0 k0Var = new k0("text", textComponent$$serializer, 13);
        k0Var.o("text_lid", false);
        k0Var.o("color", false);
        k0Var.o("visible", true);
        k0Var.o("background_color", true);
        k0Var.o("font_name", true);
        k0Var.o("font_weight", true);
        k0Var.o("font_weight_int", true);
        k0Var.o("font_size", true);
        k0Var.o("horizontal_alignment", true);
        k0Var.o("size", true);
        k0Var.o("padding", true);
        k0Var.o("margin", true);
        k0Var.o("overrides", true);
        descriptor = k0Var;
    }

    private TextComponent$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = TextComponent.access$get$childSerializers$cp();
        b bVar = ColorScheme$$serializer.INSTANCE;
        b p = a.p(h.a);
        b p2 = a.p(bVar);
        b p3 = a.p(FontAlias$$serializer.INSTANCE);
        b p4 = a.p(J.a);
        b bVar2 = access$get$childSerializers$cp[12];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{LocalizationKey$$serializer.INSTANCE, bVar, p, p2, p3, FontWeightDeserializer.INSTANCE, p4, FontSizeSerializer.INSTANCE, HorizontalAlignmentDeserializer.INSTANCE, Size$$serializer.INSTANCE, padding$$serializer, padding$$serializer, bVar2};
    }

    public TextComponent deserialize(rb.e eVar) {
        Padding padding;
        List list;
        String str;
        Boolean bool;
        Padding padding2;
        Size size;
        FontWeight fontWeight;
        ColorScheme colorScheme;
        HorizontalAlignment horizontalAlignment;
        Integer num;
        int i;
        ColorScheme colorScheme2;
        int i2;
        String str2;
        ob.a[] aVarArr;
        int i3;
        LocalizationKey localizationKey;
        char c;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = TextComponent.access$get$childSerializers$cp();
        int i4 = 8;
        int i5 = 0;
        Padding padding3 = null;
        if (b.m()) {
            LocalizationKey localizationKey2 = (LocalizationKey) b.e(descriptor2, 0, LocalizationKey$$serializer.INSTANCE, (Object) null);
            String str3 = localizationKey2 != null ? localizationKey2.unbox-impl() : null;
            ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
            ColorScheme colorScheme3 = (ColorScheme) b.e(descriptor2, 1, colorScheme$$serializer, (Object) null);
            Boolean bool2 = (Boolean) b.A(descriptor2, 2, h.a, (Object) null);
            ColorScheme colorScheme4 = (ColorScheme) b.A(descriptor2, 3, colorScheme$$serializer, (Object) null);
            FontAlias fontAlias = (FontAlias) b.A(descriptor2, 4, FontAlias$$serializer.INSTANCE, (Object) null);
            String str4 = fontAlias != null ? fontAlias.unbox-impl() : null;
            FontWeight fontWeight2 = (FontWeight) b.e(descriptor2, 5, FontWeightDeserializer.INSTANCE, (Object) null);
            Integer num2 = (Integer) b.A(descriptor2, 6, J.a, (Object) null);
            int intValue = ((Number) b.e(descriptor2, 7, FontSizeSerializer.INSTANCE, 0)).intValue();
            HorizontalAlignment horizontalAlignment2 = (HorizontalAlignment) b.e(descriptor2, 8, HorizontalAlignmentDeserializer.INSTANCE, (Object) null);
            Size size2 = (Size) b.e(descriptor2, 9, Size$$serializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding4 = (Padding) b.e(descriptor2, 10, padding$$serializer, (Object) null);
            String str5 = str3;
            Padding padding5 = (Padding) b.e(descriptor2, 11, padding$$serializer, (Object) null);
            list = (List) b.e(descriptor2, 12, access$get$childSerializers$cp[12], (Object) null);
            padding = padding5;
            i = 8191;
            colorScheme2 = colorScheme4;
            bool = bool2;
            i2 = intValue;
            num = num2;
            fontWeight = fontWeight2;
            str2 = str4;
            horizontalAlignment = horizontalAlignment2;
            size = size2;
            padding2 = padding4;
            colorScheme = colorScheme3;
            str = str5;
        } else {
            int i6 = 12;
            List list2 = null;
            String str6 = null;
            Padding padding6 = null;
            Size size3 = null;
            FontWeight fontWeight3 = null;
            HorizontalAlignment horizontalAlignment3 = null;
            Integer num3 = null;
            Boolean bool3 = null;
            String str7 = null;
            ColorScheme colorScheme5 = null;
            int i7 = 0;
            boolean z = true;
            ColorScheme colorScheme6 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        access$get$childSerializers$cp = access$get$childSerializers$cp;
                        i4 = 8;
                    case 0:
                        aVarArr = access$get$childSerializers$cp;
                        Boolean bool4 = bool3;
                        ColorScheme colorScheme7 = colorScheme5;
                        LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
                        if (str6 != null) {
                            localizationKey = LocalizationKey.box-impl(str6);
                            i3 = 0;
                        } else {
                            i3 = 0;
                            localizationKey = null;
                        }
                        LocalizationKey localizationKey3 = (LocalizationKey) b.e(descriptor2, i3, localizationKey$$serializer, localizationKey);
                        str6 = localizationKey3 != null ? localizationKey3.unbox-impl() : null;
                        i5 |= 1;
                        bool3 = bool4;
                        colorScheme5 = colorScheme7;
                        access$get$childSerializers$cp = aVarArr;
                        i6 = 12;
                        i4 = 8;
                    case 1:
                        aVarArr = access$get$childSerializers$cp;
                        colorScheme5 = (ColorScheme) b.e(descriptor2, 1, ColorScheme$$serializer.INSTANCE, colorScheme5);
                        i5 |= 2;
                        access$get$childSerializers$cp = aVarArr;
                        i6 = 12;
                        i4 = 8;
                    case 2:
                        bool3 = (Boolean) b.A(descriptor2, 2, h.a, bool3);
                        i5 |= 4;
                        i6 = 12;
                        i4 = 8;
                    case 3:
                        colorScheme6 = (ColorScheme) b.A(descriptor2, 3, ColorScheme$$serializer.INSTANCE, colorScheme6);
                        i5 |= 8;
                        i6 = 12;
                        i4 = 8;
                    case 4:
                        FontAlias fontAlias2 = (FontAlias) b.A(descriptor2, 4, FontAlias$$serializer.INSTANCE, str7 != null ? FontAlias.box-impl(str7) : null);
                        str7 = fontAlias2 != null ? fontAlias2.unbox-impl() : null;
                        i5 |= 16;
                        i6 = 12;
                        i4 = 8;
                    case 5:
                        c = 7;
                        fontWeight3 = (FontWeight) b.e(descriptor2, 5, FontWeightDeserializer.INSTANCE, fontWeight3);
                        i5 |= 32;
                        i6 = 12;
                        i4 = 8;
                    case 6:
                        c = 7;
                        num3 = (Integer) b.A(descriptor2, 6, J.a, num3);
                        i5 |= 64;
                        i6 = 12;
                        i4 = 8;
                    case 7:
                        c = 7;
                        i7 = ((Number) b.e(descriptor2, 7, FontSizeSerializer.INSTANCE, Integer.valueOf(i7))).intValue();
                        i5 |= 128;
                        i6 = 12;
                        i4 = 8;
                    case 8:
                        horizontalAlignment3 = (HorizontalAlignment) b.e(descriptor2, i4, HorizontalAlignmentDeserializer.INSTANCE, horizontalAlignment3);
                        i5 |= 256;
                        i6 = 12;
                    case 9:
                        size3 = (Size) b.e(descriptor2, 9, Size$$serializer.INSTANCE, size3);
                        i5 |= 512;
                        i6 = 12;
                    case 10:
                        padding6 = (Padding) b.e(descriptor2, 10, Padding$$serializer.INSTANCE, padding6);
                        i5 |= 1024;
                        i6 = 12;
                    case 11:
                        padding3 = (Padding) b.e(descriptor2, 11, Padding$$serializer.INSTANCE, padding3);
                        i5 |= 2048;
                        i6 = 12;
                    case 12:
                        list2 = (List) b.e(descriptor2, i6, access$get$childSerializers$cp[i6], list2);
                        i5 |= 4096;
                    default:
                        throw new m(v);
                }
            }
            padding = padding3;
            list = list2;
            str = str6;
            bool = bool3;
            padding2 = padding6;
            size = size3;
            fontWeight = fontWeight3;
            colorScheme = colorScheme5;
            horizontalAlignment = horizontalAlignment3;
            num = num3;
            i = i5;
            colorScheme2 = colorScheme6;
            i2 = i7;
            str2 = str7;
        }
        b.c(descriptor2);
        return new TextComponent(i, str, colorScheme, bool, colorScheme2, str2, fontWeight, num, i2, horizontalAlignment, size, padding2, padding, list, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, TextComponent textComponent) {
        t.g(fVar, "encoder");
        t.g(textComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        TextComponent.write$Self$purchases_defaultsBc8Release(textComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

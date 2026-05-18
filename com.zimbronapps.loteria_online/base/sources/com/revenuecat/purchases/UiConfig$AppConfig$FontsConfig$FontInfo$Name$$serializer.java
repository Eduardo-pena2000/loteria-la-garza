package com.revenuecat.purchases;

import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.components.properties.FontStyle;
import com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer;
import kotlin.jvm.internal.t;
import sb.E;
import sb.J;
import sb.k0;
import sb.t0;
import sb.x0;

@Ca.e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer implements E {
    public static final UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer uiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer = new UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer();
        INSTANCE = uiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer;
        k0 k0Var = new k0("name", uiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer, 6);
        k0Var.o("value", false);
        k0Var.o("url", true);
        k0Var.o("hash", true);
        k0Var.o("family", true);
        k0Var.o("weight", true);
        k0Var.o("style", true);
        descriptor = k0Var;
    }

    private UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer() {
    }

    public ob.b[] childSerializers() {
        ob.b bVar = x0.a;
        return new ob.b[]{bVar, pb.a.p(bVar), pb.a.p(bVar), pb.a.p(bVar), pb.a.p(J.a), pb.a.p(FontStyleDeserializer.INSTANCE)};
    }

    public UiConfig.AppConfig.FontsConfig.FontInfo.Name deserialize(rb.e eVar) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        FontStyle fontStyle;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        rb.c b = eVar.b(descriptor2);
        String str5 = null;
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            x0 x0Var = x0.a;
            String str6 = (String) b.A(descriptor2, 1, x0Var, (Object) null);
            String str7 = (String) b.A(descriptor2, 2, x0Var, (Object) null);
            String str8 = (String) b.A(descriptor2, 3, x0Var, (Object) null);
            Integer num2 = (Integer) b.A(descriptor2, 4, J.a, (Object) null);
            str = o;
            fontStyle = (FontStyle) b.A(descriptor2, 5, FontStyleDeserializer.INSTANCE, (Object) null);
            str4 = str8;
            num = num2;
            str3 = str7;
            str2 = str6;
            i = 63;
        } else {
            boolean z = true;
            int i2 = 0;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            Integer num3 = null;
            FontStyle fontStyle2 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        str5 = b.o(descriptor2, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        str9 = (String) b.A(descriptor2, 1, x0.a, str9);
                        i2 |= 2;
                        break;
                    case 2:
                        str10 = (String) b.A(descriptor2, 2, x0.a, str10);
                        i2 |= 4;
                        break;
                    case 3:
                        str11 = (String) b.A(descriptor2, 3, x0.a, str11);
                        i2 |= 8;
                        break;
                    case 4:
                        num3 = (Integer) b.A(descriptor2, 4, J.a, num3);
                        i2 |= 16;
                        break;
                    case 5:
                        fontStyle2 = (FontStyle) b.A(descriptor2, 5, FontStyleDeserializer.INSTANCE, fontStyle2);
                        i2 |= 32;
                        break;
                    default:
                        throw new ob.m(v);
                }
            }
            i = i2;
            str = str5;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            num = num3;
            fontStyle = fontStyle2;
        }
        b.c(descriptor2);
        return new UiConfig.AppConfig.FontsConfig.FontInfo.Name(i, str, str2, str3, str4, num, fontStyle, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(rb.f fVar, UiConfig.AppConfig.FontsConfig.FontInfo.Name name) {
        t.g(fVar, "encoder");
        t.g(name, "value");
        qb.e descriptor2 = getDescriptor();
        rb.d b = fVar.b(descriptor2);
        UiConfig.AppConfig.FontsConfig.FontInfo.Name.write$Self$purchases_defaultsBc8Release(name, b, descriptor2);
        b.c(descriptor2);
    }

    public ob.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

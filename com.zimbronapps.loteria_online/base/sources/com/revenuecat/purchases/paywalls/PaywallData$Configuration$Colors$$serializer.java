package com.revenuecat.purchases.paywalls;

import Ca.e;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallData$Configuration$Colors$$serializer implements E {
    public static final PaywallData$Configuration$Colors$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = new PaywallData$Configuration$Colors$$serializer();
        INSTANCE = paywallData$Configuration$Colors$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors", paywallData$Configuration$Colors$$serializer, 15);
        k0Var.o("background", false);
        k0Var.o("text_1", false);
        k0Var.o("text_2", true);
        k0Var.o("text_3", true);
        k0Var.o("call_to_action_background", false);
        k0Var.o("call_to_action_foreground", false);
        k0Var.o("call_to_action_secondary_background", true);
        k0Var.o("accent_1", true);
        k0Var.o("accent_2", true);
        k0Var.o("accent_3", true);
        k0Var.o("close_button", true);
        k0Var.o("tier_control_background", true);
        k0Var.o("tier_control_foreground", true);
        k0Var.o("tier_control_selected_background", true);
        k0Var.o("tier_control_selected_foreground", true);
        descriptor = k0Var;
    }

    private PaywallData$Configuration$Colors$$serializer() {
    }

    public b[] childSerializers() {
        PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
        return new b[]{serializer, serializer, pb.a.p(serializer), pb.a.p(serializer), serializer, serializer, pb.a.p(serializer), pb.a.p(serializer), pb.a.p(serializer), pb.a.p(serializer), pb.a.p(serializer), pb.a.p(serializer), pb.a.p(serializer), pb.a.p(serializer), pb.a.p(serializer)};
    }

    public PaywallData.Configuration.Colors deserialize(rb.e eVar) {
        int i;
        PaywallColor paywallColor;
        PaywallColor paywallColor2;
        PaywallColor paywallColor3;
        PaywallColor paywallColor4;
        PaywallColor paywallColor5;
        PaywallColor paywallColor6;
        PaywallColor paywallColor7;
        PaywallColor paywallColor8;
        PaywallColor paywallColor9;
        PaywallColor paywallColor10;
        PaywallColor paywallColor11;
        PaywallColor paywallColor12;
        PaywallColor paywallColor13;
        PaywallColor paywallColor14;
        PaywallColor paywallColor15;
        PaywallColor paywallColor16;
        PaywallColor paywallColor17;
        PaywallColor paywallColor18;
        PaywallColor paywallColor19;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        PaywallColor paywallColor20 = null;
        if (b.m()) {
            PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
            PaywallColor paywallColor21 = (PaywallColor) b.e(descriptor2, 0, serializer, (Object) null);
            PaywallColor paywallColor22 = (PaywallColor) b.e(descriptor2, 1, serializer, (Object) null);
            PaywallColor paywallColor23 = (PaywallColor) b.A(descriptor2, 2, serializer, (Object) null);
            PaywallColor paywallColor24 = (PaywallColor) b.A(descriptor2, 3, serializer, (Object) null);
            PaywallColor paywallColor25 = (PaywallColor) b.e(descriptor2, 4, serializer, (Object) null);
            PaywallColor paywallColor26 = (PaywallColor) b.e(descriptor2, 5, serializer, (Object) null);
            PaywallColor paywallColor27 = (PaywallColor) b.A(descriptor2, 6, serializer, (Object) null);
            PaywallColor paywallColor28 = (PaywallColor) b.A(descriptor2, 7, serializer, (Object) null);
            PaywallColor paywallColor29 = (PaywallColor) b.A(descriptor2, 8, serializer, (Object) null);
            PaywallColor paywallColor30 = (PaywallColor) b.A(descriptor2, 9, serializer, (Object) null);
            PaywallColor paywallColor31 = (PaywallColor) b.A(descriptor2, 10, serializer, (Object) null);
            PaywallColor paywallColor32 = (PaywallColor) b.A(descriptor2, 11, serializer, (Object) null);
            PaywallColor paywallColor33 = (PaywallColor) b.A(descriptor2, 12, serializer, (Object) null);
            PaywallColor paywallColor34 = (PaywallColor) b.A(descriptor2, 13, serializer, (Object) null);
            paywallColor15 = (PaywallColor) b.A(descriptor2, 14, serializer, (Object) null);
            i = 32767;
            paywallColor = paywallColor21;
            paywallColor4 = paywallColor32;
            paywallColor5 = paywallColor31;
            paywallColor10 = paywallColor30;
            paywallColor7 = paywallColor28;
            paywallColor8 = paywallColor27;
            paywallColor11 = paywallColor26;
            paywallColor14 = paywallColor24;
            paywallColor6 = paywallColor29;
            paywallColor9 = paywallColor25;
            paywallColor13 = paywallColor23;
            paywallColor2 = paywallColor34;
            paywallColor3 = paywallColor33;
            paywallColor12 = paywallColor22;
        } else {
            boolean z = true;
            int i2 = 0;
            PaywallColor paywallColor35 = null;
            PaywallColor paywallColor36 = null;
            PaywallColor paywallColor37 = null;
            PaywallColor paywallColor38 = null;
            PaywallColor paywallColor39 = null;
            PaywallColor paywallColor40 = null;
            PaywallColor paywallColor41 = null;
            PaywallColor paywallColor42 = null;
            PaywallColor paywallColor43 = null;
            PaywallColor paywallColor44 = null;
            PaywallColor paywallColor45 = null;
            PaywallColor paywallColor46 = null;
            PaywallColor paywallColor47 = null;
            PaywallColor paywallColor48 = null;
            while (z) {
                PaywallColor paywallColor49 = paywallColor35;
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        paywallColor17 = paywallColor36;
                        paywallColor18 = paywallColor46;
                        paywallColor19 = paywallColor49;
                        z = false;
                        paywallColor35 = paywallColor19;
                        paywallColor46 = paywallColor18;
                        paywallColor36 = paywallColor17;
                    case 0:
                        paywallColor17 = paywallColor36;
                        paywallColor18 = paywallColor46;
                        paywallColor19 = paywallColor49;
                        paywallColor47 = (PaywallColor) b.e(descriptor2, 0, PaywallColor.Serializer.INSTANCE, paywallColor47);
                        i2 |= 1;
                        paywallColor48 = paywallColor48;
                        paywallColor35 = paywallColor19;
                        paywallColor46 = paywallColor18;
                        paywallColor36 = paywallColor17;
                    case 1:
                        paywallColor17 = paywallColor36;
                        paywallColor18 = paywallColor46;
                        paywallColor19 = paywallColor49;
                        paywallColor48 = (PaywallColor) b.e(descriptor2, 1, PaywallColor.Serializer.INSTANCE, paywallColor48);
                        i2 |= 2;
                        paywallColor35 = paywallColor19;
                        paywallColor46 = paywallColor18;
                        paywallColor36 = paywallColor17;
                    case 2:
                        paywallColor17 = paywallColor36;
                        paywallColor18 = paywallColor46;
                        paywallColor35 = (PaywallColor) b.A(descriptor2, 2, PaywallColor.Serializer.INSTANCE, paywallColor49);
                        i2 |= 4;
                        paywallColor46 = paywallColor18;
                        paywallColor36 = paywallColor17;
                    case 3:
                        i2 |= 8;
                        paywallColor46 = (PaywallColor) b.A(descriptor2, 3, PaywallColor.Serializer.INSTANCE, paywallColor46);
                        paywallColor36 = paywallColor36;
                        paywallColor35 = paywallColor49;
                    case 4:
                        paywallColor16 = paywallColor46;
                        paywallColor43 = (PaywallColor) b.e(descriptor2, 4, PaywallColor.Serializer.INSTANCE, paywallColor43);
                        i2 |= 16;
                        paywallColor35 = paywallColor49;
                        paywallColor46 = paywallColor16;
                    case 5:
                        paywallColor16 = paywallColor46;
                        paywallColor45 = (PaywallColor) b.e(descriptor2, 5, PaywallColor.Serializer.INSTANCE, paywallColor45);
                        i2 |= 32;
                        paywallColor35 = paywallColor49;
                        paywallColor46 = paywallColor16;
                    case 6:
                        paywallColor16 = paywallColor46;
                        paywallColor42 = (PaywallColor) b.A(descriptor2, 6, PaywallColor.Serializer.INSTANCE, paywallColor42);
                        i2 |= 64;
                        paywallColor35 = paywallColor49;
                        paywallColor46 = paywallColor16;
                    case 7:
                        paywallColor16 = paywallColor46;
                        paywallColor41 = (PaywallColor) b.A(descriptor2, 7, PaywallColor.Serializer.INSTANCE, paywallColor41);
                        i2 |= 128;
                        paywallColor35 = paywallColor49;
                        paywallColor46 = paywallColor16;
                    case 8:
                        paywallColor16 = paywallColor46;
                        paywallColor40 = (PaywallColor) b.A(descriptor2, 8, PaywallColor.Serializer.INSTANCE, paywallColor40);
                        i2 |= 256;
                        paywallColor35 = paywallColor49;
                        paywallColor46 = paywallColor16;
                    case 9:
                        paywallColor16 = paywallColor46;
                        paywallColor44 = (PaywallColor) b.A(descriptor2, 9, PaywallColor.Serializer.INSTANCE, paywallColor44);
                        i2 |= 512;
                        paywallColor35 = paywallColor49;
                        paywallColor46 = paywallColor16;
                    case 10:
                        paywallColor16 = paywallColor46;
                        paywallColor39 = (PaywallColor) b.A(descriptor2, 10, PaywallColor.Serializer.INSTANCE, paywallColor39);
                        i2 |= 1024;
                        paywallColor35 = paywallColor49;
                        paywallColor46 = paywallColor16;
                    case 11:
                        paywallColor16 = paywallColor46;
                        paywallColor38 = (PaywallColor) b.A(descriptor2, 11, PaywallColor.Serializer.INSTANCE, paywallColor38);
                        i2 |= 2048;
                        paywallColor35 = paywallColor49;
                        paywallColor46 = paywallColor16;
                    case 12:
                        paywallColor16 = paywallColor46;
                        paywallColor37 = (PaywallColor) b.A(descriptor2, 12, PaywallColor.Serializer.INSTANCE, paywallColor37);
                        i2 |= 4096;
                        paywallColor35 = paywallColor49;
                        paywallColor46 = paywallColor16;
                    case 13:
                        paywallColor16 = paywallColor46;
                        paywallColor20 = (PaywallColor) b.A(descriptor2, 13, PaywallColor.Serializer.INSTANCE, paywallColor20);
                        i2 |= 8192;
                        paywallColor35 = paywallColor49;
                        paywallColor46 = paywallColor16;
                    case 14:
                        paywallColor16 = paywallColor46;
                        paywallColor36 = (PaywallColor) b.A(descriptor2, 14, PaywallColor.Serializer.INSTANCE, paywallColor36);
                        i2 |= 16384;
                        paywallColor35 = paywallColor49;
                        paywallColor46 = paywallColor16;
                    default:
                        throw new m(v);
                }
            }
            i = i2;
            paywallColor = paywallColor47;
            paywallColor2 = paywallColor20;
            paywallColor3 = paywallColor37;
            paywallColor4 = paywallColor38;
            paywallColor5 = paywallColor39;
            paywallColor6 = paywallColor40;
            paywallColor7 = paywallColor41;
            paywallColor8 = paywallColor42;
            paywallColor9 = paywallColor43;
            paywallColor10 = paywallColor44;
            paywallColor11 = paywallColor45;
            paywallColor12 = paywallColor48;
            paywallColor13 = paywallColor35;
            paywallColor14 = paywallColor46;
            paywallColor15 = paywallColor36;
        }
        b.c(descriptor2);
        return new PaywallData.Configuration.Colors(i, paywallColor, paywallColor12, paywallColor13, paywallColor14, paywallColor9, paywallColor11, paywallColor8, paywallColor7, paywallColor6, paywallColor10, paywallColor5, paywallColor4, paywallColor3, paywallColor2, paywallColor15, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallData.Configuration.Colors colors) {
        t.g(fVar, "encoder");
        t.g(colors, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallData.Configuration.Colors.write$Self$purchases_defaultsBc8Release(colors, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

package com.revenuecat.purchases.common.events;

import Ca.e;
import com.revenuecat.purchases.common.events.BackendEvent;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.J;
import sb.Q;
import sb.h;
import sb.k0;
import sb.t0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BackendEvent$Paywalls$$serializer implements E {
    public static final BackendEvent$Paywalls$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        BackendEvent$Paywalls$$serializer backendEvent$Paywalls$$serializer = new BackendEvent$Paywalls$$serializer();
        INSTANCE = backendEvent$Paywalls$$serializer;
        k0 k0Var = new k0("paywalls", backendEvent$Paywalls$$serializer, 18);
        k0Var.o("id", false);
        k0Var.o("version", false);
        k0Var.o("type", false);
        k0Var.o("app_user_id", false);
        k0Var.o("session_id", false);
        k0Var.o("offering_id", false);
        k0Var.o("paywall_id", false);
        k0Var.o("paywall_revision", false);
        k0Var.o("timestamp", false);
        k0Var.o("display_mode", false);
        k0Var.o("dark_mode", false);
        k0Var.o("locale", false);
        k0Var.o("exit_offer_type", true);
        k0Var.o("exit_offering_id", true);
        k0Var.o("package_id", true);
        k0Var.o("product_id", true);
        k0Var.o("error_code", true);
        k0Var.o("error_message", true);
        descriptor = k0Var;
    }

    private BackendEvent$Paywalls$$serializer() {
    }

    public b[] childSerializers() {
        b bVar = x0.a;
        b bVar2 = J.a;
        return new b[]{bVar, bVar2, bVar, bVar, bVar, bVar, pb.a.p(bVar), bVar2, Q.a, bVar, h.a, bVar, pb.a.p(bVar), pb.a.p(bVar), pb.a.p(bVar), pb.a.p(bVar), pb.a.p(bVar2), pb.a.p(bVar)};
    }

    public BackendEvent.Paywalls deserialize(rb.e eVar) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        Integer num;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        boolean z;
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i7 = 11;
        int i8 = 8;
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            int h = b.h(descriptor2, 1);
            String o2 = b.o(descriptor2, 2);
            String o3 = b.o(descriptor2, 3);
            String o4 = b.o(descriptor2, 4);
            String o5 = b.o(descriptor2, 5);
            x0 x0Var = x0.a;
            String str14 = (String) b.A(descriptor2, 6, x0Var, (Object) null);
            int h2 = b.h(descriptor2, 7);
            long F = b.F(descriptor2, 8);
            String o6 = b.o(descriptor2, 9);
            boolean q = b.q(descriptor2, 10);
            String o7 = b.o(descriptor2, 11);
            String str15 = (String) b.A(descriptor2, 12, x0Var, (Object) null);
            String str16 = (String) b.A(descriptor2, 13, x0Var, (Object) null);
            String str17 = (String) b.A(descriptor2, 14, x0Var, (Object) null);
            String str18 = (String) b.A(descriptor2, 15, x0Var, (Object) null);
            num = (Integer) b.A(descriptor2, 16, J.a, (Object) null);
            str4 = (String) b.A(descriptor2, 17, x0Var, (Object) null);
            str8 = o2;
            i = h;
            str9 = o3;
            i2 = 262143;
            str13 = o7;
            z = q;
            str2 = str15;
            i3 = h2;
            str3 = str14;
            str11 = o5;
            str10 = o4;
            str6 = str18;
            str5 = str17;
            str = str16;
            str7 = o;
            j = F;
            str12 = o6;
        } else {
            boolean z2 = true;
            int i9 = 0;
            boolean z3 = false;
            int i10 = 0;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            Integer num2 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            long j2 = 0;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            int i11 = 0;
            while (z2) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        i4 = i8;
                        z2 = false;
                        i8 = i4;
                    case 0:
                        i5 = i8;
                        str29 = b.o(descriptor2, 0);
                        i11 |= 1;
                        i8 = i5;
                        i7 = 11;
                    case 1:
                        i11 |= 2;
                        i8 = i8;
                        i9 = b.h(descriptor2, 1);
                        i7 = 11;
                    case 2:
                        i5 = i8;
                        str30 = b.o(descriptor2, 2);
                        i11 |= 4;
                        i8 = i5;
                        i7 = 11;
                    case 3:
                        i5 = i8;
                        str24 = b.o(descriptor2, 3);
                        i11 |= 8;
                        i8 = i5;
                        i7 = 11;
                    case 4:
                        i5 = i8;
                        str25 = b.o(descriptor2, 4);
                        i11 |= 16;
                        i8 = i5;
                        i7 = 11;
                    case 5:
                        i5 = i8;
                        str26 = b.o(descriptor2, 5);
                        i11 |= 32;
                        i8 = i5;
                        i7 = 11;
                    case 6:
                        i5 = i8;
                        str31 = (String) b.A(descriptor2, 6, x0.a, str31);
                        i11 |= 64;
                        i8 = i5;
                        i7 = 11;
                    case 7:
                        i10 = b.h(descriptor2, 7);
                        i11 |= 128;
                        i8 = i8;
                    case 8:
                        i4 = i8;
                        j2 = b.F(descriptor2, i4);
                        i11 |= 256;
                        i8 = i4;
                    case 9:
                        str27 = b.o(descriptor2, 9);
                        i11 |= 512;
                        i8 = 8;
                    case 10:
                        z3 = b.q(descriptor2, 10);
                        i11 |= 1024;
                        i8 = 8;
                    case 11:
                        str28 = b.o(descriptor2, i7);
                        i11 |= 2048;
                        i8 = 8;
                    case 12:
                        str20 = (String) b.A(descriptor2, 12, x0.a, str20);
                        i11 |= 4096;
                        i8 = 8;
                    case 13:
                        str19 = (String) b.A(descriptor2, 13, x0.a, str19);
                        i11 |= 8192;
                        i8 = 8;
                    case 14:
                        str22 = (String) b.A(descriptor2, 14, x0.a, str22);
                        i11 |= 16384;
                        i8 = 8;
                    case 15:
                        str23 = (String) b.A(descriptor2, 15, x0.a, str23);
                        i6 = 32768;
                        i11 |= i6;
                        i8 = 8;
                    case 16:
                        num2 = (Integer) b.A(descriptor2, 16, J.a, num2);
                        i6 = 65536;
                        i11 |= i6;
                        i8 = 8;
                    case 17:
                        str21 = (String) b.A(descriptor2, 17, x0.a, str21);
                        i6 = 131072;
                        i11 |= i6;
                        i8 = 8;
                    default:
                        throw new m(v);
                }
            }
            i = i9;
            str = str19;
            str2 = str20;
            str3 = str31;
            i2 = i11;
            str4 = str21;
            num = num2;
            str5 = str22;
            str6 = str23;
            str7 = str29;
            str8 = str30;
            str9 = str24;
            str10 = str25;
            str11 = str26;
            str12 = str27;
            str13 = str28;
            z = z3;
            i3 = i10;
            j = j2;
        }
        b.c(descriptor2);
        return new BackendEvent.Paywalls(i2, str7, i, str8, str9, str10, str11, str3, i3, j, str12, z, str13, str2, str, str5, str6, num, str4, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, BackendEvent.Paywalls paywalls) {
        t.g(fVar, "encoder");
        t.g(paywalls, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        BackendEvent.Paywalls.write$Self$purchases_defaultsBc8Release(paywalls, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

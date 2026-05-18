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
import sb.k0;
import sb.t0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BackendEvent$Ad$$serializer implements E {
    public static final BackendEvent$Ad$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        BackendEvent$Ad$$serializer backendEvent$Ad$$serializer = new BackendEvent$Ad$$serializer();
        INSTANCE = backendEvent$Ad$$serializer;
        k0 k0Var = new k0("ad", backendEvent$Ad$$serializer, 16);
        k0Var.o("id", false);
        k0Var.o("version", false);
        k0Var.o("type", false);
        k0Var.o("timestamp_ms", false);
        k0Var.o("network_name", true);
        k0Var.o("mediator_name", false);
        k0Var.o("ad_format", true);
        k0Var.o("placement", false);
        k0Var.o("ad_unit_id", false);
        k0Var.o("impression_id", false);
        k0Var.o("app_user_id", false);
        k0Var.o("app_session_id", false);
        k0Var.o("revenue_micros", true);
        k0Var.o("currency", true);
        k0Var.o("precision", true);
        k0Var.o("mediator_error_code", true);
        descriptor = k0Var;
    }

    private BackendEvent$Ad$$serializer() {
    }

    public b[] childSerializers() {
        b bVar = x0.a;
        b bVar2 = J.a;
        b bVar3 = Q.a;
        return new b[]{bVar, bVar2, bVar, bVar3, pb.a.p(bVar), bVar, pb.a.p(bVar), pb.a.p(bVar), bVar, pb.a.p(bVar), bVar, bVar, pb.a.p(bVar3), pb.a.p(bVar), pb.a.p(bVar), pb.a.p(bVar2)};
    }

    public BackendEvent.Ad deserialize(rb.e eVar) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        Integer num;
        String str4;
        String str5;
        String str6;
        Long l;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        long j;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i3 = 11;
        int i4 = 10;
        char c = '\t';
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            int h = b.h(descriptor2, 1);
            String o2 = b.o(descriptor2, 2);
            long F = b.F(descriptor2, 3);
            x0 x0Var = x0.a;
            String str13 = (String) b.A(descriptor2, 4, x0Var, (Object) null);
            String o3 = b.o(descriptor2, 5);
            String str14 = (String) b.A(descriptor2, 6, x0Var, (Object) null);
            String str15 = (String) b.A(descriptor2, 7, x0Var, (Object) null);
            String o4 = b.o(descriptor2, 8);
            String str16 = (String) b.A(descriptor2, 9, x0Var, (Object) null);
            String o5 = b.o(descriptor2, 10);
            String o6 = b.o(descriptor2, 11);
            Long l2 = (Long) b.A(descriptor2, 12, Q.a, (Object) null);
            String str17 = (String) b.A(descriptor2, 13, x0Var, (Object) null);
            String str18 = (String) b.A(descriptor2, 14, x0Var, (Object) null);
            num = (Integer) b.A(descriptor2, 15, J.a, (Object) null);
            str8 = o2;
            i = h;
            i2 = 65535;
            str12 = o6;
            str11 = o5;
            str6 = str16;
            str = str15;
            str2 = str14;
            str9 = o3;
            str3 = str13;
            str10 = o4;
            str5 = str17;
            str4 = str18;
            l = l2;
            j = F;
            str7 = o;
        } else {
            boolean z = true;
            int i5 = 0;
            String str19 = null;
            String str20 = null;
            Integer num2 = null;
            String str21 = null;
            String str22 = null;
            String str23 = null;
            Long l3 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            long j2 = 0;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            int i6 = 0;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        i3 = 11;
                        c = '\t';
                    case 0:
                        str28 = b.o(descriptor2, 0);
                        i6 |= 1;
                        i3 = 11;
                        i4 = 10;
                        c = '\t';
                    case 1:
                        i6 |= 2;
                        i5 = b.h(descriptor2, 1);
                        i3 = 11;
                        i4 = 10;
                        c = '\t';
                    case 2:
                        str29 = b.o(descriptor2, 2);
                        i6 |= 4;
                        i3 = 11;
                        i4 = 10;
                        c = '\t';
                    case 3:
                        j2 = b.F(descriptor2, 3);
                        i6 |= 8;
                        i3 = 11;
                        i4 = 10;
                        c = '\t';
                    case 4:
                        str30 = (String) b.A(descriptor2, 4, x0.a, str30);
                        i6 |= 16;
                        i3 = 11;
                        i4 = 10;
                        c = '\t';
                    case 5:
                        str24 = b.o(descriptor2, 5);
                        i6 |= 32;
                        i3 = 11;
                        i4 = 10;
                        c = '\t';
                    case 6:
                        str20 = (String) b.A(descriptor2, 6, x0.a, str20);
                        i6 |= 64;
                        i3 = 11;
                        i4 = 10;
                        c = '\t';
                    case 7:
                        str19 = (String) b.A(descriptor2, 7, x0.a, str19);
                        i6 |= 128;
                        i3 = 11;
                        i4 = 10;
                        c = '\t';
                    case 8:
                        str25 = b.o(descriptor2, 8);
                        i6 |= 256;
                        c = c;
                        i3 = 11;
                    case 9:
                        str23 = (String) b.A(descriptor2, 9, x0.a, str23);
                        i6 |= 512;
                        c = '\t';
                        i3 = 11;
                    case 10:
                        str26 = b.o(descriptor2, i4);
                        i6 |= 1024;
                        c = '\t';
                    case 11:
                        str27 = b.o(descriptor2, i3);
                        i6 |= 2048;
                        c = '\t';
                    case 12:
                        l3 = (Long) b.A(descriptor2, 12, Q.a, l3);
                        i6 |= 4096;
                        c = '\t';
                    case 13:
                        str22 = (String) b.A(descriptor2, 13, x0.a, str22);
                        i6 |= 8192;
                        c = '\t';
                    case 14:
                        str21 = (String) b.A(descriptor2, 14, x0.a, str21);
                        i6 |= 16384;
                        c = '\t';
                    case 15:
                        num2 = (Integer) b.A(descriptor2, 15, J.a, num2);
                        i6 |= 32768;
                        c = '\t';
                    default:
                        throw new m(v);
                }
            }
            i = i5;
            str = str19;
            str2 = str20;
            str3 = str30;
            i2 = i6;
            num = num2;
            str4 = str21;
            str5 = str22;
            str6 = str23;
            l = l3;
            str7 = str28;
            str8 = str29;
            str9 = str24;
            str10 = str25;
            str11 = str26;
            str12 = str27;
            j = j2;
        }
        b.c(descriptor2);
        return new BackendEvent.Ad(i2, str7, i, str8, j, str3, str9, str2, str, str10, str6, str11, str12, l, str5, str4, num, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, BackendEvent.Ad ad) {
        t.g(fVar, "encoder");
        t.g(ad, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        BackendEvent.Ad.write$Self$purchases_defaultsBc8Release(ad, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

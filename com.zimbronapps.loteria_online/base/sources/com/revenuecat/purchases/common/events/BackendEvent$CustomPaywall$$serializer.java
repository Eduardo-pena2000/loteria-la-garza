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
public final class BackendEvent$CustomPaywall$$serializer implements E {
    public static final BackendEvent$CustomPaywall$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        BackendEvent$CustomPaywall$$serializer backendEvent$CustomPaywall$$serializer = new BackendEvent$CustomPaywall$$serializer();
        INSTANCE = backendEvent$CustomPaywall$$serializer;
        k0 k0Var = new k0("custom_paywall_event", backendEvent$CustomPaywall$$serializer, 8);
        k0Var.o("id", false);
        k0Var.o("version", false);
        k0Var.o("type", false);
        k0Var.o("app_user_id", false);
        k0Var.o("app_session_id", true);
        k0Var.o("timestamp", false);
        k0Var.o("paywall_id", true);
        k0Var.o("offering_id", true);
        descriptor = k0Var;
    }

    private BackendEvent$CustomPaywall$$serializer() {
    }

    public b[] childSerializers() {
        b bVar = x0.a;
        return new b[]{bVar, J.a, bVar, bVar, pb.a.p(bVar), Q.a, pb.a.p(bVar), pb.a.p(bVar)};
    }

    public BackendEvent.CustomPaywall deserialize(rb.e eVar) {
        int i;
        String str;
        String str2;
        int i2;
        String str3;
        String str4;
        String str5;
        String str6;
        long j;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            int h = b.h(descriptor2, 1);
            String o2 = b.o(descriptor2, 2);
            String o3 = b.o(descriptor2, 3);
            x0 x0Var = x0.a;
            String str7 = (String) b.A(descriptor2, 4, x0Var, (Object) null);
            long F = b.F(descriptor2, 5);
            String str8 = (String) b.A(descriptor2, 6, x0Var, (Object) null);
            str3 = o;
            str = (String) b.A(descriptor2, 7, x0Var, (Object) null);
            str2 = str8;
            i = 255;
            str5 = o3;
            str6 = str7;
            str4 = o2;
            i2 = h;
            j = F;
        } else {
            boolean z = true;
            int i3 = 0;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            long j2 = 0;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            int i4 = 0;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i3 |= 1;
                        str12 = b.o(descriptor2, 0);
                        continue;
                    case 1:
                        i3 |= 2;
                        i4 = b.h(descriptor2, 1);
                        continue;
                    case 2:
                        str13 = b.o(descriptor2, 2);
                        i3 |= 4;
                        continue;
                    case 3:
                        str10 = b.o(descriptor2, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        str11 = (String) b.A(descriptor2, 4, x0.a, str11);
                        i3 |= 16;
                        break;
                    case 5:
                        j2 = b.F(descriptor2, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        str14 = (String) b.A(descriptor2, 6, x0.a, str14);
                        i3 |= 64;
                        break;
                    case 7:
                        str9 = (String) b.A(descriptor2, 7, x0.a, str9);
                        i3 |= 128;
                        break;
                    default:
                        throw new m(v);
                }
            }
            i = i3;
            str = str9;
            str2 = str14;
            i2 = i4;
            str3 = str12;
            str4 = str13;
            str5 = str10;
            str6 = str11;
            j = j2;
        }
        b.c(descriptor2);
        return new BackendEvent.CustomPaywall(i, str3, i2, str4, str5, str6, j, str2, str, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, BackendEvent.CustomPaywall customPaywall) {
        t.g(fVar, "encoder");
        t.g(customPaywall, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        BackendEvent.CustomPaywall.write$Self$purchases_defaultsBc8Release(customPaywall, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

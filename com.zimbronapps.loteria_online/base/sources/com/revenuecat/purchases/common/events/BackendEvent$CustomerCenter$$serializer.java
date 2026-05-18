package com.revenuecat.purchases.common.events;

import Ca.e;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode;
import com.revenuecat.purchases.customercenter.events.CustomerCenterEventType;
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
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BackendEvent$CustomerCenter$$serializer implements E {
    public static final BackendEvent$CustomerCenter$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        BackendEvent$CustomerCenter$$serializer backendEvent$CustomerCenter$$serializer = new BackendEvent$CustomerCenter$$serializer();
        INSTANCE = backendEvent$CustomerCenter$$serializer;
        k0 k0Var = new k0("customer_center", backendEvent$CustomerCenter$$serializer, 12);
        k0Var.o("id", false);
        k0Var.o("revision_id", false);
        k0Var.o("type", false);
        k0Var.o("app_user_id", false);
        k0Var.o("app_session_id", false);
        k0Var.o("timestamp", false);
        k0Var.o("dark_mode", false);
        k0Var.o("locale", false);
        k0Var.o("display_mode", false);
        k0Var.o("path", false);
        k0Var.o("url", false);
        k0Var.o("survey_option_id", false);
        descriptor = k0Var;
    }

    private BackendEvent$CustomerCenter$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = BackendEvent.CustomerCenter.access$get$childSerializers$cp();
        b bVar = x0.a;
        return new b[]{bVar, J.a, access$get$childSerializers$cp[2], bVar, bVar, Q.a, h.a, bVar, access$get$childSerializers$cp[8], pb.a.p(access$get$childSerializers$cp[9]), pb.a.p(bVar), pb.a.p(bVar)};
    }

    public BackendEvent.CustomerCenter deserialize(rb.e eVar) {
        CustomerCenterEventType customerCenterEventType;
        String str;
        String str2;
        int i;
        String str3;
        CustomerCenterConfigData.HelpPath.PathType pathType;
        CustomerCenterDisplayMode customerCenterDisplayMode;
        String str4;
        String str5;
        String str6;
        boolean z;
        int i2;
        long j;
        int i3;
        int i4;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = BackendEvent.CustomerCenter.access$get$childSerializers$cp();
        int i5 = 10;
        int i6 = 7;
        int i7 = 6;
        String str7 = null;
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            int h = b.h(descriptor2, 1);
            CustomerCenterEventType customerCenterEventType2 = (CustomerCenterEventType) b.e(descriptor2, 2, access$get$childSerializers$cp[2], (Object) null);
            String o2 = b.o(descriptor2, 3);
            String o3 = b.o(descriptor2, 4);
            long F = b.F(descriptor2, 5);
            boolean q = b.q(descriptor2, 6);
            String o4 = b.o(descriptor2, 7);
            CustomerCenterDisplayMode customerCenterDisplayMode2 = (CustomerCenterDisplayMode) b.e(descriptor2, 8, access$get$childSerializers$cp[8], (Object) null);
            CustomerCenterConfigData.HelpPath.PathType pathType2 = (CustomerCenterConfigData.HelpPath.PathType) b.A(descriptor2, 9, access$get$childSerializers$cp[9], (Object) null);
            x0 x0Var = x0.a;
            String str8 = (String) b.A(descriptor2, 10, x0Var, (Object) null);
            pathType = pathType2;
            str = o;
            str2 = (String) b.A(descriptor2, 11, x0Var, (Object) null);
            str3 = str8;
            str6 = o4;
            z = q;
            customerCenterDisplayMode = customerCenterDisplayMode2;
            str4 = o2;
            str5 = o3;
            i = 4095;
            customerCenterEventType = customerCenterEventType2;
            i2 = h;
            j = F;
        } else {
            CustomerCenterEventType customerCenterEventType3 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            boolean z2 = true;
            int i8 = 0;
            boolean z3 = false;
            int i9 = 0;
            long j2 = 0;
            CustomerCenterConfigData.HelpPath.PathType pathType3 = null;
            CustomerCenterDisplayMode customerCenterDisplayMode3 = null;
            String str12 = null;
            String str13 = null;
            while (z2) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        i7 = i7;
                        z2 = false;
                        i5 = 10;
                    case 0:
                        i8 |= 1;
                        i7 = i7;
                        str7 = b.o(descriptor2, 0);
                        i5 = 10;
                        i6 = 7;
                    case 1:
                        i3 = i7;
                        i9 = b.h(descriptor2, 1);
                        i8 |= 2;
                        i7 = i3;
                        i5 = 10;
                        i6 = 7;
                    case 2:
                        i3 = i7;
                        customerCenterEventType3 = (CustomerCenterEventType) b.e(descriptor2, 2, access$get$childSerializers$cp[2], customerCenterEventType3);
                        i8 |= 4;
                        i7 = i3;
                        i5 = 10;
                        i6 = 7;
                    case 3:
                        i4 = i7;
                        str12 = b.o(descriptor2, 3);
                        i8 |= 8;
                        i7 = i4;
                        i5 = 10;
                    case 4:
                        i4 = i7;
                        str13 = b.o(descriptor2, 4);
                        i8 |= 16;
                        i7 = i4;
                        i5 = 10;
                    case 5:
                        j2 = b.F(descriptor2, 5);
                        i8 |= 32;
                        i7 = i7;
                        i5 = 10;
                    case 6:
                        int i10 = i7;
                        z3 = b.q(descriptor2, i10);
                        i8 |= 64;
                        i7 = i10;
                    case 7:
                        str11 = b.o(descriptor2, i6);
                        i8 |= 128;
                        i7 = 6;
                    case 8:
                        customerCenterDisplayMode3 = (CustomerCenterDisplayMode) b.e(descriptor2, 8, access$get$childSerializers$cp[8], customerCenterDisplayMode3);
                        i8 |= 256;
                        i7 = 6;
                    case 9:
                        pathType3 = (CustomerCenterConfigData.HelpPath.PathType) b.A(descriptor2, 9, access$get$childSerializers$cp[9], pathType3);
                        i8 |= 512;
                        i7 = 6;
                    case 10:
                        str10 = (String) b.A(descriptor2, i5, x0.a, str10);
                        i8 |= 1024;
                        i7 = 6;
                    case 11:
                        str9 = (String) b.A(descriptor2, 11, x0.a, str9);
                        i8 |= 2048;
                        i7 = 6;
                    default:
                        throw new m(v);
                }
            }
            customerCenterEventType = customerCenterEventType3;
            str = str7;
            str2 = str9;
            i = i8;
            str3 = str10;
            pathType = pathType3;
            customerCenterDisplayMode = customerCenterDisplayMode3;
            str4 = str12;
            str5 = str13;
            str6 = str11;
            z = z3;
            i2 = i9;
            j = j2;
        }
        b.c(descriptor2);
        return new BackendEvent.CustomerCenter(i, str, i2, customerCenterEventType, str4, str5, j, z, str6, customerCenterDisplayMode, pathType, str3, str2, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, BackendEvent.CustomerCenter customerCenter) {
        t.g(fVar, "encoder");
        t.g(customerCenter, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        BackendEvent.CustomerCenter.write$Self$purchases_defaultsBc8Release(customerCenter, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

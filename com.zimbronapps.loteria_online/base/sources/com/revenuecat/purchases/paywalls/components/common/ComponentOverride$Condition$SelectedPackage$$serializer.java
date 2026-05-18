package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import java.util.List;
import kotlin.jvm.internal.t;
import ob.a;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ComponentOverride$Condition$SelectedPackage$$serializer implements E {
    public static final ComponentOverride$Condition$SelectedPackage$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ComponentOverride$Condition$SelectedPackage$$serializer componentOverride$Condition$SelectedPackage$$serializer = new ComponentOverride$Condition$SelectedPackage$$serializer();
        INSTANCE = componentOverride$Condition$SelectedPackage$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.SelectedPackage", componentOverride$Condition$SelectedPackage$$serializer, 2);
        k0Var.o("operator", false);
        k0Var.o("packages", false);
        descriptor = k0Var;
    }

    private ComponentOverride$Condition$SelectedPackage$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = ComponentOverride.Condition.SelectedPackage.access$get$childSerializers$cp();
        return new b[]{access$get$childSerializers$cp[0], access$get$childSerializers$cp[1]};
    }

    public ComponentOverride.Condition.SelectedPackage deserialize(rb.e eVar) {
        List list;
        ComponentOverride.ArrayOperator arrayOperator;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        a[] access$get$childSerializers$cp = ComponentOverride.Condition.SelectedPackage.access$get$childSerializers$cp();
        if (b.m()) {
            arrayOperator = (ComponentOverride.ArrayOperator) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
            list = (List) b.e(descriptor2, 1, access$get$childSerializers$cp[1], (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            ComponentOverride.ArrayOperator arrayOperator2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    arrayOperator2 = (ComponentOverride.ArrayOperator) b.e(descriptor2, 0, access$get$childSerializers$cp[0], arrayOperator2);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    list2 = (List) b.e(descriptor2, 1, access$get$childSerializers$cp[1], list2);
                    i2 |= 2;
                }
            }
            list = list2;
            arrayOperator = arrayOperator2;
            i = i2;
        }
        b.c(descriptor2);
        return new ComponentOverride.Condition.SelectedPackage(i, arrayOperator, list, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ComponentOverride.Condition.SelectedPackage selectedPackage) {
        t.g(fVar, "encoder");
        t.g(selectedPackage, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ComponentOverride.Condition.SelectedPackage.write$Self$purchases_defaultsBc8Release(selectedPackage, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import kotlin.jvm.internal.t;
import ob.a;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.x0;
import tb.F;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ComponentOverride$Condition$Variable$$serializer implements E {
    public static final ComponentOverride$Condition$Variable$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ComponentOverride$Condition$Variable$$serializer componentOverride$Condition$Variable$$serializer = new ComponentOverride$Condition$Variable$$serializer();
        INSTANCE = componentOverride$Condition$Variable$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Variable", componentOverride$Condition$Variable$$serializer, 3);
        k0Var.o("operator", false);
        k0Var.o("variable", false);
        k0Var.o("value", false);
        descriptor = k0Var;
    }

    private ComponentOverride$Condition$Variable$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{ComponentOverride.Condition.Variable.access$get$childSerializers$cp()[0], x0.a, F.a};
    }

    public ComponentOverride.Condition.Variable deserialize(rb.e eVar) {
        int i;
        ComponentOverride.EqualityOperator equalityOperator;
        String str;
        tb.E e;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        a[] access$get$childSerializers$cp = ComponentOverride.Condition.Variable.access$get$childSerializers$cp();
        ComponentOverride.EqualityOperator equalityOperator2 = null;
        if (b.m()) {
            equalityOperator = (ComponentOverride.EqualityOperator) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
            str = b.o(descriptor2, 1);
            e = (tb.E) b.e(descriptor2, 2, F.a, (Object) null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str2 = null;
            tb.E e2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    equalityOperator2 = (ComponentOverride.EqualityOperator) b.e(descriptor2, 0, access$get$childSerializers$cp[0], equalityOperator2);
                    i2 |= 1;
                } else if (v == 1) {
                    str2 = b.o(descriptor2, 1);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    e2 = (tb.E) b.e(descriptor2, 2, F.a, e2);
                    i2 |= 4;
                }
            }
            i = i2;
            equalityOperator = equalityOperator2;
            str = str2;
            e = e2;
        }
        b.c(descriptor2);
        return new ComponentOverride.Condition.Variable(i, equalityOperator, str, e, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ComponentOverride.Condition.Variable variable) {
        t.g(fVar, "encoder");
        t.g(variable, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ComponentOverride.Condition.Variable.write$Self$purchases_defaultsBc8Release(variable, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

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
import sb.h;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ComponentOverride$Condition$PromoOfferRule$$serializer implements E {
    public static final ComponentOverride$Condition$PromoOfferRule$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ComponentOverride$Condition$PromoOfferRule$$serializer componentOverride$Condition$PromoOfferRule$$serializer = new ComponentOverride$Condition$PromoOfferRule$$serializer();
        INSTANCE = componentOverride$Condition$PromoOfferRule$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOfferRule", componentOverride$Condition$PromoOfferRule$$serializer, 2);
        k0Var.o("operator", false);
        k0Var.o("value", false);
        descriptor = k0Var;
    }

    private ComponentOverride$Condition$PromoOfferRule$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{ComponentOverride.Condition.PromoOfferRule.access$get$childSerializers$cp()[0], h.a};
    }

    public ComponentOverride.Condition.PromoOfferRule deserialize(rb.e eVar) {
        ComponentOverride.EqualityOperator equalityOperator;
        boolean z;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        a[] access$get$childSerializers$cp = ComponentOverride.Condition.PromoOfferRule.access$get$childSerializers$cp();
        if (b.m()) {
            equalityOperator = (ComponentOverride.EqualityOperator) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
            z = b.q(descriptor2, 1);
            i = 3;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            int i2 = 0;
            ComponentOverride.EqualityOperator equalityOperator2 = null;
            while (z2) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z2 = false;
                } else if (v == 0) {
                    equalityOperator2 = (ComponentOverride.EqualityOperator) b.e(descriptor2, 0, access$get$childSerializers$cp[0], equalityOperator2);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    z3 = b.q(descriptor2, 1);
                    i2 |= 2;
                }
            }
            equalityOperator = equalityOperator2;
            z = z3;
            i = i2;
        }
        b.c(descriptor2);
        return new ComponentOverride.Condition.PromoOfferRule(i, equalityOperator, z, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ComponentOverride.Condition.PromoOfferRule promoOfferRule) {
        t.g(fVar, "encoder");
        t.g(promoOfferRule, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ComponentOverride.Condition.PromoOfferRule.write$Self$purchases_defaultsBc8Release(promoOfferRule, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

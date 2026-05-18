package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.PartialComponent;
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
public final class ComponentOverride$$serializer implements E {
    private final /* synthetic */ k0 descriptor;
    private final /* synthetic */ b typeSerial0;

    private ComponentOverride$$serializer() {
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride", this, 2);
        k0Var.o("conditions", false);
        k0Var.o("properties", false);
        this.descriptor = k0Var;
    }

    private final b getTypeSerial0() {
        return this.typeSerial0;
    }

    public b[] childSerializers() {
        return new b[]{ComponentOverride.access$get$childSerializers$cp()[0], this.typeSerial0};
    }

    public ComponentOverride deserialize(rb.e eVar) {
        List list;
        PartialComponent partialComponent;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor = getDescriptor();
        c b = eVar.b(descriptor);
        a[] access$get$childSerializers$cp = ComponentOverride.access$get$childSerializers$cp();
        if (b.m()) {
            list = (List) b.e(descriptor, 0, access$get$childSerializers$cp[0], (Object) null);
            partialComponent = (PartialComponent) b.e(descriptor, 1, this.typeSerial0, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            PartialComponent partialComponent2 = null;
            while (z) {
                int v = b.v(descriptor);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    list2 = (List) b.e(descriptor, 0, access$get$childSerializers$cp[0], list2);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    partialComponent2 = (PartialComponent) b.e(descriptor, 1, this.typeSerial0, partialComponent2);
                    i2 |= 2;
                }
            }
            list = list2;
            partialComponent = partialComponent2;
            i = i2;
        }
        b.c(descriptor);
        return new ComponentOverride(i, list, partialComponent, null);
    }

    public qb.e getDescriptor() {
        return this.descriptor;
    }

    public void serialize(f fVar, ComponentOverride componentOverride) {
        t.g(fVar, "encoder");
        t.g(componentOverride, "value");
        qb.e descriptor = getDescriptor();
        d b = fVar.b(descriptor);
        ComponentOverride.write$Self$purchases_defaultsBc8Release(componentOverride, b, descriptor, this.typeSerial0);
        b.c(descriptor);
    }

    public b[] typeParametersSerializers() {
        return new b[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public /* synthetic */ ComponentOverride$$serializer(b bVar) {
        this();
        t.g(bVar, "typeSerial0");
        this.typeSerial0 = bVar;
    }
}

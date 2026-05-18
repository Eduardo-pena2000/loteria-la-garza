package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.J;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CarouselComponent$AutoAdvancePages$$serializer implements E {
    public static final CarouselComponent$AutoAdvancePages$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CarouselComponent$AutoAdvancePages$$serializer carouselComponent$AutoAdvancePages$$serializer = new CarouselComponent$AutoAdvancePages$$serializer();
        INSTANCE = carouselComponent$AutoAdvancePages$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.CarouselComponent.AutoAdvancePages", carouselComponent$AutoAdvancePages$$serializer, 3);
        k0Var.o("ms_time_per_page", false);
        k0Var.o("ms_transition_time", false);
        k0Var.o("transition_type", false);
        descriptor = k0Var;
    }

    private CarouselComponent$AutoAdvancePages$$serializer() {
    }

    public b[] childSerializers() {
        b p = a.p(CarouselTransitionTypeDeserializer.INSTANCE);
        J j = J.a;
        return new b[]{j, j, p};
    }

    public CarouselComponent.AutoAdvancePages deserialize(rb.e eVar) {
        int i;
        int i2;
        int i3;
        CarouselComponent.AutoAdvancePages.TransitionType transitionType;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            int h = b.h(descriptor2, 0);
            int h2 = b.h(descriptor2, 1);
            i = h;
            transitionType = (CarouselComponent.AutoAdvancePages.TransitionType) b.A(descriptor2, 2, CarouselTransitionTypeDeserializer.INSTANCE, (Object) null);
            i2 = h2;
            i3 = 7;
        } else {
            boolean z = true;
            int i4 = 0;
            int i5 = 0;
            CarouselComponent.AutoAdvancePages.TransitionType transitionType2 = null;
            int i6 = 0;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    i4 = b.h(descriptor2, 0);
                    i5 |= 1;
                } else if (v == 1) {
                    i6 = b.h(descriptor2, 1);
                    i5 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    transitionType2 = (CarouselComponent.AutoAdvancePages.TransitionType) b.A(descriptor2, 2, CarouselTransitionTypeDeserializer.INSTANCE, transitionType2);
                    i5 |= 4;
                }
            }
            i = i4;
            i2 = i6;
            i3 = i5;
            transitionType = transitionType2;
        }
        b.c(descriptor2);
        return new CarouselComponent.AutoAdvancePages(i3, i, i2, transitionType, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CarouselComponent.AutoAdvancePages autoAdvancePages) {
        t.g(fVar, "encoder");
        t.g(autoAdvancePages, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CarouselComponent.AutoAdvancePages.write$Self$purchases_defaultsBc8Release(autoAdvancePages, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}

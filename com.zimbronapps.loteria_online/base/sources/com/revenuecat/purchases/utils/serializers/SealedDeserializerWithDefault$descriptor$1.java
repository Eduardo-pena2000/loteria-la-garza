package com.revenuecat.purchases.utils.serializers;

import Ca.I;
import Qa.l;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import qb.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SealedDeserializerWithDefault$descriptor$1 extends u implements l {
    final /* synthetic */ SealedDeserializerWithDefault this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SealedDeserializerWithDefault$descriptor$1(SealedDeserializerWithDefault sealedDeserializerWithDefault) {
        super(1);
        this.this$0 = sealedDeserializerWithDefault;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((a) obj);
        return I.a;
    }

    public final void invoke(a buildClassSerialDescriptor) {
        t.g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        a.b(buildClassSerialDescriptor, SealedDeserializerWithDefault.access$getTypeDiscriminator$p(this.this$0), pb.a.F(U.a).getDescriptor(), null, false, 12, null);
    }
}

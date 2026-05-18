package com.revenuecat.purchases.paywalls.events;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.PresentedOfferingContextSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.List;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import qb.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallEventDataSerializer$descriptor$1 extends u implements l {
    public static final PaywallEventDataSerializer$descriptor$1 INSTANCE = new PaywallEventDataSerializer$descriptor$1();

    public PaywallEventDataSerializer$descriptor$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((a) obj);
        return I.a;
    }

    public final void invoke(a aVar) {
        t.g(aVar, "$this$buildClassSerialDescriptor");
        a.b(aVar, "paywallIdentifier", PaywallEventDataSerializer.access$getNullableStringSerializer$p().getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "presentedOfferingContext", PresentedOfferingContextSerializer.INSTANCE.getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "paywallRevision", pb.a.C(s.a).getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "sessionIdentifier", UUIDSerializer.INSTANCE.getDescriptor(), (List) null, false, 12, (Object) null);
        U u = U.a;
        a.b(aVar, "displayMode", pb.a.F(u).getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "localeIdentifier", pb.a.F(u).getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "darkMode", pb.a.x(d.a).getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "exitOfferType", PaywallEventDataSerializer.access$getNullableExitOfferTypeSerializer$p().getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "exitOfferingIdentifier", PaywallEventDataSerializer.access$getNullableStringSerializer$p().getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "packageIdentifier", PaywallEventDataSerializer.access$getNullableStringSerializer$p().getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "productIdentifier", PaywallEventDataSerializer.access$getNullableStringSerializer$p().getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "errorCode", PaywallEventDataSerializer.access$getNullableIntSerializer$p().getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "errorMessage", PaywallEventDataSerializer.access$getNullableStringSerializer$p().getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "offeringIdentifier", pb.a.F(u).getDescriptor(), (List) null, false, 12, (Object) null);
    }
}

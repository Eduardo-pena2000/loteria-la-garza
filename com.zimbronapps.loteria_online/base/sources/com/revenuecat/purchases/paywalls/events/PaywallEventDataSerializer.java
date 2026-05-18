package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PresentedOfferingContextSerializer;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.UUID;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import ob.b;
import ob.j;
import pb.a;
import qb.e;
import qb.k;
import rb.f;
import tb.C;
import tb.h;
import tb.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallEventDataSerializer implements b {
    private static final int DARK_MODE_INDEX = 6;
    private static final int DISPLAY_MODE_INDEX = 4;
    private static final int ERROR_CODE_INDEX = 11;
    private static final int ERROR_MESSAGE_INDEX = 12;
    private static final int EXIT_OFFERING_IDENTIFIER_INDEX = 8;
    private static final int EXIT_OFFER_TYPE_INDEX = 7;
    private static final int LOCALE_IDENTIFIER_INDEX = 5;
    private static final int PACKAGE_IDENTIFIER_INDEX = 9;
    private static final int PAYWALL_IDENTIFIER_INDEX = 0;
    private static final int PAYWALL_REVISION_INDEX = 2;
    private static final int PRESENTED_OFFERING_CONTEXT_INDEX = 1;
    private static final int PRODUCT_IDENTIFIER_INDEX = 10;
    private static final int SESSION_IDENTIFIER_INDEX = 3;
    public static final PaywallEventDataSerializer INSTANCE = new PaywallEventDataSerializer();
    private static final b nullableStringSerializer = a.p(a.F(U.a));
    private static final b nullableIntSerializer = a.p(a.C(s.a));
    private static final b nullableExitOfferTypeSerializer = a.p(ExitOfferType.Companion.serializer());
    private static final e descriptor = k.c("PaywallEvent.Data", new e[0], PaywallEventDataSerializer$descriptor$1.INSTANCE);

    private PaywallEventDataSerializer() {
    }

    public static final /* synthetic */ b access$getNullableExitOfferTypeSerializer$p() {
        return nullableExitOfferTypeSerializer;
    }

    public static final /* synthetic */ b access$getNullableIntSerializer$p() {
        return nullableIntSerializer;
    }

    public static final /* synthetic */ b access$getNullableStringSerializer$p() {
        return nullableStringSerializer;
    }

    public e getDescriptor() {
        return descriptor;
    }

    public PaywallEvent.Data deserialize(rb.e eVar) {
        PresentedOfferingContext presentedOfferingContext;
        String str;
        String str2;
        t.g(eVar, "decoder");
        if (!(eVar instanceof h)) {
            throw new j("PaywallEvent.Data only supports JSON deserialization");
        }
        h hVar = (h) eVar;
        C n = tb.j.n(hVar.i());
        if (n.containsKey("presentedOfferingContext")) {
            tb.b d = hVar.d();
            PresentedOfferingContextSerializer presentedOfferingContextSerializer = PresentedOfferingContextSerializer.INSTANCE;
            Object obj = n.get("presentedOfferingContext");
            t.d(obj);
            presentedOfferingContext = (PresentedOfferingContext) d.c(presentedOfferingContextSerializer, (i) obj);
        } else {
            if (!n.containsKey("offeringIdentifier")) {
                throw new j("Missing offering context information");
            }
            Object obj2 = n.get("offeringIdentifier");
            t.d(obj2);
            presentedOfferingContext = new PresentedOfferingContext(tb.j.o((i) obj2).a());
        }
        i iVar = (i) n.get("paywallIdentifier");
        String str3 = iVar != null ? (String) hVar.d().c(a.F(U.a), iVar) : null;
        tb.b d2 = hVar.d();
        s sVar = s.a;
        b C = a.C(sVar);
        Object obj3 = n.get("paywallRevision");
        t.d(obj3);
        int intValue = ((Number) d2.c(C, (i) obj3)).intValue();
        tb.b d3 = hVar.d();
        UUIDSerializer uUIDSerializer = UUIDSerializer.INSTANCE;
        Object obj4 = n.get("sessionIdentifier");
        t.d(obj4);
        UUID uuid = (UUID) d3.c(uUIDSerializer, (i) obj4);
        tb.b d4 = hVar.d();
        U u = U.a;
        b F = a.F(u);
        Object obj5 = n.get("displayMode");
        t.d(obj5);
        String str4 = (String) d4.c(F, (i) obj5);
        tb.b d5 = hVar.d();
        b F2 = a.F(u);
        Object obj6 = n.get("localeIdentifier");
        t.d(obj6);
        String str5 = (String) d5.c(F2, (i) obj6);
        tb.b d6 = hVar.d();
        b x = a.x(d.a);
        Object obj7 = n.get("darkMode");
        t.d(obj7);
        boolean booleanValue = ((Boolean) d6.c(x, (i) obj7)).booleanValue();
        i iVar2 = (i) n.get("exitOfferType");
        ExitOfferType exitOfferType = iVar2 != null ? (ExitOfferType) hVar.d().c(ExitOfferType.Companion.serializer(), iVar2) : null;
        i iVar3 = (i) n.get("exitOfferingIdentifier");
        String str6 = iVar3 != null ? (String) hVar.d().c(a.F(u), iVar3) : null;
        i iVar4 = (i) n.get("packageIdentifier");
        String str7 = iVar4 != null ? (String) hVar.d().c(a.F(u), iVar4) : null;
        i iVar5 = (i) n.get("productIdentifier");
        if (iVar5 != null) {
            str = str7;
            str2 = (String) hVar.d().c(a.F(u), iVar5);
        } else {
            str = str7;
            str2 = null;
        }
        i iVar6 = (i) n.get("errorCode");
        Integer valueOf = iVar6 != null ? Integer.valueOf(((Number) hVar.d().c(a.C(sVar), iVar6)).intValue()) : null;
        i iVar7 = (i) n.get("errorMessage");
        return new PaywallEvent.Data(str3, presentedOfferingContext, intValue, uuid, str4, str5, booleanValue, exitOfferType, str6, str, str2, valueOf, iVar7 != null ? (String) hVar.d().c(a.F(u), iVar7) : null);
    }

    public void serialize(f fVar, PaywallEvent.Data data) {
        t.g(fVar, "encoder");
        t.g(data, "value");
        e descriptor2 = getDescriptor();
        rb.d b = fVar.b(descriptor2);
        String paywallIdentifier = data.getPaywallIdentifier();
        if (paywallIdentifier != null) {
            b.v(INSTANCE.getDescriptor(), 0, paywallIdentifier);
        }
        PaywallEventDataSerializer paywallEventDataSerializer = INSTANCE;
        b.k(paywallEventDataSerializer.getDescriptor(), 1, PresentedOfferingContextSerializer.INSTANCE, data.getPresentedOfferingContext());
        b.n(paywallEventDataSerializer.getDescriptor(), 2, data.getPaywallRevision());
        b.k(paywallEventDataSerializer.getDescriptor(), 3, UUIDSerializer.INSTANCE, data.getSessionIdentifier());
        b.v(paywallEventDataSerializer.getDescriptor(), 4, data.getDisplayMode());
        b.v(paywallEventDataSerializer.getDescriptor(), 5, data.getLocaleIdentifier());
        b.B(paywallEventDataSerializer.getDescriptor(), 6, data.getDarkMode());
        ExitOfferType exitOfferType = data.getExitOfferType();
        if (exitOfferType != null) {
            b.k(paywallEventDataSerializer.getDescriptor(), 7, ExitOfferType.Companion.serializer(), exitOfferType);
        }
        String exitOfferingIdentifier = data.getExitOfferingIdentifier();
        if (exitOfferingIdentifier != null) {
            b.v(paywallEventDataSerializer.getDescriptor(), 8, exitOfferingIdentifier);
        }
        String packageIdentifier = data.getPackageIdentifier();
        if (packageIdentifier != null) {
            b.v(paywallEventDataSerializer.getDescriptor(), 9, packageIdentifier);
        }
        String productIdentifier = data.getProductIdentifier();
        if (productIdentifier != null) {
            b.v(paywallEventDataSerializer.getDescriptor(), 10, productIdentifier);
        }
        Integer errorCode = data.getErrorCode();
        if (errorCode != null) {
            b.n(paywallEventDataSerializer.getDescriptor(), 11, errorCode.intValue());
        }
        String errorMessage = data.getErrorMessage();
        if (errorMessage != null) {
            b.v(paywallEventDataSerializer.getDescriptor(), 12, errorMessage);
        }
        b.c(descriptor2);
    }
}

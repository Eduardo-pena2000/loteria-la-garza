package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.I;
import Ca.q;
import Ca.t;
import Ca.x;
import Da.Q;
import Da.S;
import Da.w;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.K;
import cb.O;
import cb.i;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.hybridcommon.CommonKt;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingsMapperKt {

    @f(c = "com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt$mapAsync$1", f = "OfferingsMapper.kt", l = {21}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ Qa.l $callback;
        final /* synthetic */ Offerings $this_mapAsync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Qa.l lVar, Offerings offerings, e eVar) {
            super(2, eVar);
            this.$callback = lVar;
            this.$this_mapAsync = offerings;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$callback, this.$this_mapAsync, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                K mapperDispatcher = MappersHelpersKt.getMapperDispatcher();
                OfferingsMapperKt$mapAsync$1$map$1 offeringsMapperKt$mapAsync$1$map$1 = new OfferingsMapperKt$mapAsync$1$map$1(this.$this_mapAsync, null);
                this.label = 1;
                obj = i.g(mapperDispatcher, offeringsMapperKt$mapAsync$1$map$1, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            this.$callback.invoke((Map) obj);
            return I.a;
        }
    }

    @f(c = "com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt$mapAsync$2", f = "OfferingsMapper.kt", l = {50}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ Qa.l $callback;
        final /* synthetic */ Offering $this_mapAsync;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Qa.l lVar, Offering offering, e eVar) {
            super(2, eVar);
            this.$callback = lVar;
            this.$this_mapAsync = offering;
        }

        public final e create(Object obj, e eVar) {
            return new 2(this.$callback, this.$this_mapAsync, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                K mapperDispatcher = MappersHelpersKt.getMapperDispatcher();
                OfferingsMapperKt$mapAsync$2$map$1 offeringsMapperKt$mapAsync$2$map$1 = new OfferingsMapperKt$mapAsync$2$map$1(this.$this_mapAsync, null);
                this.label = 1;
                obj = i.g(mapperDispatcher, offeringsMapperKt$mapAsync$2$map$1, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            this.$callback.invoke((Map) obj);
            return I.a;
        }
    }

    public static final /* synthetic */ Map access$map(Offering offering) {
        return map(offering);
    }

    public static final PresentedOfferingContext createPresentedOfferingContextFromMap(Map map) {
        if (map != null) {
            return CommonKt.toPresentedOfferingContext(map);
        }
        return null;
    }

    private static final Map map(Offerings offerings) {
        Map all = offerings.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.e(all.size()));
        for (Map.Entry entry : all.entrySet()) {
            linkedHashMap.put(entry.getKey(), map((Offering) entry.getValue()));
        }
        q a = x.a("all", linkedHashMap);
        Offering current = offerings.getCurrent();
        return S.l(new q[]{a, x.a("current", current != null ? map(current) : null)});
    }

    public static final void mapAsync(Offerings offerings, Qa.l lVar) {
        kotlin.jvm.internal.t.g(offerings, "<this>");
        kotlin.jvm.internal.t.g(lVar, "callback");
        i.d(MappersHelpersKt.getMainScope(), (Ga.i) null, (cb.Q) null, new 1(lVar, offerings, null), 3, (Object) null);
    }

    public static final /* synthetic */ Map access$map(Offerings offerings) {
        return map(offerings);
    }

    public static final void mapAsync(Offering offering, Qa.l lVar) {
        kotlin.jvm.internal.t.g(offering, "<this>");
        kotlin.jvm.internal.t.g(lVar, "callback");
        i.d(MappersHelpersKt.getMainScope(), (Ga.i) null, (cb.Q) null, new 2(lVar, offering, null), 3, (Object) null);
    }

    private static final Map map(Offering offering) {
        q a = x.a("identifier", offering.getIdentifier());
        q a2 = x.a("serverDescription", offering.getServerDescription());
        q a3 = x.a("metadata", offering.getMetadata());
        List availablePackages = offering.getAvailablePackages();
        ArrayList arrayList = new ArrayList(w.y(availablePackages, 10));
        Iterator it = availablePackages.iterator();
        while (it.hasNext()) {
            arrayList.add(map((Package) it.next()));
        }
        q a4 = x.a("availablePackages", arrayList);
        Package lifetime = offering.getLifetime();
        q a5 = x.a("lifetime", lifetime != null ? map(lifetime) : null);
        Package annual = offering.getAnnual();
        q a6 = x.a("annual", annual != null ? map(annual) : null);
        Package sixMonth = offering.getSixMonth();
        q a7 = x.a("sixMonth", sixMonth != null ? map(sixMonth) : null);
        Package threeMonth = offering.getThreeMonth();
        q a8 = x.a("threeMonth", threeMonth != null ? map(threeMonth) : null);
        Package twoMonth = offering.getTwoMonth();
        q a9 = x.a("twoMonth", twoMonth != null ? map(twoMonth) : null);
        Package monthly = offering.getMonthly();
        q a10 = x.a("monthly", monthly != null ? map(monthly) : null);
        Package weekly = offering.getWeekly();
        q a11 = x.a("weekly", weekly != null ? map(weekly) : null);
        URL webCheckoutURL = offering.getWebCheckoutURL();
        return S.l(new q[]{a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, x.a("webCheckoutUrl", webCheckoutURL != null ? webCheckoutURL.toString() : null)});
    }

    public static final Map map(Package r8) {
        kotlin.jvm.internal.t.g(r8, "<this>");
        q a = x.a("identifier", r8.getIdentifier());
        q a2 = x.a("packageType", r8.getPackageType().name());
        q a3 = x.a("product", StoreProductMapperKt.map(r8.getProduct()));
        q a4 = x.a("offeringIdentifier", r8.getPresentedOfferingContext().getOfferingIdentifier());
        q a5 = x.a("presentedOfferingContext", map(r8.getPresentedOfferingContext()));
        URL webCheckoutURL = r8.getWebCheckoutURL();
        return S.l(new q[]{a, a2, a3, a4, a5, x.a("webCheckoutUrl", webCheckoutURL != null ? webCheckoutURL.toString() : null)});
    }

    public static final Map map(PresentedOfferingContext presentedOfferingContext) {
        kotlin.jvm.internal.t.g(presentedOfferingContext, "<this>");
        q a = x.a("offeringIdentifier", presentedOfferingContext.getOfferingIdentifier());
        q a2 = x.a("placementIdentifier", presentedOfferingContext.getPlacementIdentifier());
        PresentedOfferingContext.TargetingContext targetingContext = presentedOfferingContext.getTargetingContext();
        return S.l(new q[]{a, a2, x.a("targetingContext", targetingContext != null ? map(targetingContext) : null)});
    }

    public static final Map map(PresentedOfferingContext.TargetingContext targetingContext) {
        kotlin.jvm.internal.t.g(targetingContext, "<this>");
        return S.l(new q[]{x.a("revision", Integer.valueOf(targetingContext.getRevision())), x.a("ruleId", targetingContext.getRuleId())});
    }
}

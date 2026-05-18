package com.revenuecat.purchases.common.offerings;

import Ca.I;
import Ca.x;
import Da.S;
import Da.w;
import Qa.l;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingsFactory$getStoreProductsById$1$1$1 extends u implements l {
    final /* synthetic */ l $onCompleted;
    final /* synthetic */ Map $productsById;
    final /* synthetic */ OfferingsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsFactory$getStoreProductsById$1$1$1(OfferingsFactory offeringsFactory, Map map, l lVar) {
        super(1);
        this.this$0 = offeringsFactory;
        this.$productsById = map;
        this.$onCompleted = lVar;
    }

    public static /* synthetic */ void a(Map map, List list, l lVar) {
        invoke$lambda$1(map, list, lVar);
    }

    private static final void invoke$lambda$1(Map map, List list, l lVar) {
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StoreProduct storeProduct = (StoreProduct) it.next();
            arrayList.add(x.a(storeProduct.getPurchasingData().getProductId(), Da.u.e(storeProduct)));
        }
        S.t(map, arrayList);
        lVar.invoke(map);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return I.a;
    }

    public final void invoke(List list) {
        t.g(list, "inAppProducts");
        Dispatcher.enqueue$default(OfferingsFactory.access$getDispatcher$p(this.this$0), new b(this.$productsById, list, this.$onCompleted), null, 2, null);
    }
}

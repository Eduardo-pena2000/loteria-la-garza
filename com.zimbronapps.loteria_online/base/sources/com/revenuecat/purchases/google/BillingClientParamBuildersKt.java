package com.revenuecat.purchases.google;

import Da.w;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingClientParamBuildersKt {
    public static final QueryProductDetailsParams buildQueryProductDetailsParams(String str, Set set) {
        t.g(str, "<this>");
        t.g(set, "productIds");
        Iterable iterable = (Iterable) set;
        ArrayList arrayList = new ArrayList(w.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(str).build());
        }
        try {
            QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
            t.f(build, "{\n        QueryProductDe…roductList).build()\n    }");
            return build;
        } catch (ExceptionInInitializerError e) {
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            StringBuilder sb = new StringBuilder();
            sb.append("Error while building QueryProductDetailsParams in Billing client");
            sb.append(": ");
            sb.append(e.getMessage());
            sb.append(". Caused by: ");
            Throwable cause = e.getCause();
            sb.append(cause != null ? cause.getMessage() : null);
            currentLogHandler.e("[Purchases] - ERROR", sb.toString(), e);
            throw new QueryProductDetailsParamsBuilderException("Error while building QueryProductDetailsParams in Billing client", e.getCause());
        }
    }

    public static final QueryPurchaseHistoryParams buildQueryPurchaseHistoryParams(String str) {
        t.g(str, "<this>");
        if (t.c(str, "inapp") ? true : t.c(str, "subs")) {
            return QueryPurchaseHistoryParams.newBuilder().setProductType(str).build();
        }
        return null;
    }

    public static final QueryPurchasesParams buildQueryPurchasesParams(String str) {
        t.g(str, "<this>");
        if (t.c(str, "inapp") ? true : t.c(str, "subs")) {
            return QueryPurchasesParams.newBuilder().setProductType(str).build();
        }
        return null;
    }
}

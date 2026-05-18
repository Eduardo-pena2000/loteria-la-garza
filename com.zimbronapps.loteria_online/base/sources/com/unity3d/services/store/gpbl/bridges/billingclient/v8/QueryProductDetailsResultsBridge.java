package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import Ca.x;
import Da.Q;
import Da.v;
import Da.w;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class QueryProductDetailsResultsBridge extends GenericBridge {
    public static final Companion Companion = new Companion(null);
    private static final String GET_PRODUCT_DETAILS_LIST_METHOD = "getProductDetailsList";
    private final Object productDetailsResult;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsResultsBridge(Object productDetailsResult) {
        super(Q.f(x.a("getProductDetailsList", new Class[0])));
        t.g(productDetailsResult, "productDetailsResult");
        this.productDetailsResult = productDetailsResult;
    }

    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsResult";
    }

    public final List getProductDetailsList() {
        List list = (List) callNonVoidMethod("getProductDetailsList", this.productDetailsResult, new Object[0]);
        if (list == null) {
            return v.n();
        }
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ProductDetailsBridge(it.next()));
        }
        return arrayList;
    }
}

package com.revenuecat.purchases.hybridcommon;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.hybridcommon.mappers.StoreProductMapperKt;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CommonKt$getProductInfo$onReceived$1 extends u implements l {
    final /* synthetic */ OnResultList $onResult;

    public static final class 1 extends u implements l {
        final /* synthetic */ OnResultList $onResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OnResultList onResultList) {
            super(1);
            this.$onResult = onResultList;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return I.a;
        }

        public final void invoke(List list) {
            t.g(list, "list");
            this.$onResult.onReceived(list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonKt$getProductInfo$onReceived$1(OnResultList onResultList) {
        super(1);
        this.$onResult = onResultList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return I.a;
    }

    public final void invoke(List list) {
        t.g(list, "it");
        StoreProductMapperKt.mapAsync(list, new 1(this.$onResult));
    }
}

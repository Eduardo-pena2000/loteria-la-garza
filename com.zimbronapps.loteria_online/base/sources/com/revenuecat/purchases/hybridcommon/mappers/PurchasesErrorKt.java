package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.q;
import Ca.x;
import Da.S;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.hybridcommon.ErrorContainer;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesErrorKt {
    public static final ErrorContainer map(PurchasesError purchasesError, Map map) {
        t.g(purchasesError, "<this>");
        t.g(map, "extra");
        int code = purchasesError.getCode().getCode();
        String message = purchasesError.getMessage();
        q a = x.a("code", Integer.valueOf(purchasesError.getCode().getCode()));
        q a2 = x.a("message", purchasesError.getMessage());
        q a3 = x.a("readableErrorCode", purchasesError.getCode().name());
        q a4 = x.a("readable_error_code", purchasesError.getCode().name());
        String underlyingErrorMessage = purchasesError.getUnderlyingErrorMessage();
        if (underlyingErrorMessage == null) {
            underlyingErrorMessage = "";
        }
        return new ErrorContainer(code, message, S.r(S.l(new q[]{a, a2, a3, a4, x.a("underlyingErrorMessage", underlyingErrorMessage)}), map));
    }

    public static /* synthetic */ ErrorContainer map$default(PurchasesError purchasesError, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = S.h();
        }
        return map(purchasesError, map);
    }
}

package com.revenuecat.purchases.subscriberattributes;

import Ca.I;
import Ca.x;
import Da.Q;
import Da.v;
import Qa.l;
import Qa.q;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriberAttributesPoster {
    private final BackendHelper backendHelper;

    public static final class 1 extends u implements l {
        final /* synthetic */ q $onErrorHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(q qVar) {
            super(1);
            this.$onErrorHandler = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onErrorHandler.invoke(purchasesError, Boolean.FALSE, v.n());
        }
    }

    public static final class 2 extends u implements q {
        final /* synthetic */ q $onErrorHandler;
        final /* synthetic */ Qa.a $onSuccessHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Qa.a aVar, q qVar) {
            super(3);
            this.$onSuccessHandler = aVar;
            this.$onErrorHandler = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, ((Number) obj2).intValue(), (JSONObject) obj3);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError, int i, JSONObject jSONObject) {
            I i2;
            t.g(jSONObject, "body");
            if (purchasesError != null) {
                q qVar = this.$onErrorHandler;
                boolean isServerError = RCHTTPStatusCodes.INSTANCE.isServerError(i);
                boolean z = false;
                boolean z2 = i == 404;
                if (!isServerError && !z2) {
                    z = true;
                }
                List n = v.n();
                if (purchasesError.getCode() == PurchasesErrorCode.InvalidSubscriberAttributesError) {
                    n = BackendHelpersKt.getAttributeErrors(jSONObject);
                }
                qVar.invoke(purchasesError, Boolean.valueOf(z), n);
                i2 = I.a;
            } else {
                i2 = null;
            }
            if (i2 == null) {
                this.$onSuccessHandler.invoke();
            }
        }
    }

    public SubscriberAttributesPoster(BackendHelper backendHelper) {
        t.g(backendHelper, "backendHelper");
        this.backendHelper = backendHelper;
    }

    public final void postSubscriberAttributes(Map map, String str, Qa.a aVar, q qVar) {
        t.g(map, "attributes");
        t.g(str, "appUserID");
        t.g(aVar, "onSuccessHandler");
        t.g(qVar, "onErrorHandler");
        this.backendHelper.performRequest(new Endpoint.PostAttributes(str), Q.f(x.a("attributes", map)), null, Delay.DEFAULT, new 1(qVar), new 2(aVar, qVar));
    }
}

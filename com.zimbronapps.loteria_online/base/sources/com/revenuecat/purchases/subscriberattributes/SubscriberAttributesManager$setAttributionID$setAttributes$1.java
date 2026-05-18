package com.revenuecat.purchases.subscriberattributes;

import Ca.I;
import Ca.x;
import Da.Q;
import Da.S;
import Qa.l;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriberAttributesManager$setAttributionID$setAttributes$1 extends u implements l {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ SubscriberAttributeKey.AttributionIds $attributionKey;
    final /* synthetic */ String $value;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$setAttributionID$setAttributes$1(SubscriberAttributeKey.AttributionIds attributionIds, String str, SubscriberAttributesManager subscriberAttributesManager, String str2) {
        super(1);
        this.$attributionKey = attributionIds;
        this.$value = str;
        this.this$0 = subscriberAttributesManager;
        this.$appUserID = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map) obj);
        return I.a;
    }

    public final void invoke(Map map) {
        t.g(map, "deviceIdentifiers");
        this.this$0.setAttributes(S.r(Q.f(x.a(this.$attributionKey.getBackendKey(), this.$value)), map), this.$appUserID);
    }
}

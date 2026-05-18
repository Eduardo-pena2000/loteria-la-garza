package com.revenuecat.purchases.subscriberattributes;

import Ca.q;
import Ca.x;
import Da.S;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.subscriberattributes.SpecialSubscriberAttributesKt;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriberAttribute {
    private final DateProvider dateProvider;
    private final boolean isSynced;
    private final SubscriberAttributeKey key;
    private final Date setTime;
    private final String value;

    public SubscriberAttribute(SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z) {
        t.g(subscriberAttributeKey, "key");
        t.g(dateProvider, "dateProvider");
        t.g(date, "setTime");
        this.key = subscriberAttributeKey;
        this.value = str;
        this.dateProvider = dateProvider;
        this.setTime = date;
        this.isSynced = z;
    }

    public static /* synthetic */ SubscriberAttribute copy$default(SubscriberAttribute subscriberAttribute, SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriberAttributeKey = subscriberAttribute.key;
        }
        if ((i & 2) != 0) {
            str = subscriberAttribute.value;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            dateProvider = subscriberAttribute.dateProvider;
        }
        DateProvider dateProvider2 = dateProvider;
        if ((i & 8) != 0) {
            date = subscriberAttribute.setTime;
        }
        Date date2 = date;
        if ((i & 16) != 0) {
            z = subscriberAttribute.isSynced;
        }
        return subscriberAttribute.copy(subscriberAttributeKey, str2, dateProvider2, date2, z);
    }

    public final SubscriberAttributeKey component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final DateProvider component3() {
        return this.dateProvider;
    }

    public final Date component4() {
        return this.setTime;
    }

    public final boolean component5() {
        return this.isSynced;
    }

    public final SubscriberAttribute copy(SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z) {
        t.g(subscriberAttributeKey, "key");
        t.g(dateProvider, "dateProvider");
        t.g(date, "setTime");
        return new SubscriberAttribute(subscriberAttributeKey, str, dateProvider, date, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(SubscriberAttribute.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttribute");
        SubscriberAttribute subscriberAttribute = (SubscriberAttribute) obj;
        return t.c(this.key, subscriberAttribute.key) && t.c(this.value, subscriberAttribute.value) && t.c(this.setTime, subscriberAttribute.setTime) && this.isSynced == subscriberAttribute.isSynced;
    }

    public final DateProvider getDateProvider() {
        return this.dateProvider;
    }

    public final SubscriberAttributeKey getKey() {
        return this.key;
    }

    public final Date getSetTime() {
        return this.setTime;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        String str = this.value;
        return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.setTime.hashCode()) * 31) + Boolean.hashCode(this.isSynced);
    }

    public final boolean isSynced() {
        return this.isSynced;
    }

    public final Map toBackendMap() {
        return S.l(new q[]{x.a("value", this.value), x.a("updated_at_ms", Long.valueOf(this.setTime.getTime()))});
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", this.key.getBackendKey());
        String str = this.value;
        if (str == null || jSONObject.put("value", str) == null) {
            jSONObject.put("value", JSONObject.NULL);
        }
        jSONObject.put("set_time", this.setTime.getTime());
        jSONObject.put("is_synced", this.isSynced);
        return jSONObject;
    }

    public String toString() {
        return "SubscriberAttribute(key=" + this.key + ", value=" + this.value + ", setTime=" + this.setTime + ", isSynced=" + this.isSynced + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubscriberAttribute(SubscriberAttributeKey subscriberAttributeKey, String str, DateProvider dateProvider, Date date, boolean z, int i, k kVar) {
        DateProvider defaultDateProvider = (i & 4) != 0 ? new DefaultDateProvider() : dateProvider;
        this(subscriberAttributeKey, str, defaultDateProvider, (i & 8) != 0 ? defaultDateProvider.getNow() : date, (i & 16) != 0 ? false : z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubscriberAttribute(String str, String str2, DateProvider dateProvider, Date date, boolean z, int i, k kVar) {
        DateProvider defaultDateProvider = (i & 4) != 0 ? new DefaultDateProvider() : dateProvider;
        this(str, str2, defaultDateProvider, (i & 8) != 0 ? defaultDateProvider.getNow() : date, (i & 16) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubscriberAttribute(String str, String str2, DateProvider dateProvider, Date date, boolean z) {
        this(SpecialSubscriberAttributesKt.getSubscriberAttributeKey(str), str2, (DateProvider) null, date, z, 4, (k) null);
        t.g(str, "key");
        t.g(dateProvider, "dateProvider");
        t.g(date, "setTime");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SubscriberAttribute(JSONObject jSONObject) throws JSONException {
        t.g(jSONObject, "jsonObject");
        String string = jSONObject.getString("key");
        t.f(string, "jsonObject.getString(JSON_NAME_KEY)");
        this(SpecialSubscriberAttributesKt.getSubscriberAttributeKey(string), JSONObjectExtensionsKt.getNullableString(jSONObject, "value"), (DateProvider) null, new Date(jSONObject.getLong("set_time")), jSONObject.getBoolean("is_synced"), 4, (k) null);
    }
}

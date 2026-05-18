package com.revenuecat.purchases.common.offlineentitlements;

import Da.Q;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.common.HTTPResponseOriginalSource;
import com.revenuecat.purchases.common.HTTPResponseOriginalSourceKt;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ProductEntitlementMapping {
    private static final String BASE_PLAN_ID_KEY = "base_plan_id";
    public static final Companion Companion = new Companion(null);
    private static final String ENTITLEMENTS_KEY = "entitlements";
    private static final String ORIGINAL_SOURCE_KEY = "rc_original_source";
    private static final String PRODUCT_ENTITLEMENT_MAPPING_KEY = "product_entitlement_mapping";
    private static final String PRODUCT_ID_KEY = "product_identifier";
    private final boolean loadedFromCache;
    private final Map mappings;
    private final HTTPResponseOriginalSource originalSource;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ ProductEntitlementMapping fromJson$purchases_defaultsBc8Release$default(Companion companion, JSONObject jSONObject, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.fromJson$purchases_defaultsBc8Release(jSONObject, z);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping fromJson$purchases_defaultsBc8Release(org.json.JSONObject r13, boolean r14) {
            /*
                r12 = this;
                java.lang.String r0 = "json"
                kotlin.jvm.internal.t.g(r13, r0)
                java.lang.String r0 = "product_entitlement_mapping"
                org.json.JSONObject r0 = r13.getJSONObject(r0)
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                java.util.Iterator r2 = r0.keys()
                java.lang.String r3 = "productsObject.keys()"
                kotlin.jvm.internal.t.f(r2, r3)
            L19:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L6e
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                org.json.JSONObject r4 = r0.getJSONObject(r3)
                java.lang.String r5 = "product_identifier"
                java.lang.String r5 = r4.getString(r5)
                java.lang.String r6 = "productObject"
                kotlin.jvm.internal.t.f(r4, r6)
                java.lang.String r6 = "base_plan_id"
                java.lang.String r6 = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableString(r4, r6)
                java.lang.String r7 = "entitlements"
                org.json.JSONArray r4 = r4.getJSONArray(r7)
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                int r8 = r4.length()
                r9 = 0
            L4a:
                if (r9 >= r8) goto L5b
                java.lang.String r10 = r4.getString(r9)
                java.lang.String r11 = "entitlementsArray.getString(entitlementIndex)"
                kotlin.jvm.internal.t.f(r10, r11)
                r7.add(r10)
                int r9 = r9 + 1
                goto L4a
            L5b:
                java.lang.String r4 = "mappingIdentifier"
                kotlin.jvm.internal.t.f(r3, r4)
                com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping$Mapping r4 = new com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping$Mapping
                java.lang.String r8 = "productIdentifier"
                kotlin.jvm.internal.t.f(r5, r8)
                r4.<init>(r5, r6, r7)
                r1.put(r3, r4)
                goto L19
            L6e:
                java.lang.String r0 = "rc_original_source"
                java.lang.String r13 = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableString(r13, r0)
                if (r13 == 0) goto L9e
                com.revenuecat.purchases.common.HTTPResponseOriginalSource r13 = com.revenuecat.purchases.common.HTTPResponseOriginalSource.valueOf(r13)     // Catch: java.lang.IllegalArgumentException -> L7b
                goto L9c
            L7b:
                r0 = move-exception
                com.revenuecat.purchases.LogHandler r2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Invalid original source when reading it from JSON: "
                r3.append(r4)
                r3.append(r13)
                java.lang.String r13 = ". Defaulting to MAIN."
                r3.append(r13)
                java.lang.String r13 = r3.toString()
                java.lang.String r3 = "[Purchases] - ERROR"
                r2.e(r3, r13, r0)
                r13 = 0
            L9c:
                if (r13 != 0) goto La0
            L9e:
                com.revenuecat.purchases.common.HTTPResponseOriginalSource r13 = com.revenuecat.purchases.common.HTTPResponseOriginalSource.MAIN
            La0:
                com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping r0 = new com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping
                r0.<init>(r1, r13, r14)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping.Companion.fromJson$purchases_defaultsBc8Release(org.json.JSONObject, boolean):com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping");
        }

        public final ProductEntitlementMapping fromNetwork$purchases_defaultsBc8Release(JSONObject jSONObject, HTTPResult hTTPResult) {
            t.g(jSONObject, "json");
            t.g(hTTPResult, "httpResult");
            JSONObject put = JSONObjectExtensionsKt.copy(jSONObject, false).put("rc_original_source", HTTPResponseOriginalSourceKt.getOriginalDataSource(hTTPResult).name());
            t.f(put, "jsonWithSource");
            return fromJson$purchases_defaultsBc8Release(put, false);
        }

        private Companion() {
        }
    }

    @InternalRevenueCatAPI
    public static final class Mapping {
        private final String basePlanId;
        private final List entitlements;
        private final String productIdentifier;

        public Mapping(String str, String str2, List list) {
            t.g(str, "productIdentifier");
            t.g(list, "entitlements");
            this.productIdentifier = str;
            this.basePlanId = str2;
            this.entitlements = list;
        }

        public static /* synthetic */ Mapping copy$default(Mapping mapping, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mapping.productIdentifier;
            }
            if ((i & 2) != 0) {
                str2 = mapping.basePlanId;
            }
            if ((i & 4) != 0) {
                list = mapping.entitlements;
            }
            return mapping.copy(str, str2, list);
        }

        public final String component1() {
            return this.productIdentifier;
        }

        public final String component2() {
            return this.basePlanId;
        }

        public final List component3() {
            return this.entitlements;
        }

        public final Mapping copy(String str, String str2, List list) {
            t.g(str, "productIdentifier");
            t.g(list, "entitlements");
            return new Mapping(str, str2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Mapping)) {
                return false;
            }
            Mapping mapping = (Mapping) obj;
            return t.c(this.productIdentifier, mapping.productIdentifier) && t.c(this.basePlanId, mapping.basePlanId) && t.c(this.entitlements, mapping.entitlements);
        }

        public final String getBasePlanId() {
            return this.basePlanId;
        }

        public final List getEntitlements() {
            return this.entitlements;
        }

        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        public int hashCode() {
            int hashCode = this.productIdentifier.hashCode() * 31;
            String str = this.basePlanId;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.entitlements.hashCode();
        }

        public String toString() {
            return "Mapping(productIdentifier=" + this.productIdentifier + ", basePlanId=" + this.basePlanId + ", entitlements=" + this.entitlements + ')';
        }
    }

    public ProductEntitlementMapping(Map map, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z) {
        t.g(map, "mappings");
        t.g(hTTPResponseOriginalSource, "originalSource");
        this.mappings = map;
        this.originalSource = hTTPResponseOriginalSource;
        this.loadedFromCache = z;
    }

    public static /* synthetic */ ProductEntitlementMapping copy$default(ProductEntitlementMapping productEntitlementMapping, Map map, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            map = productEntitlementMapping.mappings;
        }
        if ((i & 2) != 0) {
            hTTPResponseOriginalSource = productEntitlementMapping.originalSource;
        }
        if ((i & 4) != 0) {
            z = productEntitlementMapping.loadedFromCache;
        }
        return productEntitlementMapping.copy(map, hTTPResponseOriginalSource, z);
    }

    public final Map component1() {
        return this.mappings;
    }

    public final HTTPResponseOriginalSource component2() {
        return this.originalSource;
    }

    public final boolean component3() {
        return this.loadedFromCache;
    }

    public final ProductEntitlementMapping copy(Map map, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z) {
        t.g(map, "mappings");
        t.g(hTTPResponseOriginalSource, "originalSource");
        return new ProductEntitlementMapping(map, hTTPResponseOriginalSource, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductEntitlementMapping)) {
            return false;
        }
        ProductEntitlementMapping productEntitlementMapping = (ProductEntitlementMapping) obj;
        return t.c(this.mappings, productEntitlementMapping.mappings) && this.originalSource == productEntitlementMapping.originalSource && this.loadedFromCache == productEntitlementMapping.loadedFromCache;
    }

    public final boolean getLoadedFromCache() {
        return this.loadedFromCache;
    }

    public final Map getMappings() {
        return this.mappings;
    }

    public final HTTPResponseOriginalSource getOriginalSource() {
        return this.originalSource;
    }

    public int hashCode() {
        return (((this.mappings.hashCode() * 31) + this.originalSource.hashCode()) * 31) + Boolean.hashCode(this.loadedFromCache);
    }

    public final JSONObject toJson$purchases_defaultsBc8Release() {
        JSONObject jSONObject = new JSONObject();
        Map map = this.mappings;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Mapping mapping = (Mapping) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("product_identifier", mapping.getProductIdentifier());
            String basePlanId = mapping.getBasePlanId();
            if (basePlanId != null) {
                jSONObject2.put("base_plan_id", basePlanId);
            }
            jSONObject2.put("entitlements", new JSONArray(mapping.getEntitlements()));
            linkedHashMap.put(key, jSONObject2);
        }
        jSONObject.put("product_entitlement_mapping", new JSONObject(linkedHashMap));
        jSONObject.put("rc_original_source", this.originalSource.name());
        return jSONObject;
    }

    public String toString() {
        return "ProductEntitlementMapping(mappings=" + this.mappings + ", originalSource=" + this.originalSource + ", loadedFromCache=" + this.loadedFromCache + ')';
    }

    public /* synthetic */ ProductEntitlementMapping(Map map, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z, int i, k kVar) {
        this(map, (i & 2) != 0 ? HTTPResponseOriginalSource.MAIN : hTTPResponseOriginalSource, (i & 4) != 0 ? false : z);
    }
}

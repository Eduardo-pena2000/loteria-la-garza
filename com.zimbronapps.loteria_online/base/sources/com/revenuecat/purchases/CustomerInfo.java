package com.revenuecat.purchases;

import Ca.x;
import Da.Q;
import Da.S;
import Da.w;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.models.RawDataContainer;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerInfo implements Parcelable, RawDataContainer {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final Ca.l activeSubscriptions$delegate;
    private final Map allExpirationDatesByProduct;
    private final Map allPurchaseDatesByProduct;
    private final Ca.l allPurchasedProductIds$delegate;
    private final Ca.l allPurchasedSkus$delegate;
    private final EntitlementInfos entitlements;
    private final Date firstSeen;
    private final JSONObject jsonObject;
    private final Ca.l latestExpirationDate$delegate;
    private final boolean loadedFromCache;
    private final Uri managementURL;
    private final Ca.l nonSubscriptionTransactions$delegate;
    private final String originalAppUserId;
    private final Date originalPurchaseDate;
    private final CustomerInfoOriginalSource originalSource;
    private final Date requestDate;
    private final int schemaVersion;
    private final JSONObject subscriberJSONObject;
    private final Ca.l subscriptionsByProductIdentifier$delegate;

    public static final class Creator implements Parcelable.Creator {
        public final CustomerInfo createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            EntitlementInfos entitlementInfos = (EntitlementInfos) EntitlementInfos.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readSerializable());
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashMap2.put(parcel.readString(), parcel.readSerializable());
            }
            return new CustomerInfo(entitlementInfos, linkedHashMap, linkedHashMap2, parcel.readSerializable(), parcel.readInt(), parcel.readSerializable(), parcel.readString(), parcel.readParcelable(CustomerInfo.class.getClassLoader()), parcel.readSerializable(), JSONObjectParceler.INSTANCE.create(parcel), CustomerInfoOriginalSource.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        public final CustomerInfo[] newArray(int i) {
            return new CustomerInfo[i];
        }
    }

    public CustomerInfo(EntitlementInfos entitlementInfos, Map map, Map map2, Date date, int i, Date date2, String str, Uri uri, Date date3, JSONObject jSONObject, CustomerInfoOriginalSource customerInfoOriginalSource, boolean z) {
        t.g(entitlementInfos, "entitlements");
        t.g(map, "allExpirationDatesByProduct");
        t.g(map2, "allPurchaseDatesByProduct");
        t.g(date, "requestDate");
        t.g(date2, "firstSeen");
        t.g(str, "originalAppUserId");
        t.g(jSONObject, "jsonObject");
        t.g(customerInfoOriginalSource, "originalSource");
        this.entitlements = entitlementInfos;
        this.allExpirationDatesByProduct = map;
        this.allPurchaseDatesByProduct = map2;
        this.requestDate = date;
        this.schemaVersion = i;
        this.firstSeen = date2;
        this.originalAppUserId = str;
        this.managementURL = uri;
        this.originalPurchaseDate = date3;
        this.jsonObject = jSONObject;
        this.originalSource = customerInfoOriginalSource;
        this.loadedFromCache = z;
        this.activeSubscriptions$delegate = Ca.m.b(new CustomerInfo$activeSubscriptions$2(this));
        this.allPurchasedSkus$delegate = Ca.m.b(new CustomerInfo$allPurchasedSkus$2(this));
        this.allPurchasedProductIds$delegate = Ca.m.b(new CustomerInfo$allPurchasedProductIds$2(this));
        this.latestExpirationDate$delegate = Ca.m.b(new CustomerInfo$latestExpirationDate$2(this));
        this.nonSubscriptionTransactions$delegate = Ca.m.b(new CustomerInfo$nonSubscriptionTransactions$2(this));
        this.subscriptionsByProductIdentifier$delegate = Ca.m.b(new CustomerInfo$subscriptionsByProductIdentifier$2(this));
        this.subscriberJSONObject = jSONObject.getJSONObject("subscriber");
    }

    public static final /* synthetic */ Set access$activeIdentifiers(CustomerInfo customerInfo, Map map) {
        return customerInfo.activeIdentifiers(map);
    }

    public static final /* synthetic */ JSONObject access$getSubscriberJSONObject$p(CustomerInfo customerInfo) {
        return customerInfo.subscriberJSONObject;
    }

    private final Set activeIdentifiers(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (DateHelper.Companion.isDateActive-SxA4cEA$default(DateHelper.Companion, (Date) entry.getValue(), this.requestDate, 0L, 4, (Object) null).isActive()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    public static /* synthetic */ void getActiveSubscriptions$annotations() {
    }

    public static /* synthetic */ void getAllPurchasedProductIds$annotations() {
    }

    @Ca.e
    public static /* synthetic */ void getAllPurchasedSkus$annotations() {
    }

    public static /* synthetic */ void getLatestExpirationDate$annotations() {
    }

    public static /* synthetic */ void getNonSubscriptionTransactions$annotations() {
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    private static /* synthetic */ void getSubscriberJSONObject$annotations() {
    }

    public static /* synthetic */ void getSubscriptionsByProductIdentifier$annotations() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CustomerInfo) && t.c(new ComparableData(this), new ComparableData((CustomerInfo) obj));
    }

    public final Set getActiveSubscriptions() {
        return (Set) this.activeSubscriptions$delegate.getValue();
    }

    public final Map getAllExpirationDatesByProduct() {
        return this.allExpirationDatesByProduct;
    }

    public final Map getAllPurchaseDatesByProduct() {
        return this.allPurchaseDatesByProduct;
    }

    public final Set getAllPurchasedProductIds() {
        return (Set) this.allPurchasedProductIds$delegate.getValue();
    }

    public final Set getAllPurchasedSkus() {
        return (Set) this.allPurchasedSkus$delegate.getValue();
    }

    public final EntitlementInfos getEntitlements() {
        return this.entitlements;
    }

    public final Date getExpirationDateForEntitlement(String str) {
        t.g(str, "entitlement");
        EntitlementInfo entitlementInfo = (EntitlementInfo) this.entitlements.getAll().get(str);
        if (entitlementInfo != null) {
            return entitlementInfo.getExpirationDate();
        }
        return null;
    }

    public final Date getExpirationDateForProductId(String str) {
        t.g(str, "productId");
        return (Date) this.allExpirationDatesByProduct.get(str);
    }

    @Ca.e
    public final Date getExpirationDateForSku(String str) {
        t.g(str, "sku");
        return (Date) this.allExpirationDatesByProduct.get(str);
    }

    public final Date getFirstSeen() {
        return this.firstSeen;
    }

    public final Date getLatestExpirationDate() {
        return (Date) this.latestExpirationDate$delegate.getValue();
    }

    public final boolean getLoadedFromCache$purchases_defaultsBc8Release() {
        return this.loadedFromCache;
    }

    public final Uri getManagementURL() {
        return this.managementURL;
    }

    public final List getNonSubscriptionTransactions() {
        return (List) this.nonSubscriptionTransactions$delegate.getValue();
    }

    public final String getOriginalAppUserId() {
        return this.originalAppUserId;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final CustomerInfoOriginalSource getOriginalSource$purchases_defaultsBc8Release() {
        return this.originalSource;
    }

    public final Date getPurchaseDateForEntitlement(String str) {
        t.g(str, "entitlement");
        EntitlementInfo entitlementInfo = (EntitlementInfo) this.entitlements.getAll().get(str);
        if (entitlementInfo != null) {
            return entitlementInfo.getLatestPurchaseDate();
        }
        return null;
    }

    public final Date getPurchaseDateForProductId(String str) {
        t.g(str, "productId");
        return (Date) this.allPurchaseDatesByProduct.get(str);
    }

    @Ca.e
    public final Date getPurchaseDateForSku(String str) {
        t.g(str, "sku");
        return (Date) this.allPurchaseDatesByProduct.get(str);
    }

    public final Date getRequestDate() {
        return this.requestDate;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public final Map getSubscriptionsByProductIdentifier() {
        return (Map) this.subscriptionsByProductIdentifier$delegate.getValue();
    }

    public int hashCode() {
        return new ComparableData(this).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<CustomerInfo\n latestExpirationDate: ");
        sb.append(getLatestExpirationDate());
        sb.append("\nactiveSubscriptions:  ");
        Iterable<String> activeSubscriptions = getActiveSubscriptions();
        ArrayList arrayList = new ArrayList(w.y(activeSubscriptions, 10));
        for (String str : activeSubscriptions) {
            arrayList.add(x.a(str, Q.f(x.a("expiresDate", getExpirationDateForProductId(str)))));
        }
        sb.append(S.x(arrayList));
        sb.append(",\nactiveEntitlements: ");
        Map active = this.entitlements.getActive();
        ArrayList arrayList2 = new ArrayList(active.size());
        Iterator it = active.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(((Map.Entry) it.next()).toString());
        }
        sb.append(arrayList2);
        sb.append(",\nentitlements: ");
        Map all = this.entitlements.getAll();
        ArrayList arrayList3 = new ArrayList(all.size());
        Iterator it2 = all.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Map.Entry) it2.next()).toString());
        }
        sb.append(arrayList3);
        sb.append(",\nnonSubscriptionTransactions: ");
        sb.append(getNonSubscriptionTransactions());
        sb.append(",\nrequestDate: ");
        sb.append(this.requestDate);
        sb.append("\n>");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "out");
        this.entitlements.writeToParcel(parcel, i);
        Map map = this.allExpirationDatesByProduct;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeSerializable((Serializable) entry.getValue());
        }
        Map map2 = this.allPurchaseDatesByProduct;
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            parcel.writeSerializable((Serializable) entry2.getValue());
        }
        parcel.writeSerializable(this.requestDate);
        parcel.writeInt(this.schemaVersion);
        parcel.writeSerializable(this.firstSeen);
        parcel.writeString(this.originalAppUserId);
        parcel.writeParcelable(this.managementURL, i);
        parcel.writeSerializable(this.originalPurchaseDate);
        JSONObjectParceler.INSTANCE.write(this.jsonObject, parcel, i);
        parcel.writeString(this.originalSource.name());
        parcel.writeInt(this.loadedFromCache ? 1 : 0);
    }

    public JSONObject getRawData() {
        return this.jsonObject;
    }

    public /* synthetic */ CustomerInfo(EntitlementInfos entitlementInfos, Map map, Map map2, Date date, int i, Date date2, String str, Uri uri, Date date3, JSONObject jSONObject, CustomerInfoOriginalSource customerInfoOriginalSource, boolean z, int i2, kotlin.jvm.internal.k kVar) {
        this(entitlementInfos, map, map2, date, i, date2, str, uri, date3, jSONObject, (i2 & 1024) != 0 ? CustomerInfoOriginalSource.Companion.getDEFAULT() : customerInfoOriginalSource, (i2 & 2048) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomerInfo(EntitlementInfos entitlementInfos, Map map, Map map2, Date date, int i, Date date2, String str, Uri uri, Date date3, JSONObject jSONObject) {
        this(entitlementInfos, map, map2, date, i, date2, str, uri, date3, jSONObject, CustomerInfoOriginalSource.Companion.getDEFAULT(), true);
        t.g(entitlementInfos, "entitlements");
        t.g(map, "allExpirationDatesByProduct");
        t.g(map2, "allPurchaseDatesByProduct");
        t.g(date, "requestDate");
        t.g(date2, "firstSeen");
        t.g(str, "originalAppUserId");
        t.g(jSONObject, "jsonObject");
    }
}

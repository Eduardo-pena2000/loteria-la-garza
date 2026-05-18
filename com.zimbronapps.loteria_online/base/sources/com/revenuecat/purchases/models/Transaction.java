package com.revenuecat.purchases.models;

import Ca.e;
import Za.E;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.JsonTools;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.responses.SubscriptionInfoResponse;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONObject;
import tb.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Transaction implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final String displayName;
    private final boolean isSandbox;
    private final Date originalPurchaseDate;
    private final Price price;
    private final String productId;
    private final String productIdentifier;
    private final Date purchaseDate;
    private final String revenuecatId;
    private final Store store;
    private final String storeTransactionId;
    private final String transactionIdentifier;

    public static final class Creator implements Parcelable.Creator {
        public final Transaction createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new Transaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readSerializable(), parcel.readString(), Store.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readSerializable(), (Price) (parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel)));
        }

        public final Transaction[] newArray(int i) {
            return new Transaction[i];
        }
    }

    public Transaction(String str, String str2, String str3, String str4, Date date, String str5, Store store, String str6, boolean z, Date date2, Price price) {
        t.g(str, "transactionIdentifier");
        t.g(str2, "revenuecatId");
        t.g(str3, "productIdentifier");
        t.g(str4, "productId");
        t.g(date, "purchaseDate");
        t.g(store, "store");
        this.transactionIdentifier = str;
        this.revenuecatId = str2;
        this.productIdentifier = str3;
        this.productId = str4;
        this.purchaseDate = date;
        this.storeTransactionId = str5;
        this.store = store;
        this.displayName = str6;
        this.isSandbox = z;
        this.originalPurchaseDate = date2;
        this.price = price;
    }

    @e
    public static /* synthetic */ void getProductId$annotations() {
    }

    @e
    public static /* synthetic */ void getRevenuecatId$annotations() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) obj;
        return t.c(this.transactionIdentifier, transaction.transactionIdentifier) && t.c(this.revenuecatId, transaction.revenuecatId) && t.c(this.productIdentifier, transaction.productIdentifier) && t.c(this.productId, transaction.productId) && t.c(this.purchaseDate, transaction.purchaseDate) && t.c(this.storeTransactionId, transaction.storeTransactionId) && this.store == transaction.store && t.c(this.displayName, transaction.displayName) && this.isSandbox == transaction.isSandbox && t.c(this.originalPurchaseDate, transaction.originalPurchaseDate) && t.c(this.price, transaction.price);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final String getRevenuecatId() {
        return this.revenuecatId;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getStoreTransactionId() {
        return this.storeTransactionId;
    }

    public final String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    public int hashCode() {
        int hashCode = ((((((((this.transactionIdentifier.hashCode() * 31) + this.revenuecatId.hashCode()) * 31) + this.productIdentifier.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.purchaseDate.hashCode()) * 31;
        String str = this.storeTransactionId;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.store.hashCode()) * 31;
        String str2 = this.displayName;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isSandbox)) * 31;
        Date date = this.originalPurchaseDate;
        int hashCode4 = (hashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        Price price = this.price;
        return hashCode4 + (price != null ? price.hashCode() : 0);
    }

    public final boolean isSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        return "Transaction(transactionIdentifier=" + this.transactionIdentifier + ", revenuecatId=" + this.revenuecatId + ", productIdentifier=" + this.productIdentifier + ", productId=" + this.productId + ", purchaseDate=" + this.purchaseDate + ", storeTransactionId=" + this.storeTransactionId + ", store=" + this.store + ", displayName=" + this.displayName + ", isSandbox=" + this.isSandbox + ", originalPurchaseDate=" + this.originalPurchaseDate + ", price=" + this.price + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "out");
        parcel.writeString(this.transactionIdentifier);
        parcel.writeString(this.revenuecatId);
        parcel.writeString(this.productIdentifier);
        parcel.writeString(this.productId);
        parcel.writeSerializable(this.purchaseDate);
        parcel.writeString(this.storeTransactionId);
        parcel.writeString(this.store.name());
        parcel.writeString(this.displayName);
        parcel.writeInt(this.isSandbox ? 1 : 0);
        parcel.writeSerializable(this.originalPurchaseDate);
        Price price = this.price;
        if (price == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            price.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ Transaction(String str, String str2, String str3, String str4, Date date, String str5, Store store, String str6, boolean z, Date date2, Price price, int i, k kVar) {
        this(str, str2, str3, str4, date, str5, store, str6, (i & 256) != 0 ? false : z, date2, price);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e
    public Transaction(String str, String str2, String str3, String str4, Date date, String str5, Store store) {
        this(str, str2, str3, str4, date, str5, store, null, false, null, null);
        t.g(str, "transactionIdentifier");
        t.g(str2, "revenuecatId");
        t.g(str3, "productIdentifier");
        t.g(str4, "productId");
        t.g(date, "purchaseDate");
        t.g(store, "store");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Transaction(String str, JSONObject jSONObject, Locale locale, int i, k kVar) {
        if ((i & 4) != 0) {
            locale = Locale.getDefault();
            t.f(locale, "getDefault()");
        }
        this(str, jSONObject, locale);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Transaction(String str, JSONObject jSONObject, Locale locale) {
        Price price;
        String jSONObject2;
        t.g(str, "productId");
        t.g(jSONObject, "jsonObject");
        t.g(locale, "locale");
        String string = jSONObject.getString("id");
        t.f(string, "jsonObject.getString(\"id\")");
        String string2 = jSONObject.getString("id");
        t.f(string2, "jsonObject.getString(\"id\")");
        Date date = JSONObjectExtensionsKt.getDate(jSONObject, "purchase_date");
        String optString = jSONObject.optString("store_transaction_id");
        t.f(optString, "it");
        optString = E.h0(optString) ? null : optString;
        String string3 = jSONObject.getString("store");
        Store.Companion companion = Store.Companion;
        t.f(string3, "it");
        Store fromString = companion.fromString(string3);
        String optString2 = jSONObject.optString("display_name");
        t.f(optString2, "it");
        String str2 = !E.h0(optString2) ? optString2 : null;
        boolean optBoolean = jSONObject.optBoolean("is_sandbox", false);
        Date optDate = JSONObjectExtensionsKt.optDate(jSONObject, "original_purchase_date");
        JSONObject optJSONObject = jSONObject.optJSONObject("price");
        if (optJSONObject == null || (jSONObject2 = optJSONObject.toString()) == null) {
            price = null;
        } else {
            b json = JsonTools.INSTANCE.getJson();
            json.a();
            price = ((SubscriptionInfoResponse.PriceResponse) json.d(SubscriptionInfoResponse.PriceResponse.Companion.serializer(), jSONObject2)).toPrice(locale);
        }
        this(string, string2, str, str, date, optString, fromString, str2, optBoolean, optDate, price);
    }
}

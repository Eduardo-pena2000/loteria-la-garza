package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.models.RawDataContainer;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import java.util.Date;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EntitlementInfo implements Parcelable, RawDataContainer {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final Date billingIssueDetectedAt;
    private final Date expirationDate;
    private final String identifier;
    private final boolean isActive;
    private final boolean isSandbox;
    private final JSONObject jsonObject;
    private final Date latestPurchaseDate;
    private final Date originalPurchaseDate;
    private final OwnershipType ownershipType;
    private final PeriodType periodType;
    private final String productIdentifier;
    private final String productPlanIdentifier;
    private final Store store;
    private final Date unsubscribeDetectedAt;
    private final VerificationResult verification;
    private final boolean willRenew;

    public static final class Creator implements Parcelable.Creator {
        public final EntitlementInfo createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new EntitlementInfo(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, PeriodType.valueOf(parcel.readString()), parcel.readSerializable(), parcel.readSerializable(), parcel.readSerializable(), Store.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readSerializable(), parcel.readSerializable(), OwnershipType.valueOf(parcel.readString()), JSONObjectParceler.INSTANCE.create(parcel), VerificationResult.valueOf(parcel.readString()));
        }

        public final EntitlementInfo[] newArray(int i) {
            return new EntitlementInfo[i];
        }
    }

    public EntitlementInfo(String str, boolean z, boolean z2, PeriodType periodType, Date date, Date date2, Date date3, Store store, String str2, String str3, boolean z3, Date date4, Date date5, OwnershipType ownershipType, JSONObject jSONObject, VerificationResult verificationResult) {
        t.g(str, "identifier");
        t.g(periodType, "periodType");
        t.g(date, "latestPurchaseDate");
        t.g(date2, "originalPurchaseDate");
        t.g(store, "store");
        t.g(str2, "productIdentifier");
        t.g(ownershipType, "ownershipType");
        t.g(jSONObject, "jsonObject");
        t.g(verificationResult, "verification");
        this.identifier = str;
        this.isActive = z;
        this.willRenew = z2;
        this.periodType = periodType;
        this.latestPurchaseDate = date;
        this.originalPurchaseDate = date2;
        this.expirationDate = date3;
        this.store = store;
        this.productIdentifier = str2;
        this.productPlanIdentifier = str3;
        this.isSandbox = z3;
        this.unsubscribeDetectedAt = date4;
        this.billingIssueDetectedAt = date5;
        this.ownershipType = ownershipType;
        this.jsonObject = jSONObject;
        this.verification = verificationResult;
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(EntitlementInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type com.revenuecat.purchases.EntitlementInfo");
        EntitlementInfo entitlementInfo = (EntitlementInfo) obj;
        return t.c(this.identifier, entitlementInfo.identifier) && this.isActive == entitlementInfo.isActive && this.willRenew == entitlementInfo.willRenew && this.periodType == entitlementInfo.periodType && t.c(this.latestPurchaseDate, entitlementInfo.latestPurchaseDate) && t.c(this.originalPurchaseDate, entitlementInfo.originalPurchaseDate) && t.c(this.expirationDate, entitlementInfo.expirationDate) && this.store == entitlementInfo.store && t.c(this.productIdentifier, entitlementInfo.productIdentifier) && t.c(this.productPlanIdentifier, entitlementInfo.productPlanIdentifier) && this.isSandbox == entitlementInfo.isSandbox && t.c(this.unsubscribeDetectedAt, entitlementInfo.unsubscribeDetectedAt) && t.c(this.billingIssueDetectedAt, entitlementInfo.billingIssueDetectedAt) && this.ownershipType == entitlementInfo.ownershipType && this.verification == entitlementInfo.verification;
    }

    public final Date getBillingIssueDetectedAt() {
        return this.billingIssueDetectedAt;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Date getLatestPurchaseDate() {
        return this.latestPurchaseDate;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public final PeriodType getPeriodType() {
        return this.periodType;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final String getProductPlanIdentifier() {
        return this.productPlanIdentifier;
    }

    public final Store getStore() {
        return this.store;
    }

    public final Date getUnsubscribeDetectedAt() {
        return this.unsubscribeDetectedAt;
    }

    public final VerificationResult getVerification() {
        return this.verification;
    }

    public final boolean getWillRenew() {
        return this.willRenew;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.identifier.hashCode() * 31) + Boolean.hashCode(this.isActive)) * 31) + Boolean.hashCode(this.willRenew)) * 31) + this.periodType.hashCode()) * 31) + this.latestPurchaseDate.hashCode()) * 31) + this.originalPurchaseDate.hashCode()) * 31;
        Date date = this.expirationDate;
        int hashCode2 = (((((hashCode + (date != null ? date.hashCode() : 0)) * 31) + this.store.hashCode()) * 31) + this.productIdentifier.hashCode()) * 31;
        String str = this.productPlanIdentifier;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSandbox)) * 31;
        Date date2 = this.unsubscribeDetectedAt;
        int hashCode4 = (hashCode3 + (date2 != null ? date2.hashCode() : 0)) * 31;
        Date date3 = this.billingIssueDetectedAt;
        return ((hashCode4 + (date3 != null ? date3.hashCode() : 0)) * 31) + this.ownershipType.hashCode();
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        return "EntitlementInfo(identifier='" + this.identifier + "', isActive=" + this.isActive + ", willRenew=" + this.willRenew + ", periodType=" + this.periodType + ", latestPurchaseDate=" + this.latestPurchaseDate + ", originalPurchaseDate=" + this.originalPurchaseDate + ", expirationDate=" + this.expirationDate + ", store=" + this.store + ", productIdentifier='" + this.productIdentifier + "', productPlanIdentifier='" + this.productPlanIdentifier + "', isSandbox=" + this.isSandbox + ", unsubscribeDetectedAt=" + this.unsubscribeDetectedAt + ", billingIssueDetectedAt=" + this.billingIssueDetectedAt + ", ownershipType=" + this.ownershipType + ", verification=" + this.verification + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "out");
        parcel.writeString(this.identifier);
        parcel.writeInt(this.isActive ? 1 : 0);
        parcel.writeInt(this.willRenew ? 1 : 0);
        parcel.writeString(this.periodType.name());
        parcel.writeSerializable(this.latestPurchaseDate);
        parcel.writeSerializable(this.originalPurchaseDate);
        parcel.writeSerializable(this.expirationDate);
        parcel.writeString(this.store.name());
        parcel.writeString(this.productIdentifier);
        parcel.writeString(this.productPlanIdentifier);
        parcel.writeInt(this.isSandbox ? 1 : 0);
        parcel.writeSerializable(this.unsubscribeDetectedAt);
        parcel.writeSerializable(this.billingIssueDetectedAt);
        parcel.writeString(this.ownershipType.name());
        JSONObjectParceler.INSTANCE.write(this.jsonObject, parcel, i);
        parcel.writeString(this.verification.name());
    }

    public JSONObject getRawData() {
        return this.jsonObject;
    }

    public /* synthetic */ EntitlementInfo(String str, boolean z, boolean z2, PeriodType periodType, Date date, Date date2, Date date3, Store store, String str2, String str3, boolean z3, Date date4, Date date5, OwnershipType ownershipType, JSONObject jSONObject, VerificationResult verificationResult, int i, kotlin.jvm.internal.k kVar) {
        this(str, z, z2, periodType, date, date2, date3, store, str2, str3, z3, date4, date5, ownershipType, jSONObject, (i & 32768) != 0 ? VerificationResult.NOT_REQUESTED : verificationResult);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Ca.e
    public EntitlementInfo(String str, boolean z, boolean z2, PeriodType periodType, Date date, Date date2, Date date3, Store store, String str2, String str3, boolean z3, Date date4, Date date5, OwnershipType ownershipType, JSONObject jSONObject) {
        this(str, z, z2, periodType, date, date2, date3, store, str2, str3, z3, date4, date5, ownershipType, jSONObject, VerificationResult.NOT_REQUESTED);
        t.g(str, "identifier");
        t.g(periodType, "periodType");
        t.g(date, "latestPurchaseDate");
        t.g(date2, "originalPurchaseDate");
        t.g(store, "store");
        t.g(str2, "productIdentifier");
        t.g(ownershipType, "ownershipType");
        t.g(jSONObject, "jsonObject");
    }
}

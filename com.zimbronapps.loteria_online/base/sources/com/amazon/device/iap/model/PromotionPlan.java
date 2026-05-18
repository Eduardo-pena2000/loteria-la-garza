package com.amazon.device.iap.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class PromotionPlan implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 1();
    private final String promotionPrice;
    private final int promotionPriceCycles;
    private final String promotionPricePeriod;

    public static class 1 implements Parcelable.Creator {
        public PromotionPlan createFromParcel(Parcel parcel) {
            return new PromotionPlan(parcel, null);
        }

        public PromotionPlan[] newArray(int i) {
            return new PromotionPlan[i];
        }
    }

    public /* synthetic */ PromotionPlan(Parcel parcel, 1 r2) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionPlan)) {
            return false;
        }
        PromotionPlan promotionPlan = (PromotionPlan) obj;
        return getPromotionPriceCycles() == promotionPlan.getPromotionPriceCycles() && getPromotionPrice() != null && getPromotionPrice().equals(promotionPlan.getPromotionPrice()) && getPromotionPricePeriod() != null && getPromotionPricePeriod().equals(promotionPlan.getPromotionPricePeriod());
    }

    public String getPromotionPrice() {
        return this.promotionPrice;
    }

    public int getPromotionPriceCycles() {
        return this.promotionPriceCycles;
    }

    public String getPromotionPricePeriod() {
        return this.promotionPricePeriod;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("promotionPricePeriod", getPromotionPricePeriod());
        jSONObject.put("promotionPrice", getPromotionPrice());
        jSONObject.put("promotionPriceCycles", getPromotionPriceCycles());
        return jSONObject;
    }

    public String toString() {
        try {
            return toJSON().toString(4);
        } catch (JSONException unused) {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.promotionPricePeriod);
        parcel.writeString(this.promotionPrice);
        parcel.writeInt(this.promotionPriceCycles);
    }

    public PromotionPlan(String str, String str2, int i) {
        this.promotionPricePeriod = str;
        this.promotionPrice = str2;
        this.promotionPriceCycles = i;
    }

    private PromotionPlan(Parcel parcel) {
        this.promotionPricePeriod = parcel.readString();
        this.promotionPrice = parcel.readString();
        this.promotionPriceCycles = parcel.readInt();
    }
}

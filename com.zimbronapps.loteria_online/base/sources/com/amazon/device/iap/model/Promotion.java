package com.amazon.device.iap.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class Promotion implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 1();
    private List promotionPlans;
    private final String promotionType;

    public static class 1 implements Parcelable.Creator {
        public Promotion createFromParcel(Parcel parcel) {
            return new Promotion(parcel, (1) null);
        }

        public Promotion[] newArray(int i) {
            return new Promotion[i];
        }
    }

    public /* synthetic */ Promotion(Parcel parcel, 1 r2) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Promotion)) {
            return false;
        }
        Promotion promotion = (Promotion) obj;
        return getPromotionPlans() != null && getPromotionPlans().equals(promotion.getPromotionPlans()) && getPromotionType() != null && getPromotionType().equals(promotion.getPromotionType());
    }

    public List getPromotionPlans() {
        return this.promotionPlans;
    }

    public String getPromotionType() {
        return this.promotionType;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("promotionType", getPromotionType());
        JSONArray jSONArray = new JSONArray();
        Iterator it = getPromotionPlans().iterator();
        while (it.hasNext()) {
            jSONArray.put(((PromotionPlan) it.next()).toJSON());
        }
        jSONObject.put("promotionPlans", jSONArray);
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
        parcel.writeString(this.promotionType);
        parcel.writeTypedList(this.promotionPlans);
    }

    public Promotion(String str, List list) {
        this.promotionType = str;
        this.promotionPlans = list;
    }

    private Promotion(Parcel parcel) {
        this.promotionType = parcel.readString();
        this.promotionPlans = parcel.createTypedArrayList(PromotionPlan.CREATOR);
    }
}

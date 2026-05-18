package com.amazon.device.iap.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class UserData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 1();
    private static final String LWA_CONSENT_STATUS = "lwaConsentStatus";
    private static final String MARKETPLACE = "marketplace";
    private static final String USER_ID = "userId";
    private final LWAConsentStatus lwaConsentStatus;
    private final String marketplace;
    private final String userId;

    public static class 1 implements Parcelable.Creator {
        public UserData createFromParcel(Parcel parcel) {
            return new UserData(parcel, null);
        }

        public UserData[] newArray(int i) {
            return new UserData[i];
        }
    }

    public /* synthetic */ UserData(Parcel parcel, 1 r2) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public LWAConsentStatus getLWAConsentStatus() {
        return this.lwaConsentStatus;
    }

    public String getMarketplace() {
        return this.marketplace;
    }

    public String getUserId() {
        return this.userId;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userId", this.userId);
            jSONObject.put("marketplace", this.marketplace);
            jSONObject.put("lwaConsentStatus", this.lwaConsentStatus);
        } catch (JSONException unused) {
        }
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
        parcel.writeStringArray(new String[]{this.userId, this.marketplace, this.lwaConsentStatus.toString()});
    }

    private UserData(Parcel parcel) {
        this.userId = parcel.readString();
        this.marketplace = parcel.readString();
        this.lwaConsentStatus = LWAConsentStatus.valueOf(parcel.readString());
    }

    public UserData(UserDataBuilder userDataBuilder) {
        this.userId = userDataBuilder.getUserId();
        this.marketplace = userDataBuilder.getMarketplace();
        this.lwaConsentStatus = userDataBuilder.getLWAConsentStatus();
    }
}

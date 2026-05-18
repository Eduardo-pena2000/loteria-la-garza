package com.amazon.device.drm.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.o.f;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class RequestId implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 1();
    private static final String ENCODED_ID = "encodedId";
    private final String encodedId;

    public static class 1 implements Parcelable.Creator {
        public RequestId createFromParcel(Parcel parcel) {
            return new RequestId(parcel, null);
        }

        public RequestId[] newArray(int i) {
            return new RequestId[i];
        }
    }

    public /* synthetic */ RequestId(Parcel parcel, 1 r2) {
        this(parcel);
    }

    public static RequestId fromString(String str) {
        return new RequestId(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || RequestId.class != obj.getClass()) {
            return false;
        }
        return this.encodedId.equals(((RequestId) obj).encodedId);
    }

    public int hashCode() {
        String str = this.encodedId;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("encodedId", this.encodedId);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return this.encodedId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.encodedId);
    }

    private RequestId(Parcel parcel) {
        this.encodedId = parcel.readString();
    }

    public RequestId() {
        this.encodedId = UUID.randomUUID().toString();
    }

    private RequestId(String str) {
        f.a((Object) str, "encodedId");
        this.encodedId = str;
    }
}

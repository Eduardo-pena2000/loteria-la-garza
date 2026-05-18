package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EntitlementInfos implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final Map active;
    private final Map all;
    private final VerificationResult verification;

    public static final class Creator implements Parcelable.Creator {
        public final EntitlementInfos createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), EntitlementInfo.CREATOR.createFromParcel(parcel));
            }
            return new EntitlementInfos(linkedHashMap, VerificationResult.valueOf(parcel.readString()));
        }

        public final EntitlementInfos[] newArray(int i) {
            return new EntitlementInfos[i];
        }
    }

    public EntitlementInfos(Map map, VerificationResult verificationResult) {
        t.g(map, "all");
        t.g(verificationResult, "verification");
        this.all = map;
        this.verification = verificationResult;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((EntitlementInfo) entry.getValue()).isActive()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.active = linkedHashMap;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(EntitlementInfos.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type com.revenuecat.purchases.EntitlementInfos");
        EntitlementInfos entitlementInfos = (EntitlementInfos) obj;
        return t.c(this.all, entitlementInfos.all) && t.c(this.active, entitlementInfos.active) && this.verification == entitlementInfos.verification;
    }

    public final EntitlementInfo get(String str) {
        t.g(str, "s");
        return (EntitlementInfo) this.all.get(str);
    }

    public final Map getActive() {
        return this.active;
    }

    public final Map getAll() {
        return this.all;
    }

    public final VerificationResult getVerification() {
        return this.verification;
    }

    public int hashCode() {
        return (this.all.hashCode() * 31) + this.active.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "out");
        Map map = this.all;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            ((EntitlementInfo) entry.getValue()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.verification.name());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Ca.e
    public EntitlementInfos(Map map) {
        this(map, VerificationResult.NOT_REQUESTED);
        t.g(map, "all");
    }
}

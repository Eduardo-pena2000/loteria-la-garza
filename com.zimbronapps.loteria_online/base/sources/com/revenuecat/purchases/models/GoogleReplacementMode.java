package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ReplacementMode;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum GoogleReplacementMode implements ReplacementMode {
    WITHOUT_PRORATION(3),
    WITH_TIME_PRORATION(1),
    CHARGE_FULL_PRICE(5),
    CHARGE_PRORATED_PRICE(2),
    DEFERRED(6);

    public static final CREATOR CREATOR = new CREATOR(null);
    private final int playBillingClientMode;

    public static final class CREATOR implements Parcelable.Creator {
        public /* synthetic */ CREATOR(k kVar) {
            this();
        }

        public final GoogleReplacementMode fromPlayBillingClientMode(Integer num) {
            if (num == null) {
                return null;
            }
            for (GoogleReplacementMode googleReplacementMode : GoogleReplacementMode.values()) {
                if (num.intValue() == googleReplacementMode.getPlayBillingClientMode()) {
                    return googleReplacementMode;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private CREATOR() {
        }

        public GoogleReplacementMode createFromParcel(Parcel parcel) {
            t.g(parcel, "in");
            String readString = parcel.readString();
            if (readString != null) {
                return GoogleReplacementMode.valueOf(readString);
            }
            return null;
        }

        public GoogleReplacementMode[] newArray(int i) {
            return new GoogleReplacementMode[i];
        }
    }

    GoogleReplacementMode(int i) {
        this.playBillingClientMode = i;
    }

    public int describeContents() {
        return 0;
    }

    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    public final int getPlayBillingClientMode() {
        return this.playBillingClientMode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "out");
        parcel.writeString(name());
    }
}

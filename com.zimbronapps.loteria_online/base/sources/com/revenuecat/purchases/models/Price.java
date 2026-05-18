package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Price implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final long amountMicros;
    private final String currencyCode;
    private final String formatted;

    public static final class Creator implements Parcelable.Creator {
        public final Price createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new Price(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        public final Price[] newArray(int i) {
            return new Price[i];
        }
    }

    public Price(String str, long j, String str2) {
        t.g(str, "formatted");
        t.g(str2, "currencyCode");
        this.formatted = str;
        this.amountMicros = j;
        this.currencyCode = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return t.c(this.formatted, price.formatted) && this.amountMicros == price.amountMicros && t.c(this.currencyCode, price.currencyCode);
    }

    public final long getAmountMicros() {
        return this.amountMicros;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getFormatted() {
        return this.formatted;
    }

    public int hashCode() {
        return (((this.formatted.hashCode() * 31) + Long.hashCode(this.amountMicros)) * 31) + this.currencyCode.hashCode();
    }

    public String toString() {
        return "Price(formatted=" + this.formatted + ", amountMicros=" + this.amountMicros + ", currencyCode=" + this.currencyCode + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "out");
        parcel.writeString(this.formatted);
        parcel.writeLong(this.amountMicros);
        parcel.writeString(this.currencyCode);
    }
}

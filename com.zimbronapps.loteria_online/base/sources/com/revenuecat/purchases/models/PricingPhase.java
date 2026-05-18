package com.revenuecat.purchases.models;

import Ca.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.utils.PriceExtensionsKt;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PricingPhase implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final Integer billingCycleCount;
    private final Period billingPeriod;
    private final Price price;
    private final RecurrenceMode recurrenceMode;

    public static final class Creator implements Parcelable.Creator {
        public final PricingPhase createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new PricingPhase((Period) Period.CREATOR.createFromParcel(parcel), RecurrenceMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Price) Price.CREATOR.createFromParcel(parcel));
        }

        public final PricingPhase[] newArray(int i) {
            return new PricingPhase[i];
        }
    }

    public PricingPhase(Period period, RecurrenceMode recurrenceMode, Integer num, Price price) {
        t.g(period, "billingPeriod");
        t.g(recurrenceMode, "recurrenceMode");
        t.g(price, "price");
        this.billingPeriod = period;
        this.recurrenceMode = recurrenceMode;
        this.billingCycleCount = num;
        this.price = price;
    }

    public static /* synthetic */ String formattedPriceInMonths$default(PricingPhase pricingPhase, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            t.f(locale, "getDefault()");
        }
        return pricingPhase.formattedPriceInMonths(locale);
    }

    public static /* synthetic */ Price pricePerDay$default(PricingPhase pricingPhase, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            t.f(locale, "getDefault()");
        }
        return pricingPhase.pricePerDay(locale);
    }

    public static /* synthetic */ Price pricePerMonth$default(PricingPhase pricingPhase, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            t.f(locale, "getDefault()");
        }
        return pricingPhase.pricePerMonth(locale);
    }

    public static /* synthetic */ Price pricePerWeek$default(PricingPhase pricingPhase, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            t.f(locale, "getDefault()");
        }
        return pricingPhase.pricePerWeek(locale);
    }

    public static /* synthetic */ Price pricePerYear$default(PricingPhase pricingPhase, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = Locale.getDefault();
            t.f(locale, "getDefault()");
        }
        return pricingPhase.pricePerYear(locale);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PricingPhase)) {
            return false;
        }
        PricingPhase pricingPhase = (PricingPhase) obj;
        return t.c(this.billingPeriod, pricingPhase.billingPeriod) && this.recurrenceMode == pricingPhase.recurrenceMode && t.c(this.billingCycleCount, pricingPhase.billingCycleCount) && t.c(this.price, pricingPhase.price);
    }

    @e
    public final String formattedPriceInMonths() {
        return formattedPriceInMonths$default(this, null, 1, null);
    }

    public final Integer getBillingCycleCount() {
        return this.billingCycleCount;
    }

    public final Period getBillingPeriod() {
        return this.billingPeriod;
    }

    public final OfferPaymentMode getOfferPaymentMode() {
        if (this.recurrenceMode != RecurrenceMode.FINITE_RECURRING) {
            return null;
        }
        if (this.price.getAmountMicros() == 0) {
            return OfferPaymentMode.FREE_TRIAL;
        }
        Integer num = this.billingCycleCount;
        if (num != null && num.intValue() == 1) {
            return OfferPaymentMode.SINGLE_PAYMENT;
        }
        Integer num2 = this.billingCycleCount;
        if (num2 == null || num2.intValue() <= 1) {
            return null;
        }
        return OfferPaymentMode.DISCOUNTED_RECURRING_PAYMENT;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final RecurrenceMode getRecurrenceMode() {
        return this.recurrenceMode;
    }

    public int hashCode() {
        int hashCode = ((this.billingPeriod.hashCode() * 31) + this.recurrenceMode.hashCode()) * 31;
        Integer num = this.billingCycleCount;
        return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.price.hashCode();
    }

    public final Price pricePerDay() {
        return pricePerDay$default(this, null, 1, null);
    }

    public final Price pricePerMonth() {
        return pricePerMonth$default(this, null, 1, null);
    }

    public final Price pricePerWeek() {
        return pricePerWeek$default(this, null, 1, null);
    }

    public final Price pricePerYear() {
        return pricePerYear$default(this, null, 1, null);
    }

    public String toString() {
        return "PricingPhase(billingPeriod=" + this.billingPeriod + ", recurrenceMode=" + this.recurrenceMode + ", billingCycleCount=" + this.billingCycleCount + ", price=" + this.price + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        int intValue;
        t.g(parcel, "out");
        this.billingPeriod.writeToParcel(parcel, i);
        parcel.writeString(this.recurrenceMode.name());
        Integer num = this.billingCycleCount;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        this.price.writeToParcel(parcel, i);
    }

    @e
    public final String formattedPriceInMonths(Locale locale) {
        t.g(locale, "locale");
        return pricePerMonth(locale).getFormatted();
    }

    public final Price pricePerDay(Locale locale) {
        t.g(locale, "locale");
        return PriceExtensionsKt.pricePerDay(this.price, this.billingPeriod, locale);
    }

    public final Price pricePerMonth(Locale locale) {
        t.g(locale, "locale");
        return PriceExtensionsKt.pricePerMonth(this.price, this.billingPeriod, locale);
    }

    public final Price pricePerWeek(Locale locale) {
        t.g(locale, "locale");
        return PriceExtensionsKt.pricePerWeek(this.price, this.billingPeriod, locale);
    }

    public final Price pricePerYear(Locale locale) {
        t.g(locale, "locale");
        return PriceExtensionsKt.pricePerYear(this.price, this.billingPeriod, locale);
    }
}

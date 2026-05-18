package com.revenuecat.purchases.models;

import Ca.o;
import Ca.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Period implements Parcelable {
    private final String iso8601;
    private final Unit unit;
    private final int value;
    public static final Factory Factory = new Factory(null);
    public static final Parcelable.Creator CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator {
        public final Period createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new Period(parcel.readInt(), Unit.valueOf(parcel.readString()), parcel.readString());
        }

        public final Period[] newArray(int i) {
            return new Period[i];
        }
    }

    public static final class Factory {
        public /* synthetic */ Factory(k kVar) {
            this();
        }

        public final Period create(String str) {
            t.g(str, "iso8601");
            q access$toPeriod = PeriodKt.access$toPeriod(str);
            return new Period(((Number) access$toPeriod.c()).intValue(), (Unit) access$toPeriod.d(), str);
        }

        private Factory() {
        }
    }

    public enum Unit {
        DAY,
        WEEK,
        MONTH,
        YEAR,
        UNKNOWN
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Unit.values().length];
            try {
                iArr[Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Period(int i, Unit unit, String str) {
        t.g(unit, "unit");
        t.g(str, "iso8601");
        this.value = i;
        this.unit = unit;
        this.iso8601 = str;
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getValueInDays$annotations() {
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getValueInWeeks$annotations() {
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getValueInYears$annotations() {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.value == period.value && this.unit == period.unit && t.c(this.iso8601, period.iso8601);
    }

    public final String getIso8601() {
        return this.iso8601;
    }

    public final Unit getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public final double getValueInDays() {
        double d;
        double d2;
        int i = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i == 1) {
            return this.value;
        }
        if (i == 2) {
            d = this.value;
            d2 = 7.0d;
        } else if (i == 3) {
            d = this.value;
            d2 = 30.0d;
        } else {
            if (i != 4) {
                if (i != 5) {
                    throw new o();
                }
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unknown period unit trying to get value in days: " + this.unit, null);
                return 0.0d;
            }
            d = this.value;
            d2 = 365.0d;
        }
        return d * d2;
    }

    public final double getValueInMonths() {
        double d;
        double d2;
        int i = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i == 1) {
            d = this.value;
            d2 = 30.0d;
        } else {
            if (i != 2) {
                if (i == 3) {
                    return this.value;
                }
                if (i == 4) {
                    return this.value * 12.0d;
                }
                if (i != 5) {
                    throw new o();
                }
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unknown period unit trying to get value in months: " + this.unit, null);
                return 0.0d;
            }
            d = this.value;
            d2 = 4.345238095238096d;
        }
        return d / d2;
    }

    public final double getValueInWeeks() {
        double d;
        double d2;
        int i = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i == 1) {
            return this.value / 7.0d;
        }
        if (i == 2) {
            return this.value;
        }
        if (i == 3) {
            d = this.value;
            d2 = 4.345238095238096d;
        } else {
            if (i != 4) {
                if (i != 5) {
                    throw new o();
                }
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unknown period unit trying to get value in weeks: " + this.unit, null);
                return 0.0d;
            }
            d = this.value;
            d2 = 52.142857142857146d;
        }
        return d * d2;
    }

    public final double getValueInYears() {
        double d;
        double d2;
        int i = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i == 1) {
            d = this.value;
            d2 = 365.0d;
        } else if (i == 2) {
            d = this.value;
            d2 = 52.142857142857146d;
        } else {
            if (i != 3) {
                if (i == 4) {
                    return this.value;
                }
                if (i != 5) {
                    throw new o();
                }
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unknown period unit trying to get value in years: " + this.unit, null);
                return 0.0d;
            }
            d = this.value;
            d2 = 12.0d;
        }
        return d / d2;
    }

    public int hashCode() {
        return (((this.value * 31) + this.unit.hashCode()) * 31) + this.iso8601.hashCode();
    }

    public String toString() {
        return "Period(value=" + this.value + ", unit=" + this.unit + ", iso8601=" + this.iso8601 + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "out");
        parcel.writeInt(this.value);
        parcel.writeString(this.unit.name());
        parcel.writeString(this.iso8601);
    }
}

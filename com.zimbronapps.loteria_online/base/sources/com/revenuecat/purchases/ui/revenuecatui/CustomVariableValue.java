package com.revenuecat.purchases.ui.revenuecatui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class CustomVariableValue implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final class Boolean extends CustomVariableValue implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator CREATOR = new Creator();
        private final boolean value;

        public static final class Creator implements Parcelable.Creator {
            public final Boolean createFromParcel(Parcel parcel) {
                t.g(parcel, "parcel");
                return new Boolean(parcel.readInt() != 0);
            }

            public final Boolean[] newArray(int i) {
                return new Boolean[i];
            }
        }

        public Boolean(boolean z) {
            this.value = z;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Boolean) && this.value == ((Boolean) obj).value;
        }

        public final boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            return java.lang.Boolean.hashCode(this.value);
        }

        public java.lang.String toString() {
            return "CustomVariableValue.Boolean(value=" + this.value + ')';
        }

        public void writeToParcel(Parcel out, int i) {
            t.g(out, "out");
            out.writeInt(this.value ? 1 : 0);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final CustomVariableValue from(Object value) {
            t.g(value, "value");
            if (value instanceof java.lang.String) {
                return new String((java.lang.String) value);
            }
            if (value instanceof Integer) {
                return new Number(((java.lang.Number) value).intValue());
            }
            if (value instanceof Long) {
                return new Number(((java.lang.Number) value).longValue());
            }
            if (value instanceof Double) {
                return new Number(((java.lang.Number) value).doubleValue());
            }
            if (value instanceof Float) {
                return new Number(((java.lang.Number) value).floatValue());
            }
            if (value instanceof java.lang.Boolean) {
                return new Boolean(((java.lang.Boolean) value).booleanValue());
            }
            throw new IllegalArgumentException("Unsupported custom variable type: " + P.b(value.getClass()).e() + ". Supported types are: String, Int, Long, Double, Float, Boolean.");
        }

        private Companion() {
        }
    }

    public static final class Number extends CustomVariableValue implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator CREATOR = new Creator();
        private final double value;

        public static final class Creator implements Parcelable.Creator {
            public final Number createFromParcel(Parcel parcel) {
                t.g(parcel, "parcel");
                return new Number(parcel.readDouble());
            }

            public final Number[] newArray(int i) {
                return new Number[i];
            }
        }

        public Number(double d) {
            this.value = d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Number) && this.value == ((Number) obj).value;
        }

        public final double getValue() {
            return this.value;
        }

        public int hashCode() {
            return Double.hashCode(this.value);
        }

        public java.lang.String toString() {
            return "CustomVariableValue.Number(value=" + this.value + ')';
        }

        public void writeToParcel(Parcel out, int i) {
            t.g(out, "out");
            out.writeDouble(this.value);
        }

        public Number(int i) {
            this(i);
        }

        public Number(long j) {
            this(j);
        }

        public Number(float f) {
            this(f);
        }
    }

    public static final class String extends CustomVariableValue implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator CREATOR = new Creator();
        private final java.lang.String value;

        public static final class Creator implements Parcelable.Creator {
            public final String createFromParcel(Parcel parcel) {
                t.g(parcel, "parcel");
                return new String(parcel.readString());
            }

            public final String[] newArray(int i) {
                return new String[i];
            }
        }

        public String(java.lang.String value) {
            t.g(value, "value");
            this.value = value;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof String) && t.c(this.value, ((String) obj).value);
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public java.lang.String toString() {
            return "CustomVariableValue.String(value=" + this.value + ')';
        }

        public void writeToParcel(Parcel out, int i) {
            t.g(out, "out");
            out.writeString(this.value);
        }
    }

    public final java.lang.String getStringValue() {
        if (this instanceof String) {
            return ((String) this).getValue();
        }
        if (this instanceof Number) {
            Number number = (Number) this;
            return number.getValue() % 1.0d == 0.0d ? java.lang.String.valueOf((long) number.getValue()) : java.lang.String.valueOf(number.getValue());
        }
        if (this instanceof Boolean) {
            return java.lang.String.valueOf(((Boolean) this).getValue());
        }
        throw new IllegalStateException("Unknown CustomVariableValue type");
    }
}

package com.revenuecat.purchases.ui.revenuecatui.activity;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class PaywallResult implements Parcelable {
    public static final int $stable = 0;

    public static final class Cancelled extends PaywallResult implements Parcelable {
        public static final int $stable = 0;
        public static final Cancelled INSTANCE = new Cancelled();
        public static final Parcelable.Creator CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator {
            public final Cancelled createFromParcel(Parcel parcel) {
                t.g(parcel, "parcel");
                parcel.readInt();
                return Cancelled.INSTANCE;
            }

            public final Cancelled[] newArray(int i) {
                return new Cancelled[i];
            }
        }

        private Cancelled() {
            super(null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel out, int i) {
            t.g(out, "out");
            out.writeInt(1);
        }
    }

    public static final class Error extends PaywallResult implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator CREATOR = new Creator();
        private final PurchasesError error;

        public static final class Creator implements Parcelable.Creator {
            public final Error createFromParcel(Parcel parcel) {
                t.g(parcel, "parcel");
                return new Error(parcel.readParcelable(Error.class.getClassLoader()));
            }

            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(PurchasesError error) {
            super(null);
            t.g(error, "error");
            this.error = error;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && t.c(this.error, ((Error) obj).error);
        }

        public final PurchasesError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ')';
        }

        public void writeToParcel(Parcel out, int i) {
            t.g(out, "out");
            out.writeParcelable(this.error, i);
        }
    }

    public static final class Purchased extends PaywallResult implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator CREATOR = new Creator();
        private final CustomerInfo customerInfo;

        public static final class Creator implements Parcelable.Creator {
            public final Purchased createFromParcel(Parcel parcel) {
                t.g(parcel, "parcel");
                return new Purchased(parcel.readParcelable(Purchased.class.getClassLoader()));
            }

            public final Purchased[] newArray(int i) {
                return new Purchased[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Purchased(CustomerInfo customerInfo) {
            super(null);
            t.g(customerInfo, "customerInfo");
            this.customerInfo = customerInfo;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Purchased) && t.c(this.customerInfo, ((Purchased) obj).customerInfo);
        }

        public final CustomerInfo getCustomerInfo() {
            return this.customerInfo;
        }

        public int hashCode() {
            return this.customerInfo.hashCode();
        }

        public String toString() {
            return "Purchased(customerInfo=" + this.customerInfo + ')';
        }

        public void writeToParcel(Parcel out, int i) {
            t.g(out, "out");
            out.writeParcelable(this.customerInfo, i);
        }
    }

    public static final class Restored extends PaywallResult implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator CREATOR = new Creator();
        private final CustomerInfo customerInfo;

        public static final class Creator implements Parcelable.Creator {
            public final Restored createFromParcel(Parcel parcel) {
                t.g(parcel, "parcel");
                return new Restored(parcel.readParcelable(Restored.class.getClassLoader()));
            }

            public final Restored[] newArray(int i) {
                return new Restored[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Restored(CustomerInfo customerInfo) {
            super(null);
            t.g(customerInfo, "customerInfo");
            this.customerInfo = customerInfo;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Restored) && t.c(this.customerInfo, ((Restored) obj).customerInfo);
        }

        public final CustomerInfo getCustomerInfo() {
            return this.customerInfo;
        }

        public int hashCode() {
            return this.customerInfo.hashCode();
        }

        public String toString() {
            return "Restored(customerInfo=" + this.customerInfo + ')';
        }

        public void writeToParcel(Parcel out, int i) {
            t.g(out, "out");
            out.writeParcelable(this.customerInfo, i);
        }
    }

    public /* synthetic */ PaywallResult(k kVar) {
        this();
    }

    private PaywallResult() {
    }
}

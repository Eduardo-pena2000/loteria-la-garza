package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchasesError implements Parcelable, Serializable {
    private static final long serialVersionUID = 81719171;
    private final PurchasesErrorCode code;
    private final String underlyingErrorMessage;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator {
        public final PurchasesError createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new PurchasesError(PurchasesErrorCode.valueOf(parcel.readString()), parcel.readString());
        }

        public final PurchasesError[] newArray(int i) {
            return new PurchasesError[i];
        }
    }

    public PurchasesError(PurchasesErrorCode purchasesErrorCode, String str) {
        t.g(purchasesErrorCode, "code");
        this.code = purchasesErrorCode;
        this.underlyingErrorMessage = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(PurchasesError.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type com.revenuecat.purchases.PurchasesError");
        PurchasesError purchasesError = (PurchasesError) obj;
        return this.code == purchasesError.code && t.c(this.underlyingErrorMessage, purchasesError.underlyingErrorMessage);
    }

    public final PurchasesErrorCode getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.code.getDescription();
    }

    public final String getUnderlyingErrorMessage() {
        return this.underlyingErrorMessage;
    }

    public int hashCode() {
        int hashCode = this.code.hashCode() * 31;
        String str = this.underlyingErrorMessage;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PurchasesError(code=" + this.code + ", underlyingErrorMessage=" + this.underlyingErrorMessage + ", message='" + getMessage() + "')";
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "out");
        parcel.writeString(this.code.name());
        parcel.writeString(this.underlyingErrorMessage);
    }

    public /* synthetic */ PurchasesError(PurchasesErrorCode purchasesErrorCode, String str, int i, kotlin.jvm.internal.k kVar) {
        this(purchasesErrorCode, (i & 2) != 0 ? null : str);
    }
}

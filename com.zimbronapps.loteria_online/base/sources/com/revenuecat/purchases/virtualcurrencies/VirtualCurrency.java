package com.revenuecat.purchases.virtualcurrencies;

import Ca.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;
import sb.x0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VirtualCurrency implements Parcelable {
    private final int balance;
    private final String code;
    private final String name;
    private final String serverDescription;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return VirtualCurrency$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator {
        public final VirtualCurrency createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new VirtualCurrency(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final VirtualCurrency[] newArray(int i) {
            return new VirtualCurrency[i];
        }
    }

    @e
    public /* synthetic */ VirtualCurrency(int i, int i2, String str, String str2, String str3, t0 t0Var) {
        if (7 != (i & 7)) {
            f0.a(i, 7, VirtualCurrency$$serializer.INSTANCE.getDescriptor());
        }
        this.balance = i2;
        this.name = str;
        this.code = str2;
        if ((i & 8) == 0) {
            this.serverDescription = null;
        } else {
            this.serverDescription = str3;
        }
    }

    public static /* synthetic */ void getServerDescription$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(VirtualCurrency virtualCurrency, d dVar, qb.e eVar) {
        dVar.n(eVar, 0, virtualCurrency.balance);
        dVar.v(eVar, 1, virtualCurrency.name);
        dVar.v(eVar, 2, virtualCurrency.code);
        if (!dVar.e(eVar, 3) && virtualCurrency.serverDescription == null) {
            return;
        }
        dVar.j(eVar, 3, x0.a, virtualCurrency.serverDescription);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualCurrency)) {
            return false;
        }
        VirtualCurrency virtualCurrency = (VirtualCurrency) obj;
        return this.balance == virtualCurrency.balance && t.c(this.name, virtualCurrency.name) && t.c(this.code, virtualCurrency.code) && t.c(this.serverDescription, virtualCurrency.serverDescription);
    }

    public final int getBalance() {
        return this.balance;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public int hashCode() {
        int hashCode = ((((this.balance * 31) + this.name.hashCode()) * 31) + this.code.hashCode()) * 31;
        String str = this.serverDescription;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VirtualCurrency(balance=" + this.balance + ", name=" + this.name + ", code=" + this.code + ", serverDescription=" + this.serverDescription + ')';
    }

    public void writeToParcel(Parcel out, int i) {
        t.g(out, "out");
        out.writeInt(this.balance);
        out.writeString(this.name);
        out.writeString(this.code);
        out.writeString(this.serverDescription);
    }

    @InternalRevenueCatAPI
    public VirtualCurrency(int i, String name, String code, String str) {
        t.g(name, "name");
        t.g(code, "code");
        this.balance = i;
        this.name = name;
        this.code = code;
        this.serverDescription = str;
    }

    public /* synthetic */ VirtualCurrency(int i, String str, String str2, String str3, int i2, k kVar) {
        this(i, str, str2, (i2 & 8) != 0 ? null : str3);
    }
}

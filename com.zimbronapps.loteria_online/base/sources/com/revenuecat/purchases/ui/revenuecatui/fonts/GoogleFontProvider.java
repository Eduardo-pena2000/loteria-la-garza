package com.revenuecat.purchases.ui.revenuecatui.fonts;

import android.os.Parcel;
import android.os.Parcelable;
import e1.c;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GoogleFontProvider implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator CREATOR = new Creator();
    private final int certificates;
    private final String providerAuthority;
    private final String providerPackage;

    public static final class Creator implements Parcelable.Creator {
        public final GoogleFontProvider createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new GoogleFontProvider(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        public final GoogleFontProvider[] newArray(int i) {
            return new GoogleFontProvider[i];
        }
    }

    public GoogleFontProvider(int i, String providerAuthority, String providerPackage) {
        t.g(providerAuthority, "providerAuthority");
        t.g(providerPackage, "providerPackage");
        this.certificates = i;
        this.providerAuthority = providerAuthority;
        this.providerPackage = providerPackage;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleFontProvider)) {
            return false;
        }
        GoogleFontProvider googleFontProvider = (GoogleFontProvider) obj;
        return this.certificates == googleFontProvider.certificates && t.c(this.providerAuthority, googleFontProvider.providerAuthority) && t.c(this.providerPackage, googleFontProvider.providerPackage);
    }

    public final int getCertificates() {
        return this.certificates;
    }

    public final String getProviderAuthority() {
        return this.providerAuthority;
    }

    public final String getProviderPackage() {
        return this.providerPackage;
    }

    public int hashCode() {
        return (((this.certificates * 31) + this.providerAuthority.hashCode()) * 31) + this.providerPackage.hashCode();
    }

    public final c.a toGoogleProvider() {
        return new c.a(this.providerAuthority, this.providerPackage, this.certificates);
    }

    public String toString() {
        return "GoogleFontProvider(certificates=" + this.certificates + ", providerAuthority=" + this.providerAuthority + ", providerPackage=" + this.providerPackage + ')';
    }

    public void writeToParcel(Parcel out, int i) {
        t.g(out, "out");
        out.writeInt(this.certificates);
        out.writeString(this.providerAuthority);
        out.writeString(this.providerPackage);
    }

    public /* synthetic */ GoogleFontProvider(int i, String str, String str2, int i2, k kVar) {
        this(i, (i2 & 2) != 0 ? "com.google.android.gms.fonts" : str, (i2 & 4) != 0 ? "com.google.android.gms" : str2);
    }
}

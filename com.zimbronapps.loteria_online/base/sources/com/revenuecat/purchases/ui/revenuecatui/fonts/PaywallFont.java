package com.revenuecat.purchases.ui.revenuecatui.fonts;

import android.os.Parcel;
import android.os.Parcelable;
import d1.H;
import d1.L;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class PaywallFont implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ PaywallFont(k kVar) {
        this();
    }

    private PaywallFont() {
    }

    public static final class AssetFont extends PaywallFont {
        public static final int $stable = 0;
        public static final Parcelable.Creator CREATOR = new Creator();
        private final int fontStyle;
        private final L fontWeight;
        private final String path;

        public static final class Creator implements Parcelable.Creator {
            public final AssetFont createFromParcel(Parcel parcel) {
                t.g(parcel, "parcel");
                return new AssetFont(parcel.readString(), FontWeightParceler.INSTANCE.create(parcel), parcel.readInt());
            }

            public final AssetFont[] newArray(int i) {
                return new AssetFont[i];
            }
        }

        public /* synthetic */ AssetFont(String str, L l, int i, int i2, k kVar) {
            this(str, (i2 & 2) != 0 ? L.b.g() : l, (i2 & 4) != 0 ? H.b.b() : i);
        }

        public static /* synthetic */ void getFontWeight$annotations() {
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetFont)) {
                return false;
            }
            AssetFont assetFont = (AssetFont) obj;
            return t.c(this.path, assetFont.path) && t.c(this.fontWeight, assetFont.fontWeight) && this.fontStyle == assetFont.fontStyle;
        }

        public final int getFontStyle() {
            return this.fontStyle;
        }

        public final L getFontWeight() {
            return this.fontWeight;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return (((this.path.hashCode() * 31) + this.fontWeight.hashCode()) * 31) + this.fontStyle;
        }

        public String toString() {
            return "AssetFont(path=" + this.path + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ')';
        }

        public void writeToParcel(Parcel out, int i) {
            t.g(out, "out");
            out.writeString(this.path);
            FontWeightParceler.INSTANCE.write(this.fontWeight, out, i);
            out.writeInt(this.fontStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssetFont(String path, L fontWeight, int i) {
            super(null);
            t.g(path, "path");
            t.g(fontWeight, "fontWeight");
            this.path = path;
            this.fontWeight = fontWeight;
            this.fontStyle = i;
        }
    }

    public static final class GoogleFont extends PaywallFont {
        public static final int $stable = 0;
        public static final Parcelable.Creator CREATOR = new Creator();
        private final String fontName;
        private final GoogleFontProvider fontProvider;
        private final int fontStyle;
        private final L fontWeight;

        public static final class Creator implements Parcelable.Creator {
            public final GoogleFont createFromParcel(Parcel parcel) {
                t.g(parcel, "parcel");
                return new GoogleFont(parcel.readString(), (GoogleFontProvider) GoogleFontProvider.CREATOR.createFromParcel(parcel), FontWeightParceler.INSTANCE.create(parcel), parcel.readInt());
            }

            public final GoogleFont[] newArray(int i) {
                return new GoogleFont[i];
            }
        }

        public /* synthetic */ GoogleFont(String str, GoogleFontProvider googleFontProvider, L l, int i, int i2, k kVar) {
            this(str, googleFontProvider, (i2 & 4) != 0 ? L.b.g() : l, (i2 & 8) != 0 ? H.b.b() : i);
        }

        public static /* synthetic */ void getFontWeight$annotations() {
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoogleFont)) {
                return false;
            }
            GoogleFont googleFont = (GoogleFont) obj;
            return t.c(this.fontName, googleFont.fontName) && t.c(this.fontProvider, googleFont.fontProvider) && t.c(this.fontWeight, googleFont.fontWeight) && this.fontStyle == googleFont.fontStyle;
        }

        public final String getFontName() {
            return this.fontName;
        }

        public final GoogleFontProvider getFontProvider() {
            return this.fontProvider;
        }

        public final int getFontStyle() {
            return this.fontStyle;
        }

        public final L getFontWeight() {
            return this.fontWeight;
        }

        public int hashCode() {
            return (((((this.fontName.hashCode() * 31) + this.fontProvider.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + this.fontStyle;
        }

        public String toString() {
            return "GoogleFont(fontName=" + this.fontName + ", fontProvider=" + this.fontProvider + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ')';
        }

        public void writeToParcel(Parcel out, int i) {
            t.g(out, "out");
            out.writeString(this.fontName);
            this.fontProvider.writeToParcel(out, i);
            FontWeightParceler.INSTANCE.write(this.fontWeight, out, i);
            out.writeInt(this.fontStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoogleFont(String fontName, GoogleFontProvider fontProvider, L fontWeight, int i) {
            super(null);
            t.g(fontName, "fontName");
            t.g(fontProvider, "fontProvider");
            t.g(fontWeight, "fontWeight");
            this.fontName = fontName;
            this.fontProvider = fontProvider;
            this.fontWeight = fontWeight;
            this.fontStyle = i;
        }
    }

    public static final class ResourceFont extends PaywallFont {
        public static final int $stable = 0;
        public static final Parcelable.Creator CREATOR = new Creator();
        private final int fontStyle;
        private final L fontWeight;
        private final int resourceId;

        public static final class Creator implements Parcelable.Creator {
            public final ResourceFont createFromParcel(Parcel parcel) {
                t.g(parcel, "parcel");
                return new ResourceFont(parcel.readInt(), FontWeightParceler.INSTANCE.create(parcel), parcel.readInt());
            }

            public final ResourceFont[] newArray(int i) {
                return new ResourceFont[i];
            }
        }

        public /* synthetic */ ResourceFont(int i, L l, int i2, int i3, k kVar) {
            this(i, (i3 & 2) != 0 ? L.b.g() : l, (i3 & 4) != 0 ? H.b.b() : i2);
        }

        public static /* synthetic */ void getFontWeight$annotations() {
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResourceFont)) {
                return false;
            }
            ResourceFont resourceFont = (ResourceFont) obj;
            return this.resourceId == resourceFont.resourceId && t.c(this.fontWeight, resourceFont.fontWeight) && this.fontStyle == resourceFont.fontStyle;
        }

        public final int getFontStyle() {
            return this.fontStyle;
        }

        public final L getFontWeight() {
            return this.fontWeight;
        }

        public final int getResourceId() {
            return this.resourceId;
        }

        public int hashCode() {
            return (((this.resourceId * 31) + this.fontWeight.hashCode()) * 31) + this.fontStyle;
        }

        public String toString() {
            return "ResourceFont(resourceId=" + this.resourceId + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ')';
        }

        public void writeToParcel(Parcel out, int i) {
            t.g(out, "out");
            out.writeInt(this.resourceId);
            FontWeightParceler.INSTANCE.write(this.fontWeight, out, i);
            out.writeInt(this.fontStyle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceFont(int i, L fontWeight, int i2) {
            super(null);
            t.g(fontWeight, "fontWeight");
            this.resourceId = i;
            this.fontWeight = fontWeight;
            this.fontStyle = i2;
        }
    }
}

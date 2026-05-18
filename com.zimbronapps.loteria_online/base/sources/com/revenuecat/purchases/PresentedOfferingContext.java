package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PresentedOfferingContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final String offeringIdentifier;
    private final String placementIdentifier;
    private final TargetingContext targetingContext;

    public static final class Creator implements Parcelable.Creator {
        public final PresentedOfferingContext createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new PresentedOfferingContext(parcel.readString(), parcel.readString(), (TargetingContext) (parcel.readInt() == 0 ? null : TargetingContext.CREATOR.createFromParcel(parcel)));
        }

        public final PresentedOfferingContext[] newArray(int i) {
            return new PresentedOfferingContext[i];
        }
    }

    public static final class TargetingContext implements Parcelable {
        public static final Parcelable.Creator CREATOR = new Creator();
        private final int revision;
        private final String ruleId;

        public static final class Creator implements Parcelable.Creator {
            public final TargetingContext createFromParcel(Parcel parcel) {
                t.g(parcel, "parcel");
                return new TargetingContext(parcel.readInt(), parcel.readString());
            }

            public final TargetingContext[] newArray(int i) {
                return new TargetingContext[i];
            }
        }

        public TargetingContext(int i, String str) {
            t.g(str, "ruleId");
            this.revision = i;
            this.ruleId = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TargetingContext)) {
                return false;
            }
            TargetingContext targetingContext = (TargetingContext) obj;
            return this.revision == targetingContext.revision && t.c(this.ruleId, targetingContext.ruleId);
        }

        public final int getRevision() {
            return this.revision;
        }

        public final String getRuleId() {
            return this.ruleId;
        }

        public int hashCode() {
            return (this.revision * 31) + this.ruleId.hashCode();
        }

        public String toString() {
            return "TargetingContext(revision=" + this.revision + ", ruleId=" + this.ruleId + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            t.g(parcel, "out");
            parcel.writeInt(this.revision);
            parcel.writeString(this.ruleId);
        }
    }

    public PresentedOfferingContext(String str, String str2, TargetingContext targetingContext) {
        t.g(str, "offeringIdentifier");
        this.offeringIdentifier = str;
        this.placementIdentifier = str2;
        this.targetingContext = targetingContext;
    }

    public static /* synthetic */ PresentedOfferingContext copy$default(PresentedOfferingContext presentedOfferingContext, String str, String str2, TargetingContext targetingContext, int i, Object obj) {
        if ((i & 1) != 0) {
            str = presentedOfferingContext.offeringIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = presentedOfferingContext.placementIdentifier;
        }
        if ((i & 4) != 0) {
            targetingContext = presentedOfferingContext.targetingContext;
        }
        return presentedOfferingContext.copy(str, str2, targetingContext);
    }

    @InternalRevenueCatAPI
    public final /* synthetic */ PresentedOfferingContext copy(String str, String str2, TargetingContext targetingContext) {
        t.g(str, "offeringIdentifier");
        return new PresentedOfferingContext(str, str2, targetingContext);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentedOfferingContext)) {
            return false;
        }
        PresentedOfferingContext presentedOfferingContext = (PresentedOfferingContext) obj;
        return t.c(this.offeringIdentifier, presentedOfferingContext.offeringIdentifier) && t.c(this.placementIdentifier, presentedOfferingContext.placementIdentifier) && t.c(this.targetingContext, presentedOfferingContext.targetingContext);
    }

    public final String getOfferingIdentifier() {
        return this.offeringIdentifier;
    }

    public final String getPlacementIdentifier() {
        return this.placementIdentifier;
    }

    public final TargetingContext getTargetingContext() {
        return this.targetingContext;
    }

    public int hashCode() {
        int hashCode = this.offeringIdentifier.hashCode() * 31;
        String str = this.placementIdentifier;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TargetingContext targetingContext = this.targetingContext;
        return hashCode2 + (targetingContext != null ? targetingContext.hashCode() : 0);
    }

    public String toString() {
        return "PresentedOfferingContext(offeringIdentifier=" + this.offeringIdentifier + ", placementIdentifier=" + this.placementIdentifier + ", targetingContext=" + this.targetingContext + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "out");
        parcel.writeString(this.offeringIdentifier);
        parcel.writeString(this.placementIdentifier);
        TargetingContext targetingContext = this.targetingContext;
        if (targetingContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            targetingContext.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentedOfferingContext(String str) {
        this(str, null, null);
        t.g(str, "offeringIdentifier");
    }
}

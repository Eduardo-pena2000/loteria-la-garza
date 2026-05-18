package com.revenuecat.purchases.ui.revenuecatui;

import Ca.o;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.PresentedOfferingContext;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class OfferingSelection {
    public static final int $stable = 0;

    public static final class IdAndPresentedOfferingContext extends OfferingSelection implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator CREATOR = new Creator();
        private final String offeringId;
        private final PresentedOfferingContext presentedOfferingContext;

        public static final class Creator implements Parcelable.Creator {
            public final IdAndPresentedOfferingContext createFromParcel(Parcel parcel) {
                t.g(parcel, "parcel");
                return new IdAndPresentedOfferingContext(parcel.readString(), parcel.readParcelable(IdAndPresentedOfferingContext.class.getClassLoader()));
            }

            public final IdAndPresentedOfferingContext[] newArray(int i) {
                return new IdAndPresentedOfferingContext[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IdAndPresentedOfferingContext(String offeringId, PresentedOfferingContext presentedOfferingContext) {
            super(null);
            t.g(offeringId, "offeringId");
            this.offeringId = offeringId;
            this.presentedOfferingContext = presentedOfferingContext;
        }

        public static /* synthetic */ IdAndPresentedOfferingContext copy$default(IdAndPresentedOfferingContext idAndPresentedOfferingContext, String str, PresentedOfferingContext presentedOfferingContext, int i, Object obj) {
            if ((i & 1) != 0) {
                str = idAndPresentedOfferingContext.offeringId;
            }
            if ((i & 2) != 0) {
                presentedOfferingContext = idAndPresentedOfferingContext.presentedOfferingContext;
            }
            return idAndPresentedOfferingContext.copy(str, presentedOfferingContext);
        }

        public final String component1() {
            return this.offeringId;
        }

        public final PresentedOfferingContext component2() {
            return this.presentedOfferingContext;
        }

        public final IdAndPresentedOfferingContext copy(String offeringId, PresentedOfferingContext presentedOfferingContext) {
            t.g(offeringId, "offeringId");
            return new IdAndPresentedOfferingContext(offeringId, presentedOfferingContext);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndPresentedOfferingContext)) {
                return false;
            }
            IdAndPresentedOfferingContext idAndPresentedOfferingContext = (IdAndPresentedOfferingContext) obj;
            return t.c(this.offeringId, idAndPresentedOfferingContext.offeringId) && t.c(this.presentedOfferingContext, idAndPresentedOfferingContext.presentedOfferingContext);
        }

        public final String getOfferingId() {
            return this.offeringId;
        }

        public final PresentedOfferingContext getPresentedOfferingContext() {
            return this.presentedOfferingContext;
        }

        public int hashCode() {
            int hashCode = this.offeringId.hashCode() * 31;
            PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
            return hashCode + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode());
        }

        public String toString() {
            return "IdAndPresentedOfferingContext(offeringId=" + this.offeringId + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
        }

        public void writeToParcel(Parcel out, int i) {
            t.g(out, "out");
            out.writeString(this.offeringId);
            out.writeParcelable(this.presentedOfferingContext, i);
        }
    }

    public static final class None extends OfferingSelection {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    public static final class OfferingType extends OfferingSelection {
        public static final int $stable = 0;
        private final Offering offeringType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OfferingType(Offering offeringType) {
            super(null);
            t.g(offeringType, "offeringType");
            this.offeringType = offeringType;
        }

        public static /* synthetic */ OfferingType copy$default(OfferingType offeringType, Offering offering, int i, Object obj) {
            if ((i & 1) != 0) {
                offering = offeringType.offeringType;
            }
            return offeringType.copy(offering);
        }

        public final Offering component1() {
            return this.offeringType;
        }

        public final OfferingType copy(Offering offeringType) {
            t.g(offeringType, "offeringType");
            return new OfferingType(offeringType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OfferingType) && t.c(this.offeringType, ((OfferingType) obj).offeringType);
        }

        public final Offering getOfferingType() {
            return this.offeringType;
        }

        public int hashCode() {
            return this.offeringType.hashCode();
        }

        public String toString() {
            return "OfferingType(offeringType=" + this.offeringType + ')';
        }
    }

    public /* synthetic */ OfferingSelection(k kVar) {
        this();
    }

    public final Offering getOffering() {
        if (this instanceof OfferingType) {
            return ((OfferingType) this).getOfferingType();
        }
        if ((this instanceof IdAndPresentedOfferingContext) || t.c(this, None.INSTANCE)) {
            return null;
        }
        throw new o();
    }

    public final String getOfferingIdentifier() {
        if (this instanceof OfferingType) {
            return ((OfferingType) this).getOfferingType().getIdentifier();
        }
        if (this instanceof IdAndPresentedOfferingContext) {
            return ((IdAndPresentedOfferingContext) this).getOfferingId();
        }
        if (t.c(this, None.INSTANCE)) {
            return null;
        }
        throw new o();
    }

    private OfferingSelection() {
    }
}

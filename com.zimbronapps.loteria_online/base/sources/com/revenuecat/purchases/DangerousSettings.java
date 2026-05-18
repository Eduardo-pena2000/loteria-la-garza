package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DangerousSettings implements Parcelable {
    private final boolean autoSyncPurchases;
    private final boolean customEntitlementComputation;
    private final boolean uiPreviewMode;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        @InternalRevenueCatAPI
        public final DangerousSettings forPreviewMode() {
            return new DangerousSettings(false, false, true);
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator {
        public final DangerousSettings createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new DangerousSettings(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        public final DangerousSettings[] newArray(int i) {
            return new DangerousSettings[i];
        }
    }

    public DangerousSettings() {
        this(false, false, false, 7, null);
    }

    @InternalRevenueCatAPI
    public static final DangerousSettings forPreviewMode() {
        return Companion.forPreviewMode();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DangerousSettings)) {
            return false;
        }
        DangerousSettings dangerousSettings = (DangerousSettings) obj;
        return this.autoSyncPurchases == dangerousSettings.autoSyncPurchases && this.customEntitlementComputation == dangerousSettings.customEntitlementComputation && this.uiPreviewMode == dangerousSettings.uiPreviewMode;
    }

    public final boolean getAutoSyncPurchases() {
        return this.autoSyncPurchases;
    }

    public final boolean getCustomEntitlementComputation$purchases_defaultsBc8Release() {
        return this.customEntitlementComputation;
    }

    public final boolean getUiPreviewMode$purchases_defaultsBc8Release() {
        return this.uiPreviewMode;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.autoSyncPurchases) * 31) + Boolean.hashCode(this.customEntitlementComputation)) * 31) + Boolean.hashCode(this.uiPreviewMode);
    }

    public String toString() {
        return "DangerousSettings(autoSyncPurchases=" + this.autoSyncPurchases + ", customEntitlementComputation=" + this.customEntitlementComputation + ", uiPreviewMode=" + this.uiPreviewMode + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "out");
        parcel.writeInt(this.autoSyncPurchases ? 1 : 0);
        parcel.writeInt(this.customEntitlementComputation ? 1 : 0);
        parcel.writeInt(this.uiPreviewMode ? 1 : 0);
    }

    public DangerousSettings(boolean z, boolean z2, boolean z3) {
        this.autoSyncPurchases = z;
        this.customEntitlementComputation = z2;
        this.uiPreviewMode = z3;
    }

    public /* synthetic */ DangerousSettings(boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    public DangerousSettings(boolean z) {
        this(z, false, false);
    }

    public /* synthetic */ DangerousSettings(boolean z, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? true : z);
    }
}

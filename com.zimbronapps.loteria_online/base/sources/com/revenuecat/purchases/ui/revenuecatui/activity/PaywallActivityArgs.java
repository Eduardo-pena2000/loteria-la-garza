package com.revenuecat.purchases.ui.revenuecatui.activity;

import Da.Q;
import Da.S;
import Wa.n;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.fonts.ParcelizableFontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily;
import com.revenuecat.purchases.ui.revenuecatui.fonts.TypographyType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallActivityArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator CREATOR = new Creator();
    private final Map customVariables;
    private final boolean edgeToEdge;
    private final Map fonts;
    private final Integer nonSerializableArgsKey;
    private final OfferingSelection.IdAndPresentedOfferingContext offeringIdAndPresentedOfferingContext;
    private final String requiredEntitlementIdentifier;
    private final boolean shouldDisplayDismissButton;
    private final boolean wasLaunchedThroughSDK;

    public static final class Creator implements Parcelable.Creator {
        public final PaywallActivityArgs createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            t.g(parcel, "parcel");
            String readString = parcel.readString();
            OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext = (OfferingSelection.IdAndPresentedOfferingContext) (parcel.readInt() == 0 ? null : OfferingSelection.IdAndPresentedOfferingContext.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(TypographyType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PaywallFontFamily.CREATOR.createFromParcel(parcel));
                }
            }
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashMap2.put(parcel.readString(), parcel.readParcelable(PaywallActivityArgs.class.getClassLoader()));
            }
            return new PaywallActivityArgs(readString, idAndPresentedOfferingContext, (Map) linkedHashMap, z, z2, z3, (Map) linkedHashMap2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public final PaywallActivityArgs[] newArray(int i) {
            return new PaywallActivityArgs[i];
        }
    }

    public PaywallActivityArgs() {
        this((String) null, (OfferingSelection.IdAndPresentedOfferingContext) null, (Map) null, false, false, false, (Map) null, (Integer) null, 255, (k) null);
    }

    public static /* synthetic */ PaywallActivityArgs copy$default(PaywallActivityArgs paywallActivityArgs, String str, OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, Map map, boolean z, boolean z2, boolean z3, Map map2, Integer num, int i, Object obj) {
        return paywallActivityArgs.copy((i & 1) != 0 ? paywallActivityArgs.requiredEntitlementIdentifier : str, (i & 2) != 0 ? paywallActivityArgs.offeringIdAndPresentedOfferingContext : idAndPresentedOfferingContext, (i & 4) != 0 ? paywallActivityArgs.fonts : map, (i & 8) != 0 ? paywallActivityArgs.shouldDisplayDismissButton : z, (i & 16) != 0 ? paywallActivityArgs.edgeToEdge : z2, (i & 32) != 0 ? paywallActivityArgs.wasLaunchedThroughSDK : z3, (i & 64) != 0 ? paywallActivityArgs.customVariables : map2, (i & 128) != 0 ? paywallActivityArgs.nonSerializableArgsKey : num);
    }

    public final String component1() {
        return this.requiredEntitlementIdentifier;
    }

    public final OfferingSelection.IdAndPresentedOfferingContext component2() {
        return this.offeringIdAndPresentedOfferingContext;
    }

    public final Map component3() {
        return this.fonts;
    }

    public final boolean component4() {
        return this.shouldDisplayDismissButton;
    }

    public final boolean component5() {
        return this.edgeToEdge;
    }

    public final boolean component6() {
        return this.wasLaunchedThroughSDK;
    }

    public final Map component7() {
        return this.customVariables;
    }

    public final Integer component8() {
        return this.nonSerializableArgsKey;
    }

    public final PaywallActivityArgs copy(String str, OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, Map map, boolean z, boolean z2, boolean z3, Map customVariables, Integer num) {
        t.g(customVariables, "customVariables");
        return new PaywallActivityArgs(str, idAndPresentedOfferingContext, map, z, z2, z3, customVariables, num);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallActivityArgs)) {
            return false;
        }
        PaywallActivityArgs paywallActivityArgs = (PaywallActivityArgs) obj;
        return t.c(this.requiredEntitlementIdentifier, paywallActivityArgs.requiredEntitlementIdentifier) && t.c(this.offeringIdAndPresentedOfferingContext, paywallActivityArgs.offeringIdAndPresentedOfferingContext) && t.c(this.fonts, paywallActivityArgs.fonts) && this.shouldDisplayDismissButton == paywallActivityArgs.shouldDisplayDismissButton && this.edgeToEdge == paywallActivityArgs.edgeToEdge && this.wasLaunchedThroughSDK == paywallActivityArgs.wasLaunchedThroughSDK && t.c(this.customVariables, paywallActivityArgs.customVariables) && t.c(this.nonSerializableArgsKey, paywallActivityArgs.nonSerializableArgsKey);
    }

    public final Map getCustomVariables() {
        return this.customVariables;
    }

    public final boolean getEdgeToEdge() {
        return this.edgeToEdge;
    }

    public final Map getFonts() {
        return this.fonts;
    }

    public final Integer getNonSerializableArgsKey() {
        return this.nonSerializableArgsKey;
    }

    public final OfferingSelection.IdAndPresentedOfferingContext getOfferingIdAndPresentedOfferingContext() {
        return this.offeringIdAndPresentedOfferingContext;
    }

    public final String getRequiredEntitlementIdentifier() {
        return this.requiredEntitlementIdentifier;
    }

    public final boolean getShouldDisplayDismissButton() {
        return this.shouldDisplayDismissButton;
    }

    public final boolean getWasLaunchedThroughSDK() {
        return this.wasLaunchedThroughSDK;
    }

    public int hashCode() {
        String str = this.requiredEntitlementIdentifier;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext = this.offeringIdAndPresentedOfferingContext;
        int hashCode2 = (hashCode + (idAndPresentedOfferingContext == null ? 0 : idAndPresentedOfferingContext.hashCode())) * 31;
        Map map = this.fonts;
        int hashCode3 = (((((((((hashCode2 + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.shouldDisplayDismissButton)) * 31) + Boolean.hashCode(this.edgeToEdge)) * 31) + Boolean.hashCode(this.wasLaunchedThroughSDK)) * 31) + this.customVariables.hashCode()) * 31;
        Integer num = this.nonSerializableArgsKey;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "PaywallActivityArgs(requiredEntitlementIdentifier=" + this.requiredEntitlementIdentifier + ", offeringIdAndPresentedOfferingContext=" + this.offeringIdAndPresentedOfferingContext + ", fonts=" + this.fonts + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ", edgeToEdge=" + this.edgeToEdge + ", wasLaunchedThroughSDK=" + this.wasLaunchedThroughSDK + ", customVariables=" + this.customVariables + ", nonSerializableArgsKey=" + this.nonSerializableArgsKey + ')';
    }

    public void writeToParcel(Parcel out, int i) {
        t.g(out, "out");
        out.writeString(this.requiredEntitlementIdentifier);
        OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext = this.offeringIdAndPresentedOfferingContext;
        if (idAndPresentedOfferingContext == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            idAndPresentedOfferingContext.writeToParcel(out, i);
        }
        Map map = this.fonts;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString(((TypographyType) entry.getKey()).name());
                PaywallFontFamily paywallFontFamily = (PaywallFontFamily) entry.getValue();
                if (paywallFontFamily == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    paywallFontFamily.writeToParcel(out, i);
                }
            }
        }
        out.writeInt(this.shouldDisplayDismissButton ? 1 : 0);
        out.writeInt(this.edgeToEdge ? 1 : 0);
        out.writeInt(this.wasLaunchedThroughSDK ? 1 : 0);
        Map map2 = this.customVariables;
        out.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            out.writeString((String) entry2.getKey());
            out.writeParcelable((Parcelable) entry2.getValue(), i);
        }
        Integer num = this.nonSerializableArgsKey;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
    }

    public PaywallActivityArgs(String str, OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, Map map, boolean z, boolean z2, boolean z3, Map customVariables, Integer num) {
        t.g(customVariables, "customVariables");
        this.requiredEntitlementIdentifier = str;
        this.offeringIdAndPresentedOfferingContext = idAndPresentedOfferingContext;
        this.fonts = map;
        this.shouldDisplayDismissButton = z;
        this.edgeToEdge = z2;
        this.wasLaunchedThroughSDK = z3;
        this.customVariables = customVariables;
        this.nonSerializableArgsKey = num;
    }

    public /* synthetic */ PaywallActivityArgs(String str, OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, Map map, boolean z, boolean z2, boolean z3, Map map2, Integer num, int i, k kVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : idAndPresentedOfferingContext, (i & 4) != 0 ? null : map, (i & 8) != 0 ? true : z, (i & 16) != 0 ? PaywallActivityArgsKt.getDefaultEdgeToEdge() : z2, (i & 32) == 0 ? z3 : true, (i & 64) != 0 ? S.h() : map2, (i & 128) == 0 ? num : null);
    }

    public /* synthetic */ PaywallActivityArgs(String str, OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, boolean z3, Map map, Integer num, int i, k kVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : idAndPresentedOfferingContext, parcelizableFontProvider, (i & 8) != 0 ? true : z, (i & 16) != 0 ? PaywallActivityArgsKt.getDefaultEdgeToEdge() : z2, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? S.h() : map, (i & 128) != 0 ? null : num);
    }

    public PaywallActivityArgs(String str, OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, boolean z3, Map customVariables, Integer num) {
        Map map;
        t.g(customVariables, "customVariables");
        if (parcelizableFontProvider != null) {
            TypographyType[] values = TypographyType.values();
            Map linkedHashMap = new LinkedHashMap(n.e(Q.e(values.length), 16));
            for (TypographyType typographyType : values) {
                linkedHashMap.put(typographyType, parcelizableFontProvider.getFont(typographyType));
            }
            map = linkedHashMap;
        } else {
            map = null;
        }
        this(str, idAndPresentedOfferingContext, map, z, z2, z3, customVariables, num);
    }
}

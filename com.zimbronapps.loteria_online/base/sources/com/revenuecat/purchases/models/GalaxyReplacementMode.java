package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ExperimentalPreviewRevenueCatPurchasesAPI;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.ReplacementMode;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX WARN: Enum visitor error
LI11I1ll1Ii11.IIiLliI1l1li1: Can't remove SSA var: r0v2 com.revenuecat.purchases.models.GalaxyReplacementMode, still in use, count: 1, list:
  (r0v2 com.revenuecat.purchases.models.GalaxyReplacementMode) from 0x003d: SPUT (r0v2 com.revenuecat.purchases.models.GalaxyReplacementMode) (LINE:62) com.revenuecat.purchases.models.GalaxyReplacementMode.default com.revenuecat.purchases.models.GalaxyReplacementMode
	at LL11ILIl1lL1ii.i1lii1lllLIL1.ILIiiIiIILL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:178)
	at LL11ILIl1lL1ii.i1lii1lllLIL1.LIi1LL1Ilill1l(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:22)
	at LL11ILIl1lL1ii.i1lii1lllLIL1.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
	at LL11ILIl1lL1ii.i1lLLlIILLIlii.accept(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:5)
	at java.util.ArrayList.forEach(ArrayList.java:1613)
	at LL11ILIl1lL1ii.i1lii1lllLIL1.IlllI1L11iLLLL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:14)
	at LL11ILIl1lL1ii.i1lii1lllLIL1.iLLIliliLl1(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:265)
	at jadx.core.dex.visitors.EnumVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@ExperimentalPreviewRevenueCatPurchasesAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class GalaxyReplacementMode implements ReplacementMode {
    INSTANT_PRORATED_DATE,
    INSTANT_PRORATED_CHARGE,
    INSTANT_NO_PRORATION,
    DEFERRED;

    private static final GalaxyReplacementMode default = new GalaxyReplacementMode();
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator CREATOR = new Creator();

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @InternalRevenueCatAPI
        public static /* synthetic */ void getDefault$annotations() {
        }

        public final GalaxyReplacementMode getDefault() {
            return GalaxyReplacementMode.access$getDefault$cp();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator {
        public final GalaxyReplacementMode createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return GalaxyReplacementMode.valueOf(parcel.readString());
        }

        public final GalaxyReplacementMode[] newArray(int i) {
            return new GalaxyReplacementMode[i];
        }
    }

    static {
    }

    private GalaxyReplacementMode() {
    }

    public static final /* synthetic */ GalaxyReplacementMode access$getDefault$cp() {
        return default;
    }

    public static GalaxyReplacementMode valueOf(String str) {
        return (GalaxyReplacementMode) Enum.valueOf(GalaxyReplacementMode.class, str);
    }

    public static GalaxyReplacementMode[] values() {
        return (GalaxyReplacementMode[]) $VALUES.clone();
    }

    public int describeContents() {
        return 0;
    }

    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "out");
        parcel.writeString(name());
    }
}

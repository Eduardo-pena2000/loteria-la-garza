package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogWrapperKt;

/* JADX WARN: Enum visitor error
LI11I1ll1Ii11.IIiLliI1l1li1: Can't remove SSA var: r0v0 com.revenuecat.purchases.CustomerInfoOriginalSource, still in use, count: 1, list:
  (r0v0 com.revenuecat.purchases.CustomerInfoOriginalSource) from 0x002c: SPUT (r0v0 com.revenuecat.purchases.CustomerInfoOriginalSource) (LINE:45) com.revenuecat.purchases.CustomerInfoOriginalSource.DEFAULT com.revenuecat.purchases.CustomerInfoOriginalSource
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
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerInfoOriginalSource {
    MAIN,
    LOAD_SHEDDER,
    OFFLINE_ENTITLEMENTS;

    private static final CustomerInfoOriginalSource DEFAULT = new CustomerInfoOriginalSource();
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final CustomerInfoOriginalSource fromString(String str) {
            if (str == null) {
                return getDEFAULT();
            }
            try {
                return CustomerInfoOriginalSource.valueOf(str);
            } catch (IllegalArgumentException e) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Invalid CustomerInfo original source deserializing from cache", e);
                return getDEFAULT();
            }
        }

        public final CustomerInfoOriginalSource getDEFAULT() {
            return CustomerInfoOriginalSource.access$getDEFAULT$cp();
        }

        private Companion() {
        }
    }

    static {
    }

    private CustomerInfoOriginalSource() {
    }

    public static final /* synthetic */ CustomerInfoOriginalSource access$getDEFAULT$cp() {
        return DEFAULT;
    }

    public static CustomerInfoOriginalSource valueOf(String str) {
        return (CustomerInfoOriginalSource) Enum.valueOf(CustomerInfoOriginalSource.class, str);
    }

    public static CustomerInfoOriginalSource[] values() {
        return (CustomerInfoOriginalSource[]) $VALUES.clone();
    }
}

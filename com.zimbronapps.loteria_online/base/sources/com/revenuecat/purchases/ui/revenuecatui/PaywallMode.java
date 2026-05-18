package com.revenuecat.purchases.ui.revenuecatui;

import kotlin.jvm.internal.k;

/* JADX WARN: Enum visitor error
LI11I1ll1Ii11.IIiLliI1l1li1: Can't remove SSA var: r0v0 com.revenuecat.purchases.ui.revenuecatui.PaywallMode, still in use, count: 1, list:
  (r0v0 com.revenuecat.purchases.ui.revenuecatui.PaywallMode) from 0x002c: SPUT (r0v0 com.revenuecat.purchases.ui.revenuecatui.PaywallMode) (LINE:45) com.revenuecat.purchases.ui.revenuecatui.PaywallMode.default com.revenuecat.purchases.ui.revenuecatui.PaywallMode
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
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallMode {
    FULL_SCREEN,
    FOOTER,
    FOOTER_CONDENSED;

    private static final PaywallMode default = new PaywallMode();
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final PaywallMode footerMode(boolean z) {
            return z ? PaywallMode.FOOTER_CONDENSED : PaywallMode.FOOTER;
        }

        public final PaywallMode getDefault() {
            return PaywallMode.access$getDefault$cp();
        }

        private Companion() {
        }
    }

    static {
    }

    private PaywallMode() {
    }

    public static final /* synthetic */ PaywallMode access$getDefault$cp() {
        return default;
    }

    public static PaywallMode valueOf(String str) {
        return (PaywallMode) Enum.valueOf(PaywallMode.class, str);
    }

    public static PaywallMode[] values() {
        return (PaywallMode[]) $VALUES.clone();
    }
}

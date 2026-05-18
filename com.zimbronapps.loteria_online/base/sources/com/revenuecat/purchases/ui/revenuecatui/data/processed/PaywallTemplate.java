package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX WARN: Enum visitor error
LI11I1ll1Ii11.IIiLliI1l1li1: Init of enum field 'TEMPLATE_1' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:112)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:70)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:9)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:39)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:46)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:50)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:41)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:136)
	at jadx.core.dex.visitors.EnumVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallTemplate {
    private static final /* synthetic */ PaywallTemplate[] $VALUES;
    public static final Companion Companion;
    public static final PaywallTemplate TEMPLATE_1;
    public static final PaywallTemplate TEMPLATE_2;
    public static final PaywallTemplate TEMPLATE_3;
    public static final PaywallTemplate TEMPLATE_4;
    public static final PaywallTemplate TEMPLATE_5;
    public static final PaywallTemplate TEMPLATE_7;
    private final PackageConfigurationType configurationType;
    private final String id;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final PaywallTemplate fromId(String id) {
            t.g(id, "id");
            for (PaywallTemplate paywallTemplate : PaywallTemplate.values()) {
                if (t.c(paywallTemplate.getId(), id)) {
                    return paywallTemplate;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PaywallTemplate[] $values() {
        return new PaywallTemplate[]{TEMPLATE_1, TEMPLATE_2, TEMPLATE_3, TEMPLATE_4, TEMPLATE_5, TEMPLATE_7};
    }

    static {
        PackageConfigurationType packageConfigurationType = PackageConfigurationType.SINGLE;
        TEMPLATE_1 = new PaywallTemplate("TEMPLATE_1", 0, "1", packageConfigurationType);
        PackageConfigurationType packageConfigurationType2 = PackageConfigurationType.MULTIPLE;
        TEMPLATE_2 = new PaywallTemplate("TEMPLATE_2", 1, "2", packageConfigurationType2);
        TEMPLATE_3 = new PaywallTemplate("TEMPLATE_3", 2, "3", packageConfigurationType);
        TEMPLATE_4 = new PaywallTemplate("TEMPLATE_4", 3, "4", packageConfigurationType2);
        TEMPLATE_5 = new PaywallTemplate("TEMPLATE_5", 4, "5", packageConfigurationType2);
        TEMPLATE_7 = new PaywallTemplate("TEMPLATE_7", 5, "7", PackageConfigurationType.MULTITIER);
        $VALUES = $values();
        Companion = new Companion(null);
    }

    private PaywallTemplate(String str, int i, String str2, PackageConfigurationType packageConfigurationType) {
        this.id = str2;
        this.configurationType = packageConfigurationType;
    }

    public static PaywallTemplate valueOf(String str) {
        return (PaywallTemplate) Enum.valueOf(PaywallTemplate.class, str);
    }

    public static PaywallTemplate[] values() {
        return (PaywallTemplate[]) $VALUES.clone();
    }

    public final PackageConfigurationType getConfigurationType() {
        return this.configurationType;
    }

    public final String getId() {
        return this.id;
    }
}

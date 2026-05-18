package com.applovin.impl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class z4 {
    private final String a;
    private final Class b;
    public static final z4 c = new z4("com.applovin.sdk.impl.isFirstRun", String.class);
    public static final z4 d = new z4("com.applovin.sdk.launched_before", Boolean.class);
    public static final z4 e = new z4("com.applovin.sdk.launch_count", Long.class);
    public static final z4 f = new z4("com.applovin.sdk.last_launch_timestamp", Long.class);
    public static final z4 g = new z4("com.applovin.sdk.latest_installed_version", String.class);
    public static final z4 h = new z4("com.applovin.sdk.install_date", Long.class);
    public static final z4 i = new z4("com.applovin.sdk.av", Boolean.class);
    public static final z4 j = new z4("com.applovin.sdk.save_settings_with_sdk_key_agnostic_name", Boolean.class);
    public static final z4 k = new z4("com.applovin.sdk.user_id", String.class);
    public static final z4 l = new z4("com.applovin.sdk.compass_random_token", String.class);
    public static final z4 m = new z4("com.applovin.sdk.applovin_random_token", String.class);
    public static final z4 n = new z4("com.applovin.sdk.alart", String.class);
    public static final z4 o = new z4("com.applovin.sdk.aleid", String.class);
    public static final z4 p = new z4("com.applovin.sdk.device_test_group", String.class);
    public static final z4 q = new z4("com.applovin.sdk.compliance.has_user_consent", Boolean.class);
    public static final z4 r = new z4("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);
    public static final z4 s = new z4("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);
    public static final z4 t = new z4("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);
    public static final z4 u = new z4("IABTCF_CmpSdkID", Object.class);
    public static final z4 v = new z4("IABTCF_CmpSdkVersion", Object.class);
    public static final z4 w = new z4("IABTCF_gdprApplies", Object.class);
    public static final z4 x = new z4("IABTCF_TCString", String.class);
    public static final z4 y = new z4("IABTCF_AddtlConsent", String.class);
    public static final z4 z = new z4("IABTCF_VendorConsents", String.class);
    public static final z4 A = new z4("IABTCF_VendorLegitimateInterests", String.class);
    public static final z4 B = new z4("IABTCF_PurposeConsents", String.class);
    public static final z4 C = new z4("IABTCF_PurposeLegitimateInterests", String.class);
    public static final z4 D = new z4("IABTCF_SpecialFeaturesOptIns", String.class);
    public static final z4 E = new z4("com.applovin.sdk.impl.ad.persistence.queue", String.class);
    public static final z4 F = new z4("com.applovin.sdk.mediation.signal_providers", String.class);
    public static final z4 G = new z4("com.applovin.sdk.mediation.auto_init_adapters", String.class);
    public static final z4 H = new z4("com.applovin.sdk.persisted_data", String.class);
    public static final z4 I = new z4("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);
    public static final z4 J = new z4("com.applovin.sdk.mediation.should_use_applovin_adaptive_sizing_formula", Boolean.class);
    public static final z4 K = new z4("com.applovin.sdk.mediation.stats_per_ad_unit_since_install", String.class);
    public static final z4 L = new z4("com.applovin.sdk.mediation.stats_per_ad_format_since_install", String.class);
    public static final z4 M = new z4("com.applovin.sdk.user_agent", String.class);
    public static final z4 N = new z4("com.applovin.sdk.last_fullscreen_ad_timestamp_ms", Long.class);
    public static final z4 O = new z4("com.applovin.sdk.last_fullscreen_ad_duration_ms", Long.class);
    public static final z4 P = new z4("com.applovin.sdk.app_killed_urls_from_last_ad", String.class);
    public static final z4 Q = new z4("com.applovin.sdk.app_killed_last_ad_data", String.class);
    public static final z4 R = new z4("com.applovin.sdk.app_killed_last_mediated_ad_tracking_info", String.class);
    public static final z4 S = new z4("com.applovin.sdk.last_mediated_fullscreen_ad_duration_ms", Long.class);
    public static final z4 T = new z4("com.applovin.sdk.template_browser_package_name", String.class);

    public z4(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public String a() {
        return this.a;
    }

    public Class b() {
        return this.b;
    }

    public String toString() {
        return "Key{name='" + this.a + "', type=" + this.b + '}';
    }
}

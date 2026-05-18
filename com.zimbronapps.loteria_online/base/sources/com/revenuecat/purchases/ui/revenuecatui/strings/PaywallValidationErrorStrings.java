package com.revenuecat.purchases.ui.revenuecatui.strings;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallValidationErrorStrings {
    public static final int $stable = 0;
    public static final String ALIASED_COLOR_IS_ALIAS = "Aliased color '%s' has an aliased value '%s', which is not allowed.";
    public static final String ALL_LOCALIZATIONS_MISSING_FOR_LOCALE = "All localizations for locale '%s' are missing.";
    public static final String ALL_VARIABLE_LOCALIZATIONS_MISSING_FOR_LOCALE = "All variable localizations for locale '%s' are missing.";
    public static final String DISPLAYING_DEFAULT = "Displaying default template due to validation errors.";
    public static final PaywallValidationErrorStrings INSTANCE = new PaywallValidationErrorStrings();
    public static final String INVALID_ICONS = "One or more icons were not recognized: %s";
    public static final String INVALID_MODE_FOR_COMPONENTS_PAYWALL = "Paywalls V2 does not support footer modes. Falling back to legacy fallback paywall.";
    public static final String INVALID_TEMPLATE_NAME = "Template name is not recognized: %s";
    public static final String INVALID_VARIABLES = "There were some errors validating variables in the paywall strings. The unrecognized variables are: %s";
    public static final String MISSING_COLOR_ALIAS = "Aliased color '%s' does not exist.";
    public static final String MISSING_FONT_ALIAS = "Aliased font '%s' does not exist.";
    public static final String MISSING_IMAGE_LOCALIZATION = "Missing image localization for property with id: '%s'";
    public static final String MISSING_IMAGE_LOCALIZATION_WITH_LOCALE = "Missing image localization for property with id: '%s', for locale: '%s'.";
    public static final String MISSING_PACKAGE = "The Paywall references a package with id '%s', but Offering '%s' does not contain such a package. It has these packages instead: [%s]. Either add the missing package to the Offering or remove it from the Paywall.";
    public static final String MISSING_PAYWALL = "Displaying default template because paywall is missing for offering '%s'. If you expected to see a v2 Paywall, make sure it is published.";
    public static final String MISSING_STRING_LOCALIZATION = "Missing string localization for property with id: '%s'";
    public static final String MISSING_STRING_LOCALIZATION_WITH_LOCALE = "Missing string localization for property with id: '%s', for locale: '%s'.";
    public static final String MISSING_TIERS = "Displaying default template because paywall tiers are missing for offering '%s'.";
    public static final String MISSING_TIER_CONFIGURATIONS = "There are required tier configurations missing for: '%s'.";
    public static final String MISSING_VIDEO_LOCALIZATION = "Missing video localization for property with id: '%s'";
    public static final String MISSING_VIDEO_LOCALIZATION_WITH_LOCALE = "Missing video localization for property with id: '%s', for locale: '%s'.";
    public static final String ROOT_COMPONENT_UNSUPPORTED_PROPERTIES = "This paywall's root component is hidden because it contains unsupported properties: %s";
    public static final String TABS_COMPONENT_WITHOUT_TABS = "Tabs component has no tabs configured.";
    public static final String TAB_CONTROL_NOT_IN_TAB = "Encountered a Tab Control component that is not in any tab.";
    public static final String UNSUPPORTED_BACKGROUND_TYPE = "This SDK version does not support this background type: %s";

    private PaywallValidationErrorStrings() {
    }
}

package com.revenuecat.purchases.ui.revenuecatui.errors;

import Ca.o;
import Da.D;
import com.revenuecat.purchases.ColorAlias;
import com.revenuecat.purchases.FontAlias;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class PaywallValidationError extends Throwable {
    public static final int $stable = 0;

    public static final class AliasedColorIsAlias extends PaywallValidationError {
        public static final int $stable = 0;
        private final String alias;
        private final String aliasedValue;
        private final String message;

        public /* synthetic */ AliasedColorIsAlias(String str, String str2, k kVar) {
            this(str, str2);
        }

        public static /* synthetic */ AliasedColorIsAlias copy-tjeIzsg$default(AliasedColorIsAlias aliasedColorIsAlias, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aliasedColorIsAlias.alias;
            }
            if ((i & 2) != 0) {
                str2 = aliasedColorIsAlias.aliasedValue;
            }
            return aliasedColorIsAlias.copy-tjeIzsg(str, str2);
        }

        public final String component1-671NwFM() {
            return this.alias;
        }

        public final String component2-671NwFM() {
            return this.aliasedValue;
        }

        public final AliasedColorIsAlias copy-tjeIzsg(String alias, String aliasedValue) {
            t.g(alias, "alias");
            t.g(aliasedValue, "aliasedValue");
            return new AliasedColorIsAlias(alias, aliasedValue, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AliasedColorIsAlias)) {
                return false;
            }
            AliasedColorIsAlias aliasedColorIsAlias = (AliasedColorIsAlias) obj;
            return ColorAlias.equals-impl0(this.alias, aliasedColorIsAlias.alias) && ColorAlias.equals-impl0(this.aliasedValue, aliasedColorIsAlias.aliasedValue);
        }

        public final String getAlias-671NwFM() {
            return this.alias;
        }

        public final String getAliasedValue-671NwFM() {
            return this.aliasedValue;
        }

        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (ColorAlias.hashCode-impl(this.alias) * 31) + ColorAlias.hashCode-impl(this.aliasedValue);
        }

        public String toString() {
            return "AliasedColorIsAlias(alias=" + ColorAlias.toString-impl(this.alias) + ", aliasedValue=" + ColorAlias.toString-impl(this.aliasedValue) + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private AliasedColorIsAlias(String alias, String aliasedValue) {
            super(null);
            t.g(alias, "alias");
            t.g(aliasedValue, "aliasedValue");
            this.alias = alias;
            this.aliasedValue = aliasedValue;
            String format = String.format("Aliased color '%s' has an aliased value '%s', which is not allowed.", Arrays.copyOf(new Object[]{alias, aliasedValue}, 2));
            t.f(format, "format(...)");
            this.message = format;
        }
    }

    public static final class AllLocalizationsMissing extends PaywallValidationError {
        public static final int $stable = 0;
        private final String locale;
        private final String message;

        public /* synthetic */ AllLocalizationsMissing(String str, k kVar) {
            this(str);
        }

        public static /* synthetic */ AllLocalizationsMissing copy-_KYeFs0$default(AllLocalizationsMissing allLocalizationsMissing, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = allLocalizationsMissing.locale;
            }
            return allLocalizationsMissing.copy-_KYeFs0(str);
        }

        public final String component1-uqtKvyA() {
            return this.locale;
        }

        public final AllLocalizationsMissing copy-_KYeFs0(String locale) {
            t.g(locale, "locale");
            return new AllLocalizationsMissing(locale, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AllLocalizationsMissing) && LocaleId.equals-impl0(this.locale, ((AllLocalizationsMissing) obj).locale);
        }

        public final String getLocale-uqtKvyA() {
            return this.locale;
        }

        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return LocaleId.hashCode-impl(this.locale);
        }

        public String toString() {
            return "AllLocalizationsMissing(locale=" + LocaleId.toString-impl(this.locale) + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private AllLocalizationsMissing(String locale) {
            super(null);
            t.g(locale, "locale");
            this.locale = locale;
            String format = String.format("All localizations for locale '%s' are missing.", Arrays.copyOf(new Object[]{locale}, 1));
            t.f(format, "format(...)");
            this.message = format;
        }
    }

    public static final class AllVariableLocalizationsMissing extends PaywallValidationError {
        public static final int $stable = 0;
        private final String locale;
        private final String message;

        public /* synthetic */ AllVariableLocalizationsMissing(String str, k kVar) {
            this(str);
        }

        public static /* synthetic */ AllVariableLocalizationsMissing copy-_KYeFs0$default(AllVariableLocalizationsMissing allVariableLocalizationsMissing, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = allVariableLocalizationsMissing.locale;
            }
            return allVariableLocalizationsMissing.copy-_KYeFs0(str);
        }

        public final String component1-uqtKvyA() {
            return this.locale;
        }

        public final AllVariableLocalizationsMissing copy-_KYeFs0(String locale) {
            t.g(locale, "locale");
            return new AllVariableLocalizationsMissing(locale, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AllVariableLocalizationsMissing) && LocaleId.equals-impl0(this.locale, ((AllVariableLocalizationsMissing) obj).locale);
        }

        public final String getLocale-uqtKvyA() {
            return this.locale;
        }

        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return LocaleId.hashCode-impl(this.locale);
        }

        public String toString() {
            return "AllVariableLocalizationsMissing(locale=" + LocaleId.toString-impl(this.locale) + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private AllVariableLocalizationsMissing(String locale) {
            super(null);
            t.g(locale, "locale");
            this.locale = locale;
            String format = String.format("All variable localizations for locale '%s' are missing.", Arrays.copyOf(new Object[]{locale}, 1));
            t.f(format, "format(...)");
            this.message = format;
        }
    }

    public static final class InvalidIcons extends PaywallValidationError {
        public static final int $stable = 8;
        private final Set invalidIcons;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidIcons(Set invalidIcons) {
            super(null);
            t.g(invalidIcons, "invalidIcons");
            this.invalidIcons = invalidIcons;
        }

        public static /* synthetic */ InvalidIcons copy$default(InvalidIcons invalidIcons, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = invalidIcons.invalidIcons;
            }
            return invalidIcons.copy(set);
        }

        public final Set component1() {
            return this.invalidIcons;
        }

        public final InvalidIcons copy(Set invalidIcons) {
            t.g(invalidIcons, "invalidIcons");
            return new InvalidIcons(invalidIcons);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidIcons) && t.c(this.invalidIcons, ((InvalidIcons) obj).invalidIcons);
        }

        public final Set getInvalidIcons() {
            return this.invalidIcons;
        }

        public int hashCode() {
            return this.invalidIcons.hashCode();
        }

        public String toString() {
            return "InvalidIcons(invalidIcons=" + this.invalidIcons + ')';
        }
    }

    public static final class InvalidModeForComponentsPaywall extends PaywallValidationError {
        public static final int $stable = 0;
        public static final InvalidModeForComponentsPaywall INSTANCE = new InvalidModeForComponentsPaywall();

        private InvalidModeForComponentsPaywall() {
            super(null);
        }
    }

    public static final class InvalidTemplate extends PaywallValidationError {
        public static final int $stable = 0;
        private final String templateName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidTemplate(String templateName) {
            super(null);
            t.g(templateName, "templateName");
            this.templateName = templateName;
        }

        public static /* synthetic */ InvalidTemplate copy$default(InvalidTemplate invalidTemplate, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invalidTemplate.templateName;
            }
            return invalidTemplate.copy(str);
        }

        public final String component1() {
            return this.templateName;
        }

        public final InvalidTemplate copy(String templateName) {
            t.g(templateName, "templateName");
            return new InvalidTemplate(templateName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidTemplate) && t.c(this.templateName, ((InvalidTemplate) obj).templateName);
        }

        public final String getTemplateName() {
            return this.templateName;
        }

        public int hashCode() {
            return this.templateName.hashCode();
        }

        public String toString() {
            return "InvalidTemplate(templateName=" + this.templateName + ')';
        }
    }

    public static final class InvalidVariables extends PaywallValidationError {
        public static final int $stable = 8;
        private final Set unrecognizedVariables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidVariables(Set unrecognizedVariables) {
            super(null);
            t.g(unrecognizedVariables, "unrecognizedVariables");
            this.unrecognizedVariables = unrecognizedVariables;
        }

        public static /* synthetic */ InvalidVariables copy$default(InvalidVariables invalidVariables, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = invalidVariables.unrecognizedVariables;
            }
            return invalidVariables.copy(set);
        }

        public final Set component1() {
            return this.unrecognizedVariables;
        }

        public final InvalidVariables copy(Set unrecognizedVariables) {
            t.g(unrecognizedVariables, "unrecognizedVariables");
            return new InvalidVariables(unrecognizedVariables);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidVariables) && t.c(this.unrecognizedVariables, ((InvalidVariables) obj).unrecognizedVariables);
        }

        public final Set getUnrecognizedVariables() {
            return this.unrecognizedVariables;
        }

        public int hashCode() {
            return this.unrecognizedVariables.hashCode();
        }

        public String toString() {
            return "InvalidVariables(unrecognizedVariables=" + this.unrecognizedVariables + ')';
        }
    }

    public static final class MissingColorAlias extends PaywallValidationError {
        public static final int $stable = 0;
        private final String alias;
        private final String message;

        public /* synthetic */ MissingColorAlias(String str, k kVar) {
            this(str);
        }

        public static /* synthetic */ MissingColorAlias copy-iZ0V_xs$default(MissingColorAlias missingColorAlias, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = missingColorAlias.alias;
            }
            return missingColorAlias.copy-iZ0V_xs(str);
        }

        public final String component1-671NwFM() {
            return this.alias;
        }

        public final MissingColorAlias copy-iZ0V_xs(String alias) {
            t.g(alias, "alias");
            return new MissingColorAlias(alias, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MissingColorAlias) && ColorAlias.equals-impl0(this.alias, ((MissingColorAlias) obj).alias);
        }

        public final String getAlias-671NwFM() {
            return this.alias;
        }

        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return ColorAlias.hashCode-impl(this.alias);
        }

        public String toString() {
            return "MissingColorAlias(alias=" + ColorAlias.toString-impl(this.alias) + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private MissingColorAlias(String alias) {
            super(null);
            t.g(alias, "alias");
            this.alias = alias;
            String format = String.format("Aliased color '%s' does not exist.", Arrays.copyOf(new Object[]{alias}, 1));
            t.f(format, "format(...)");
            this.message = format;
        }
    }

    public static final class MissingFontAlias extends PaywallValidationError {
        public static final int $stable = 0;
        private final String alias;
        private final String message;

        public /* synthetic */ MissingFontAlias(String str, k kVar) {
            this(str);
        }

        public static /* synthetic */ MissingFontAlias copy-Qd9eHpM$default(MissingFontAlias missingFontAlias, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = missingFontAlias.alias;
            }
            return missingFontAlias.copy-Qd9eHpM(str);
        }

        public final String component1-BejUyPs() {
            return this.alias;
        }

        public final MissingFontAlias copy-Qd9eHpM(String alias) {
            t.g(alias, "alias");
            return new MissingFontAlias(alias, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MissingFontAlias) && FontAlias.equals-impl0(this.alias, ((MissingFontAlias) obj).alias);
        }

        public final String getAlias-BejUyPs() {
            return this.alias;
        }

        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return FontAlias.hashCode-impl(this.alias);
        }

        public String toString() {
            return "MissingFontAlias(alias=" + FontAlias.toString-impl(this.alias) + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private MissingFontAlias(String alias) {
            super(null);
            t.g(alias, "alias");
            this.alias = alias;
            String format = String.format("Aliased font '%s' does not exist.", Arrays.copyOf(new Object[]{alias}, 1));
            t.f(format, "format(...)");
            this.message = format;
        }
    }

    public static final class MissingImageLocalization extends PaywallValidationError {
        public static final int $stable = 0;
        private final String key;
        private final String locale;
        private final String message;

        public /* synthetic */ MissingImageLocalization(String str, String str2, k kVar) {
            this(str, str2);
        }

        public static /* synthetic */ MissingImageLocalization copy-bzYoJhk$default(MissingImageLocalization missingImageLocalization, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = missingImageLocalization.key;
            }
            if ((i & 2) != 0) {
                str2 = missingImageLocalization.locale;
            }
            return missingImageLocalization.copy-bzYoJhk(str, str2);
        }

        public final String component1-z7Tp-4o() {
            return this.key;
        }

        public final String component2-DxqohGs() {
            return this.locale;
        }

        public final MissingImageLocalization copy-bzYoJhk(String key, String str) {
            t.g(key, "key");
            return new MissingImageLocalization(key, str, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError.MissingImageLocalization
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError$MissingImageLocalization r5 = (com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError.MissingImageLocalization) r5
                java.lang.String r1 = r4.key
                java.lang.String r3 = r5.key
                boolean r1 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.equals-impl0(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.locale
                java.lang.String r5 = r5.locale
                if (r1 != 0) goto L23
                if (r5 != 0) goto L21
                r5 = r0
                goto L2a
            L21:
                r5 = r2
                goto L2a
            L23:
                if (r5 != 0) goto L26
                goto L21
            L26:
                boolean r5 = com.revenuecat.purchases.paywalls.components.common.LocaleId.equals-impl0(r1, r5)
            L2a:
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError.MissingImageLocalization.equals(java.lang.Object):boolean");
        }

        public final String getKey-z7Tp-4o() {
            return this.key;
        }

        public final String getLocale-DxqohGs() {
            return this.locale;
        }

        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int i = LocalizationKey.hashCode-impl(this.key) * 31;
            String str = this.locale;
            return i + (str == null ? 0 : LocaleId.hashCode-impl(str));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MissingImageLocalization(key=");
            sb.append(LocalizationKey.toString-impl(this.key));
            sb.append(", locale=");
            String str = this.locale;
            sb.append(str == null ? "null" : LocaleId.toString-impl(str));
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ MissingImageLocalization(String str, String str2, int i, k kVar) {
            this(str, (i & 2) != 0 ? null : str2, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private MissingImageLocalization(String key, String str) {
            String format;
            super(null);
            t.g(key, "key");
            this.key = key;
            this.locale = str;
            if (str != null) {
                format = String.format("Missing image localization for property with id: '%s', for locale: '%s'.", Arrays.copyOf(new Object[]{key, str}, 2));
                t.f(format, "format(...)");
            } else {
                format = String.format("Missing image localization for property with id: '%s'", Arrays.copyOf(new Object[]{key}, 1));
                t.f(format, "format(...)");
            }
            this.message = format;
        }
    }

    public static final class MissingPackage extends PaywallValidationError {
        public static final int $stable = 8;
        private final Collection allPackageIds;
        private final String message;
        private final String missingPackageId;
        private final String offeringId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MissingPackage(String offeringId, String missingPackageId, Collection allPackageIds) {
            super(null);
            t.g(offeringId, "offeringId");
            t.g(missingPackageId, "missingPackageId");
            t.g(allPackageIds, "allPackageIds");
            this.offeringId = offeringId;
            this.missingPackageId = missingPackageId;
            this.allPackageIds = allPackageIds;
            String format = String.format("The Paywall references a package with id '%s', but Offering '%s' does not contain such a package. It has these packages instead: [%s]. Either add the missing package to the Offering or remove it from the Paywall.", Arrays.copyOf(new Object[]{missingPackageId, offeringId, D.n0((Iterable) allPackageIds, null, null, null, 0, null, null, 63, null)}, 3));
            t.f(format, "format(...)");
            this.message = format;
        }

        public static /* synthetic */ MissingPackage copy$default(MissingPackage missingPackage, String str, String str2, Collection collection, int i, Object obj) {
            if ((i & 1) != 0) {
                str = missingPackage.offeringId;
            }
            if ((i & 2) != 0) {
                str2 = missingPackage.missingPackageId;
            }
            if ((i & 4) != 0) {
                collection = missingPackage.allPackageIds;
            }
            return missingPackage.copy(str, str2, collection);
        }

        public final String component1() {
            return this.offeringId;
        }

        public final String component2() {
            return this.missingPackageId;
        }

        public final Collection component3() {
            return this.allPackageIds;
        }

        public final MissingPackage copy(String offeringId, String missingPackageId, Collection allPackageIds) {
            t.g(offeringId, "offeringId");
            t.g(missingPackageId, "missingPackageId");
            t.g(allPackageIds, "allPackageIds");
            return new MissingPackage(offeringId, missingPackageId, allPackageIds);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MissingPackage)) {
                return false;
            }
            MissingPackage missingPackage = (MissingPackage) obj;
            return t.c(this.offeringId, missingPackage.offeringId) && t.c(this.missingPackageId, missingPackage.missingPackageId) && t.c(this.allPackageIds, missingPackage.allPackageIds);
        }

        public final Collection getAllPackageIds() {
            return this.allPackageIds;
        }

        public String getMessage() {
            return this.message;
        }

        public final String getMissingPackageId() {
            return this.missingPackageId;
        }

        public final String getOfferingId() {
            return this.offeringId;
        }

        public int hashCode() {
            return (((this.offeringId.hashCode() * 31) + this.missingPackageId.hashCode()) * 31) + this.allPackageIds.hashCode();
        }

        public String toString() {
            return "MissingPackage(offeringId=" + this.offeringId + ", missingPackageId=" + this.missingPackageId + ", allPackageIds=" + this.allPackageIds + ')';
        }
    }

    public static final class MissingPaywall extends PaywallValidationError {
        public static final int $stable = 0;
        public static final MissingPaywall INSTANCE = new MissingPaywall();

        private MissingPaywall() {
            super(null);
        }
    }

    public static final class MissingStringLocalization extends PaywallValidationError {
        public static final int $stable = 0;
        private final String key;
        private final String locale;
        private final String message;

        public /* synthetic */ MissingStringLocalization(String str, String str2, k kVar) {
            this(str, str2);
        }

        public static /* synthetic */ MissingStringLocalization copy-bzYoJhk$default(MissingStringLocalization missingStringLocalization, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = missingStringLocalization.key;
            }
            if ((i & 2) != 0) {
                str2 = missingStringLocalization.locale;
            }
            return missingStringLocalization.copy-bzYoJhk(str, str2);
        }

        public final String component1-z7Tp-4o() {
            return this.key;
        }

        public final String component2-DxqohGs() {
            return this.locale;
        }

        public final MissingStringLocalization copy-bzYoJhk(String key, String str) {
            t.g(key, "key");
            return new MissingStringLocalization(key, str, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError.MissingStringLocalization
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError$MissingStringLocalization r5 = (com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError.MissingStringLocalization) r5
                java.lang.String r1 = r4.key
                java.lang.String r3 = r5.key
                boolean r1 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.equals-impl0(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.locale
                java.lang.String r5 = r5.locale
                if (r1 != 0) goto L23
                if (r5 != 0) goto L21
                r5 = r0
                goto L2a
            L21:
                r5 = r2
                goto L2a
            L23:
                if (r5 != 0) goto L26
                goto L21
            L26:
                boolean r5 = com.revenuecat.purchases.paywalls.components.common.LocaleId.equals-impl0(r1, r5)
            L2a:
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError.MissingStringLocalization.equals(java.lang.Object):boolean");
        }

        public final String getKey-z7Tp-4o() {
            return this.key;
        }

        public final String getLocale-DxqohGs() {
            return this.locale;
        }

        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int i = LocalizationKey.hashCode-impl(this.key) * 31;
            String str = this.locale;
            return i + (str == null ? 0 : LocaleId.hashCode-impl(str));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MissingStringLocalization(key=");
            sb.append(LocalizationKey.toString-impl(this.key));
            sb.append(", locale=");
            String str = this.locale;
            sb.append(str == null ? "null" : LocaleId.toString-impl(str));
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ MissingStringLocalization(String str, String str2, int i, k kVar) {
            this(str, (i & 2) != 0 ? null : str2, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private MissingStringLocalization(String key, String str) {
            String format;
            super(null);
            t.g(key, "key");
            this.key = key;
            this.locale = str;
            if (str != null) {
                format = String.format("Missing string localization for property with id: '%s', for locale: '%s'.", Arrays.copyOf(new Object[]{key, str}, 2));
                t.f(format, "format(...)");
            } else {
                format = String.format("Missing string localization for property with id: '%s'", Arrays.copyOf(new Object[]{key}, 1));
                t.f(format, "format(...)");
            }
            this.message = format;
        }
    }

    public static final class MissingTierConfigurations extends PaywallValidationError {
        public static final int $stable = 8;
        private final Set tierIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MissingTierConfigurations(Set tierIds) {
            super(null);
            t.g(tierIds, "tierIds");
            this.tierIds = tierIds;
        }

        public static /* synthetic */ MissingTierConfigurations copy$default(MissingTierConfigurations missingTierConfigurations, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = missingTierConfigurations.tierIds;
            }
            return missingTierConfigurations.copy(set);
        }

        public final Set component1() {
            return this.tierIds;
        }

        public final MissingTierConfigurations copy(Set tierIds) {
            t.g(tierIds, "tierIds");
            return new MissingTierConfigurations(tierIds);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MissingTierConfigurations) && t.c(this.tierIds, ((MissingTierConfigurations) obj).tierIds);
        }

        public final Set getTierIds() {
            return this.tierIds;
        }

        public int hashCode() {
            return this.tierIds.hashCode();
        }

        public String toString() {
            return "MissingTierConfigurations(tierIds=" + this.tierIds + ')';
        }
    }

    public static final class MissingTiers extends PaywallValidationError {
        public static final int $stable = 0;
        public static final MissingTiers INSTANCE = new MissingTiers();

        private MissingTiers() {
            super(null);
        }
    }

    public static final class MissingVideoLocalization extends PaywallValidationError {
        public static final int $stable = 0;
        private final String key;
        private final String locale;
        private final String message;

        public /* synthetic */ MissingVideoLocalization(String str, String str2, k kVar) {
            this(str, str2);
        }

        public static /* synthetic */ MissingVideoLocalization copy-bzYoJhk$default(MissingVideoLocalization missingVideoLocalization, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = missingVideoLocalization.key;
            }
            if ((i & 2) != 0) {
                str2 = missingVideoLocalization.locale;
            }
            return missingVideoLocalization.copy-bzYoJhk(str, str2);
        }

        public final String component1-z7Tp-4o() {
            return this.key;
        }

        public final String component2-DxqohGs() {
            return this.locale;
        }

        public final MissingVideoLocalization copy-bzYoJhk(String key, String str) {
            t.g(key, "key");
            return new MissingVideoLocalization(key, str, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError.MissingVideoLocalization
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError$MissingVideoLocalization r5 = (com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError.MissingVideoLocalization) r5
                java.lang.String r1 = r4.key
                java.lang.String r3 = r5.key
                boolean r1 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.equals-impl0(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.locale
                java.lang.String r5 = r5.locale
                if (r1 != 0) goto L23
                if (r5 != 0) goto L21
                r5 = r0
                goto L2a
            L21:
                r5 = r2
                goto L2a
            L23:
                if (r5 != 0) goto L26
                goto L21
            L26:
                boolean r5 = com.revenuecat.purchases.paywalls.components.common.LocaleId.equals-impl0(r1, r5)
            L2a:
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError.MissingVideoLocalization.equals(java.lang.Object):boolean");
        }

        public final String getKey-z7Tp-4o() {
            return this.key;
        }

        public final String getLocale-DxqohGs() {
            return this.locale;
        }

        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int i = LocalizationKey.hashCode-impl(this.key) * 31;
            String str = this.locale;
            return i + (str == null ? 0 : LocaleId.hashCode-impl(str));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MissingVideoLocalization(key=");
            sb.append(LocalizationKey.toString-impl(this.key));
            sb.append(", locale=");
            String str = this.locale;
            sb.append(str == null ? "null" : LocaleId.toString-impl(str));
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ MissingVideoLocalization(String str, String str2, int i, k kVar) {
            this(str, (i & 2) != 0 ? null : str2, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private MissingVideoLocalization(String key, String str) {
            String format;
            super(null);
            t.g(key, "key");
            this.key = key;
            this.locale = str;
            if (str != null) {
                format = String.format("Missing video localization for property with id: '%s', for locale: '%s'.", Arrays.copyOf(new Object[]{key, str}, 2));
                t.f(format, "format(...)");
            } else {
                format = String.format("Missing video localization for property with id: '%s'", Arrays.copyOf(new Object[]{key}, 1));
                t.f(format, "format(...)");
            }
            this.message = format;
        }
    }

    public static final class RootComponentUnsupportedProperties extends PaywallValidationError {
        public static final int $stable = 8;
        private final PaywallComponent component;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RootComponentUnsupportedProperties(PaywallComponent component) {
            super(null);
            t.g(component, "component");
            this.component = component;
            String format = String.format("This paywall's root component is hidden because it contains unsupported properties: %s", Arrays.copyOf(new Object[]{component.getClass().getSimpleName()}, 1));
            t.f(format, "format(...)");
            this.message = format;
        }

        public static /* synthetic */ RootComponentUnsupportedProperties copy$default(RootComponentUnsupportedProperties rootComponentUnsupportedProperties, PaywallComponent paywallComponent, int i, Object obj) {
            if ((i & 1) != 0) {
                paywallComponent = rootComponentUnsupportedProperties.component;
            }
            return rootComponentUnsupportedProperties.copy(paywallComponent);
        }

        public final PaywallComponent component1() {
            return this.component;
        }

        public final RootComponentUnsupportedProperties copy(PaywallComponent component) {
            t.g(component, "component");
            return new RootComponentUnsupportedProperties(component);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RootComponentUnsupportedProperties) && t.c(this.component, ((RootComponentUnsupportedProperties) obj).component);
        }

        public final PaywallComponent getComponent() {
            return this.component;
        }

        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.component.hashCode();
        }

        public String toString() {
            return "RootComponentUnsupportedProperties(component=" + this.component + ')';
        }
    }

    public static final class TabControlNotInTab extends PaywallValidationError {
        public static final int $stable = 0;
        public static final TabControlNotInTab INSTANCE = new TabControlNotInTab();
        private static final String message = "Encountered a Tab Control component that is not in any tab.";

        private TabControlNotInTab() {
            super(null);
        }

        public String getMessage() {
            return message;
        }
    }

    public static final class TabsComponentWithoutTabs extends PaywallValidationError {
        public static final int $stable = 0;
        public static final TabsComponentWithoutTabs INSTANCE = new TabsComponentWithoutTabs();
        private static final String message = "Tabs component has no tabs configured.";

        private TabsComponentWithoutTabs() {
            super(null);
        }

        public String getMessage() {
            return message;
        }
    }

    public static final class UnsupportedBackgroundType extends PaywallValidationError {
        public static final int $stable = 8;
        private final Background.Unknown background;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnsupportedBackgroundType(Background.Unknown background) {
            super(null);
            t.g(background, "background");
            this.background = background;
            String format = String.format("This SDK version does not support this background type: %s", Arrays.copyOf(new Object[]{background.getType()}, 1));
            t.f(format, "format(...)");
            this.message = format;
        }

        public static /* synthetic */ UnsupportedBackgroundType copy$default(UnsupportedBackgroundType unsupportedBackgroundType, Background.Unknown unknown, int i, Object obj) {
            if ((i & 1) != 0) {
                unknown = unsupportedBackgroundType.background;
            }
            return unsupportedBackgroundType.copy(unknown);
        }

        public final Background.Unknown component1() {
            return this.background;
        }

        public final UnsupportedBackgroundType copy(Background.Unknown background) {
            t.g(background, "background");
            return new UnsupportedBackgroundType(background);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnsupportedBackgroundType) && t.c(this.background, ((UnsupportedBackgroundType) obj).background);
        }

        public final Background.Unknown getBackground() {
            return this.background;
        }

        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.background.hashCode();
        }

        public String toString() {
            return "UnsupportedBackgroundType(background=" + this.background + ')';
        }
    }

    public /* synthetic */ PaywallValidationError(k kVar) {
        this();
    }

    public final String associatedErrorString(Offering offering) {
        t.g(offering, "offering");
        if (this instanceof InvalidIcons) {
            String format = String.format("One or more icons were not recognized: %s", Arrays.copyOf(new Object[]{D.n0(((InvalidIcons) this).getInvalidIcons(), null, null, null, 0, null, null, 63, null)}, 1));
            t.f(format, "format(...)");
            return format;
        }
        if (this instanceof InvalidTemplate) {
            String format2 = String.format("Template name is not recognized: %s", Arrays.copyOf(new Object[]{((InvalidTemplate) this).getTemplateName()}, 1));
            t.f(format2, "format(...)");
            return format2;
        }
        if (this instanceof InvalidVariables) {
            String format3 = String.format("There were some errors validating variables in the paywall strings. The unrecognized variables are: %s", Arrays.copyOf(new Object[]{D.n0(((InvalidVariables) this).getUnrecognizedVariables(), null, null, null, 0, null, null, 63, null)}, 1));
            t.f(format3, "format(...)");
            return format3;
        }
        if (this instanceof MissingPaywall) {
            String format4 = String.format("Displaying default template because paywall is missing for offering '%s'. If you expected to see a v2 Paywall, make sure it is published.", Arrays.copyOf(new Object[]{offering.getIdentifier()}, 1));
            t.f(format4, "format(...)");
            return format4;
        }
        if (this instanceof MissingTiers) {
            String format5 = String.format("Displaying default template because paywall tiers are missing for offering '%s'.", Arrays.copyOf(new Object[]{offering.getIdentifier()}, 1));
            t.f(format5, "format(...)");
            return format5;
        }
        if (this instanceof MissingTierConfigurations) {
            String format6 = String.format("There are required tier configurations missing for: '%s'.", Arrays.copyOf(new Object[]{D.n0(((MissingTierConfigurations) this).getTierIds(), null, null, null, 0, null, null, 63, null)}, 1));
            t.f(format6, "format(...)");
            return format6;
        }
        if (this instanceof MissingStringLocalization) {
            return ((MissingStringLocalization) this).getMessage();
        }
        if (this instanceof MissingImageLocalization) {
            return ((MissingImageLocalization) this).getMessage();
        }
        if (this instanceof MissingVideoLocalization) {
            return ((MissingVideoLocalization) this).getMessage();
        }
        if (this instanceof AllLocalizationsMissing) {
            return ((AllLocalizationsMissing) this).getMessage();
        }
        if (this instanceof AllVariableLocalizationsMissing) {
            return ((AllVariableLocalizationsMissing) this).getMessage();
        }
        if (this instanceof MissingPackage) {
            return ((MissingPackage) this).getMessage();
        }
        if (this instanceof MissingColorAlias) {
            return ((MissingColorAlias) this).getMessage();
        }
        if (this instanceof AliasedColorIsAlias) {
            return ((AliasedColorIsAlias) this).getMessage();
        }
        if (this instanceof MissingFontAlias) {
            return ((MissingFontAlias) this).getMessage();
        }
        if (this instanceof InvalidModeForComponentsPaywall) {
            return "Paywalls V2 does not support footer modes. Falling back to legacy fallback paywall.";
        }
        if (this instanceof TabsComponentWithoutTabs) {
            return ((TabsComponentWithoutTabs) this).getMessage();
        }
        if (this instanceof TabControlNotInTab) {
            return ((TabControlNotInTab) this).getMessage();
        }
        if (this instanceof UnsupportedBackgroundType) {
            return ((UnsupportedBackgroundType) this).getMessage();
        }
        if (this instanceof RootComponentUnsupportedProperties) {
            return ((RootComponentUnsupportedProperties) this).getMessage();
        }
        throw new o();
    }

    private PaywallValidationError() {
    }
}

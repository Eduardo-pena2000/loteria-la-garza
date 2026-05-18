package com.revenuecat.purchases.ui.revenuecatui.helpers;

import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface PaywallValidationResult {

    public static final class Components implements PaywallValidationResult {
        public static final int $stable = 8;
        private final BackgroundStyles background;
        private final NonEmptyList errors;
        private final Integer initialSelectedTabIndex;
        private final NonEmptySet locales;
        private final PaywallState.Loaded.Components.AvailablePackages packages;
        private final ComponentStyle stack;
        private final ComponentStyle stickyFooter;
        private final UiConfig.VariableConfig variableConfig;
        private final VariableDataProvider variableDataProvider;
        private final Set zeroDecimalPlaceCountries;

        public Components(ComponentStyle stack, ComponentStyle componentStyle, BackgroundStyles background, NonEmptySet locales, Set zeroDecimalPlaceCountries, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, PaywallState.Loaded.Components.AvailablePackages packages, Integer num) {
            t.g(stack, "stack");
            t.g(background, "background");
            t.g(locales, "locales");
            t.g(zeroDecimalPlaceCountries, "zeroDecimalPlaceCountries");
            t.g(variableConfig, "variableConfig");
            t.g(variableDataProvider, "variableDataProvider");
            t.g(packages, "packages");
            this.stack = stack;
            this.stickyFooter = componentStyle;
            this.background = background;
            this.locales = locales;
            this.zeroDecimalPlaceCountries = zeroDecimalPlaceCountries;
            this.variableConfig = variableConfig;
            this.variableDataProvider = variableDataProvider;
            this.packages = packages;
            this.initialSelectedTabIndex = num;
        }

        public static /* synthetic */ Components copy$default(Components components, ComponentStyle componentStyle, ComponentStyle componentStyle2, BackgroundStyles backgroundStyles, NonEmptySet nonEmptySet, Set set, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, PaywallState.Loaded.Components.AvailablePackages availablePackages, Integer num, int i, Object obj) {
            return components.copy((i & 1) != 0 ? components.stack : componentStyle, (i & 2) != 0 ? components.stickyFooter : componentStyle2, (i & 4) != 0 ? components.background : backgroundStyles, (i & 8) != 0 ? components.locales : nonEmptySet, (i & 16) != 0 ? components.zeroDecimalPlaceCountries : set, (i & 32) != 0 ? components.variableConfig : variableConfig, (i & 64) != 0 ? components.variableDataProvider : variableDataProvider, (i & 128) != 0 ? components.packages : availablePackages, (i & 256) != 0 ? components.initialSelectedTabIndex : num);
        }

        public final ComponentStyle component1() {
            return this.stack;
        }

        public final ComponentStyle component2() {
            return this.stickyFooter;
        }

        public final BackgroundStyles component3() {
            return this.background;
        }

        public final NonEmptySet component4() {
            return this.locales;
        }

        public final Set component5() {
            return this.zeroDecimalPlaceCountries;
        }

        public final UiConfig.VariableConfig component6() {
            return this.variableConfig;
        }

        public final VariableDataProvider component7() {
            return this.variableDataProvider;
        }

        public final PaywallState.Loaded.Components.AvailablePackages component8() {
            return this.packages;
        }

        public final Integer component9() {
            return this.initialSelectedTabIndex;
        }

        public final Components copy(ComponentStyle stack, ComponentStyle componentStyle, BackgroundStyles background, NonEmptySet locales, Set zeroDecimalPlaceCountries, UiConfig.VariableConfig variableConfig, VariableDataProvider variableDataProvider, PaywallState.Loaded.Components.AvailablePackages packages, Integer num) {
            t.g(stack, "stack");
            t.g(background, "background");
            t.g(locales, "locales");
            t.g(zeroDecimalPlaceCountries, "zeroDecimalPlaceCountries");
            t.g(variableConfig, "variableConfig");
            t.g(variableDataProvider, "variableDataProvider");
            t.g(packages, "packages");
            return new Components(stack, componentStyle, background, locales, zeroDecimalPlaceCountries, variableConfig, variableDataProvider, packages, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Components)) {
                return false;
            }
            Components components = (Components) obj;
            return t.c(this.stack, components.stack) && t.c(this.stickyFooter, components.stickyFooter) && t.c(this.background, components.background) && t.c(this.locales, components.locales) && t.c(this.zeroDecimalPlaceCountries, components.zeroDecimalPlaceCountries) && t.c(this.variableConfig, components.variableConfig) && t.c(this.variableDataProvider, components.variableDataProvider) && t.c(this.packages, components.packages) && t.c(this.initialSelectedTabIndex, components.initialSelectedTabIndex);
        }

        public final BackgroundStyles getBackground() {
            return this.background;
        }

        public NonEmptyList getErrors() {
            return this.errors;
        }

        public final Integer getInitialSelectedTabIndex() {
            return this.initialSelectedTabIndex;
        }

        public final NonEmptySet getLocales() {
            return this.locales;
        }

        public final PaywallState.Loaded.Components.AvailablePackages getPackages() {
            return this.packages;
        }

        public final ComponentStyle getStack() {
            return this.stack;
        }

        public final ComponentStyle getStickyFooter() {
            return this.stickyFooter;
        }

        public final UiConfig.VariableConfig getVariableConfig() {
            return this.variableConfig;
        }

        public final VariableDataProvider getVariableDataProvider() {
            return this.variableDataProvider;
        }

        public final Set getZeroDecimalPlaceCountries() {
            return this.zeroDecimalPlaceCountries;
        }

        public int hashCode() {
            int hashCode = this.stack.hashCode() * 31;
            ComponentStyle componentStyle = this.stickyFooter;
            int hashCode2 = (((((((((((((hashCode + (componentStyle == null ? 0 : componentStyle.hashCode())) * 31) + this.background.hashCode()) * 31) + this.locales.hashCode()) * 31) + this.zeroDecimalPlaceCountries.hashCode()) * 31) + this.variableConfig.hashCode()) * 31) + this.variableDataProvider.hashCode()) * 31) + this.packages.hashCode()) * 31;
            Integer num = this.initialSelectedTabIndex;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Components(stack=" + this.stack + ", stickyFooter=" + this.stickyFooter + ", background=" + this.background + ", locales=" + this.locales + ", zeroDecimalPlaceCountries=" + this.zeroDecimalPlaceCountries + ", variableConfig=" + this.variableConfig + ", variableDataProvider=" + this.variableDataProvider + ", packages=" + this.packages + ", initialSelectedTabIndex=" + this.initialSelectedTabIndex + ')';
        }
    }

    NonEmptyList getErrors();

    public static final class Legacy implements PaywallValidationResult {
        public static final int $stable = 8;
        private final PaywallData displayablePaywall;
        private final NonEmptyList errors;
        private final PaywallTemplate template;

        public Legacy(PaywallData displayablePaywall, PaywallTemplate template, NonEmptyList nonEmptyList) {
            t.g(displayablePaywall, "displayablePaywall");
            t.g(template, "template");
            this.displayablePaywall = displayablePaywall;
            this.template = template;
            this.errors = nonEmptyList;
        }

        public static /* synthetic */ Legacy copy$default(Legacy legacy, PaywallData paywallData, PaywallTemplate paywallTemplate, NonEmptyList nonEmptyList, int i, Object obj) {
            if ((i & 1) != 0) {
                paywallData = legacy.displayablePaywall;
            }
            if ((i & 2) != 0) {
                paywallTemplate = legacy.template;
            }
            if ((i & 4) != 0) {
                nonEmptyList = legacy.errors;
            }
            return legacy.copy(paywallData, paywallTemplate, nonEmptyList);
        }

        public final PaywallData component1() {
            return this.displayablePaywall;
        }

        public final PaywallTemplate component2() {
            return this.template;
        }

        public final NonEmptyList component3() {
            return this.errors;
        }

        public final Legacy copy(PaywallData displayablePaywall, PaywallTemplate template, NonEmptyList nonEmptyList) {
            t.g(displayablePaywall, "displayablePaywall");
            t.g(template, "template");
            return new Legacy(displayablePaywall, template, nonEmptyList);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Legacy)) {
                return false;
            }
            Legacy legacy = (Legacy) obj;
            return t.c(this.displayablePaywall, legacy.displayablePaywall) && this.template == legacy.template && t.c(this.errors, legacy.errors);
        }

        public final PaywallData getDisplayablePaywall() {
            return this.displayablePaywall;
        }

        public NonEmptyList getErrors() {
            return this.errors;
        }

        public final PaywallTemplate getTemplate() {
            return this.template;
        }

        public final PaywallWarning getWarning() {
            PaywallValidationError paywallValidationError;
            NonEmptyList errors = getErrors();
            if (errors == null || (paywallValidationError = (PaywallValidationError) errors.getHead()) == null) {
                return null;
            }
            return PaywallWarning.Companion.from(paywallValidationError);
        }

        public int hashCode() {
            int hashCode = ((this.displayablePaywall.hashCode() * 31) + this.template.hashCode()) * 31;
            NonEmptyList nonEmptyList = this.errors;
            return hashCode + (nonEmptyList == null ? 0 : nonEmptyList.hashCode());
        }

        public String toString() {
            return "Legacy(displayablePaywall=" + this.displayablePaywall + ", template=" + this.template + ", errors=" + this.errors + ')';
        }

        public /* synthetic */ Legacy(PaywallData paywallData, PaywallTemplate paywallTemplate, NonEmptyList nonEmptyList, int i, k kVar) {
            this(paywallData, paywallTemplate, (i & 4) != 0 ? null : nonEmptyList);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Legacy(PaywallData displayablePaywall, PaywallTemplate template, PaywallValidationError error) {
            this(displayablePaywall, template, NonEmptyListKt.nonEmptyListOf(error, new PaywallValidationError[0]));
            t.g(displayablePaywall, "displayablePaywall");
            t.g(template, "template");
            t.g(error, "error");
        }
    }
}

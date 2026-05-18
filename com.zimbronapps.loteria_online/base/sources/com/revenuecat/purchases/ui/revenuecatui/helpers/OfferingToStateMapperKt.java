package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Ca.o;
import Ca.s;
import Da.A;
import Da.D;
import Da.S;
import Da.Y;
import Da.Z;
import Da.v;
import Da.w;
import X.l;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconName;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PackageConfigurationType;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfigurationFactory;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallValidationResult;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OfferingToStateMapperKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PackageConfigurationType.values().length];
            try {
                iArr[PackageConfigurationType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PackageConfigurationType.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PackageConfigurationType.MULTITIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ boolean containsUnsupportedCondition(PaywallComponentsConfig paywallComponentsConfig) {
        StackComponent stack;
        t.g(paywallComponentsConfig, "<this>");
        if (containsUnsupportedCondition(paywallComponentsConfig.getStack())) {
            return true;
        }
        StickyFooterComponent stickyFooter = paywallComponentsConfig.getStickyFooter();
        return (stickyFooter == null || (stack = stickyFooter.getStack()) == null || !containsUnsupportedCondition(stack)) ? false : true;
    }

    public static final /* synthetic */ PaywallValidationResult.Legacy fallbackPaywall(Offering offering, l currentColorScheme, ResourceProvider resourceProvider, PaywallValidationError error) {
        t.g(offering, "<this>");
        t.g(currentColorScheme, "currentColorScheme");
        t.g(resourceProvider, "resourceProvider");
        t.g(error, "error");
        return fallbackPaywall(offering, currentColorScheme, resourceProvider, NonEmptyListKt.nonEmptyListOf(error, new PaywallValidationError[0]));
    }

    private static final Map getDefaultLocalization(PaywallComponentsData paywallComponentsData) {
        return (Map) LocalizationKt.getBestMatch-64pKzr8(paywallComponentsData.getComponentsLocalizations(), paywallComponentsData.getDefaultLocaleIdentifier-uqtKvyA());
    }

    private static final Map getDefaultVariableLocalization(Offering.PaywallComponents paywallComponents) {
        return (Map) LocalizationKt.getBestMatch-64pKzr8(paywallComponents.getUiConfig().getLocalizations(), paywallComponents.getData().getDefaultLocaleIdentifier-uqtKvyA());
    }

    private static final Set getMissingElements(Set set, Set set2) {
        if (set2 == null) {
            set2 = Y.b();
        }
        Collection g = Z.g(set, D.Q0((Iterable) set2));
        if (g.isEmpty()) {
            return null;
        }
        return g;
    }

    public static final /* synthetic */ boolean hasUnsupportedCondition(List list) {
        t.g(list, "<this>");
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List conditions = ((ComponentOverride) it.next()).getConditions();
            if (conditions == null || !conditions.isEmpty()) {
                Iterator it2 = conditions.iterator();
                while (it2.hasNext()) {
                    if (((ComponentOverride.Condition) it2.next()) instanceof ComponentOverride.Condition.Unsupported) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final PaywallState.Loaded.Components toComponentsPaywallState(Offering offering, PaywallValidationResult.Components validationResult, String str, Qa.a dateProvider, PurchasesType purchases, Map customVariables, Map defaultCustomVariables) {
        t.g(offering, "<this>");
        t.g(validationResult, "validationResult");
        t.g(dateProvider, "dateProvider");
        t.g(purchases, "purchases");
        t.g(customVariables, "customVariables");
        t.g(defaultCustomVariables, "defaultCustomVariables");
        return new PaywallState.Loaded.Components(validationResult.getStack(), validationResult.getStickyFooter(), validationResult.getBackground(), str != null ? true ^ validationResult.getZeroDecimalPlaceCountries().contains(str) : true, validationResult.getVariableConfig(), validationResult.getVariableDataProvider(), offering, validationResult.getLocales(), str, dateProvider, validationResult.getPackages(), customVariables, defaultCustomVariables, null, validationResult.getInitialSelectedTabIndex(), null, purchases, 40960, null);
    }

    public static /* synthetic */ PaywallState.Loaded.Components toComponentsPaywallState$default(Offering offering, PaywallValidationResult.Components components, String str, Qa.a aVar, PurchasesType purchasesType, Map map, Map map2, int i, Object obj) {
        if ((i & 16) != 0) {
            map = S.h();
        }
        Map map3 = map;
        if ((i & 32) != 0) {
            map2 = S.h();
        }
        return toComponentsPaywallState(offering, components, str, aVar, purchasesType, map3, map2);
    }

    public static final PaywallState toLegacyPaywallState(Offering offering, VariableDataProvider variableDataProvider, PaywallMode mode, PaywallData validatedPaywallData, PaywallTemplate template, boolean z, String str, PaywallWarning paywallWarning) {
        t.g(offering, "<this>");
        t.g(variableDataProvider, "variableDataProvider");
        t.g(mode, "mode");
        t.g(validatedPaywallData, "validatedPaywallData");
        t.g(template, "template");
        Object obj = TemplateConfigurationFactory.INSTANCE.create-hUnOzRk(variableDataProvider, mode, validatedPaywallData, offering.getAvailablePackages(), template, str);
        Throwable e = s.e(obj);
        if (e == null) {
            TemplateConfiguration templateConfiguration = (TemplateConfiguration) obj;
            return new PaywallState.Loaded.Legacy(offering, templateConfiguration, templateConfiguration.getPackages().getDefault(), z, paywallWarning);
        }
        String message = e.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        return new PaywallState.Error(message);
    }

    public static /* synthetic */ PaywallState toLegacyPaywallState$default(Offering offering, VariableDataProvider variableDataProvider, PaywallMode paywallMode, PaywallData paywallData, PaywallTemplate paywallTemplate, boolean z, String str, PaywallWarning paywallWarning, int i, Object obj) {
        return toLegacyPaywallState(offering, variableDataProvider, paywallMode, paywallData, paywallTemplate, z, str, (i & 64) != 0 ? null : paywallWarning);
    }

    public static final PaywallValidationResult.Legacy validate(PaywallData paywallData, l currentColorScheme, ResourceProvider resourceProvider) {
        t.g(paywallData, "<this>");
        t.g(currentColorScheme, "currentColorScheme");
        t.g(resourceProvider, "resourceProvider");
        Object validate = validate(paywallData);
        Throwable e = s.e(validate);
        if (e == null) {
            return new PaywallValidationResult.Legacy(paywallData, (PaywallTemplate) validate, null, 4, null);
        }
        PaywallData.Companion companion = PaywallData.Companion;
        PaywallData createDefaultForIdentifiers = PaywallDataExtensionsKt.createDefaultForIdentifiers(companion, paywallData.getConfig().getPackageIds(), currentColorScheme, resourceProvider);
        PaywallTemplate defaultTemplate = PaywallDataExtensionsKt.getDefaultTemplate(companion);
        t.e(e, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError");
        return new PaywallValidationResult.Legacy(createDefaultForIdentifiers, defaultTemplate, (PaywallValidationError) e);
    }

    private static final PaywallValidationError.InvalidIcons validateIcons(PaywallData.LocalizedConfiguration localizedConfiguration) {
        List features = localizedConfiguration.getFeatures();
        ArrayList arrayList = new ArrayList();
        Iterator it = features.iterator();
        while (it.hasNext()) {
            String validateIcons$validateIcon = validateIcons$validateIcon((PaywallData.LocalizedConfiguration.Feature) it.next());
            if (validateIcons$validateIcon != null) {
                arrayList.add(validateIcons$validateIcon);
            }
        }
        Collection Q0 = D.Q0(arrayList);
        if (Q0.isEmpty()) {
            return null;
        }
        return new PaywallValidationError.InvalidIcons(Q0);
    }

    private static final String validateIcons$validateIcon(PaywallData.LocalizedConfiguration.Feature feature) {
        String iconID = feature.getIconID();
        if (iconID == null || PaywallIconName.Companion.fromValue(iconID) != null) {
            return null;
        }
        return iconID;
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0509  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.revenuecat.purchases.ui.revenuecatui.helpers.Result validatePaywallComponentsDataOrNull(com.revenuecat.purchases.Offering r46, com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider r47) {
        /*
            Method dump skipped, instructions count: 1508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt.validatePaywallComponentsDataOrNull(com.revenuecat.purchases.Offering, com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider):com.revenuecat.purchases.ui.revenuecatui.helpers.Result");
    }

    private static final PaywallTemplate validateTemplate(PaywallData paywallData) {
        return PaywallTemplate.Companion.fromId(paywallData.getTemplateName());
    }

    private static final PaywallValidationError.InvalidVariables validateVariables(PaywallData.LocalizedConfiguration localizedConfiguration) {
        Set i = Z.i(Z.i(Z.i(Z.i(Z.i(Z.i(validateVariables$validateVariablesInProperty(localizedConfiguration.getTitle()), validateVariables$validateVariablesInProperty(localizedConfiguration.getSubtitle())), validateVariables$validateVariablesInProperty(localizedConfiguration.getCallToAction())), validateVariables$validateVariablesInProperty(localizedConfiguration.getCallToActionWithIntroOffer())), validateVariables$validateVariablesInProperty(localizedConfiguration.getOfferDetails())), validateVariables$validateVariablesInProperty(localizedConfiguration.getOfferDetailsWithIntroOffer())), validateVariables$validateVariablesInProperty(localizedConfiguration.getOfferName()));
        List<PaywallData.LocalizedConfiguration.Feature> features = localizedConfiguration.getFeatures();
        ArrayList arrayList = new ArrayList();
        for (PaywallData.LocalizedConfiguration.Feature feature : features) {
            A.D(arrayList, Z.i(validateVariables$validateVariablesInProperty(feature.getTitle()), validateVariables$validateVariablesInProperty(feature.getContent())));
        }
        Collection i2 = Z.i(i, arrayList);
        if (i2.isEmpty()) {
            return null;
        }
        return new PaywallValidationError.InvalidVariables(i2);
    }

    private static final Set validateVariables$validateVariablesInProperty(String str) {
        Set validateVariables;
        return (str == null || (validateVariables = VariableProcessor.INSTANCE.validateVariables(str)) == null) ? Y.b() : validateVariables;
    }

    public static final PaywallValidationResult validatedPaywall(Offering offering, l currentColorScheme, ResourceProvider resourceProvider) {
        PaywallValidationResult fallbackPaywall;
        t.g(offering, "<this>");
        t.g(currentColorScheme, "currentColorScheme");
        t.g(resourceProvider, "resourceProvider");
        Result validatePaywallComponentsDataOrNull = validatePaywallComponentsDataOrNull(offering, resourceProvider);
        if (validatePaywallComponentsDataOrNull != null) {
            if (validatePaywallComponentsDataOrNull instanceof Result.Success) {
                fallbackPaywall = (PaywallValidationResult) ((Result.Success) validatePaywallComponentsDataOrNull).getValue();
            } else {
                if (!(validatePaywallComponentsDataOrNull instanceof Result.Error)) {
                    throw new o();
                }
                fallbackPaywall = fallbackPaywall(offering, currentColorScheme, resourceProvider, (NonEmptyList) ((Result.Error) validatePaywallComponentsDataOrNull).getValue());
            }
            if (fallbackPaywall != null) {
                return fallbackPaywall;
            }
        }
        PaywallData paywall = offering.getPaywall();
        return paywall != null ? validate(paywall, currentColorScheme, resourceProvider) : fallbackPaywall(offering, currentColorScheme, resourceProvider, PaywallValidationError.MissingPaywall.INSTANCE);
    }

    public static final /* synthetic */ boolean containsUnsupportedCondition(StackComponent stackComponent) {
        t.g(stackComponent, "<this>");
        if (!hasUnsupportedCondition(stackComponent.getOverrides())) {
            List components = stackComponent.getComponents();
            if (components == null || !components.isEmpty()) {
                Iterator it = components.iterator();
                while (it.hasNext()) {
                    if (containsUnsupportedCondition((PaywallComponent) it.next())) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    private static final PaywallValidationResult.Legacy fallbackPaywall(Offering offering, l lVar, ResourceProvider resourceProvider, NonEmptyList nonEmptyList) {
        PaywallData.Companion companion = PaywallData.Companion;
        return new PaywallValidationResult.Legacy(PaywallDataExtensionsKt.createDefault(companion, offering.getAvailablePackages(), lVar, resourceProvider), PaywallDataExtensionsKt.getDefaultTemplate(companion), nonEmptyList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0180, code lost:
    
        if (r4 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01fc, code lost:
    
        if (r4 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0230, code lost:
    
        if ((r4 != null && containsUnsupportedCondition(r4)) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (hasUnsupportedCondition(r4) == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (r4 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0120, code lost:
    
        if (r4 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[LOOP:2: B:133:0x01ac->B:154:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ boolean containsUnsupportedCondition(com.revenuecat.purchases.paywalls.components.PaywallComponent r4) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt.containsUnsupportedCondition(com.revenuecat.purchases.paywalls.components.PaywallComponent):boolean");
    }

    private static final Object validate(PaywallData paywallData) {
        PaywallTemplate validateTemplate = validateTemplate(paywallData);
        if (validateTemplate == null) {
            s.a aVar = s.b;
            return s.b(Ca.t.a(new PaywallValidationError.InvalidTemplate(paywallData.getTemplateName())));
        }
        int i = WhenMappings.$EnumSwitchMapping$0[validateTemplate.getConfigurationType().ordinal()];
        if (i == 1 || i == 2) {
            PaywallValidationError validate = validate((PaywallData.LocalizedConfiguration) paywallData.getLocalizedConfiguration().b());
            if (validate != null) {
                s.a aVar2 = s.b;
                return s.b(Ca.t.a(validate));
            }
        } else if (i == 3) {
            List tiers = paywallData.getConfig().getTiers();
            if (tiers == null) {
                tiers = v.n();
            }
            if (tiers.isEmpty()) {
                s.a aVar3 = s.b;
                return s.b(Ca.t.a(PaywallValidationError.MissingTiers.INSTANCE));
            }
            ArrayList arrayList = new ArrayList(w.y(tiers, 10));
            Iterator it = tiers.iterator();
            while (it.hasNext()) {
                arrayList.add(((PaywallData.Configuration.Tier) it.next()).getId());
            }
            Set Q0 = D.Q0(arrayList);
            Map colorsByTier = paywallData.getConfig().getColorsByTier();
            Set missingElements = getMissingElements(Q0, colorsByTier != null ? colorsByTier.keySet() : null);
            if (missingElements != null) {
                s.a aVar4 = s.b;
                return s.b(Ca.t.a(new PaywallValidationError.MissingTierConfigurations(missingElements)));
            }
            Map imagesByTier = paywallData.getConfig().getImagesByTier();
            Iterable missingElements2 = getMissingElements(Q0, imagesByTier != null ? imagesByTier.keySet() : null);
            if (missingElements2 != null) {
                Logger.INSTANCE.w("Missing images for tier(s): " + D.n0(missingElements2, ",", null, null, 0, null, null, 62, null));
            }
            Map map = (Map) paywallData.getTieredLocalizedConfiguration().b();
            Set missingElements3 = getMissingElements(Q0, map.keySet());
            if (missingElements3 != null) {
                s.a aVar5 = s.b;
                return s.b(Ca.t.a(new PaywallValidationError.MissingTierConfigurations(missingElements3)));
            }
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                PaywallValidationError validate2 = validate((PaywallData.LocalizedConfiguration) ((Map.Entry) it2.next()).getValue());
                if (validate2 != null) {
                    s.a aVar6 = s.b;
                    return s.b(Ca.t.a(validate2));
                }
            }
        }
        return s.b(validateTemplate);
    }

    private static final PaywallValidationError validate(PaywallData.LocalizedConfiguration localizedConfiguration) {
        PaywallValidationError.InvalidVariables validateVariables = validateVariables(localizedConfiguration);
        if (validateVariables != null) {
            return validateVariables;
        }
        PaywallValidationError.InvalidIcons validateIcons = validateIcons(localizedConfiguration);
        if (validateIcons != null) {
            return validateIcons;
        }
        return null;
    }
}

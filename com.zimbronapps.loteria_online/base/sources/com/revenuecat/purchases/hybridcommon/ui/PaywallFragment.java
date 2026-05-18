package com.revenuecat.purchases.hybridcommon.ui;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.S;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.B;
import androidx.fragment.app.p;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.hybridcommon.ui.PaywallSource;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLaunchIfNeededOptions;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLaunchOptions;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLauncher;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResultHandler;
import com.revenuecat.purchases.ui.revenuecatui.fonts.CustomParcelizableFontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallFragment extends p implements PaywallResultHandler {
    public static final Companion Companion = new Companion(null);
    private static final String notPresentedPaywallResult = "NOT_PRESENTED";
    public static final String tag = "revenuecat-paywall-fragment";
    private PaywallActivityLauncher launcher;

    public static final class Companion {

        public enum OptionKey {
            REQUEST_KEY("requestKey"),
            REQUIRED_ENTITLEMENT_IDENTIFIER("requiredEntitlementIdentifier"),
            SHOULD_DISPLAY_DISMISS_BUTTON("shouldDisplayDismissButton"),
            OFFERING_IDENTIFIER("offeringIdentifier"),
            PRESENTED_OFFERING_CONTEXT("presentedOfferingContext"),
            FONT_FAMILY("fontProvider"),
            CUSTOM_VARIABLES("customVariables");

            private final String key;

            OptionKey(String str) {
                this.key = str;
            }

            public final String getKey() {
                return this.key;
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ PaywallFragment newInstance$default(Companion companion, String str, String str2, Boolean bool, PaywallSource paywallSource, PaywallFontFamily paywallFontFamily, Map map, int i, Object obj) {
            return companion.newInstance(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, paywallSource, (i & 16) != 0 ? null : paywallFontFamily, (i & 32) != 0 ? null : map);
        }

        public final PaywallFragment newInstance(String str, String str2, Boolean bool, PaywallSource paywallSource, PaywallFontFamily paywallFontFamily, Map map) {
            t.g(str, "requestKey");
            t.g(paywallSource, "paywallSource");
            PaywallFragment paywallFragment = new PaywallFragment();
            Bundle bundle = new Bundle();
            bundle.putString(OptionKey.REQUEST_KEY.getKey(), str);
            bundle.putString(OptionKey.REQUIRED_ENTITLEMENT_IDENTIFIER.getKey(), str2);
            if (bool != null) {
                bundle.putBoolean(OptionKey.SHOULD_DISPLAY_DISMISS_BUTTON.getKey(), bool.booleanValue());
            }
            if (paywallSource instanceof PaywallSource.Offering) {
                PaywallSource.Offering offering = (PaywallSource.Offering) paywallSource;
                bundle.putString(OptionKey.OFFERING_IDENTIFIER.getKey(), offering.getValue().getIdentifier());
                PresentedOfferingContext presentedOfferingContext$hybridcommon_ui_bc8Release = offering.getPresentedOfferingContext$hybridcommon_ui_bc8Release();
                if (presentedOfferingContext$hybridcommon_ui_bc8Release != null) {
                    bundle.putParcelable(OptionKey.PRESENTED_OFFERING_CONTEXT.getKey(), presentedOfferingContext$hybridcommon_ui_bc8Release);
                }
            } else if (paywallSource instanceof PaywallSource.OfferingIdentifier) {
                bundle.putString(OptionKey.OFFERING_IDENTIFIER.getKey(), ((PaywallSource.OfferingIdentifier) paywallSource).getValue());
            } else if (paywallSource instanceof PaywallSource.OfferingIdentifierWithPresentedOfferingContext) {
                PaywallSource.OfferingIdentifierWithPresentedOfferingContext offeringIdentifierWithPresentedOfferingContext = (PaywallSource.OfferingIdentifierWithPresentedOfferingContext) paywallSource;
                bundle.putString(OptionKey.OFFERING_IDENTIFIER.getKey(), offeringIdentifierWithPresentedOfferingContext.getOfferingIdentifier());
                bundle.putParcelable(OptionKey.PRESENTED_OFFERING_CONTEXT.getKey(), offeringIdentifierWithPresentedOfferingContext.getPresentedOfferingContext());
            } else {
                boolean z = paywallSource instanceof PaywallSource.DefaultOffering;
            }
            if (paywallFontFamily != null) {
                bundle.putParcelable(OptionKey.FONT_FAMILY.getKey(), paywallFontFamily);
            }
            if (map != null) {
                bundle.putSerializable(OptionKey.CUSTOM_VARIABLES.getKey(), new HashMap(map));
            }
            paywallFragment.setArguments(bundle);
            return paywallFragment;
        }

        private Companion() {
        }
    }

    public enum ResultKey {
        PAYWALL_RESULT("paywall_result");

        private final String key;

        ResultKey(String str) {
            this.key = str;
        }

        public final String getKey() {
            return this.key;
        }
    }

    public static final /* synthetic */ void access$removeFragment(PaywallFragment paywallFragment) {
        paywallFragment.removeFragment();
    }

    public static final /* synthetic */ void access$setFragmentResult(PaywallFragment paywallFragment, String str) {
        paywallFragment.setFragmentResult(str);
    }

    private final Map convertToCustomVariableValues(Map map) {
        q qVar;
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                qVar = x.a(str, new CustomVariableValue.String((String) value));
            } else if (value instanceof Boolean) {
                qVar = x.a(str, new CustomVariableValue.Boolean(((Boolean) value).booleanValue()));
            } else if (value instanceof Number) {
                qVar = x.a(str, new CustomVariableValue.Number(((Number) value).doubleValue()));
            } else {
                if (value != null) {
                    Log.w("Purchases", "Custom variable '" + str + "' has unsupported type " + P.b(value.getClass()).e() + ". Only String, Number, and Boolean values are supported. This variable will be ignored.");
                }
                qVar = null;
            }
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        Map x = S.x(arrayList);
        if (x == null || x.isEmpty()) {
            return null;
        }
        return x;
    }

    private final Map getCustomVariablesArg() {
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = getArguments();
            HashMap a = arguments != null ? c.a(arguments, Companion.OptionKey.CUSTOM_VARIABLES.getKey(), HashMap.class) : null;
            if (a != null) {
                return a;
            }
            return null;
        }
        Bundle arguments2 = getArguments();
        Serializable serializable = arguments2 != null ? arguments2.getSerializable(Companion.OptionKey.CUSTOM_VARIABLES.getKey()) : null;
        if (serializable instanceof Map) {
            return (Map) serializable;
        }
        return null;
    }

    private final PaywallFontFamily getFontFamily() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        Companion.OptionKey optionKey = Companion.OptionKey.FONT_FAMILY;
        if (!arguments.containsKey(optionKey.getKey())) {
            arguments = null;
        }
        if (arguments != null) {
            return Build.VERSION.SDK_INT >= 33 ? (PaywallFontFamily) q7.d.a(arguments, optionKey.getKey(), PaywallFontFamily.class) : arguments.getParcelable(optionKey.getKey());
        }
        return null;
    }

    private final String getOfferingIdentifierArg() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString(Companion.OptionKey.OFFERING_IDENTIFIER.getKey());
        }
        return null;
    }

    private final PresentedOfferingContext getPresentedOfferingContextArg() {
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                return (PresentedOfferingContext) q7.d.a(arguments, Companion.OptionKey.PRESENTED_OFFERING_CONTEXT.getKey(), PresentedOfferingContext.class);
            }
            return null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            return (PresentedOfferingContext) arguments2.getParcelable(Companion.OptionKey.PRESENTED_OFFERING_CONTEXT.getKey());
        }
        return null;
    }

    private final String getRequestKey() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(Companion.OptionKey.REQUEST_KEY.getKey()) : null;
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("requestKey argument not provided");
    }

    private final String getRequiredEntitlementIdentifier() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString(Companion.OptionKey.REQUIRED_ENTITLEMENT_IDENTIFIER.getKey());
        }
        return null;
    }

    private final Boolean getShouldDisplayDismissButtonArg() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        Companion.OptionKey optionKey = Companion.OptionKey.SHOULD_DISPLAY_DISMISS_BUTTON;
        if (arguments.containsKey(optionKey.getKey())) {
            return Boolean.valueOf(arguments.getBoolean(optionKey.getKey()));
        }
        return null;
    }

    private final void launchPaywall() {
        HybridPurchaseLogicBridge purchaseLogic;
        PaywallListenerWrapper paywallListener;
        String offeringIdentifierArg = getOfferingIdentifierArg();
        PresentedOfferingContext presentedOfferingContextArg = getPresentedOfferingContextArg();
        PaywallActivityLauncher paywallActivityLauncher = null;
        if (presentedOfferingContextArg == null) {
            presentedOfferingContextArg = offeringIdentifierArg != null ? new PresentedOfferingContext(offeringIdentifierArg) : null;
        }
        Boolean shouldDisplayDismissButtonArg = getShouldDisplayDismissButtonArg();
        PaywallFontFamily fontFamily = getFontFamily();
        CustomParcelizableFontProvider customParcelizableFontProvider = fontFamily != null ? new CustomParcelizableFontProvider(fontFamily) : null;
        Map convertToCustomVariableValues = convertToCustomVariableValues(getCustomVariablesArg());
        if (convertToCustomVariableValues == null) {
            convertToCustomVariableValues = S.h();
        }
        PaywallFragmentNonSerializableArgs paywallFragmentNonSerializableArgs = PaywallFragmentNonSerializableArgsStore.INSTANCE.get(getRequestKey());
        PaywallActivityLaunchOptions.Builder customVariables = new PaywallActivityLaunchOptions.Builder().setFontProvider(customParcelizableFontProvider).setCustomVariables(convertToCustomVariableValues);
        if (shouldDisplayDismissButtonArg != null) {
            customVariables.setShouldDisplayDismissButton(shouldDisplayDismissButtonArg.booleanValue());
        }
        if (offeringIdentifierArg != null && presentedOfferingContextArg != null) {
            customVariables.setOfferingIdentifier(offeringIdentifierArg, presentedOfferingContextArg);
        }
        if (paywallFragmentNonSerializableArgs != null && (paywallListener = paywallFragmentNonSerializableArgs.getPaywallListener()) != null) {
            customVariables.setListener(paywallListener);
        }
        if (paywallFragmentNonSerializableArgs != null && (purchaseLogic = paywallFragmentNonSerializableArgs.getPurchaseLogic()) != null) {
            customVariables.setPurchaseLogic(purchaseLogic);
        }
        PaywallActivityLauncher paywallActivityLauncher2 = this.launcher;
        if (paywallActivityLauncher2 == null) {
            t.v("launcher");
        } else {
            paywallActivityLauncher = paywallActivityLauncher2;
        }
        paywallActivityLauncher.launchWithOptions(customVariables.build());
    }

    private final void launchPaywallIfNeeded(String str) {
        HybridPurchaseLogicBridge purchaseLogic;
        PaywallListenerWrapper paywallListener;
        Boolean shouldDisplayDismissButtonArg = getShouldDisplayDismissButtonArg();
        String offeringIdentifierArg = getOfferingIdentifierArg();
        PresentedOfferingContext presentedOfferingContextArg = getPresentedOfferingContextArg();
        PaywallActivityLauncher paywallActivityLauncher = null;
        if (presentedOfferingContextArg == null) {
            presentedOfferingContextArg = offeringIdentifierArg != null ? new PresentedOfferingContext(offeringIdentifierArg) : null;
        }
        PaywallFontFamily fontFamily = getFontFamily();
        CustomParcelizableFontProvider customParcelizableFontProvider = fontFamily != null ? new CustomParcelizableFontProvider(fontFamily) : null;
        Map convertToCustomVariableValues = convertToCustomVariableValues(getCustomVariablesArg());
        if (convertToCustomVariableValues == null) {
            convertToCustomVariableValues = S.h();
        }
        PaywallFragmentNonSerializableArgs paywallFragmentNonSerializableArgs = PaywallFragmentNonSerializableArgsStore.INSTANCE.get(getRequestKey());
        PaywallActivityLaunchIfNeededOptions.Builder customVariables = new PaywallActivityLaunchIfNeededOptions.Builder().setRequiredEntitlementIdentifier(str).setFontProvider(customParcelizableFontProvider).setPaywallDisplayCallback(new PaywallFragment$launchPaywallIfNeeded$paywallDisplayCallback$1(this)).setCustomVariables(convertToCustomVariableValues);
        if (shouldDisplayDismissButtonArg != null) {
            customVariables.setShouldDisplayDismissButton(shouldDisplayDismissButtonArg.booleanValue());
        }
        if (offeringIdentifierArg != null && presentedOfferingContextArg != null) {
            customVariables.setOfferingIdentifier(offeringIdentifierArg, presentedOfferingContextArg);
        }
        if (paywallFragmentNonSerializableArgs != null && (paywallListener = paywallFragmentNonSerializableArgs.getPaywallListener()) != null) {
            customVariables.setListener(paywallListener);
        }
        if (paywallFragmentNonSerializableArgs != null && (purchaseLogic = paywallFragmentNonSerializableArgs.getPurchaseLogic()) != null) {
            customVariables.setPurchaseLogic(purchaseLogic);
        }
        PaywallActivityLauncher paywallActivityLauncher2 = this.launcher;
        if (paywallActivityLauncher2 == null) {
            t.v("launcher");
        } else {
            paywallActivityLauncher = paywallActivityLauncher2;
        }
        paywallActivityLauncher.launchIfNeededWithOptions(customVariables.build());
    }

    public static final PaywallFragment newInstance(String str, String str2, Boolean bool, PaywallSource paywallSource, PaywallFontFamily paywallFontFamily, Map map) {
        return Companion.newInstance(str, str2, bool, paywallSource, paywallFontFamily, map);
    }

    private final void removeFragment() {
        PaywallFragmentNonSerializableArgsStore.INSTANCE.remove(getRequestKey());
        getParentFragmentManager().q().l(this).f();
    }

    private final void setFragmentResult(PaywallResult paywallResult) {
        setFragmentResult(PaywallResultExtensionsKt.getName(paywallResult));
    }

    public void onCreate(Bundle bundle) {
        I i;
        super.onCreate(bundle);
        if (!Purchases.Companion.isConfigured()) {
            Log.e("PaywallFragment", "Purchases is not configured. Make sure to call Purchases.configure() before launching the paywall. Dismissing.");
            removeFragment();
            return;
        }
        this.launcher = new PaywallActivityLauncher(this, this);
        String requiredEntitlementIdentifier = getRequiredEntitlementIdentifier();
        if (requiredEntitlementIdentifier != null) {
            launchPaywallIfNeeded(requiredEntitlementIdentifier);
            i = I.a;
        } else {
            i = null;
        }
        if (i == null) {
            launchPaywall();
        }
    }

    private final void setFragmentResult(String str) {
        String requestKey = getRequestKey();
        Bundle bundle = new Bundle();
        bundle.putString(ResultKey.PAYWALL_RESULT.getKey(), str);
        I i = I.a;
        B.a(this, requestKey, bundle);
    }

    public void onActivityResult(PaywallResult paywallResult) {
        t.g(paywallResult, "result");
        setFragmentResult(paywallResult);
        removeFragment();
    }
}

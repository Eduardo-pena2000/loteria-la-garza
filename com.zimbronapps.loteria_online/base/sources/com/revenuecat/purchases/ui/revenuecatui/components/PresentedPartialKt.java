package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.o;
import Da.S;
import Da.X;
import Da.Y;
import Da.w;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;
import tb.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PresentedPartialKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ComponentOverride.EqualityOperator.values().length];
            try {
                iArr[ComponentOverride.EqualityOperator.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComponentOverride.EqualityOperator.NOT_EQUALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ComponentOverride.ArrayOperator.values().length];
            try {
                iArr2[ComponentOverride.ArrayOperator.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ComponentOverride.ArrayOperator.NOT_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ScreenCondition.values().length];
            try {
                iArr3[ScreenCondition.COMPACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[ScreenCondition.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ScreenCondition.EXPANDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final /* synthetic */ PresentedPartial buildPresentedPartial(List list, ScreenCondition windowSize, OfferEligibility offerEligibility, ComponentViewState state, ConditionContext conditionContext) {
        t.g(list, "<this>");
        t.g(windowSize, "windowSize");
        t.g(offerEligibility, "offerEligibility");
        t.g(state, "state");
        t.g(conditionContext, "conditionContext");
        Iterator it = list.iterator();
        PresentedPartial presentedPartial = null;
        while (it.hasNext()) {
            PresentedOverride presentedOverride = (PresentedOverride) it.next();
            if (shouldApply(presentedOverride, windowSize, offerEligibility, state, conditionContext)) {
                presentedPartial = combineOrReplace(presentedPartial, presentedOverride.getProperties());
            }
        }
        return presentedPartial;
    }

    public static /* synthetic */ PresentedPartial buildPresentedPartial$default(List list, ScreenCondition screenCondition, OfferEligibility offerEligibility, ComponentViewState componentViewState, ConditionContext conditionContext, int i, Object obj) {
        if ((i & 8) != 0) {
            conditionContext = new ConditionContext(null, S.h());
        }
        return buildPresentedPartial(list, screenCondition, offerEligibility, componentViewState, conditionContext);
    }

    private static final PresentedPartial combineOrReplace(PresentedPartial presentedPartial, PresentedPartial presentedPartial2) {
        PresentedPartial combine;
        return (presentedPartial == null || (combine = presentedPartial.combine(presentedPartial2)) == null) ? presentedPartial2 : combine;
    }

    private static final boolean evaluate(ComponentOverride.Condition condition, ScreenCondition screenCondition, OfferEligibility offerEligibility, ComponentViewState componentViewState, ConditionContext conditionContext) {
        if (t.c(condition, ComponentOverride.Condition.Compact.INSTANCE) ? true : t.c(condition, ComponentOverride.Condition.Medium.INSTANCE) ? true : t.c(condition, ComponentOverride.Condition.Expanded.INSTANCE)) {
            return getApplicableConditions(screenCondition).contains(condition);
        }
        if (t.c(condition, ComponentOverride.Condition.MultiplePhaseOffers.INSTANCE)) {
            return offerEligibility.getHasMultipleDiscountedPhases();
        }
        if (t.c(condition, ComponentOverride.Condition.IntroOffer.INSTANCE)) {
            return offerEligibility.isIntroOffer();
        }
        if (condition instanceof ComponentOverride.Condition.IntroOfferRule) {
            return evaluate((ComponentOverride.Condition.IntroOfferRule) condition, offerEligibility);
        }
        if (t.c(condition, ComponentOverride.Condition.Selected.INSTANCE)) {
            if (componentViewState == ComponentViewState.SELECTED) {
                return true;
            }
        } else {
            if (t.c(condition, ComponentOverride.Condition.PromoOffer.INSTANCE)) {
                return offerEligibility.isPromoOffer();
            }
            if (condition instanceof ComponentOverride.Condition.PromoOfferRule) {
                return evaluate((ComponentOverride.Condition.PromoOfferRule) condition, offerEligibility);
            }
            if (condition instanceof ComponentOverride.Condition.SelectedPackage) {
                return evaluate((ComponentOverride.Condition.SelectedPackage) condition, conditionContext.getSelectedPackageId());
            }
            if (condition instanceof ComponentOverride.Condition.Variable) {
                return evaluate((ComponentOverride.Condition.Variable) condition, conditionContext.getCustomVariables());
            }
            if (!t.c(condition, ComponentOverride.Condition.Unsupported.INSTANCE)) {
                throw new o();
            }
        }
        return false;
    }

    private static final Set getApplicableConditions(ScreenCondition screenCondition) {
        int i = WhenMappings.$EnumSwitchMapping$2[screenCondition.ordinal()];
        if (i == 1) {
            return X.a(ComponentOverride.Condition.Compact.INSTANCE);
        }
        if (i == 2) {
            return Y.e(ComponentOverride.Condition.Compact.INSTANCE, ComponentOverride.Condition.Medium.INSTANCE);
        }
        if (i == 3) {
            return Y.e(ComponentOverride.Condition.Compact.INSTANCE, ComponentOverride.Condition.Medium.INSTANCE, ComponentOverride.Condition.Expanded.INSTANCE);
        }
        throw new o();
    }

    private static final boolean matchesValue(ComponentOverride.Condition.Variable variable, CustomVariableValue customVariableValue) {
        if (variable.getValue().b()) {
            if ((customVariableValue instanceof CustomVariableValue.String) && t.c(((CustomVariableValue.String) customVariableValue).getValue(), variable.getValue().a())) {
                return true;
            }
        } else if (j.e(variable.getValue()) != null) {
            if ((customVariableValue instanceof CustomVariableValue.Boolean) && t.c(Boolean.valueOf(((CustomVariableValue.Boolean) customVariableValue).getValue()), j.e(variable.getValue()))) {
                return true;
            }
        } else if (j.h(variable.getValue()) != null && (customVariableValue instanceof CustomVariableValue.Number) && t.a(((CustomVariableValue.Number) customVariableValue).getValue(), j.h(variable.getValue()))) {
            return true;
        }
        return false;
    }

    private static final boolean shouldApply(PresentedOverride presentedOverride, ScreenCondition screenCondition, OfferEligibility offerEligibility, ComponentViewState componentViewState, ConditionContext conditionContext) {
        List conditions = presentedOverride.getConditions();
        if (conditions != null && conditions.isEmpty()) {
            return true;
        }
        Iterator it = conditions.iterator();
        while (it.hasNext()) {
            if (!evaluate((ComponentOverride.Condition) it.next(), screenCondition, offerEligibility, componentViewState, conditionContext)) {
                return false;
            }
        }
        return true;
    }

    public static final /* synthetic */ Result toPresentedOverrides(List list, boolean z, l transform) {
        t.g(list, "<this>");
        t.g(transform, "transform");
        if (z) {
            List arrayList = new ArrayList();
            for (Object obj : list) {
                List<ComponentOverride.Condition> conditions = ((ComponentOverride) obj).getConditions();
                if (conditions == null || !conditions.isEmpty()) {
                    for (ComponentOverride.Condition condition : conditions) {
                        if (!condition.isRule() && !(condition instanceof ComponentOverride.Condition.Unsupported)) {
                        }
                    }
                }
                arrayList.add(obj);
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(w.y(list, 10));
        for (ComponentOverride componentOverride : list) {
            Result result = (Result) transform.invoke(componentOverride.getProperties());
            if (!(result instanceof Result.Success)) {
                if (result instanceof Result.Error) {
                    return new Result.Error(((NonEmptyList) ((Result.Error) result).getValue()).getHead());
                }
                throw new o();
            }
            arrayList2.add(new PresentedOverride(componentOverride.getConditions(), (PresentedPartial) ((Result.Success) result).getValue()));
        }
        return new Result.Success(arrayList2);
    }

    public static /* synthetic */ Result toPresentedOverrides$default(List list, boolean z, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toPresentedOverrides(list, z, lVar);
    }

    private static final boolean evaluate(ComponentOverride.Condition.IntroOfferRule introOfferRule, OfferEligibility offerEligibility) {
        boolean isIntroOffer = offerEligibility.isIntroOffer();
        int i = WhenMappings.$EnumSwitchMapping$0[introOfferRule.getOperator().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new o();
            }
            if (isIntroOffer == introOfferRule.getValue()) {
                return false;
            }
        } else if (isIntroOffer != introOfferRule.getValue()) {
            return false;
        }
        return true;
    }

    private static final boolean evaluate(ComponentOverride.Condition.PromoOfferRule promoOfferRule, OfferEligibility offerEligibility) {
        boolean isPromoOffer = offerEligibility.isPromoOffer();
        int i = WhenMappings.$EnumSwitchMapping$0[promoOfferRule.getOperator().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new o();
            }
            if (isPromoOffer == promoOfferRule.getValue()) {
                return false;
            }
        } else if (isPromoOffer != promoOfferRule.getValue()) {
            return false;
        }
        return true;
    }

    private static final boolean evaluate(ComponentOverride.Condition.SelectedPackage selectedPackage, String str) {
        if (str == null) {
            return false;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[selectedPackage.getOperator().ordinal()];
        if (i == 1) {
            return selectedPackage.getPackages().contains(str);
        }
        if (i == 2) {
            return !selectedPackage.getPackages().contains(str);
        }
        throw new o();
    }

    private static final boolean evaluate(ComponentOverride.Condition.Variable variable, Map map) {
        CustomVariableValue customVariableValue = (CustomVariableValue) map.get(variable.getVariable());
        if (customVariableValue == null) {
            return variable.getOperator() == ComponentOverride.EqualityOperator.NOT_EQUALS;
        }
        boolean matchesValue = matchesValue(variable, customVariableValue);
        int i = WhenMappings.$EnumSwitchMapping$0[variable.getOperator().ordinal()];
        if (i == 1) {
            return matchesValue;
        }
        if (i == 2) {
            return !matchesValue;
        }
        throw new o();
    }
}

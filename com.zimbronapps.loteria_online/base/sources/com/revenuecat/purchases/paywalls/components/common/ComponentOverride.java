package com.revenuecat.purchases.paywalls.components.common;

import Ca.l;
import Ca.m;
import Ca.n;
import Qa.a;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.PartialComponent;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;
import qb.e;
import rb.d;
import sb.A;
import sb.c0;
import sb.f0;
import sb.k0;
import sb.t0;
import sb.x0;
import tb.E;
import tb.F;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ComponentOverride {
    private static final e $cachedDescriptor;
    private final List conditions;
    private final PartialComponent properties;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {new sb.e(ConditionSerializer.INSTANCE), null};

    public enum ArrayOperator {
        IN,
        NOT_IN;

        public static final Companion Companion = new Companion(null);
        private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

        public static final class Companion {

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return A.a("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.ArrayOperator", ArrayOperator.values(), new String[]{"in", "not in"}, new Annotation[][]{null, null}, (Annotation[]) null);
                }
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) ArrayOperator.access$get$cachedSerializer$delegate$cp().getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        public static final /* synthetic */ l access$get$cachedSerializer$delegate$cp() {
            return $cachedSerializer$delegate;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer(b bVar) {
            t.g(bVar, "typeSerial0");
            return new ComponentOverride$$serializer(bVar);
        }

        private Companion() {
        }
    }

    public interface Condition {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Compact implements Condition {
            public static final Compact INSTANCE = new Compact();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Compact", Compact.INSTANCE, new Annotation[0]);
                }
            }

            private Compact() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final b serializer() {
                return ConditionSerializer.INSTANCE;
            }
        }

        public static final class DefaultImpls {
            @Deprecated
            public static boolean isRule(Condition condition) {
                return Condition.access$isRule$jd(condition);
            }

            @InternalRevenueCatAPI
            public static /* synthetic */ void isRule$annotations() {
            }
        }

        public static final class Expanded implements Condition {
            public static final Expanded INSTANCE = new Expanded();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Expanded", Expanded.INSTANCE, new Annotation[0]);
                }
            }

            private Expanded() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class IntroOffer implements Condition {
            public static final IntroOffer INSTANCE = new IntroOffer();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.IntroOffer", IntroOffer.INSTANCE, new Annotation[0]);
                }
            }

            private IntroOffer() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class IntroOfferRule implements Condition {
            private final EqualityOperator operator;
            private final boolean value;
            public static final Companion Companion = new Companion(null);
            private static final b[] $childSerializers = {EqualityOperator.Companion.serializer(), null};

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return ComponentOverride$Condition$IntroOfferRule$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @Ca.e
            public /* synthetic */ IntroOfferRule(int i, EqualityOperator equalityOperator, boolean z, t0 t0Var) {
                if (3 != (i & 3)) {
                    f0.a(i, 3, ComponentOverride$Condition$IntroOfferRule$$serializer.INSTANCE.getDescriptor());
                }
                this.operator = equalityOperator;
                this.value = z;
            }

            public static final /* synthetic */ b[] access$get$childSerializers$cp() {
                return $childSerializers;
            }

            public static /* synthetic */ IntroOfferRule copy$default(IntroOfferRule introOfferRule, EqualityOperator equalityOperator, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    equalityOperator = introOfferRule.operator;
                }
                if ((i & 2) != 0) {
                    z = introOfferRule.value;
                }
                return introOfferRule.copy(equalityOperator, z);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(IntroOfferRule introOfferRule, d dVar, e eVar) {
                dVar.k(eVar, 0, $childSerializers[0], introOfferRule.operator);
                dVar.B(eVar, 1, introOfferRule.value);
            }

            public final EqualityOperator component1() {
                return this.operator;
            }

            public final boolean component2() {
                return this.value;
            }

            public final IntroOfferRule copy(EqualityOperator equalityOperator, boolean z) {
                t.g(equalityOperator, "operator");
                return new IntroOfferRule(equalityOperator, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IntroOfferRule)) {
                    return false;
                }
                IntroOfferRule introOfferRule = (IntroOfferRule) obj;
                return this.operator == introOfferRule.operator && this.value == introOfferRule.value;
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final boolean getValue() {
                return this.value;
            }

            public int hashCode() {
                return (this.operator.hashCode() * 31) + Boolean.hashCode(this.value);
            }

            public boolean isRule() {
                return true;
            }

            public String toString() {
                return "IntroOfferRule(operator=" + this.operator + ", value=" + this.value + ')';
            }

            public IntroOfferRule(EqualityOperator equalityOperator, boolean z) {
                t.g(equalityOperator, "operator");
                this.operator = equalityOperator;
                this.value = z;
            }
        }

        public static final class Medium implements Condition {
            public static final Medium INSTANCE = new Medium();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Medium", Medium.INSTANCE, new Annotation[0]);
                }
            }

            private Medium() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class MultiplePhaseOffers implements Condition {
            public static final MultiplePhaseOffers INSTANCE = new MultiplePhaseOffers();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.MultiplePhaseOffers", MultiplePhaseOffers.INSTANCE, new Annotation[0]);
                }
            }

            private MultiplePhaseOffers() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class PromoOffer implements Condition {
            public static final PromoOffer INSTANCE = new PromoOffer();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.PromoOffer", PromoOffer.INSTANCE, new Annotation[0]);
                }
            }

            private PromoOffer() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class PromoOfferRule implements Condition {
            private final EqualityOperator operator;
            private final boolean value;
            public static final Companion Companion = new Companion(null);
            private static final b[] $childSerializers = {EqualityOperator.Companion.serializer(), null};

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return ComponentOverride$Condition$PromoOfferRule$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @Ca.e
            public /* synthetic */ PromoOfferRule(int i, EqualityOperator equalityOperator, boolean z, t0 t0Var) {
                if (3 != (i & 3)) {
                    f0.a(i, 3, ComponentOverride$Condition$PromoOfferRule$$serializer.INSTANCE.getDescriptor());
                }
                this.operator = equalityOperator;
                this.value = z;
            }

            public static final /* synthetic */ b[] access$get$childSerializers$cp() {
                return $childSerializers;
            }

            public static /* synthetic */ PromoOfferRule copy$default(PromoOfferRule promoOfferRule, EqualityOperator equalityOperator, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    equalityOperator = promoOfferRule.operator;
                }
                if ((i & 2) != 0) {
                    z = promoOfferRule.value;
                }
                return promoOfferRule.copy(equalityOperator, z);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PromoOfferRule promoOfferRule, d dVar, e eVar) {
                dVar.k(eVar, 0, $childSerializers[0], promoOfferRule.operator);
                dVar.B(eVar, 1, promoOfferRule.value);
            }

            public final EqualityOperator component1() {
                return this.operator;
            }

            public final boolean component2() {
                return this.value;
            }

            public final PromoOfferRule copy(EqualityOperator equalityOperator, boolean z) {
                t.g(equalityOperator, "operator");
                return new PromoOfferRule(equalityOperator, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PromoOfferRule)) {
                    return false;
                }
                PromoOfferRule promoOfferRule = (PromoOfferRule) obj;
                return this.operator == promoOfferRule.operator && this.value == promoOfferRule.value;
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final boolean getValue() {
                return this.value;
            }

            public int hashCode() {
                return (this.operator.hashCode() * 31) + Boolean.hashCode(this.value);
            }

            public boolean isRule() {
                return true;
            }

            public String toString() {
                return "PromoOfferRule(operator=" + this.operator + ", value=" + this.value + ')';
            }

            public PromoOfferRule(EqualityOperator equalityOperator, boolean z) {
                t.g(equalityOperator, "operator");
                this.operator = equalityOperator;
                this.value = z;
            }
        }

        public static final class Selected implements Condition {
            public static final Selected INSTANCE = new Selected();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Selected", Selected.INSTANCE, new Annotation[0]);
                }
            }

            private Selected() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class SelectedPackage implements Condition {
            private final ArrayOperator operator;
            private final List packages;
            public static final Companion Companion = new Companion(null);
            private static final b[] $childSerializers = {ArrayOperator.Companion.serializer(), new sb.e(x0.a)};

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return ComponentOverride$Condition$SelectedPackage$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @Ca.e
            public /* synthetic */ SelectedPackage(int i, ArrayOperator arrayOperator, List list, t0 t0Var) {
                if (3 != (i & 3)) {
                    f0.a(i, 3, ComponentOverride$Condition$SelectedPackage$$serializer.INSTANCE.getDescriptor());
                }
                this.operator = arrayOperator;
                this.packages = list;
            }

            public static final /* synthetic */ b[] access$get$childSerializers$cp() {
                return $childSerializers;
            }

            public static /* synthetic */ SelectedPackage copy$default(SelectedPackage selectedPackage, ArrayOperator arrayOperator, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    arrayOperator = selectedPackage.operator;
                }
                if ((i & 2) != 0) {
                    list = selectedPackage.packages;
                }
                return selectedPackage.copy(arrayOperator, list);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(SelectedPackage selectedPackage, d dVar, e eVar) {
                ob.k[] kVarArr = $childSerializers;
                dVar.k(eVar, 0, kVarArr[0], selectedPackage.operator);
                dVar.k(eVar, 1, kVarArr[1], selectedPackage.packages);
            }

            public final ArrayOperator component1() {
                return this.operator;
            }

            public final List component2() {
                return this.packages;
            }

            public final SelectedPackage copy(ArrayOperator arrayOperator, List list) {
                t.g(arrayOperator, "operator");
                t.g(list, "packages");
                return new SelectedPackage(arrayOperator, list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SelectedPackage)) {
                    return false;
                }
                SelectedPackage selectedPackage = (SelectedPackage) obj;
                return this.operator == selectedPackage.operator && t.c(this.packages, selectedPackage.packages);
            }

            public final ArrayOperator getOperator() {
                return this.operator;
            }

            public final List getPackages() {
                return this.packages;
            }

            public int hashCode() {
                return (this.operator.hashCode() * 31) + this.packages.hashCode();
            }

            public boolean isRule() {
                return true;
            }

            public String toString() {
                return "SelectedPackage(operator=" + this.operator + ", packages=" + this.packages + ')';
            }

            public SelectedPackage(ArrayOperator arrayOperator, List list) {
                t.g(arrayOperator, "operator");
                t.g(list, "packages");
                this.operator = arrayOperator;
                this.packages = list;
            }
        }

        public static final class Unsupported implements Condition {
            public static final Unsupported INSTANCE = new Unsupported();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.Condition.Unsupported", Unsupported.INSTANCE, new Annotation[0]);
                }
            }

            private Unsupported() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class Variable implements Condition {
            private final EqualityOperator operator;
            private final E value;
            private final String variable;
            public static final Companion Companion = new Companion(null);
            private static final b[] $childSerializers = {EqualityOperator.Companion.serializer(), null, null};

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return ComponentOverride$Condition$Variable$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @Ca.e
            public /* synthetic */ Variable(int i, EqualityOperator equalityOperator, String str, E e, t0 t0Var) {
                if (7 != (i & 7)) {
                    f0.a(i, 7, ComponentOverride$Condition$Variable$$serializer.INSTANCE.getDescriptor());
                }
                this.operator = equalityOperator;
                this.variable = str;
                this.value = e;
            }

            public static final /* synthetic */ b[] access$get$childSerializers$cp() {
                return $childSerializers;
            }

            public static /* synthetic */ Variable copy$default(Variable variable, EqualityOperator equalityOperator, String str, E e, int i, Object obj) {
                if ((i & 1) != 0) {
                    equalityOperator = variable.operator;
                }
                if ((i & 2) != 0) {
                    str = variable.variable;
                }
                if ((i & 4) != 0) {
                    e = variable.value;
                }
                return variable.copy(equalityOperator, str, e);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Variable variable, d dVar, e eVar) {
                dVar.k(eVar, 0, $childSerializers[0], variable.operator);
                dVar.v(eVar, 1, variable.variable);
                dVar.k(eVar, 2, F.a, variable.value);
            }

            public final EqualityOperator component1() {
                return this.operator;
            }

            public final String component2() {
                return this.variable;
            }

            public final E component3() {
                return this.value;
            }

            public final Variable copy(EqualityOperator equalityOperator, String str, E e) {
                t.g(equalityOperator, "operator");
                t.g(str, "variable");
                t.g(e, "value");
                return new Variable(equalityOperator, str, e);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Variable)) {
                    return false;
                }
                Variable variable = (Variable) obj;
                return this.operator == variable.operator && t.c(this.variable, variable.variable) && t.c(this.value, variable.value);
            }

            public final EqualityOperator getOperator() {
                return this.operator;
            }

            public final E getValue() {
                return this.value;
            }

            public final String getVariable() {
                return this.variable;
            }

            public int hashCode() {
                return (((this.operator.hashCode() * 31) + this.variable.hashCode()) * 31) + this.value.hashCode();
            }

            public boolean isRule() {
                return true;
            }

            public String toString() {
                return "Variable(operator=" + this.operator + ", variable=" + this.variable + ", value=" + this.value + ')';
            }

            public Variable(EqualityOperator equalityOperator, String str, E e) {
                t.g(equalityOperator, "operator");
                t.g(str, "variable");
                t.g(e, "value");
                this.operator = equalityOperator;
                this.variable = str;
                this.value = e;
            }
        }

        static /* synthetic */ boolean access$isRule$jd(Condition condition) {
            return super.isRule();
        }

        default boolean isRule() {
            return false;
        }
    }

    public enum EqualityOperator {
        EQUALS,
        NOT_EQUALS;

        public static final Companion Companion = new Companion(null);
        private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

        public static final class Companion {

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return A.a("com.revenuecat.purchases.paywalls.components.common.ComponentOverride.EqualityOperator", EqualityOperator.values(), new String[]{"=", "!="}, new Annotation[][]{null, null}, (Annotation[]) null);
                }
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) EqualityOperator.access$get$cachedSerializer$delegate$cp().getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        public static final /* synthetic */ l access$get$cachedSerializer$delegate$cp() {
            return $cachedSerializer$delegate;
        }
    }

    static {
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride", (sb.E) null, 2);
        k0Var.o("conditions", false);
        k0Var.o("properties", false);
        $cachedDescriptor = k0Var;
    }

    @Ca.e
    public /* synthetic */ ComponentOverride(int i, List list, PartialComponent partialComponent, t0 t0Var) {
        if (3 != (i & 3)) {
            f0.a(i, 3, $cachedDescriptor);
        }
        this.conditions = list;
        this.properties = partialComponent;
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ComponentOverride componentOverride, d dVar, e eVar, b bVar) {
        dVar.k(eVar, 0, $childSerializers[0], componentOverride.conditions);
        dVar.k(eVar, 1, bVar, componentOverride.properties);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentOverride)) {
            return false;
        }
        ComponentOverride componentOverride = (ComponentOverride) obj;
        return t.c(this.conditions, componentOverride.conditions) && t.c(this.properties, componentOverride.properties);
    }

    public final /* synthetic */ List getConditions() {
        return this.conditions;
    }

    public final /* synthetic */ PartialComponent getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return (this.conditions.hashCode() * 31) + this.properties.hashCode();
    }

    public String toString() {
        return "ComponentOverride(conditions=" + this.conditions + ", properties=" + this.properties + ')';
    }

    public ComponentOverride(List list, PartialComponent partialComponent) {
        t.g(list, "conditions");
        t.g(partialComponent, "properties");
        this.conditions = list;
        this.properties = partialComponent;
    }
}

package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import Ca.l;
import Ca.m;
import Ca.n;
import Qa.a;
import Xa.c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;
import ob.h;
import rb.d;
import sb.c0;
import sb.f0;
import sb.t0;
import sb.x0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ButtonComponent implements PaywallComponent {
    public static final Companion Companion = new Companion(null);
    private final Action action;
    private final StackComponent stack;
    private final PaywallTransition transition;

    @InternalRevenueCatAPI
    public interface Action {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final b serializer() {
                return ActionSerializer.INSTANCE;
            }
        }

        public static final class NavigateBack implements Action {
            public static final NavigateBack INSTANCE = new NavigateBack();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.NavigateBack", NavigateBack.INSTANCE, new Annotation[0]);
                }
            }

            private NavigateBack() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class NavigateTo implements Action {
            private final Destination destination;
            public static final Companion Companion = new Companion(null);
            private static final b[] $childSerializers = {new h("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination", P.b(Destination.class), new c[]{P.b(Destination.CustomerCenter.class), P.b(Destination.PrivacyPolicy.class), P.b(Destination.Sheet.class), P.b(Destination.Terms.class), P.b(Destination.Unknown.class), P.b(Destination.Url.class)}, new b[]{new c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter", Destination.CustomerCenter.INSTANCE, new Annotation[0]), ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE, ButtonComponent$Destination$Sheet$$serializer.INSTANCE, ButtonComponent$Destination$Terms$$serializer.INSTANCE, new c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Unknown", Destination.Unknown.INSTANCE, new Annotation[0]), ButtonComponent$Destination$Url$$serializer.INSTANCE}, new Annotation[0])};

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return ButtonComponent$Action$NavigateTo$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @e
            public /* synthetic */ NavigateTo(int i, Destination destination, t0 t0Var) {
                if (1 != (i & 1)) {
                    f0.a(i, 1, ButtonComponent$Action$NavigateTo$$serializer.INSTANCE.getDescriptor());
                }
                this.destination = destination;
            }

            public static final /* synthetic */ b[] access$get$childSerializers$cp() {
                return $childSerializers;
            }

            public static /* synthetic */ NavigateTo copy$default(NavigateTo navigateTo, Destination destination, int i, Object obj) {
                if ((i & 1) != 0) {
                    destination = navigateTo.destination;
                }
                return navigateTo.copy(destination);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(NavigateTo navigateTo, d dVar, qb.e eVar) {
                dVar.k(eVar, 0, $childSerializers[0], navigateTo.destination);
            }

            public final Destination component1() {
                return this.destination;
            }

            public final NavigateTo copy(Destination destination) {
                t.g(destination, "destination");
                return new NavigateTo(destination);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateTo) && t.c(this.destination, ((NavigateTo) obj).destination);
            }

            public final /* synthetic */ Destination getDestination() {
                return this.destination;
            }

            public int hashCode() {
                return this.destination.hashCode();
            }

            public String toString() {
                return "NavigateTo(destination=" + this.destination + ')';
            }

            public NavigateTo(Destination destination) {
                t.g(destination, "destination");
                this.destination = destination;
            }
        }

        public static final class RestorePurchases implements Action {
            public static final RestorePurchases INSTANCE = new RestorePurchases();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.RestorePurchases", RestorePurchases.INSTANCE, new Annotation[0]);
                }
            }

            private RestorePurchases() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class Unknown implements Action {
            public static final Unknown INSTANCE = new Unknown();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.Unknown", Unknown.INSTANCE, new Annotation[0]);
                }
            }

            private Unknown() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return ButtonComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InternalRevenueCatAPI
    public interface Destination {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final b serializer() {
                return new h("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination", P.b(Destination.class), new c[]{P.b(CustomerCenter.class), P.b(PrivacyPolicy.class), P.b(Sheet.class), P.b(Terms.class), P.b(Unknown.class), P.b(Url.class)}, new b[]{new c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter", CustomerCenter.INSTANCE, new Annotation[0]), ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE, ButtonComponent$Destination$Sheet$$serializer.INSTANCE, ButtonComponent$Destination$Terms$$serializer.INSTANCE, new c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Unknown", Unknown.INSTANCE, new Annotation[0]), ButtonComponent$Destination$Url$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        public static final class CustomerCenter implements Destination {
            public static final CustomerCenter INSTANCE = new CustomerCenter();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter", CustomerCenter.INSTANCE, new Annotation[0]);
                }
            }

            private CustomerCenter() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class PrivacyPolicy implements Destination {
            public static final Companion Companion = new Companion(null);
            private final UrlMethod method;
            private final String urlLid;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @e
            public /* synthetic */ PrivacyPolicy(int i, String str, UrlMethod urlMethod, t0 t0Var, k kVar) {
                this(i, str, urlMethod, t0Var);
            }

            public static /* synthetic */ PrivacyPolicy copy-26kQY28$default(PrivacyPolicy privacyPolicy, String str, UrlMethod urlMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = privacyPolicy.urlLid;
                }
                if ((i & 2) != 0) {
                    urlMethod = privacyPolicy.method;
                }
                return privacyPolicy.copy-26kQY28(str, urlMethod);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PrivacyPolicy privacyPolicy, d dVar, qb.e eVar) {
                dVar.k(eVar, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.box-impl(privacyPolicy.urlLid));
                dVar.k(eVar, 1, UrlMethodDeserializer.INSTANCE, privacyPolicy.method);
            }

            public final String component1-z7Tp-4o() {
                return this.urlLid;
            }

            public final UrlMethod component2() {
                return this.method;
            }

            public final PrivacyPolicy copy-26kQY28(String str, UrlMethod urlMethod) {
                t.g(str, "urlLid");
                t.g(urlMethod, "method");
                return new PrivacyPolicy(str, urlMethod, null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PrivacyPolicy)) {
                    return false;
                }
                PrivacyPolicy privacyPolicy = (PrivacyPolicy) obj;
                return LocalizationKey.equals-impl0(this.urlLid, privacyPolicy.urlLid) && this.method == privacyPolicy.method;
            }

            public final /* synthetic */ UrlMethod getMethod() {
                return this.method;
            }

            public final /* synthetic */ String getUrlLid-z7Tp-4o() {
                return this.urlLid;
            }

            public int hashCode() {
                return (LocalizationKey.hashCode-impl(this.urlLid) * 31) + this.method.hashCode();
            }

            public String toString() {
                return "PrivacyPolicy(urlLid=" + LocalizationKey.toString-impl(this.urlLid) + ", method=" + this.method + ')';
            }

            public /* synthetic */ PrivacyPolicy(String str, UrlMethod urlMethod, k kVar) {
                this(str, urlMethod);
            }

            private PrivacyPolicy(int i, String str, UrlMethod urlMethod, t0 t0Var) {
                if (3 != (i & 3)) {
                    f0.a(i, 3, ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE.getDescriptor());
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            private PrivacyPolicy(String str, UrlMethod urlMethod) {
                t.g(str, "urlLid");
                t.g(urlMethod, "method");
                this.urlLid = str;
                this.method = urlMethod;
            }
        }

        public static final class Sheet implements Destination {
            public static final Companion Companion = new Companion(null);
            private final boolean backgroundBlur;
            private final String id;
            private final String name;
            private final Size size;
            private final StackComponent stack;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return ButtonComponent$Destination$Sheet$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @e
            public /* synthetic */ Sheet(int i, String str, String str2, StackComponent stackComponent, boolean z, Size size, t0 t0Var) {
                if (31 != (i & 31)) {
                    f0.a(i, 31, ButtonComponent$Destination$Sheet$$serializer.INSTANCE.getDescriptor());
                }
                this.id = str;
                this.name = str2;
                this.stack = stackComponent;
                this.backgroundBlur = z;
                this.size = size;
            }

            public static /* synthetic */ Sheet copy$default(Sheet sheet, String str, String str2, StackComponent stackComponent, boolean z, Size size, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sheet.id;
                }
                if ((i & 2) != 0) {
                    str2 = sheet.name;
                }
                String str3 = str2;
                if ((i & 4) != 0) {
                    stackComponent = sheet.stack;
                }
                StackComponent stackComponent2 = stackComponent;
                if ((i & 8) != 0) {
                    z = sheet.backgroundBlur;
                }
                boolean z2 = z;
                if ((i & 16) != 0) {
                    size = sheet.size;
                }
                return sheet.copy(str, str3, stackComponent2, z2, size);
            }

            public static /* synthetic */ void getBackgroundBlur$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Sheet sheet, d dVar, qb.e eVar) {
                dVar.v(eVar, 0, sheet.id);
                dVar.j(eVar, 1, x0.a, sheet.name);
                dVar.k(eVar, 2, StackComponent$$serializer.INSTANCE, sheet.stack);
                dVar.B(eVar, 3, sheet.backgroundBlur);
                dVar.j(eVar, 4, Size$$serializer.INSTANCE, sheet.size);
            }

            public final String component1() {
                return this.id;
            }

            public final String component2() {
                return this.name;
            }

            public final StackComponent component3() {
                return this.stack;
            }

            public final boolean component4() {
                return this.backgroundBlur;
            }

            public final Size component5() {
                return this.size;
            }

            public final Sheet copy(String str, String str2, StackComponent stackComponent, boolean z, Size size) {
                t.g(str, "id");
                t.g(stackComponent, "stack");
                return new Sheet(str, str2, stackComponent, z, size);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Sheet)) {
                    return false;
                }
                Sheet sheet = (Sheet) obj;
                return t.c(this.id, sheet.id) && t.c(this.name, sheet.name) && t.c(this.stack, sheet.stack) && this.backgroundBlur == sheet.backgroundBlur && t.c(this.size, sheet.size);
            }

            public final /* synthetic */ boolean getBackgroundBlur() {
                return this.backgroundBlur;
            }

            public final /* synthetic */ String getId() {
                return this.id;
            }

            public final /* synthetic */ String getName() {
                return this.name;
            }

            public final /* synthetic */ Size getSize() {
                return this.size;
            }

            public final /* synthetic */ StackComponent getStack() {
                return this.stack;
            }

            public int hashCode() {
                int hashCode = this.id.hashCode() * 31;
                String str = this.name;
                int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.stack.hashCode()) * 31) + Boolean.hashCode(this.backgroundBlur)) * 31;
                Size size = this.size;
                return hashCode2 + (size != null ? size.hashCode() : 0);
            }

            public String toString() {
                return "Sheet(id=" + this.id + ", name=" + this.name + ", stack=" + this.stack + ", backgroundBlur=" + this.backgroundBlur + ", size=" + this.size + ')';
            }

            public Sheet(String str, String str2, StackComponent stackComponent, boolean z, Size size) {
                t.g(str, "id");
                t.g(stackComponent, "stack");
                this.id = str;
                this.name = str2;
                this.stack = stackComponent;
                this.backgroundBlur = z;
                this.size = size;
            }
        }

        public static final class Terms implements Destination {
            public static final Companion Companion = new Companion(null);
            private final UrlMethod method;
            private final String urlLid;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return ButtonComponent$Destination$Terms$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @e
            public /* synthetic */ Terms(int i, String str, UrlMethod urlMethod, t0 t0Var, k kVar) {
                this(i, str, urlMethod, t0Var);
            }

            public static /* synthetic */ Terms copy-26kQY28$default(Terms terms, String str, UrlMethod urlMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = terms.urlLid;
                }
                if ((i & 2) != 0) {
                    urlMethod = terms.method;
                }
                return terms.copy-26kQY28(str, urlMethod);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Terms terms, d dVar, qb.e eVar) {
                dVar.k(eVar, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.box-impl(terms.urlLid));
                dVar.k(eVar, 1, UrlMethodDeserializer.INSTANCE, terms.method);
            }

            public final String component1-z7Tp-4o() {
                return this.urlLid;
            }

            public final UrlMethod component2() {
                return this.method;
            }

            public final Terms copy-26kQY28(String str, UrlMethod urlMethod) {
                t.g(str, "urlLid");
                t.g(urlMethod, "method");
                return new Terms(str, urlMethod, null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Terms)) {
                    return false;
                }
                Terms terms = (Terms) obj;
                return LocalizationKey.equals-impl0(this.urlLid, terms.urlLid) && this.method == terms.method;
            }

            public final /* synthetic */ UrlMethod getMethod() {
                return this.method;
            }

            public final /* synthetic */ String getUrlLid-z7Tp-4o() {
                return this.urlLid;
            }

            public int hashCode() {
                return (LocalizationKey.hashCode-impl(this.urlLid) * 31) + this.method.hashCode();
            }

            public String toString() {
                return "Terms(urlLid=" + LocalizationKey.toString-impl(this.urlLid) + ", method=" + this.method + ')';
            }

            public /* synthetic */ Terms(String str, UrlMethod urlMethod, k kVar) {
                this(str, urlMethod);
            }

            private Terms(int i, String str, UrlMethod urlMethod, t0 t0Var) {
                if (3 != (i & 3)) {
                    f0.a(i, 3, ButtonComponent$Destination$Terms$$serializer.INSTANCE.getDescriptor());
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            private Terms(String str, UrlMethod urlMethod) {
                t.g(str, "urlLid");
                t.g(urlMethod, "method");
                this.urlLid = str;
                this.method = urlMethod;
            }
        }

        public static final class Unknown implements Destination {
            public static final Unknown INSTANCE = new Unknown();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Unknown", Unknown.INSTANCE, new Annotation[0]);
                }
            }

            private Unknown() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class Url implements Destination {
            public static final Companion Companion = new Companion(null);
            private final UrlMethod method;
            private final String urlLid;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return ButtonComponent$Destination$Url$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @e
            public /* synthetic */ Url(int i, String str, UrlMethod urlMethod, t0 t0Var, k kVar) {
                this(i, str, urlMethod, t0Var);
            }

            public static /* synthetic */ Url copy-26kQY28$default(Url url, String str, UrlMethod urlMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = url.urlLid;
                }
                if ((i & 2) != 0) {
                    urlMethod = url.method;
                }
                return url.copy-26kQY28(str, urlMethod);
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Url url, d dVar, qb.e eVar) {
                dVar.k(eVar, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.box-impl(url.urlLid));
                dVar.k(eVar, 1, UrlMethodDeserializer.INSTANCE, url.method);
            }

            public final String component1-z7Tp-4o() {
                return this.urlLid;
            }

            public final UrlMethod component2() {
                return this.method;
            }

            public final Url copy-26kQY28(String str, UrlMethod urlMethod) {
                t.g(str, "urlLid");
                t.g(urlMethod, "method");
                return new Url(str, urlMethod, null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Url)) {
                    return false;
                }
                Url url = (Url) obj;
                return LocalizationKey.equals-impl0(this.urlLid, url.urlLid) && this.method == url.method;
            }

            public final /* synthetic */ UrlMethod getMethod() {
                return this.method;
            }

            public final /* synthetic */ String getUrlLid-z7Tp-4o() {
                return this.urlLid;
            }

            public int hashCode() {
                return (LocalizationKey.hashCode-impl(this.urlLid) * 31) + this.method.hashCode();
            }

            public String toString() {
                return "Url(urlLid=" + LocalizationKey.toString-impl(this.urlLid) + ", method=" + this.method + ')';
            }

            public /* synthetic */ Url(String str, UrlMethod urlMethod, k kVar) {
                this(str, urlMethod);
            }

            private Url(int i, String str, UrlMethod urlMethod, t0 t0Var) {
                if (3 != (i & 3)) {
                    f0.a(i, 3, ButtonComponent$Destination$Url$$serializer.INSTANCE.getDescriptor());
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            private Url(String str, UrlMethod urlMethod) {
                t.g(str, "urlLid");
                t.g(urlMethod, "method");
                this.urlLid = str;
                this.method = urlMethod;
            }
        }
    }

    @InternalRevenueCatAPI
    public enum UrlMethod {
        IN_APP_BROWSER,
        EXTERNAL_BROWSER,
        DEEP_LINK,
        UNKNOWN;

        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return UrlMethodDeserializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    @e
    public /* synthetic */ ButtonComponent(int i, Action action, StackComponent stackComponent, PaywallTransition paywallTransition, t0 t0Var) {
        if (3 != (i & 3)) {
            f0.a(i, 3, ButtonComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.action = action;
        this.stack = stackComponent;
        if ((i & 4) == 0) {
            this.transition = null;
        } else {
            this.transition = paywallTransition;
        }
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ButtonComponent buttonComponent, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, ActionSerializer.INSTANCE, buttonComponent.action);
        dVar.k(eVar, 1, StackComponent$$serializer.INSTANCE, buttonComponent.stack);
        if (!dVar.e(eVar, 2) && buttonComponent.transition == null) {
            return;
        }
        dVar.j(eVar, 2, PaywallTransition$$serializer.INSTANCE, buttonComponent.transition);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonComponent)) {
            return false;
        }
        ButtonComponent buttonComponent = (ButtonComponent) obj;
        return t.c(this.action, buttonComponent.action) && t.c(this.stack, buttonComponent.stack) && t.c(this.transition, buttonComponent.transition);
    }

    public final /* synthetic */ Action getAction() {
        return this.action;
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public final /* synthetic */ PaywallTransition getTransition() {
        return this.transition;
    }

    public int hashCode() {
        int hashCode = ((this.action.hashCode() * 31) + this.stack.hashCode()) * 31;
        PaywallTransition paywallTransition = this.transition;
        return hashCode + (paywallTransition == null ? 0 : paywallTransition.hashCode());
    }

    public String toString() {
        return "ButtonComponent(action=" + this.action + ", stack=" + this.stack + ", transition=" + this.transition + ')';
    }

    public ButtonComponent(Action action, StackComponent stackComponent, PaywallTransition paywallTransition) {
        t.g(action, "action");
        t.g(stackComponent, "stack");
        this.action = action;
        this.stack = stackComponent;
        this.transition = paywallTransition;
    }

    public /* synthetic */ ButtonComponent(Action action, StackComponent stackComponent, PaywallTransition paywallTransition, int i, k kVar) {
        this(action, stackComponent, (i & 4) != 0 ? null : paywallTransition);
    }
}

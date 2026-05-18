package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import Ca.l;
import Ca.m;
import Ca.n;
import Ca.o;
import Qa.a;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;
import rb.d;
import sb.c0;
import sb.f0;
import sb.h;
import sb.t0;
import sb.x0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseButtonComponent implements PaywallComponent {
    public static final Companion Companion = new Companion(null);
    private final Action action;
    private final Method method;
    private final StackComponent stack;

    public enum Action {
        IN_APP_CHECKOUT,
        WEB_CHECKOUT,
        WEB_PRODUCT_SELECTION;

        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return ActionDeserializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Action.values().length];
                try {
                    iArr[Action.IN_APP_CHECKOUT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Action.WEB_CHECKOUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Action.WEB_PRODUCT_SELECTION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final Method toMethod() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return Method.InAppCheckout.INSTANCE;
            }
            if (i == 2) {
                return new Method.WebCheckout((Boolean) null, (ButtonComponent.UrlMethod) null, 3, (k) null);
            }
            if (i == 3) {
                return new Method.WebProductSelection((Boolean) null, (ButtonComponent.UrlMethod) null, 3, (k) null);
            }
            throw new o();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PurchaseButtonComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class CustomUrl {
        public static final Companion Companion = new Companion(null);
        private final String packageParam;
        private final String urlLid;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ CustomUrl(int i, String str, String str2, t0 t0Var, k kVar) {
            this(i, str, str2, t0Var);
        }

        public static /* synthetic */ CustomUrl copy-26kQY28$default(CustomUrl customUrl, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customUrl.urlLid;
            }
            if ((i & 2) != 0) {
                str2 = customUrl.packageParam;
            }
            return customUrl.copy-26kQY28(str, str2);
        }

        public static /* synthetic */ void getPackageParam$annotations() {
        }

        public static /* synthetic */ void getUrlLid-z7Tp-4o$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CustomUrl customUrl, d dVar, qb.e eVar) {
            dVar.k(eVar, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.box-impl(customUrl.urlLid));
            if (!dVar.e(eVar, 1) && customUrl.packageParam == null) {
                return;
            }
            dVar.j(eVar, 1, x0.a, customUrl.packageParam);
        }

        public final String component1-z7Tp-4o() {
            return this.urlLid;
        }

        public final String component2() {
            return this.packageParam;
        }

        public final CustomUrl copy-26kQY28(String str, String str2) {
            t.g(str, "urlLid");
            return new CustomUrl(str, str2, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomUrl)) {
                return false;
            }
            CustomUrl customUrl = (CustomUrl) obj;
            return LocalizationKey.equals-impl0(this.urlLid, customUrl.urlLid) && t.c(this.packageParam, customUrl.packageParam);
        }

        public final String getPackageParam() {
            return this.packageParam;
        }

        public final String getUrlLid-z7Tp-4o() {
            return this.urlLid;
        }

        public int hashCode() {
            int i = LocalizationKey.hashCode-impl(this.urlLid) * 31;
            String str = this.packageParam;
            return i + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "CustomUrl(urlLid=" + LocalizationKey.toString-impl(this.urlLid) + ", packageParam=" + this.packageParam + ')';
        }

        public /* synthetic */ CustomUrl(String str, String str2, k kVar) {
            this(str, str2);
        }

        private CustomUrl(int i, String str, String str2, t0 t0Var) {
            if (1 != (i & 1)) {
                f0.a(i, 1, PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE.getDescriptor());
            }
            this.urlLid = str;
            if ((i & 2) == 0) {
                this.packageParam = null;
            } else {
                this.packageParam = str2;
            }
        }

        private CustomUrl(String str, String str2) {
            t.g(str, "urlLid");
            this.urlLid = str;
            this.packageParam = str2;
        }

        public /* synthetic */ CustomUrl(String str, String str2, int i, k kVar) {
            this(str, (i & 2) != 0 ? null : str2, null);
        }
    }

    public interface Method {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final b serializer() {
                return PurchaseButtonMethodDeserializer.INSTANCE;
            }
        }

        public static final class CustomWebCheckout implements Method {
            public static final Companion Companion = new Companion(null);
            private final Boolean autoDismiss;
            private final CustomUrl customUrl;
            private final ButtonComponent.UrlMethod openMethod;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return PurchaseButtonComponent$Method$CustomWebCheckout$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @e
            public /* synthetic */ CustomWebCheckout(int i, CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod, t0 t0Var) {
                if (1 != (i & 1)) {
                    f0.a(i, 1, PurchaseButtonComponent$Method$CustomWebCheckout$$serializer.INSTANCE.getDescriptor());
                }
                this.customUrl = customUrl;
                if ((i & 2) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i & 4) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public static /* synthetic */ CustomWebCheckout copy$default(CustomWebCheckout customWebCheckout, CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    customUrl = customWebCheckout.customUrl;
                }
                if ((i & 2) != 0) {
                    bool = customWebCheckout.autoDismiss;
                }
                if ((i & 4) != 0) {
                    urlMethod = customWebCheckout.openMethod;
                }
                return customWebCheckout.copy(customUrl, bool, urlMethod);
            }

            public static /* synthetic */ void getAutoDismiss$annotations() {
            }

            public static /* synthetic */ void getCustomUrl$annotations() {
            }

            public static /* synthetic */ void getOpenMethod$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CustomWebCheckout customWebCheckout, d dVar, qb.e eVar) {
                dVar.k(eVar, 0, PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE, customWebCheckout.customUrl);
                if (dVar.e(eVar, 1) || customWebCheckout.autoDismiss != null) {
                    dVar.j(eVar, 1, h.a, customWebCheckout.autoDismiss);
                }
                if (!dVar.e(eVar, 2) && customWebCheckout.openMethod == null) {
                    return;
                }
                dVar.j(eVar, 2, UrlMethodDeserializer.INSTANCE, customWebCheckout.openMethod);
            }

            public final CustomUrl component1() {
                return this.customUrl;
            }

            public final Boolean component2() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod component3() {
                return this.openMethod;
            }

            public final CustomWebCheckout copy(CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                t.g(customUrl, "customUrl");
                return new CustomWebCheckout(customUrl, bool, urlMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CustomWebCheckout)) {
                    return false;
                }
                CustomWebCheckout customWebCheckout = (CustomWebCheckout) obj;
                return t.c(this.customUrl, customWebCheckout.customUrl) && t.c(this.autoDismiss, customWebCheckout.autoDismiss) && this.openMethod == customWebCheckout.openMethod;
            }

            public final /* synthetic */ Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final /* synthetic */ CustomUrl getCustomUrl() {
                return this.customUrl;
            }

            public final /* synthetic */ ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                int hashCode = this.customUrl.hashCode() * 31;
                Boolean bool = this.autoDismiss;
                int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return hashCode2 + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public String toString() {
                return "CustomWebCheckout(customUrl=" + this.customUrl + ", autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }

            public CustomWebCheckout(CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                t.g(customUrl, "customUrl");
                this.customUrl = customUrl;
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public /* synthetic */ CustomWebCheckout(CustomUrl customUrl, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i, k kVar) {
                this(customUrl, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : urlMethod);
            }
        }

        public static final class InAppCheckout implements Method {
            public static final InAppCheckout INSTANCE = new InAppCheckout();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.InAppCheckout", InAppCheckout.INSTANCE, new Annotation[0]);
                }
            }

            private InAppCheckout() {
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) $cachedSerializer$delegate.getValue();
            }

            public final b serializer() {
                return get$cachedSerializer();
            }
        }

        public static final class Unknown implements Method {
            public static final Unknown INSTANCE = new Unknown();
            private static final /* synthetic */ l $cachedSerializer$delegate = m.a(n.b, 1.INSTANCE);

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return new c0("com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Unknown", Unknown.INSTANCE, new Annotation[0]);
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

        public static final class WebCheckout implements Method {
            public static final Companion Companion = new Companion(null);
            private final Boolean autoDismiss;
            private final ButtonComponent.UrlMethod openMethod;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return PurchaseButtonComponent$Method$WebCheckout$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public WebCheckout() {
                this((Boolean) null, (ButtonComponent.UrlMethod) null, 3, (k) null);
            }

            public static /* synthetic */ WebCheckout copy$default(WebCheckout webCheckout, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = webCheckout.autoDismiss;
                }
                if ((i & 2) != 0) {
                    urlMethod = webCheckout.openMethod;
                }
                return webCheckout.copy(bool, urlMethod);
            }

            public static /* synthetic */ void getAutoDismiss$annotations() {
            }

            public static /* synthetic */ void getOpenMethod$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(WebCheckout webCheckout, d dVar, qb.e eVar) {
                if (dVar.e(eVar, 0) || webCheckout.autoDismiss != null) {
                    dVar.j(eVar, 0, h.a, webCheckout.autoDismiss);
                }
                if (!dVar.e(eVar, 1) && webCheckout.openMethod == null) {
                    return;
                }
                dVar.j(eVar, 1, UrlMethodDeserializer.INSTANCE, webCheckout.openMethod);
            }

            public final Boolean component1() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod component2() {
                return this.openMethod;
            }

            public final WebCheckout copy(Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                return new WebCheckout(bool, urlMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WebCheckout)) {
                    return false;
                }
                WebCheckout webCheckout = (WebCheckout) obj;
                return t.c(this.autoDismiss, webCheckout.autoDismiss) && this.openMethod == webCheckout.openMethod;
            }

            public final /* synthetic */ Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final /* synthetic */ ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                Boolean bool = this.autoDismiss;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return hashCode + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public String toString() {
                return "WebCheckout(autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }

            @e
            public /* synthetic */ WebCheckout(int i, Boolean bool, ButtonComponent.UrlMethod urlMethod, t0 t0Var) {
                if ((i & 1) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i & 2) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public WebCheckout(Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public /* synthetic */ WebCheckout(Boolean bool, ButtonComponent.UrlMethod urlMethod, int i, k kVar) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : urlMethod);
            }
        }

        public static final class WebProductSelection implements Method {
            public static final Companion Companion = new Companion(null);
            private final Boolean autoDismiss;
            private final ButtonComponent.UrlMethod openMethod;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return PurchaseButtonComponent$Method$WebProductSelection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public WebProductSelection() {
                this((Boolean) null, (ButtonComponent.UrlMethod) null, 3, (k) null);
            }

            public static /* synthetic */ WebProductSelection copy$default(WebProductSelection webProductSelection, Boolean bool, ButtonComponent.UrlMethod urlMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = webProductSelection.autoDismiss;
                }
                if ((i & 2) != 0) {
                    urlMethod = webProductSelection.openMethod;
                }
                return webProductSelection.copy(bool, urlMethod);
            }

            public static /* synthetic */ void getAutoDismiss$annotations() {
            }

            public static /* synthetic */ void getOpenMethod$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(WebProductSelection webProductSelection, d dVar, qb.e eVar) {
                if (dVar.e(eVar, 0) || webProductSelection.autoDismiss != null) {
                    dVar.j(eVar, 0, h.a, webProductSelection.autoDismiss);
                }
                if (!dVar.e(eVar, 1) && webProductSelection.openMethod == null) {
                    return;
                }
                dVar.j(eVar, 1, UrlMethodDeserializer.INSTANCE, webProductSelection.openMethod);
            }

            public final Boolean component1() {
                return this.autoDismiss;
            }

            public final ButtonComponent.UrlMethod component2() {
                return this.openMethod;
            }

            public final WebProductSelection copy(Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                return new WebProductSelection(bool, urlMethod);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WebProductSelection)) {
                    return false;
                }
                WebProductSelection webProductSelection = (WebProductSelection) obj;
                return t.c(this.autoDismiss, webProductSelection.autoDismiss) && this.openMethod == webProductSelection.openMethod;
            }

            public final /* synthetic */ Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final /* synthetic */ ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                Boolean bool = this.autoDismiss;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return hashCode + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public String toString() {
                return "WebProductSelection(autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }

            @e
            public /* synthetic */ WebProductSelection(int i, Boolean bool, ButtonComponent.UrlMethod urlMethod, t0 t0Var) {
                if ((i & 1) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i & 2) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public WebProductSelection(Boolean bool, ButtonComponent.UrlMethod urlMethod) {
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public /* synthetic */ WebProductSelection(Boolean bool, ButtonComponent.UrlMethod urlMethod, int i, k kVar) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : urlMethod);
            }
        }
    }

    @e
    public /* synthetic */ PurchaseButtonComponent(int i, StackComponent stackComponent, Action action, Method method, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, PurchaseButtonComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.stack = stackComponent;
        if ((i & 2) == 0) {
            this.action = null;
        } else {
            this.action = action;
        }
        if ((i & 4) == 0) {
            this.method = null;
        } else {
            this.method = method;
        }
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PurchaseButtonComponent purchaseButtonComponent, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, StackComponent$$serializer.INSTANCE, purchaseButtonComponent.stack);
        if (dVar.e(eVar, 1) || purchaseButtonComponent.action != null) {
            dVar.j(eVar, 1, ActionDeserializer.INSTANCE, purchaseButtonComponent.action);
        }
        if (!dVar.e(eVar, 2) && purchaseButtonComponent.method == null) {
            return;
        }
        dVar.j(eVar, 2, PurchaseButtonMethodDeserializer.INSTANCE, purchaseButtonComponent.method);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseButtonComponent)) {
            return false;
        }
        PurchaseButtonComponent purchaseButtonComponent = (PurchaseButtonComponent) obj;
        return t.c(this.stack, purchaseButtonComponent.stack) && this.action == purchaseButtonComponent.action && t.c(this.method, purchaseButtonComponent.method);
    }

    public final /* synthetic */ Action getAction() {
        return this.action;
    }

    public final /* synthetic */ Method getMethod() {
        return this.method;
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public int hashCode() {
        int hashCode = this.stack.hashCode() * 31;
        Action action = this.action;
        int hashCode2 = (hashCode + (action == null ? 0 : action.hashCode())) * 31;
        Method method = this.method;
        return hashCode2 + (method != null ? method.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseButtonComponent(stack=" + this.stack + ", action=" + this.action + ", method=" + this.method + ')';
    }

    public PurchaseButtonComponent(StackComponent stackComponent, Action action, Method method) {
        t.g(stackComponent, "stack");
        this.stack = stackComponent;
        this.action = action;
        this.method = method;
    }

    public /* synthetic */ PurchaseButtonComponent(StackComponent stackComponent, Action action, Method method, int i, k kVar) {
        this(stackComponent, (i & 2) != 0 ? null : action, (i & 4) != 0 ? null : method);
    }
}

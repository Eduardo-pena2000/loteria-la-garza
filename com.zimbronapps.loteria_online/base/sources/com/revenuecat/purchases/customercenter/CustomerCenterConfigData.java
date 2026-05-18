package com.revenuecat.purchases.customercenter;

import Ca.l;
import Ca.m;
import Ca.n;
import Ca.o;
import Da.S;
import Qa.a;
import Xa.c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
import com.revenuecat.purchases.paywalls.PaywallColor;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;
import ob.h;
import qb.e;
import rb.d;
import sb.A;
import sb.M;
import sb.f0;
import sb.t0;
import sb.x0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerCenterConfigData {
    public static final Companion Companion = new Companion(null);
    private final Appearance appearance;
    private final String lastPublishedAppVersion;
    private final Localization localization;
    private final Map screens;
    private final Support support;

    public static final class Appearance {
        public static final Companion Companion = new Companion(null);
        private final ColorInformation dark;
        private final ColorInformation light;

        public static final class ColorInformation {
            public static final Companion Companion = new Companion(null);
            private final PaywallColor accentColor;
            private final PaywallColor backgroundColor;
            private final PaywallColor buttonBackgroundColor;
            private final PaywallColor buttonTextColor;
            private final PaywallColor textColor;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public ColorInformation() {
                this((PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 31, (k) null);
            }

            public static /* synthetic */ ColorInformation copy$default(ColorInformation colorInformation, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, int i, Object obj) {
                if ((i & 1) != 0) {
                    paywallColor = colorInformation.accentColor;
                }
                if ((i & 2) != 0) {
                    paywallColor2 = colorInformation.textColor;
                }
                PaywallColor paywallColor6 = paywallColor2;
                if ((i & 4) != 0) {
                    paywallColor3 = colorInformation.backgroundColor;
                }
                PaywallColor paywallColor7 = paywallColor3;
                if ((i & 8) != 0) {
                    paywallColor4 = colorInformation.buttonTextColor;
                }
                PaywallColor paywallColor8 = paywallColor4;
                if ((i & 16) != 0) {
                    paywallColor5 = colorInformation.buttonBackgroundColor;
                }
                return colorInformation.copy(paywallColor, paywallColor6, paywallColor7, paywallColor8, paywallColor5);
            }

            public static /* synthetic */ void getAccentColor$annotations() {
            }

            public static /* synthetic */ void getBackgroundColor$annotations() {
            }

            public static /* synthetic */ void getButtonBackgroundColor$annotations() {
            }

            public static /* synthetic */ void getButtonTextColor$annotations() {
            }

            public static /* synthetic */ void getTextColor$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ColorInformation colorInformation, d dVar, e eVar) {
                if (dVar.e(eVar, 0) || colorInformation.accentColor != null) {
                    dVar.j(eVar, 0, PaywallColor.Serializer.INSTANCE, colorInformation.accentColor);
                }
                if (dVar.e(eVar, 1) || colorInformation.textColor != null) {
                    dVar.j(eVar, 1, PaywallColor.Serializer.INSTANCE, colorInformation.textColor);
                }
                if (dVar.e(eVar, 2) || colorInformation.backgroundColor != null) {
                    dVar.j(eVar, 2, PaywallColor.Serializer.INSTANCE, colorInformation.backgroundColor);
                }
                if (dVar.e(eVar, 3) || colorInformation.buttonTextColor != null) {
                    dVar.j(eVar, 3, PaywallColor.Serializer.INSTANCE, colorInformation.buttonTextColor);
                }
                if (!dVar.e(eVar, 4) && colorInformation.buttonBackgroundColor == null) {
                    return;
                }
                dVar.j(eVar, 4, PaywallColor.Serializer.INSTANCE, colorInformation.buttonBackgroundColor);
            }

            public final PaywallColor component1() {
                return this.accentColor;
            }

            public final PaywallColor component2() {
                return this.textColor;
            }

            public final PaywallColor component3() {
                return this.backgroundColor;
            }

            public final PaywallColor component4() {
                return this.buttonTextColor;
            }

            public final PaywallColor component5() {
                return this.buttonBackgroundColor;
            }

            public final ColorInformation copy(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5) {
                return new ColorInformation(paywallColor, paywallColor2, paywallColor3, paywallColor4, paywallColor5);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ColorInformation)) {
                    return false;
                }
                ColorInformation colorInformation = (ColorInformation) obj;
                return t.c(this.accentColor, colorInformation.accentColor) && t.c(this.textColor, colorInformation.textColor) && t.c(this.backgroundColor, colorInformation.backgroundColor) && t.c(this.buttonTextColor, colorInformation.buttonTextColor) && t.c(this.buttonBackgroundColor, colorInformation.buttonBackgroundColor);
            }

            public final PaywallColor getAccentColor() {
                return this.accentColor;
            }

            public final PaywallColor getBackgroundColor() {
                return this.backgroundColor;
            }

            public final PaywallColor getButtonBackgroundColor() {
                return this.buttonBackgroundColor;
            }

            public final PaywallColor getButtonTextColor() {
                return this.buttonTextColor;
            }

            public final PaywallColor getTextColor() {
                return this.textColor;
            }

            public int hashCode() {
                PaywallColor paywallColor = this.accentColor;
                int hashCode = (paywallColor == null ? 0 : paywallColor.hashCode()) * 31;
                PaywallColor paywallColor2 = this.textColor;
                int hashCode2 = (hashCode + (paywallColor2 == null ? 0 : paywallColor2.hashCode())) * 31;
                PaywallColor paywallColor3 = this.backgroundColor;
                int hashCode3 = (hashCode2 + (paywallColor3 == null ? 0 : paywallColor3.hashCode())) * 31;
                PaywallColor paywallColor4 = this.buttonTextColor;
                int hashCode4 = (hashCode3 + (paywallColor4 == null ? 0 : paywallColor4.hashCode())) * 31;
                PaywallColor paywallColor5 = this.buttonBackgroundColor;
                return hashCode4 + (paywallColor5 != null ? paywallColor5.hashCode() : 0);
            }

            public String toString() {
                return "ColorInformation(accentColor=" + this.accentColor + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", buttonTextColor=" + this.buttonTextColor + ", buttonBackgroundColor=" + this.buttonBackgroundColor + ')';
            }

            @Ca.e
            public /* synthetic */ ColorInformation(int i, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, t0 t0Var) {
                if ((i & 1) == 0) {
                    this.accentColor = null;
                } else {
                    this.accentColor = paywallColor;
                }
                if ((i & 2) == 0) {
                    this.textColor = null;
                } else {
                    this.textColor = paywallColor2;
                }
                if ((i & 4) == 0) {
                    this.backgroundColor = null;
                } else {
                    this.backgroundColor = paywallColor3;
                }
                if ((i & 8) == 0) {
                    this.buttonTextColor = null;
                } else {
                    this.buttonTextColor = paywallColor4;
                }
                if ((i & 16) == 0) {
                    this.buttonBackgroundColor = null;
                } else {
                    this.buttonBackgroundColor = paywallColor5;
                }
            }

            public ColorInformation(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5) {
                this.accentColor = paywallColor;
                this.textColor = paywallColor2;
                this.backgroundColor = paywallColor3;
                this.buttonTextColor = paywallColor4;
                this.buttonBackgroundColor = paywallColor5;
            }

            public /* synthetic */ ColorInformation(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, int i, k kVar) {
                this((i & 1) != 0 ? null : paywallColor, (i & 2) != 0 ? null : paywallColor2, (i & 4) != 0 ? null : paywallColor3, (i & 8) != 0 ? null : paywallColor4, (i & 16) != 0 ? null : paywallColor5);
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return CustomerCenterConfigData$Appearance$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Appearance() {
            this((ColorInformation) null, (ColorInformation) null, 3, (k) null);
        }

        public static /* synthetic */ Appearance copy$default(Appearance appearance, ColorInformation colorInformation, ColorInformation colorInformation2, int i, Object obj) {
            if ((i & 1) != 0) {
                colorInformation = appearance.light;
            }
            if ((i & 2) != 0) {
                colorInformation2 = appearance.dark;
            }
            return appearance.copy(colorInformation, colorInformation2);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Appearance appearance, d dVar, e eVar) {
            if (dVar.e(eVar, 0) || appearance.light != null) {
                dVar.j(eVar, 0, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE, appearance.light);
            }
            if (!dVar.e(eVar, 1) && appearance.dark == null) {
                return;
            }
            dVar.j(eVar, 1, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE, appearance.dark);
        }

        public final ColorInformation component1() {
            return this.light;
        }

        public final ColorInformation component2() {
            return this.dark;
        }

        public final Appearance copy(ColorInformation colorInformation, ColorInformation colorInformation2) {
            return new Appearance(colorInformation, colorInformation2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Appearance)) {
                return false;
            }
            Appearance appearance = (Appearance) obj;
            return t.c(this.light, appearance.light) && t.c(this.dark, appearance.dark);
        }

        public final ColorInformation getDark() {
            return this.dark;
        }

        public final ColorInformation getLight() {
            return this.light;
        }

        public int hashCode() {
            ColorInformation colorInformation = this.light;
            int hashCode = (colorInformation == null ? 0 : colorInformation.hashCode()) * 31;
            ColorInformation colorInformation2 = this.dark;
            return hashCode + (colorInformation2 != null ? colorInformation2.hashCode() : 0);
        }

        public String toString() {
            return "Appearance(light=" + this.light + ", dark=" + this.dark + ')';
        }

        @Ca.e
        public /* synthetic */ Appearance(int i, ColorInformation colorInformation, ColorInformation colorInformation2, t0 t0Var) {
            if ((i & 1) == 0) {
                this.light = null;
            } else {
                this.light = colorInformation;
            }
            if ((i & 2) == 0) {
                this.dark = null;
            } else {
                this.dark = colorInformation2;
            }
        }

        public Appearance(ColorInformation colorInformation, ColorInformation colorInformation2) {
            this.light = colorInformation;
            this.dark = colorInformation2;
        }

        public /* synthetic */ Appearance(ColorInformation colorInformation, ColorInformation colorInformation2, int i, k kVar) {
            this((i & 1) != 0 ? null : colorInformation, (i & 2) != 0 ? null : colorInformation2);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return CustomerCenterConfigData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class HelpPath {
        private final String actionIdentifier;
        private final PathDetail.FeedbackSurvey feedbackSurvey;
        private final String id;
        private final OpenMethod openMethod;
        private final PathDetail.PromotionalOffer promotionalOffer;
        private final String title;
        private final PathType type;
        private final String url;
        public static final Companion Companion = new Companion(null);
        private static final b[] $childSerializers = {null, null, PathType.Companion.serializer(), null, null, null, OpenMethod.Companion.serializer(), null};

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return CustomerCenterConfigData$HelpPath$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public enum OpenMethod {
            IN_APP,
            EXTERNAL;

            public static final Companion Companion = new Companion(null);
            private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

            public static final class Companion {

                public static final class 1 extends u implements a {
                    public static final 1 INSTANCE = new 1();

                    public 1() {
                        super(0);
                    }

                    public final b invoke() {
                        return A.b("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.OpenMethod", OpenMethod.values());
                    }
                }

                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                private final /* synthetic */ b get$cachedSerializer() {
                    return (b) OpenMethod.access$get$cachedSerializer$delegate$cp().getValue();
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

        public static abstract class PathDetail {
            public static final Companion Companion = new Companion(null);
            private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

            public static final class Companion {

                public static final class 1 extends u implements a {
                    public static final 1 INSTANCE = new 1();

                    public 1() {
                        super(0);
                    }

                    public final b invoke() {
                        return new h("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail", P.b(PathDetail.class), new c[]{P.b(FeedbackSurvey.class), P.b(PromotionalOffer.class)}, new b[]{CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE}, new Annotation[0]);
                    }
                }

                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                private final /* synthetic */ b get$cachedSerializer() {
                    return (b) PathDetail.access$get$cachedSerializer$delegate$cp().getValue();
                }

                public final b serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }

            public static final class FeedbackSurvey extends PathDetail {
                private final List options;
                private final String title;
                public static final Companion Companion = new Companion(null);
                private static final b[] $childSerializers = {null, new sb.e(CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE)};

                public static final class Companion {
                    public /* synthetic */ Companion(k kVar) {
                        this();
                    }

                    public final b serializer() {
                        return CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public static final class Option {
                    public static final Companion Companion = new Companion(null);
                    private final String id;
                    private final PromotionalOffer promotionalOffer;
                    private final String title;

                    public static final class Companion {
                        public /* synthetic */ Companion(k kVar) {
                            this();
                        }

                        public final b serializer() {
                            return CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @Ca.e
                    public /* synthetic */ Option(int i, String str, String str2, PromotionalOffer promotionalOffer, t0 t0Var) {
                        if (3 != (i & 3)) {
                            f0.a(i, 3, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.INSTANCE.getDescriptor());
                        }
                        this.id = str;
                        this.title = str2;
                        if ((i & 4) == 0) {
                            this.promotionalOffer = null;
                        } else {
                            this.promotionalOffer = promotionalOffer;
                        }
                    }

                    public static /* synthetic */ Option copy$default(Option option, String str, String str2, PromotionalOffer promotionalOffer, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = option.id;
                        }
                        if ((i & 2) != 0) {
                            str2 = option.title;
                        }
                        if ((i & 4) != 0) {
                            promotionalOffer = option.promotionalOffer;
                        }
                        return option.copy(str, str2, promotionalOffer);
                    }

                    public static /* synthetic */ void getPromotionalOffer$annotations() {
                    }

                    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Option option, d dVar, e eVar) {
                        dVar.v(eVar, 0, option.id);
                        dVar.v(eVar, 1, option.title);
                        if (!dVar.e(eVar, 2) && option.promotionalOffer == null) {
                            return;
                        }
                        dVar.j(eVar, 2, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, option.promotionalOffer);
                    }

                    public final String component1() {
                        return this.id;
                    }

                    public final String component2() {
                        return this.title;
                    }

                    public final PromotionalOffer component3() {
                        return this.promotionalOffer;
                    }

                    public final Option copy(String str, String str2, PromotionalOffer promotionalOffer) {
                        t.g(str, "id");
                        t.g(str2, "title");
                        return new Option(str, str2, promotionalOffer);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Option)) {
                            return false;
                        }
                        Option option = (Option) obj;
                        return t.c(this.id, option.id) && t.c(this.title, option.title) && t.c(this.promotionalOffer, option.promotionalOffer);
                    }

                    public final String getId() {
                        return this.id;
                    }

                    public final PromotionalOffer getPromotionalOffer() {
                        return this.promotionalOffer;
                    }

                    public final String getTitle() {
                        return this.title;
                    }

                    public int hashCode() {
                        int hashCode = ((this.id.hashCode() * 31) + this.title.hashCode()) * 31;
                        PromotionalOffer promotionalOffer = this.promotionalOffer;
                        return hashCode + (promotionalOffer == null ? 0 : promotionalOffer.hashCode());
                    }

                    public String toString() {
                        return "Option(id=" + this.id + ", title=" + this.title + ", promotionalOffer=" + this.promotionalOffer + ')';
                    }

                    public Option(String str, String str2, PromotionalOffer promotionalOffer) {
                        t.g(str, "id");
                        t.g(str2, "title");
                        this.id = str;
                        this.title = str2;
                        this.promotionalOffer = promotionalOffer;
                    }

                    public /* synthetic */ Option(String str, String str2, PromotionalOffer promotionalOffer, int i, k kVar) {
                        this(str, str2, (i & 4) != 0 ? null : promotionalOffer);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                @Ca.e
                public /* synthetic */ FeedbackSurvey(int i, String str, List list, t0 t0Var) {
                    super(i, t0Var);
                    if (3 != (i & 3)) {
                        f0.a(i, 3, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE.getDescriptor());
                    }
                    this.title = str;
                    this.options = list;
                }

                public static final /* synthetic */ b[] access$get$childSerializers$cp() {
                    return $childSerializers;
                }

                public static /* synthetic */ FeedbackSurvey copy$default(FeedbackSurvey feedbackSurvey, String str, List list, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = feedbackSurvey.title;
                    }
                    if ((i & 2) != 0) {
                        list = feedbackSurvey.options;
                    }
                    return feedbackSurvey.copy(str, list);
                }

                public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(FeedbackSurvey feedbackSurvey, d dVar, e eVar) {
                    PathDetail.write$Self(feedbackSurvey, dVar, eVar);
                    ob.k[] kVarArr = $childSerializers;
                    dVar.v(eVar, 0, feedbackSurvey.title);
                    dVar.k(eVar, 1, kVarArr[1], feedbackSurvey.options);
                }

                public final String component1() {
                    return this.title;
                }

                public final List component2() {
                    return this.options;
                }

                public final FeedbackSurvey copy(String str, List list) {
                    t.g(str, "title");
                    t.g(list, "options");
                    return new FeedbackSurvey(str, list);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof FeedbackSurvey)) {
                        return false;
                    }
                    FeedbackSurvey feedbackSurvey = (FeedbackSurvey) obj;
                    return t.c(this.title, feedbackSurvey.title) && t.c(this.options, feedbackSurvey.options);
                }

                public final List getOptions() {
                    return this.options;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return (this.title.hashCode() * 31) + this.options.hashCode();
                }

                public String toString() {
                    return "FeedbackSurvey(title=" + this.title + ", options=" + this.options + ')';
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FeedbackSurvey(String str, List list) {
                    super(null);
                    t.g(str, "title");
                    t.g(list, "options");
                    this.title = str;
                    this.options = list;
                }
            }

            public static final class PromotionalOffer extends PathDetail {
                private static final b[] $childSerializers;
                public static final Companion Companion = new Companion(null);
                private final String androidOfferId;
                private final Map crossProductPromotions;
                private final boolean eligible;
                private final Map productMapping;
                private final String subtitle;
                private final String title;

                public static final class Companion {
                    public /* synthetic */ Companion(k kVar) {
                        this();
                    }

                    public final b serializer() {
                        return CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public static final class CrossProductPromotion {
                    public static final Companion Companion = new Companion(null);
                    private final String storeOfferIdentifier;
                    private final String targetProductId;

                    public static final class Companion {
                        public /* synthetic */ Companion(k kVar) {
                            this();
                        }

                        public final b serializer() {
                            return CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @Ca.e
                    public /* synthetic */ CrossProductPromotion(int i, String str, String str2, t0 t0Var) {
                        if (3 != (i & 3)) {
                            f0.a(i, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer.INSTANCE.getDescriptor());
                        }
                        this.storeOfferIdentifier = str;
                        this.targetProductId = str2;
                    }

                    public static /* synthetic */ void getStoreOfferIdentifier$annotations() {
                    }

                    public static /* synthetic */ void getTargetProductId$annotations() {
                    }

                    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CrossProductPromotion crossProductPromotion, d dVar, e eVar) {
                        dVar.v(eVar, 0, crossProductPromotion.storeOfferIdentifier);
                        dVar.v(eVar, 1, crossProductPromotion.targetProductId);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof CrossProductPromotion)) {
                            return false;
                        }
                        CrossProductPromotion crossProductPromotion = (CrossProductPromotion) obj;
                        return t.c(this.storeOfferIdentifier, crossProductPromotion.storeOfferIdentifier) && t.c(this.targetProductId, crossProductPromotion.targetProductId);
                    }

                    public final String getStoreOfferIdentifier() {
                        return this.storeOfferIdentifier;
                    }

                    public final String getTargetProductId() {
                        return this.targetProductId;
                    }

                    public int hashCode() {
                        return (this.storeOfferIdentifier.hashCode() * 31) + this.targetProductId.hashCode();
                    }

                    public String toString() {
                        return "CrossProductPromotion(storeOfferIdentifier=" + this.storeOfferIdentifier + ", targetProductId=" + this.targetProductId + ')';
                    }

                    public CrossProductPromotion(String str, String str2) {
                        t.g(str, "storeOfferIdentifier");
                        t.g(str2, "targetProductId");
                        this.storeOfferIdentifier = str;
                        this.targetProductId = str2;
                    }
                }

                static {
                    x0 x0Var = x0.a;
                    $childSerializers = new b[]{null, null, null, null, new M(x0Var, x0Var), new M(x0Var, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion$$serializer.INSTANCE)};
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                @Ca.e
                public /* synthetic */ PromotionalOffer(int i, String str, boolean z, String str2, String str3, Map map, Map map2, t0 t0Var) {
                    super(i, t0Var);
                    if (31 != (i & 31)) {
                        f0.a(i, 31, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE.getDescriptor());
                    }
                    this.androidOfferId = str;
                    this.eligible = z;
                    this.title = str2;
                    this.subtitle = str3;
                    this.productMapping = map;
                    if ((i & 32) == 0) {
                        this.crossProductPromotions = S.h();
                    } else {
                        this.crossProductPromotions = map2;
                    }
                }

                public static final /* synthetic */ b[] access$get$childSerializers$cp() {
                    return $childSerializers;
                }

                public static /* synthetic */ PromotionalOffer copy$default(PromotionalOffer promotionalOffer, String str, boolean z, String str2, String str3, Map map, Map map2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = promotionalOffer.androidOfferId;
                    }
                    if ((i & 2) != 0) {
                        z = promotionalOffer.eligible;
                    }
                    boolean z2 = z;
                    if ((i & 4) != 0) {
                        str2 = promotionalOffer.title;
                    }
                    String str4 = str2;
                    if ((i & 8) != 0) {
                        str3 = promotionalOffer.subtitle;
                    }
                    String str5 = str3;
                    if ((i & 16) != 0) {
                        map = promotionalOffer.productMapping;
                    }
                    Map map3 = map;
                    if ((i & 32) != 0) {
                        map2 = promotionalOffer.crossProductPromotions;
                    }
                    return promotionalOffer.copy(str, z2, str4, str5, map3, map2);
                }

                public static /* synthetic */ void getAndroidOfferId$annotations() {
                }

                public static /* synthetic */ void getCrossProductPromotions$annotations() {
                }

                public static /* synthetic */ void getProductMapping$annotations() {
                }

                public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PromotionalOffer promotionalOffer, d dVar, e eVar) {
                    PathDetail.write$Self(promotionalOffer, dVar, eVar);
                    ob.k[] kVarArr = $childSerializers;
                    dVar.v(eVar, 0, promotionalOffer.androidOfferId);
                    dVar.B(eVar, 1, promotionalOffer.eligible);
                    dVar.v(eVar, 2, promotionalOffer.title);
                    dVar.v(eVar, 3, promotionalOffer.subtitle);
                    dVar.k(eVar, 4, kVarArr[4], promotionalOffer.productMapping);
                    if (!dVar.e(eVar, 5) && t.c(promotionalOffer.crossProductPromotions, S.h())) {
                        return;
                    }
                    dVar.k(eVar, 5, kVarArr[5], promotionalOffer.crossProductPromotions);
                }

                public final String component1() {
                    return this.androidOfferId;
                }

                public final boolean component2() {
                    return this.eligible;
                }

                public final String component3() {
                    return this.title;
                }

                public final String component4() {
                    return this.subtitle;
                }

                public final Map component5() {
                    return this.productMapping;
                }

                public final Map component6() {
                    return this.crossProductPromotions;
                }

                public final PromotionalOffer copy(String str, boolean z, String str2, String str3, Map map, Map map2) {
                    t.g(str, "androidOfferId");
                    t.g(str2, "title");
                    t.g(str3, "subtitle");
                    t.g(map, "productMapping");
                    t.g(map2, "crossProductPromotions");
                    return new PromotionalOffer(str, z, str2, str3, map, map2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof PromotionalOffer)) {
                        return false;
                    }
                    PromotionalOffer promotionalOffer = (PromotionalOffer) obj;
                    return t.c(this.androidOfferId, promotionalOffer.androidOfferId) && this.eligible == promotionalOffer.eligible && t.c(this.title, promotionalOffer.title) && t.c(this.subtitle, promotionalOffer.subtitle) && t.c(this.productMapping, promotionalOffer.productMapping) && t.c(this.crossProductPromotions, promotionalOffer.crossProductPromotions);
                }

                public final String getAndroidOfferId() {
                    return this.androidOfferId;
                }

                public final Map getCrossProductPromotions() {
                    return this.crossProductPromotions;
                }

                public final boolean getEligible() {
                    return this.eligible;
                }

                public final Map getProductMapping() {
                    return this.productMapping;
                }

                public final String getSubtitle() {
                    return this.subtitle;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return (((((((((this.androidOfferId.hashCode() * 31) + Boolean.hashCode(this.eligible)) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.productMapping.hashCode()) * 31) + this.crossProductPromotions.hashCode();
                }

                public String toString() {
                    return "PromotionalOffer(androidOfferId=" + this.androidOfferId + ", eligible=" + this.eligible + ", title=" + this.title + ", subtitle=" + this.subtitle + ", productMapping=" + this.productMapping + ", crossProductPromotions=" + this.crossProductPromotions + ')';
                }

                public static /* synthetic */ PromotionalOffer copy$default(PromotionalOffer promotionalOffer, String str, boolean z, String str2, String str3, Map map, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = promotionalOffer.androidOfferId;
                    }
                    if ((i & 2) != 0) {
                        z = promotionalOffer.eligible;
                    }
                    boolean z2 = z;
                    if ((i & 4) != 0) {
                        str2 = promotionalOffer.title;
                    }
                    String str4 = str2;
                    if ((i & 8) != 0) {
                        str3 = promotionalOffer.subtitle;
                    }
                    String str5 = str3;
                    if ((i & 16) != 0) {
                        map = promotionalOffer.productMapping;
                    }
                    return promotionalOffer.copy(str, z2, str4, str5, map);
                }

                @Ca.e
                public final PromotionalOffer copy(String str, boolean z, String str2, String str3, Map map) {
                    t.g(str, "androidOfferId");
                    t.g(str2, "title");
                    t.g(str3, "subtitle");
                    t.g(map, "productMapping");
                    return copy(str, z, str2, str3, map, S.h());
                }

                public /* synthetic */ PromotionalOffer(String str, boolean z, String str2, String str3, Map map, Map map2, int i, k kVar) {
                    this(str, z, str2, str3, map, (i & 32) != 0 ? S.h() : map2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public PromotionalOffer(String str, boolean z, String str2, String str3, Map map, Map map2) {
                    super(null);
                    t.g(str, "androidOfferId");
                    t.g(str2, "title");
                    t.g(str3, "subtitle");
                    t.g(map, "productMapping");
                    t.g(map2, "crossProductPromotions");
                    this.androidOfferId = str;
                    this.eligible = z;
                    this.title = str2;
                    this.subtitle = str3;
                    this.productMapping = map;
                    this.crossProductPromotions = map2;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                @Ca.e
                public PromotionalOffer(String str, boolean z, String str2, String str3, Map map) {
                    this(str, z, str2, str3, map, S.h());
                    t.g(str, "androidOfferId");
                    t.g(str2, "title");
                    t.g(str3, "subtitle");
                    t.g(map, "productMapping");
                }
            }

            public /* synthetic */ PathDetail(k kVar) {
                this();
            }

            public static final /* synthetic */ l access$get$cachedSerializer$delegate$cp() {
                return $cachedSerializer$delegate;
            }

            private PathDetail() {
            }

            @Ca.e
            public /* synthetic */ PathDetail(int i, t0 t0Var) {
            }

            public static final /* synthetic */ void write$Self(PathDetail pathDetail, d dVar, e eVar) {
            }
        }

        public enum PathType {
            MISSING_PURCHASE,
            REFUND_REQUEST,
            CHANGE_PLANS,
            CANCEL,
            CUSTOM_URL,
            CUSTOM_ACTION,
            UNKNOWN;

            public static final Companion Companion = new Companion(null);
            private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

            public static final class Companion {

                public static final class 1 extends u implements a {
                    public static final 1 INSTANCE = new 1();

                    public 1() {
                        super(0);
                    }

                    public final b invoke() {
                        return A.b("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathType", PathType.values());
                    }
                }

                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                private final /* synthetic */ b get$cachedSerializer() {
                    return (b) PathType.access$get$cachedSerializer$delegate$cp().getValue();
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

        @Ca.e
        public /* synthetic */ HelpPath(int i, String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, String str3, OpenMethod openMethod, String str4, t0 t0Var) {
            if (7 != (i & 7)) {
                f0.a(i, 7, CustomerCenterConfigData$HelpPath$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.title = str2;
            this.type = pathType;
            if ((i & 8) == 0) {
                this.promotionalOffer = null;
            } else {
                this.promotionalOffer = promotionalOffer;
            }
            if ((i & 16) == 0) {
                this.feedbackSurvey = null;
            } else {
                this.feedbackSurvey = feedbackSurvey;
            }
            if ((i & 32) == 0) {
                this.url = null;
            } else {
                this.url = str3;
            }
            if ((i & 64) == 0) {
                this.openMethod = null;
            } else {
                this.openMethod = openMethod;
            }
            if ((i & 128) == 0) {
                this.actionIdentifier = null;
            } else {
                this.actionIdentifier = str4;
            }
        }

        public static final /* synthetic */ b[] access$get$childSerializers$cp() {
            return $childSerializers;
        }

        public static /* synthetic */ HelpPath copy$default(HelpPath helpPath, String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, String str3, OpenMethod openMethod, String str4, int i, Object obj) {
            return helpPath.copy((i & 1) != 0 ? helpPath.id : str, (i & 2) != 0 ? helpPath.title : str2, (i & 4) != 0 ? helpPath.type : pathType, (i & 8) != 0 ? helpPath.promotionalOffer : promotionalOffer, (i & 16) != 0 ? helpPath.feedbackSurvey : feedbackSurvey, (i & 32) != 0 ? helpPath.url : str3, (i & 64) != 0 ? helpPath.openMethod : openMethod, (i & 128) != 0 ? helpPath.actionIdentifier : str4);
        }

        public static /* synthetic */ void getActionIdentifier$annotations() {
        }

        public static /* synthetic */ void getFeedbackSurvey$annotations() {
        }

        public static /* synthetic */ void getOpenMethod$annotations() {
        }

        public static /* synthetic */ void getPromotionalOffer$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(HelpPath helpPath, d dVar, e eVar) {
            ob.k[] kVarArr = $childSerializers;
            dVar.v(eVar, 0, helpPath.id);
            dVar.v(eVar, 1, helpPath.title);
            dVar.k(eVar, 2, kVarArr[2], helpPath.type);
            if (dVar.e(eVar, 3) || helpPath.promotionalOffer != null) {
                dVar.j(eVar, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, helpPath.promotionalOffer);
            }
            if (dVar.e(eVar, 4) || helpPath.feedbackSurvey != null) {
                dVar.j(eVar, 4, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, helpPath.feedbackSurvey);
            }
            if (dVar.e(eVar, 5) || helpPath.url != null) {
                dVar.j(eVar, 5, x0.a, helpPath.url);
            }
            if (dVar.e(eVar, 6) || helpPath.openMethod != null) {
                dVar.j(eVar, 6, kVarArr[6], helpPath.openMethod);
            }
            if (!dVar.e(eVar, 7) && helpPath.actionIdentifier == null) {
                return;
            }
            dVar.j(eVar, 7, x0.a, helpPath.actionIdentifier);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.title;
        }

        public final PathType component3() {
            return this.type;
        }

        public final PathDetail.PromotionalOffer component4() {
            return this.promotionalOffer;
        }

        public final PathDetail.FeedbackSurvey component5() {
            return this.feedbackSurvey;
        }

        public final String component6() {
            return this.url;
        }

        public final OpenMethod component7() {
            return this.openMethod;
        }

        public final String component8() {
            return this.actionIdentifier;
        }

        public final HelpPath copy(String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, String str3, OpenMethod openMethod, String str4) {
            t.g(str, "id");
            t.g(str2, "title");
            t.g(pathType, "type");
            return new HelpPath(str, str2, pathType, promotionalOffer, feedbackSurvey, str3, openMethod, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpPath)) {
                return false;
            }
            HelpPath helpPath = (HelpPath) obj;
            return t.c(this.id, helpPath.id) && t.c(this.title, helpPath.title) && this.type == helpPath.type && t.c(this.promotionalOffer, helpPath.promotionalOffer) && t.c(this.feedbackSurvey, helpPath.feedbackSurvey) && t.c(this.url, helpPath.url) && this.openMethod == helpPath.openMethod && t.c(this.actionIdentifier, helpPath.actionIdentifier);
        }

        public final String getActionIdentifier() {
            return this.actionIdentifier;
        }

        public final PathDetail.FeedbackSurvey getFeedbackSurvey() {
            return this.feedbackSurvey;
        }

        public final String getId() {
            return this.id;
        }

        public final OpenMethod getOpenMethod() {
            return this.openMethod;
        }

        public final PathDetail.PromotionalOffer getPromotionalOffer() {
            return this.promotionalOffer;
        }

        public final String getTitle() {
            return this.title;
        }

        public final PathType getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = ((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.type.hashCode()) * 31;
            PathDetail.PromotionalOffer promotionalOffer = this.promotionalOffer;
            int hashCode2 = (hashCode + (promotionalOffer == null ? 0 : promotionalOffer.hashCode())) * 31;
            PathDetail.FeedbackSurvey feedbackSurvey = this.feedbackSurvey;
            int hashCode3 = (hashCode2 + (feedbackSurvey == null ? 0 : feedbackSurvey.hashCode())) * 31;
            String str = this.url;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            OpenMethod openMethod = this.openMethod;
            int hashCode5 = (hashCode4 + (openMethod == null ? 0 : openMethod.hashCode())) * 31;
            String str2 = this.actionIdentifier;
            return hashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "HelpPath(id=" + this.id + ", title=" + this.title + ", type=" + this.type + ", promotionalOffer=" + this.promotionalOffer + ", feedbackSurvey=" + this.feedbackSurvey + ", url=" + this.url + ", openMethod=" + this.openMethod + ", actionIdentifier=" + this.actionIdentifier + ')';
        }

        public HelpPath(String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, String str3, OpenMethod openMethod, String str4) {
            t.g(str, "id");
            t.g(str2, "title");
            t.g(pathType, "type");
            this.id = str;
            this.title = str2;
            this.type = pathType;
            this.promotionalOffer = promotionalOffer;
            this.feedbackSurvey = feedbackSurvey;
            this.url = str3;
            this.openMethod = openMethod;
            this.actionIdentifier = str4;
        }

        public /* synthetic */ HelpPath(String str, String str2, PathType pathType, PathDetail.PromotionalOffer promotionalOffer, PathDetail.FeedbackSurvey feedbackSurvey, String str3, OpenMethod openMethod, String str4, int i, k kVar) {
            this(str, str2, pathType, (i & 8) != 0 ? null : promotionalOffer, (i & 16) != 0 ? null : feedbackSurvey, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : openMethod, (i & 128) != 0 ? null : str4);
        }
    }

    public static final class Localization {
        private static final b[] $childSerializers;
        public static final Companion Companion = new Companion(null);
        private final String locale;
        private final Map localizedStrings;

        public enum CommonLocalizedString {
            NO_THANKS,
            NO_SUBSCRIPTIONS_FOUND,
            TRY_CHECK_RESTORE,
            RESTORE_PURCHASES,
            CANCEL,
            BILLING_CYCLE,
            CURRENT_PRICE,
            EXPIRED,
            EXPIRES,
            NEXT_BILLING_DATE,
            REFUND_CANCELED,
            REFUND_ERROR_GENERIC,
            REFUND_GRANTED,
            REFUND_STATUS,
            SUB_EARLIEST_EXPIRATION,
            SUB_EARLIEST_RENEWAL,
            SUB_EXPIRED,
            CONTACT_SUPPORT,
            DEFAULT_BODY,
            DEFAULT_SUBJECT,
            DISMISS,
            UPDATE_WARNING_TITLE,
            UPDATE_WARNING_DESCRIPTION,
            UPDATE_WARNING_UPDATE,
            UPDATE_WARNING_IGNORE,
            PLEASE_CONTACT_SUPPORT,
            APPLE_SUBSCRIPTION_MANAGE,
            GOOGLE_SUBSCRIPTION_MANAGE,
            AMAZON_SUBSCRIPTION_MANAGE,
            PLATFORM_MISMATCH,
            GOING_TO_CHECK_PURCHASES,
            CHECK_PAST_PURCHASES,
            PURCHASES_RECOVERED,
            PURCHASES_RECOVERED_EXPLANATION,
            PURCHASES_NOT_RECOVERED,
            PURCHASES_NOT_FOUND,
            PURCHASES_RESTORING,
            MANAGE_SUBSCRIPTION,
            YOU_HAVE_PROMO,
            YOU_HAVE_LIFETIME,
            WEB_SUBSCRIPTION_MANAGE,
            FREE,
            NEVER,
            FREE_TRIAL_THEN_PRICE,
            SINGLE_PAYMENT_THEN_PRICE,
            DISCOUNTED_RECURRING_THEN_PRICE,
            FREE_TRIAL_SINGLE_PAYMENT_THEN_PRICE,
            FREE_TRIAL_DISCOUNTED_THEN_PRICE,
            DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE,
            FREE_TRIAL_DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE,
            DONE,
            RENEWS_ON_DATE_FOR_PRICE,
            RENEWS_ON_DATE,
            PURCHASE_INFO_EXPIRED_ON_DATE,
            PURCHASE_INFO_EXPIRES_ON_DATE,
            ACTIVE,
            BADGE_CANCELLED,
            BADGE_FREE_TRIAL,
            BADGE_FREE_TRIAL_CANCELLED,
            BADGE_LIFETIME,
            APP_STORE,
            MAC_APP_STORE,
            GOOGLE_PLAY_STORE,
            AMAZON_STORE,
            GALAXY_STORE,
            WEB_STORE,
            UNKNOWN_STORE,
            TEST_STORE,
            CARD_STORE_PROMOTIONAL,
            RESUBSCRIBE,
            TYPE_SUBSCRIPTION,
            TYPE_ONE_TIME_PURCHASE,
            BUY_SUBSCRIPTION,
            LAST_CHARGE_WAS,
            NEXT_BILLING_DATE_ON,
            SEE_ALL_VIRTUAL_CURRENCIES,
            VIRTUAL_CURRENCY_BALANCES_SCREEN_HEADER,
            NO_VIRTUAL_CURRENCY_BALANCES_FOUND,
            SUPPORT_TICKET_CREATE,
            EMAIL,
            ENTER_EMAIL,
            DESCRIPTION,
            SENT,
            SUPPORT_TICKET_FAILED,
            SUBMIT_TICKET,
            INVALID_EMAIL_ERROR,
            CHARACTERS_REMAINING;

            public static final Companion Companion = new Companion(null);
            private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

            public static final class Companion {

                public static final class 1 extends u implements a {
                    public static final 1 INSTANCE = new 1();

                    public 1() {
                        super(0);
                    }

                    public final b invoke() {
                        return A.a("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization.CommonLocalizedString", CommonLocalizedString.values(), new String[]{"no_thanks", "no_subscriptions_found", "try_check_restore", "restore_purchases", "cancel", "billing_cycle", "current_price", "expired", "expires", "next_billing_date", "refund_canceled", "refund_error_generic", "refund_granted", "refund_status", "sub_earliest_expiration", "sub_earliest_renewal", "sub_expired", "contact_support", "default_body", "default_subject", "dismiss", "update_warning_title", "update_warning_description", "update_warning_update", "update_warning_ignore", "please_contact_support", "apple_subscription_manage", "google_subscription_manage", "amazon_subscription_manage", "platform_mismatch", "going_to_check_purchases", "check_past_purchases", "purchases_recovered", "purchases_recovered_explanation", "purchases_not_recovered", "purchases_not_found", "purchases_restoring", "manage_subscription", "you_have_promo", "you_have_lifetime", "web_subscription_manage", "free", "never", "free_trial_then_price", "single_payment_then_price", "discounted_recurring_then_price", "free_trial_single_payment_then_price", "free_trial_discounted_then_price", "discounted_recurring_payment_then_price", "free_trial_discounted_recurring_payment_then_price", "done", "renews_on_date_for_price", "renews_on_date", "purchase_info_expired_on_date", "purchase_info_expires_on_date", "active", "badge_cancelled", "badge_free_trial", "badge_free_trial_cancelled", "badge_lifetime", "app_store", "mac_app_store", "google_play_store", "amazon_store", "galaxy_store", "web_store", "unknown_store", "test_store", "card_store_promotional", "resubscribe", "type_subscription", "type_one_time_purchase", "buy_subscription", "last_charge_was", "next_billing_date_on", "see_all_virtual_currencies", "virtual_currency_balances_screen_header", "no_virtual_currency_balances_found", "support_ticket_create", "email", "enter_email", "description", "sent", "support_ticket_failed", "submit_ticket", "invalid_email_error", "characters_remaining"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, (Annotation[]) null);
                    }
                }

                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                private final /* synthetic */ b get$cachedSerializer() {
                    return (b) CommonLocalizedString.access$get$cachedSerializer$delegate$cp().getValue();
                }

                public final b serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CommonLocalizedString.values().length];
                    try {
                        iArr[CommonLocalizedString.NO_THANKS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CommonLocalizedString.NO_SUBSCRIPTIONS_FOUND.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CommonLocalizedString.TRY_CHECK_RESTORE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CommonLocalizedString.RESTORE_PURCHASES.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CommonLocalizedString.CANCEL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CommonLocalizedString.BILLING_CYCLE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[CommonLocalizedString.CURRENT_PRICE.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[CommonLocalizedString.EXPIRED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[CommonLocalizedString.EXPIRES.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[CommonLocalizedString.NEXT_BILLING_DATE.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_CANCELED.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_ERROR_GENERIC.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_GRANTED.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[CommonLocalizedString.REFUND_STATUS.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUB_EARLIEST_EXPIRATION.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUB_EARLIEST_RENEWAL.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUB_EXPIRED.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[CommonLocalizedString.CONTACT_SUPPORT.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[CommonLocalizedString.DEFAULT_BODY.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[CommonLocalizedString.DEFAULT_SUBJECT.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[CommonLocalizedString.DISMISS.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_TITLE.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_DESCRIPTION.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_UPDATE.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[CommonLocalizedString.UPDATE_WARNING_IGNORE.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[CommonLocalizedString.PLATFORM_MISMATCH.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[CommonLocalizedString.PLEASE_CONTACT_SUPPORT.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[CommonLocalizedString.APPLE_SUBSCRIPTION_MANAGE.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[CommonLocalizedString.GOOGLE_SUBSCRIPTION_MANAGE.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[CommonLocalizedString.AMAZON_SUBSCRIPTION_MANAGE.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[CommonLocalizedString.GOING_TO_CHECK_PURCHASES.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[CommonLocalizedString.CHECK_PAST_PURCHASES.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_RECOVERED.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_RECOVERED_EXPLANATION.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_NOT_RECOVERED.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_NOT_FOUND.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASES_RESTORING.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[CommonLocalizedString.MANAGE_SUBSCRIPTION.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[CommonLocalizedString.YOU_HAVE_PROMO.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    try {
                        iArr[CommonLocalizedString.YOU_HAVE_LIFETIME.ordinal()] = 40;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr[CommonLocalizedString.WEB_SUBSCRIPTION_MANAGE.ordinal()] = 41;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE.ordinal()] = 42;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr[CommonLocalizedString.NEVER.ordinal()] = 43;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE_TRIAL_THEN_PRICE.ordinal()] = 44;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr[CommonLocalizedString.SINGLE_PAYMENT_THEN_PRICE.ordinal()] = 45;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr[CommonLocalizedString.DISCOUNTED_RECURRING_THEN_PRICE.ordinal()] = 46;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE_TRIAL_SINGLE_PAYMENT_THEN_PRICE.ordinal()] = 47;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE_TRIAL_DISCOUNTED_THEN_PRICE.ordinal()] = 48;
                    } catch (NoSuchFieldError unused48) {
                    }
                    try {
                        iArr[CommonLocalizedString.DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE.ordinal()] = 49;
                    } catch (NoSuchFieldError unused49) {
                    }
                    try {
                        iArr[CommonLocalizedString.FREE_TRIAL_DISCOUNTED_RECURRING_PAYMENT_THEN_PRICE.ordinal()] = 50;
                    } catch (NoSuchFieldError unused50) {
                    }
                    try {
                        iArr[CommonLocalizedString.DONE.ordinal()] = 51;
                    } catch (NoSuchFieldError unused51) {
                    }
                    try {
                        iArr[CommonLocalizedString.RENEWS_ON_DATE_FOR_PRICE.ordinal()] = 52;
                    } catch (NoSuchFieldError unused52) {
                    }
                    try {
                        iArr[CommonLocalizedString.RENEWS_ON_DATE.ordinal()] = 53;
                    } catch (NoSuchFieldError unused53) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASE_INFO_EXPIRED_ON_DATE.ordinal()] = 54;
                    } catch (NoSuchFieldError unused54) {
                    }
                    try {
                        iArr[CommonLocalizedString.PURCHASE_INFO_EXPIRES_ON_DATE.ordinal()] = 55;
                    } catch (NoSuchFieldError unused55) {
                    }
                    try {
                        iArr[CommonLocalizedString.ACTIVE.ordinal()] = 56;
                    } catch (NoSuchFieldError unused56) {
                    }
                    try {
                        iArr[CommonLocalizedString.BADGE_CANCELLED.ordinal()] = 57;
                    } catch (NoSuchFieldError unused57) {
                    }
                    try {
                        iArr[CommonLocalizedString.BADGE_FREE_TRIAL.ordinal()] = 58;
                    } catch (NoSuchFieldError unused58) {
                    }
                    try {
                        iArr[CommonLocalizedString.BADGE_FREE_TRIAL_CANCELLED.ordinal()] = 59;
                    } catch (NoSuchFieldError unused59) {
                    }
                    try {
                        iArr[CommonLocalizedString.BADGE_LIFETIME.ordinal()] = 60;
                    } catch (NoSuchFieldError unused60) {
                    }
                    try {
                        iArr[CommonLocalizedString.APP_STORE.ordinal()] = 61;
                    } catch (NoSuchFieldError unused61) {
                    }
                    try {
                        iArr[CommonLocalizedString.MAC_APP_STORE.ordinal()] = 62;
                    } catch (NoSuchFieldError unused62) {
                    }
                    try {
                        iArr[CommonLocalizedString.GOOGLE_PLAY_STORE.ordinal()] = 63;
                    } catch (NoSuchFieldError unused63) {
                    }
                    try {
                        iArr[CommonLocalizedString.AMAZON_STORE.ordinal()] = 64;
                    } catch (NoSuchFieldError unused64) {
                    }
                    try {
                        iArr[CommonLocalizedString.GALAXY_STORE.ordinal()] = 65;
                    } catch (NoSuchFieldError unused65) {
                    }
                    try {
                        iArr[CommonLocalizedString.WEB_STORE.ordinal()] = 66;
                    } catch (NoSuchFieldError unused66) {
                    }
                    try {
                        iArr[CommonLocalizedString.UNKNOWN_STORE.ordinal()] = 67;
                    } catch (NoSuchFieldError unused67) {
                    }
                    try {
                        iArr[CommonLocalizedString.TEST_STORE.ordinal()] = 68;
                    } catch (NoSuchFieldError unused68) {
                    }
                    try {
                        iArr[CommonLocalizedString.CARD_STORE_PROMOTIONAL.ordinal()] = 69;
                    } catch (NoSuchFieldError unused69) {
                    }
                    try {
                        iArr[CommonLocalizedString.RESUBSCRIBE.ordinal()] = 70;
                    } catch (NoSuchFieldError unused70) {
                    }
                    try {
                        iArr[CommonLocalizedString.TYPE_SUBSCRIPTION.ordinal()] = 71;
                    } catch (NoSuchFieldError unused71) {
                    }
                    try {
                        iArr[CommonLocalizedString.TYPE_ONE_TIME_PURCHASE.ordinal()] = 72;
                    } catch (NoSuchFieldError unused72) {
                    }
                    try {
                        iArr[CommonLocalizedString.BUY_SUBSCRIPTION.ordinal()] = 73;
                    } catch (NoSuchFieldError unused73) {
                    }
                    try {
                        iArr[CommonLocalizedString.LAST_CHARGE_WAS.ordinal()] = 74;
                    } catch (NoSuchFieldError unused74) {
                    }
                    try {
                        iArr[CommonLocalizedString.NEXT_BILLING_DATE_ON.ordinal()] = 75;
                    } catch (NoSuchFieldError unused75) {
                    }
                    try {
                        iArr[CommonLocalizedString.SEE_ALL_VIRTUAL_CURRENCIES.ordinal()] = 76;
                    } catch (NoSuchFieldError unused76) {
                    }
                    try {
                        iArr[CommonLocalizedString.VIRTUAL_CURRENCY_BALANCES_SCREEN_HEADER.ordinal()] = 77;
                    } catch (NoSuchFieldError unused77) {
                    }
                    try {
                        iArr[CommonLocalizedString.NO_VIRTUAL_CURRENCY_BALANCES_FOUND.ordinal()] = 78;
                    } catch (NoSuchFieldError unused78) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUPPORT_TICKET_CREATE.ordinal()] = 79;
                    } catch (NoSuchFieldError unused79) {
                    }
                    try {
                        iArr[CommonLocalizedString.EMAIL.ordinal()] = 80;
                    } catch (NoSuchFieldError unused80) {
                    }
                    try {
                        iArr[CommonLocalizedString.ENTER_EMAIL.ordinal()] = 81;
                    } catch (NoSuchFieldError unused81) {
                    }
                    try {
                        iArr[CommonLocalizedString.DESCRIPTION.ordinal()] = 82;
                    } catch (NoSuchFieldError unused82) {
                    }
                    try {
                        iArr[CommonLocalizedString.SENT.ordinal()] = 83;
                    } catch (NoSuchFieldError unused83) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUPPORT_TICKET_FAILED.ordinal()] = 84;
                    } catch (NoSuchFieldError unused84) {
                    }
                    try {
                        iArr[CommonLocalizedString.SUBMIT_TICKET.ordinal()] = 85;
                    } catch (NoSuchFieldError unused85) {
                    }
                    try {
                        iArr[CommonLocalizedString.INVALID_EMAIL_ERROR.ordinal()] = 86;
                    } catch (NoSuchFieldError unused86) {
                    }
                    try {
                        iArr[CommonLocalizedString.CHARACTERS_REMAINING.ordinal()] = 87;
                    } catch (NoSuchFieldError unused87) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public static final /* synthetic */ l access$get$cachedSerializer$delegate$cp() {
                return $cachedSerializer$delegate;
            }

            public final String getDefaultValue() {
                switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                    case 1:
                        return "No, thanks";
                    case 2:
                        return "No Subscriptions found";
                    case 3:
                        return "We can try checking your Apple account for any previous purchases";
                    case 4:
                        return "Restore purchases";
                    case 5:
                        return "Cancel";
                    case 6:
                        return "Billing cycle";
                    case 7:
                        return "Current price";
                    case 8:
                        return "Expired";
                    case 9:
                        return "Expires";
                    case 10:
                        return "Next billing date";
                    case 11:
                        return "Refund canceled";
                    case 12:
                        return "An error occurred while processing the refund request. Please try again.";
                    case 13:
                        return "Refund granted successfully!";
                    case 14:
                        return "Refund status";
                    case 15:
                        return "This is your subscription with the earliest expiration date.";
                    case 16:
                        return "This is your subscription with the earliest billing date.";
                    case 17:
                        return "This subscription has expired.";
                    case 18:
                        return "Contact support";
                    case 19:
                        return "Please describe your issue or question.";
                    case 20:
                        return "Support Request";
                    case 21:
                        return "Dismiss";
                    case 22:
                        return "Update available";
                    case 23:
                        return "Downloading the latest version of the app may help solve the problem.";
                    case 24:
                        return "Update";
                    case 25:
                        return "Continue";
                    case 26:
                        return "Platform mismatch";
                    case 27:
                        return "Please contact support to manage your subscription.";
                    case 28:
                        return "You can manage your subscription by using the App Store app on an Apple device.";
                    case 29:
                        return "You have an active subscription from the Google Play Store";
                    case 30:
                        return "You have an active subscription from the Amazon Appstore. You can manage your subscription in the Amazon Appstore app.";
                    case 31:
                        return "Let's take a look! We're going to check your account for missing purchases.";
                    case 32:
                        return "Check past purchases";
                    case 33:
                        return "Purchases restored";
                    case 34:
                        return "We restored your past purchases and applied them to your account.";
                    case 35:
                        return "We could not find any purchases with your account. If you think this is an error, please contact support.";
                    case 36:
                        return "No past purchases";
                    case 37:
                        return "Restoring...";
                    case 38:
                        return "Manage your subscription";
                    case 39:
                        return "You've been granted a subscription that doesn't renew";
                    case 40:
                        return "Your active lifetime subscription";
                    case 41:
                        return "You have an active subscription that was purchased on the web. You can manage your subscription using the button below.";
                    case 42:
                        return "Free";
                    case 43:
                        return "Never";
                    case 44:
                        return "First {{ sub_offer_duration }} free, then {{ price }}";
                    case 45:
                        return "{{ sub_offer_duration }} for {{ sub_offer_price }}, then {{ price }}";
                    case 46:
                        return "{{ sub_offer_price }} during {{ sub_offer_duration }}, then {{ price }}";
                    case 47:
                        return "Try {{ sub_offer_duration }} for free, then {{ sub_offer_duration_2 }} for {{ sub_offer_price_2 }}, and {{ price }} thereafter";
                    case 48:
                        return "Try {{ sub_offer_duration }} for free, then {{ sub_offer_price_2 }} during {{ sub_offer_duration_2 }}, and {{ price }} thereafter";
                    case 49:
                        return "{{ discounted_recurring_payment_price_per_period }} for {{ discounted_recurring_payment_cycles }} periods, then {{ price }}";
                    case 50:
                        return "Try {{ sub_offer_duration }} for free, then {{ discounted_recurring_payment_price_per_period }} for {{ discounted_recurring_payment_cycles }} periods, and {{ price }} thereafter";
                    case 51:
                        return "Done";
                    case 52:
                        return "Your next charge is {{ price }} on {{ date }}.";
                    case 53:
                        return "Renews on {{ date }}";
                    case 54:
                        return "Expired on {{ date }}";
                    case 55:
                        return "Expires on {{ date }}";
                    case 56:
                        return "Active";
                    case 57:
                        return "Cancelled";
                    case 58:
                        return "Free Trial";
                    case 59:
                        return "Cancelled Trial";
                    case 60:
                        return "Lifetime";
                    case 61:
                        return "App Store";
                    case 62:
                        return "Mac App Store";
                    case 63:
                        return "Google Play Store";
                    case 64:
                        return "Amazon Store";
                    case 65:
                        return "Galaxy Store";
                    case 66:
                        return "Web";
                    case 67:
                        return "Unknown";
                    case 68:
                        return "Test Store";
                    case 69:
                        return "Via Support";
                    case 70:
                        return "Resubscribe";
                    case 71:
                        return "Subscription";
                    case 72:
                        return "One time purchase";
                    case 73:
                        return "Buy Subscription";
                    case 74:
                        return "Last charge: {{ price }}";
                    case 75:
                        return "Next billing date: {{ date }}";
                    case 76:
                        return "See all in-app currencies";
                    case 77:
                        return "In-App Currencies";
                    case 78:
                        return "It doesn't look like you've purchased any in-app currencies.";
                    case 79:
                        return "Create a support ticket";
                    case 80:
                        return "Email";
                    case 81:
                        return "Enter your email";
                    case 82:
                        return "Description";
                    case 83:
                        return "Message sent";
                    case 84:
                        return "Failed to send, please try again.";
                    case 85:
                        return "Submit ticket";
                    case 86:
                        return "Please enter a valid email address";
                    case 87:
                        return "{{ count }} characters";
                    default:
                        throw new o();
                }
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return CustomerCenterConfigData$Localization$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public enum VariableName {
            PRICE("price"),
            SUB_OFFER_DURATION("sub_offer_duration"),
            SUB_OFFER_DURATION_2("sub_offer_duration_2"),
            SUB_OFFER_PRICE("sub_offer_price"),
            SUB_OFFER_PRICE_2("sub_offer_price_2"),
            DISCOUNTED_RECURRING_PAYMENT_PRICE_PER_PERIOD("discounted_recurring_payment_price_per_period"),
            DISCOUNTED_RECURRING_PAYMENT_CYCLES("discounted_recurring_payment_cycles");

            private final String identifier;
            public static final Companion Companion = new Companion(null);
            private static final l valueMap$delegate = m.b(CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2.INSTANCE);

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                private final Map getValueMap() {
                    return (Map) VariableName.access$getValueMap$delegate$cp().getValue();
                }

                public final VariableName valueOfIdentifier(String str) {
                    t.g(str, "identifier");
                    return (VariableName) getValueMap().get(str);
                }

                private Companion() {
                }
            }

            VariableName(String str) {
                this.identifier = str;
            }

            public static final /* synthetic */ l access$getValueMap$delegate$cp() {
                return valueMap$delegate;
            }

            public final String getIdentifier() {
                return this.identifier;
            }
        }

        static {
            x0 x0Var = x0.a;
            $childSerializers = new b[]{null, new M(x0Var, x0Var)};
        }

        @Ca.e
        public /* synthetic */ Localization(int i, String str, Map map, t0 t0Var) {
            if (3 != (i & 3)) {
                f0.a(i, 3, CustomerCenterConfigData$Localization$$serializer.INSTANCE.getDescriptor());
            }
            this.locale = str;
            this.localizedStrings = map;
        }

        public static final /* synthetic */ b[] access$get$childSerializers$cp() {
            return $childSerializers;
        }

        public static /* synthetic */ Localization copy$default(Localization localization, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = localization.locale;
            }
            if ((i & 2) != 0) {
                map = localization.localizedStrings;
            }
            return localization.copy(str, map);
        }

        public static /* synthetic */ void getLocalizedStrings$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Localization localization, d dVar, e eVar) {
            ob.k[] kVarArr = $childSerializers;
            dVar.v(eVar, 0, localization.locale);
            dVar.k(eVar, 1, kVarArr[1], localization.localizedStrings);
        }

        public final String commonLocalizedString(CommonLocalizedString commonLocalizedString) {
            t.g(commonLocalizedString, "key");
            Map map = this.localizedStrings;
            String lowerCase = commonLocalizedString.name().toLowerCase(Locale.ROOT);
            t.f(lowerCase, "toLowerCase(...)");
            String str = (String) map.get(lowerCase);
            return str == null ? commonLocalizedString.getDefaultValue() : str;
        }

        public final String component1() {
            return this.locale;
        }

        public final Map component2() {
            return this.localizedStrings;
        }

        public final Localization copy(String str, Map map) {
            t.g(str, "locale");
            t.g(map, "localizedStrings");
            return new Localization(str, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Localization)) {
                return false;
            }
            Localization localization = (Localization) obj;
            return t.c(this.locale, localization.locale) && t.c(this.localizedStrings, localization.localizedStrings);
        }

        public final String getLocale() {
            return this.locale;
        }

        public final Map getLocalizedStrings() {
            return this.localizedStrings;
        }

        public int hashCode() {
            return (this.locale.hashCode() * 31) + this.localizedStrings.hashCode();
        }

        public String toString() {
            return "Localization(locale=" + this.locale + ", localizedStrings=" + this.localizedStrings + ')';
        }

        public Localization(String str, Map map) {
            t.g(str, "locale");
            t.g(map, "localizedStrings");
            this.locale = str;
            this.localizedStrings = map;
        }
    }

    public static final class Screen {
        private final ScreenOffering offering;
        private final List paths;
        private final String subtitle;
        private final String title;
        private final ScreenType type;
        public static final Companion Companion = new Companion(null);
        private static final b[] $childSerializers = {ScreenType.Companion.serializer(), null, null, null, null};

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return CustomerCenterConfigData$Screen$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public enum ScreenType {
            MANAGEMENT,
            NO_ACTIVE,
            UNKNOWN;

            public static final Companion Companion = new Companion(null);
            private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

            public static final class Companion {

                public static final class 1 extends u implements a {
                    public static final 1 INSTANCE = new 1();

                    public 1() {
                        super(0);
                    }

                    public final b invoke() {
                        return A.b("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen.ScreenType", ScreenType.values());
                    }
                }

                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                private final /* synthetic */ b get$cachedSerializer() {
                    return (b) ScreenType.access$get$cachedSerializer$delegate$cp().getValue();
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

        @Ca.e
        public /* synthetic */ Screen(int i, ScreenType screenType, String str, String str2, List list, ScreenOffering screenOffering, t0 t0Var) {
            if (11 != (i & 11)) {
                f0.a(i, 11, CustomerCenterConfigData$Screen$$serializer.INSTANCE.getDescriptor());
            }
            this.type = screenType;
            this.title = str;
            if ((i & 4) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            this.paths = list;
            if ((i & 16) == 0) {
                this.offering = null;
            } else {
                this.offering = screenOffering;
            }
        }

        public static final /* synthetic */ b[] access$get$childSerializers$cp() {
            return $childSerializers;
        }

        public static /* synthetic */ Screen copy$default(Screen screen, ScreenType screenType, String str, String str2, List list, ScreenOffering screenOffering, int i, Object obj) {
            if ((i & 1) != 0) {
                screenType = screen.type;
            }
            if ((i & 2) != 0) {
                str = screen.title;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = screen.subtitle;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                list = screen.paths;
            }
            List list2 = list;
            if ((i & 16) != 0) {
                screenOffering = screen.offering;
            }
            return screen.copy(screenType, str3, str4, list2, screenOffering);
        }

        public static /* synthetic */ void getPaths$annotations() {
        }

        public static /* synthetic */ void getSubtitle$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Screen screen, d dVar, e eVar) {
            dVar.k(eVar, 0, $childSerializers[0], screen.type);
            dVar.v(eVar, 1, screen.title);
            if (dVar.e(eVar, 2) || screen.subtitle != null) {
                dVar.j(eVar, 2, EmptyStringToNullSerializer.INSTANCE, screen.subtitle);
            }
            dVar.k(eVar, 3, HelpPathsSerializer.INSTANCE, screen.paths);
            if (!dVar.e(eVar, 4) && screen.offering == null) {
                return;
            }
            dVar.j(eVar, 4, CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE, screen.offering);
        }

        public final ScreenType component1() {
            return this.type;
        }

        public final String component2() {
            return this.title;
        }

        public final String component3() {
            return this.subtitle;
        }

        public final List component4() {
            return this.paths;
        }

        public final ScreenOffering component5() {
            return this.offering;
        }

        public final Screen copy(ScreenType screenType, String str, String str2, List list, ScreenOffering screenOffering) {
            t.g(screenType, "type");
            t.g(str, "title");
            t.g(list, "paths");
            return new Screen(screenType, str, str2, list, screenOffering);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Screen)) {
                return false;
            }
            Screen screen = (Screen) obj;
            return this.type == screen.type && t.c(this.title, screen.title) && t.c(this.subtitle, screen.subtitle) && t.c(this.paths, screen.paths) && t.c(this.offering, screen.offering);
        }

        public final ScreenOffering getOffering() {
            return this.offering;
        }

        public final List getPaths() {
            return this.paths;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final ScreenType getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = ((this.type.hashCode() * 31) + this.title.hashCode()) * 31;
            String str = this.subtitle;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.paths.hashCode()) * 31;
            ScreenOffering screenOffering = this.offering;
            return hashCode2 + (screenOffering != null ? screenOffering.hashCode() : 0);
        }

        public String toString() {
            return "Screen(type=" + this.type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", paths=" + this.paths + ", offering=" + this.offering + ')';
        }

        public Screen(ScreenType screenType, String str, String str2, List list, ScreenOffering screenOffering) {
            t.g(screenType, "type");
            t.g(str, "title");
            t.g(list, "paths");
            this.type = screenType;
            this.title = str;
            this.subtitle = str2;
            this.paths = list;
            this.offering = screenOffering;
        }

        public /* synthetic */ Screen(ScreenType screenType, String str, String str2, List list, ScreenOffering screenOffering, int i, k kVar) {
            this(screenType, str, (i & 4) != 0 ? null : str2, list, (i & 16) != 0 ? null : screenOffering);
        }
    }

    public static final class ScreenOffering {
        private final String buttonText;
        private final String offeringId;
        private final ScreenOfferingType type;
        public static final Companion Companion = new Companion(null);
        private static final b[] $childSerializers = {ScreenOfferingType.Companion.serializer(), null, null};

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public enum ScreenOfferingType {
            CURRENT("CURRENT"),
            SPECIFIC("SPECIFIC");

            private final String value;
            public static final Companion Companion = new Companion(null);
            private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

            public static final class Companion {

                public static final class 1 extends u implements a {
                    public static final 1 INSTANCE = new 1();

                    public 1() {
                        super(0);
                    }

                    public final b invoke() {
                        return A.a("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.ScreenOffering.ScreenOfferingType", ScreenOfferingType.values(), new String[]{"CURRENT", "SPECIFIC"}, new Annotation[][]{null, null}, (Annotation[]) null);
                    }
                }

                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                private final /* synthetic */ b get$cachedSerializer() {
                    return (b) ScreenOfferingType.access$get$cachedSerializer$delegate$cp().getValue();
                }

                public final b serializer() {
                    return get$cachedSerializer();
                }

                private Companion() {
                }
            }

            ScreenOfferingType(String str) {
                this.value = str;
            }

            public static final /* synthetic */ l access$get$cachedSerializer$delegate$cp() {
                return $cachedSerializer$delegate;
            }

            public final String getValue() {
                return this.value;
            }
        }

        @Ca.e
        public /* synthetic */ ScreenOffering(int i, ScreenOfferingType screenOfferingType, String str, String str2, t0 t0Var) {
            if (1 != (i & 1)) {
                f0.a(i, 1, CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE.getDescriptor());
            }
            this.type = screenOfferingType;
            if ((i & 2) == 0) {
                this.offeringId = null;
            } else {
                this.offeringId = str;
            }
            if ((i & 4) == 0) {
                this.buttonText = null;
            } else {
                this.buttonText = str2;
            }
        }

        public static final /* synthetic */ b[] access$get$childSerializers$cp() {
            return $childSerializers;
        }

        public static /* synthetic */ ScreenOffering copy$default(ScreenOffering screenOffering, ScreenOfferingType screenOfferingType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                screenOfferingType = screenOffering.type;
            }
            if ((i & 2) != 0) {
                str = screenOffering.offeringId;
            }
            if ((i & 4) != 0) {
                str2 = screenOffering.buttonText;
            }
            return screenOffering.copy(screenOfferingType, str, str2);
        }

        public static /* synthetic */ void getButtonText$annotations() {
        }

        public static /* synthetic */ void getOfferingId$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ScreenOffering screenOffering, d dVar, e eVar) {
            dVar.k(eVar, 0, $childSerializers[0], screenOffering.type);
            if (dVar.e(eVar, 1) || screenOffering.offeringId != null) {
                dVar.j(eVar, 1, x0.a, screenOffering.offeringId);
            }
            if (!dVar.e(eVar, 2) && screenOffering.buttonText == null) {
                return;
            }
            dVar.j(eVar, 2, x0.a, screenOffering.buttonText);
        }

        public final ScreenOfferingType component1() {
            return this.type;
        }

        public final String component2() {
            return this.offeringId;
        }

        public final String component3() {
            return this.buttonText;
        }

        public final ScreenOffering copy(ScreenOfferingType screenOfferingType, String str, String str2) {
            t.g(screenOfferingType, "type");
            return new ScreenOffering(screenOfferingType, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenOffering)) {
                return false;
            }
            ScreenOffering screenOffering = (ScreenOffering) obj;
            return this.type == screenOffering.type && t.c(this.offeringId, screenOffering.offeringId) && t.c(this.buttonText, screenOffering.buttonText);
        }

        public final String getButtonText() {
            return this.buttonText;
        }

        public final String getOfferingId() {
            return this.offeringId;
        }

        public final ScreenOfferingType getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.offeringId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.buttonText;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ScreenOffering(type=" + this.type + ", offeringId=" + this.offeringId + ", buttonText=" + this.buttonText + ')';
        }

        public ScreenOffering(ScreenOfferingType screenOfferingType, String str, String str2) {
            t.g(screenOfferingType, "type");
            this.type = screenOfferingType;
            this.offeringId = str;
            this.buttonText = str2;
        }

        public /* synthetic */ ScreenOffering(ScreenOfferingType screenOfferingType, String str, String str2, int i, k kVar) {
            this(screenOfferingType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }
    }

    public static final class Support {
        public static final Companion Companion = new Companion(null);
        private final Boolean displayVirtualCurrencies;
        private final String email;
        private final Boolean shouldWarnCustomerToUpdate;
        private final SupportTickets supportTickets;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return CustomerCenterConfigData$Support$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public static final class SupportTickets {
            private final boolean allowCreation;
            private final CustomerDetails customerDetails;
            private final CustomerType customerType;
            public static final Companion Companion = new Companion(null);
            private static final b[] $childSerializers = {null, null, CustomerType.Companion.serializer()};

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return CustomerCenterConfigData$Support$SupportTickets$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public static final class CustomerDetails {
                public static final Companion Companion = new Companion(null);
                private final boolean activeEntitlements;
                private final boolean appUserId;
                private final boolean attConsent;
                private final boolean country;
                private final boolean deviceVersion;
                private final boolean email;
                private final boolean facebookAnonId;
                private final boolean idfa;
                private final boolean idfv;
                private final boolean ip;
                private final boolean lastOpened;
                private final boolean lastSeenAppVersion;
                private final boolean totalSpent;
                private final boolean userSince;

                public static final class Companion {
                    public /* synthetic */ Companion(k kVar) {
                        this();
                    }

                    public final b serializer() {
                        return CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public CustomerDetails() {
                    this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, 16383, (k) null);
                }

                public static /* synthetic */ CustomerDetails copy$default(CustomerDetails customerDetails, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i, Object obj) {
                    return customerDetails.copy((i & 1) != 0 ? customerDetails.activeEntitlements : z, (i & 2) != 0 ? customerDetails.appUserId : z2, (i & 4) != 0 ? customerDetails.attConsent : z3, (i & 8) != 0 ? customerDetails.country : z4, (i & 16) != 0 ? customerDetails.deviceVersion : z5, (i & 32) != 0 ? customerDetails.email : z6, (i & 64) != 0 ? customerDetails.facebookAnonId : z7, (i & 128) != 0 ? customerDetails.idfa : z8, (i & 256) != 0 ? customerDetails.idfv : z9, (i & 512) != 0 ? customerDetails.ip : z10, (i & 1024) != 0 ? customerDetails.lastOpened : z11, (i & 2048) != 0 ? customerDetails.lastSeenAppVersion : z12, (i & 4096) != 0 ? customerDetails.totalSpent : z13, (i & 8192) != 0 ? customerDetails.userSince : z14);
                }

                public static /* synthetic */ void getActiveEntitlements$annotations() {
                }

                public static /* synthetic */ void getAppUserId$annotations() {
                }

                public static /* synthetic */ void getAttConsent$annotations() {
                }

                public static /* synthetic */ void getDeviceVersion$annotations() {
                }

                public static /* synthetic */ void getFacebookAnonId$annotations() {
                }

                public static /* synthetic */ void getLastOpened$annotations() {
                }

                public static /* synthetic */ void getLastSeenAppVersion$annotations() {
                }

                public static /* synthetic */ void getTotalSpent$annotations() {
                }

                public static /* synthetic */ void getUserSince$annotations() {
                }

                public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CustomerDetails customerDetails, d dVar, e eVar) {
                    if (dVar.e(eVar, 0) || customerDetails.activeEntitlements) {
                        dVar.B(eVar, 0, customerDetails.activeEntitlements);
                    }
                    if (dVar.e(eVar, 1) || customerDetails.appUserId) {
                        dVar.B(eVar, 1, customerDetails.appUserId);
                    }
                    if (dVar.e(eVar, 2) || customerDetails.attConsent) {
                        dVar.B(eVar, 2, customerDetails.attConsent);
                    }
                    if (dVar.e(eVar, 3) || customerDetails.country) {
                        dVar.B(eVar, 3, customerDetails.country);
                    }
                    if (dVar.e(eVar, 4) || customerDetails.deviceVersion) {
                        dVar.B(eVar, 4, customerDetails.deviceVersion);
                    }
                    if (dVar.e(eVar, 5) || customerDetails.email) {
                        dVar.B(eVar, 5, customerDetails.email);
                    }
                    if (dVar.e(eVar, 6) || customerDetails.facebookAnonId) {
                        dVar.B(eVar, 6, customerDetails.facebookAnonId);
                    }
                    if (dVar.e(eVar, 7) || customerDetails.idfa) {
                        dVar.B(eVar, 7, customerDetails.idfa);
                    }
                    if (dVar.e(eVar, 8) || customerDetails.idfv) {
                        dVar.B(eVar, 8, customerDetails.idfv);
                    }
                    if (dVar.e(eVar, 9) || customerDetails.ip) {
                        dVar.B(eVar, 9, customerDetails.ip);
                    }
                    if (dVar.e(eVar, 10) || customerDetails.lastOpened) {
                        dVar.B(eVar, 10, customerDetails.lastOpened);
                    }
                    if (dVar.e(eVar, 11) || customerDetails.lastSeenAppVersion) {
                        dVar.B(eVar, 11, customerDetails.lastSeenAppVersion);
                    }
                    if (dVar.e(eVar, 12) || customerDetails.totalSpent) {
                        dVar.B(eVar, 12, customerDetails.totalSpent);
                    }
                    if (dVar.e(eVar, 13) || customerDetails.userSince) {
                        dVar.B(eVar, 13, customerDetails.userSince);
                    }
                }

                public final boolean component1() {
                    return this.activeEntitlements;
                }

                public final boolean component10() {
                    return this.ip;
                }

                public final boolean component11() {
                    return this.lastOpened;
                }

                public final boolean component12() {
                    return this.lastSeenAppVersion;
                }

                public final boolean component13() {
                    return this.totalSpent;
                }

                public final boolean component14() {
                    return this.userSince;
                }

                public final boolean component2() {
                    return this.appUserId;
                }

                public final boolean component3() {
                    return this.attConsent;
                }

                public final boolean component4() {
                    return this.country;
                }

                public final boolean component5() {
                    return this.deviceVersion;
                }

                public final boolean component6() {
                    return this.email;
                }

                public final boolean component7() {
                    return this.facebookAnonId;
                }

                public final boolean component8() {
                    return this.idfa;
                }

                public final boolean component9() {
                    return this.idfv;
                }

                public final CustomerDetails copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
                    return new CustomerDetails(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CustomerDetails)) {
                        return false;
                    }
                    CustomerDetails customerDetails = (CustomerDetails) obj;
                    return this.activeEntitlements == customerDetails.activeEntitlements && this.appUserId == customerDetails.appUserId && this.attConsent == customerDetails.attConsent && this.country == customerDetails.country && this.deviceVersion == customerDetails.deviceVersion && this.email == customerDetails.email && this.facebookAnonId == customerDetails.facebookAnonId && this.idfa == customerDetails.idfa && this.idfv == customerDetails.idfv && this.ip == customerDetails.ip && this.lastOpened == customerDetails.lastOpened && this.lastSeenAppVersion == customerDetails.lastSeenAppVersion && this.totalSpent == customerDetails.totalSpent && this.userSince == customerDetails.userSince;
                }

                public final boolean getActiveEntitlements() {
                    return this.activeEntitlements;
                }

                public final boolean getAppUserId() {
                    return this.appUserId;
                }

                public final boolean getAttConsent() {
                    return this.attConsent;
                }

                public final boolean getCountry() {
                    return this.country;
                }

                public final boolean getDeviceVersion() {
                    return this.deviceVersion;
                }

                public final boolean getEmail() {
                    return this.email;
                }

                public final boolean getFacebookAnonId() {
                    return this.facebookAnonId;
                }

                public final boolean getIdfa() {
                    return this.idfa;
                }

                public final boolean getIdfv() {
                    return this.idfv;
                }

                public final boolean getIp() {
                    return this.ip;
                }

                public final boolean getLastOpened() {
                    return this.lastOpened;
                }

                public final boolean getLastSeenAppVersion() {
                    return this.lastSeenAppVersion;
                }

                public final boolean getTotalSpent() {
                    return this.totalSpent;
                }

                public final boolean getUserSince() {
                    return this.userSince;
                }

                public int hashCode() {
                    return (((((((((((((((((((((((((Boolean.hashCode(this.activeEntitlements) * 31) + Boolean.hashCode(this.appUserId)) * 31) + Boolean.hashCode(this.attConsent)) * 31) + Boolean.hashCode(this.country)) * 31) + Boolean.hashCode(this.deviceVersion)) * 31) + Boolean.hashCode(this.email)) * 31) + Boolean.hashCode(this.facebookAnonId)) * 31) + Boolean.hashCode(this.idfa)) * 31) + Boolean.hashCode(this.idfv)) * 31) + Boolean.hashCode(this.ip)) * 31) + Boolean.hashCode(this.lastOpened)) * 31) + Boolean.hashCode(this.lastSeenAppVersion)) * 31) + Boolean.hashCode(this.totalSpent)) * 31) + Boolean.hashCode(this.userSince);
                }

                public String toString() {
                    return "CustomerDetails(activeEntitlements=" + this.activeEntitlements + ", appUserId=" + this.appUserId + ", attConsent=" + this.attConsent + ", country=" + this.country + ", deviceVersion=" + this.deviceVersion + ", email=" + this.email + ", facebookAnonId=" + this.facebookAnonId + ", idfa=" + this.idfa + ", idfv=" + this.idfv + ", ip=" + this.ip + ", lastOpened=" + this.lastOpened + ", lastSeenAppVersion=" + this.lastSeenAppVersion + ", totalSpent=" + this.totalSpent + ", userSince=" + this.userSince + ')';
                }

                @Ca.e
                public /* synthetic */ CustomerDetails(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, t0 t0Var) {
                    if ((i & 1) == 0) {
                        this.activeEntitlements = false;
                    } else {
                        this.activeEntitlements = z;
                    }
                    if ((i & 2) == 0) {
                        this.appUserId = false;
                    } else {
                        this.appUserId = z2;
                    }
                    if ((i & 4) == 0) {
                        this.attConsent = false;
                    } else {
                        this.attConsent = z3;
                    }
                    if ((i & 8) == 0) {
                        this.country = false;
                    } else {
                        this.country = z4;
                    }
                    if ((i & 16) == 0) {
                        this.deviceVersion = false;
                    } else {
                        this.deviceVersion = z5;
                    }
                    if ((i & 32) == 0) {
                        this.email = false;
                    } else {
                        this.email = z6;
                    }
                    if ((i & 64) == 0) {
                        this.facebookAnonId = false;
                    } else {
                        this.facebookAnonId = z7;
                    }
                    if ((i & 128) == 0) {
                        this.idfa = false;
                    } else {
                        this.idfa = z8;
                    }
                    if ((i & 256) == 0) {
                        this.idfv = false;
                    } else {
                        this.idfv = z9;
                    }
                    if ((i & 512) == 0) {
                        this.ip = false;
                    } else {
                        this.ip = z10;
                    }
                    if ((i & 1024) == 0) {
                        this.lastOpened = false;
                    } else {
                        this.lastOpened = z11;
                    }
                    if ((i & 2048) == 0) {
                        this.lastSeenAppVersion = false;
                    } else {
                        this.lastSeenAppVersion = z12;
                    }
                    if ((i & 4096) == 0) {
                        this.totalSpent = false;
                    } else {
                        this.totalSpent = z13;
                    }
                    if ((i & 8192) == 0) {
                        this.userSince = false;
                    } else {
                        this.userSince = z14;
                    }
                }

                public CustomerDetails(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
                    this.activeEntitlements = z;
                    this.appUserId = z2;
                    this.attConsent = z3;
                    this.country = z4;
                    this.deviceVersion = z5;
                    this.email = z6;
                    this.facebookAnonId = z7;
                    this.idfa = z8;
                    this.idfv = z9;
                    this.ip = z10;
                    this.lastOpened = z11;
                    this.lastSeenAppVersion = z12;
                    this.totalSpent = z13;
                    this.userSince = z14;
                }

                public /* synthetic */ CustomerDetails(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i, k kVar) {
                    this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? false : z8, (i & 256) != 0 ? false : z9, (i & 512) != 0 ? false : z10, (i & 1024) != 0 ? false : z11, (i & 2048) != 0 ? false : z12, (i & 4096) != 0 ? false : z13, (i & 8192) == 0 ? z14 : false);
                }
            }

            public enum CustomerType {
                NOT_ACTIVE,
                NONE,
                ALL,
                ACTIVE;

                public static final Companion Companion = new Companion(null);
                private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

                public static final class Companion {

                    public static final class 1 extends u implements a {
                        public static final 1 INSTANCE = new 1();

                        public 1() {
                            super(0);
                        }

                        public final b invoke() {
                            return A.a("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets.CustomerType", CustomerType.values(), new String[]{"not_active", "none", "all", "active"}, new Annotation[][]{null, null, null, null}, (Annotation[]) null);
                        }
                    }

                    public /* synthetic */ Companion(k kVar) {
                        this();
                    }

                    private final /* synthetic */ b get$cachedSerializer() {
                        return (b) CustomerType.access$get$cachedSerializer$delegate$cp().getValue();
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

            public SupportTickets() {
                this(false, (CustomerDetails) null, (CustomerType) null, 7, (k) null);
            }

            public static final /* synthetic */ b[] access$get$childSerializers$cp() {
                return $childSerializers;
            }

            public static /* synthetic */ SupportTickets copy$default(SupportTickets supportTickets, boolean z, CustomerDetails customerDetails, CustomerType customerType, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = supportTickets.allowCreation;
                }
                if ((i & 2) != 0) {
                    customerDetails = supportTickets.customerDetails;
                }
                if ((i & 4) != 0) {
                    customerType = supportTickets.customerType;
                }
                return supportTickets.copy(z, customerDetails, customerType);
            }

            public static /* synthetic */ void getAllowCreation$annotations() {
            }

            public static /* synthetic */ void getCustomerDetails$annotations() {
            }

            public static /* synthetic */ void getCustomerType$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(SupportTickets supportTickets, d dVar, e eVar) {
                ob.k[] kVarArr = $childSerializers;
                if (dVar.e(eVar, 0) || supportTickets.allowCreation) {
                    dVar.B(eVar, 0, supportTickets.allowCreation);
                }
                if (dVar.e(eVar, 1) || !t.c(supportTickets.customerDetails, new CustomerDetails(false, false, false, false, false, false, false, false, false, false, false, false, false, false, 16383, (k) null))) {
                    dVar.k(eVar, 1, CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer.INSTANCE, supportTickets.customerDetails);
                }
                if (!dVar.e(eVar, 2) && supportTickets.customerType == CustomerType.NOT_ACTIVE) {
                    return;
                }
                dVar.k(eVar, 2, kVarArr[2], supportTickets.customerType);
            }

            public final boolean allowsActiveCustomers() {
                CustomerType customerType = this.customerType;
                return customerType == CustomerType.ALL || customerType == CustomerType.ACTIVE;
            }

            public final boolean allowsNonActiveCustomers() {
                CustomerType customerType = this.customerType;
                return customerType == CustomerType.ALL || customerType == CustomerType.NOT_ACTIVE;
            }

            public final boolean component1() {
                return this.allowCreation;
            }

            public final CustomerDetails component2() {
                return this.customerDetails;
            }

            public final CustomerType component3() {
                return this.customerType;
            }

            public final SupportTickets copy(boolean z, CustomerDetails customerDetails, CustomerType customerType) {
                t.g(customerDetails, "customerDetails");
                t.g(customerType, "customerType");
                return new SupportTickets(z, customerDetails, customerType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SupportTickets)) {
                    return false;
                }
                SupportTickets supportTickets = (SupportTickets) obj;
                return this.allowCreation == supportTickets.allowCreation && t.c(this.customerDetails, supportTickets.customerDetails) && this.customerType == supportTickets.customerType;
            }

            public final boolean getAllowCreation() {
                return this.allowCreation;
            }

            public final CustomerDetails getCustomerDetails() {
                return this.customerDetails;
            }

            public final CustomerType getCustomerType() {
                return this.customerType;
            }

            public int hashCode() {
                return (((Boolean.hashCode(this.allowCreation) * 31) + this.customerDetails.hashCode()) * 31) + this.customerType.hashCode();
            }

            public String toString() {
                return "SupportTickets(allowCreation=" + this.allowCreation + ", customerDetails=" + this.customerDetails + ", customerType=" + this.customerType + ')';
            }

            @Ca.e
            public /* synthetic */ SupportTickets(int i, boolean z, CustomerDetails customerDetails, CustomerType customerType, t0 t0Var) {
                this.allowCreation = (i & 1) == 0 ? false : z;
                this.customerDetails = (i & 2) == 0 ? new CustomerDetails(false, false, false, false, false, false, false, false, false, false, false, false, false, false, 16383, (k) null) : customerDetails;
                this.customerType = (i & 4) == 0 ? CustomerType.NOT_ACTIVE : customerType;
            }

            public SupportTickets(boolean z, CustomerDetails customerDetails, CustomerType customerType) {
                t.g(customerDetails, "customerDetails");
                t.g(customerType, "customerType");
                this.allowCreation = z;
                this.customerDetails = customerDetails;
                this.customerType = customerType;
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException: Attempt to invoke virtual method 'java.util.List jadx.core.dex.instructions.args.SSAVar.getPhiList()' on a null object reference
                	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:38)
                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:19)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:12)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:54)
                	at jadx.core.dex.visitors.InitCodeVariables.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
                */
            public /* synthetic */ SupportTickets(boolean r20, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets.CustomerDetails r21, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets.CustomerType r22, int r23, kotlin.jvm.internal.k r24) {
                /*
                    r19 = this;
                    r0 = r23 & 1
                    if (r0 == 0) goto L6
                    r0 = 0
                    goto L8
                L6:
                    r0 = r20
                L8:
                    r1 = r23 & 2
                    if (r1 == 0) goto L26
                    com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$SupportTickets$CustomerDetails r1 = new com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$SupportTickets$CustomerDetails
                    r2 = r1
                    r17 = 16383(0x3fff, float:2.2957E-41)
                    r18 = 0
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                    goto L28
                L26:
                    r1 = r21
                L28:
                    r2 = r23 & 4
                    if (r2 == 0) goto L31
                    com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$SupportTickets$CustomerType r2 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets.CustomerType.NOT_ACTIVE
                    r3 = r19
                    goto L35
                L31:
                    r3 = r19
                    r2 = r22
                L35:
                    r3.<init>(r0, r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets.<init>(boolean, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$SupportTickets$CustomerDetails, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$SupportTickets$CustomerType, int, kotlin.jvm.internal.k):void");
            }
        }

        public Support() {
            this((String) null, (Boolean) null, (Boolean) null, (SupportTickets) null, 15, (k) null);
        }

        public static /* synthetic */ Support copy$default(Support support, String str, Boolean bool, Boolean bool2, SupportTickets supportTickets, int i, Object obj) {
            if ((i & 1) != 0) {
                str = support.email;
            }
            if ((i & 2) != 0) {
                bool = support.shouldWarnCustomerToUpdate;
            }
            if ((i & 4) != 0) {
                bool2 = support.displayVirtualCurrencies;
            }
            if ((i & 8) != 0) {
                supportTickets = support.supportTickets;
            }
            return support.copy(str, bool, bool2, supportTickets);
        }

        public static /* synthetic */ void getDisplayVirtualCurrencies$annotations() {
        }

        public static /* synthetic */ void getEmail$annotations() {
        }

        public static /* synthetic */ void getShouldWarnCustomerToUpdate$annotations() {
        }

        public static /* synthetic */ void getSupportTickets$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Support support, d dVar, e eVar) {
            if (dVar.e(eVar, 0) || support.email != null) {
                dVar.j(eVar, 0, EmptyStringToNullSerializer.INSTANCE, support.email);
            }
            if (dVar.e(eVar, 1) || support.shouldWarnCustomerToUpdate != null) {
                dVar.j(eVar, 1, sb.h.a, support.shouldWarnCustomerToUpdate);
            }
            if (dVar.e(eVar, 2) || support.displayVirtualCurrencies != null) {
                dVar.j(eVar, 2, sb.h.a, support.displayVirtualCurrencies);
            }
            if (!dVar.e(eVar, 3) && t.c(support.supportTickets, new SupportTickets(false, (SupportTickets.CustomerDetails) null, (SupportTickets.CustomerType) null, 7, (k) null))) {
                return;
            }
            dVar.k(eVar, 3, CustomerCenterConfigData$Support$SupportTickets$$serializer.INSTANCE, support.supportTickets);
        }

        public final String component1() {
            return this.email;
        }

        public final Boolean component2() {
            return this.shouldWarnCustomerToUpdate;
        }

        public final Boolean component3() {
            return this.displayVirtualCurrencies;
        }

        public final SupportTickets component4() {
            return this.supportTickets;
        }

        public final Support copy(String str, Boolean bool, Boolean bool2, SupportTickets supportTickets) {
            t.g(supportTickets, "supportTickets");
            return new Support(str, bool, bool2, supportTickets);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Support)) {
                return false;
            }
            Support support = (Support) obj;
            return t.c(this.email, support.email) && t.c(this.shouldWarnCustomerToUpdate, support.shouldWarnCustomerToUpdate) && t.c(this.displayVirtualCurrencies, support.displayVirtualCurrencies) && t.c(this.supportTickets, support.supportTickets);
        }

        public final Boolean getDisplayVirtualCurrencies() {
            return this.displayVirtualCurrencies;
        }

        public final String getEmail() {
            return this.email;
        }

        public final Boolean getShouldWarnCustomerToUpdate() {
            return this.shouldWarnCustomerToUpdate;
        }

        public final SupportTickets getSupportTickets() {
            return this.supportTickets;
        }

        public int hashCode() {
            String str = this.email;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.shouldWarnCustomerToUpdate;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.displayVirtualCurrencies;
            return ((hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.supportTickets.hashCode();
        }

        public String toString() {
            return "Support(email=" + this.email + ", shouldWarnCustomerToUpdate=" + this.shouldWarnCustomerToUpdate + ", displayVirtualCurrencies=" + this.displayVirtualCurrencies + ", supportTickets=" + this.supportTickets + ')';
        }

        @Ca.e
        public /* synthetic */ Support(int i, String str, Boolean bool, Boolean bool2, SupportTickets supportTickets, t0 t0Var) {
            if ((i & 1) == 0) {
                this.email = null;
            } else {
                this.email = str;
            }
            if ((i & 2) == 0) {
                this.shouldWarnCustomerToUpdate = null;
            } else {
                this.shouldWarnCustomerToUpdate = bool;
            }
            if ((i & 4) == 0) {
                this.displayVirtualCurrencies = null;
            } else {
                this.displayVirtualCurrencies = bool2;
            }
            if ((i & 8) == 0) {
                this.supportTickets = new SupportTickets(false, (SupportTickets.CustomerDetails) null, (SupportTickets.CustomerType) null, 7, (k) null);
            } else {
                this.supportTickets = supportTickets;
            }
        }

        public Support(String str, Boolean bool, Boolean bool2, SupportTickets supportTickets) {
            t.g(supportTickets, "supportTickets");
            this.email = str;
            this.shouldWarnCustomerToUpdate = bool;
            this.displayVirtualCurrencies = bool2;
            this.supportTickets = supportTickets;
        }

        public /* synthetic */ Support(String str, Boolean bool, Boolean bool2, SupportTickets supportTickets, int i, k kVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? new SupportTickets(false, (SupportTickets.CustomerDetails) null, (SupportTickets.CustomerType) null, 7, (k) null) : supportTickets);
        }
    }

    @Ca.e
    public /* synthetic */ CustomerCenterConfigData(int i, Map map, Appearance appearance, Localization localization, Support support, String str, t0 t0Var) {
        if (15 != (i & 15)) {
            f0.a(i, 15, CustomerCenterConfigData$$serializer.INSTANCE.getDescriptor());
        }
        this.screens = map;
        this.appearance = appearance;
        this.localization = localization;
        this.support = support;
        if ((i & 16) == 0) {
            this.lastPublishedAppVersion = null;
        } else {
            this.lastPublishedAppVersion = str;
        }
    }

    public static /* synthetic */ CustomerCenterConfigData copy$default(CustomerCenterConfigData customerCenterConfigData, Map map, Appearance appearance, Localization localization, Support support, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = customerCenterConfigData.screens;
        }
        if ((i & 2) != 0) {
            appearance = customerCenterConfigData.appearance;
        }
        Appearance appearance2 = appearance;
        if ((i & 4) != 0) {
            localization = customerCenterConfigData.localization;
        }
        Localization localization2 = localization;
        if ((i & 8) != 0) {
            support = customerCenterConfigData.support;
        }
        Support support2 = support;
        if ((i & 16) != 0) {
            str = customerCenterConfigData.lastPublishedAppVersion;
        }
        return customerCenterConfigData.copy(map, appearance2, localization2, support2, str);
    }

    public static /* synthetic */ void getLastPublishedAppVersion$annotations() {
    }

    public static /* synthetic */ void getScreens$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(CustomerCenterConfigData customerCenterConfigData, d dVar, e eVar) {
        dVar.k(eVar, 0, ScreenMapSerializer.INSTANCE, customerCenterConfigData.screens);
        dVar.k(eVar, 1, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, customerCenterConfigData.appearance);
        dVar.k(eVar, 2, CustomerCenterConfigData$Localization$$serializer.INSTANCE, customerCenterConfigData.localization);
        dVar.k(eVar, 3, CustomerCenterConfigData$Support$$serializer.INSTANCE, customerCenterConfigData.support);
        if (!dVar.e(eVar, 4) && customerCenterConfigData.lastPublishedAppVersion == null) {
            return;
        }
        dVar.j(eVar, 4, EmptyStringToNullSerializer.INSTANCE, customerCenterConfigData.lastPublishedAppVersion);
    }

    public final Map component1() {
        return this.screens;
    }

    public final Appearance component2() {
        return this.appearance;
    }

    public final Localization component3() {
        return this.localization;
    }

    public final Support component4() {
        return this.support;
    }

    public final String component5() {
        return this.lastPublishedAppVersion;
    }

    public final CustomerCenterConfigData copy(Map map, Appearance appearance, Localization localization, Support support, String str) {
        t.g(map, "screens");
        t.g(appearance, "appearance");
        t.g(localization, "localization");
        t.g(support, "support");
        return new CustomerCenterConfigData(map, appearance, localization, support, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerCenterConfigData)) {
            return false;
        }
        CustomerCenterConfigData customerCenterConfigData = (CustomerCenterConfigData) obj;
        return t.c(this.screens, customerCenterConfigData.screens) && t.c(this.appearance, customerCenterConfigData.appearance) && t.c(this.localization, customerCenterConfigData.localization) && t.c(this.support, customerCenterConfigData.support) && t.c(this.lastPublishedAppVersion, customerCenterConfigData.lastPublishedAppVersion);
    }

    public final Appearance getAppearance() {
        return this.appearance;
    }

    public final String getLastPublishedAppVersion() {
        return this.lastPublishedAppVersion;
    }

    public final Localization getLocalization() {
        return this.localization;
    }

    public final Screen getManagementScreen() {
        return (Screen) this.screens.get(Screen.ScreenType.MANAGEMENT);
    }

    public final Screen getNoActiveScreen() {
        return (Screen) this.screens.get(Screen.ScreenType.NO_ACTIVE);
    }

    public final Map getScreens() {
        return this.screens;
    }

    public final Support getSupport() {
        return this.support;
    }

    public int hashCode() {
        int hashCode = ((((((this.screens.hashCode() * 31) + this.appearance.hashCode()) * 31) + this.localization.hashCode()) * 31) + this.support.hashCode()) * 31;
        String str = this.lastPublishedAppVersion;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CustomerCenterConfigData(screens=" + this.screens + ", appearance=" + this.appearance + ", localization=" + this.localization + ", support=" + this.support + ", lastPublishedAppVersion=" + this.lastPublishedAppVersion + ')';
    }

    public CustomerCenterConfigData(Map map, Appearance appearance, Localization localization, Support support, String str) {
        t.g(map, "screens");
        t.g(appearance, "appearance");
        t.g(localization, "localization");
        t.g(support, "support");
        this.screens = map;
        this.appearance = appearance;
        this.localization = localization;
        this.support = support;
        this.lastPublishedAppVersion = str;
    }

    public /* synthetic */ CustomerCenterConfigData(Map map, Appearance appearance, Localization localization, Support support, String str, int i, k kVar) {
        this(map, appearance, localization, support, (i & 16) != 0 ? null : str);
    }
}

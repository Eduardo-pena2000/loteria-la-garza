package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.o;
import Ca.q;
import Ca.x;
import Da.Q;
import Da.S;
import Da.v;
import F.L;
import Qa.a;
import T4.a;
import T4.d;
import Wa.n;
import Z4.b;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.m;
import b0.w;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.ComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.ExitOffers;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig;
import com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.AlignmentKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.FontKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.PaddingKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpec;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.BadgeStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.MockPurchasesType;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMapKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallResourceProvider;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallValidationResult;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.net.URL;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import n1.h;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class PreviewHelpersKt {
    private static final long MILLIS_2025_01_25 = 1737763200000L;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VariableLocalizationKey.values().length];
            try {
                iArr[VariableLocalizationKey.ANNUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VariableLocalizationKey.ANNUAL_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VariableLocalizationKey.ANNUALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VariableLocalizationKey.DAILY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VariableLocalizationKey.DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VariableLocalizationKey.DAY_SHORT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VariableLocalizationKey.FREE_PRICE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VariableLocalizationKey.MONTH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VariableLocalizationKey.MONTH_SHORT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VariableLocalizationKey.MONTHLY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VariableLocalizationKey.LIFETIME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_DAY_FEW.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_DAY_MANY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_DAY_ONE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_DAY_OTHER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_DAY_TWO.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_DAY_ZERO.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_MONTH_FEW.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_MONTH_MANY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_MONTH_ONE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_MONTH_OTHER.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_MONTH_TWO.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_MONTH_ZERO.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_WEEK_FEW.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_WEEK_MANY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_WEEK_ONE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_WEEK_OTHER.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_WEEK_TWO.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_WEEK_ZERO.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_YEAR_FEW.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_YEAR_MANY.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_YEAR_ONE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_YEAR_OTHER.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_YEAR_TWO.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_YEAR_ZERO.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[VariableLocalizationKey.PERCENT.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[VariableLocalizationKey.WEEK.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[VariableLocalizationKey.WEEK_SHORT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[VariableLocalizationKey.WEEKLY.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[VariableLocalizationKey.YEAR.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[VariableLocalizationKey.YEAR_SHORT.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[VariableLocalizationKey.YEARLY.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_DAYS_SHORT.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_WEEKS_SHORT.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_MONTHS_SHORT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[VariableLocalizationKey.NUM_YEARS_SHORT.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final Date invoke() {
            return new Date(1737763200000L);
        }
    }

    public static final /* synthetic */ PaywallState.Loaded.Components previewEmptyState(Integer num, m mVar, int i, int i2) {
        mVar.V(1055380879);
        PaywallValidationResult.Components components = null;
        Integer num2 = (i2 & 1) != 0 ? null : num;
        if (w.L()) {
            w.U(1055380879, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.previewEmptyState (PreviewHelpers.kt:85)");
        }
        Offering offering = new Offering("identifier", "serverDescription", S.h(), Da.u.e(TestData.Packages.INSTANCE.getMonthly()), (PaywallData) null, new Offering.PaywallComponents(new UiConfig((UiConfig.AppConfig) null, NonEmptyMapKt.nonEmptyMapOf(x.a(LocaleId.box-impl(LocaleId.constructor-impl("en_US")), variableLocalizationKeysForEnUs()), new q[0]), (UiConfig.VariableConfig) null, (Map) null, 13, (k) null), new PaywallComponentsData("preview_paywall_id", "template", new URL("https://assets.pawwalls.com"), new ComponentsConfig(new PaywallComponentsConfig(new StackComponent(Da.u.e(TestData.Components.INSTANCE.getMonthlyPackageComponent()), (Boolean) null, (Dimension) null, (Size) null, (Float) null, (ColorScheme) null, (Background) null, (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, (Badge) null, (StackComponent.Overflow) null, (List) null, 32766, (k) null), new Background.Color(new ColorScheme(new ColorInfo.Hex(s0.k(r0.b.k())), (ColorInfo) null, 2, (k) null)), (StickyFooterComponent) null)), NonEmptyMapKt.nonEmptyMapOf(x.a(LocaleId.box-impl(LocaleId.constructor-impl("en_US")), NonEmptyMapKt.nonEmptyMapOf(x.a(LocalizationKey.box-impl(LocalizationKey.constructor-impl("text")), LocalizationData.Text.box-impl(LocalizationData.Text.constructor-impl("text"))), new q[0])), new q[0]), LocaleId.constructor-impl("en_US"), 0, (List) null, (ExitOffers) null, (ProductChangeConfig) null, 960, (k) null)), (URL) null, 80, (k) null);
        Result validatePaywallComponentsDataOrNullForPreviews = validatePaywallComponentsDataOrNullForPreviews(offering, mVar, 0);
        if (validatePaywallComponentsDataOrNullForPreviews != null) {
            if (validatePaywallComponentsDataOrNullForPreviews instanceof Result.Success) {
                PaywallValidationResult.Components components2 = (PaywallValidationResult.Components) ((Result.Success) validatePaywallComponentsDataOrNullForPreviews).getValue();
                if (num2 != null) {
                    components2 = PaywallValidationResult.Components.copy$default(components2, null, null, null, null, null, null, null, null, num2, 255, null);
                }
                validatePaywallComponentsDataOrNullForPreviews = new Result.Success(components2);
            } else if (!(validatePaywallComponentsDataOrNullForPreviews instanceof Result.Error)) {
                throw new o();
            }
            components = (PaywallValidationResult.Components) ResultKt.getOrThrow(validatePaywallComponentsDataOrNullForPreviews);
        }
        PaywallValidationResult.Components components3 = components;
        t.d(components3);
        PaywallState.Loaded.Components componentsPaywallState$default = OfferingToStateMapperKt.toComponentsPaywallState$default(offering, components3, null, 1.INSTANCE, new MockPurchasesType(null, null, null, null, 15, null), null, null, 48, null);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return componentsPaywallState$default;
    }

    public static final IconComponentStyle previewIconComponentStyle(Size size, boolean z, ColorStyles colorStyles, ColorStyles colorStyles2, L l, L l2, BorderStyles borderStyles, ShadowStyles shadowStyles, MaskShape maskShape, m mVar, int i, int i2) {
        t.g(size, "size");
        mVar.V(971508494);
        boolean z2 = (i2 & 2) != 0 ? true : z;
        ColorStyles colorStyles3 = (i2 & 4) != 0 ? new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.c())), null, 2, null) : colorStyles;
        ColorStyles colorStyles4 = (i2 & 8) != 0 ? new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.h())), null, 2, null) : colorStyles2;
        L a = (i2 & 16) != 0 ? f.a(h.g(10)) : l;
        L a2 = (i2 & 32) != 0 ? f.a(h.g(10)) : l2;
        BorderStyles borderStyles2 = (i2 & 64) != 0 ? new BorderStyles(h.g(2), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.c())), null, 2, null), null) : borderStyles;
        ShadowStyles shadowStyles2 = (i2 & 128) != 0 ? new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.a())), null, 2, null), h.g(10), h.g(0), h.g(3), null) : shadowStyles;
        MaskShape maskShape2 = (i2 & 256) != 0 ? MaskShape.Circle.INSTANCE : maskShape;
        if (w.L()) {
            w.U(971508494, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.previewIconComponentStyle (PreviewHelpers.kt:261)");
        }
        IconComponentStyle iconComponentStyle = new IconComponentStyle("https://example.com", "test-icon-name", new IconComponent.Formats("test-webp"), z2, size, colorStyles3, a, a2, new IconComponentStyle.Background(colorStyles4, maskShape2, borderStyles2, shadowStyles2), null, null, null, null, v.n(), 5120, null);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return iconComponentStyle;
    }

    public static final /* synthetic */ d previewImageLoader(int i, m mVar, int i2, int i3) {
        mVar.V(-1745938743);
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = R.drawable.android;
        }
        if (w.L()) {
            w.U(-1745938743, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.previewImageLoader (PreviewHelpers.kt:287)");
        }
        Context context = (Context) mVar.x(AndroidCompositionLocals_androidKt.g());
        d.a aVar = new d.a(context);
        a.a aVar2 = new a.a();
        mVar.V(1695006590);
        boolean E = mVar.E(context);
        if ((((i2 & 14) ^ 6) <= 4 || !mVar.d(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean z2 = E | z;
        Object C = mVar.C();
        if (z2 || C == m.a.a()) {
            C = new PreviewHelpersKt$previewImageLoader$1$1$1(context, i);
            mVar.t(C);
        }
        mVar.P();
        aVar2.c((b) C);
        d b = aVar.c(aVar2.f()).b();
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return b;
    }

    public static final StackComponentStyle previewStackComponentStyle-7SJ-wSw(List children, Dimension dimension, boolean z, Size size, float f, BackgroundStyles background, L padding, L margin, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, C.q qVar, Date date, CountdownComponent.CountFrom countFrom) {
        t.g(children, "children");
        t.g(dimension, "dimension");
        t.g(size, "size");
        t.g(background, "background");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(shape, "shape");
        t.g(countFrom, "countFrom");
        return new StackComponentStyle(children, dimension, z, size, f, background, padding, margin, shape, borderStyles, shadowStyles, badgeStyle, qVar, null, null, null, null, date, countFrom, v.n(), false, false, false, 7421952, null);
    }

    public static /* synthetic */ StackComponentStyle previewStackComponentStyle-7SJ-wSw$default(List list, Dimension dimension, boolean z, Size size, float f, BackgroundStyles backgroundStyles, L l, L l2, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, C.q qVar, Date date, CountdownComponent.CountFrom countFrom, int i, Object obj) {
        return previewStackComponentStyle-7SJ-wSw(list, (i & 2) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : dimension, (i & 4) != 0 ? true : z, (i & 8) != 0 ? new Size(new SizeConstraint.Fixed(200, (k) null), SizeConstraint.Fit.INSTANCE) : size, (i & 16) != 0 ? h.g(16) : f, (i & 32) != 0 ? BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.h())), null, 2, null))) : backgroundStyles, (i & 64) != 0 ? f.a(h.g(0)) : l, (i & 128) != 0 ? f.a(h.g(0)) : l2, (i & 256) != 0 ? new Shape.Rectangle(new CornerRadiuses.Dp(20.0d)) : shape, (i & 512) != 0 ? new BorderStyles(h.g(2), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.b())), null, 2, null), null) : borderStyles, (i & 1024) != 0 ? null : shadowStyles, (i & 2048) != 0 ? null : badgeStyle, (i & 4096) != 0 ? null : qVar, (i & 8192) == 0 ? date : null, (i & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : countFrom);
    }

    public static final /* synthetic */ TextComponentStyle previewTextComponentStyle(String text, ColorStyles color, int i, FontWeight fontWeight, FontSpec fontSpec, HorizontalAlignment textAlign, HorizontalAlignment horizontalAlignment, ColorStyles colorStyles, boolean z, Size size, Padding padding, Padding margin, Integer num, Date date, CountdownComponent.CountFrom countFrom, List overrides) {
        t.g(text, "text");
        t.g(color, "color");
        t.g(fontWeight, "fontWeight");
        t.g(textAlign, "textAlign");
        t.g(horizontalAlignment, "horizontalAlignment");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(countFrom, "countFrom");
        t.g(overrides, "overrides");
        d1.L fontWeight2 = FontKt.toFontWeight(fontWeight);
        String str = LocaleId.constructor-impl("en_US");
        return new TextComponentStyle(NonEmptyMapKt.nonEmptyMapOf(x.a(LocaleId.box-impl(str), text), new q[0]), color, i, fontWeight2, fontSpec, j.h(AlignmentKt.toTextAlign(textAlign)), AlignmentKt.toAlignment(horizontalAlignment), colorStyles, z, size, PaddingKt.toPaddingValues(padding), PaddingKt.toPaddingValues(margin), null, null, num, null, date, countFrom, NonEmptyMapKt.nonEmptyMapOf(x.a(LocaleId.box-impl(str), variableLocalizationKeysForEnUs()), new q[0]), overrides, 40960, null);
    }

    public static /* synthetic */ TextComponentStyle previewTextComponentStyle$default(String str, ColorStyles colorStyles, int i, FontWeight fontWeight, FontSpec fontSpec, HorizontalAlignment horizontalAlignment, HorizontalAlignment horizontalAlignment2, ColorStyles colorStyles2, boolean z, Size size, Padding padding, Padding padding2, Integer num, Date date, CountdownComponent.CountFrom countFrom, List list, int i2, Object obj) {
        return previewTextComponentStyle(str, (i2 & 2) != 0 ? new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.a())), null, 2, null) : colorStyles, (i2 & 4) != 0 ? 15 : i, (i2 & 8) != 0 ? FontWeight.REGULAR : fontWeight, (i2 & 16) != 0 ? null : fontSpec, (i2 & 32) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (i2 & 64) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment2, (i2 & 128) != 0 ? null : colorStyles2, (i2 & 256) != 0 ? true : z, (i2 & 512) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i2 & 1024) != 0 ? Padding.Companion.getZero() : padding, (i2 & 2048) != 0 ? Padding.Companion.getZero() : padding2, (i2 & 4096) != 0 ? null : num, (i2 & 8192) == 0 ? date : null, (i2 & 16384) != 0 ? CountdownComponent.CountFrom.DAYS : countFrom, (i2 & 32768) != 0 ? v.n() : list);
    }

    public static final UiConfig previewUiConfig(UiConfig.AppConfig app, Map localizations, UiConfig.VariableConfig variableConfig) {
        t.g(app, "app");
        t.g(localizations, "localizations");
        t.g(variableConfig, "variableConfig");
        return new UiConfig(app, localizations, variableConfig, (Map) null, 8, (k) null);
    }

    public static /* synthetic */ UiConfig previewUiConfig$default(UiConfig.AppConfig appConfig, Map map, UiConfig.VariableConfig variableConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            appConfig = new UiConfig.AppConfig((Map) null, (Map) null, 3, (k) null);
        }
        if ((i & 2) != 0) {
            map = Q.f(x.a(LocaleId.box-impl(LocaleId.constructor-impl("en_US")), variableLocalizationKeysForEnUs()));
        }
        if ((i & 4) != 0) {
            variableConfig = new UiConfig.VariableConfig((Map) null, (Map) null, 3, (k) null);
        }
        return previewUiConfig(appConfig, map, variableConfig);
    }

    public static final /* synthetic */ Result validatePaywallComponentsDataOrNullForPreviews(Offering offering, m mVar, int i) {
        t.g(offering, "<this>");
        mVar.V(1679297795);
        if (w.L()) {
            w.U(1679297795, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.validatePaywallComponentsDataOrNullForPreviews (PreviewHelpers.kt:306)");
        }
        Resources resources = ((Context) mVar.x(AndroidCompositionLocals_androidKt.g())).getResources();
        t.f(resources, "LocalContext.current.resources");
        Result validatePaywallComponentsDataOrNull = OfferingToStateMapperKt.validatePaywallComponentsDataOrNull(offering, new PaywallResourceProvider("RevenueCatUI Previews", "com.revenuecat.purchases.ui.revenuecatui", resources));
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return validatePaywallComponentsDataOrNull;
    }

    public static final /* synthetic */ NonEmptyMap variableLocalizationKeysForEnUs() {
        Enum[] values = VariableLocalizationKey.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(Q.e(values.length), 16));
        for (Enum r4 : values) {
            String str = "day";
            switch (WhenMappings.$EnumSwitchMapping$0[r4.ordinal()]) {
                case 1:
                    str = "annual";
                    break;
                case 2:
                case 41:
                    str = "yr";
                    break;
                case 3:
                    str = "annually";
                    break;
                case 4:
                    str = "daily";
                    break;
                case 5:
                case 6:
                    break;
                case 7:
                    str = "free";
                    break;
                case 8:
                    str = "month";
                    break;
                case 9:
                    str = "mo";
                    break;
                case 10:
                    str = "monthly";
                    break;
                case 11:
                    str = "lifetime";
                    break;
                case 12:
                case 13:
                case 15:
                case 16:
                    str = "%d days";
                    break;
                case 14:
                case 17:
                    str = "%d day";
                    break;
                case 18:
                case 19:
                case 21:
                case 22:
                    str = "%d months";
                    break;
                case 20:
                case 23:
                    str = "%d month";
                    break;
                case 24:
                case 25:
                case 27:
                case 28:
                    str = "%d weeks";
                    break;
                case 26:
                case 29:
                    str = "%d week";
                    break;
                case 30:
                case 31:
                case 33:
                case 34:
                    str = "%d years";
                    break;
                case 32:
                case 35:
                    str = "%d year";
                    break;
                case 36:
                    str = "%d%%";
                    break;
                case 37:
                    str = "week";
                    break;
                case 38:
                    str = "wk";
                    break;
                case 39:
                    str = "weekly";
                    break;
                case 40:
                    str = "year";
                    break;
                case 42:
                    str = "yearly";
                    break;
                case 43:
                    str = "%dd";
                    break;
                case 44:
                    str = "%dwk";
                    break;
                case 45:
                    str = "%dmo";
                    break;
                case 46:
                    str = "%dyr";
                    break;
                default:
                    throw new o();
            }
            linkedHashMap.put(r4, str);
        }
        NonEmptyMap nonEmptyMapOrNull = NonEmptyMapKt.toNonEmptyMapOrNull(linkedHashMap);
        t.d(nonEmptyMapOrNull);
        return nonEmptyMapOrNull;
    }
}

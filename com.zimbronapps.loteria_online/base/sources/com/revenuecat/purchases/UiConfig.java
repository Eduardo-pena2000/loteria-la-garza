package com.revenuecat.purchases;

import Da.S;
import com.revenuecat.purchases.paywalls.components.common.LocalizedVariableLocalizationKeyMapSerializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FontStyle;
import com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import sb.J;
import sb.M;
import sb.f0;
import sb.t0;
import sb.x0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UiConfig {
    private final AppConfig app;
    private final Map customVariables;
    private final Map localizations;
    private final VariableConfig variableConfig;
    public static final Companion Companion = new Companion(null);
    private static final ob.b[] $childSerializers = {null, null, null, new M(x0.a, CustomVariableDefinitionSerializer.INSTANCE)};

    @InternalRevenueCatAPI
    public static final class AppConfig {
        private final Map colors;
        private final Map fonts;
        public static final Companion Companion = new Companion(null);
        private static final ob.b[] $childSerializers = {new M(ColorAlias$$serializer.INSTANCE, ColorScheme$$serializer.INSTANCE), new M(FontAlias$$serializer.INSTANCE, UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE)};

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final ob.b serializer() {
                return UiConfig$AppConfig$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InternalRevenueCatAPI
        public static final class FontsConfig {
            private final FontInfo android;
            public static final Companion Companion = new Companion(null);
            private static final ob.b[] $childSerializers = {new ob.h("com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo", P.b(FontInfo.class), new Xa.c[]{P.b(FontInfo.GoogleFonts.class), P.b(FontInfo.Name.class)}, new ob.b[]{UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE, UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE}, new Annotation[0])};

            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                    this();
                }

                public final ob.b serializer() {
                    return UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @InternalRevenueCatAPI
            public interface FontInfo {
                public static final Companion Companion = Companion.$$INSTANCE;

                public static final class Companion {
                    static final /* synthetic */ Companion $$INSTANCE = new Companion();

                    private Companion() {
                    }

                    public final ob.b serializer() {
                        return new ob.h("com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo", P.b(FontInfo.class), new Xa.c[]{P.b(GoogleFonts.class), P.b(Name.class)}, new ob.b[]{UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE, UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE}, new Annotation[0]);
                    }
                }

                @InternalRevenueCatAPI
                public static final class GoogleFonts implements FontInfo {
                    public static final Companion Companion = new Companion(null);
                    private final String value;

                    public static final class Companion {
                        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                            this();
                        }

                        public final ob.b serializer() {
                            return UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @Ca.e
                    public /* synthetic */ GoogleFonts(int i, String str, t0 t0Var) {
                        if (1 != (i & 1)) {
                            f0.a(i, 1, UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE.getDescriptor());
                        }
                        this.value = str;
                    }

                    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(GoogleFonts googleFonts, rb.d dVar, qb.e eVar) {
                        dVar.v(eVar, 0, googleFonts.value);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof GoogleFonts) && t.c(this.value, ((GoogleFonts) obj).value);
                    }

                    public final /* synthetic */ String getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "GoogleFonts(value=" + this.value + ')';
                    }

                    public GoogleFonts(String str) {
                        t.g(str, "value");
                        this.value = str;
                    }
                }

                @InternalRevenueCatAPI
                public static final class Name implements FontInfo {
                    public static final Companion Companion = new Companion(null);
                    private final String family;
                    private final String hash;
                    private final FontStyle style;
                    private final String url;
                    private final String value;
                    private final Integer weight;

                    public static final class Companion {
                        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                            this();
                        }

                        public final ob.b serializer() {
                            return UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @Ca.e
                    public /* synthetic */ Name(int i, String str, String str2, String str3, String str4, Integer num, FontStyle fontStyle, t0 t0Var) {
                        if (1 != (i & 1)) {
                            f0.a(i, 1, UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE.getDescriptor());
                        }
                        this.value = str;
                        if ((i & 2) == 0) {
                            this.url = null;
                        } else {
                            this.url = str2;
                        }
                        if ((i & 4) == 0) {
                            this.hash = null;
                        } else {
                            this.hash = str3;
                        }
                        if ((i & 8) == 0) {
                            this.family = null;
                        } else {
                            this.family = str4;
                        }
                        if ((i & 16) == 0) {
                            this.weight = null;
                        } else {
                            this.weight = num;
                        }
                        if ((i & 32) == 0) {
                            this.style = null;
                        } else {
                            this.style = fontStyle;
                        }
                    }

                    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Name name, rb.d dVar, qb.e eVar) {
                        dVar.v(eVar, 0, name.value);
                        if (dVar.e(eVar, 1) || name.url != null) {
                            dVar.j(eVar, 1, x0.a, name.url);
                        }
                        if (dVar.e(eVar, 2) || name.hash != null) {
                            dVar.j(eVar, 2, x0.a, name.hash);
                        }
                        if (dVar.e(eVar, 3) || name.family != null) {
                            dVar.j(eVar, 3, x0.a, name.family);
                        }
                        if (dVar.e(eVar, 4) || name.weight != null) {
                            dVar.j(eVar, 4, J.a, name.weight);
                        }
                        if (!dVar.e(eVar, 5) && name.style == null) {
                            return;
                        }
                        dVar.j(eVar, 5, FontStyleDeserializer.INSTANCE, name.style);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Name)) {
                            return false;
                        }
                        Name name = (Name) obj;
                        return t.c(this.value, name.value) && t.c(this.url, name.url) && t.c(this.hash, name.hash) && t.c(this.family, name.family) && t.c(this.weight, name.weight) && this.style == name.style;
                    }

                    public final /* synthetic */ String getFamily() {
                        return this.family;
                    }

                    public final /* synthetic */ String getHash() {
                        return this.hash;
                    }

                    public final /* synthetic */ FontStyle getStyle() {
                        return this.style;
                    }

                    public final /* synthetic */ String getUrl() {
                        return this.url;
                    }

                    public final /* synthetic */ String getValue() {
                        return this.value;
                    }

                    public final /* synthetic */ Integer getWeight() {
                        return this.weight;
                    }

                    public int hashCode() {
                        int hashCode = this.value.hashCode() * 31;
                        String str = this.url;
                        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                        String str2 = this.hash;
                        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.family;
                        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        Integer num = this.weight;
                        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                        FontStyle fontStyle = this.style;
                        return hashCode5 + (fontStyle != null ? fontStyle.hashCode() : 0);
                    }

                    public String toString() {
                        return "Name(value=" + this.value + ", url=" + this.url + ", hash=" + this.hash + ", family=" + this.family + ", weight=" + this.weight + ", style=" + this.style + ')';
                    }

                    public Name(String str, String str2, String str3, String str4, Integer num, FontStyle fontStyle) {
                        t.g(str, "value");
                        this.value = str;
                        this.url = str2;
                        this.hash = str3;
                        this.family = str4;
                        this.weight = num;
                        this.style = fontStyle;
                    }

                    public /* synthetic */ Name(String str, String str2, String str3, String str4, Integer num, FontStyle fontStyle, int i, kotlin.jvm.internal.k kVar) {
                        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) == 0 ? fontStyle : null);
                    }
                }
            }

            @Ca.e
            public /* synthetic */ FontsConfig(int i, FontInfo fontInfo, t0 t0Var) {
                if (1 != (i & 1)) {
                    f0.a(i, 1, UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE.getDescriptor());
                }
                this.android = fontInfo;
            }

            public static final /* synthetic */ ob.b[] access$get$childSerializers$cp() {
                return $childSerializers;
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(FontsConfig fontsConfig, rb.d dVar, qb.e eVar) {
                dVar.k(eVar, 0, $childSerializers[0], fontsConfig.android);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FontsConfig) && t.c(this.android, ((FontsConfig) obj).android);
            }

            public final /* synthetic */ FontInfo getAndroid() {
                return this.android;
            }

            public int hashCode() {
                return this.android.hashCode();
            }

            public String toString() {
                return "FontsConfig(android=" + this.android + ')';
            }

            public FontsConfig(FontInfo fontInfo) {
                t.g(fontInfo, "android");
                this.android = fontInfo;
            }
        }

        public AppConfig() {
            this((Map) null, (Map) null, 3, (kotlin.jvm.internal.k) null);
        }

        public static final /* synthetic */ ob.b[] access$get$childSerializers$cp() {
            return $childSerializers;
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(AppConfig appConfig, rb.d dVar, qb.e eVar) {
            ob.k[] kVarArr = $childSerializers;
            if (dVar.e(eVar, 0) || !t.c(appConfig.colors, S.h())) {
                dVar.k(eVar, 0, kVarArr[0], appConfig.colors);
            }
            if (!dVar.e(eVar, 1) && t.c(appConfig.fonts, S.h())) {
                return;
            }
            dVar.k(eVar, 1, kVarArr[1], appConfig.fonts);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppConfig)) {
                return false;
            }
            AppConfig appConfig = (AppConfig) obj;
            return t.c(this.colors, appConfig.colors) && t.c(this.fonts, appConfig.fonts);
        }

        public final /* synthetic */ Map getColors() {
            return this.colors;
        }

        public final /* synthetic */ Map getFonts() {
            return this.fonts;
        }

        public int hashCode() {
            return (this.colors.hashCode() * 31) + this.fonts.hashCode();
        }

        public String toString() {
            return "AppConfig(colors=" + this.colors + ", fonts=" + this.fonts + ')';
        }

        @Ca.e
        public /* synthetic */ AppConfig(int i, Map map, Map map2, t0 t0Var) {
            this.colors = (i & 1) == 0 ? S.h() : map;
            if ((i & 2) == 0) {
                this.fonts = S.h();
            } else {
                this.fonts = map2;
            }
        }

        public AppConfig(Map map, Map map2) {
            t.g(map, "colors");
            t.g(map2, "fonts");
            this.colors = map;
            this.fonts = map2;
        }

        public /* synthetic */ AppConfig(Map map, Map map2, int i, kotlin.jvm.internal.k kVar) {
            this((i & 1) != 0 ? S.h() : map, (i & 2) != 0 ? S.h() : map2);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final ob.b serializer() {
            return UiConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InternalRevenueCatAPI
    public static final class CustomVariableDefinition {
        public static final Companion Companion = new Companion(null);
        private final Object defaultValue;
        private final String type;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final ob.b serializer() {
                return CustomVariableDefinitionSerializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public CustomVariableDefinition(String str, Object obj) {
            t.g(str, "type");
            t.g(obj, "defaultValue");
            this.type = str;
            this.defaultValue = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomVariableDefinition)) {
                return false;
            }
            CustomVariableDefinition customVariableDefinition = (CustomVariableDefinition) obj;
            return t.c(this.type, customVariableDefinition.type) && t.c(this.defaultValue, customVariableDefinition.defaultValue);
        }

        public final /* synthetic */ Object getDefaultValue() {
            return this.defaultValue;
        }

        public final /* synthetic */ String getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.defaultValue.hashCode();
        }

        public String toString() {
            return "CustomVariableDefinition(type=" + this.type + ", defaultValue=" + this.defaultValue + ')';
        }
    }

    @InternalRevenueCatAPI
    public static final class VariableConfig {
        private static final ob.b[] $childSerializers;
        public static final Companion Companion = new Companion(null);
        private final Map functionCompatibilityMap;
        private final Map variableCompatibilityMap;

        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final ob.b serializer() {
                return UiConfig$VariableConfig$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            x0 x0Var = x0.a;
            $childSerializers = new ob.b[]{new M(x0Var, x0Var), new M(x0Var, x0Var)};
        }

        public VariableConfig() {
            this((Map) null, (Map) null, 3, (kotlin.jvm.internal.k) null);
        }

        public static final /* synthetic */ ob.b[] access$get$childSerializers$cp() {
            return $childSerializers;
        }

        public static /* synthetic */ void getFunctionCompatibilityMap$annotations() {
        }

        public static /* synthetic */ void getVariableCompatibilityMap$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(VariableConfig variableConfig, rb.d dVar, qb.e eVar) {
            ob.k[] kVarArr = $childSerializers;
            if (dVar.e(eVar, 0) || !t.c(variableConfig.variableCompatibilityMap, S.h())) {
                dVar.k(eVar, 0, kVarArr[0], variableConfig.variableCompatibilityMap);
            }
            if (!dVar.e(eVar, 1) && t.c(variableConfig.functionCompatibilityMap, S.h())) {
                return;
            }
            dVar.k(eVar, 1, kVarArr[1], variableConfig.functionCompatibilityMap);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VariableConfig)) {
                return false;
            }
            VariableConfig variableConfig = (VariableConfig) obj;
            return t.c(this.variableCompatibilityMap, variableConfig.variableCompatibilityMap) && t.c(this.functionCompatibilityMap, variableConfig.functionCompatibilityMap);
        }

        public final /* synthetic */ Map getFunctionCompatibilityMap() {
            return this.functionCompatibilityMap;
        }

        public final /* synthetic */ Map getVariableCompatibilityMap() {
            return this.variableCompatibilityMap;
        }

        public int hashCode() {
            return (this.variableCompatibilityMap.hashCode() * 31) + this.functionCompatibilityMap.hashCode();
        }

        public String toString() {
            return "VariableConfig(variableCompatibilityMap=" + this.variableCompatibilityMap + ", functionCompatibilityMap=" + this.functionCompatibilityMap + ')';
        }

        @Ca.e
        public /* synthetic */ VariableConfig(int i, Map map, Map map2, t0 t0Var) {
            this.variableCompatibilityMap = (i & 1) == 0 ? S.h() : map;
            if ((i & 2) == 0) {
                this.functionCompatibilityMap = S.h();
            } else {
                this.functionCompatibilityMap = map2;
            }
        }

        public VariableConfig(Map map, Map map2) {
            t.g(map, "variableCompatibilityMap");
            t.g(map2, "functionCompatibilityMap");
            this.variableCompatibilityMap = map;
            this.functionCompatibilityMap = map2;
        }

        public /* synthetic */ VariableConfig(Map map, Map map2, int i, kotlin.jvm.internal.k kVar) {
            this((i & 1) != 0 ? S.h() : map, (i & 2) != 0 ? S.h() : map2);
        }
    }

    public UiConfig() {
        this((AppConfig) null, (Map) null, (VariableConfig) null, (Map) null, 15, (kotlin.jvm.internal.k) null);
    }

    public static final /* synthetic */ ob.b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ void getCustomVariables$annotations() {
    }

    public static /* synthetic */ void getLocalizations$annotations() {
    }

    public static /* synthetic */ void getVariableConfig$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(UiConfig uiConfig, rb.d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        if (dVar.e(eVar, 0) || !t.c(uiConfig.app, new AppConfig((Map) null, (Map) null, 3, (kotlin.jvm.internal.k) null))) {
            dVar.k(eVar, 0, UiConfig$AppConfig$$serializer.INSTANCE, uiConfig.app);
        }
        if (dVar.e(eVar, 1) || !t.c(uiConfig.localizations, S.h())) {
            dVar.k(eVar, 1, LocalizedVariableLocalizationKeyMapSerializer.INSTANCE, uiConfig.localizations);
        }
        if (dVar.e(eVar, 2) || !t.c(uiConfig.variableConfig, new VariableConfig((Map) null, (Map) null, 3, (kotlin.jvm.internal.k) null))) {
            dVar.k(eVar, 2, UiConfig$VariableConfig$$serializer.INSTANCE, uiConfig.variableConfig);
        }
        if (!dVar.e(eVar, 3) && t.c(uiConfig.customVariables, S.h())) {
            return;
        }
        dVar.k(eVar, 3, kVarArr[3], uiConfig.customVariables);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiConfig)) {
            return false;
        }
        UiConfig uiConfig = (UiConfig) obj;
        return t.c(this.app, uiConfig.app) && t.c(this.localizations, uiConfig.localizations) && t.c(this.variableConfig, uiConfig.variableConfig) && t.c(this.customVariables, uiConfig.customVariables);
    }

    public final /* synthetic */ AppConfig getApp() {
        return this.app;
    }

    public final /* synthetic */ Map getCustomVariables() {
        return this.customVariables;
    }

    public final /* synthetic */ Map getLocalizations() {
        return this.localizations;
    }

    public final /* synthetic */ VariableConfig getVariableConfig() {
        return this.variableConfig;
    }

    public int hashCode() {
        return (((((this.app.hashCode() * 31) + this.localizations.hashCode()) * 31) + this.variableConfig.hashCode()) * 31) + this.customVariables.hashCode();
    }

    public String toString() {
        return "UiConfig(app=" + this.app + ", localizations=" + this.localizations + ", variableConfig=" + this.variableConfig + ", customVariables=" + this.customVariables + ')';
    }

    @Ca.e
    public /* synthetic */ UiConfig(int i, AppConfig appConfig, Map map, VariableConfig variableConfig, Map map2, t0 t0Var) {
        this.app = (i & 1) == 0 ? new AppConfig((Map) null, (Map) null, 3, (kotlin.jvm.internal.k) null) : appConfig;
        if ((i & 2) == 0) {
            this.localizations = S.h();
        } else {
            this.localizations = map;
        }
        if ((i & 4) == 0) {
            this.variableConfig = new VariableConfig((Map) null, (Map) null, 3, (kotlin.jvm.internal.k) null);
        } else {
            this.variableConfig = variableConfig;
        }
        if ((i & 8) == 0) {
            this.customVariables = S.h();
        } else {
            this.customVariables = map2;
        }
    }

    public UiConfig(AppConfig appConfig, Map map, VariableConfig variableConfig, Map map2) {
        t.g(appConfig, "app");
        t.g(map, "localizations");
        t.g(variableConfig, "variableConfig");
        t.g(map2, "customVariables");
        this.app = appConfig;
        this.localizations = map;
        this.variableConfig = variableConfig;
        this.customVariables = map2;
    }

    public /* synthetic */ UiConfig(AppConfig appConfig, Map map, VariableConfig variableConfig, Map map2, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? new AppConfig((Map) null, (Map) null, 3, (kotlin.jvm.internal.k) null) : appConfig, (i & 2) != 0 ? S.h() : map, (i & 4) != 0 ? new VariableConfig((Map) null, (Map) null, 3, (kotlin.jvm.internal.k) null) : variableConfig, (i & 8) != 0 ? S.h() : map2);
    }
}

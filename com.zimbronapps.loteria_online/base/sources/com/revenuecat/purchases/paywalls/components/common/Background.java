package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.FitModeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls$$serializer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface Background {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Color implements Background {
        public static final Companion Companion = new Companion(null);
        private final ColorScheme value;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return Background$Color$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ Color(int i, ColorScheme colorScheme, t0 t0Var) {
            if (1 != (i & 1)) {
                f0.a(i, 1, Background$Color$$serializer.INSTANCE.getDescriptor());
            }
            this.value = colorScheme;
        }

        public static /* synthetic */ Color copy$default(Color color, ColorScheme colorScheme, int i, Object obj) {
            if ((i & 1) != 0) {
                colorScheme = color.value;
            }
            return color.copy(colorScheme);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Color color, d dVar, qb.e eVar) {
            dVar.k(eVar, 0, ColorScheme$$serializer.INSTANCE, color.value);
        }

        public final ColorScheme component1() {
            return this.value;
        }

        public final Color copy(ColorScheme colorScheme) {
            t.g(colorScheme, "value");
            return new Color(colorScheme);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Color) && t.c(this.value, ((Color) obj).value);
        }

        public final /* synthetic */ ColorScheme getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Color(value=" + this.value + ')';
        }

        public Color(ColorScheme colorScheme) {
            t.g(colorScheme, "value");
            this.value = colorScheme;
        }
    }

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b serializer() {
            return BackgroundDeserializer.INSTANCE;
        }
    }

    public static final class Unknown implements Background {
        public static final Companion Companion = new Companion(null);
        private final String type;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return Background$Unknown$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ Unknown(int i, String str, t0 t0Var) {
            if (1 != (i & 1)) {
                f0.a(i, 1, Background$Unknown$$serializer.INSTANCE.getDescriptor());
            }
            this.type = str;
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.type;
            }
            return unknown.copy(str);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Unknown unknown, d dVar, qb.e eVar) {
            dVar.v(eVar, 0, unknown.type);
        }

        public final String component1() {
            return this.type;
        }

        public final Unknown copy(String str) {
            t.g(str, "type");
            return new Unknown(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && t.c(this.type, ((Unknown) obj).type);
        }

        public final /* synthetic */ String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "Unknown(type=" + this.type + ')';
        }

        public Unknown(String str) {
            t.g(str, "type");
            this.type = str;
        }
    }

    public static final class Image implements Background {
        public static final Companion Companion = new Companion(null);
        private final ColorScheme colorOverlay;
        private final FitMode fitMode;
        private final ThemeImageUrls value;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return Background$Image$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ Image(int i, ThemeImageUrls themeImageUrls, FitMode fitMode, ColorScheme colorScheme, t0 t0Var) {
            if (1 != (i & 1)) {
                f0.a(i, 1, Background$Image$$serializer.INSTANCE.getDescriptor());
            }
            this.value = themeImageUrls;
            if ((i & 2) == 0) {
                this.fitMode = FitMode.FILL;
            } else {
                this.fitMode = fitMode;
            }
            if ((i & 4) == 0) {
                this.colorOverlay = null;
            } else {
                this.colorOverlay = colorScheme;
            }
        }

        public static /* synthetic */ Image copy$default(Image image, ThemeImageUrls themeImageUrls, FitMode fitMode, ColorScheme colorScheme, int i, Object obj) {
            if ((i & 1) != 0) {
                themeImageUrls = image.value;
            }
            if ((i & 2) != 0) {
                fitMode = image.fitMode;
            }
            if ((i & 4) != 0) {
                colorScheme = image.colorOverlay;
            }
            return image.copy(themeImageUrls, fitMode, colorScheme);
        }

        public static /* synthetic */ void getColorOverlay$annotations() {
        }

        public static /* synthetic */ void getFitMode$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Image image, d dVar, qb.e eVar) {
            dVar.k(eVar, 0, ThemeImageUrls$$serializer.INSTANCE, image.value);
            if (dVar.e(eVar, 1) || image.fitMode != FitMode.FILL) {
                dVar.k(eVar, 1, FitModeDeserializer.INSTANCE, image.fitMode);
            }
            if (!dVar.e(eVar, 2) && image.colorOverlay == null) {
                return;
            }
            dVar.j(eVar, 2, ColorScheme$$serializer.INSTANCE, image.colorOverlay);
        }

        public final ThemeImageUrls component1() {
            return this.value;
        }

        public final FitMode component2() {
            return this.fitMode;
        }

        public final ColorScheme component3() {
            return this.colorOverlay;
        }

        public final Image copy(ThemeImageUrls themeImageUrls, FitMode fitMode, ColorScheme colorScheme) {
            t.g(themeImageUrls, "value");
            t.g(fitMode, "fitMode");
            return new Image(themeImageUrls, fitMode, colorScheme);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return t.c(this.value, image.value) && this.fitMode == image.fitMode && t.c(this.colorOverlay, image.colorOverlay);
        }

        public final /* synthetic */ ColorScheme getColorOverlay() {
            return this.colorOverlay;
        }

        public final /* synthetic */ FitMode getFitMode() {
            return this.fitMode;
        }

        public final /* synthetic */ ThemeImageUrls getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = ((this.value.hashCode() * 31) + this.fitMode.hashCode()) * 31;
            ColorScheme colorScheme = this.colorOverlay;
            return hashCode + (colorScheme == null ? 0 : colorScheme.hashCode());
        }

        public String toString() {
            return "Image(value=" + this.value + ", fitMode=" + this.fitMode + ", colorOverlay=" + this.colorOverlay + ')';
        }

        public Image(ThemeImageUrls themeImageUrls, FitMode fitMode, ColorScheme colorScheme) {
            t.g(themeImageUrls, "value");
            t.g(fitMode, "fitMode");
            this.value = themeImageUrls;
            this.fitMode = fitMode;
            this.colorOverlay = colorScheme;
        }

        public /* synthetic */ Image(ThemeImageUrls themeImageUrls, FitMode fitMode, ColorScheme colorScheme, int i, k kVar) {
            this(themeImageUrls, (i & 2) != 0 ? FitMode.FILL : fitMode, (i & 4) != 0 ? null : colorScheme);
        }
    }

    public static final class Video implements Background {
        public static final Companion Companion = new Companion(null);
        private final ColorScheme colorOverlay;
        private final ThemeImageUrls fallbackImage;
        private final FitMode fitMode;
        private final boolean loop;
        private final boolean muteAudio;
        private final ThemeVideoUrls value;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return Background$Video$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ Video(int i, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, boolean z, boolean z2, FitMode fitMode, ColorScheme colorScheme, t0 t0Var) {
            if (15 != (i & 15)) {
                f0.a(i, 15, Background$Video$$serializer.INSTANCE.getDescriptor());
            }
            this.value = themeVideoUrls;
            this.fallbackImage = themeImageUrls;
            this.loop = z;
            this.muteAudio = z2;
            if ((i & 16) == 0) {
                this.fitMode = FitMode.FILL;
            } else {
                this.fitMode = fitMode;
            }
            if ((i & 32) == 0) {
                this.colorOverlay = null;
            } else {
                this.colorOverlay = colorScheme;
            }
        }

        public static /* synthetic */ Video copy$default(Video video, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, boolean z, boolean z2, FitMode fitMode, ColorScheme colorScheme, int i, Object obj) {
            if ((i & 1) != 0) {
                themeVideoUrls = video.value;
            }
            if ((i & 2) != 0) {
                themeImageUrls = video.fallbackImage;
            }
            ThemeImageUrls themeImageUrls2 = themeImageUrls;
            if ((i & 4) != 0) {
                z = video.loop;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = video.muteAudio;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                fitMode = video.fitMode;
            }
            FitMode fitMode2 = fitMode;
            if ((i & 32) != 0) {
                colorScheme = video.colorOverlay;
            }
            return video.copy(themeVideoUrls, themeImageUrls2, z3, z4, fitMode2, colorScheme);
        }

        public static /* synthetic */ void getColorOverlay$annotations() {
        }

        public static /* synthetic */ void getFallbackImage$annotations() {
        }

        public static /* synthetic */ void getFitMode$annotations() {
        }

        public static /* synthetic */ void getMuteAudio$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Video video, d dVar, qb.e eVar) {
            dVar.k(eVar, 0, ThemeVideoUrls$$serializer.INSTANCE, video.value);
            dVar.k(eVar, 1, ThemeImageUrls$$serializer.INSTANCE, video.fallbackImage);
            dVar.B(eVar, 2, video.loop);
            dVar.B(eVar, 3, video.muteAudio);
            if (dVar.e(eVar, 4) || video.fitMode != FitMode.FILL) {
                dVar.k(eVar, 4, FitModeDeserializer.INSTANCE, video.fitMode);
            }
            if (!dVar.e(eVar, 5) && video.colorOverlay == null) {
                return;
            }
            dVar.j(eVar, 5, ColorScheme$$serializer.INSTANCE, video.colorOverlay);
        }

        public final ThemeVideoUrls component1() {
            return this.value;
        }

        public final ThemeImageUrls component2() {
            return this.fallbackImage;
        }

        public final boolean component3() {
            return this.loop;
        }

        public final boolean component4() {
            return this.muteAudio;
        }

        public final FitMode component5() {
            return this.fitMode;
        }

        public final ColorScheme component6() {
            return this.colorOverlay;
        }

        public final Video copy(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, boolean z, boolean z2, FitMode fitMode, ColorScheme colorScheme) {
            t.g(themeVideoUrls, "value");
            t.g(themeImageUrls, "fallbackImage");
            t.g(fitMode, "fitMode");
            return new Video(themeVideoUrls, themeImageUrls, z, z2, fitMode, colorScheme);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            return t.c(this.value, video.value) && t.c(this.fallbackImage, video.fallbackImage) && this.loop == video.loop && this.muteAudio == video.muteAudio && this.fitMode == video.fitMode && t.c(this.colorOverlay, video.colorOverlay);
        }

        public final /* synthetic */ ColorScheme getColorOverlay() {
            return this.colorOverlay;
        }

        public final /* synthetic */ ThemeImageUrls getFallbackImage() {
            return this.fallbackImage;
        }

        public final /* synthetic */ FitMode getFitMode() {
            return this.fitMode;
        }

        public final /* synthetic */ boolean getLoop() {
            return this.loop;
        }

        public final /* synthetic */ boolean getMuteAudio() {
            return this.muteAudio;
        }

        public final /* synthetic */ ThemeVideoUrls getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = ((((((((this.value.hashCode() * 31) + this.fallbackImage.hashCode()) * 31) + Boolean.hashCode(this.loop)) * 31) + Boolean.hashCode(this.muteAudio)) * 31) + this.fitMode.hashCode()) * 31;
            ColorScheme colorScheme = this.colorOverlay;
            return hashCode + (colorScheme == null ? 0 : colorScheme.hashCode());
        }

        public String toString() {
            return "Video(value=" + this.value + ", fallbackImage=" + this.fallbackImage + ", loop=" + this.loop + ", muteAudio=" + this.muteAudio + ", fitMode=" + this.fitMode + ", colorOverlay=" + this.colorOverlay + ')';
        }

        public Video(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, boolean z, boolean z2, FitMode fitMode, ColorScheme colorScheme) {
            t.g(themeVideoUrls, "value");
            t.g(themeImageUrls, "fallbackImage");
            t.g(fitMode, "fitMode");
            this.value = themeVideoUrls;
            this.fallbackImage = themeImageUrls;
            this.loop = z;
            this.muteAudio = z2;
            this.fitMode = fitMode;
            this.colorOverlay = colorScheme;
        }

        public /* synthetic */ Video(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, boolean z, boolean z2, FitMode fitMode, ColorScheme colorScheme, int i, k kVar) {
            this(themeVideoUrls, themeImageUrls, z, z2, (i & 16) != 0 ? FitMode.FILL : fitMode, (i & 32) != 0 ? null : colorScheme);
        }
    }
}

package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import A0.c;
import M0.f;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface BackgroundStyle {

    public static final class Color implements BackgroundStyle {
        private final ColorStyle color;

        private /* synthetic */ Color(ColorStyle colorStyle) {
            this.color = colorStyle;
        }

        public static final /* synthetic */ Color box-impl(ColorStyle colorStyle) {
            return new Color(colorStyle);
        }

        public static ColorStyle constructor-impl(ColorStyle color) {
            t.g(color, "color");
            return color;
        }

        public static boolean equals-impl(ColorStyle colorStyle, Object obj) {
            return (obj instanceof Color) && t.c(colorStyle, ((Color) obj).unbox-impl());
        }

        public static final boolean equals-impl0(ColorStyle colorStyle, ColorStyle colorStyle2) {
            return t.c(colorStyle, colorStyle2);
        }

        public static int hashCode-impl(ColorStyle colorStyle) {
            return colorStyle.hashCode();
        }

        public static String toString-impl(ColorStyle colorStyle) {
            return "Color(color=" + colorStyle + ')';
        }

        public boolean equals(Object obj) {
            return equals-impl(this.color, obj);
        }

        public final /* synthetic */ ColorStyle getColor() {
            return this.color;
        }

        public int hashCode() {
            return hashCode-impl(this.color);
        }

        public String toString() {
            return toString-impl(this.color);
        }

        public final /* synthetic */ ColorStyle unbox-impl() {
            return this.color;
        }
    }

    public static final class Image implements BackgroundStyle {
        public static final int $stable = 8;
        private final ColorStyle colorOverlay;
        private final f contentScale;
        private final c painter;

        public Image(c painter, f contentScale, ColorStyle colorStyle) {
            t.g(painter, "painter");
            t.g(contentScale, "contentScale");
            this.painter = painter;
            this.contentScale = contentScale;
            this.colorOverlay = colorStyle;
        }

        public static /* synthetic */ Image copy$default(Image image, c cVar, f fVar, ColorStyle colorStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = image.painter;
            }
            if ((i & 2) != 0) {
                fVar = image.contentScale;
            }
            if ((i & 4) != 0) {
                colorStyle = image.colorOverlay;
            }
            return image.copy(cVar, fVar, colorStyle);
        }

        public final c component1() {
            return this.painter;
        }

        public final f component2() {
            return this.contentScale;
        }

        public final ColorStyle component3() {
            return this.colorOverlay;
        }

        public final Image copy(c painter, f contentScale, ColorStyle colorStyle) {
            t.g(painter, "painter");
            t.g(contentScale, "contentScale");
            return new Image(painter, contentScale, colorStyle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return t.c(this.painter, image.painter) && t.c(this.contentScale, image.contentScale) && t.c(this.colorOverlay, image.colorOverlay);
        }

        public final /* synthetic */ ColorStyle getColorOverlay() {
            return this.colorOverlay;
        }

        public final /* synthetic */ f getContentScale() {
            return this.contentScale;
        }

        public final /* synthetic */ c getPainter() {
            return this.painter;
        }

        public int hashCode() {
            int hashCode = ((this.painter.hashCode() * 31) + this.contentScale.hashCode()) * 31;
            ColorStyle colorStyle = this.colorOverlay;
            return hashCode + (colorStyle == null ? 0 : colorStyle.hashCode());
        }

        public String toString() {
            return "Image(painter=" + this.painter + ", contentScale=" + this.contentScale + ", colorOverlay=" + this.colorOverlay + ')';
        }
    }

    public static final class Video implements BackgroundStyle {
        public static final int $stable = 0;
        private final ColorStyles colorOverlay;
        private final f contentScale;
        private final ThemeImageUrls fallbackImage;
        private final boolean loop;
        private final boolean muteAudio;
        private final ThemeVideoUrls sources;

        public Video(ThemeVideoUrls sources, ThemeImageUrls fallbackImage, boolean z, boolean z2, f contentScale, ColorStyles colorStyles) {
            t.g(sources, "sources");
            t.g(fallbackImage, "fallbackImage");
            t.g(contentScale, "contentScale");
            this.sources = sources;
            this.fallbackImage = fallbackImage;
            this.loop = z;
            this.muteAudio = z2;
            this.contentScale = contentScale;
            this.colorOverlay = colorStyles;
        }

        public static /* synthetic */ Video copy$default(Video video, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, boolean z, boolean z2, f fVar, ColorStyles colorStyles, int i, Object obj) {
            if ((i & 1) != 0) {
                themeVideoUrls = video.sources;
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
                fVar = video.contentScale;
            }
            f fVar2 = fVar;
            if ((i & 32) != 0) {
                colorStyles = video.colorOverlay;
            }
            return video.copy(themeVideoUrls, themeImageUrls2, z3, z4, fVar2, colorStyles);
        }

        public final ThemeVideoUrls component1() {
            return this.sources;
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

        public final f component5() {
            return this.contentScale;
        }

        public final ColorStyles component6() {
            return this.colorOverlay;
        }

        public final Video copy(ThemeVideoUrls sources, ThemeImageUrls fallbackImage, boolean z, boolean z2, f contentScale, ColorStyles colorStyles) {
            t.g(sources, "sources");
            t.g(fallbackImage, "fallbackImage");
            t.g(contentScale, "contentScale");
            return new Video(sources, fallbackImage, z, z2, contentScale, colorStyles);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            return t.c(this.sources, video.sources) && t.c(this.fallbackImage, video.fallbackImage) && this.loop == video.loop && this.muteAudio == video.muteAudio && t.c(this.contentScale, video.contentScale) && t.c(this.colorOverlay, video.colorOverlay);
        }

        public final /* synthetic */ ColorStyles getColorOverlay() {
            return this.colorOverlay;
        }

        public final /* synthetic */ f getContentScale() {
            return this.contentScale;
        }

        public final /* synthetic */ ThemeImageUrls getFallbackImage() {
            return this.fallbackImage;
        }

        public final /* synthetic */ boolean getLoop() {
            return this.loop;
        }

        public final /* synthetic */ boolean getMuteAudio() {
            return this.muteAudio;
        }

        public final /* synthetic */ ThemeVideoUrls getSources() {
            return this.sources;
        }

        public int hashCode() {
            int hashCode = ((((((((this.sources.hashCode() * 31) + this.fallbackImage.hashCode()) * 31) + Boolean.hashCode(this.loop)) * 31) + Boolean.hashCode(this.muteAudio)) * 31) + this.contentScale.hashCode()) * 31;
            ColorStyles colorStyles = this.colorOverlay;
            return hashCode + (colorStyles == null ? 0 : colorStyles.hashCode());
        }

        public String toString() {
            return "Video(sources=" + this.sources + ", fallbackImage=" + this.fallbackImage + ", loop=" + this.loop + ", muteAudio=" + this.muteAudio + ", contentScale=" + this.contentScale + ", colorOverlay=" + this.colorOverlay + ')';
        }
    }
}

package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface LocalizationData {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final b serializer() {
            return LocalizationDataSerializer.INSTANCE;
        }
    }

    public static final class Image implements LocalizationData {
        public static final Companion Companion = new Companion(null);
        private final ThemeImageUrls value;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return LocalizationData$Image$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Image(ThemeImageUrls themeImageUrls) {
            this.value = themeImageUrls;
        }

        public static final /* synthetic */ Image box-impl(ThemeImageUrls themeImageUrls) {
            return new Image(themeImageUrls);
        }

        public static ThemeImageUrls constructor-impl(ThemeImageUrls themeImageUrls) {
            t.g(themeImageUrls, "value");
            return themeImageUrls;
        }

        public static boolean equals-impl(ThemeImageUrls themeImageUrls, Object obj) {
            return (obj instanceof Image) && t.c(themeImageUrls, ((Image) obj).unbox-impl());
        }

        public static final boolean equals-impl0(ThemeImageUrls themeImageUrls, ThemeImageUrls themeImageUrls2) {
            return t.c(themeImageUrls, themeImageUrls2);
        }

        public static int hashCode-impl(ThemeImageUrls themeImageUrls) {
            return themeImageUrls.hashCode();
        }

        public static String toString-impl(ThemeImageUrls themeImageUrls) {
            return "Image(value=" + themeImageUrls + ')';
        }

        public boolean equals(Object obj) {
            return equals-impl(this.value, obj);
        }

        public final /* synthetic */ ThemeImageUrls getValue() {
            return this.value;
        }

        public int hashCode() {
            return hashCode-impl(this.value);
        }

        public String toString() {
            return toString-impl(this.value);
        }

        public final /* synthetic */ ThemeImageUrls unbox-impl() {
            return this.value;
        }
    }

    public static final class Text implements LocalizationData {
        public static final Companion Companion = new Companion(null);
        private final String value;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return LocalizationData$Text$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Text(String str) {
            this.value = str;
        }

        public static final /* synthetic */ Text box-impl(String str) {
            return new Text(str);
        }

        public static String constructor-impl(String str) {
            t.g(str, "value");
            return str;
        }

        public static boolean equals-impl(String str, Object obj) {
            return (obj instanceof Text) && t.c(str, ((Text) obj).unbox-impl());
        }

        public static final boolean equals-impl0(String str, String str2) {
            return t.c(str, str2);
        }

        public static int hashCode-impl(String str) {
            return str.hashCode();
        }

        public static String toString-impl(String str) {
            return "Text(value=" + str + ')';
        }

        public boolean equals(Object obj) {
            return equals-impl(this.value, obj);
        }

        public final /* synthetic */ String getValue() {
            return this.value;
        }

        public int hashCode() {
            return hashCode-impl(this.value);
        }

        public String toString() {
            return toString-impl(this.value);
        }

        public final /* synthetic */ String unbox-impl() {
            return this.value;
        }
    }

    public static final class Video implements LocalizationData {
        public static final Companion Companion = new Companion(null);
        private final ThemeVideoUrls value;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return LocalizationData$Video$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Video(ThemeVideoUrls themeVideoUrls) {
            this.value = themeVideoUrls;
        }

        public static final /* synthetic */ Video box-impl(ThemeVideoUrls themeVideoUrls) {
            return new Video(themeVideoUrls);
        }

        public static ThemeVideoUrls constructor-impl(ThemeVideoUrls themeVideoUrls) {
            t.g(themeVideoUrls, "value");
            return themeVideoUrls;
        }

        public static boolean equals-impl(ThemeVideoUrls themeVideoUrls, Object obj) {
            return (obj instanceof Video) && t.c(themeVideoUrls, ((Video) obj).unbox-impl());
        }

        public static final boolean equals-impl0(ThemeVideoUrls themeVideoUrls, ThemeVideoUrls themeVideoUrls2) {
            return t.c(themeVideoUrls, themeVideoUrls2);
        }

        public static int hashCode-impl(ThemeVideoUrls themeVideoUrls) {
            return themeVideoUrls.hashCode();
        }

        public static String toString-impl(ThemeVideoUrls themeVideoUrls) {
            return "Video(value=" + themeVideoUrls + ')';
        }

        public boolean equals(Object obj) {
            return equals-impl(this.value, obj);
        }

        public final /* synthetic */ ThemeVideoUrls getValue() {
            return this.value;
        }

        public int hashCode() {
            return hashCode-impl(this.value);
        }

        public String toString() {
            return toString-impl(this.value);
        }

        public final /* synthetic */ ThemeVideoUrls unbox-impl() {
            return this.value;
        }
    }
}

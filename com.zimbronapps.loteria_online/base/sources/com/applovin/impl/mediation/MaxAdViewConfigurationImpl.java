package com.applovin.impl.mediation;

import com.applovin.mediation.MaxAdViewConfiguration;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxAdViewConfigurationImpl extends MaxAdViewConfiguration {
    private final MaxAdViewConfiguration.AdaptiveType a;
    private final int b;
    private final int c;

    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {
        private MaxAdViewConfiguration.AdaptiveType a = MaxAdViewConfiguration.AdaptiveType.NONE;
        private int b = -1;
        private int c = -1;

        public static /* synthetic */ MaxAdViewConfiguration.AdaptiveType a(BuilderImpl builderImpl) {
            return builderImpl.a;
        }

        public static /* synthetic */ int b(BuilderImpl builderImpl) {
            return builderImpl.b;
        }

        public static /* synthetic */ int c(BuilderImpl builderImpl) {
            return builderImpl.c;
        }

        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this, null);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.a;
        }

        public int getAdaptiveWidth() {
            return this.b;
        }

        public int getInlineMaximumHeight() {
            return this.c;
        }

        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + ")");
            this.a = adaptiveType;
            return this;
        }

        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i + ")");
            this.b = i;
            return this;
        }

        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i + ")");
            this.c = i;
            return this;
        }

        public String toString() {
            return "MaxAdViewConfiguration.Builder{adaptiveType=" + this.a + ", adaptiveWidth=" + this.b + ", inlineMaximumHeight=" + this.c + "}";
        }
    }

    public /* synthetic */ MaxAdViewConfigurationImpl(BuilderImpl builderImpl, a aVar) {
        this(builderImpl);
    }

    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.a;
    }

    public int getAdaptiveWidth() {
        return this.b;
    }

    public int getInlineMaximumHeight() {
        return this.c;
    }

    public String toString() {
        return "MaxAdViewConfiguration{adaptiveType=" + this.a + ", adaptiveWidth=" + this.b + ", inlineMaximumHeight=" + this.c + "}";
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.a = BuilderImpl.a(builderImpl);
        this.b = BuilderImpl.b(builderImpl);
        this.c = BuilderImpl.c(builderImpl);
    }
}

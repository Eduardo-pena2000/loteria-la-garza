package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import kotlin.jvm.internal.t;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface ColorStyle {

    public static final class Gradient implements ColorStyle {
        private final /* synthetic */ GradientBrush brush;

        private /* synthetic */ Gradient(GradientBrush gradientBrush) {
            this.brush = gradientBrush;
        }

        public static final /* synthetic */ Gradient box-impl(GradientBrush gradientBrush) {
            return new Gradient(gradientBrush);
        }

        public static GradientBrush constructor-impl(GradientBrush brush) {
            t.g(brush, "brush");
            return brush;
        }

        public static boolean equals-impl(GradientBrush gradientBrush, Object obj) {
            return (obj instanceof Gradient) && t.c(gradientBrush, ((Gradient) obj).unbox-impl());
        }

        public static final boolean equals-impl0(GradientBrush gradientBrush, GradientBrush gradientBrush2) {
            return t.c(gradientBrush, gradientBrush2);
        }

        public static int hashCode-impl(GradientBrush gradientBrush) {
            return gradientBrush.hashCode();
        }

        public static String toString-impl(GradientBrush gradientBrush) {
            return "Gradient(brush=" + gradientBrush + ')';
        }

        public boolean equals(Object obj) {
            return equals-impl(this.brush, obj);
        }

        public final GradientBrush getBrush() {
            return this.brush;
        }

        public int hashCode() {
            return hashCode-impl(this.brush);
        }

        public String toString() {
            return toString-impl(this.brush);
        }

        public final /* synthetic */ GradientBrush unbox-impl() {
            return this.brush;
        }
    }

    public static final class Solid implements ColorStyle {
        private final /* synthetic */ long color;

        private /* synthetic */ Solid(long j) {
            this.color = j;
        }

        public static final /* synthetic */ Solid box-impl(long j) {
            return new Solid(j);
        }

        public static long constructor-impl(long j) {
            return j;
        }

        public static boolean equals-impl(long j, Object obj) {
            return (obj instanceof Solid) && r0.s(j, ((Solid) obj).unbox-impl());
        }

        public static final boolean equals-impl0(long j, long j2) {
            return r0.s(j, j2);
        }

        public static int hashCode-impl(long j) {
            return r0.y(j);
        }

        public static String toString-impl(long j) {
            return "Solid(color=" + r0.z(j) + ')';
        }

        public boolean equals(Object obj) {
            return equals-impl(this.color, obj);
        }

        public final long getColor-0d7_KjU() {
            return this.color;
        }

        public int hashCode() {
            return hashCode-impl(this.color);
        }

        public String toString() {
            return toString-impl(this.color);
        }

        public final /* synthetic */ long unbox-impl() {
            return this.color;
        }
    }
}

package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Ca.l;
import Ca.m;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.revenuecat.purchases.ui.revenuecatui.helpers.AppStyleExtractor;
import java.util.List;
import kotlin.jvm.internal.t;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DualColorImageGenerator {
    private static final int DEFAULT_IMAGE_SIZE = 200;
    public static final DualColorImageGenerator INSTANCE = new DualColorImageGenerator();
    private static final l redGreen$delegate = m.b(DualColorImageGenerator$redGreen$2.INSTANCE);
    private static final l blueGreen$delegate = m.b(DualColorImageGenerator$blueGreen$2.INSTANCE);
    private static final l purpleOrange$delegate = m.b(DualColorImageGenerator$purpleOrange$2.INSTANCE);
    public static final int $stable = 8;

    public static final class PreviewAppIcon {
        public static final int $stable = 8;
        private final Bitmap bitmap;
        private final List prominentColors;

        public PreviewAppIcon(Bitmap bitmap, List prominentColors) {
            t.g(bitmap, "bitmap");
            t.g(prominentColors, "prominentColors");
            this.bitmap = bitmap;
            this.prominentColors = prominentColors;
        }

        public static /* synthetic */ PreviewAppIcon copy$default(PreviewAppIcon previewAppIcon, Bitmap bitmap, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = previewAppIcon.bitmap;
            }
            if ((i & 2) != 0) {
                list = previewAppIcon.prominentColors;
            }
            return previewAppIcon.copy(bitmap, list);
        }

        public final Bitmap component1() {
            return this.bitmap;
        }

        public final List component2() {
            return this.prominentColors;
        }

        public final PreviewAppIcon copy(Bitmap bitmap, List prominentColors) {
            t.g(bitmap, "bitmap");
            t.g(prominentColors, "prominentColors");
            return new PreviewAppIcon(bitmap, prominentColors);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreviewAppIcon)) {
                return false;
            }
            PreviewAppIcon previewAppIcon = (PreviewAppIcon) obj;
            return t.c(this.bitmap, previewAppIcon.bitmap) && t.c(this.prominentColors, previewAppIcon.prominentColors);
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final List getProminentColors() {
            return this.prominentColors;
        }

        public int hashCode() {
            return (this.bitmap.hashCode() * 31) + this.prominentColors.hashCode();
        }

        public String toString() {
            return "PreviewAppIcon(bitmap=" + this.bitmap + ", prominentColors=" + this.prominentColors + ')';
        }
    }

    private DualColorImageGenerator() {
    }

    public static /* synthetic */ PreviewAppIcon create-RFnl5yQ$default(DualColorImageGenerator dualColorImageGenerator, long j, long j2, int i, int i2, int i3, Object obj) {
        return dualColorImageGenerator.create-RFnl5yQ(j, j2, (i3 & 4) != 0 ? 200 : i, (i3 & 8) != 0 ? 200 : i2);
    }

    private final Bitmap createBitmap(int i, int i2, int i3, int i4) {
        if (i3 <= 0 || i4 <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        t.f(createBitmap, "createBitmap(width, heig… Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f = i3;
        float f2 = f / 2.0f;
        paint.setColor(i);
        float f3 = i4;
        canvas.drawRect(0.0f, 0.0f, f2, f3, paint);
        paint.setColor(i2);
        canvas.drawRect(f2, 0.0f, f, f3, paint);
        return createBitmap;
    }

    public static /* synthetic */ void getPurpleOrange$annotations() {
    }

    public final PreviewAppIcon create-RFnl5yQ(long j, long j2, int i, int i2) {
        Bitmap createBitmap = createBitmap(s0.k(j), s0.k(j2), i, i2);
        if (createBitmap == null) {
            return null;
        }
        return new PreviewAppIcon(createBitmap, AppStyleExtractor.INSTANCE.extractProminentColors$revenuecatui_defaultsBc8Release(createBitmap, 2));
    }

    public final PreviewAppIcon getBlueGreen() {
        return (PreviewAppIcon) blueGreen$delegate.getValue();
    }

    public final PreviewAppIcon getPurpleOrange() {
        return (PreviewAppIcon) purpleOrange$delegate.getValue();
    }

    public final PreviewAppIcon getRedGreen() {
        return (PreviewAppIcon) redGreen$delegate.getValue();
    }
}

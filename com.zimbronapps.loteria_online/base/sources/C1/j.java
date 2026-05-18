package c1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j extends ReplacementSpan {
    public static final a k = new a(null);
    public static final int l = 8;
    public final float a;
    public final int b;
    public final float c;
    public final int d;
    public final float e;
    public final int f;
    public Paint.FontMetricsInt g;
    public int h;
    public int i;
    public boolean j;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.g;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        t.v("fontMetrics");
        return null;
    }

    public final int b() {
        if (!this.j) {
            g1.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.i;
    }

    public final int c() {
        return this.f;
    }

    public final int d() {
        if (!this.j) {
            g1.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.h;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        int a2;
        this.j = true;
        float textSize = paint.getTextSize();
        this.g = paint.getFontMetricsInt();
        if (!(a().descent > a().ascent)) {
            g1.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.b;
        if (i3 == 0) {
            f = this.a * this.e;
        } else {
            if (i3 != 1) {
                g1.a.b("Unsupported unit.");
                throw new Ca.i();
            }
            f = this.a * textSize;
        }
        this.h = k.a(f);
        int i4 = this.d;
        if (i4 == 0) {
            a2 = k.a(this.c * this.e);
        } else {
            if (i4 != 1) {
                g1.a.b("Unsupported unit.");
                throw new Ca.i();
            }
            a2 = k.a(this.c * textSize);
        }
        this.i = a2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + b() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + b();
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int b = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = b;
                        fontMetricsInt.descent = b + b();
                        break;
                    }
                    break;
                default:
                    g1.a.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return d();
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}

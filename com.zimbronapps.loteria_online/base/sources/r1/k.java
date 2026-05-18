package R1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k implements Spannable {

    public static final class a {
        public final TextPaint a;
        public final TextDirectionHeuristic b;
        public final int c;
        public final int d;
        public final PrecomputedText.Params e;

        public static class a {
            public final TextPaint a;
            public int c = 1;
            public int d = 1;
            public TextDirectionHeuristic b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public a(TextPaint textPaint) {
                this.a = textPaint;
            }

            public a a() {
                return new a(this.a, this.b, this.c, this.d);
            }

            public a b(int i) {
                this.c = i;
                return this;
            }

            public a c(int i) {
                this.d = i;
                return this;
            }

            public a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.e = i.a(h.a(g.a(f.a(j.a(textPaint), i), i2), textDirectionHeuristic));
            } else {
                this.e = null;
            }
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = i;
            this.d = i2;
        }

        public boolean a(a aVar) {
            if (this.c == aVar.b() && this.d == aVar.c() && this.a.getTextSize() == aVar.e().getTextSize() && this.a.getTextScaleX() == aVar.e().getTextScaleX() && this.a.getTextSkewX() == aVar.e().getTextSkewX() && this.a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.a.getFlags() == aVar.e().getFlags() && this.a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.a.getTypeface() == null ? aVar.e().getTypeface() == null : this.a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.b == aVar.d();
        }

        public int hashCode() {
            return S1.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.a.getTextSize());
            sb.append(", textScaleX=" + this.a.getTextScaleX());
            sb.append(", textSkewX=" + this.a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            sb.append(", textLocale=" + this.a.getTextLocales());
            sb.append(", typeface=" + this.a.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + R1.a.a(this.a));
            }
            sb.append(", textDir=" + this.b);
            sb.append(", breakStrategy=" + this.c);
            sb.append(", hyphenationFrequency=" + this.d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.a = b.a(params);
            this.b = c.a(params);
            this.c = d.a(params);
            this.d = e.a(params);
            this.e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}

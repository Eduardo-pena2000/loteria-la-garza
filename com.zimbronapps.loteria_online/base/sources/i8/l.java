package I8;

import java.io.Writer;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class l {
    public static void a(G8.f fVar, O8.a aVar) {
        J8.m.V.c(aVar, fVar);
    }

    public static Writer b(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    public static final class b extends Writer {
        public final Appendable a;
        public final a b = new a(null);

        public static class a implements CharSequence {
            public char[] a;
            public String b;

            public a() {
            }

            public void a(char[] cArr) {
                this.a = cArr;
                this.b = null;
            }

            public char charAt(int i) {
                return this.a[i];
            }

            public int length() {
                return this.a.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.a, i, i2 - i);
            }

            public String toString() {
                if (this.b == null) {
                    this.b = new String(this.a);
                }
                return this.b;
            }

            public /* synthetic */ a(a aVar) {
                this();
            }
        }

        public b(Appendable appendable) {
            this.a = appendable;
        }

        public void write(char[] cArr, int i, int i2) {
            this.b.a(cArr);
            this.a.append(this.b, i, i2 + i);
        }

        public Writer append(CharSequence charSequence) {
            this.a.append(charSequence);
            return this;
        }

        public void write(int i) {
            this.a.append((char) i);
        }

        public Writer append(CharSequence charSequence, int i, int i2) {
            this.a.append(charSequence, i, i2);
            return this;
        }

        public void write(String str, int i, int i2) {
            Objects.requireNonNull(str);
            this.a.append(str, i, i2 + i);
        }

        public void close() {
        }

        public void flush() {
        }
    }
}

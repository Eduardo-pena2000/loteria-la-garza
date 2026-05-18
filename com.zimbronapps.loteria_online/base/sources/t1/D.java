package T1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d {
    public final f a;

    public static final class a {
        public final c a;

        public a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.a = new b(clipData, i);
            } else {
                this.a = new d(clipData, i);
            }
        }

        public d a() {
            return this.a.build();
        }

        public a b(Bundle bundle) {
            this.a.b(bundle);
            return this;
        }

        public a c(int i) {
            this.a.a(i);
            return this;
        }

        public a d(Uri uri) {
            this.a.c(uri);
            return this;
        }
    }

    public static final class b implements c {
        public final ContentInfo.Builder a;

        public b(ClipData clipData, int i) {
            this.a = T1.g.a(clipData, i);
        }

        public void a(int i) {
            T1.f.a(this.a, i);
        }

        public void b(Bundle bundle) {
            i.a(this.a, bundle);
        }

        public d build() {
            return new d(new e(T1.e.a(this.a)));
        }

        public void c(Uri uri) {
            h.a(this.a, uri);
        }
    }

    public interface c {
        void a(int i);

        void b(Bundle bundle);

        d build();

        void c(Uri uri);
    }

    public static final class d implements c {
        public ClipData a;
        public int b;
        public int c;
        public Uri d;
        public Bundle e;

        public d(ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        public void a(int i) {
            this.c = i;
        }

        public void b(Bundle bundle) {
            this.e = bundle;
        }

        public d build() {
            return new d(new g(this));
        }

        public void c(Uri uri) {
            this.d = uri;
        }
    }

    public static final class e implements f {
        public final ContentInfo a;

        public e(ContentInfo contentInfo) {
            this.a = T1.c.a(S1.g.h(contentInfo));
        }

        public int a() {
            return l.a(this.a);
        }

        public ClipData b() {
            return j.a(this.a);
        }

        public ContentInfo c() {
            return this.a;
        }

        public int d() {
            return k.a(this.a);
        }

        public String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    public interface f {
        int a();

        ClipData b();

        ContentInfo c();

        int d();
    }

    public static final class g implements f {
        public final ClipData a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public g(d dVar) {
            this.a = (ClipData) S1.g.h(dVar.a);
            this.b = S1.g.d(dVar.b, 0, 5, "source");
            this.c = S1.g.g(dVar.c, 1);
            this.d = dVar.d;
            this.e = dVar.e;
        }

        public int a() {
            return this.b;
        }

        public ClipData b() {
            return this.a;
        }

        public ContentInfo c() {
            return null;
        }

        public int d() {
            return this.c;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            sb.append(d.e(this.b));
            sb.append(", flags=");
            sb.append(d.a(this.c));
            if (this.d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    public d(f fVar) {
        this.a = fVar;
    }

    public static String a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    public static String e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static d g(ContentInfo contentInfo) {
        return new d(new e(contentInfo));
    }

    public ClipData b() {
        return this.a.b();
    }

    public int c() {
        return this.a.d();
    }

    public int d() {
        return this.a.a();
    }

    public ContentInfo f() {
        ContentInfo c2 = this.a.c();
        Objects.requireNonNull(c2);
        return T1.c.a(c2);
    }

    public String toString() {
        return this.a.toString();
    }
}

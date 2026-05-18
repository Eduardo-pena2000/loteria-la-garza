package V1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f {
    public final c a;

    public interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri, clipDescription, uri2);
        } else {
            this.a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.a.b();
    }

    public ClipDescription b() {
        return this.a.getDescription();
    }

    public Uri c() {
        return this.a.d();
    }

    public void d() {
        this.a.c();
    }

    public Object e() {
        return this.a.a();
    }

    public static final class a implements c {
        public final InputContentInfo a;

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        public Object a() {
            return this.a;
        }

        public Uri b() {
            return this.a.getContentUri();
        }

        public void c() {
            this.a.requestPermission();
        }

        public Uri d() {
            return this.a.getLinkUri();
        }

        public ClipDescription getDescription() {
            return this.a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public f(c cVar) {
        this.a = cVar;
    }

    public static final class b implements c {
        public final Uri a;
        public final ClipDescription b;
        public final Uri c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        public Object a() {
            return null;
        }

        public Uri b() {
            return this.a;
        }

        public Uri d() {
            return this.c;
        }

        public ClipDescription getDescription() {
            return this.b;
        }

        public void c() {
        }
    }
}

package Y4;

import Da.D;
import V4.q;
import V4.r;
import Y4.i;
import Za.A;
import Za.E;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import kotlin.jvm.internal.t;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l implements i {
    public static final a c = new a(null);
    public final Uri a;
    public final e5.m b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements i.a {
        private final boolean c(Uri uri) {
            return t.c(uri.getScheme(), "android.resource");
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, e5.m mVar, T4.d dVar) {
            if (c(uri)) {
                return new l(uri, mVar);
            }
            return null;
        }
    }

    public l(Uri uri, e5.m mVar) {
        this.a = uri;
        this.b = mVar;
    }

    public Object a(Ga.e eVar) {
        Integer p;
        String authority = this.a.getAuthority();
        if (authority != null) {
            if (E.h0(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) D.q0(this.a.getPathSegments());
                if (str == null || (p = A.p(str)) == null) {
                    b(this.a);
                    throw new Ca.i();
                }
                int intValue = p.intValue();
                Context g = this.b.g();
                Resources resources = t.c(authority, g.getPackageName()) ? g.getResources() : g.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(intValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String j = j5.j.j(MimeTypeMap.getSingleton(), charSequence.subSequence(E.k0(charSequence, '/', 0, false, 6, (Object) null), charSequence.length()).toString());
                if (!t.c(j, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new m(q.b(x.d(x.k(resources.openRawResource(intValue, typedValue2))), g, new r(authority, intValue, typedValue2.density)), j, V4.f.c);
                }
                Drawable a2 = t.c(authority, g.getPackageName()) ? j5.d.a(g, intValue) : j5.d.d(g, resources, intValue);
                boolean t = j5.j.t(a2);
                if (t) {
                    a2 = new BitmapDrawable(g.getResources(), j5.l.a.a(a2, this.b.f(), this.b.n(), this.b.m(), this.b.c()));
                }
                return new g(a2, t, V4.f.c);
            }
        }
        b(this.a);
        throw new Ca.i();
    }

    public final Void b(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }
}

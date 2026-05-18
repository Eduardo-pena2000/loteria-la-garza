package pa;

import android.content.Context;
import android.util.Log;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.nativead.b;
import java.util.Map;
import pa.I;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class x extends f {
    public final pa.a b;
    public final String c;
    public final i d;
    public m e;
    public j f;
    public Map g;
    public NativeAdView h;
    public final A i;
    public final sa.b j;
    public TemplateView k;
    public final Context l;

    public x(Context context, int i, pa.a aVar, String str, I.c cVar, m mVar, i iVar, Map map, A a2, sa.b bVar) {
        super(i);
        this.l = context;
        this.b = aVar;
        this.c = str;
        this.e = mVar;
        this.d = iVar;
        this.g = map;
        this.i = a2;
        this.j = bVar;
    }

    public void a() {
        NativeAdView nativeAdView = this.h;
        if (nativeAdView != null) {
            nativeAdView.a();
            this.h = null;
        }
        TemplateView templateView = this.k;
        if (templateView != null) {
            templateView.c();
            this.k = null;
        }
    }

    public io.flutter.plugin.platform.i b() {
        NativeAdView nativeAdView = this.h;
        if (nativeAdView != null) {
            return new C(nativeAdView);
        }
        TemplateView templateView = this.k;
        if (templateView != null) {
            return new C(templateView);
        }
        return null;
    }

    public void c() {
        z zVar = new z(this);
        y yVar = new y(this.a, this.b);
        A a2 = this.i;
        com.google.android.gms.ads.nativead.b a3 = a2 == null ? new b.a().a() : a2.a();
        m mVar = this.e;
        if (mVar != null) {
            i iVar = this.d;
            String str = this.c;
            iVar.h(str, zVar, a3, yVar, mVar.b(str));
        } else {
            j jVar = this.f;
            if (jVar != null) {
                this.d.c(this.c, zVar, a3, yVar, jVar.l(this.c));
            } else {
                Log.e("FlutterNativeAd", "A null or invalid ad request was provided.");
            }
        }
    }

    public void d(NativeAd nativeAd) {
        this.j.getClass();
        TemplateView b = this.j.b(this.l);
        this.k = b;
        b.setNativeAd(nativeAd);
        nativeAd.setOnPaidEventListener(new B(this.b, this));
        this.b.m(this.a, nativeAd.getResponseInfo());
    }

    public x(Context context, int i, pa.a aVar, String str, I.c cVar, j jVar, i iVar, Map map, A a2, sa.b bVar) {
        super(i);
        this.l = context;
        this.b = aVar;
        this.c = str;
        this.f = jVar;
        this.d = iVar;
        this.g = map;
        this.i = a2;
        this.j = bVar;
    }

    public static class a {
        public pa.a a;
        public String b;
        public m c;
        public j d;
        public Map e;
        public Integer f;
        public A g;
        public i h;
        public sa.b i;
        public final Context j;

        public a(Context context) {
            this.j = context;
        }

        public x a() {
            if (this.a == null) {
                throw new IllegalStateException("AdInstanceManager cannot be null.");
            }
            if (this.b == null) {
                throw new IllegalStateException("AdUnitId cannot be null.");
            }
            if (this.i == null) {
                throw new IllegalStateException("NativeAdFactory and nativeTemplateStyle cannot be null.");
            }
            m mVar = this.c;
            if (mVar == null && this.d == null) {
                throw new IllegalStateException("adRequest or addManagerRequest must be non-null.");
            }
            return mVar == null ? new x(this.j, this.f.intValue(), this.a, this.b, (I.c) null, this.d, this.h, this.e, this.g, this.i) : new x(this.j, this.f.intValue(), this.a, this.b, (I.c) null, this.c, this.h, this.e, this.g, this.i);
        }

        public a c(j jVar) {
            this.d = jVar;
            return this;
        }

        public a d(String str) {
            this.b = str;
            return this;
        }

        public a e(Map map) {
            this.e = map;
            return this;
        }

        public a f(i iVar) {
            this.h = iVar;
            return this;
        }

        public a g(int i) {
            this.f = Integer.valueOf(i);
            return this;
        }

        public a h(pa.a aVar) {
            this.a = aVar;
            return this;
        }

        public a i(A a) {
            this.g = a;
            return this;
        }

        public a j(sa.b bVar) {
            this.i = bVar;
            return this;
        }

        public a k(m mVar) {
            this.c = mVar;
            return this;
        }

        public a b(I.c cVar) {
            return this;
        }
    }
}

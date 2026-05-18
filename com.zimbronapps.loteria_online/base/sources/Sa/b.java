package sa;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.ads.nativetemplates.TemplateView;
import java.util.Objects;
import v5.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class b {
    public final d a;
    public final ColorDrawable b;
    public final c c;
    public final c d;
    public final c e;
    public final c f;

    public b(d dVar, ColorDrawable colorDrawable, c cVar, c cVar2, c cVar3, c cVar4) {
        this.a = dVar;
        this.b = colorDrawable;
        this.c = cVar;
        this.d = cVar2;
        this.e = cVar3;
        this.f = cVar4;
    }

    public v5.a a() {
        a.a aVar = new a.a();
        ColorDrawable colorDrawable = this.b;
        if (colorDrawable != null) {
            aVar.f(colorDrawable);
        }
        c cVar = this.c;
        if (cVar != null) {
            if (cVar.a() != null) {
                aVar.b(this.c.a());
            }
            if (this.c.d() != null) {
                aVar.e(this.c.d().getColor());
            }
            if (this.c.b() != null) {
                aVar.d(this.c.b().c());
            }
            if (this.c.c() != null) {
                aVar.c(this.c.c().floatValue());
            }
        }
        c cVar2 = this.d;
        if (cVar2 != null) {
            if (cVar2.a() != null) {
                aVar.g(this.d.a());
            }
            if (this.d.d() != null) {
                aVar.j(this.d.d().getColor());
            }
            if (this.d.b() != null) {
                aVar.i(this.d.b().c());
            }
            if (this.d.c() != null) {
                aVar.h(this.d.c().floatValue());
            }
        }
        c cVar3 = this.e;
        if (cVar3 != null) {
            if (cVar3.a() != null) {
                aVar.k(this.e.a());
            }
            if (this.e.d() != null) {
                aVar.n(this.e.d().getColor());
            }
            if (this.e.b() != null) {
                aVar.m(this.e.b().c());
            }
            if (this.e.c() != null) {
                aVar.l(this.e.c().floatValue());
            }
        }
        c cVar4 = this.f;
        if (cVar4 != null) {
            if (cVar4.a() != null) {
                aVar.o(this.f.a());
            }
            if (this.f.d() != null) {
                aVar.r(this.f.d().getColor());
            }
            if (this.f.b() != null) {
                aVar.q(this.f.b().c());
            }
            if (this.f.c() != null) {
                aVar.p(this.f.c().floatValue());
            }
        }
        return aVar.a();
    }

    public TemplateView b(Context context) {
        TemplateView inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.a.c(), (ViewGroup) null);
        inflate.setStyles(a());
        return inflate;
    }

    public c c() {
        return this.c;
    }

    public ColorDrawable d() {
        return this.b;
    }

    public c e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && (((colorDrawable = this.b) == null && bVar.b == null) || colorDrawable.getColor() == bVar.b.getColor()) && Objects.equals(this.c, bVar.c) && Objects.equals(this.d, bVar.d) && Objects.equals(this.e, bVar.e) && Objects.equals(this.f, bVar.f);
    }

    public c f() {
        return this.e;
    }

    public d g() {
        return this.a;
    }

    public c h() {
        return this.f;
    }

    public int hashCode() {
        ColorDrawable colorDrawable = this.b;
        return Objects.hash(new Object[]{colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor()), this.c, this.d, this.e, this.f});
    }
}

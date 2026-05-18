package B9;

import D9.e;
import D9.g;
import android.content.Context;
import android.widget.RelativeLayout;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.scar.adapter.common.k;
import com.unity3d.scar.adapter.common.l;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a extends k implements f {
    public C9.a e;

    public class a implements Runnable {
        public final /* synthetic */ e a;
        public final /* synthetic */ v9.c b;

        public class a implements v9.b {
            public a() {
            }

            public void onAdLoaded() {
                a.h(a.this).put(a.this.b.c(), a.this.a);
            }
        }

        public a(e eVar, v9.c cVar) {
            this.a = eVar;
            this.b = cVar;
        }

        public void run() {
            this.a.b(new a());
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ g a;
        public final /* synthetic */ v9.c b;

        public class a implements v9.b {
            public a() {
            }

            public void onAdLoaded() {
                a.i(a.this).put(b.this.b.c(), b.this.a);
            }
        }

        public b(g gVar, v9.c cVar) {
            this.a = gVar;
            this.b = cVar;
        }

        public void run() {
            this.a.b(new a());
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ D9.c a;

        public c(D9.c cVar) {
            this.a = cVar;
        }

        public void run() {
            this.a.b(null);
        }
    }

    public a(d dVar, String str) {
        super(dVar);
        C9.a aVar = new C9.a(new u9.a(str));
        this.e = aVar;
        this.a = new E9.b(aVar);
    }

    public static /* synthetic */ Map h(a aVar) {
        return aVar.b;
    }

    public static /* synthetic */ Map i(a aVar) {
        return aVar.b;
    }

    public void d(Context context, v9.c cVar, i iVar) {
        l.a(new b(new g(context, this.e, cVar, this.d, iVar), cVar));
    }

    public void f(Context context, RelativeLayout relativeLayout, v9.c cVar, int i, int i2, com.unity3d.scar.adapter.common.g gVar) {
        l.a(new c(new D9.c(context, relativeLayout, this.e, cVar, i, i2, this.d, gVar)));
    }

    public void g(Context context, v9.c cVar, h hVar) {
        l.a(new a(new e(context, this.e, cVar, this.d, hVar), cVar));
    }
}

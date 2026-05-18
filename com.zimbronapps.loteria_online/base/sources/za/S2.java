package za;

import Ca.s;
import android.webkit.WebResourceResponse;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class s2 {
    public final P a;

    public s2(P pigeonRegistrar) {
        kotlin.jvm.internal.t.g(pigeonRegistrar, "pigeonRegistrar");
        this.a = pigeonRegistrar;
    }

    public static /* synthetic */ void a(Qa.l lVar, String str, Object obj) {
        d(lVar, str, obj);
    }

    public static final void d(Qa.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            s.a aVar = Ca.s.b;
            lVar.invoke(Ca.s.a(Ca.s.b(Ca.t.a(Q.a.a(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            s.a aVar2 = Ca.s.b;
            lVar.invoke(Ca.s.a(Ca.s.b(Ca.I.a)));
            return;
        }
        s.a aVar3 = Ca.s.b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new a((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    public P b() {
        return this.a;
    }

    public final void c(WebResourceResponse pigeon_instanceArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (b().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (b().d().f(pigeon_instanceArg)) {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.I.a)));
        } else {
            new da.a(b().a(), "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance", b().b()).d(Da.v.q(Long.valueOf(b().d().c(pigeon_instanceArg)), Long.valueOf(e(pigeon_instanceArg))), new r2(callback, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance"));
        }
    }

    public abstract long e(WebResourceResponse webResourceResponse);
}

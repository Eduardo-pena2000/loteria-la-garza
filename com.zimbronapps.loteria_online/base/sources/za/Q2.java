package za;

import Ca.s;
import android.webkit.WebResourceRequest;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class q2 {
    public final P a;

    public q2(P pigeonRegistrar) {
        kotlin.jvm.internal.t.g(pigeonRegistrar, "pigeonRegistrar");
        this.a = pigeonRegistrar;
    }

    public static /* synthetic */ void a(Qa.l lVar, String str, Object obj) {
        h(lVar, str, obj);
    }

    public static final void h(Qa.l lVar, String str, Object obj) {
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

    public abstract boolean c(WebResourceRequest webResourceRequest);

    public abstract boolean d(WebResourceRequest webResourceRequest);

    public abstract boolean e(WebResourceRequest webResourceRequest);

    public abstract String f(WebResourceRequest webResourceRequest);

    public final void g(WebResourceRequest pigeon_instanceArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (b().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
            return;
        }
        if (b().d().f(pigeon_instanceArg)) {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.I.a)));
            return;
        }
        long c = b().d().c(pigeon_instanceArg);
        String j = j(pigeon_instanceArg);
        boolean d = d(pigeon_instanceArg);
        boolean e = e(pigeon_instanceArg);
        boolean c2 = c(pigeon_instanceArg);
        new da.a(b().a(), "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance", b().b()).d(Da.v.q(Long.valueOf(c), j, Boolean.valueOf(d), Boolean.valueOf(e), Boolean.valueOf(c2), f(pigeon_instanceArg), i(pigeon_instanceArg)), new p2(callback, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance"));
    }

    public abstract Map i(WebResourceRequest webResourceRequest);

    public abstract String j(WebResourceRequest webResourceRequest);
}

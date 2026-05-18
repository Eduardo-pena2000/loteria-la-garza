package za;

import Ca.s;
import android.webkit.WebResourceError;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class m2 {
    public final P a;

    public m2(P pigeonRegistrar) {
        kotlin.jvm.internal.t.g(pigeonRegistrar, "pigeonRegistrar");
        this.a = pigeonRegistrar;
    }

    public static /* synthetic */ void a(Qa.l lVar, String str, Object obj) {
        f(lVar, str, obj);
    }

    public static final void f(Qa.l lVar, String str, Object obj) {
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

    public abstract String b(WebResourceError webResourceError);

    public abstract long c(WebResourceError webResourceError);

    public P d() {
        return this.a;
    }

    public final void e(WebResourceError pigeon_instanceArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (d().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (d().d().f(pigeon_instanceArg)) {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.I.a)));
        } else {
            long c = d().d().c(pigeon_instanceArg);
            long c2 = c(pigeon_instanceArg);
            new da.a(d().a(), "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance", d().b()).d(Da.v.q(Long.valueOf(c), Long.valueOf(c2), b(pigeon_instanceArg)), new l2(callback, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance"));
        }
    }
}

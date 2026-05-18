package O9;

import Y9.a;
import android.content.Context;
import da.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class e implements Y9.a, Z9.a {
    public static final a d = new a(null);
    public d a;
    public dev.fluttercommunity.plus.share.a b;
    public j c;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public void onAttachedToActivity(Z9.c binding) {
        t.g(binding, "binding");
        dev.fluttercommunity.plus.share.a aVar = this.b;
        d dVar = null;
        if (aVar == null) {
            t.v("manager");
            aVar = null;
        }
        binding.f(aVar);
        d dVar2 = this.a;
        if (dVar2 == null) {
            t.v("share");
        } else {
            dVar = dVar2;
        }
        dVar.o(binding.getActivity());
    }

    public void onAttachedToEngine(a.b binding) {
        t.g(binding, "binding");
        this.c = new j(binding.b(), "dev.fluttercommunity.plus/share");
        Context a2 = binding.a();
        t.f(a2, "getApplicationContext(...)");
        this.b = new dev.fluttercommunity.plus.share.a(a2);
        Context a3 = binding.a();
        t.f(a3, "getApplicationContext(...)");
        dev.fluttercommunity.plus.share.a aVar = this.b;
        j jVar = null;
        if (aVar == null) {
            t.v("manager");
            aVar = null;
        }
        d dVar = new d(a3, null, aVar);
        this.a = dVar;
        dev.fluttercommunity.plus.share.a aVar2 = this.b;
        if (aVar2 == null) {
            t.v("manager");
            aVar2 = null;
        }
        O9.a aVar3 = new O9.a(dVar, aVar2);
        j jVar2 = this.c;
        if (jVar2 == null) {
            t.v("methodChannel");
        } else {
            jVar = jVar2;
        }
        jVar.e(aVar3);
    }

    public void onDetachedFromActivity() {
        d dVar = this.a;
        if (dVar == null) {
            t.v("share");
            dVar = null;
        }
        dVar.o(null);
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b binding) {
        t.g(binding, "binding");
        j jVar = this.c;
        if (jVar == null) {
            t.v("methodChannel");
            jVar = null;
        }
        jVar.e(null);
    }

    public void onReattachedToActivityForConfigChanges(Z9.c binding) {
        t.g(binding, "binding");
        onAttachedToActivity(binding);
    }
}

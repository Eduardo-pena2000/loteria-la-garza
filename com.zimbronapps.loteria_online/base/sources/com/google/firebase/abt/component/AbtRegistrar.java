package com.google.firebase.abt.component;

import D7.a;
import D7.b;
import L7.c;
import L7.d;
import L7.q;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import v8.h;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a a(d dVar) {
        return lambda$getComponents$0(dVar);
    }

    private static /* synthetic */ a lambda$getComponents$0(d dVar) {
        return new a((Context) dVar.a(Context.class), dVar.e(F7.a.class));
    }

    public List getComponents() {
        return Arrays.asList(new c[]{c.e(a.class).h("fire-abt").b(q.l(Context.class)).b(q.j(F7.a.class)).f(new b()).d(), h.b("fire-abt", "21.1.1")});
    }
}

package com.unity3d.services.core.di;

import Ca.l;
import Ca.m;
import Ca.n;
import Qa.a;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IServiceComponentKt {

    public static final class 1 extends u implements a {
        final /* synthetic */ String $named;
        final /* synthetic */ IServiceComponent $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(IServiceComponent iServiceComponent, String str) {
            super(0);
            this.$this_inject = iServiceComponent;
            this.$named = str;
        }

        public final Object invoke() {
            IServiceComponent iServiceComponent = this.$this_inject;
            String str = this.$named;
            IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
            t.l(4, "T");
            return registry.getService(str, P.b(Object.class));
        }
    }

    public static final /* synthetic */ Object get(IServiceComponent iServiceComponent, String named) {
        t.g(iServiceComponent, "<this>");
        t.g(named, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        t.l(4, "T");
        return registry.getService(named, P.b(Object.class));
    }

    public static /* synthetic */ Object get$default(IServiceComponent iServiceComponent, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        t.g(iServiceComponent, "<this>");
        t.g(named, "named");
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        t.l(4, "T");
        return registry.getService(named, P.b(Object.class));
    }

    public static final /* synthetic */ l inject(IServiceComponent iServiceComponent, String named, n mode) {
        t.g(iServiceComponent, "<this>");
        t.g(named, "named");
        t.g(mode, "mode");
        t.k();
        return m.a(mode, new 1(iServiceComponent, named));
    }

    public static /* synthetic */ l inject$default(IServiceComponent iServiceComponent, String named, n mode, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        if ((i & 2) != 0) {
            mode = n.c;
        }
        t.g(iServiceComponent, "<this>");
        t.g(named, "named");
        t.g(mode, "mode");
        t.k();
        return m.a(mode, new 1(iServiceComponent, named));
    }
}

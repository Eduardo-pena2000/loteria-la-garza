package com.google.firebase.sessions;

import B8.l;
import B8.s;
import Da.v;
import Ga.i;
import L7.E;
import L7.q;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import cb.K;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.b;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import m8.h;
import o2.y;
import w5.j;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final E appContext;
    private static final E backgroundDispatcher;
    private static final E blockingDispatcher;
    private static final E firebaseApp;
    private static final E firebaseInstallationsApi;
    private static final E firebaseSessionsComponent;
    private static final E transportFactory;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    static {
        E b = E.b(Context.class);
        t.f(b, "unqualified(...)");
        appContext = b;
        E b2 = E.b(B7.g.class);
        t.f(b2, "unqualified(...)");
        firebaseApp = b2;
        E b3 = E.b(h.class);
        t.f(b3, "unqualified(...)");
        firebaseInstallationsApi = b3;
        E a2 = E.a(H7.a.class, K.class);
        t.f(a2, "qualified(...)");
        backgroundDispatcher = a2;
        E a3 = E.a(H7.b.class, K.class);
        t.f(a3, "qualified(...)");
        blockingDispatcher = a3;
        E b4 = E.b(j.class);
        t.f(b4, "unqualified(...)");
        transportFactory = b4;
        E b5 = E.b(b.class);
        t.f(b5, "unqualified(...)");
        firebaseSessionsComponent = b5;
        try {
            y.a.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w("FirebaseSessions", "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    public static /* synthetic */ b a(L7.d dVar) {
        return getComponents$lambda$1(dVar);
    }

    public static final /* synthetic */ E access$getAppContext$cp() {
        return appContext;
    }

    public static final /* synthetic */ E access$getBackgroundDispatcher$cp() {
        return backgroundDispatcher;
    }

    public static final /* synthetic */ E access$getBlockingDispatcher$cp() {
        return blockingDispatcher;
    }

    public static final /* synthetic */ E access$getFirebaseApp$cp() {
        return firebaseApp;
    }

    public static final /* synthetic */ E access$getFirebaseInstallationsApi$cp() {
        return firebaseInstallationsApi;
    }

    public static final /* synthetic */ E access$getFirebaseSessionsComponent$cp() {
        return firebaseSessionsComponent;
    }

    public static final /* synthetic */ E access$getTransportFactory$cp() {
        return transportFactory;
    }

    public static /* synthetic */ l b(L7.d dVar) {
        return getComponents$lambda$0(dVar);
    }

    private static final l getComponents$lambda$0(L7.d dVar) {
        return ((b) dVar.f(firebaseSessionsComponent)).b();
    }

    private static final b getComponents$lambda$1(L7.d dVar) {
        b.a a2 = com.google.firebase.sessions.a.a();
        Object f = dVar.f(appContext);
        t.f(f, "get(...)");
        b.a e = a2.e((Context) f);
        Object f2 = dVar.f(backgroundDispatcher);
        t.f(f2, "get(...)");
        b.a b = e.b((i) f2);
        Object f3 = dVar.f(blockingDispatcher);
        t.f(f3, "get(...)");
        b.a a3 = b.a((i) f3);
        Object f4 = dVar.f(firebaseApp);
        t.f(f4, "get(...)");
        b.a d = a3.d((B7.g) f4);
        Object f5 = dVar.f(firebaseInstallationsApi);
        t.f(f5, "get(...)");
        b.a f6 = d.f((h) f5);
        l8.b b2 = dVar.b(transportFactory);
        t.f(b2, "getProvider(...)");
        return f6.c(b2).build();
    }

    public List getComponents() {
        return v.q(new L7.c[]{L7.c.e(l.class).h("fire-sessions").b(q.k(firebaseSessionsComponent)).f(new s()).e().d(), L7.c.e(b.class).h("fire-sessions-component").b(q.k(appContext)).b(q.k(backgroundDispatcher)).b(q.k(blockingDispatcher)).b(q.k(firebaseApp)).b(q.k(firebaseInstallationsApi)).b(q.m(transportFactory)).f(new B8.t()).d(), v8.h.b("fire-sessions", "3.0.4")});
    }
}

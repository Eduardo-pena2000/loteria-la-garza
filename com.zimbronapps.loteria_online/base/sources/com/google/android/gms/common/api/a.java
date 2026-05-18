package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.d;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class a {
    public final a a;
    public final g b;
    public final String c;

    public static abstract class a extends e {
        @Deprecated
        public f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.f fVar, Object obj, h.b bVar, h.c cVar) {
            return buildClient(context, looper, fVar, obj, (com.google.android.gms.common.api.internal.f) bVar, (com.google.android.gms.common.api.internal.o) cVar);
        }

        public f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.f fVar, Object obj, com.google.android.gms.common.api.internal.f fVar2, com.google.android.gms.common.api.internal.o oVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {
        public static final b Q8 = new b(null);

        public interface a extends d {
            GoogleSignInAccount g1();
        }

        public static final class b implements d {
            public /* synthetic */ b(r rVar) {
            }
        }
    }

    public static abstract class e {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List getImpliedScopes(Object obj) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    public interface f extends b {
        void connect(d.c cVar);

        void disconnect();

        void disconnect(String str);

        v6.d[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(com.google.android.gms.common.internal.l lVar, Set set);

        Set getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(d.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g extends c {
    }

    public a(String str, a aVar, g gVar) {
        com.google.android.gms.common.internal.t.m(aVar, "Cannot construct an Api with a null ClientBuilder");
        com.google.android.gms.common.internal.t.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = aVar;
        this.b = gVar;
    }

    public final a a() {
        return this.a;
    }

    public final c b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }
}

package com.google.firebase.sessions;

import B8.G;
import B8.H;
import B8.L;
import B8.V;
import B8.Z;
import B8.a0;
import B8.b0;
import B8.c0;
import B8.l;
import B8.m;
import B8.n;
import B8.o;
import B8.p;
import B8.q;
import B8.r;
import Da.v;
import Ga.i;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import cb.O;
import cb.P;
import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import kotlin.jvm.internal.t;
import m8.h;
import o2.E;
import o2.j;
import o2.y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface b {

    public interface a {
        a a(i iVar);

        a b(i iVar);

        b build();

        a c(l8.b bVar);

        a d(B7.g gVar);

        a e(Context context);

        a f(h hVar);
    }

    public interface b {
        public static final a a = a.a;

        public static final class a {
            public static final /* synthetic */ a a = new a();

            public static /* synthetic */ File a(Context context) {
                return l(context);
            }

            public static /* synthetic */ File b(Context context) {
                return o(context);
            }

            public static /* synthetic */ E8.h c(o2.d dVar) {
                return k(dVar);
            }

            public static /* synthetic */ G d(H h, o2.d dVar) {
                return n(h, dVar);
            }

            public static /* synthetic */ o2.i g(a aVar, E e, p2.b bVar, List list, O o, Qa.a aVar2, int i, Object obj) {
                if ((i & 4) != 0) {
                    list = v.n();
                }
                return aVar.f(e, bVar, list, o, aVar2);
            }

            public static final E8.h k(o2.d dVar) {
                t.g(dVar, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", dVar);
                return E8.i.a.getDefaultValue();
            }

            public static final File l(Context context) {
                File a2 = n2.a.a(context, "firebaseSessions/sessionConfigsDataStore.data");
                a.i(a2);
                return a2;
            }

            public static final G n(H h, o2.d dVar) {
                t.g(dVar, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", dVar);
                return h.getDefaultValue();
            }

            public static final File o(Context context) {
                File a2 = n2.a.a(context, "firebaseSessions/sessionDataStore.data");
                a.i(a2);
                return a2;
            }

            public final B8.b e(B7.g gVar) {
                t.g(gVar, "firebaseApp");
                return L.a.b(gVar);
            }

            public final o2.i f(E e, p2.b bVar, List list, O o, Qa.a aVar) {
                return h() ? y.a.a(e, bVar, list, o, aVar) : j.a.a(e, bVar, list, o, aVar);
            }

            public final boolean h() {
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return true;
                } catch (UnsatisfiedLinkError | SecurityException unused) {
                    return false;
                }
            }

            public final void i(File file) {
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    return;
                }
                if (parentFile.exists() && !parentFile.isDirectory() && t.c(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                    throw new IOException("Failed to delete conflicting file: " + parentFile);
                }
                if (parentFile.isDirectory()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        n.a(m.a(parentFile), new FileAttribute[0]);
                        return;
                    } catch (Exception e) {
                        throw new IOException("Failed to create directory: " + parentFile, e);
                    }
                }
                if (parentFile.mkdirs() || parentFile.isDirectory()) {
                    return;
                }
                throw new IOException("Failed to create directory: " + parentFile);
            }

            public final o2.i j(Context context, i iVar) {
                t.g(context, "appContext");
                t.g(iVar, "blockingDispatcher");
                return g(this, E8.i.a, new p2.b(new o()), null, P.a(iVar), new p(context), 4, null);
            }

            public final o2.i m(Context context, i iVar, H h) {
                t.g(context, "appContext");
                t.g(iVar, "blockingDispatcher");
                t.g(h, "sessionDataSerializer");
                return g(this, h, new p2.b(new q(h)), null, P.a(iVar), new r(context), 4, null);
            }

            public final Z p() {
                return a0.a;
            }

            public final b0 q() {
                return c0.a;
            }
        }
    }

    V a();

    l b();
}

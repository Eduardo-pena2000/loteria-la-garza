package com.applovin.impl;

import android.os.Process;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b4 {
    private final PriorityBlockingQueue a = new PriorityBlockingQueue();
    private final com.applovin.impl.sdk.k b;

    public static class b extends Thread {
        private final BlockingQueue a;
        private final com.applovin.impl.sdk.k b;

        public /* synthetic */ b(BlockingQueue blockingQueue, int i, com.applovin.impl.sdk.k kVar, a aVar) {
            this(blockingQueue, i, kVar);
        }

        private void a() {
            b((c) this.a.take());
        }

        public static /* synthetic */ void b(c cVar, d dVar) {
            a(cVar, dVar);
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private b(BlockingQueue blockingQueue, int i, com.applovin.impl.sdk.k kVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.a = blockingQueue;
            this.b = kVar;
            setPriority(((Integer) kVar.a(x4.S)).intValue());
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x00f1 A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #13 {all -> 0x00fd, blocks: (B:55:0x00d9, B:57:0x00f1, B:72:0x0134), top: B:54:0x00d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(com.applovin.impl.b4.c r20) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b4.b.b(com.applovin.impl.b4$c):void");
        }

        private static /* synthetic */ void a(c cVar, d dVar) {
            c.g(cVar).accept(dVar);
        }

        private HttpURLConnection a(c cVar) {
            HttpURLConnection openConnection = new URL(c.b(cVar)).openConnection();
            openConnection.setRequestMethod(c.d(cVar));
            openConnection.setConnectTimeout(c.e(cVar));
            openConnection.setReadTimeout(c.e(cVar));
            openConnection.setDefaultUseCaches(false);
            openConnection.setAllowUserInteraction(false);
            openConnection.setUseCaches(false);
            openConnection.setInstanceFollowRedirects(true);
            openConnection.setDoInput(true);
            if (!c.f(cVar).isEmpty()) {
                for (Map.Entry entry : c.f(cVar).entrySet()) {
                    openConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return openConnection;
        }
    }

    public static class c implements Comparable {
        private static final AtomicInteger i = new AtomicInteger();
        private final String a;
        private final String b;
        private final Map c;
        private final byte[] d;
        private final int e;
        private final S1.b f;
        private final Executor g;
        private final int h;

        public static class a {
            private String a;
            private String b;
            private Map c = new HashMap();
            private byte[] d;
            private int e;
            private S1.b f;
            private Executor g;

            public static /* synthetic */ Map a(a aVar) {
                return aVar.c;
            }

            public static /* synthetic */ byte[] b(a aVar) {
                return aVar.d;
            }

            public static /* synthetic */ int c(a aVar) {
                return aVar.e;
            }

            public static /* synthetic */ S1.b d(a aVar) {
                return aVar.f;
            }

            public static /* synthetic */ Executor e(a aVar) {
                return aVar.g;
            }

            public static /* synthetic */ String f(a aVar) {
                return aVar.a;
            }

            public static /* synthetic */ String g(a aVar) {
                return aVar.b;
            }

            public a a(String str) {
                this.a = str;
                return this;
            }

            public a b(String str) {
                this.b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.d = bArr;
                return this;
            }

            public a a(int i) {
                this.e = i;
                return this;
            }

            public a a(S1.b bVar) {
                this.f = bVar;
                return this;
            }

            public a a(Executor executor) {
                this.g = executor;
                return this;
            }

            public c a() {
                return new c(this, null);
            }
        }

        public /* synthetic */ c(a aVar, a aVar2) {
            this(aVar);
        }

        public static /* synthetic */ byte[] a(c cVar) {
            return cVar.d;
        }

        public static /* synthetic */ String b(c cVar) {
            return cVar.a;
        }

        public static /* synthetic */ Executor c(c cVar) {
            return cVar.g;
        }

        public static /* synthetic */ String d(c cVar) {
            return cVar.b;
        }

        public static /* synthetic */ int e(c cVar) {
            return cVar.e;
        }

        public static /* synthetic */ Map f(c cVar) {
            return cVar.c;
        }

        public static /* synthetic */ S1.b g(c cVar) {
            return cVar.f;
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.h - cVar.h;
        }

        private c(a aVar) {
            this.a = a.f(aVar);
            this.b = a.g(aVar);
            this.c = a.a(aVar) != null ? a.a(aVar) : Collections.emptyMap();
            this.d = a.b(aVar);
            this.e = a.c(aVar);
            this.f = a.d(aVar);
            this.g = a.e(aVar);
            this.h = i.incrementAndGet();
        }
    }

    public static class d {
        private final int a;
        private final byte[] b;
        private final byte[] c;
        private final long d;
        private final Throwable e;

        public static class a {
            private int a;
            private byte[] b;
            private byte[] c;
            private long d;
            private Throwable e;

            public static /* synthetic */ int a(a aVar) {
                return aVar.a;
            }

            public static /* synthetic */ byte[] b(a aVar) {
                return aVar.b;
            }

            public static /* synthetic */ byte[] c(a aVar) {
                return aVar.c;
            }

            public static /* synthetic */ long d(a aVar) {
                return aVar.d;
            }

            public static /* synthetic */ Throwable e(a aVar) {
                return aVar.e;
            }

            public a a(int i) {
                this.a = i;
                return this;
            }

            public a b(byte[] bArr) {
                this.c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.b = bArr;
                return this;
            }

            public a a(Throwable th) {
                this.e = th;
                return this;
            }

            public a a(long j) {
                this.d = j;
                return this;
            }

            public d a() {
                return new d(this, null);
            }
        }

        public /* synthetic */ d(a aVar, a aVar2) {
            this(aVar);
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.a;
        }

        public int c() {
            Throwable th = this.e;
            if (th == null) {
                return this.a;
            }
            throw th;
        }

        public byte[] d() {
            Throwable th = this.e;
            if (th == null) {
                return this.b;
            }
            throw th;
        }

        public long e() {
            return this.d;
        }

        public byte[] f() {
            return this.c;
        }

        private d(a aVar) {
            this.a = a.a(aVar);
            this.b = a.b(aVar);
            this.c = a.c(aVar);
            this.d = a.d(aVar);
            this.e = a.e(aVar);
        }
    }

    public b4(com.applovin.impl.sdk.k kVar) {
        this.b = kVar;
    }

    public void a() {
        for (int i = 0; i < ((Integer) this.b.a(x4.R)).intValue(); i++) {
            new b(this.a, i, this.b, null).start();
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}

package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.e0;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class d0 extends c0 {
    private final String f;
    private final com.applovin.impl.sdk.ad.b g;
    private final List h;
    private final c i;
    private StringBuffer j;
    private final Object k;
    private final ExecutorService l;
    private final String m;
    private List n;
    private List o;

    public class a implements e0.a {
        final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.a.a(x4.T0)).booleanValue()) {
                    synchronized (d0.a(d0.this)) {
                        StringUtils.replaceAll(d0.b(d0.this), this.a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.b(d0.this), this.a, uri.toString());
                }
                d0.c(d0.this).a(uri.toString(), this.a);
                return;
            }
            com.applovin.impl.sdk.o oVar = d0.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                d0 d0Var = d0.this;
                d0Var.c.a(d0Var.b, "Failed to cache JavaScript resource " + this.a);
            }
            if (d0.d(d0.this) != null) {
                d0.d(d0.this).a(d0.e(d0.this), true);
            }
        }
    }

    public class b implements e0.a {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) d0.this.a.a(x4.T0)).booleanValue()) {
                    synchronized (d0.a(d0.this)) {
                        StringUtils.replaceAll(d0.b(d0.this), this.a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(d0.b(d0.this), this.a, uri.toString());
                }
                d0.c(d0.this).a(uri.toString(), this.a);
                return;
            }
            if (!d0.c(d0.this).Q().contains(this.b + this.c) || d0.d(d0.this) == null) {
                return;
            }
            d0.d(d0.this).a(d0.e(d0.this), true);
        }
    }

    public interface c {
        void a(String str, boolean z);
    }

    public d0(String str, com.applovin.impl.sdk.ad.b bVar, List list, ExecutorService executorService, String str2, com.applovin.impl.sdk.k kVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", kVar);
        this.f = str;
        this.g = bVar;
        this.h = list;
        this.l = executorService;
        this.m = str2;
        this.i = cVar;
        this.j = new StringBuffer(str);
        this.k = new Object();
    }

    public static /* synthetic */ Object a(d0 d0Var) {
        return d0Var.k;
    }

    public static /* synthetic */ StringBuffer b(d0 d0Var) {
        return d0Var.j;
    }

    public static /* synthetic */ com.applovin.impl.sdk.ad.b c(d0 d0Var) {
        return d0Var.g;
    }

    public static /* synthetic */ c d(d0 d0Var) {
        return d0Var.i;
    }

    public static /* synthetic */ String e(d0 d0Var) {
        return d0Var.f;
    }

    private Collection f() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add('\"');
        return hashSet;
    }

    private void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.l.submit((e0) it.next()));
        }
        this.o = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((Future) it2.next()).get();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0017, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.HashSet d() {
        /*
            r18 = this;
            r0 = r18
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.applovin.impl.sdk.ad.b r2 = r0.g
            java.util.List r2 = r2.H()
            java.util.Collection r3 = r18.f()
            java.util.List r4 = r0.h
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ldb
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r6 = 0
            r7 = r6
        L25:
            java.lang.String r8 = r0.f
            int r8 = r8.length()
            if (r6 >= r8) goto L17
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.e
            boolean r6 = r6.get()
            r8 = 0
            if (r6 == 0) goto L37
            return r8
        L37:
            java.lang.String r6 = r0.f
            int r6 = r6.indexOf(r5, r7)
            r7 = -1
            if (r6 != r7) goto L41
            goto L17
        L41:
            java.lang.String r7 = r0.f
            int r7 = r7.length()
            r9 = r6
        L48:
            java.lang.String r10 = r0.f
            char r10 = r10.charAt(r9)
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            boolean r10 = r3.contains(r10)
            if (r10 != 0) goto L5d
            if (r9 >= r7) goto L5d
            int r9 = r9 + 1
            goto L48
        L5d:
            if (r9 <= r6) goto Lcb
            if (r9 == r7) goto Lcb
            java.lang.String r7 = r0.f
            int r8 = r5.length()
            int r8 = r8 + r6
            java.lang.String r7 = r7.substring(r8, r9)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r7)
            java.lang.String r11 = r8.toString()
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r7)
            if (r8 == 0) goto Laa
            boolean r8 = r2.contains(r11)
            if (r8 != 0) goto Laa
            com.applovin.impl.e0 r8 = new com.applovin.impl.e0
            com.applovin.impl.sdk.ad.b r12 = r0.g
            java.lang.String[] r10 = new java.lang.String[]{r5}
            java.util.List r13 = java.util.Arrays.asList(r10)
            java.lang.String r15 = r0.m
            com.applovin.impl.sdk.k r14 = r0.a
            com.applovin.impl.d0$b r10 = new com.applovin.impl.d0$b
            r10.<init>(r11, r5, r7)
            r7 = 1
            r17 = r10
            r10 = r8
            r16 = r14
            r14 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r1.add(r8)
            goto Lc8
        Laa:
            boolean r8 = com.applovin.impl.sdk.o.a()
            if (r8 == 0) goto Lc8
            com.applovin.impl.sdk.o r8 = r0.c
            java.lang.String r10 = r0.b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Skip caching of optional or non-resource "
            r11.append(r12)
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            r8.a(r10, r7)
        Lc8:
            r7 = r9
            goto L25
        Lcb:
            boolean r1 = com.applovin.impl.sdk.o.a()
            if (r1 == 0) goto Lda
            com.applovin.impl.sdk.o r1 = r0.c
            java.lang.String r2 = r0.b
            java.lang.String r3 = "Unable to cache resource; ad HTML is invalid."
            r1.b(r2, r3)
        Lda:
            return r8
        Ldb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d0.d():java.util.HashSet");
    }

    private HashSet e() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f, (String) this.a.a(x4.h5)), 1)) {
            if (this.e.get()) {
                return null;
            }
            if (StringUtils.isValidString(str)) {
                hashSet.add(new e0(str, this.g, Collections.emptyList(), false, this.m, this.a, new a(str)));
            } else if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Skip caching of non-resource " + str);
            }
        }
        return hashSet;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        HashSet e;
        if (this.e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f)) {
            a(this.f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.a.a(x4.E0)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet d = d();
        if (d != null) {
            hashSet.addAll(d);
        }
        if (((Boolean) this.a.a(x4.g5)).booleanValue() && (e = e()) != null) {
            hashSet.addAll(e);
        }
        this.n = new ArrayList(hashSet);
        if (this.e.get()) {
            return Boolean.FALSE;
        }
        List list = this.n;
        if (list == null || list.isEmpty()) {
            a(this.f);
            return Boolean.FALSE;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Executing " + this.n.size() + " caching operations...");
        }
        if (this.a.q0().e()) {
            a(this.n);
        } else {
            this.l.invokeAll(this.n);
        }
        if (((Boolean) this.a.a(x4.T0)).booleanValue()) {
            synchronized (this.k) {
                a(this.j.toString());
            }
        } else {
            a(this.j.toString());
        }
        return Boolean.TRUE;
    }

    public void c() {
        List list = this.n;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e0) it.next()).a(true);
            }
        }
        List<Future> list2 = this.o;
        if (list2 != null) {
            for (Future future : list2) {
                if (!future.isDone()) {
                    future.cancel(true);
                }
            }
        }
    }

    private void a(String str) {
        c cVar;
        if (this.e.get() || (cVar = this.i) == null) {
            return;
        }
        cVar.a(str, false);
    }
}

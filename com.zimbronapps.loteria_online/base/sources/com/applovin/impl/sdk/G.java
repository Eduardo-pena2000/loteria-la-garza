package com.applovin.impl.sdk;

import com.applovin.impl.l1;
import com.applovin.impl.y2;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class g {
    private final k a;
    private final Map b = new HashMap();
    private final Object c = new Object();
    private final Map d = new HashMap();
    private final Object e = new Object();

    public static class b {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final String f;
        private final String g;
        private long h;
        private final ArrayDeque i;

        public /* synthetic */ b(y2 y2Var, c cVar, a aVar) {
            this(y2Var, cVar);
        }

        public static /* synthetic */ void a(b bVar, c cVar) {
            bVar.a(cVar);
        }

        public String b() {
            return this.d;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.e;
        }

        public String e() {
            return this.f;
        }

        public String f() {
            return this.g;
        }

        public String g() {
            return this.b;
        }

        public String h() {
            return this.f;
        }

        public c i() {
            return (c) this.i.getLast();
        }

        public String toString() {
            return "AdInfo{state='" + i() + "', adUnitId='" + this.a + "', format='" + this.b + "', adapterName='" + this.c + "', adapterClass='" + this.d + "', adapterVersion='" + this.e + "', bCode='" + this.f + "', creativeId='" + this.g + "', updated=" + this.h + '}';
        }

        private b(y2 y2Var, c cVar) {
            this.i = new ArrayDeque();
            this.a = y2Var.getAdUnitId();
            this.b = y2Var.getFormat().getLabel();
            this.c = y2Var.c();
            this.d = y2Var.b();
            this.e = y2Var.z();
            this.f = y2Var.B();
            this.g = y2Var.getCreativeId();
            a(cVar);
        }

        public String a() {
            return this.a;
        }

        private void a(c cVar) {
            this.h = System.currentTimeMillis();
            this.i.add(cVar);
        }
    }

    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW("show"),
        HIDE("hide"),
        CLICK("click"),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");

        private final String a;

        c(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public interface d {
        void a(b bVar);
    }

    public g(k kVar) {
        this.a = kVar;
        a();
    }

    public void a(y2 y2Var, c cVar) {
        synchronized (this.e) {
            try {
                String B = y2Var.B();
                b bVar = (b) this.d.get(B);
                if (bVar == null) {
                    if (cVar == c.DESTROY) {
                        return;
                    }
                    bVar = new b(y2Var, cVar, null);
                    this.d.put(B, bVar);
                } else if (bVar.i() == cVar) {
                    return;
                } else {
                    b.a(bVar, cVar);
                }
                if (cVar == c.DESTROY) {
                    this.d.remove(B);
                }
                a(bVar, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.c) {
            try {
                for (c cVar : c.values()) {
                    this.b.put(cVar, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.c) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    a((c) it.next()).add(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.c) {
            try {
                Iterator it = this.b.keySet().iterator();
                while (it.hasNext()) {
                    a((c) it.next()).remove(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.c) {
            try {
                Set set = (Set) this.b.get(cVar);
                if (l1.a(set)) {
                    return set;
                }
                return new HashSet();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(b bVar, c cVar) {
        synchronized (this.c) {
            try {
                Iterator it = a(cVar).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

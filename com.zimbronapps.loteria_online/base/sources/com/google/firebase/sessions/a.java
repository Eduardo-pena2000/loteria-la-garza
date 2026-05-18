package com.google.firebase.sessions;

import B8.D;
import B8.I;
import B8.O;
import B8.Q;
import B8.U;
import B8.V;
import B8.X;
import B8.l;
import B8.u;
import E8.k;
import E8.n;
import Ga.i;
import android.content.Context;
import com.google.firebase.sessions.b;
import m8.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class a {

    public static final class b implements b.a {
        public Context a;
        public i b;
        public i c;
        public B7.g d;
        public h e;
        public l8.b f;

        public b() {
        }

        public com.google.firebase.sessions.b build() {
            D8.d.a(this.a, Context.class);
            D8.d.a(this.b, i.class);
            D8.d.a(this.c, i.class);
            D8.d.a(this.d, B7.g.class);
            D8.d.a(this.e, h.class);
            D8.d.a(this.f, l8.b.class);
            return new c(this.a, this.b, this.c, this.d, this.e, this.f, null);
        }

        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public b e(Context context) {
            this.a = (Context) D8.d.b(context);
            return this;
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b b(i iVar) {
            this.b = (i) D8.d.b(iVar);
            return this;
        }

        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public b a(i iVar) {
            this.c = (i) D8.d.b(iVar);
            return this;
        }

        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public b d(B7.g gVar) {
            this.d = (B7.g) D8.d.b(gVar);
            return this;
        }

        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public b f(h hVar) {
            this.e = (h) D8.d.b(hVar);
            return this;
        }

        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public b c(l8.b bVar) {
            this.f = (l8.b) D8.d.b(bVar);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static final class c implements com.google.firebase.sessions.b {
        public final c a;
        public D8.e b;
        public D8.e c;
        public D8.e d;
        public D8.e e;
        public D8.e f;
        public D8.e g;
        public D8.e h;
        public D8.e i;
        public D8.e j;
        public D8.e k;
        public D8.e l;
        public D8.e m;
        public D8.e n;
        public D8.e o;
        public D8.e p;
        public D8.e q;
        public D8.e r;
        public D8.e s;
        public D8.e t;
        public D8.e u;
        public D8.e v;
        public D8.e w;
        public D8.e x;
        public D8.e y;

        public /* synthetic */ c(Context context, i iVar, i iVar2, B7.g gVar, h hVar, l8.b bVar, a aVar) {
            this(context, iVar, iVar2, gVar, hVar, bVar);
        }

        public V a() {
            return (V) this.w.get();
        }

        public l b() {
            return (l) this.y.get();
        }

        public final void c(Context context, i iVar, i iVar2, B7.g gVar, h hVar, l8.b bVar) {
            this.b = D8.c.a(gVar);
            D8.b a = D8.c.a(context);
            this.c = a;
            this.d = D8.a.a(E8.c.a(a));
            this.e = D8.a.a(f.a());
            this.f = D8.c.a(hVar);
            this.g = D8.a.a(com.google.firebase.sessions.c.b(this.b));
            D8.b a2 = D8.c.a(iVar2);
            this.h = a2;
            this.i = D8.a.a(E8.f.a(this.g, a2));
            this.j = D8.c.a(iVar);
            D8.e a3 = D8.a.a(d.a(this.c, this.h));
            this.k = a3;
            D8.e a4 = D8.a.a(n.a(this.j, this.e, a3));
            this.l = a4;
            D8.e a5 = D8.a.a(E8.g.a(this.e, this.f, this.g, this.i, a4));
            this.m = a5;
            this.n = D8.a.a(k.a(this.d, a5));
            D8.e a6 = D8.a.a(g.a());
            this.o = a6;
            this.p = D8.a.a(Q.a(this.e, a6));
            D8.b a7 = D8.c.a(bVar);
            this.q = a7;
            D8.e a8 = D8.a.a(B8.i.a(a7));
            this.r = a8;
            this.s = D8.a.a(O.a(this.b, this.f, this.n, a8, this.j));
            D8.e a9 = D8.a.a(I.a(this.p));
            this.t = a9;
            this.u = D8.a.a(e.a(this.c, this.h, a9));
            D8.e a10 = D8.a.a(D.a(this.c, this.o));
            this.v = a10;
            D8.e a11 = D8.a.a(X.a(this.n, this.p, this.s, this.e, this.u, a10, this.j));
            this.w = a11;
            D8.e a12 = D8.a.a(U.a(a11));
            this.x = a12;
            this.y = D8.a.a(u.a(this.b, this.n, this.j, a12));
        }

        public c(Context context, i iVar, i iVar2, B7.g gVar, h hVar, l8.b bVar) {
            this.a = this;
            c(context, iVar, iVar2, gVar, hVar, bVar);
        }
    }

    public static b.a a() {
        return new b(null);
    }
}

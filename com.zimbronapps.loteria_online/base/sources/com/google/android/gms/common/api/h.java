package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class h {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());

    public static final class a {
        public Account a;
        public int d;
        public View e;
        public String f;
        public String g;
        public final Context i;
        public Looper l;
        public final Set b = new HashSet();
        public final Set c = new HashSet();
        public final Map h = new w.a();
        public final Map j = new w.a();
        public int k = -1;
        public v6.g m = v6.g.o();
        public a.a n = n7.d.c;
        public final ArrayList o = new ArrayList();
        public final ArrayList p = new ArrayList();

        public a(Context context) {
            this.i = context;
            this.l = context.getMainLooper();
            this.f = context.getPackageName();
            this.g = context.getClass().getName();
        }

        public final com.google.android.gms.common.internal.f a() {
            n7.a aVar = n7.a.j;
            Map map = this.j;
            com.google.android.gms.common.api.a aVar2 = n7.d.g;
            if (map.containsKey(aVar2)) {
                aVar = (n7.a) this.j.get(aVar2);
            }
            return new com.google.android.gms.common.internal.f(this.a, this.b, this.h, this.d, this.e, this.f, this.g, aVar, false);
        }
    }

    public interface b extends com.google.android.gms.common.api.internal.f {
    }

    public interface c extends com.google.android.gms.common.api.internal.o {
    }

    public static Set c() {
        Set set = a;
        synchronized (set) {
        }
        return set;
    }

    public abstract com.google.android.gms.common.api.internal.d a(com.google.android.gms.common.api.internal.d dVar);

    public abstract com.google.android.gms.common.api.internal.d b(com.google.android.gms.common.api.internal.d dVar);

    public a.f d(a.c cVar) {
        throw new UnsupportedOperationException();
    }

    public abstract Context e();

    public abstract Looper f();

    public abstract boolean g();

    public boolean h(com.google.android.gms.common.api.internal.s sVar) {
        throw new UnsupportedOperationException();
    }

    public void i() {
        throw new UnsupportedOperationException();
    }

    public com.google.android.gms.common.api.internal.l j(Object obj) {
        throw new UnsupportedOperationException();
    }
}

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.h;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class f {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final int e;
    public final View f;
    public final String g;
    public final String h;
    public final n7.a i;
    public Integer j;

    public static final class a {
        public Account a;
        public w.b b;
        public String c;
        public String d;
        public final n7.a e = n7.a.j;

        public f a() {
            return new f(this.a, this.b, null, 0, null, this.c, this.d, this.e, false);
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.b == null) {
                this.b = new w.b();
            }
            this.b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.a = account;
            return this;
        }

        public final a e(String str) {
            this.d = str;
            return this;
        }
    }

    public f(Account account, Set set, Map map, int i, View view, String str, String str2, n7.a aVar, boolean z) {
        this.a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.d = map;
        this.f = view;
        this.e = i;
        this.g = str;
        this.h = str2;
        this.i = aVar == null ? n7.a.j : aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }

    public static f a(Context context) {
        return new h.a(context).a();
    }

    public Account b() {
        return this.a;
    }

    public String c() {
        Account account = this.a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account d() {
        Account account = this.a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set e() {
        return this.c;
    }

    public Set f(com.google.android.gms.common.api.a aVar) {
        android.support.v4.media.session.b.a(this.d.get(aVar));
        return this.b;
    }

    public int g() {
        return this.e;
    }

    public String h() {
        return this.g;
    }

    public Set i() {
        return this.b;
    }

    public View j() {
        return this.f;
    }

    public final n7.a k() {
        return this.i;
    }

    public final Integer l() {
        return this.j;
    }

    public final String m() {
        return this.h;
    }

    public final void n(Integer num) {
        this.j = num;
    }
}

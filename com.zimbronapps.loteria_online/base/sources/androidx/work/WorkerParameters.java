package androidx.work;

import G4.g;
import G4.r;
import G4.y;
import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class WorkerParameters {
    public UUID a;
    public b b;
    public Set c;
    public a d;
    public int e;
    public Executor f;
    public S4.a g;
    public y h;
    public r i;
    public g j;

    public static class a {
        public List a = Collections.emptyList();
        public List b = Collections.emptyList();
        public Network c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i, Executor executor, S4.a aVar2, y yVar, r rVar, g gVar) {
        this.a = uuid;
        this.b = bVar;
        this.c = new HashSet(collection);
        this.d = aVar;
        this.e = i;
        this.f = executor;
        this.g = aVar2;
        this.h = yVar;
        this.i = rVar;
        this.j = gVar;
    }

    public Executor a() {
        return this.f;
    }

    public g b() {
        return this.j;
    }

    public UUID c() {
        return this.a;
    }

    public b d() {
        return this.b;
    }

    public Network e() {
        return this.d.c;
    }

    public r f() {
        return this.i;
    }

    public int g() {
        return this.e;
    }

    public Set h() {
        return this.c;
    }

    public S4.a i() {
        return this.g;
    }

    public List j() {
        return this.d.a;
    }

    public List k() {
        return this.d.b;
    }

    public y l() {
        return this.h;
    }
}

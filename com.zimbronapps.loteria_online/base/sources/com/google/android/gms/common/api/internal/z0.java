package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class z0 {
    public final Map a = Collections.synchronizedMap(new w.a());
    public int b = 0;
    public Bundle c;

    public final j a(String str, Class cls) {
        return (j) cls.cast(this.a.get(str));
    }

    public final void b(String str, j jVar) {
        Map map = this.a;
        if (map.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        map.put(str, jVar);
        if (this.b > 0) {
            new zzg(Looper.getMainLooper()).post(new y0(this, jVar, str));
        }
    }

    public final void c(Bundle bundle) {
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.a.entrySet()) {
            ((j) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void d() {
        this.b = 2;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onStart();
        }
    }

    public final void e() {
        this.b = 3;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onResume();
        }
    }

    public final void f(int i, int i2, Intent intent) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onActivityResult(i, i2, intent);
        }
    }

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((j) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public final void h() {
        this.b = 4;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onStop();
        }
    }

    public final void i() {
        this.b = 5;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).onDestroy();
        }
    }

    public final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((j) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final /* synthetic */ int k() {
        return this.b;
    }

    public final /* synthetic */ Bundle l() {
        return this.c;
    }
}

package com.unity3d.ads.core.data.datasource;

import Ca.I;
import Qa.l;
import Za.B;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidUnityBootConfigDataSource$getValue$1$1$1 extends u implements l {
    final /* synthetic */ String $prefix;
    final /* synthetic */ O $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidUnityBootConfigDataSource$getValue$1$1$1(String str, O o) {
        super(1);
        this.$prefix = str;
        this.$value = o;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return I.a;
    }

    public final void invoke(String line) {
        t.g(line, "line");
        if (B.N(line, this.$prefix, false, 2, null)) {
            O o = this.$value;
            String substring = line.substring(this.$prefix.length());
            t.f(substring, "this as java.lang.String).substring(startIndex)");
            o.a = substring;
        }
    }
}

package com.unity3d.ads.core.data.datasource;

import Ca.I;
import Ga.e;
import android.content.Context;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.jvm.internal.t;
import o2.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ForcefulPreservingByteStringPreferenceMigration implements g {
    private final Context context;
    private final GetByteStringData getByteStringData;
    private final String key;
    private final String name;

    public ForcefulPreservingByteStringPreferenceMigration(Context context, String name, String key, GetByteStringData getByteStringData) {
        t.g(context, "context");
        t.g(name, "name");
        t.g(key, "key");
        t.g(getByteStringData, "getByteStringData");
        this.context = context;
        this.name = name;
        this.key = key;
        this.getByteStringData = getByteStringData;
    }

    public Object cleanUp(e eVar) {
        return I.a;
    }

    public Object migrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, e eVar) {
        String string = this.context.getSharedPreferences(this.name, 0).getString(this.key, (String) null);
        if (string == null || string.length() == 0) {
            return byteStringStore;
        }
        GeneratedMessageLite build = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(this.getByteStringData.invoke(string)).build();
        t.f(build, "newBuilder()\n           …\n                .build()");
        return build;
    }

    public Object shouldMigrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, e eVar) {
        return Ia.b.a(true);
    }
}

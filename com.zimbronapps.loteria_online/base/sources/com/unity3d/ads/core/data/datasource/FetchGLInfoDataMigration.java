package com.unity3d.ads.core.data.datasource;

import Ca.I;
import Ga.e;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.jvm.internal.t;
import o2.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FetchGLInfoDataMigration implements g {
    private final GetOpenGLRendererInfo getOpenGLRendererInfo;

    public FetchGLInfoDataMigration(GetOpenGLRendererInfo getOpenGLRendererInfo) {
        t.g(getOpenGLRendererInfo, "getOpenGLRendererInfo");
        this.getOpenGLRendererInfo = getOpenGLRendererInfo;
    }

    private final ByteString gatherOpenGLRendererInfo() {
        return this.getOpenGLRendererInfo.invoke();
    }

    public Object cleanUp(e eVar) {
        return I.a;
    }

    public Object migrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, e eVar) {
        ByteString byteString;
        try {
            byteString = gatherOpenGLRendererInfo();
        } catch (Exception unused) {
            byteString = ByteString.EMPTY;
            t.f(byteString, "{\n            ByteString.EMPTY\n        }");
        }
        GeneratedMessageLite build = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(byteString).build();
        t.f(build, "newBuilder()\n           …rer)\n            .build()");
        return build;
    }

    public Object shouldMigrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, e eVar) {
        return Ia.b.a(byteStringStore.getData().isEmpty());
    }
}

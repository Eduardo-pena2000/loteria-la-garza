package com.unity3d.ads.core.data.datasource;

import Ca.I;
import Ca.s;
import Ga.e;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidLegacyConfigStoreDataSource implements ByteStringDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_CONFIGURATION_STORE = "configuration.store";
    private final StorageManager storageManager;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidLegacyConfigStoreDataSource(StorageManager storageManager) {
        t.g(storageManager, "storageManager");
        this.storageManager = storageManager;
    }

    public Object get(e eVar) {
        Object b;
        Object obj = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE).get("configuration.store");
        String str = obj instanceof String ? (String) obj : null;
        try {
            s.a aVar = s.b;
            b = s.b(str != null ? ProtobufExtensionsKt.fromBase64(str, true) : null);
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(Ca.t.a(th));
        }
        ByteString EMPTY = (ByteString) (s.g(b) ? null : b);
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
        ByteStringStoreOuterClass.ByteStringStore.Builder newBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        t.f(newBuilder, "newBuilder()");
        ByteStringStoreKt.Dsl _create = companion._create(newBuilder);
        if (EMPTY == null) {
            EMPTY = ByteString.EMPTY;
            t.f(EMPTY, "EMPTY");
        }
        _create.setData(EMPTY);
        return _create._build();
    }

    public Object set(ByteString byteString, e eVar) {
        Storage storage = this.storageManager.getStorage(StorageManager.StorageType.PRIVATE);
        storage.set("configuration.store", ProtobufExtensionsKt.toBase64(byteString, true));
        storage.writeStorage();
        return I.a;
    }
}

package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GameServerIdReader extends MetadataReader {
    public static final Companion Companion = new Companion(null);
    public static final String PLAYER_SERVER_ID_KEY = "player.server_id.value";

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameServerIdReader(JsonStorage jsonStorage) {
        super(jsonStorage, "player.server_id.value");
        t.g(jsonStorage, "jsonStorage");
    }
}

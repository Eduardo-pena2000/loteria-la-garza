package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class GameSessionIdReader implements IGameSessionIdReader {
    private static final int GAME_SESSION_ID_LENGTH = 12;
    private static volatile GameSessionIdReader _instance;
    private Long gameSessionId;

    private GameSessionIdReader() {
    }

    private void generate() {
        UUID randomUUID = UUID.randomUUID();
        this.gameSessionId = Long.valueOf((Long.toString(randomUUID.getMostSignificantBits()) + Long.toString(randomUUID.getLeastSignificantBits())).replace("-", "").substring(0, 12));
    }

    public static GameSessionIdReader getInstance() {
        if (_instance == null) {
            synchronized (GameSessionIdReader.class) {
                try {
                    if (_instance == null) {
                        _instance = new GameSessionIdReader();
                    }
                } finally {
                }
            }
        }
        return _instance;
    }

    private void store() {
        Storage storage;
        if (!StorageManager.init(ClientProperties.getApplicationContext()) || (storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE)) == null) {
            return;
        }
        storage.set("unifiedconfig.data.gameSessionId", this.gameSessionId);
        storage.writeStorage();
    }

    public synchronized Long getGameSessionId() {
        try {
            if (this.gameSessionId == null) {
                generate();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.gameSessionId;
    }

    public synchronized Long getGameSessionIdAndStore() {
        try {
            if (this.gameSessionId == null) {
                generate();
                store();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.gameSessionId;
    }
}

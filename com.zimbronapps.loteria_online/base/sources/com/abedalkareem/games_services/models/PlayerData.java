package com.abedalkareem.games_services.models;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class PlayerData {
    private final String displayName;
    private final String iconImage;
    private final String playerID;

    public PlayerData(String str, String str2, String str3) {
        t.g(str, "displayName");
        this.displayName = str;
        this.playerID = str2;
        this.iconImage = str3;
    }

    public static /* synthetic */ PlayerData b(PlayerData playerData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playerData.displayName;
        }
        if ((i & 2) != 0) {
            str2 = playerData.playerID;
        }
        if ((i & 4) != 0) {
            str3 = playerData.iconImage;
        }
        return playerData.a(str, str2, str3);
    }

    public final PlayerData a(String str, String str2, String str3) {
        t.g(str, "displayName");
        return new PlayerData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerData)) {
            return false;
        }
        PlayerData playerData = (PlayerData) obj;
        return t.c(this.displayName, playerData.displayName) && t.c(this.playerID, playerData.playerID) && t.c(this.iconImage, playerData.iconImage);
    }

    public int hashCode() {
        int hashCode = this.displayName.hashCode() * 31;
        String str = this.playerID;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconImage;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PlayerData(displayName=" + this.displayName + ", playerID=" + this.playerID + ", iconImage=" + this.iconImage + ")";
    }
}

package com.abedalkareem.games_services.models;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class SavedGame {
    private final String deviceName;
    private final Long modificationDate;
    private final String name;

    public SavedGame(String str, Long l, String str2) {
        this.name = str;
        this.modificationDate = l;
        this.deviceName = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedGame)) {
            return false;
        }
        SavedGame savedGame = (SavedGame) obj;
        return t.c(this.name, savedGame.name) && t.c(this.modificationDate, savedGame.modificationDate) && t.c(this.deviceName, savedGame.deviceName);
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.modificationDate;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.deviceName;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SavedGame(name=" + this.name + ", modificationDate=" + this.modificationDate + ", deviceName=" + this.deviceName + ")";
    }
}

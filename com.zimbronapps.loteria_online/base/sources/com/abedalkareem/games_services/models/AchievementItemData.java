package com.abedalkareem.games_services.models;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class AchievementItemData {
    private final int completedSteps;
    private final String description;
    private final String id;
    private final String lockedImage;
    private final String name;
    private final int totalSteps;
    private final boolean unlocked;
    private final String unlockedImage;

    public AchievementItemData(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z) {
        t.g(str, "id");
        t.g(str2, "name");
        t.g(str3, "description");
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.lockedImage = str4;
        this.unlockedImage = str5;
        this.completedSteps = i;
        this.totalSteps = i2;
        this.unlocked = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AchievementItemData)) {
            return false;
        }
        AchievementItemData achievementItemData = (AchievementItemData) obj;
        return t.c(this.id, achievementItemData.id) && t.c(this.name, achievementItemData.name) && t.c(this.description, achievementItemData.description) && t.c(this.lockedImage, achievementItemData.lockedImage) && t.c(this.unlockedImage, achievementItemData.unlockedImage) && this.completedSteps == achievementItemData.completedSteps && this.totalSteps == achievementItemData.totalSteps && this.unlocked == achievementItemData.unlocked;
    }

    public int hashCode() {
        int hashCode = ((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31;
        String str = this.lockedImage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unlockedImage;
        return ((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.completedSteps)) * 31) + Integer.hashCode(this.totalSteps)) * 31) + Boolean.hashCode(this.unlocked);
    }

    public String toString() {
        return "AchievementItemData(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", lockedImage=" + this.lockedImage + ", unlockedImage=" + this.unlockedImage + ", completedSteps=" + this.completedSteps + ", totalSteps=" + this.totalSteps + ", unlocked=" + this.unlocked + ")";
    }
}

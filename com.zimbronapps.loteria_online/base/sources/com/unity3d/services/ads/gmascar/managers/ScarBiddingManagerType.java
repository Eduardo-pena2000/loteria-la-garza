package com.unity3d.services.ads.gmascar.managers;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public enum ScarBiddingManagerType {
    DISABLED("dis"),
    EAGER("eag");

    private final String name;

    public static class Constants {
        private static final String DIS = "dis";
        private static final String EAG = "eag";

        private Constants() {
        }
    }

    ScarBiddingManagerType(String str) {
        this.name = str;
    }

    public static ScarBiddingManagerType fromName(String str) {
        int hashCode = str.hashCode();
        if (hashCode == 99470) {
            str.equals("dis");
        } else if (hashCode == 100171 && str.equals("eag")) {
            return EAGER;
        }
        return DISABLED;
    }

    public String getName() {
        return this.name;
    }
}

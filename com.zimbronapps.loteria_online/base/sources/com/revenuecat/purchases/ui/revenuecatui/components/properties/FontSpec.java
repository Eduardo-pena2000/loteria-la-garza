package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import com.revenuecat.purchases.paywalls.DownloadedFontFamily;
import d1.u;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface FontSpec {

    public static final class Asset implements FontSpec {
        public static final int $stable = 0;
        private final u fontFamily;

        public Asset(u fontFamily) {
            t.g(fontFamily, "fontFamily");
            this.fontFamily = fontFamily;
        }

        public static /* synthetic */ Asset copy$default(Asset asset, u uVar, int i, Object obj) {
            if ((i & 1) != 0) {
                uVar = asset.fontFamily;
            }
            return asset.copy(uVar);
        }

        public final u component1() {
            return this.fontFamily;
        }

        public final Asset copy(u fontFamily) {
            t.g(fontFamily, "fontFamily");
            return new Asset(fontFamily);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Asset) && t.c(this.fontFamily, ((Asset) obj).fontFamily);
        }

        public final /* synthetic */ u getFontFamily() {
            return this.fontFamily;
        }

        public int hashCode() {
            return this.fontFamily.hashCode();
        }

        public String toString() {
            return "Asset(fontFamily=" + this.fontFamily + ')';
        }
    }

    public static final class Downloaded implements FontSpec {
        public static final int $stable = 8;
        private final DownloadedFontFamily downloadedFontFamily;

        public Downloaded(DownloadedFontFamily downloadedFontFamily) {
            t.g(downloadedFontFamily, "downloadedFontFamily");
            this.downloadedFontFamily = downloadedFontFamily;
        }

        public static /* synthetic */ Downloaded copy$default(Downloaded downloaded, DownloadedFontFamily downloadedFontFamily, int i, Object obj) {
            if ((i & 1) != 0) {
                downloadedFontFamily = downloaded.downloadedFontFamily;
            }
            return downloaded.copy(downloadedFontFamily);
        }

        public final DownloadedFontFamily component1() {
            return this.downloadedFontFamily;
        }

        public final Downloaded copy(DownloadedFontFamily downloadedFontFamily) {
            t.g(downloadedFontFamily, "downloadedFontFamily");
            return new Downloaded(downloadedFontFamily);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Downloaded) && t.c(this.downloadedFontFamily, ((Downloaded) obj).downloadedFontFamily);
        }

        public final /* synthetic */ DownloadedFontFamily getDownloadedFontFamily() {
            return this.downloadedFontFamily;
        }

        public int hashCode() {
            return this.downloadedFontFamily.hashCode();
        }

        public String toString() {
            return "Downloaded(downloadedFontFamily=" + this.downloadedFontFamily + ')';
        }
    }

    public interface Generic extends FontSpec {

        public static final class Monospace implements Generic {
            public static final int $stable = 0;
            public static final Monospace INSTANCE = new Monospace();

            private Monospace() {
            }
        }

        public static final class SansSerif implements Generic {
            public static final int $stable = 0;
            public static final SansSerif INSTANCE = new SansSerif();

            private SansSerif() {
            }
        }

        public static final class Serif implements Generic {
            public static final int $stable = 0;
            public static final Serif INSTANCE = new Serif();

            private Serif() {
            }
        }
    }

    public static final class Google implements FontSpec {
        public static final int $stable = 0;
        private final String name;

        public Google(String name) {
            t.g(name, "name");
            this.name = name;
        }

        public static /* synthetic */ Google copy$default(Google google, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = google.name;
            }
            return google.copy(str);
        }

        public final String component1() {
            return this.name;
        }

        public final Google copy(String name) {
            t.g(name, "name");
            return new Google(name);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Google) && t.c(this.name, ((Google) obj).name);
        }

        public final /* synthetic */ String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return "Google(name=" + this.name + ')';
        }
    }

    public static final class Resource implements FontSpec {
        public static final int $stable = 0;
        private final u fontFamily;

        public Resource(u fontFamily) {
            t.g(fontFamily, "fontFamily");
            this.fontFamily = fontFamily;
        }

        public static /* synthetic */ Resource copy$default(Resource resource, u uVar, int i, Object obj) {
            if ((i & 1) != 0) {
                uVar = resource.fontFamily;
            }
            return resource.copy(uVar);
        }

        public final u component1() {
            return this.fontFamily;
        }

        public final Resource copy(u fontFamily) {
            t.g(fontFamily, "fontFamily");
            return new Resource(fontFamily);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resource) && t.c(this.fontFamily, ((Resource) obj).fontFamily);
        }

        public final /* synthetic */ u getFontFamily() {
            return this.fontFamily;
        }

        public int hashCode() {
            return this.fontFamily.hashCode();
        }

        public String toString() {
            return "Resource(fontFamily=" + this.fontFamily + ')';
        }
    }

    public static final class System implements FontSpec {
        public static final int $stable = 0;
        private final String name;

        public System(String name) {
            t.g(name, "name");
            this.name = name;
        }

        public static /* synthetic */ System copy$default(System system, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = system.name;
            }
            return system.copy(str);
        }

        public final String component1() {
            return this.name;
        }

        public final System copy(String name) {
            t.g(name, "name");
            return new System(name);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof System) && t.c(this.name, ((System) obj).name);
        }

        public final /* synthetic */ String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return "System(name=" + this.name + ')';
        }
    }
}

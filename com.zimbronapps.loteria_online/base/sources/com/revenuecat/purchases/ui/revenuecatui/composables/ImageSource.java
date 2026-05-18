package com.revenuecat.purchases.ui.revenuecatui.composables;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
abstract class ImageSource {

    public static final class Local extends ImageSource {
        public static final int $stable = 0;
        private final Object data;
        private final int resource;

        public Local(int i) {
            super(null);
            this.resource = i;
            this.data = Integer.valueOf(i);
        }

        public static /* synthetic */ Local copy$default(Local local, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = local.resource;
            }
            return local.copy(i);
        }

        public final int component1() {
            return this.resource;
        }

        public final Local copy(int i) {
            return new Local(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Local) && this.resource == ((Local) obj).resource;
        }

        public Object getData() {
            return this.data;
        }

        public final int getResource() {
            return this.resource;
        }

        public int hashCode() {
            return Integer.hashCode(this.resource);
        }

        public String toString() {
            return "Local(resource=" + this.resource + ')';
        }
    }

    public static final class Remote extends ImageSource {
        public static final int $stable = 0;
        private final Object data;
        private final String urlString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Remote(String urlString) {
            super(null);
            t.g(urlString, "urlString");
            this.urlString = urlString;
            this.data = urlString;
        }

        public static /* synthetic */ Remote copy$default(Remote remote, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = remote.urlString;
            }
            return remote.copy(str);
        }

        public final String component1() {
            return this.urlString;
        }

        public final Remote copy(String urlString) {
            t.g(urlString, "urlString");
            return new Remote(urlString);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Remote) && t.c(this.urlString, ((Remote) obj).urlString);
        }

        public Object getData() {
            return this.data;
        }

        public final String getUrlString() {
            return this.urlString;
        }

        public int hashCode() {
            return this.urlString.hashCode();
        }

        public String toString() {
            return "Remote(urlString=" + this.urlString + ')';
        }
    }

    public /* synthetic */ ImageSource(k kVar) {
        this();
    }

    public abstract Object getData();

    private ImageSource() {
    }
}

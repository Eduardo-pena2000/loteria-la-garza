package com.revenuecat.purchases.customercenter;

import android.net.Uri;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface CustomerCenterManagementOption {

    public static final class Cancel implements CustomerCenterManagementOption {
        public static final Cancel INSTANCE = new Cancel();

        private Cancel() {
        }
    }

    public static final class CustomAction implements CustomerCenterManagementOption {
        private final String actionIdentifier;
        private final String purchaseIdentifier;

        public CustomAction(String str, String str2) {
            t.g(str, "actionIdentifier");
            this.actionIdentifier = str;
            this.purchaseIdentifier = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomAction)) {
                return false;
            }
            CustomAction customAction = (CustomAction) obj;
            return t.c(this.actionIdentifier, customAction.actionIdentifier) && t.c(this.purchaseIdentifier, customAction.purchaseIdentifier);
        }

        public final String getActionIdentifier() {
            return this.actionIdentifier;
        }

        public final String getPurchaseIdentifier() {
            return this.purchaseIdentifier;
        }

        public int hashCode() {
            int hashCode = this.actionIdentifier.hashCode() * 31;
            String str = this.purchaseIdentifier;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "CustomAction(actionIdentifier=" + this.actionIdentifier + ", purchaseIdentifier=" + this.purchaseIdentifier + ')';
        }
    }

    public static final class CustomUrl implements CustomerCenterManagementOption {
        private final Uri uri;

        public CustomUrl(Uri uri) {
            t.g(uri, "uri");
            this.uri = uri;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CustomUrl) && t.c(this.uri, ((CustomUrl) obj).uri);
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return "CustomUrl(uri=" + this.uri + ')';
        }
    }

    public static final class MissingPurchase implements CustomerCenterManagementOption {
        public static final MissingPurchase INSTANCE = new MissingPurchase();

        private MissingPurchase() {
        }
    }
}

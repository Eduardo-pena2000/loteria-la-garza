package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class InAppMessageParams {
    public final ArrayList a;

    public static final class Builder {
        public final Set a = new HashSet();

        public Builder addAllInAppMessageCategoriesToShow() {
            this.a.add(2);
            return this;
        }

        public Builder addInAppMessageCategoryToShow(int i) {
            this.a.add(Integer.valueOf(i));
            return this;
        }

        public InAppMessageParams build() {
            return new InAppMessageParams(this.a, null);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageCategoryId {
        public static final int TRANSACTIONAL = 2;
        public static final int UNKNOWN_IN_APP_MESSAGE_CATEGORY_ID = 0;
    }

    public /* synthetic */ InAppMessageParams(Set set, zzcq zzcqVar) {
        this.a = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final ArrayList a() {
        return this.a;
    }
}

package com.unity3d.ads.adplayer;

import android.webkit.WebView;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class DisplayMessage {
    private final String opportunityId;

    public static final class DisplayDestroyed extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayDestroyed(String opportunityId) {
            super(opportunityId, null);
            t.g(opportunityId, "opportunityId");
        }
    }

    public static final class DisplayError extends DisplayMessage {
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayError(String opportunityId, String reason) {
            super(opportunityId, null);
            t.g(opportunityId, "opportunityId");
            t.g(reason, "reason");
            this.reason = reason;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    public static final class DisplayFinishRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayFinishRequest(String opportunityId) {
            super(opportunityId, null);
            t.g(opportunityId, "opportunityId");
        }
    }

    public static final class DisplayReady extends DisplayMessage {
        private final Map showOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayReady(String opportunityId, Map map) {
            super(opportunityId, null);
            t.g(opportunityId, "opportunityId");
            this.showOptions = map;
        }

        public final Map getShowOptions() {
            return this.showOptions;
        }

        public /* synthetic */ DisplayReady(String str, Map map, int i, k kVar) {
            this(str, (i & 2) != 0 ? null : map);
        }
    }

    public static final class FocusChanged extends DisplayMessage {
        private final boolean isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FocusChanged(String opportunityId, boolean z) {
            super(opportunityId, null);
            t.g(opportunityId, "opportunityId");
            this.isFocused = z;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }
    }

    public static final class SetOrientation extends DisplayMessage {
        private final int orientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetOrientation(String opportunityId, int i) {
            super(opportunityId, null);
            t.g(opportunityId, "opportunityId");
            this.orientation = i;
        }

        public final int getOrientation() {
            return this.orientation;
        }
    }

    public static final class VisibilityChanged extends DisplayMessage {
        private final boolean isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisibilityChanged(String opportunityId, boolean z) {
            super(opportunityId, null);
            t.g(opportunityId, "opportunityId");
            this.isVisible = z;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }
    }

    public static final class WebViewInstanceRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceRequest(String opportunityId) {
            super(opportunityId, null);
            t.g(opportunityId, "opportunityId");
        }
    }

    public static final class WebViewInstanceResponse extends DisplayMessage {
        private final WebView webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceResponse(String opportunityId, WebView webView) {
            super(opportunityId, null);
            t.g(opportunityId, "opportunityId");
            t.g(webView, "webView");
            this.webView = webView;
        }

        public final WebView getWebView() {
            return this.webView;
        }
    }

    public /* synthetic */ DisplayMessage(String str, k kVar) {
        this(str);
    }

    public final String getOpportunityId() {
        return this.opportunityId;
    }

    private DisplayMessage(String str) {
        this.opportunityId = str;
    }
}

package com.unity3d.services.ads.topics;

import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import d4.D;
import d4.i;
import d4.j;
import d4.k;
import d4.l;
import d4.m;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TopicsReceiver implements OutcomeReceiver {
    private final IEventSender eventSender;

    public TopicsReceiver(IEventSender eventSender) {
        t.g(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    public final JSONObject formatTopic(Topic topic) {
        t.g(topic, "topic");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taxonomyVersion", k.a(topic));
        jSONObject.put("modelVersion", l.a(topic));
        jSONObject.put("topicId", m.a(topic));
        return jSONObject;
    }

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        onResult(D.a(obj));
    }

    public void onError(Exception error) {
        t.g(error, "error");
        DeviceLog.debug("GetTopics exception: " + error);
        this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, error.toString());
    }

    public void onResult(GetTopicsResponse result) {
        t.g(result, "result");
        JSONArray jSONArray = new JSONArray();
        List a = i.a(result);
        t.f(a, "result.topics");
        Iterator it = a.iterator();
        while (it.hasNext()) {
            Topic it2 = j.a(it.next());
            t.f(it2, "it");
            jSONArray.put(formatTopic(it2));
        }
        IEventSender iEventSender = this.eventSender;
        WebViewEventCategory webViewEventCategory = WebViewEventCategory.TOPICS;
        TopicsEvents topicsEvents = TopicsEvents.TOPICS_AVAILABLE;
        String jSONArray2 = jSONArray.toString();
        t.f(jSONArray2, "resultArray.toString()");
        iEventSender.sendEvent(webViewEventCategory, topicsEvents, jSONArray2);
    }
}

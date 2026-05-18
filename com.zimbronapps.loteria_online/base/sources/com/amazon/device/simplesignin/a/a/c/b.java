package com.amazon.device.simplesignin.a.a.c;

import android.os.RemoteException;
import android.util.Log;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b extends c {
    private static final String b = "SSI_PublishMetric";
    private static final String c = "1.0";
    private static final String d = "b";

    public b(a aVar, SSIEventRequest sSIEventRequest) {
        super(aVar, "SSI_PublishMetric", "1.0");
        super.a("ssi_metrics_event", sSIEventRequest.getEvent().toString());
        super.a("ssi_metrics_event_timestamp", sSIEventRequest.getEpochTimestamp());
        if (sSIEventRequest.getFailureReason() != null) {
            super.a("ssi_metrics_event_failure_reason", sSIEventRequest.getFailureReason().toString());
        } else {
            super.a("ssi_metrics_event_failure_reason", "NA");
        }
    }

    public void a(RequestStatus requestStatus) {
        b(requestStatus);
    }

    public boolean b(j jVar) throws RemoteException {
        Map b2 = jVar.b();
        if (b2.containsKey("success")) {
            b(RequestStatus.SUCCESSFUL);
            return Boolean.parseBoolean(b2.get("success").toString());
        }
        a(RequestStatus.FAILURE);
        return false;
    }

    private void b(RequestStatus requestStatus) {
        d dVar = (d) j();
        Log.i(d, "Response for request id: " + dVar.e() + " is: " + requestStatus.toString());
        RecordMetricsEventResponse recordMetricsEventResponse = new RecordMetricsEventResponse();
        recordMetricsEventResponse.setRequestId(dVar.e());
        recordMetricsEventResponse.setRequestStatus(requestStatus);
        super.a(recordMetricsEventResponse);
    }
}

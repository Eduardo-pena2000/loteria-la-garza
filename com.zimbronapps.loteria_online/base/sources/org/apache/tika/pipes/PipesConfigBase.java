package org.apache.tika.pipes;

import com.applovin.shadow.okio.F;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tika.config.ConfigBase;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PipesConfigBase extends ConfigBase {
    public static final int DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS = 10000;
    public static final long DEFAULT_MAX_FOR_EMIT_BATCH = 100000;
    public static final int DEFAULT_NUM_CLIENTS = 4;
    public static final long DEFAULT_SHUTDOWN_CLIENT_AFTER_MILLS = 300000;
    public static final int DEFAULT_STALE_FETCHER_DELAY_SECONDS = 60;
    public static final int DEFAULT_STALE_FETCHER_TIMEOUT_SECONDS = 600;
    public static final long DEFAULT_STARTUP_TIMEOUT_MILLIS = 240000;
    public static final long DEFAULT_TIMEOUT_MILLIS = 60000;
    private Path tikaConfig;
    private long maxForEmitBatchBytes = 100000;
    private long timeoutMillis = 60000;
    private long startupTimeoutMillis = 240000;
    private long sleepOnStartupTimeoutMillis = 240000;
    private long shutdownClientAfterMillis = 300000;
    private int numClients = 4;
    private int maxFilesProcessedPerProcess = 10000;
    private int staleFetcherTimeoutSeconds = 600;
    private int staleFetcherDelaySeconds = 60;
    private List forkedJvmArgs = new ArrayList();
    private String javaPath = "java";

    public List getForkedJvmArgs() {
        return new ArrayList(this.forkedJvmArgs);
    }

    public String getJavaPath() {
        return this.javaPath;
    }

    public int getMaxFilesProcessedPerProcess() {
        return this.maxFilesProcessedPerProcess;
    }

    public long getMaxForEmitBatchBytes() {
        return this.maxForEmitBatchBytes;
    }

    public int getNumClients() {
        return this.numClients;
    }

    public long getShutdownClientAfterMillis() {
        return this.shutdownClientAfterMillis;
    }

    public long getSleepOnStartupTimeoutMillis() {
        return this.sleepOnStartupTimeoutMillis;
    }

    public int getStaleFetcherDelaySeconds() {
        return this.staleFetcherDelaySeconds;
    }

    public int getStaleFetcherTimeoutSeconds() {
        return this.staleFetcherTimeoutSeconds;
    }

    public long getStartupTimeoutMillis() {
        return this.startupTimeoutMillis;
    }

    public Path getTikaConfig() {
        return this.tikaConfig;
    }

    public long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public void setForkedJvmArgs(List list) {
        this.forkedJvmArgs = Collections.unmodifiableList(list);
    }

    public void setJavaPath(String str) {
        this.javaPath = str;
    }

    public void setMaxFilesProcessedPerProcess(int i) {
        this.maxFilesProcessedPerProcess = i;
    }

    public void setMaxForEmitBatchBytes(long j) {
        this.maxForEmitBatchBytes = j;
    }

    public void setNumClients(int i) {
        this.numClients = i;
    }

    public void setShutdownClientAfterMillis(long j) {
        this.shutdownClientAfterMillis = j;
    }

    public void setSleepOnStartupTimeoutMillis(long j) {
        this.sleepOnStartupTimeoutMillis = j;
    }

    public void setStaleFetcherDelaySeconds(int i) {
        this.staleFetcherDelaySeconds = i;
    }

    public void setStaleFetcherTimeoutSeconds(int i) {
        this.staleFetcherTimeoutSeconds = i;
    }

    public void setStartupTimeoutMillis(long j) {
        this.startupTimeoutMillis = j;
    }

    public void setTikaConfig(Path path) {
        this.tikaConfig = path;
    }

    public void setTimeoutMillis(long j) {
        this.timeoutMillis = j;
    }

    public void setTikaConfig(String str) {
        setTikaConfig(F.a(str, new String[0]));
    }
}

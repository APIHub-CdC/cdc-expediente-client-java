package io.CdcExpediente.client.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import io.CdcExpediente.client.ApiCallback;
import io.CdcExpediente.client.ApiClient;
import io.CdcExpediente.client.ApiException;
import io.CdcExpediente.client.ApiResponse;
import io.CdcExpediente.client.Configuration;
import io.CdcExpediente.client.Pair;
import io.CdcExpediente.client.ProgressRequestBody;
import io.CdcExpediente.client.ProgressResponseBody;
import io.CdcExpediente.client.model.RequestExportProceedings;
import io.CdcExpediente.client.model.ResponseExportFile;

public class SolicitudDeCrditoApi {
    private ApiClient apiClient;

    public SolicitudDeCrditoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SolicitudDeCrditoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public okhttp3.Call exportarExpedienteFolioUsingPOSTCall(String xApiKey, String username, String password,
            RequestExportProceedings exportar, final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = exportar;
        String localVarPath = "/v1/cdc-expediente";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
            localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
            localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
            localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    private okhttp3.Call exportarExpedienteFolioUsingPOSTValidateBeforeCall(String xApiKey, String username,
            String password, RequestExportProceedings exportar,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException(
                    "Missing the required parameter 'xApiKey' when calling exportarExpedienteFolioUsingPOST(Async)");
        }

        if (username == null) {
            throw new ApiException(
                    "Missing the required parameter 'username' when calling exportarExpedienteFolioUsingPOST(Async)");
        }
        if (password == null) {
            throw new ApiException(
                    "Missing the required parameter 'password' when calling exportarExpedienteFolioUsingPOST(Async)");
        }
        if (exportar == null) {
            throw new ApiException(
                    "Missing the required parameter 'exportar' when calling exportarExpedienteFolioUsingPOST(Async)");
        }

        okhttp3.Call call = exportarExpedienteFolioUsingPOSTCall(xApiKey, username, password, exportar,
                progressListener, progressRequestListener);
        return call;
    }

    public ResponseExportFile exportarExpedienteFolioUsingPOST(String xApiKey, String username, String password,
            RequestExportProceedings exportar) throws ApiException {
        ApiResponse<ResponseExportFile> resp = exportarExpedienteFolioUsingPOSTWithHttpInfo(xApiKey, username, password,
                exportar);
        return resp.getData();
    }

    public ApiResponse<ResponseExportFile> exportarExpedienteFolioUsingPOSTWithHttpInfo(String xApiKey, String username,
            String password, RequestExportProceedings exportar) throws ApiException {
        okhttp3.Call call = exportarExpedienteFolioUsingPOSTValidateBeforeCall(xApiKey, username, password, exportar,
                null, null);
        Type localVarReturnType = new TypeToken<ResponseExportFile>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    public okhttp3.Call exportarExpedienteFolioUsingPOSTAsync(String xApiKey, String username, String password,
            RequestExportProceedings exportar, final ApiCallback<ResponseExportFile> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = exportarExpedienteFolioUsingPOSTValidateBeforeCall(xApiKey, username, password, exportar,
                progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseExportFile>() {
        }.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}

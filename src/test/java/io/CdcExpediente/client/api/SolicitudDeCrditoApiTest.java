package io.CdcExpediente.client.api;

import java.util.concurrent.TimeUnit;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.CdcExpediente.client.ApiClient;
import io.CdcExpediente.client.ApiException;
import io.CdcExpediente.client.ApiResponse;
import io.CdcExpediente.client.model.RequestExportProceedings;
import io.CdcExpediente.client.model.ResponseExportFile;
import okhttp3.OkHttpClient;

public class SolicitudDeCrditoApiTest {
    private final SolicitudDeCrditoApi api = new SolicitudDeCrditoApi();

    private Logger logger = LoggerFactory.getLogger(SolicitudDeCrditoApiTest.class.getName());
    private ApiClient apiClient = null;

    private String cdcCertFile = "your_path_for_certificate_of_cdc/cdc_cert.pem";
    private String keystoreFile = "your_path_for_your_keystore/keystore.jks";
    private String keystorePassword = "your_super_secure_keystore_password";
    private String keyPassword = "your_super_secure_password";
    private String keyAlias = "your_key_alias";
    

    private String username = "your_username_otrorgante";
    private String password = "your_password_otorgante";

    private String xApiKey = "X_Api_Key";

    private String url = "the_url";

    private SignerInterceptor interceptor;

    @Before
    public void setUp() {

        interceptor = new SignerInterceptor(this.keystoreFile, this.cdcCertFile, this.keystorePassword, this.keyAlias,
                this.keyPassword);
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath(url);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(interceptor).build();
        apiClient.setHttpClient(okHttpClient);
    }

    @Test
    public void exportarExpedienteFolioUsingPOSTTest() throws ApiException {

        RequestExportProceedings body = new RequestExportProceedings();

        Integer estatusOK = 200;
        Integer estatusNoContent = 204;

        try {

            body.setFolio(12345L);

            ApiResponse<?> response = api.exportarExpedienteFolioUsingPOSTWithHttpInfo(this.xApiKey, this.username,
                    this.password, body);

            Assert.assertTrue(estatusOK.equals(response.getStatusCode()));

            if (estatusOK.equals(response.getStatusCode())) {
                ResponseExportFile responseOK = (ResponseExportFile) response.getData();
                logger.info(responseOK.toString());
            }

        } catch (ApiException e) {
            if (!estatusNoContent.equals(e.getCode())) {
                logger.info(e.getResponseBody());
            }
            Assert.assertTrue(estatusOK.equals(e.getCode()));
        }
    }

}
